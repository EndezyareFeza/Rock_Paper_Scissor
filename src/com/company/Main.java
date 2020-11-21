package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pick your move: Scissor(0), Rock(1) and Paper(2): ");
        int move = input.nextInt();
        int rand = 0;
        int max = 2, min =0;
        int range = max - min + 1;
        for (int i = 0; i < 3; i++) {
            int Rand = (int) (Math.random() * range) + min;
            rand = Rand;
        }

            if (move == 0) {
                if (rand == 0)
                    System.out.println("The computer is Scissor. You are Scissor too. It's a draw!");
                else if (rand == 1)
                    System.out.println("The computer is Rock. You are Scissor. The Computer Wins!");
                else if (rand == 2)
                    System.out.println("The computer is Paper. You are Scissor. You Won!\nCongrats!");
            }
            else if (move == 1) {
                if (rand == 0)
                    System.out.println("The computer is Scissor. You are Rock. You Won!\nCongrats!");
                else if (rand == 1)
                    System.out.println("The computer is Rock. You are Rock too. It's a draw!");
                else if (rand == 2)
                    System.out.println("The computer is Paper. You are Rock. The Computer Wins!");
            }
            else if (move == 2) {
                if (rand == 0)
                    System.out.println("The computer is Scissor. You are Paper. The Computer Wins!");
                else if (rand == 1)
                    System.out.println("The computer is Rock. You are Paper. You Won!\nCongrats!");
                else if (rand == 2)
                    System.out.println("The computer is Paper. You are Paper too. It's a draw!");
            }
            else
                System.out.println("Incorrect input!");
    }
}
