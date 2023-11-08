package th.mfu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    @PostMapping("/login")
    public String validate()
    {
        //TODO: get data from the web page, encrypt password and match with the database to validate
        return "redirect:/home";
    }
    
    @PostMapping("/register")
    public String register() 
    {
        //TODO: store the user data in the database
        return "redirect:/home";
    }

   @GetMapping("/home")
   public String home()
   {
        //TODO: get the user detail and display the data of dorms with 10 results per page
        return "home";
   }

   //TODO: add functions for searching, user account page
    
}
