package d.d.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import d.d.utils.Constants.DatabaseCredentials;
import d.d.utils.Constants.Environments;

public class SQLUtils {

	private static MysqlDataSource sqlDataSource;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;

	public static void main(String[] args) {
		FileUtils.setTestFilesLocation("src/test/resources");
		executeQuery("Local", "query2.txt");
	}

	// SELECT
	public static void executeQuery(String env, String queryFile) {
		String query = FileUtils.readFromFile(FileUtils.getTestFilesLocation() + queryFile);
		sqlDataSource = new MysqlDataSource();
		setConnectionParameters(env);

		try {
			connection = sqlDataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			// print result ------------------------------------------
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int columnsNumber = resultSetMetaData.getColumnCount();

			// print result set column names
			for (int i = 1; i <= columnsNumber; i++) {
				System.out.print(resultSetMetaData.getColumnName(i) + " ");
			}
			System.out.println("");

			// print result set
			while (resultSet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(" ");
					String columnValue = resultSet.getString(i);
					System.out.print(columnValue);
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

	// INSERT, UPDATE or DELETE single Query
	public static void executeUpdate(String env, String queryFile) {
		String query = FileUtils.readFromFile(FileUtils.getTestFilesLocation() + queryFile);
		sqlDataSource = new MysqlDataSource();
		setConnectionParameters(env);

		try {
			connection = sqlDataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			int result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("Update successfull");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

	// INSERT, UPDATE or DELETE multiple Queries
	public static void executeUpdateMultipleQueries(String env, String queryFile) {
		String[] queriesList = FileUtils.readFromFile(FileUtils.getTestFilesLocation() + queryFile).split(";");
		sqlDataSource = new MysqlDataSource();
		setConnectionParameters(env);

		try {
			connection = sqlDataSource.getConnection();
			for (String s : queriesList) {
				preparedStatement = connection.prepareStatement(s);
				int result = preparedStatement.executeUpdate();
				if (result > 0) {
					System.out.println("Update successfull in DB");
				} else {
					System.out.println("Nothing updated in DB");
				}
			}

		} catch (SQLException e) {
			System.out.println("----- No access to clean data for " + CustomPropertiesUtils.getEnv() + " env -----");
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	private static void setConnectionParameters(String env) {
		switch (env) {
		case Environments.QA01:
			sqlDataSource.setURL(DatabaseCredentials.QA01_URL);
			sqlDataSource.setUser(DatabaseCredentials.QA01_USER);
			sqlDataSource.setPassword(DatabaseCredentials.QA01_PASSWORD);
			break;
		case Environments.QA02:
			sqlDataSource.setURL(DatabaseCredentials.QA02_URL);
			sqlDataSource.setUser(DatabaseCredentials.QA02_USER);
			sqlDataSource.setPassword(DatabaseCredentials.QA02_PASSWORD);
			break;
		case Environments.DEV:
			sqlDataSource.setURL(DatabaseCredentials.DEV_URL);
			sqlDataSource.setUser(DatabaseCredentials.DEV_USER);
			sqlDataSource.setPassword(DatabaseCredentials.DEV_PASSWORD);
			break;
		}
	}

}
