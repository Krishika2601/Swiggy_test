package swiggy_Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player A's health, strength, and attack:");
        int healthA = scanner.nextInt();
        int strengthA = scanner.nextInt();
        int attackA = scanner.nextInt();

        System.out.println("Enter Player B's health, strength, and attack:");
        int healthB = scanner.nextInt();
        int strengthB = scanner.nextInt();
        int attackB = scanner.nextInt();

        System.out.println("Enter the number of sides on the dice:");
        int sides = scanner.nextInt();

        System.out.println("Enter the number of rounds to fight:");
        int rounds = scanner.nextInt();

        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        Arena arena = new Arena(playerA, playerB, sides);
        arena.fight(rounds);

        scanner.close();
    }
}
