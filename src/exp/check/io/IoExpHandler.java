package exp.check.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.omg.CORBA.portable.Streamable;

public class IoExpHandler {
	public static void closeReader(Reader r) {
		if (r != null)
			try {
				r.close();
			} catch (IOException e) {
				throw new RuntimeException(e + " >> Details: Can't close Reader<" + r.getClass().getName() + ">");
			}
	}
	
	public static void closeWriter(Writer w) {
		if (w != null)
			try {
				w.close();
			} catch (IOException e) {
				throw new RuntimeException(e + " >> Details: Can't close Reader<" + w.getClass().getName() + ">");
			}
	}
	
	public static void closeOutputStream(OutputStream os) {
		if (os != null)
			try {
				os.close();
			} catch (IOException e) {
				throw new RuntimeException(e + " >> Details: Can't close OutputStream<" + os.getClass().getName() + ">");
			}
	}
	
	public static void closeInputStream(InputStream is) {
		if (is != null)
			try {
				is.close();
			} catch (IOException e) {
				throw new RuntimeException(e + " >> Details: Can't close InputStream<" + is.getClass().getName() + ">");
			}
	}
}
