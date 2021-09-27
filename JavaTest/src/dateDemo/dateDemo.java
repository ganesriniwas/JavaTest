package dateDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class dateDemo {

	public static void main(String[] args) throws IOException {
		Calendar ind_cd = Calendar.getInstance(TimeZone.getTimeZone("GMT+1"));
		Calendar us_cd = Calendar.getInstance(TimeZone.getTimeZone("PST"));
		String path = System.getProperty("user.dir")+"\\ID.txt";
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);
		Date d = new Date();
		String id[] = TimeZone.getAvailableIDs();
		byte[] bytString;
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y hh:mm:ss");
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		System.out.println("India Curretn Timestamp : "+ind_cd.getTime());
		System.out.println("Current US Timestamp : "+us_cd.getTime());
		for (int i=0;i<id.length;i++) {
			bytString = id[i].getBytes();
			fos.write(bytString);
		}
	}

}
