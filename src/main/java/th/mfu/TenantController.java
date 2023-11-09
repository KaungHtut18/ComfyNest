package th.mfu;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import th.mfu.Repos.DormitoryRepository;
import th.mfu.Repos.LanalordRepository;
import th.mfu.Repos.RatingRepository;
import th.mfu.Repos.TenantRepository;
import th.mfu.Repos.WishListRepository;
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

    @GetMapping("/index")
    public String start()
    {
        return "login";
    }

    @GetMapping("/")
    public String goToLogin()
    {
        return "Login";
    }
    @PostMapping("/login")
    public String validate(@RequestParam String email, @RequestParam String password)
    {
        //TODO: get data from the web page, encrypt password and match with the database to validate
        Tenant temp = tenantRepository.findById(email).get();
        if(pwEncoder.matches(password, temp.getPassword()))
        {
            tenant=temp;
            return "redirect:/home";
        }
        return "redirect:/";
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
    Model model) 
    {
        //TODO: store the user data in the database
        
        if(tenantRepository.findById(email).isPresent())
        {
            model.addAttribute("error", true);
            return "redirect:/register";
        }
        else
        {
            Tenant t = new Tenant(firstName, lastName, email, gender, phone, password);
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

   //TODO: add functions for searching, user account page
    
}
