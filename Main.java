import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> namesInFile = new ArrayList<String>();
    try {
        File fileNames = new File("names.txt");
        Scanner scannerfile = new Scanner(fileNames);
             while (scannerfile.hasNextLine()) {
                String line = scannerfile.nextLine();
                String[] fieldsArray = line.split(",");
                for (String field : fieldsArray) {
                    namesInFile.add(field);
                }
            }
            scannerfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }    
    boolean quit = false;
     

    while(!quit){
      System.out.println("Press 1 to learn about salary.\n"   + 
                         "Press 2 to learn about the job.\n" +
                         "Press 3 to learn about demand.\n" +
                         "Press 4 to view current students.\n" +
                         "Press 5 to quit.");
    int action = scanner.nextInt();
        if(action==1){
          System.out.println("$98,345 average salary in South Florida!");
           }
        else if(action==2){
          System.out.println("US News - 100 Best Jobs!");
          }
        else if(action==3){
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          }
        else if(action==4){
          System.out.println("Current Students:");
          for(String name : namesInFile){
            System.out.println(name);
            }          
          }
        else if(action==5){
          quit = true;
          scanner.close();
          }
        else {
          System.out.println("Please enter a number from 1 to 5");
           }
      

      
    }
  }
}