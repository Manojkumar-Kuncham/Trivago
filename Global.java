package Selenium.Trivago;

import java.util.UUID;

public class Global {
	
	    //System settings
		public static String CHROME_DRIVER_PATH = "C:\\PhD\\Selenium course\\Exe\\chromedriver.exe";
		public static int WAIT_TIME = 5000; // 5000 milli seconds

		 //Web Url's
		public static String Test_Url = "http://room5.trivago.com";
		public static String CONTACT_FORM_URL = "http://magazine.trivago.com/contact/";
		public static String MOBILE_APP_URL = "https://www.trivago.com/app?cip=1110000000003";
		public static String PLAYSTORE_URL = "https://play.google.com/store/apps/details?id=com.trivago&referrer=af_tranid%3D_HRxdiWFfqFkSVIqIMSQzQ%26pid%3DMPAGE%26c%3DBRO_00_NOP_000_AND_MPAGE";
		
		//Country Data
	    public static  String SELECT_COUNTRY = "Germany";
	    public static  String SELECT_MENU_COUNTRY = "Brasil";
	  	    
	    //User Data
	    public static  String USER_NAME = "Muller";
	    public static  String FORM_MESSAGE = "I  want deals in this ";
	    public static  String USER_EMAIL = UUID.randomUUID() + "@gmail.com";
	    
}
