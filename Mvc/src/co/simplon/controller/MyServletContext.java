package co.simplon.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContext implements ServletContextListener {

    private static final Logger LOG = 
            Logger.getLogger( MyServletContext.class.getName() );
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.log( Level.INFO, "====== HelloWorld App Started ====== " );
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.log( Level.INFO, "====== HelloWorld App Stopped ====== " );
    }
    
}
