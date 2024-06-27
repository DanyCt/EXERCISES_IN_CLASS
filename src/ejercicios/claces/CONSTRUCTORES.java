/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.claces;

/**
 *
 * @author User
 */
public class CONSTRUCTORES {
     
    
    // Constructor
    public CONSTRUCTORES() {
        // No necesita inicializar nada específico para este ejemplo
    }

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    // Método para sumar múltiples números usando varargs
    public int sumarMultiples(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Método con muchos parámetros y diferentes tipos
    public double operar(int a, int b, int c, int d, double e) {
        return (a + b) * (c - d) / e;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase
        CONSTRUCTORES calculadora = new CONSTRUCTORES();

        // Usar los métodos
        System.out.println("Suma: " + calculadora.sumar(5, 3));              // Salida: 8
        System.out.println("Resta: " + calculadora.restar(10, 4));          // Salida: 6
        System.out.println("Multiplicación: " + calculadora.multiplicar(6, 7));  // Salida: 42
        System.out.println("División: " + calculadora.dividir(20, 4));      // Salida: 5.0
        System.out.println("Suma Múltiples: " + calculadora.sumarMultiples(1, 2, 3, 4, 5)); // Salida: 15
        System.out.println("Operar: " + calculadora.operar(1, 2, 3, 4, 5.0)); // Salida: -0.6
    }
}
 
