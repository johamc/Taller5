package java5control;

import java.util.Scanner;

public class veterinario {
    public static void  ejercicio2(){
        System.out.println("\n-------VETERINARIA---------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese por favor que tipo de mascota tiene: 1.perro, 2.gato, 3.ave, 4.otro.  ");
        int animal = scanner.nextInt();

        System.out.println("Ingrese que edad tiene su mascota:  ");
        int edadAnimal = scanner.nextInt();

        switch (animal) {
            case 1:
                animal = 1;
                System.out.println("Veterinario canino ");
                break;
            case 2:
                animal = 2;
                System.out.println("Veterinario felino ");
                break;
            case 3:
                animal = 3;
                System.out.println("Veterinario de animales exóticos ");
                break;
            default: System.out.println("Veterinario general ");
        }
        if (edadAnimal > 5 && animal == 1 || animal == 2 ){
            System.out.println("Se recomienda vacunación adicional ");

        }


    }
}
