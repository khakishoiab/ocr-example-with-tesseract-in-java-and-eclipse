package tesseracttest;

import java.io.*;
import net.sourceforge.tess4j.*;
 
public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args.length < 1) {
				System.err.println("Please specify one or more image filenames.");
				System.exit(1);
			} else {
				String imgFilePath = args[i];
				File imgfile = new File(imgFilePath);
				Tesseract instance = Tesseract.getInstance(); //
				System.out.println(imgfile.canRead());

				try {

					String result = instance.doOCR(imgfile);
					System.out.println(result);

				} catch (TesseractException e) {
					System.err.println(e.getMessage());
				}
			}

		}
	}
}
 