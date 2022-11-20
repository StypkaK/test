package org.example;

public class Cheef {

    public static void main(String[] args) {
        buy(1,10,20);

    }

    public static void buy(int apples, int oranges, int coins){
        for (int i=0; i<coins; i++){
            if(apples<=oranges){
                apples++;
            }
            else {
                oranges++;
            }
        }
        System.out.println("Pomaranczy jest: " + oranges);
        System.out.println("Jablek jest: " + apples);
        System.out.println("Roznica jest: " + Math.abs(oranges - apples));
        }
}
