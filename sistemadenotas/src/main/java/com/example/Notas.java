package com.example;

public class Notas {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Notas (String nombre, double nota1,double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void MostrarNotas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
    }
}

