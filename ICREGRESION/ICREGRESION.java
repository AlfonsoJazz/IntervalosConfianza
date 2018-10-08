	
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICREGRESION{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de datos de cada muestra es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	int num = n+1;
   	int gl1= n-2;
   int gl2= n-2;
   int gl3= n-2;
   int gl4= n-2;
      double datox[] = new double[num];
      double datoy[] = new double[num]; 
      double cuadradox[]= new double[num];
      double cuadradoy[]= new double[num];
      
      double sumax =0;
     
      double sumay=0;
      
      double sumacx =0;
     
      double sumacy=0;
      
      double sumaxy=0;
      System.out.println("\n");
     
         for(int i=1; i < num; i++){
      
     System.out.print("Registra de la MUESTRA A el DATO["+i+"]=");
     datox[i] = Double.parseDouble(ent.readLine());
     
          
            	     cuadradox[i] = Math.pow(datox[i], 2);
            	     sumacx= sumacx+cuadradox[i];
            	     sumax= sumax + datox[i]; 
            	    
      }
      System.out.println("\n");
      
	
			    double sxx=sumacx - (Math.pow(sumax, 2)/n);;
			    
            	     
      
      System.out.println("\n");
  
			   
			   for(int i=1; i < num; i++){
      
     System.out.print("Registra de la MUESTRA B el DATO["+i+"]=");
     datoy[i] = Double.parseDouble(ent.readLine());
     
     
            	     
            	     cuadradoy[i] = Math.pow(datoy[i], 2);
            	     sumacy= sumacy+cuadradoy[i];
            	     sumay= sumay + datoy[i];
            	     
      }
      System.out.println("\n");
      
      			double syy=sumacy - (Math.pow(sumay, 2)/n);
			    
			    
      
	for(int i=1; i < num; i++){
            	     
            	     sumaxy = sumaxy + (datox[i])*(datoy[i]);
            	    
            	     
      }
			    
		double sxy = sumaxy - ((sumay*sumax)/n);
		
		double m=sxy/sxx;
		double b=(sumay/n) - (m*(sumax)/n);
		 	    
      double var = (syy- m*sxy)/(n-2);
      double desv= (Math.sqrt(var));
      
      double corre= m*(Math.sqrt(sxx/syy));
      
      System.out.println("\n");
			   
			   
			   
			   
			    double limiteinf;
			    double limitesup;	   
               	
               	System.out.print("LA MEDIA DE x ES : "+sumax/n); 
               	System.out.println("\n");  
            	System.out.print("EL VALOR DE Sxx ES : "+sxx); 
            	System.out.println("\n");  
            	System.out.print("LA MEDIA DE y ES : "+sumay/n); 
               	System.out.println("\n");  
            	System.out.print("EL VALOR DE Syy ES : "+syy);
            	
            	 
               	System.out.println("\n");  
            	System.out.print("EL VALOR DE Sxy ES : "+sxy);
            	
            	System.out.println("\n");
            	
            	System.out.print("EL VALOR DE LA CONSTANTE  b ES : "+b);
            	
            	System.out.println("\n");
            	
            	System.out.print("EL VALOR DE LA CONSTANTE m ES  : "+m);
            	System.out.println("\n");
            	System.out.print("EL VALOR DE LA DESVIACION ES  : "+desv);
            	System.out.println("\n");
            	
            	System.out.print("EL VALOR DEL COEFICIENTE DE CORRELACION ES: "+corre);
            	System.out.println("\n");
            	System.out.print("LA RECTA DE PREDICCION ES: "+"Y = "+"("+m +")" +"X + "+b);
            	System.out.println("\n");
            if (nconf==90) {
            		
            		
            	switch (gl1){
            		
            		case 1:
            		limiteinf= (m)-(6.314)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(6.314)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (m)-(2.92)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.92)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (m)-(2.353)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.353)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (m)-(2.132)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.132)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (m)-(2.015)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.015)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (m)-(1.943)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.943)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (m)-(1.895)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.895)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (m)-(1.86)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.86)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (m)-(1.833)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.833)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (m)-(1.812)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.812)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (m)-(1.796)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.796)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (m)-(1.782)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.782)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (m)-(1.771)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.771)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (m)-(1.761)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.761)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (m)-(1.753)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.753)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (m)-(1.746)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.746)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (m)-(1.74)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.74)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (m)-(1.734)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.734)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (m)-(1.729)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.729)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (m)-(1.725)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.725)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (m)-(1.721)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.721)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (m)-(1.717)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.717)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (m)-(1.714)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.714)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (m)-(1.711)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.711)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (m)-(1.708)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.708)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (m)-(1.706)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.706)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (m)-(1.703)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.703)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (m)-(1.701)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.701)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (m)-(1.699)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.699)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            	}
            	
            }
            if (nconf==95) {	
            	switch (gl2){
            		
            		case 1:
            		limiteinf= (m)-(12.706)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(12.706)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (m)-(4.303)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(4.303)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (m)-(3.182)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.182)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (m)-(2.776)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.776)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (m)-(2.571)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.571)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (m)-(2.447)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.447)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (m)-(2.365)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.365)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (m)-(2.306)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.306)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (m)-(2.262)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.262)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (m)-(2.228)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.228)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (m)-(2.201)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.201)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (m)-(2.179)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.179)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (m)-(2.16)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.16)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (m)-(1.761)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(1.761)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (m)-(2.145)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.145)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (m)-(2.12)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.12)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (m)-(2.11)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.11)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (m)-(2.101)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.101)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (m)-(2.093)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.093)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (m)-(2.086)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.086)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (m)-(2.08)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.08)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (m)-(2.074)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.074)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (m)-(2.069)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.069)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (m)-(2.064)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.064)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (m)-(2.06)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.06)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (m)-(2.056)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.056)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (m)-(2.052)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.052)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (m)-(2.048)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.048)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (m)-(2.045)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.045)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            	
            }
            	}
            	
            	if (nconf==98) {
            	switch (gl3){
            		
            		case 1:
            		limiteinf= (m)-(31.821)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(31.821)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (m)-(6.965)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(6.965)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (m)-(4.541)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(4.541)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (m)-(3.747)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.747)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (m)-(3.365)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.365)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (m)-(3.143)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.143)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (m)-(2.998)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.998)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (m)-(2.896)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.896)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (m)-(2.821)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.821)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (m)-(2.764)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.764)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (m)-(2.718)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.718)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (m)-(2.681)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.681)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (m)-(2.65)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.65)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (m)-(2.624)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.624)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (m)-(2.602)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.602)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (m)-(2.583)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.583)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (m)-(2.567)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.567)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (m)-(2.552)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.552)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (m)-(2.539)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.539)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (m)-(2.528)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.528)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (m)-(2.518)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.518)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (m)-(2.508)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.508)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (m)-(2.5)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.5)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (m)-(2.492)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.492)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (m)-(2.485)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.485)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (m)-(2.479)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.479)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (m)-(2.473)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.473)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (m)-(2.467)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.467)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (m)-(2.462)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.462)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            	}
            }
            	
            	if (nconf==99) {
            	switch (gl4){
            		
            		case 1:
            		limiteinf= (m)-(63.657)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(63.657)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (m)-(9.925)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(9.925)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (m)-(5.841)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(5.841)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (m)-(4.604)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(4.604)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (m)-(4.032)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(4.032)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (m)-(3.707)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.707)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (m)-(3.499)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.499)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (m)-(3.355)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.355)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (m)-(3.25)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.25)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (m)-(3.169)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.169)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (m)-(3.106)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.106)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (m)-(3.055)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.055)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (m)-(3.012)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(3.012)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (m)-(2.977)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.977)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (m)-(2.947)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.947)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (m)-(2.921)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.921)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (m)-(2.898)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.898)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (m)-(2.878)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.878)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (m)-(2.861)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.861)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (m)-(2.845)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.845)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (m)-(2.831)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.831)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (m)-(2.819)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.819)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (m)-(2.807)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.807)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (m)-(2.797)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.797)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (m)-(2.787)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.787)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (m)-(2.779)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.779)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (m)-(2.771)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.771)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (m)-(2.763)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.763)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (m)-(2.756)*(desv/(Math.sqrt(sxx)));
            		limitesup= (m)+(2.756)*(desv/(Math.sqrt(sxx)));
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < M < "+limitesup);
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