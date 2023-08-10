
package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,operacion,suma,resta,multiplicacion;
        double resultado = 0;
      
        float division;
        double num3,num4;
        double resultadodos;
        
        
     System.out.println("-------CALCULADORA DLEON------ ");
     System.out.println("MENU DE OPCIONES.");
     System.out.println("1.SUMA");
     System.out.println("2.RESTA");
     System.out.println("3.MULTIPLICACION");
     System.out.println("4.DIVISION");
     System.out.println("5.SENO");
     System.out.println("6.COSENO");
     System.out.println("7.TANGENTE");
     System.out.println("8.RAIZ ENESIMA");
     System.out.print("Digite el numero de la operación a realizar: ");
     operacion = entrada.nextInt();
     
    switch(operacion){
        case 1: 
    System.out.println("SUMA");
    System.out.print("Digite primer numero: ");
    num1 = entrada.nextInt();
    System.out.print("Digite segundo numero: ");
    num2 = entrada.nextInt();
    resultado = Suma.suma(num1,num2);
    System.out.print("La suma es: "+resultado);
    break;
    case 2: 
        System.out.println("RESTA");
           System.out.print("Digite primer numero: ");
    num1 = entrada.nextInt();
    System.out.print("Digite segundo numero: ");
    num2 = entrada.nextInt();
    resultado = Resta.resta(num1,num2);
    System.out.print("La resta es: "+resultado);
    break;
    case 3:
        System.out.println("MULTIPLICACION");
        System.out.print("Digite primer numero: ");
    num1 = entrada.nextInt();
    System.out.print("Digite segundo numero: ");
    num2 = entrada.nextInt();
    resultado = Multiplicacion.multiplicacion(num1,num2);
    System.out.print("La Multiplicacion es: "+resultado);
    break;
    case 4:
        System.out.println("DIVISION");
        System.out.print("Digite el numero a dividir: ");
    num1 = entrada.nextInt();
    System.out.print("Ingrese el divisor ");
    num2 = entrada.nextInt();
    resultado = Division.division(num1,num2);
    System.out.print("La Division es: "+resultado);
    break;
    case 5:
        System.out.println("Seno");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
    resultadodos = Seno.seno(num4);
    System.out.print("El seno en radianes es:"+resultadodos);
    break;
    case 6:
        System.out.println("Coseno");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
    resultadodos = Coseno.coseno(num4);
    System.out.print("El coseno en radianes es:"+resultadodos);
    break;
        case 7:
        System.out.println("Tangente");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
    resultadodos = Tangente.tangente(num4);
    System.out.print("La tangente en radianes es:"+resultadodos);
    break;
        case 8:
            System.out.println("Raiz enesima");
            System.out.print("Digite el numero a sacar la raiz: ");
            num3 = entrada.nextFloat();
            System.out.println("Digite indice de la raiz: ");
            num4 = entrada.nextDouble();
            resultadodos = Math.pow(num3, 1.0 / num4);
            System.out.print("La raiz es: "+resultadodos);
            break;    
        case 9:
            System.out.print("IVA");
            System.out.print("Digite el valor a sacar el IVA: ");
            num1 = entrada.nextInt();
            System.out.print("Digite el IVA a sacar: ");
            num2 = entrada.nextInt();
            resultadodos =  Math.
            System.out.print("");        
            break;
            
    
  
    default: System.out.print("Error se equivoco de numero");
    break;
    }
    
 
}
      static class Suma {
public static int suma(int valor1,int valor2){
return valor1 + valor2;
}
}
static class Resta {
public static int resta(int valor1,int valor2){
return valor1 - valor2;
}
}
static class Multiplicacion {
public static int multiplicacion(int valor1,int valor2){
return valor1 * valor2;
}
}
static class Division {
public static float division(float valor1,float valor2){
return valor1 / valor2;
}
}
static class Seno {
public static double seno(double valor1){
     valor1 = (double) Math.sin(valor1);
return valor1;
}

}
static class Coseno {
public static double coseno(double valor1){
     valor1 = (double) Math.cos(valor1);
return valor1;
}

}
static class Tangente {
public static double tangente(double valor1){
     valor1 = (double) Math.tan(valor1);
return valor1;
}
}
}
  

