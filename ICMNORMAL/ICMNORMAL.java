
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICMNORMAL{
		public double inversion;
  
   	int num;		
    
	public static void main(String []args){	 
	
		 BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
   	   	  try{
   	   	  	System.out.println("\n");	
   	   	  	  
   	   	  	    
   	   	  	   	System.out.println("\n");	   	   	  	   	
   	   	  	   		
   	   	  System.out.println("\n");	 	    
   	   	  
   	   	  
   	     System.out.print("El NIVEL DE CONFIANZA es de: ");
   	     
   	   	    int nconf = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de datos de la muestra a es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("Registra la MEDIA de la MUESTRA= ");
     double media = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     System.out.print("Registra la DESVIACION de la MUESTRA= ");
     double desv = Double.parseDouble(ent.readLine());
   	 
         
      System.out.println("\n");
   
			   
			    double limiteinf;
			    double limitesup;	   
   	   	  	   
   	   	  	
   	   	  double radical=desv/Math.sqrt(n);
   	   	  
   	   	  
   	   	  
         
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            			
            		
            		case 90:
            		limiteinf= media-(1.645)*(radical);
            		limitesup= media+(1.645)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 91:
            		limiteinf= media-(1.695)*(radical);
            		limitesup= media+(1.695)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
   	   	  	   
   	   	  	   		case 92:
            		limiteinf= media-(1.751)*(radical);
            		limitesup= media+(1.751)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 93:
            		limiteinf= media-(1.812)*(radical);
            		limitesup= media+(1.812)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 94:
            		limiteinf= media-(1.881)*(radical);
            		limitesup= media+(1.881)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 95:
            		limiteinf= media-(1.96)*(radical);
            		limitesup= media+(1.96)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 96:
            		limiteinf= media-(2.054)*(radical);
            		limitesup= media+(2.054)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            			
            		case 97:
            		limiteinf= media-(2.17)*(radical);
            		limitesup= media+(2.17)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 98:
            		limiteinf= media-(2.326)*(radical);
            		limitesup= media+(2.326)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 99:
            		limiteinf= media-(2.576)*(radical);
            		limitesup= media+(2.576)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            	}
   	   	  	   
   	   	  	   	 
   	   	  
   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}