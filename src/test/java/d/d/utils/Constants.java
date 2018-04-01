package d.d.utils;

public class Constants {

	public interface BaseURLs {
		// QA Project Exasol
		public String DEV_HOMEPAGE = "https://dev.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=3&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String QA01_HOMEPAGE = "https://qa01.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=3&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String QA02_HOMEPAGE = "https://qa02.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String STG01_HOMEPAGE = "https://stg01.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String PRD_HOMEPAGE = "https://insightp.aeratechnology.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";

		public String DEV1_HOMEPAGE = "https://dev1.fusionopscloud.com/ispring/awc?v=2&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&mode=page&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String DEV2_HOMEPAGE = "https://dev2.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=57FAE60E_89EF_488C_8E91_32B1FA748B33";
		public String DEV_EXASOL_HOMEPAGE = "https://insightdev1.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String QA_HOMEPAGE = "https://insightqa.fusionopscloud.com/ispring/awc?v=2&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&mode=page&prj=57FAE60E_89EF_488C_8E91_32B1FA748B33&ssup=slogin";
		public String QA_EXASOL_HOMEPAGE = "https://insightqa.fusionopscloud.com/ispring/awc?v=2&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&mode=page&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216&ssup=slogin";
		public String STG_HOMEPAGE = "https://stg.fusionopscloud.com/ispring/awc?v=2&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&mode=page&prj=57FAE60E_89EF_488C_8E91_32B1FA748B33&ssup=slogin";
		public String STG_EXASOL_HOMEPAGE = "https://stg.fusionopscloud.com/ispring/awc?v=2&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&mode=page&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216&ssup=slogin";
		public String STG_INT_HOMEPAGE = "https://stgint01.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String STG_AWS_CNAME_HOMEPAGE = "https://cf1stg.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String QD_HOMEPAGE = "https://insightqd.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String PRD_RS_EXASOL_HOMEPAGE = "https://insight.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String PRD_UK_EXASOL_HOMEPAGE = "https://insightuk.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		public String PRD_UK2_EXASOL_HOMEPAGE = "https://ukprdtest.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=BE8BA2A0_2B4C_48BA_B0A8_714E96548216";
		// Clients
		public String ADVANCED_ENERGY = "https://insight.fusionopscloud.com/ispring/awc?mode=page&processID=FF258695_808C_4658_8EC4_BBFB3D36D8F4&v=2&ssup=slogin&prj=806C58D7_9212_4951_AB0D_CAB418CD8B04";
	}

	public interface InvalidBaseURLs {
		public String INVALID_QA_URL1 = "https://insightqa.fusionopscloud.com/ispring/awc?mode=page&processID";
		public String INVALID_QA_URL2 = "https://insightqa.fusionopscloud.com/ispring/awc";
		public String INVALID_QA_URL3 = "https://insightqa.fusionopscloud.com/ispring/";
		public String INVALID_STG_URL = "https://stg.fusionopscloud.com/ispring/awc?mode=page&processID";
		public String INVALID_PRD_URL = "https://insight.fusionopscloud.com/ispring/awc?mode=page&processID";
	}

	public interface Credentials {
		// login credentials
		public String ADMIN_USERNAME = "tibi.halmaciu@fusionops.com";
		public String ADMIN_PASSWORD = "PaRoLa,1";
		public String USERNAME = "fusionautomation@mailinator.com";
		public String PASSWORD = "Automation,1";
		public String DEFAULT_USERS_PASSWORD = "Testing,1";
		public String FUSIONOPS_ADMIN_USER = "fusionopsqa@fusionops.com";
		public String FUSIONOPS_ADMIN_PASSWORD = "#Fusionops101";
	}

	public interface ApiCredentials {
		// for QA Project - Exasol
		public String CLIENT_ID = "71841378_79FB_406A_86A0_110FE4555BF1";
		public String CLIENT_SECRET = "a952287ad8aafd84d23d14db8b3bd392";
		public String USERNAME = "fusionautomation@mailinator.com";
		public String PASSWORD = "Automation,1";
	}

	public interface DatabaseCredentials {
		public String QA01_URL = "jdbc:mysql://qa01.caxjfdnhccsl.us-east-1.rds.amazonaws.com:3306/fusionops";
		public String QA01_USER = "qauser";
		public String QA01_PASSWORD = "@Aera@QA@T3@";
		public String QA02_URL = "jdbc:mysql://qa02.caxjfdnhccsl.us-east-1.rds.amazonaws.com:3306/fusionops";
		public String QA02_USER = "qauser";
		public String QA02_PASSWORD = "@Aera@QA@T3@";
		public String DEV_URL = "jdbc:mysql://dev-2017-12-04.caxjfdnhccsl.us-east-1.rds.amazonaws.com:3306/fusionops";
		public String DEV_USER = "qauser";
		public String DEV_PASSWORD = "@Aera@QA@T3@";
	}

	public interface JavaScript {
		// cancel button javascript
		public String GENERIC_CANCEL_BUTTON_ID_SCRIPT = "(function(){var btn, getBtnId=function(win){if (win.getPlugin('savable')){if (win.header){return win.header.items.getAt(1).getId();}}else{if (win.header){return win.header.items.getAt(2).getId();}else{return win.down('#Cancel').getId();}}}; Ext.WindowManager.eachTopDown(function(item){if (item instanceof Ext.window.Window || item.isXType('window')){btn=getBtnId(item); return false;}}); if (!!btn) return btn;})()";
	}

	public interface ImageURLs {
		public String DASHBOARD_BACKGROUND_IMAGE_URL = "http://wallpoper.com/images/00/45/05/47/green-background-2_00450547.jpg";
		public String DASHBOARD_IMAGE_URL = "http://vk.com/images/gifts/256/71.jpg";
		public String DASHBOARD_IMAGE_URL2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Sciences_de_la_terre.svg/256px-Sciences_de_la_terre.svg.png";
	}

	public interface MailHandler {
		public String MAILINATOR_HOMEPAGE = "http://mailinator.com/";
		public String MAILINATOR = "Mailinator";
		public String MAILDROP_HOMEPAGE = "http://maildrop.cc/";
		public String MAILDROP = "MailDrop";
	}

	public interface Measures {
		public String CUSTOM_MEASURE_FORMULA = "SUM(`Net Amt`)/[total:SUM(`Net Amt`)] * 100";
		public String CUSTOM_MEASURE_FORMULA2 = "SUM(`Net Amt`)+{input:VariableName:1}";
		public String CUSTOM_MEASURE_FORMULA3 = "sum(if({input:Age As Of:current_date}-`Billing Date`.`Date`>=0 and {input:Age As Of:current_date}-`Billing Date`.`Date`<=30,`Invoice Value 1`,0))";
		public String CUSTOM_MEASURE_FORMULA4 = "sum(if({input:Age As Of:current_date}-`Billing Date`.`Date`>=31 and {input:Age As Of:current_date}-`Billing Date`.`Date`<=60,`Invoice Value 1`,0))";
		public String CUSTOM_MEASURE_FORMULA5 = "SUM(`Net Amt`)*100";
		public String CUSTOM_MEASURE_FORMULA6 = "sum(if({input:Age As Of:current_date}-`Billing Date`.`Date`>=0 and {input:Age As Of:current_date}-`Billing Date`.`Date`<=30,`Item Amt`,0))";
		public String CUSTOM_MEASURE_FORMULA7 = "AVG(`Revenue`)";
		public String CUSTOM_OUT_OF_THE_BOX_MEASURE_FORMULA = "f_ap.amt_InLocalCurrency + f_ap.amt_TaxInLocalCurrency - f_ap.amt_CashDiscountLocalCurrency";

		public String CUSTOM_MEASURE_BROKEN_FORMULA = "(`Cost Amt`) +{input:aaa:1}";
		public String CUSTOM_MEASURE_BROKEN_FORMULA2 = "SUM (`Cost Amt` +{input:aaa:1}";
		public String CUSTOM_MEASURE_BROKEN_FORMULA3 = "SUM`Cost Amt`)";
		public String CUSTOM_MEASURE_BROKEN_FORMULA4 = "SUM\"\"`Cost Amt`)";

		public String OUT_OF_THE_BOX_MEASURE = "1Out Of The Box Measure";
	}

	public interface Dimensions {
		public String CUSTOM_DIMENSION_FORMULA = "`As of Date`.`Week Ending`";

		public String OUT_OF_THE_BOX_DIMENSION_ATTRIBUTE = "1Out Of The Box Dimension Attribute";
	}

	public interface Messages {
		public String ACTION_REQUIRED_TEXT1 = "We have detected that ";
		public String ACTION_REQUIRED_TEXT2 = " is referenced by some other resources. Please delete it from those resources and try again";
		public String MEASURE_USED_IN_REPORT_MESSAGE1 = "Selected measures/attributes could not be deleted because they are present in the below reports:";
		public String MEASURE_USED_IN_REPORT_MESSAGE2 = "Please remove measures/attributes you want to delete from the above resources and try again.";
		public String SQL_VALIDATOR_ERROR_MESSAGE = "`Cost Amt` was not identified as a data source.";
		public String REMOVE_MULTIFACT_SA_MESSAGE1 = "Attributes and measures from the Sales Analysis fact are used in the following report sheets:";
		public String REMOVE_MULTIFACT_SA_MESSAGE2 = "If you choose to continue, all the attributes and measures from Sales Analysis will be removed from the earlier stated report sheets.";
		public String LOCKED_FILTER_MESSAGE = "You do not have authorization to perform that action. Please contact your system administrator.";
		public String DRAFT_MESSAGE = "The draft has been saved, do you want to discard draft?";
	}

	public interface Environments {
		public String DEV = "DEV";
		public String DEV1 = "DEV1";
		public String DEV2 = "DEV2";
		public String QA01 = "QA01";
		public String QA02 = "QA02";
		public String STG01 = "STG01";
		public String QA = "QD";
		public String PRD = "PRD";
	}

	public interface ApiEndpoints {
		public String DEV_TOKEN_URL = "https://dev.aeratechnology.com/ispring/client/oauth/token";
		public String DEV_MANAGE_USERS_URL = "https://dev.aeratechnology.com/ispring/client/v1/users";
		public String QA01_TOKEN_URL = "https://qa01.aeratechnology.com/ispring/client/oauth/token";
		public String QA01_MANAGE_USERS_URL = "https://qa01.aeratechnology.com/ispring/client/v1/users";
		public String QA02_TOKEN_URL = "https://qa02.fusionopscloud.com/ispring/client/oauth/token";
		public String QA02_MANAGE_USERS_URL = "https://qa02.fusionopscloud.com/ispring/client/v1/users";
		public String STG01_TOKEN_URL = "https://stg01.aeratechnology.com/ispring/client/oauth/token";
		public String STG01_MANAGE_USERS_URL = "https://stg01.aeratechnology.com/ispring/client/v1/users";
		public String PRD_TOKEN_URL = "https://insightp.aeratechnology.com/ispring/client/oauth/token";
		public String PRD_MANAGE_USERS_URL = "https://insightp.aeratechnology.com/ispring/client/v1/users";

		public String DEV1_TOKEN_URL = "https://dev1.fusionopscloud.com/ispring/client/oauth/token";
		public String DEV1_MANAGE_USERS_URL = "https://dev1.fusionopscloud.com/ispring/client/v1/users";
		public String FDEV1_TOKEN_URL = "https://insightdev1.fusionopscloud.com/ispring/client/oauth/token";
		public String FDEV1_MANAGE_USERS_URL = "https://insightdev1.fusionopscloud.com/ispring/client/v1/users";
		public String QA_TOKEN_URL = "https://insightqa.fusionopscloud.com/ispring/client/oauth/token";
		public String QA_MANAGE_USERS_URL = "https://insightqa.fusionopscloud.com/ispring/client/v1/users";
		public String STG_TOKEN_URL = "https://stg.fusionopscloud.com/ispring/client/oauth/token";
		public String STG_MANAGE_USERS_URL = "https://stg.fusionopscloud.com/ispring/client/v1/users";
		public String STG_INT_TOKEN_URL = "https://stgint01.fusionopscloud.com/ispring/client/oauth/token";
		public String STG_INT_MANAGE_USERS_URL = "https://stgint01.fusionopscloud.com/ispring/client/v1/users";
		public String STG_AWS_CNAME_TOKEN_URL = "https://cf1stg.fusionopscloud.com/ispring/client/oauth/token";
		public String STG_AWS_CNAME_MANAGE_USERS_URL = "https://cf1stg.fusionopscloud.com/ispring/client/v1/users";
		public String PRD_RS_TOKEN_URL = "https://insight.fusionopscloud.com/ispring/client/oauth/token";
		public String PRD_RS_MANAGE_USERS_URL = "https://insight.fusionopscloud.com/ispring/client/v1/users";
		public String PRD_UK_TOKEN_URL = "https://insightuk.fusionopscloud.com/ispring/client/oauth/token";
		public String PRD_UK_MANAGE_USERS_URL = "https://insightuk.fusionopscloud.com/ispring/client/v1/users";
		public String PRD_UK2_TOKEN_URL = "https://ukprdtest.fusionopscloud.com/ispring/client/oauth/token";
		public String PRD_UK2_MANAGE_USERS_URL = "https://ukprdtest.fusionopscloud.com/ispring/client/v1/users";
		public String QD_TOKEN_URL = "https://insightqd.fusionopscloud.com/ispring/client/oauth/token";
		public String QD_MANAGE_USERS_URL = "https://insightqd.fusionopscloud.com/ispring/client/v1/users";

	}

	public interface ApiResponses {
		public String CREATE_USER_SUCCESS_RESPONSE = "1 User(s) details updated successfully in FusionOps Inc.";
	}

	public interface FilesLocation {
		public String CREATE_USER_JSON_FILE_LOCATION = "src/test/resources/api/CreateUserBody";
		public String USER_INVALID_DATA_JSON_FILE_LOCATION = "src/test/resources/api/CreateUserInvalidDataBody";
		public String EXISTING_USER_DATA_JSON_FILE_LOCATION = "src/test/resources/api/CreateExistingUserDataBody";
		public String EDIT_USER_JSON_FILE_LOCATION = "src/test/resources/api/EditUserBody";

		public String TEST_FILES_BASE_LOCATION = "src/test/resources/";
		public String DOWNLOADS_FOLDER_NAME = "Downloads";
	}

	public interface Expressions {
		public String RANGE_MEASURE_CONDITION = "`Ordering Plant`.`Plant Country`= 'US' and `Gross Amt` > '20000' and `Gross Amt`  < '32000'";
		public String RANGE_MEASURE_CONDITION2 = "`Ordering Plant`.`Plant Country`= [\"GB\",\"US\"] and `Gross Amt` > '3800' and `Gross Amt`  < '32000'";
		public String RANGE_MEASURE_CONDITION3 = "`Ordering Plant`.`Plant Country`= [\"GB\",\"US\"] and `Gross Amt` > '2000' and `Gross Amt`  < '32000'";
		public String RANGE_ATTRIBUTE_CONDITION = "`Ordering Plant`.`Plant Country`='MX'";
		public String RANGE_ATTRIBUTE_CONDITION2 = "`Acct Doc Entered Date`.`Fin Year`='2012'";
		public String RANGE_ATTRIBUTE_CONDITION4 = "`Company`.`Company Name`= 'Company 10149'";
		public String RANGE_ATTRIBUTE_CONDITION5 = "`Transaction Detail`.`aaa`='SW10 0XE London'";
	}

	public interface UserProfileOptions {
		public String PREVIEW_NEW_VERSION = "Preview new version";
		public String DATA_REFRESH_STATUS = "Data refresh status";
	}

	// miscelaneous
	public static final String RETURN = "return ";
	public static final long DEFAULT_WAIT_TIME = 2000;
	public static final String COMMENTS_103_CHARACTERS = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890111";
	public static final String LOGIN_ERROR_MESSAGE1 = "Invalid username and password.";
	public static final String LOGIN_ERROR_MESSAGE2 = "Incorrect username and/or password";
	public static final String LOGIN_ERROR_MESSAGE3 = "Incorrect username and password";

	// -------------------------------------------- UI3 -------------------------------------------

	public interface MainMenuOptions {
		public String REPORTS = "Reports";
		public String DASHBOARDS = "Dashboards";
		public String METADATA = "Metadata";
		public String ANALYSIS_MAP = "Analysis map";
		public String SNAPSHOTS = "Snapshots";
		public String MONITORS = "Monitors";
		public String WEB_SERVICES = "Web services";
	}

	public interface UserProfileMenuOptions {
		public String MANAGE_USERS = "Manage Users";
		public String LOGOUT = "Logout";
		public String MANAGE_ROLES = "Manage Roles";
		public String PROFILE_AND_ACCOUNT = "Profile and Account";
		public String CONFIGURATIONS = "Configurations";
	}
}
