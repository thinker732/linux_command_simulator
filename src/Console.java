
    public  class   Console{
        String[] com;
        
        public Console() {
        	
        	System.out.println("\r\n" + 
        			"                                       (                          \r\n" + 
        			"   (                         (         )\\ )    )               )  \r\n" + 
        			"   )\\                        )\\   (   (()/( ( /(    )  (    ( /(  \r\n" + 
        			" (((_)   (    (     (    (  ((_) ))\\   /(_)))\\())( /(  )(   )\\()) \r\n" + 
        			" )\\___   )\\   )\\ )  )\\   )\\  _  /((_) (_)) (_))/ )(_))(()\\ (_))/  \r\n" + 
        			"((/ __| ((_) _(_/( ((_) ((_)| |(_))   / __|| |_ ((_)_  ((_)| |_   \r\n" + 
        			" | (__ / _ \\| ' \\))(_-</ _ \\| |/ -_)  \\__ \\|  _|/ _` || '_||  _|  \r\n" + 
        			"  \\___|\\___/|_||_| /__/\\___/|_|\\___|  |___/ \\__|\\__,_||_|   \\__|  \r\n" + 
        			"                                                                  \r\n" + 
        			"");
        	System.out.println("Toute les commandes linux pour la gestion des fichiers sont valides sous cette console \n ");

        }

        public void format(String S){
           String[] com=S.split(" ");

            if (com[0].equals("pwd")) {
            	
            	System.out.println(Application.Gest.getPath());
            	
            		if(com.length>1) {
            			if (com[1].equals("-A"))	
            			Application.Gest.Analyse();
            		}
               }

            if (com[0].equals("ls")) {
            	Application.Gest.ListerFicher();
            }

            if (com[0].equals("tree")) {
            	Application.Gest.arborescence();
            }
            
            
            if (com[0].equals("help")) {
                System.out.println("-------------------------------All Commands----------------------------");
                System.out.println("    start :  start  messaging     and :exit pour fermer la discussion  ");
                System.out.println("    list  : Acceder a ses messages                                     ");
                System.out.println("    loglist  : Acceder a ses messages                                  ");

            }

        }

      


    }



