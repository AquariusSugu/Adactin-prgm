package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generatesJVMReport(String jsonFile) {
//mention the path of JVM report where to store?
	File file = new File("C:\\Users\\Dell\\eclipse-workspace\\AdactinHotel\\target");
	//2.create object for configuration 
	Configuration configuration = new Configuration(file,"AdactinHotel");
	//3.Add browser version os details
	configuration.addClassifications("Browser","Chrome");
	configuration.addClassifications("version","108");
	configuration.addClassifications("OS","WIN10");
	
	//4.create the object for ReportBuilder class - pass the jason file
	List<String> jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	
	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
	
	//5.Fetch result from json file- passed, failed
	reportBuilder.generateReports();
	
	
	
	}
}