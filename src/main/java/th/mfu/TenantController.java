package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TenantController {
    @PostMapping("/login")
    public String validate()
    {
        return "redirect:/home";
    }
    
    @PostMapping("/register")
    public String register()
    {
        return "redirect:/home";
    }

   @GetMapping("/home")
   public String home()
   {
    return "home";
   }
    
}
