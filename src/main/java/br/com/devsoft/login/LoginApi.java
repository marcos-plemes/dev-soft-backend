package br.com.devsoft.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsoft.login.dtos.LoginDto;

@RestController
@RequestMapping("/login")
public class LoginApi {
    
    @Autowired
    private LoginService loginService;
    
    @GetMapping
    public LoginDto login() {
        return this.loginService.login();
    }
    
}
