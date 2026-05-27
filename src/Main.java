import Calculadora.Calculadora;
import Par.Par;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //---- Ejercicio 3 — Par<A,B>
        //Instanciamos un par
        Par<String,Integer> parOriginal = new Par<>("Hola",2);
        //Invertimos los pares
        Par<Integer,String> parInvertido = parOriginal.invertir();
        //Mostramos el par invertido
        System.out.println("Par Original");
        parOriginal.mostrar();
        System.out.println("Par Invertido");
        parInvertido.mostrar();
        System.out.println("-----------------------------------------------");

        //---- Ejercicio 4 — Calculadora
        //Probamos los metodos de la clase Calculadora
        System.out.println("Tipo de datos Integer");
        Calculadora.promedio(new ArrayList<>(List.of(3,7,10)));
        Calculadora.maximo(new ArrayList<>(List.of(3,7,10)));
        //Probamos con otro tipo de dato
        System.out.println("Tipo de datos Double");
        Calculadora.promedio(new ArrayList<>(List.of(100.3,12.5,3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679)));
        Calculadora.maximo(new ArrayList<>(List.of(100.3,12.5,3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679)));
    }
}
