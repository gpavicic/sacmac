package org.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * @author Crunchify.com
 * 
 */

public class PropertiesGetPropertyValues {
	String result = "";
	InputStream inputStream;
	Properties prop = new Properties();
	String propFileName = "config.properties";

	public String getPropValues() throws IOException {

		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			Date time = new Date(System.currentTimeMillis());

			// get the property value and print it out
			String user = prop.getProperty("user");
			String company1 = prop.getProperty("company1");
			String company2 = prop.getProperty("company2");


			result = "Company List = " + company1 + ", " + company2;
			System.out.println(result + "\nProgram Ran on " + time
					+ " by user=" + user);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	

	public String getUser() throws IOException {

		try {

			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			String user = prop.getProperty("jdbc.username");

			result = user;
			
		} catch (Exception e) {
			System.out.println("Exception user undefined: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	
	

	public String getPass() throws IOException {

		try {

			inputStream = getClass().getClassLoader().getResourceAsStream(
					propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"
						+ propFileName + "' not found in the classpath");
			}

			String pass = prop.getProperty("jdbc.password");

			result = pass;
			
		} catch (Exception e) {
			System.out.println("Exception pass undefined: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}