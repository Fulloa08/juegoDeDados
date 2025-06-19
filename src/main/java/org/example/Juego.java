package org.example;

public class Juego {
    private final Dado dado1;
    private final Dado dado2;
    private final Calculadora calculadora;

    public Juego() {
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public String jugar() {
        dado1.lanzar();
        dado2.lanzar();

        int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());

        return "Dado 1: " + dado1.getCaraSuperior() +
                "\nDado 2: " + dado2.getCaraSuperior() +
                "\nSuma: " + suma +
                "\nResultado: " + (suma == 7 ? "¡Ganaste!" : "Perdiste.");
    }
}
