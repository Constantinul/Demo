package d.ui.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import au.com.bytecode.opencsv.CSVReader;
import bad.robot.excel.matchers.WorkbookMatcher;
import d.ui.utils.Constants.FilesLocation;

public class FileUtils {

	private static String testFilesLocation;

	public static String getTestFilesLocation() {
		return testFilesLocation;
	}

	public static void setTestFilesLocation(String testFilesLocation) {
		FileUtils.testFilesLocation = testFilesLocation;
	}

	public static String readFromFile(String path, Charset encoding) {
		byte[] content = null;
		try {
			content = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(content, encoding);
	}

	public static String readFromFile(String filePath) {
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			return null;
		}
	}

	public static void printToFile(String text, String filePath) {
		try (PrintWriter out = new PrintWriter(filePath)) {
			out.println(text.trim());
		} catch (FileNotFoundException e) {
			Assert.assertTrue("could not print successfully", false);
		}
	}

	public static void appendToFile(String text, String filePath) {
		try (PrintWriter out = new PrintWriter(new FileOutputStream(new File(filePath), true))) {
			out.println(text.trim());
		} catch (FileNotFoundException e) {
			Assert.assertTrue("could not print successfully", false);
		}
	}

	// -------------------------------------------------------

	public static void verifyCsvFile(String fileName) {
		File downloadsLocation = new File(
				System.getProperty("user.home") + File.separator + FilesLocation.DOWNLOADS_FOLDER_NAME);
		String csvFile = null;
		for (String s : downloadsLocation.list()) {
			if (s != null && s.contains(".csv")) {
				csvFile = s;
			}
		}
		File file1 = new File(FileUtils.getTestFilesLocation() + fileName);
		File file2 = new File(System.getProperty("user.home") + File.separator + FilesLocation.DOWNLOADS_FOLDER_NAME
				+ File.separator + csvFile);

		try {
			Assert.assertTrue("files are not the same", org.apache.commons.io.FileUtils.contentEquals(file1, file2));
		} catch (IOException e1) {
			Assert.assertTrue("something went wrong", false);
		}
		cleanDownloadsDirectory();

	}

	public static void verifyExcelFile(String localExcelFileName) {
		File f = new File(System.getProperty("user.home") + File.separator + FilesLocation.DOWNLOADS_FOLDER_NAME);
		String excelFileName = null;
		for (String s : f.list()) {
			if (s != null && s.contains(".xlsx")) {
				excelFileName = s;
			}
		}
		try {
			FileInputStream inputStream1 = new FileInputStream(new File(System.getProperty("user.home") + File.separator
					+ FilesLocation.DOWNLOADS_FOLDER_NAME + File.separator + excelFileName));
			Workbook downloadedWorkbook = new XSSFWorkbook(inputStream1);

			FileInputStream inputStream2 = new FileInputStream(
					new File(FileUtils.getTestFilesLocation() + File.separator + localExcelFileName));
			Workbook existingWorkbook = new XSSFWorkbook(inputStream2);

			Assert.assertThat(downloadedWorkbook, WorkbookMatcher.sameWorkbook(existingWorkbook));

			downloadedWorkbook.close();
			inputStream1.close();
			existingWorkbook.close();
			inputStream2.close();
			cleanDownloadsDirectory();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Excel validation failed", false);
		}

	}

	public static void cleanDownloadsDirectory() {
		try {
			org.apache.commons.io.FileUtils.cleanDirectory(
					new File(System.getProperty("user.home") + File.separator + FilesLocation.DOWNLOADS_FOLDER_NAME));
		} catch (IOException e) {
			System.out.println("directory is already clean");
		}
	}

	public static void deleteFile(String filePath) {
		File f = new File(filePath);
		f.delete();
	}

	// only reads the first line
	public static List<String> readCsvFile(String fileName) {
		CSVReader reader;
		List<String> valuesList = null;
		try {
			reader = new CSVReader(new FileReader(FileUtils.getTestFilesLocation() + fileName), ',', '"', 1);
			valuesList = Arrays.asList(reader.readNext());
		} catch (IOException e) {
		}
		return valuesList;

	}

}
