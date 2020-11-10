import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Application {


	static GestFile Gest=new GestFile("C:/");
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader key=new BufferedReader(new InputStreamReader(System.in)); 
		
		/*System.out.println("Entrer le chemin d'acces");
		  String path=in.next();
		*/
		//Gest.Analyse();
		//Gest.ArborecenseRoot();
		

		    Console con=new Console();
	        String com="";
	        do {
	            System.out.print("Root@ "+Gest.getPath()+">");
	            com=key.readLine();
	            con.format(com);
	            
	        }while(!com.equals("exit"));
	        key.close();
	        
	}


}
