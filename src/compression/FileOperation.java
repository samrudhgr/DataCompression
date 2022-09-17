package compression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class FileOperation 
 {
	 String data="";
	 public String readFile(String fileName)
	 {
	 try 
	 {
		
		 Scanner myReader = new Scanner(new File(fileName));
	      while (myReader.hasNextLine())
	      {
	        data = data +myReader.nextLine()+"\n";
	      }
	    
	      
	      myReader.close();
	 }
	 catch (FileNotFoundException e) 
	 {
	      System.out.println("file" +fileName+ "not found");
	      e.printStackTrace();
	 }
	 return data;
	}
	
 }

