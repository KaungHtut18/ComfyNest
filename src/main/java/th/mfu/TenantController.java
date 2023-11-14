package th.mfu;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import th.mfu.Repos.DormitoryRepository;
import th.mfu.Repos.LanalordRepository;
import th.mfu.Repos.RatingRepository;
import th.mfu.Repos.TenantRepository;
import th.mfu.Repos.WishListRepository;
import th.mfu.domain.Dormitory;
import th.mfu.domain.Landlord;
import th.mfu.domain.Rating;
import th.mfu.domain.Tenant;


@Controller
public class TenantController {
    
    //TODO: creat objects from the repository classes
    @Autowired
    DormitoryRepository dormRepo;
    @Autowired
    LanalordRepository landLordRepo;
    @Autowired
    TenantRepository tenantRepository;
    @Autowired
    RatingRepository ratingRepository;
    @Autowired
    WishListRepository wishListRepository;
    //for the current user so that we will not always need to run the findById funciton
    Tenant tenant = new Tenant();

    //To encode and decode password
    private PasswordEncoder pwEncoder = new BCryptPasswordEncoder();

    public TenantController(DormitoryRepository dormRepo, LanalordRepository landLordRepo,
            TenantRepository tenantRepository, RatingRepository ratingRepository,
            WishListRepository wishListRepository) 
    {
        this.dormRepo = dormRepo;
        this.landLordRepo = landLordRepo;
        this.tenantRepository = tenantRepository;
        this.ratingRepository = ratingRepository;
        this.wishListRepository = wishListRepository;
    }

    @GetMapping("/")
    public String goToLogin()
    {
        return "Login";
    }

    @PostMapping("/login")
    public String validate(@RequestParam String email, @RequestParam String password,RedirectAttributes re)
    {
        //TODO: get data from the web page, encrypt password and match with the database to validate
        Tenant temp;
        try
        {
            temp = tenantRepository.findById(email).get();
            if(pwEncoder.matches(password, temp.getPassword()))
        {
            tenant=temp;
            return "redirect:/home";
        }
        else{
            re.addFlashAttribute("error", true);
            return "redirect:/";
        }
        }catch(NoSuchElementException e)
        {
            re.addFlashAttribute("error", true);
            return "redirect:/";
        }
        
    }

    @GetMapping("/register")
    public String goToReg()
    {
        return "SignUp";
    }
    @PostMapping("/register")
    public String register(@RequestParam String firstName,
    @RequestParam String lastName,
    @RequestParam String email,
    @RequestParam String phone,
    @RequestParam String password,
    @RequestParam String gender,
    @RequestParam String region,
    RedirectAttributes re) 
    {
        //TODO: store the user data in the database
        
        if(tenantRepository.findById(email).isPresent())
        {
            re.addFlashAttribute("error", true);
            return "redirect:/register";
        }
        else
        {
            String ph=region+phone;
            Tenant t = new Tenant(firstName, lastName, email, gender, ph, password);
            tenantRepository.save(t);
            tenant=t;
            return "redirect:/home";
        }
    }

   @GetMapping("/home")
   public String home(Model model)
   {
        model.addAttribute("error", true);
        model.addAttribute("tenants", tenant);
        //TODO: get the user detail and display the data of dorms with 10 results per page
        return "home";
   }
   
   @GetMapping("/dorm/{id}")
   public String showDormDetail(@PathVariable int id, Model model)
   {
        //Landlord land = new Landlord("owner@gmail.com", "Owner", "Man", "12345667");
        //Rating r = new Rating(1, 0, 0, 3, 0, 0, 0);
        //Dormitory d = new Dormitory(1,r,"3K","we live here","Chiang rai",3000,"unisex",false,"Some desc fajkhfaohfijewahf;oijajgf;oierjhgiersj ofijreafkgsajf;ljksdf g;kjhr;oihag oe","Some rules","We provide these kjg;oirewhagpoihaeofjaw rhpwo oihiuh ioh oiigh poerhaiguh aiwurehg iwah  weh","3K1.JPG","3K2.JPG","3K3.JPG","3K4.JPG","owner@gmail.com",land);
        int dormId = (Integer)id;
        Dormitory dorm = dormRepo.findById(dormId).get();
        Landlord l= landLordRepo.findById(dorm.getLandlord().getEmail()).get();
        String phone = l.getTelephone();
        model.addAttribute("dorm", dorm);
        model.addAttribute("phone", phone);

        return "DormDetail";
   }
   @GetMapping("/userDetail")
   public String showUserDetail(Model model)
   {
        model.addAttribute("tenant", tenant);
        return "Profile";
   }
   //TODO: add functions for searching, user account page
    
}
