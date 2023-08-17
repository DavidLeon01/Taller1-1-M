package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) throws InterruptedException {
    Scanner entrada = new Scanner(System.in);
    int num1, num2, operacion = 0, suma, resta, multiplicacion;
    double resultado = 0;
    float division;
    double num3, num4;
    double resultadodos;
    do {
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
      System.out.println("9.IVA");
      System.out.println("10.Salir");
      System.out.print("Digite el numero de la operación a realizar: ");
      operacion = entrada.nextInt();

      switch (operacion) {
      case 1:
        System.out.println("SUMA");
        System.out.print("Digite primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = entrada.nextInt();
        resultado = Suma.suma(num1, num2);
        System.out.println("La suma es: " + resultado);
        Thread.sleep(5000);
        break;
      case 2:
        System.out.println("RESTA");
        System.out.print("Digite primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = entrada.nextInt();
        resultado = Resta.resta(num1, num2);
        System.out.println("La resta es: " + resultado);
        Thread.sleep(5000);
        break;
      case 3:
        System.out.println("MULTIPLICACION");
        System.out.print("Digite primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = entrada.nextInt();
        resultado = Multiplicacion.multiplicacion(num1, num2);
        System.out.println("La Multiplicacion es: " + resultado);
        Thread.sleep(5000);
        break;
      case 4:
        System.out.println("DIVISION");
        System.out.print("Digite el numero a dividir: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el divisor ");
        num2 = entrada.nextInt();
        resultado = Division.division(num1, num2);
        System.out.println("La Division es: " + resultado);
        Thread.sleep(5000);
        break;
      case 5:
        System.out.println("Seno");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
        resultadodos = Seno.seno(num4);
        System.out.println("El seno en radianes es:" + resultadodos);
        Thread.sleep(5000);
        break;
      case 6:
        System.out.println("Coseno");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
        resultadodos = Coseno.coseno(num4);
        System.out.println("El coseno en radianes es:" + resultadodos);
        Thread.sleep(5000);
        break;
      case 7:
        System.out.println("Tangente");
        System.out.print("Digite el angulo en grados:");
        num3 = entrada.nextDouble();
        num4 = Math.toRadians(num3);
        resultadodos = Tangente.tangente(num4);
        System.out.println("La tangente en radianes es:" + resultadodos);
        Thread.sleep(5000);
        break;
      case 8:
        System.out.println("Raiz enesima");
        System.out.print("Digite el numero a sacar la raiz: ");
        num3 = entrada.nextFloat();
        System.out.println("Digite indice de la raiz: ");
        num4 = entrada.nextDouble();
        resultadodos = Raiz.raiz(num3, num4);

        System.out.println("La raiz es: " + resultadodos);
        Thread.sleep(5000);
        break;
      case 9:
        System.out.println("IVA");
        System.out.print("Digite el valor a sacar el IVA: ");
        num1 = entrada.nextInt();
        System.out.print("Digite el IVA a sacar: ");
        num2 = entrada.nextInt();

        resultadodos = Iva.iva(num1, num2);

        System.out.println("El valor total con IVA incluido es de: " + resultadodos);
        Thread.sleep(5000);
        break;
      case 10:
      default:
        System.out.println("Se ha finalizado el programa correctamente");
        Thread.sleep(5000);
        break;
      }
    } while (operacion != 10);

  }
  static class Suma {
    public static int suma(int valor1, int valor2) {
      return valor1 + valor2;
    }
  }
  static class Resta {
    public static int resta(int valor1, int valor2) {
      return valor1 - valor2;
    }
  }
  static class Multiplicacion {
    public static int multiplicacion(int valor1, int valor2) {
      return valor1 * valor2;
    }
  }
  static class Division {
    public static float division(float valor1, float valor2) {
      return valor1 / valor2;
    }
  }
  static class Seno {
    public static double seno(double valor1) {
      valor1 = (double) Math.sin(valor1);
      return valor1;
    }

  }
  static class Coseno {
    public static double coseno(double valor1) {
      valor1 = (double) Math.cos(valor1);
      return valor1;
    }

  }
  static class Tangente {
    public static double tangente(double valor1) {
      valor1 = (double) Math.tan(valor1);
      return valor1;
    }
  }
  static class Raiz {
    public static double raiz(double valor1, double valor2) {
      valor1 = (double) Math.pow(valor1, 1.0 / valor2);

      return valor1;
    }
  }
  static class Iva {
    public static double iva(double valor1, double valor2) {
      valor2 = ((valor1 * valor2) / 100);
      valor1 = (valor1 + valor2);
      return valor1;
    }
  }

}