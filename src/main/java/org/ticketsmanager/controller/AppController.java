package org.ticketsmanager.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Controller
public class AppController {

    private static Logger logger = LogManager.getLogger(AppController.class);

    @RequestMapping("/")
    public String getApp(Map<String, Object> model)
    {
        logger.info("Affichage de la page d'accueil");
		return "app";
    }

}