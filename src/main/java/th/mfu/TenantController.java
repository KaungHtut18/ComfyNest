package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TenantController {
    @PostMapping("/login")
    public String validate()
    {
        return "home.html";
    }
    
}
