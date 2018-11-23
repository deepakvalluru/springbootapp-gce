package org.deepak;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp
{
   private static final Logger logger = LoggerFactory.getLogger( MethodHandles.lookup().lookupClass() );
   
   public static void main( String[] args )
   {
      logger.debug( "Springbootapp started" );
      SpringApplication.run( MainApp.class, args );
   }
}
