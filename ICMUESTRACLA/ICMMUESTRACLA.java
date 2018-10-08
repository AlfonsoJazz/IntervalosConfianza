
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICMMUESTRACLA{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de INTERVALOS es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	int num = n+1;
   	
      double limiteinf[] = new double[num];
      double limitesup[] = new double[num]; 
      double frecuencia[] = new double[num];
      double promedio[]= new double[num];
      double promc[]= new double[num];
      double frecprom[]= new double[num];
      double sumafrecprom =0;
      double frec=0;
      double sumaprom=0;
      System.out.println("\n");
     
         for(int i=1; i < num; i++){
      
     System.out.print("Registra el valor del LIMITE INFERIOR ["+i+"]=");
     limiteinf[i] = Double.parseDouble(ent.readLine());
     
     System.out.print("Registra el valor del LIMITE SUPERIOR ["+i+"]=");
     limitesup[i] = Double.parseDouble(ent.readLine());
     
     System.out.print("Registra el valor de la FRECUENCIA ["+i+"]=");
     frecuencia[i] = Double.parseDouble(ent.readLine());
     
            	     promedio[i] = (limiteinf[i] + limitesup[i])/2;
            	     
            	     promc[i]= Math.pow(promedio[i], 2);
            	     
            	     frecprom[i]= (frecuencia[i])*promc[i];
            	     
            	     sumafrecprom= sumafrecprom + frecprom[i]; 
            	     
            	     frec = frec + frecuencia[i];
            	     
            	     sumaprom =sumaprom+(promedio[i])*(frecuencia[i]);
      }
      System.out.println("\n");
      
	
			    double var=(sumafrecprom/frec)-(sumaprom*sumaprom)/(frec*frec);
			    
			    double desv = (Math.sqrt(var));
			    double limiteinferior;
			    double limitesuperior;	   
               	
               	   
            	System.out.print("LA DESVIACION ES DE : "+desv); 
            	
            switch (nconf){
            		
            		case 90:
            		limiteinferior= (sumaprom/frec)-(1.645)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.645)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 91:
            		limiteinferior= (sumaprom/frec)-(1.695)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.695)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
   	   	  	   
   	   	  	   		case 92:
            		limiteinferior= (sumaprom/frec)-(1.751)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.751)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 93:
            		limiteinferior= (sumaprom/frec)-(1.812)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.812)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 94:
            		limiteinferior= (sumaprom/frec)-(1.881)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.881)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 95:
            		limiteinferior= (sumaprom/frec)-(1.96)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(1.96)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 96:
            		limiteinferior= (sumaprom/frec)-(2.054)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(2.054)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            			
            		case 97:
            		limiteinferior= (sumaprom/frec)-(2.17)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(2.17)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 98:
            		limiteinferior= (sumaprom/frec)-(2.326)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(2.326)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            		case 99:
            		limiteinferior= (sumaprom/frec)-(2.576)*(desv/(Math.sqrt(frec)));
            		limitesuperior= (sumaprom/frec)+(2.576)*(desv/(Math.sqrt(frec)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinferior+" < u < "+limitesuperior);
            		break;
            		
            	}
   	   	  			}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}