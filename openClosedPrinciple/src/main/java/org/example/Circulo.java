package org.example;

public class Circulo implements Forma{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
}
