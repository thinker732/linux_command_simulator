import java.io.File;
import java.net.URI;

public class GestFile extends File {
	
	public final String SEPARATOR=System.getProperty("file.separator");
	
	
	public GestFile(String pathname) {
	
			super(pathname);	
	}

	/**
	 * Analyse du fichier	
	 */
	public void Analyse() {
		System.out.println("******************************************************");
		System.out.println("Ce repertoire contient :");
		System.out.println("\t \t"+this.NbrRep()+" Repertoires");
		System.out.println("\t \t"+this.NbrFich()+" Repertoires");
		System.out.println("******************************************************");
	}
	/**
	 * liste tout les fichiers d'un repertoire
	 * 
	 */
	
public void ListerFicher() {

		//String[] liste=this.list();
		File[] liste=this.listFiles();  
		
		if (liste != null) {         
            
			for (int i = 0; i < liste.length; i++) {
				
				if(liste[i].isFile()) 
				System.out.println("\t - "+liste[i].getName());
            }
			
        }
	}
	
	

	/**
	 * liste tout les repertoires d'un repertoire
	 * 
	 */
	public void ListerRepertoire() {

		//String[] liste=this.list();
		File[] liste=this.listFiles();  
		
		if (liste != null) {         
            
			for (int i = 0; i < liste.length; i++) {
				
				if(liste[i].isDirectory()) 
				System.out.println("+ "+liste[i].getName());
            }
			
        } else {
        	System.out.println("repertoire vide");
        }
		
	}

	
	
	/**
	 * genere l'arborescence du File
	 */
	public void arborescence() {

		//String[] liste=this.list();
		File[] liste=this.listFiles();  
		System.out.println(this.getName());
		if (liste != null) {         
            
			for (int i = 0; i < liste.length; i++) {
				
				if(liste[i].isDirectory()) {
					GestFile rep=new GestFile(liste[i].getPath());
					System.out.print("+ "+liste[i].getName());
					System.out.println("("+rep.NbrFich()+" Fichiers ,"+rep.NbrRep()+" Repertoires)");
					rep.ListerFicher();
						
				} 
				
            }
			
        } else {
        	System.out.println("repertoire vide");
        }
		
	}
	
	
	
	/**
	 * genere l'arborescence d'un fichier
	 * 
	 * @param F fichier dont l'arborescence doit etre géneré
	 */
	public void arborescence(File F){

		File[] liste=F.listFiles();  
		System.out.println(this.getName());
		if (liste != null) {         
            
			for (int i = 0; i < liste.length; i++) {
				
				if(liste[i].isDirectory()) {
					GestFile rep=new GestFile(liste[i].getPath());
					System.out.print("+ "+liste[i].getName());
					System.out.println("("+rep.NbrFich()+" Fichiers ,"+rep.NbrRep()+" Repertoires)");
					rep.ListerFicher();
						
				} 
				
            }
			
        } else {
        	System.out.println("repertoire vide");
        }
		
	}
	
	/**
	 * 
	 * @return le nombre de repertoire du repertoire courant
	 */
	public int NbrRep() {
		File[] liste=this.listFiles();  
		int count=0;
		if (liste != null) {
			
				for (int i = 0; i < liste.length; i++) {
					if(liste[i].isDirectory()) 
						count++;
				}
			return count;
			
        }
		
        	return count;
	}

	/**
	 * 
	 * @return le nombre de fichier du repertoire courant
	 */
	public int NbrFich() {
		File[] liste=this.listFiles();  
		int count=0;
		if (liste != null) {
			
				for (int i = 0; i < liste.length; i++) {
					if(liste[i].isFile()) 
						count++;
				}
			return count;
			
        }
		
        	return count;
	}

	
	/**
	 * Liste les partitions systemes
	 */
	public  void ListRoot() {
			File[] liste=this.listRoots();  
			
			if (liste != null) {         
	            
				for (int i = 0; i < liste.length; i++) {
					
					System.out.println("root:"+liste[i]);
	            }
				
	        }

		}

	/**
	 * Genere l'arborescence du systeme1
	 */
	public void ArborecenseRoot() {
		File[] liste=this.listRoots();  
		
		if (liste != null) {         
            
			for (int i = 0; i < liste.length; i++) {
				

				GestFile rep=new GestFile(liste[i].getPath());
				System.out.println("root:"+liste[i]);
				System.out.println("("+rep.NbrFich()+" Fichiers ,"+rep.NbrRep()+" Repertoires)");
				rep.arborescence(rep);
            }
			
        }

	}
}
