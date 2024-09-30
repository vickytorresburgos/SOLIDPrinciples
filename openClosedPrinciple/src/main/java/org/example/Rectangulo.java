package org.example;

public class Rectangulo implements Forma{
    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }
}

