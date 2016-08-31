package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to the Money Machine");
        System.out.println("Please Enter Your Name");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        if(name.isEmpty()){
            throw new Exception("Invalid Name, Please Enter Your Name");
        }
        System.out.println("What Would You Like to Do Today?");
        System.out.println("1.Check My Balance. 2.Withdraw Funds. 3.Cancel");

        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("check my balance")){
            System.out.println("Your Balance is $100");
        }
        else if(choice.equalsIgnoreCase("cancel")){
            System.out.println("Thank You, Please Come Again!");
        }
        else if(choice.equalsIgnoreCase("withdraw funds")){
            System.out.println("How Much Money You Need?");
            String withdraw = scanner.nextLine();
            int money = Integer.parseInt(withdraw);
            if(money > 100 ){
                throw new Exception("Insufficient Funds Dude");
            }
            else if(money <= 100){
                System.out.println("Please Take Your Ca$h, Homey!");
            }
        }



    }
}
