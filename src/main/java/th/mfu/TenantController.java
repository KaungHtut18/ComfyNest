package th.mfu;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/login")
    public String goToLogin()
    {
        return "Login";
    }
    @PostMapping("/login")
    public String validate()
    {
        //TODO: get data from the web page, encrypt password and match with the database to validate
        return "redirect:/home";
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
    @RequestParam String gender) 
    {
        //TODO: store the user data in the database
        Tenant newtTenant = new Tenant(firstName, lastName, email, gender, phone, password);
        tenantRepository.save(newtTenant);
        return "redirect:/home";
    }

   @GetMapping("/home")
   public String home(Model model)
   {
        model.addAttribute("tenants", tenantRepository.findAll());
        //TODO: get the user detail and display the data of dorms with 10 results per page
        return "home";
   }

   //TODO: add functions for searching, user account page
    
}
