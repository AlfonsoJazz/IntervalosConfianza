
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICPROPOR{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de intentos es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La cantidad de EXITOS es = ");
     double x = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     
   	 
         
      System.out.println("\n");
   
			   
			    double limiteinf;
			    double limitesup;	   
   	   	  	   
   	   	  	
   	   	  double radical=Math.sqrt((x/n)*(1-x/n)/n);
   	   	  
   	   	  
   	   	  
         
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            			
            		
            		case 90:
            		limiteinf= (x/n)-(1.645)*(radical);
            		limitesup= (x/n)+(1.645)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 91:
            		limiteinf= (x/n)-(1.695)*(radical);
            		limitesup= (x/n)+(1.695)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
   	   	  	   
   	   	  	   		case 92:
            		limiteinf= (x/n)-(1.751)*(radical);
            		limitesup= (x/n)+(1.751)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 93:
            		limiteinf= (x/n)-(1.812)*(radical);
            		limitesup= (x/n)+(1.812)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 94:
            		limiteinf= (x/n)-(1.881)*(radical);
            		limitesup= (x/n)+(1.881)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 95:
            		limiteinf= (x/n)-(1.96)*(radical);
            		limitesup= (x/n)+(1.96)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 96:
            		limiteinf= (x/n)-(2.054)*(radical);
            		limitesup= (x/n)+(2.054)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            			
            		case 97:
            		limiteinf= (x/n)-(2.17)*(radical);
            		limitesup= (x/n)+(2.17)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 98:
            		limiteinf= (x/n)-(2.326)*(radical);
            		limitesup= (x/n)+(2.326)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            		case 99:
            		limiteinf= (x/n)-(2.576)*(radical);
            		limitesup= (x/n)+(2.576)*(radical);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < p < "+limitesup);
            		break;
            		
            	}
   	   	  	   
   	   	  	   	 
   	   	  
   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}