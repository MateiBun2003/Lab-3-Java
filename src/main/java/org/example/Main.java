package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> lista =new ArrayList<>();
        Random rand = new Random();

        for (int i = 1; i <= 15; i++) {
            int numarRandom = rand.nextInt(100);
            lista.add(numarRandom);
        }
        System.out.println("Lista de 15 elemente este:");
        for (int element : lista) {
            System.out.println(element);
        }
    }
}