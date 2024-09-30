package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan", 8.50);
        PromedioAlumno promedio = new PromedioAlumno();
        promedio.calcularPromedio(alumno);
    }
}
