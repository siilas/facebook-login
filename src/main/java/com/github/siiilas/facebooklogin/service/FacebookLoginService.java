package com.github.siiilas.facebooklogin.service;

import java.io.Console;

import com.github.siiilas.facebooklogin.pages.FacebookPage;
import com.github.siiilas.facebooklogin.util.Logger;

public class FacebookLoginService {

    private static final Logger LOGGER = Logger.getLogger(FacebookLoginService.class);

    public void doLogin() throws Exception {
        Console console = System.console();

        LOGGER.info("Digite o usuário:");
        String username = console.readLine();

        LOGGER.info("Digite a senha:");
        char[] password = console.readPassword();

        boolean logado = FacebookPage.criar()
                .abrir()
                .usuario(username)
                .senha(password)
                .logar();

        if (logado) {
            LOGGER.info("Login executado com sucesso!");
        } else {
            LOGGER.info("Erro ao fazer login! Verique o usuário e/ou senha.");
        }
    }

}
