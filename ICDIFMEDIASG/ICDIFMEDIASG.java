
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICDIFMEDIASG{
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
   	   	    
   	   	  System.out.print("La MEDIA MUESTRAL1 es = ");
     double x1 = Double.parseDouble(ent.readLine());  
   	   	    
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de DATOS1 es de: ");  
   	   	 	 
   	   	    int n1 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La MEDIA MUESTRAL2 es = ");
     double x2 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     
   	  System.out.print("La cantidad de DATOS2 es de: ");  
   	   	 	 
   	   	    int n2 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    
   	   	    System.out.print("La DESVIACION ESTANDAR1 es = ");
     double desv1 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
         
         System.out.print("La DESVIACION ESTANDAR2 es = ");
     double desv2 = Double.parseDouble(ent.readLine()); 
   	   	    
         
      System.out.println("\n");
   
			   
			    double limiteinf;
			    double limitesup;	   
   	   	  	   
   	   	  	
   	   	  double radical=Math.sqrt(((desv1)*(desv1)/n1)+((desv2)*(desv2)/n2));
   	   	  
   	   	  
         
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            			
            		
            		case 90:
            		limiteinf= ((x1)-(x2))-(1.645)*(radical);
            		limitesup= ((x1)-(x2))+(1.645)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            		case 91:
            		limiteinf= ((x1)-(x2))-(1.695)*(radical);
            		limitesup= ((x1)-(x2))+(1.695)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
   	   	  	   
   	   	  	   		case 92:
            		limiteinf= (((x1)-(x2)))-(1.751)*(radical);
            		limitesup= ((x1)-(x2))+(1.751)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < media1 - media2 < "+limitesup);
            		break;
            		
            		case 93:
            		limiteinf= ((x1)-(x2))-(1.812)*(radical);
            		limitesup= ((x1)-(x2))+(1.812)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < media1 - media2 < "+limitesup);
            		break;
            		
            		case 94:
            		limiteinf= ((x1)-(x2))-(1.881)*(radical);
            		limitesup= ((x1)-(x2))+(1.881)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            		case 95:
            		limiteinf= ((x1)-(x2))-(1.96)*(radical);
            		limitesup= ((x1)-(x2))+(1.96)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            		case 96:
            		limiteinf= ((x1)-(x2))-(2.054)*(radical);
            		limitesup= ((x1)-(x2))+(2.054)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            			
            		case 97:
            		limiteinf= ((x1)-(x2))-(2.17)*(radical);
            		limitesup= ((x1)-(x2))+(2.17)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            		case 98:
            		limiteinf= ((x1)-(x2))-(2.326)*(radical);
            		limitesup= ((x1)-(x2))+(2.326)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            		case 99:
            		limiteinf= ((x1)-(x2))-(2.576)*(radical);
            		limitesup= ((x1)-(x2))+(2.576)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" <  media1 - media2 < "+limitesup);
            		break;
            		
            	}
   	   	  	   
   	   	  	   	 
   	   	  
   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}