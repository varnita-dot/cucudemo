package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "C:\\Users\\lenovo\\Desktop\\Des\\Manoj\\jdk\\EclipseWorkspace\\RefactorCode1\\src\\test\\java\\Config\\Config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties");
	}
}



