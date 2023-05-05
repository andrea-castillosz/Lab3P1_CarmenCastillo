/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_carmencastillo;
import java.util.Scanner;
/**
 *
 * @author casti
 */
public class Lab3P1_CarmenCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        boolean seguirmenu = true;
        while (seguirmenu){
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Ejercicio 1. Serie Euclidiana.");
            System.out.println("2. Ejercicio 2. Pokebola.");
            System.out.println("3. Ejercicio 3. ¡OK Boomer!.");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                   System.out.println("Puntos a ingresar: ");
                   int puntos = Leer.nextInt();
                   while (puntos <= 0){
                       System.out.println("Reingrese un numero mayor a cero: ");
                       puntos = Leer.nextInt();
                   }
                   int contador=1;
                   double acumulador=0;
                   
                   while (contador <= puntos) {
                       System.out.println("Ingrese sus puntos: ");
                       int x = Leer.nextInt();
                       int y = Leer.nextInt();
                       int suma = (x-y);
                       double potencia = Math.pow(suma, 2);
                       acumulador = acumulador + potencia;
                       contador++;        
                   }
                   double resultado = Math.sqrt(acumulador);
                   System.out.println("La distancia euclidiana es: " +resultado);
                   
                    
                    break;
                
                case 2:
                   System.out.println("Ingrese el tamaño: ");
                   int tama = Leer.nextInt();
                   for (int i=1; i<=tama; i++){
                       for (int j=1; j<=(tama+tama)-1; j++){
                           if ((j == 1 || j== (tama+tama)-1) || ( i == 1 || i == tama)){
                               System.out.print("*");
                           }else if (i <= (tama/2)-1){
                               System.out.print("*");     
                           }else if(j<= (tama/2)+1 && i == (tama/2)){
                               System.out.print("*");
                           }else if(j>(tama/2)+1 && j<=(tama/2)+1 +(tama/2)+2 && i==(tama/2)){
                               System.out.print("#");
                           }else if(j>(tama/2)+1 +(tama/2)+2 && i==(tama/2)){
                               System.out.print("*");
                           }else if((j<= (tama/2)+1 &&  i==(tama/2) +1) ||( j>(tama/2)+1 +(tama/2)+2 &&  i==(tama/2) +1) ){
                               System.out.print("#");
                           }else if(j>(tama/2)+1 && j<=(tama/2)+1 +(tama/2)+2 && i==(tama/2)+2){
                               System.out.print("#");
                           }else {
                               System.out.print(" ");
                           }
                       }
                       System.out.println(" ");
                   }
                    
                    break;
                    
                    
                case 3:
                    System.out.println("Ingrese su año de nacimiento: ");
                    int fecha = Leer.nextInt();
                    if (fecha < 1946 || fecha > 2025) {
                        System.out.println("Su fecha no esta dentro del rango.");
                    } else if (fecha >= 1946 && fecha <= 1959) {
                        System.out.println("¡Felicidades usted es de la Baby Boomer Gen!");
                    } else if (fecha >= 1960 && fecha <= 1964) {
                        System.out.println("¡Felicidades usted es de la Generation X!");
                    } else if (fecha >= 1965 && fecha <= 1974) {   
                        System.out.println("¡Felicidades usted es de la Generation X!");
                    } else if (fecha >= 1975 && fecha <= 1979) {
                        System.out.println("¡Felicidades usted es de los Xennials!");
                    } else if (fecha >= 1980 && fecha <=1985 ) {
                        System.out.println("¡Felicidades usted es de los Millenials!");
                    } else if (fecha >= 1990 && fecha <= 1994) { 
                        System.out.println("¡Felicidades usted es de la Gen Z!");
                    } else if (fecha >= 1995 && fecha <= 2012) {
                        System.out.println("¡Felicidades usted es de la Gen Z!");
                    } else if (fecha >=2013  && fecha <=2025 ) {
                        System.out.println("¡Felicidades usted es de la Gen Alpha!");
                    }    
                        
                    break;
                    
                default:
                    seguirmenu = false;
                    
                
            }
          
        }
    
    }
    
}
