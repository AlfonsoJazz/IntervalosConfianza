
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class ICVARIANZA{
		public double inversion;
  
   	int num;		
    
	public static void main(String []args){	 
	
		 BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
   	   	  try{
   	   	  		  
   	   	  	   	System.out.println("\n");	   	   	  	   	
   	   	  	   		
   	   	  System.out.println("\n");	 	    
   	   	  
   	   	  
   	     System.out.print("El NIVEL DE CONFIANZA(90,95 o 98) es de: ");
   	     
   	   	    int nconf = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    System.out.println("\n");
   	   	    
   	   	   System.out.print("CONOCE LOS VALORES DE LAS MEDIAS Y SUS DESVIACIONES? (SI MARQUE 1, NO 2): ");
   	     
   	   	    int refe = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    switch (refe){
   	   	     
   	   	   case 1: 
   	   	    	
   	   	  System.out.print("La cantidad de DATOS es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	   	    System.out.print("El valor de la varianza de la muestra es de: ");  
   	   	 	 
   	   	    double var = Double.parseDouble(ent.readLine()); 	  
   	   	    	  
   	int num = n+1;
   int gl= n-1;
   	
      
      System.out.println("\n");
     
         
			    double limiteinf;
			    double limitesup;	   
               	
               	   
            	
            	if (nconf==90) {
            		
            		
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(3.8415);
            		limitesup= (gl*var)/(0.0039);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(5.9915);
            		limitesup= (gl*var)/(0.1026);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(7.8147);
            		limitesup= (gl*var)/(0.3518);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(9.4877);
            		limitesup= (gl*var)/(0.7107);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(11.0705);
            		limitesup= (gl*var)/(1.1455);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(12.5916);
            		limitesup= (gl*var)/(1.6354);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(14.0671);
            		limitesup= (gl*var)/(2.1673);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(15.5073);
            		limitesup= (gl*var)/(2.7326);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(16.919);
            		limitesup= (gl*var)/(3.3251);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(18.307);
            		limitesup= (gl*var)/(3.9403);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(19.6752);
            		limitesup= (gl*var)/(4.5748);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(21.0261);
            		limitesup= (gl*var)/(5.2260);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(22.3620);
            		limitesup= (gl*var)/(5.8919);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(23.6848);
            		limitesup= (gl*var)/(6.5706);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(24.9958);
            		limitesup= (gl*var)/(7.2609);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(26.2962);
            		limitesup= (gl*var)/(7.9616);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(27.5871);
            		limitesup= (gl*var)/(8.6718);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(28.8693);
            		limitesup= (gl*var)/(9.3904);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(30.1435);
            		limitesup= (gl*var)/(10.1170);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(31.4104);
            		limitesup= (gl*var)/(10.8508);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(32.6706);
            		limitesup= (gl*var)/(11.5913);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(33.9245);
            		limitesup= (gl*var)/(12.3380);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(35.1725);
            		limitesup= (gl*var)/(13.0905);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(36.4150);
            		limitesup= (gl*var)/(13.8484);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(37.6225);
            		limitesup= (gl*var)/(14.6114);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(38.8851);
            		limitesup= (gl*var)/(15.3792);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(40.1133);
            		limitesup= (gl*var)/(16.1514);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(41.3372);
            		limitesup= (gl*var)/(16.9279);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(42.5569);
            		limitesup= (gl*var)/(17.7084);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}
            	
            }
            if (nconf==95) {	
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(5.0239);
            		limitesup= (gl*var)/(0.0010);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(7.3778);
            		limitesup= (gl*var)/(0.0506);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(9.3484);
            		limitesup= (gl*var)/(0.2158);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(11.1433);
            		limitesup= (gl*var)/(0.4844);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(12.8325);
            		limitesup= (gl*var)/(0.8312);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(14.4494);
            		limitesup= (gl*var)/(1.2373);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(16.0128);
            		limitesup= (gl*var)/(1.6899);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(17.5345);
            		limitesup= (gl*var)/(2.1797);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(19.0228);
            		limitesup= (gl*var)/(2.7004);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(20.4832);
            		limitesup= (gl*var)/(3.2470);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(21.9200);
            		limitesup= (gl*var)/(3.8157);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(23.3367);
            		limitesup= (gl*var)/(4.4038);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(24.7356);
            		limitesup= (gl*var)/(5.0087);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(26.1189);
            		limitesup= (gl*var)/(5.6287);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(27.4884);
            		limitesup= (gl*var)/(6.2621);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(28.8453);
            		limitesup= (gl*var)/(6.9077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(30.1910);
            		limitesup= (gl*var)/(7.5642);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(31.5264);
            		limitesup= (gl*var)/(8.2307);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(32.8523);
            		limitesup= (gl*var)/(8.9065);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(34.1696);
            		limitesup= (gl*var)/(9.5908);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(35.4789);
            		limitesup= (gl*var)/(10.2829);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(36.7807);
            		limitesup= (gl*var)/(10.9823);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(38.0756);
            		limitesup= (gl*var)/(11.6885);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(39.3641);
            		limitesup= (gl*var)/(12.4011);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(40.6465);
            		limitesup= (gl*var)/(13.1197);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(41.9231);
            		limitesup= (gl*var)/(13.8439);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(43.1945);
            		limitesup= (gl*var)/(14.5734);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(44.4608);
            		limitesup= (gl*var)/(15.3079);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(45.7223);
            		limitesup= (gl*var)/(16.0471);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	
            }
            	}
            	
            	if (nconf==98) {
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(6.6349);
            		limitesup= (gl*var)/(0.0012);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(9.2104);
            		limitesup= (gl*var)/(0.0201);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(11.3449);
            		limitesup= (gl*var)/(0.1148);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(13.2767);
            		limitesup= (gl*var)/(0.2971);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(15.0863);
            		limitesup= (gl*var)/(0.5543);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(16.8119);
            		limitesup= (gl*var)/(0.8721);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(18.4753);
            		limitesup= (gl*var)/(1.2390);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(20.0902);
            		limitesup= (gl*var)/(1.6465);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(21.6660);
            		limitesup= (gl*var)/(2.0879);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(23.2093);
            		limitesup= (gl*var)/(2.5582);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(24.7250);
            		limitesup= (gl*var)/(3.0535);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(26.2170);
            		limitesup= (gl*var)/(3.5706);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(27.6882);
            		limitesup= (gl*var)/(4.1069);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(29.1412);
            		limitesup= (gl*var)/(4.6604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(30.5780);
            		limitesup= (gl*var)/(5.2294);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(31.9999);
            		limitesup= (gl*var)/(5.8122);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(33.4087);
            		limitesup= (gl*var)/(6.4077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(34.8052);
            		limitesup= (gl*var)/(7.0149);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(36.1908);
            		limitesup= (gl*var)/(7.6327);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(37.5663);
            		limitesup= (gl*var)/(8.2604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(38.9322);
            		limitesup= (gl*var)/(8.8972);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(40.2894);
            		limitesup= (gl*var)/(9.5425);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(41.6383);
            		limitesup= (gl*var)/(10.1957);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(42.9798);
            		limitesup= (gl*var)/(10.8563);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(44.3140);
            		limitesup= (gl*var)/(11.5240);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(45.6416);
            		limitesup= (gl*var)/(12.1982);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(46.9628);
            		limitesup= (gl*var)/(12.8785);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(48.2782);
            		limitesup= (gl*var)/(13.5647);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(49.5878);
            		limitesup= (gl*var)/(14.2564);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}
            }
            	
            	if (nconf==99) {
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(7.8794);
            		limitesup= (gl*var)/(0.0000);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(10.5965);
            		limitesup= (gl*var)/(0.0100);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(12.8381);
            		limitesup= (gl*var)/(0.0717);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(14.8602);
            		limitesup= (gl*var)/(0.2070);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(16.7496);
            		limitesup= (gl*var)/(0.4118);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(18.5475);
            		limitesup= (gl*var)/(0.6757);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(20.2777);
            		limitesup= (gl*var)/(0.9893);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(21.9549);
            		limitesup= (gl*var)/(1.3444);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(23.5893);
            		limitesup= (gl*var)/(1.7349);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(25.1881);
            		limitesup= (gl*var)/(2.1558);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(26.7569);
            		limitesup= (gl*var)/(2.6032);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(28.2997);
            		limitesup= (gl*var)/(3.0738);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(29.8193);
            		limitesup= (gl*var)/(3.5650);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(31.3194);
            		limitesup= (gl*var)/(4.0747);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(32.8015);
            		limitesup= (gl*var)/(4.6009);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(34.2671);
            		limitesup= (gl*var)/(5.1422);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(35.7184);
            		limitesup= (gl*var)/(5.6973);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(37.1564);
            		limitesup= (gl*var)/(6.2648);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(38.5821);
            		limitesup= (gl*var)/(6.8439);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(39.9969);
            		limitesup= (gl*var)/(7.4338);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(41.4009);
            		limitesup= (gl*var)/(8.0336);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(42.7957);
            		limitesup= (gl*var)/(8.6427);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(44.1814);
            		limitesup= (gl*var)/(9.2604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(45.5584);
            		limitesup= (gl*var)/(9.8862);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(46.9280);
            		limitesup= (gl*var)/(10.5196);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(48.2898);
            		limitesup= (gl*var)/(11.1602);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(49.6450);
            		limitesup= (gl*var)/(11.8077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(50.9936);
            		limitesup= (gl*var)/(12.4613);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(52.3355);
            		limitesup= (gl*var)/(13.1211);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	 break;
   	  
   	   	 
   	   	 case 2:
   	   	 
   	   	 System.out.print("La cantidad de DATOS es de: ");  
   	   	 	 
   	   	    n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	num = n+1;
   gl= n-1;
   	
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
      
	
			     var = (n*sumad - Math.pow(suma, 2))/(n*(n-1));
			    
			    double desv = (Math.sqrt(var));
			   	   
               	
               	   
            	System.out.print("LA DESVIACION ES DE "+desv); 
            	
            	if (nconf==90) {
            		
            		
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(3.8415);
            		limitesup= (gl*var)/(0.0039);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(5.9915);
            		limitesup= (gl*var)/(0.1026);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(7.8147);
            		limitesup= (gl*var)/(0.3518);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(9.4877);
            		limitesup= (gl*var)/(0.7107);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(11.0705);
            		limitesup= (gl*var)/(1.1455);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(12.5916);
            		limitesup= (gl*var)/(1.6354);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(14.0671);
            		limitesup= (gl*var)/(2.1673);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(15.5073);
            		limitesup= (gl*var)/(2.7326);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(16.919);
            		limitesup= (gl*var)/(3.3251);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(18.307);
            		limitesup= (gl*var)/(3.9403);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(19.6752);
            		limitesup= (gl*var)/(4.5748);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(21.0261);
            		limitesup= (gl*var)/(5.2260);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(22.3620);
            		limitesup= (gl*var)/(5.8919);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(23.6848);
            		limitesup= (gl*var)/(6.5706);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(24.9958);
            		limitesup= (gl*var)/(7.2609);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(26.2962);
            		limitesup= (gl*var)/(7.9616);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(27.5871);
            		limitesup= (gl*var)/(8.6718);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(28.8693);
            		limitesup= (gl*var)/(9.3904);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(30.1435);
            		limitesup= (gl*var)/(10.1170);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(31.4104);
            		limitesup= (gl*var)/(10.8508);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(32.6706);
            		limitesup= (gl*var)/(11.5913);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(33.9245);
            		limitesup= (gl*var)/(12.3380);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(35.1725);
            		limitesup= (gl*var)/(13.0905);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(36.4150);
            		limitesup= (gl*var)/(13.8484);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(37.6225);
            		limitesup= (gl*var)/(14.6114);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(38.8851);
            		limitesup= (gl*var)/(15.3792);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(40.1133);
            		limitesup= (gl*var)/(16.1514);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(41.3372);
            		limitesup= (gl*var)/(16.9279);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(42.5569);
            		limitesup= (gl*var)/(17.7084);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}
            	
            }
            if (nconf==95) {	
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(5.0239);
            		limitesup= (gl*var)/(0.0010);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(7.3778);
            		limitesup= (gl*var)/(0.0506);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(9.3484);
            		limitesup= (gl*var)/(0.2158);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(11.1433);
            		limitesup= (gl*var)/(0.4844);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(12.8325);
            		limitesup= (gl*var)/(0.8312);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(14.4494);
            		limitesup= (gl*var)/(1.2373);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(16.0128);
            		limitesup= (gl*var)/(1.6899);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(17.5345);
            		limitesup= (gl*var)/(2.1797);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(19.0228);
            		limitesup= (gl*var)/(2.7004);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(20.4832);
            		limitesup= (gl*var)/(3.2470);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(21.9200);
            		limitesup= (gl*var)/(3.8157);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(23.3367);
            		limitesup= (gl*var)/(4.4038);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(24.7356);
            		limitesup= (gl*var)/(5.0087);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(26.1189);
            		limitesup= (gl*var)/(5.6287);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(27.4884);
            		limitesup= (gl*var)/(6.2621);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(28.8453);
            		limitesup= (gl*var)/(6.9077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(30.1910);
            		limitesup= (gl*var)/(7.5642);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(31.5264);
            		limitesup= (gl*var)/(8.2307);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(32.8523);
            		limitesup= (gl*var)/(8.9065);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(34.1696);
            		limitesup= (gl*var)/(9.5908);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(35.4789);
            		limitesup= (gl*var)/(10.2829);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(36.7807);
            		limitesup= (gl*var)/(10.9823);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(38.0756);
            		limitesup= (gl*var)/(11.6885);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(39.3641);
            		limitesup= (gl*var)/(12.4011);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(40.6465);
            		limitesup= (gl*var)/(13.1197);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(41.9231);
            		limitesup= (gl*var)/(13.8439);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(43.1945);
            		limitesup= (gl*var)/(14.5734);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(44.4608);
            		limitesup= (gl*var)/(15.3079);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(45.7223);
            		limitesup= (gl*var)/(16.0471);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	
            }
            	}
            	
            	if (nconf==98) {
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(6.6349);
            		limitesup= (gl*var)/(0.0012);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(9.2104);
            		limitesup= (gl*var)/(0.0201);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(11.3449);
            		limitesup= (gl*var)/(0.1148);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(13.2767);
            		limitesup= (gl*var)/(0.2971);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(15.0863);
            		limitesup= (gl*var)/(0.5543);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(16.8119);
            		limitesup= (gl*var)/(0.8721);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(18.4753);
            		limitesup= (gl*var)/(1.2390);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(20.0902);
            		limitesup= (gl*var)/(1.6465);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(21.6660);
            		limitesup= (gl*var)/(2.0879);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(23.2093);
            		limitesup= (gl*var)/(2.5582);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(24.7250);
            		limitesup= (gl*var)/(3.0535);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(26.2170);
            		limitesup= (gl*var)/(3.5706);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(27.6882);
            		limitesup= (gl*var)/(4.1069);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(29.1412);
            		limitesup= (gl*var)/(4.6604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(30.5780);
            		limitesup= (gl*var)/(5.2294);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(31.9999);
            		limitesup= (gl*var)/(5.8122);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(33.4087);
            		limitesup= (gl*var)/(6.4077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(34.8052);
            		limitesup= (gl*var)/(7.0149);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(36.1908);
            		limitesup= (gl*var)/(7.6327);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(37.5663);
            		limitesup= (gl*var)/(8.2604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(38.9322);
            		limitesup= (gl*var)/(8.8972);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(40.2894);
            		limitesup= (gl*var)/(9.5425);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(41.6383);
            		limitesup= (gl*var)/(10.1957);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(42.9798);
            		limitesup= (gl*var)/(10.8563);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(44.3140);
            		limitesup= (gl*var)/(11.5240);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(45.6416);
            		limitesup= (gl*var)/(12.1982);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(46.9628);
            		limitesup= (gl*var)/(12.8785);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(48.2782);
            		limitesup= (gl*var)/(13.5647);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(49.5878);
            		limitesup= (gl*var)/(14.2564);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}
            }
            	
            	if (nconf==99) {
            	switch (gl){
            		
            		case 1:
            		limiteinf= (gl*var)/(7.8794);
            		limitesup= (gl*var)/(0.0000);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 2:
            		limiteinf= (gl*var)/(10.5965);
            		limitesup= (gl*var)/(0.0100);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 3:
            		limiteinf= (gl*var)/(12.8381);
            		limitesup= (gl*var)/(0.0717);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 4:
            		limiteinf= (gl*var)/(14.8602);
            		limitesup= (gl*var)/(0.2070);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 5:
            		limiteinf= (gl*var)/(16.7496);
            		limitesup= (gl*var)/(0.4118);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 6:
            		limiteinf= (gl*var)/(18.5475);
            		limitesup= (gl*var)/(0.6757);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 7:
            		limiteinf= (gl*var)/(20.2777);
            		limitesup= (gl*var)/(0.9893);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 8:
            		limiteinf= (gl*var)/(21.9549);
            		limitesup= (gl*var)/(1.3444);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 9:
            		limiteinf= (gl*var)/(23.5893);
            		limitesup= (gl*var)/(1.7349);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 10:
            		limiteinf= (gl*var)/(25.1881);
            		limitesup= (gl*var)/(2.1558);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 11:
            		limiteinf= (gl*var)/(26.7569);
            		limitesup= (gl*var)/(2.6032);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 12:
            		limiteinf= (gl*var)/(28.2997);
            		limitesup= (gl*var)/(3.0738);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 13:
            		limiteinf= (gl*var)/(29.8193);
            		limitesup= (gl*var)/(3.5650);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 14:
            		limiteinf= (gl*var)/(31.3194);
            		limitesup= (gl*var)/(4.0747);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 15:
            		limiteinf= (gl*var)/(32.8015);
            		limitesup= (gl*var)/(4.6009);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 16:
            		limiteinf= (gl*var)/(34.2671);
            		limitesup= (gl*var)/(5.1422);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 17:
            		limiteinf= (gl*var)/(35.7184);
            		limitesup= (gl*var)/(5.6973);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 18:
            		limiteinf= (gl*var)/(37.1564);
            		limitesup= (gl*var)/(6.2648);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 19:
            		limiteinf= (gl*var)/(38.5821);
            		limitesup= (gl*var)/(6.8439);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 20:
            		limiteinf= (gl*var)/(39.9969);
            		limitesup= (gl*var)/(7.4338);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 21:
            		limiteinf= (gl*var)/(41.4009);
            		limitesup= (gl*var)/(8.0336);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 22:
            		limiteinf= (gl*var)/(42.7957);
            		limitesup= (gl*var)/(8.6427);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 23:
            		limiteinf= (gl*var)/(44.1814);
            		limitesup= (gl*var)/(9.2604);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 24:
            		limiteinf= (gl*var)/(45.5584);
            		limitesup= (gl*var)/(9.8862);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 25:
            		limiteinf= (gl*var)/(46.9280);
            		limitesup= (gl*var)/(10.5196);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 26:
            		limiteinf= (gl*var)/(48.2898);
            		limitesup= (gl*var)/(11.1602);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 27:
            		limiteinf= (gl*var)/(49.6450);
            		limitesup= (gl*var)/(11.8077);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 28:
            		limiteinf= (gl*var)/(50.9936);
            		limitesup= (gl*var)/(12.4613);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            		
            		case 29:
            		limiteinf= (gl*var)/(52.3355);
            		limitesup= (gl*var)/(13.1211);
            		System.out.println("\n");	 
            		System.out.print("EL INTERVALO DE CONFIANZA ES:  "+limiteinf+" < var < "+limitesup);
            		break;
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	  	
   	   }

   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
	}
		}