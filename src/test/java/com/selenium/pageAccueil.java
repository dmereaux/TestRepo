package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageAccueil {
	// modif pour le fun
	
	private WebDriver driverAccueil;
	
	public pageAccueil(WebDriver driver){
		driverAccueil = driver;
	    if (!"presta".contentEquals(driverAccueil.getTitle()))
	    { throw new IllegalStateException ("pas la page pour se connecter" +driverAccueil.getTitle() ); 	}
	    

	}
	

}
