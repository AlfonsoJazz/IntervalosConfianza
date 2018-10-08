
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICMUESTRAPEQ{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de DATOS es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	int num = n+1;
   int gl1= n-1;
   int gl2= n-1;
   int gl3= n-1;
   int gl4= n-1;	
      double dato[] = new double[num];
      double datoc[] = new double[num]; 
     double sumad=0;
     double suma=0;
      System.out.println("\n");
     
         for(int i=1; i < num; i++){
      
     System.out.print("Registra el valor del DATO["+i+"]=");
     
            	     dato[i] = Double.parseDouble(ent.readLine());
            	     datoc[i] = Math.pow(dato[i], 2);
            	     sumad= sumad+datoc[i];
            	     suma= suma + dato[i];
            	     
      }
      System.out.println("\n");
      
	
			    double var=(n*sumad - Math.pow(suma, 2))/(n*(n-1));
			    
			    double desv = (Math.sqrt(var));
			    double limiteinf;
			    double limitesup;	   
               	
               	   
            	System.out.print("LA DESVIACION ES DE "+desv); 
            	
            	if (nconf==90) {
            		
            		
            	switch (gl1){
            		
            		case 1:
            		limiteinf= (suma/n)-(6.314)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(6.314)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (suma/n)-(2.92)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.92)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (suma/n)-(2.353)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.353)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (suma/n)-(2.132)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.132)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (suma/n)-(2.015)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.015)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (suma/n)-(1.943)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.943)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (suma/n)-(1.895)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.895)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (suma/n)-(1.86)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.86)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (suma/n)-(1.833)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.833)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (suma/n)-(1.812)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.812)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (suma/n)-(1.796)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.796)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (suma/n)-(1.782)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.782)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (suma/n)-(1.771)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.771)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (suma/n)-(1.761)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.761)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (suma/n)-(1.753)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.753)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (suma/n)-(1.746)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.746)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (suma/n)-(1.74)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.74)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (suma/n)-(1.734)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.734)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (suma/n)-(1.729)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.729)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (suma/n)-(1.725)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.725)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (suma/n)-(1.721)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.721)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (suma/n)-(1.717)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.717)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (suma/n)-(1.714)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.714)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (suma/n)-(1.711)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.711)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (suma/n)-(1.708)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.708)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (suma/n)-(1.706)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.706)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (suma/n)-(1.703)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.703)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (suma/n)-(1.701)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.701)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (suma/n)-(1.699)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.699)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            	}
            	
            }
            if (nconf==95) {	
            	switch (gl2){
            		
            		case 1:
            		limiteinf= (suma/n)-(12.706)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(12.706)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (suma/n)-(4.303)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(4.303)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (suma/n)-(3.182)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.182)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (suma/n)-(2.776)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.776)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (suma/n)-(2.571)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.571)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (suma/n)-(2.447)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.447)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (suma/n)-(2.365)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.365)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (suma/n)-(2.306)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.306)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (suma/n)-(2.262)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.262)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (suma/n)-(2.228)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.228)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (suma/n)-(2.201)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.201)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (suma/n)-(2.179)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.179)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (suma/n)-(2.16)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.16)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (suma/n)-(1.761)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(1.761)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (suma/n)-(2.145)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.145)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (suma/n)-(2.12)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.12)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (suma/n)-(2.11)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.11)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (suma/n)-(2.101)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.101)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (suma/n)-(2.093)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.093)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (suma/n)-(2.086)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.086)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (suma/n)-(2.08)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.08)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (suma/n)-(2.074)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.074)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (suma/n)-(2.069)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.069)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (suma/n)-(2.064)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.064)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (suma/n)-(2.06)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.06)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (suma/n)-(2.056)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.056)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (suma/n)-(2.052)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.052)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (suma/n)-(2.048)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.048)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (suma/n)-(2.045)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.045)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            	
            }
            	}
            	
            	if (nconf==98) {
            	switch (gl3){
            		
            		case 1:
            		limiteinf= (suma/n)-(31.821)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(31.821)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (suma/n)-(6.965)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(6.965)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (suma/n)-(4.541)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(4.541)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (suma/n)-(3.747)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.747)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (suma/n)-(3.365)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.365)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (suma/n)-(3.143)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.143)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (suma/n)-(2.998)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.998)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (suma/n)-(2.896)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.896)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (suma/n)-(2.821)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.821)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (suma/n)-(2.764)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.764)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (suma/n)-(2.718)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.718)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (suma/n)-(2.681)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.681)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (suma/n)-(2.65)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.65)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (suma/n)-(2.624)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.624)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (suma/n)-(2.602)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.602)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (suma/n)-(2.583)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.583)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (suma/n)-(2.567)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.567)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (suma/n)-(2.552)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.552)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (suma/n)-(2.539)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.539)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (suma/n)-(2.528)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.528)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (suma/n)-(2.518)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.518)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (suma/n)-(2.508)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.508)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (suma/n)-(2.5)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.5)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (suma/n)-(2.492)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.492)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (suma/n)-(2.485)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.485)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (suma/n)-(2.479)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.479)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (suma/n)-(2.473)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.473)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (suma/n)-(2.467)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.467)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (suma/n)-(2.462)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.462)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            	}
            }
            	
            	if (nconf==99) {
            	switch (gl4){
            		
            		case 1:
            		limiteinf= (suma/n)-(63.657)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(63.657)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (suma/n)-(9.925)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(9.925)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (suma/n)-(5.841)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(5.841)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (suma/n)-(4.604)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(4.604)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (suma/n)-(4.032)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(4.032)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (suma/n)-(3.707)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.707)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (suma/n)-(3.499)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.499)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (suma/n)-(3.355)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.355)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (suma/n)-(3.25)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.25)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (suma/n)-(3.169)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.169)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (suma/n)-(3.106)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.106)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (suma/n)-(3.055)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.055)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (suma/n)-(3.012)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(3.012)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (suma/n)-(2.977)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.977)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (suma/n)-(2.947)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.947)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (suma/n)-(2.921)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.921)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (suma/n)-(2.898)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.898)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (suma/n)-(2.878)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.878)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (suma/n)-(2.861)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.861)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (suma/n)-(2.845)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.845)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (suma/n)-(2.831)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.831)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (suma/n)-(2.819)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.819)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (suma/n)-(2.807)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.807)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (suma/n)-(2.797)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.797)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (suma/n)-(2.787)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.787)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (suma/n)-(2.779)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.779)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (suma/n)-(2.771)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.771)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (suma/n)-(2.763)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.763)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (suma/n)-(2.756)*(desv/(Math.sqrt(n)));
            		limitesup= (suma/n)+(2.756)*(desv/(Math.sqrt(n)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < u < "+limitesup);
            		break;
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	  	   
   	   	  	   	
   	   	  			}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}