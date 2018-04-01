package d.ui.utils;

public class Constants {

	public interface BaseURLs {
		// QA Project Exasol
		public String DEV_HOMEPAGE = "https://dev.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=3&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String QA01_HOMEPAGE = "https://qa01.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=3&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
	}

	public interface Credentials {
		// login credentials
		public String USERNAME = "fusionautomation@mailinator.com";
		public String PASSWORD = "Automation,1";
	}

	public interface DatabaseCredentials {
		public String QA01_URL = "jdbc:mysql://qa01.caxjfdnhccsl.us-east-1.rds.amazonaws.com:3306/fusionops";
		public String QA01_USER = "qauser";
		public String QA01_PASSWORD = "@Aera@QA@T3@";
	}

	public interface FilesLocation {
		public String TEST_FILES_BASE_LOCATION = "src/test/resources/";
		public String DOWNLOADS_FOLDER_NAME = "Downloads";
	}

	public static final long DEFAULT_WAIT_TIME = 1000;

}
