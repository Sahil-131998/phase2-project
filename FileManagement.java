import java.util.*;
import java.io.*;
public class FileManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO FILE MANAGEMENT SYSTEM");
    while(true) {
    System.out.println("\n1.Show Files \n2.Add Files \n3.Delete Files \n4.Search Files\n5.Exit");
    int n = sc.nextInt();
    if(n==5) break;
    switch(n) {
          case 1 :   List<String> results = new ArrayList<String>();
          			   File[] files = new File("C:\\Users\\Sahil\\eclipse-workspace\\Infostretch").listFiles();
          			   // Change the directory as per the source code
				  	   //If this pathname does not denote a directory, then listFiles() returns null. 
				  	   for (File file : files) {
				  		    if (file.isFile()) {
				  		        results.add(file.getName());
				  		    }
				  		}
				  	    Collections.sort(results);
				  		for(int i=0; i<results.size(); i++) System.out.println(results.get(i));
                        break;
                        
    
          case 2 :     System.out.println("Enter Filename");
                       String s = sc.next();
                       s+=".txt";
                       try{
                       File f = new File(s);
                       if(f.createNewFile()) System.out.println(s+" File Created");
                       else System.out.println(s+" Not created");
                       }
                       catch(Exception e) {System.err.println(e.getMessage());}
                       break;
          case 3 :     System.out.println("Enter Filename to delete");
				       String s1 = sc.next();
				       s1+=".txt";
				       File f1 = new File(s1);
				       if(f1.delete())System.out.println(s1+" File Deleted");
				       else System.out.println(s1+" does not deleted");
				       break;
				       
          case 4 : 	   System.out.println("Enter file name to search");
					   String s2 = sc.next();
					   s2+=".txt";
					   File f2 = new File(s2);
					   if(f2.exists()) System.out.println(s2+" File Exixts");
					   else System.out.println(s2+" File does not exists");
					   break;
          
         default : System.out.println("Please select correct option");
             }
    
    }
	}

}
