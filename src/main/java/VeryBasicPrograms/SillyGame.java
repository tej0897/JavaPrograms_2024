package VeryBasicPrograms;

import java.util.Scanner;

public class SillyGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a silly game!\npress q or Q to quit the game");
        String response = scanner.next();

        if (response.equalsIgnoreCase("q")){
            System.out.println("you quit the game!");
        } else {
            System.out.println("You are still playing the game **pew pew**");
        }
    }
}
