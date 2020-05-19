package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageRecherche {

	private WebDriver driverRecherche;

	public pageRecherche(WebDriver driverAccueil) {
		driverRecherche = driverAccueil;
	    if ("presta-recherche".contentEquals(driverRecherche.getTitle()))
	    { throw new IllegalStateException ("pas la page pour se connecter" +driverAccueil.getTitle() ); 	}
	}



}
