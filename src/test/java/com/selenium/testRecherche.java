package com.selenium;




import static org.junit.Assert.*;

import org.junit.Test;
import java.io.StringReader;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import org.dbunit.Assertion;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;

public class testRecherche {
	  private static WebDriver driver;
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private pageAccueil accueil;
	  private static IDatabaseTester databaseTester;



	  @Before
	 public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "C:/Users/dgu/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");

	    driver = new FirefoxDriver();
	    baseUrl = "http://127.0.0.1/";
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl + "prestashop/index.php");
		// se connecter à la base
		// verification du contenu de la base
		  String inputXml = 
				  "<dataset>" + 
		          "    <ps_product id_category_default = '1'  />"  +
		          "    <ps_product id_category_default = '1'  />" +
		          "</dataset>";
		  IDataSet dataSetAtt = new FlatXmlDataSetBuilder().build(new StringReader(inputXml));

		  //Creer la connexion a la base de donnee
		  databaseTester = new JdbcDatabaseTester(com.mysql.jdbc.Driver.class.getName(), "jdbc:mysql://localhost/presta?zeroDateTimeBehavior=convertToNull", "root", "");
		  IDatabaseConnection connexion = databaseTester.getConnection();
		  
		  // creer un sous ensemble de la base:
		  QueryDataSet partialDataSet = new QueryDataSet(connexion);
		  partialDataSet.addTable( "ps_product");
		  
		  // recuperer le contenu de la table dans un objet ITable et compter le nbr de ligne
		  
		  // comparer les elements de la colonne id_category_default en utilisant Assertion.assertEqualsByQuery
		  //Assertion.assertEqualsByQuery (,,"","", new String[] {});
		  
	};

	// Create a test using SignInPage and PageProject to check successful login  
	@Test
	public void testRecherche1() throws Exception {
		assertTrue(1==1);
	}

	  @After
	 public  void tearDown() throws Exception {
	    driver.quit();
	  }




	}



