
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICPPROPORDIF{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de intentos1 es de: ");  
   	   	 	 
   	   	    int n1 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La cantidad de EXITOS1 es = ");
     double x1 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     
   	  System.out.print("La cantidad de intentos2 es de: ");  
   	   	 	 
   	   	    int n2 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La cantidad de EXITOS2 es = ");
     double x2 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
         
      System.out.println("\n");
   
			   
			    double limiteinf;
			    double limitesup;	   
   	   	  	   
   	   	  	
   	   	  double radical=Math.sqrt(((x1/n1)*(1-x1/n1)/n1)+(x2/n2)*(1-x2/n2)/n2);
   	   	  
   	   	  
         
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            		
            		case 80:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.282)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.282)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 81:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.311)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.311)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
   	   	  	   
   	   	  	   		case 82:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.341)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.341)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 83:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.372)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.372)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 84:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.405)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.405)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 85:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.44)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.44)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 86:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.476)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.476)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            			
            		case 87:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.514)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.514)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 88:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.555)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.555)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 89:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.598)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.598)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            			
            		
            		case 90:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.645)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.645)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 91:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.695)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.695)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
   	   	  	   
   	   	  	   		case 92:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.751)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.751)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 93:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.812)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.812)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 94:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.881)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.881)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 95:
            		limiteinf= ((x1/n1)-(x2/n2))-(1.96)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(1.96)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 96:
            		limiteinf= ((x1/n1)-(x2/n2))-(2.054)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(2.054)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            			
            		case 97:
            		limiteinf= ((x1/n1)-(x2/n2))-(2.17)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(2.17)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 98:
            		limiteinf= ((x1/n1)-(x2/n2))-(2.326)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(2.326)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            		case 99:
            		limiteinf= ((x1/n1)-(x2/n2))-(2.576)*(radical);
            		limitesup= ((x1/n1)-(x2/n2))+(2.576)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONF ES: "+limiteinf+" < p1 - p2 < "+limitesup);
            		break;
            		
            	}
   	   	  	   
   	   	  	   	 
   	   	  
   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}