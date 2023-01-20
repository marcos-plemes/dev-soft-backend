package br.com.devsoft.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsoft.login.dtos.LoginDto;

@Service
public class LoginService {
    
    @Autowired
    private LoginRepository loginRepository;
    
    @Transactional(readOnly = true)
    public LoginDto login(final LoginDto filtro) {
        return this.loginRepository.login(filtro)
                .orElseThrow(() -> new RuntimeException("Dados Incorretos!"));
    }
    
}
