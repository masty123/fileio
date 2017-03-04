package ku.util;

import java.io.*;
/*
* This is a class method that FileCopyTask depend on.
* @author  Theeruth Borisuth
*
*/


public class FileUtil {
	/*
	 * Copy the InputStream to the OutputStream one byte at a time
	 * \
	 */
	static void copy (InputStream in, OutputStream out)
	{
		try
		{	
		int buffer ;
		while ((buffer = in.read()) >= 0) out.write(buffer);

		}
		catch (IOException e)
		{
			throw new RuntimeException();
		}
		
	}
	/*
	 * Copy the InputStream to the OutputStream using a byte array of size blocksize
	 */
	static void copy (InputStream in, OutputStream out, int blocksize) 
	{
		byte [] buffer = new byte[blocksize];
		int size; 
		try
		{
		
		while ((size = in.read(buffer)) > 0)out.write(buffer,0,blocksize);
		in.close();
		out.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException();
		}
		
		
	}
	/*
	 * Copy the InputStream to the OutputStream using a BufferedReader to Read the 
	 * InputStream and PrintWriter for OutputStream
	 */
	static void bcopy (InputStream in, OutputStream out) 
	{
		Reader reader = new InputStreamReader(in);
		PrintWriter printer = new PrintWriter(out);
		BufferedReader br = new BufferedReader(reader);
		String line = null ;
		try 
		{
		while ((line = br.readLine()) != null)
		{
			printer.write(line);
		}
		}catch(IOException e){
			throw new RuntimeException();
		}

	
	}
	
	
}
