package com.petland.start;

import com.petland.cadastros.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {
    @Autowired
    CadastroRepository cadastroRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
