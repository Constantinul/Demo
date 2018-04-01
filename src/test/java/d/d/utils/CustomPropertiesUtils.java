package d.d.utils;

public class CustomPropertiesUtils {

	private interface CustomProperties {
		public String ENVIRONMENT_PROPERTY = "env";
		public String USER_EMAIL_PROPERTY = "userEmail";
	}

	public static String getUserEmail() {
		// no default value, user must provide an user email
		return System.getProperty(CustomProperties.USER_EMAIL_PROPERTY);
	}

	public static String getEnv() {
		// no default value, user must provide an environment
		return System.getProperty(CustomProperties.ENVIRONMENT_PROPERTY);
	}

}
