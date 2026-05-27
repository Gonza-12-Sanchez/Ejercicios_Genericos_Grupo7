package Calculadora;

import java.util.ArrayList;

public class Calculadora {
    //Metodos
    public static <T extends Number> void promedio(ArrayList<T> numeros){
        double total = 0.0;
        //Sumamos los numeros del arrayList
        for(Number n: numeros){
            total += n.doubleValue();
        }
        //Mostramos el promedio del arrayList recibido
        System.out.println("El promedio es igual a: " + (total / numeros.size()));
    }

    public static <T extends Number> void maximo(ArrayList<T> numeros){
        double maximo = numeros.getFirst().doubleValue();
        //Obtenemos el numero maximo del array
        for(Number n: numeros){
            if(n.doubleValue() > maximo){
                maximo = n.doubleValue();
            }
        }
        //Mostramos el numero maximo
        System.out.println("El numero maximo del arrayList es: " + maximo);
    }
}
