package com.example;

public class Main {
    public static void main(String[] args) {
        Notas juanDiego = new Notas("Juan Diego Serna Ochoa", 3.6, 3.2, 3.9);
        Notas juliana = new Notas("Juliana", 5, 6, 7);
        System.out.println("Print something");
        System.out.println(juanDiego);
        System.out.println("Fin");
        juanDiego.MostrarNotas();
        juliana.MostrarNotas();
    }
}