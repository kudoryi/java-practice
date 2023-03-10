import java.io.*;
import java.util.*;
public class Database {

    public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchElementException {
        File file = new File("database.txt");
        Scanner scan = new Scanner(file);
        Scanner input = new Scanner(System.in);
  System.out.print("Enter your id : ");
String Id = input.next();

  while (scan.hasNext()) {
    
  while (Id.equals(scan.nextLine())) {
    
  
       
            
            
         for (int i = 0; i < 6; i++) {
            System.out.println(scan.nextLine());
           }  
        }
            
        } 
         
                  scan.close();
                  input.close();
    }
}
