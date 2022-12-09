package br.com.devsoft.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginApi {
    
    @GetMapping
    public String teste() {
        return "hisashiburi dana mugiwara";
    }
    
}
