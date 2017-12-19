package com.github.siiilas.facebooklogin.main;

import com.github.siiilas.facebooklogin.service.FacebookLoginService;
import com.github.siiilas.facebooklogin.util.Logger;

public class Inicializador {

    private static final Logger LOGGER = Logger.getLogger(Inicializador.class);

    public static void main(String[] args) {
        LOGGER.info("Iniciando aplicação...");
        try {
            new FacebookLoginService().doLogin();
        } catch (Exception e) {
            LOGGER.error("Erro ao realizar login", e);
        }
        LOGGER.info("Finalizando aplicação...");
        System.exit(0);
    }

}
