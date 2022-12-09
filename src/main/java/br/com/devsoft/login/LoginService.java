package br.com.devsoft.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService {
    
    @Autowired
    private LoginRepository loginRepository;
    
    @Transactional(readOnly = true)
    public String login() {
        return this.loginRepository.login();
    }
    
}
