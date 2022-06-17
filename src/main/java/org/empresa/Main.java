package org.empresa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Manera de crear y almacenar objetos, pero si son muchos qué hacemos? un arraylist nos puede ayudar
        Auto a1 = new Auto("ABC123", "Rojo");
//        Auto a2 = new Auto("GDF234","Blanco");
//        Auto a3 = new Auto("HIN436","Verde");

        //En medio de los <TipoDeDatp > va el tipo de dato, luego el nombre a esa variable
        ArrayList<Auto> misAutos = new ArrayList<>();
        System.out.println("Tamaño ArrayList: " + misAutos.size());
        System.out.println("Mi ArrayList: " + misAutos);

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));

        misAutos.add(a1);
        System.out.println("Tamaño ArrayList: " + misAutos.size());
        System.out.println("Mi ArrayList: " + misAutos);

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));

        misAutos.add(new Auto("DEG3ad", "Negro"));
        System.out.println("Tamaño ArrayList: " + misAutos.size());
        System.out.println("Mi ArrayList: " + misAutos);
        System.out.println(("+++++++++++++++++++++++++++++++++++++"));

        misAutos.add(new Auto("SADe54", "Verde"));
        System.out.println("Tamaño ArrayList: " + misAutos.size());
        System.out.println("Mi ArrayList: " + misAutos);

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));
        System.out.println("El 2do auto es: " + misAutos.get(1));

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posición " + i + " es: " + misAutos.get(i));
        }

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));
        //for each
        for (Auto auto:misAutos){
            System.out.println("El auto es de color: " + auto.getColor());

        }

        System.out.println(("+++++++++++++++++++++++++++++++++++++"));

        //Se puede remover con indice o con los parametros
        misAutos.remove(0);
        System.out.println("Tamaño ArrayList: " + misAutos.size());
        System.out.println("Mi ArrayList: " + misAutos);

    }
}