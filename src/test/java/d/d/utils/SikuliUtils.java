package d.d.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUtils {

	static Screen s;
	static Finder f;

	public static void main(String[] args) throws IOException {
		System.out.println(compareScreenshotFiles("1.jpg", "2.jpg"));
		System.out.println(compareScreenshotFiles("1.jpg", "3.jpg"));
	}

	// the image in file2 will be searched in file1 (meaning file 1 can contain more information)
	public static boolean compareScreenshotFiles(String filePath1, String filePath2) {
		try {
			f = new Finder(filePath1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		f.find(filePath2);
		if (f.hasNext()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean compareScreenshotFiles(String filePath1, String filePath2, double similarity) {
		Settings.MinSimilarity = similarity;
		try {
			f = new Finder(filePath1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		f.find(filePath2);
		Settings.MinSimilarity = 0.7;
		if (f.hasNext()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isImagePresent(String imageName, double similarity) {
		Settings.MinSimilarity = similarity;
		s = new Screen();
		try {
			s.wait(FileUtils.getTestFilesLocation() + imageName, 30);
			Settings.MinSimilarity = 0.7;
		} catch (FindFailed e) {
			Settings.MinSimilarity = 0.7;
			return false;
		}
		return s.exists(FileUtils.getTestFilesLocation() + imageName) != null;
	}

	public static boolean isImagePresent(String imageName) {
		// Settings.MinSimilarity = 0.9;
		s = new Screen();
		try {
			s.wait(FileUtils.getTestFilesLocation() + imageName, 30);
		} catch (FindFailed e) {
			return false;
		}
		return s.exists(FileUtils.getTestFilesLocation() + imageName) != null;
	}

	public static boolean isImagePresent(String imageName, int waitTime) {
		// Settings.MinSimilarity = 0.9;
		s = new Screen();
		try {
			s.wait(FileUtils.getTestFilesLocation() + imageName, waitTime);
		} catch (FindFailed e) {
			return false;
		}
		return s.exists(FileUtils.getTestFilesLocation() + imageName) != null;
	}

	public static void scroll(int upOrDown, int steps) {
		s = new Screen();
		s.wheel(upOrDown, steps);
	}

	public static void clickOnImageAndScroll(String imageName, int upOrDown, int steps) {
		s = new Screen();
		try {
			s.click(FileUtils.getTestFilesLocation() + imageName);
		} catch (FindFailed e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
		s.wheel(upOrDown, steps);
		moveMouseToTop();
	}

	public static void clickOnImage(String imageName) {
		s = new Screen();
		try {
			s.click(FileUtils.getTestFilesLocation() + imageName);
		} catch (FindFailed e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
	}

	public static void clickOnScreenCenter() {
		s = new Screen();
		s.click();
	}

	public static void clickOnImageByHoldingShiftKey(String imageName) {
		s = new Screen();
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SHIFT);
			s.click(FileUtils.getTestFilesLocation() + imageName);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		} catch (FindFailed | AWTException e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
	}

	public static void doubleClickOnImage(String imageName) {
		s = new Screen();
		try {
			s.doubleClick(FileUtils.getTestFilesLocation() + imageName);
		} catch (FindFailed e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
	}

	public static void hoverOverImage(String imageName) {
		s = new Screen();
		try {
			s.mouseMove(FileUtils.getTestFilesLocation() + imageName);
		} catch (FindFailed e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
	}

	public static void type(String text) {
		s = new Screen();
		s.type(text);
	}

	public static void moveImageToRelativePosition(String imageName, int x, int y) {
		s = new Screen();
		try {
			Pattern p = new Pattern(FileUtils.getTestFilesLocation() + imageName);
			p.targetOffset(x, y);
			s.dragDrop(FileUtils.getTestFilesLocation() + imageName, p);
		} catch (FindFailed e) {
			Assert.assertTrue("image " + imageName + " was not found", false);
		}
	}

	public static void moveImageToAbsolutePosition(String imageName, int x, int y) {
		s = new Screen();
		try {
			Location loc = new Location(x, y);
			s.dragDrop(FileUtils.getTestFilesLocation() + imageName, loc);
		} catch (FindFailed e) {
		}
	}

	public static void moveMouseToRelativePosition(int x, int y) {
		s = new Screen();
		s.mouseMove(x, y);
	}

	public static void moveMouseToAbsolutePosition(int x, int y) {
		s = new Screen();
		try {
			Location loc = new Location(x, y);
			s.mouseMove(loc);
		} catch (FindFailed e) {
		}
	}

	public static void moveMouseToTop() {
		moveMouseToRelativePosition(0, -1000);
	}

}
