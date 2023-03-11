import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class infix_potfixTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Useage: java infix_postfix <input file path>");
            System.exit(1);
        }

        try{
            //ArrayLinkedList list =new ArrayLinkedList<>();
            Scanner sc=new Scanner(new FileReader(args[0]));
            String postfix="";
            while (sc.hasNextLine()) {
                String infix=sc.nextLine();
                InfixTopostfix convertTopostfix=new InfixTopostfix(infix);
                if ((!(infix.isBlank())|| !(infix.isEmpty()) )){
                
                        postfix = convertTopostfix.convert();
                System.out.println("infix: "+infix + "  to postfix: "+ postfix);}
                   
                else {System.out.println(infix+"This is not valid infix format.");}
                   
                
            }
            sc.close();
            
        
    } catch(Exception e){
        e.printStackTrace();
    }
       
    
 }
}
