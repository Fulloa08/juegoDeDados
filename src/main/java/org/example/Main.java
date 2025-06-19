package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎲 Bienvenido al Juego de Dados 🎲");
        System.out.println("Presiona ENTER para lanzar los dados...");
        scanner.nextLine(); // Espera ENTER

        String resultado = juego.jugar();
        System.out.println(resultado);
    }
}
