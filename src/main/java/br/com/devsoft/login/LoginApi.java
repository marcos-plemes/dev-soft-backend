package br.com.devsoft.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsoft.comum.consultapadrao.ConsultaPadraoApiConstants;
import br.com.devsoft.login.dtos.LoginDto;

@RestController
@RequestMapping(ConsultaPadraoApiConstants.LOGIN)
public class LoginApi {
    
    @Autowired
    private LoginService loginService;
    
    @GetMapping
    public LoginDto login(final LoginDto filtro) {
        return this.loginService.login(filtro);
    }
    
    @PostMapping("/teste")
    public byte[] teste(@RequestBody final LoginDto filtro) {
        return filtro.getConteudo();
    }
    
}
