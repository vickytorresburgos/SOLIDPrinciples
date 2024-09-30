package org.example;

public class Triangulo implements Forma{
    private double altura;
    private double base;

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return (base*altura)*0.5;
    }

}

