package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(2,5);
        Triangulo triangulo = new Triangulo(4,3);
        Circulo circulo = new Circulo(8);

        CalculadoraArea calculadora = new CalculadoraArea();

        System.out.println("Area del rectangulo: "+calculadora.calcularArea(rectangulo));
        System.out.println("Area del triangulo: "+calculadora.calcularArea(triangulo));
        System.out.println("Area del circulo: "+calculadora.calcularArea(circulo));

    }
}