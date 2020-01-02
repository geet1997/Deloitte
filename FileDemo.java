package exceptiondemos;
import java.io.File;

import java.util.List;


public class FileDemo {
	public static void main(String[] args) {
		
	File folder = new File("C:\\delloite\\Batch");
	File[] listOfFiles = folder.listFiles();
	{
	for (int i = 0; i < listOfFiles.length; i++) {
	  if (listOfFiles[i].isFile()) {
	    System.out.println("File " + listOfFiles[i].getName());
	  } else if (listOfFiles[i].isDirectory()) {
	    System.out.println("Directory " + listOfFiles[i].getName());
	  }
	}}}}

