package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String basket = "";
        int sum = 0;
        System.out.println("Hi there!\n\nWelcome to the menu of \"Salam Bro\" Fast Food Station. \nHere you can see our menu below.");
        while(true) {
            System.out.println("0. Exit menu. \n1. Burgers. \n2. Hot Dogs. \n3. French fries. \n4. Drinks. \n5. Sauces. \n6. Additives. \n7. Clear basket. \n8. Check basket.");
            System.out.print("Choose one: ");
            int a = s.nextInt();
            System.out.println(" ");
            switch (a) {
                case 0:
                    break;
                case 1:
                    System.out.println("0. Exit menu. \n1. Chicken hamburger - 590 kzt. \n2. Beef hamburger - 790 kzt. \n3. Chicken cheeseburger - 790 kzt. \n4. Beef cheeseburger - 890 kzt. \n5. Double chicken hamburger - 990 kzt. \n6. Double chicken cheeseburger - 1090 kzt. \n7. Double beef hamburger - 1090 kzt. \n8. Double beef cheeseburger - 1190 kzt. \n9. Mixed cheeseburger - 1190 kzt. ");
                    System.out.print("Choose a burger: ");
                    int b = s.nextInt();
                    if (b == 1) {
                        basket +="Chicken hamburger - 590 kzt.\n";
                        sum += 590;
                    } else if (b == 2) {
                        basket +="Beef hamburger - 790 kzt.\n";
                        sum += 790;
                    } else if (b == 3) {
                        basket +="Chicken cheeseburger - 790 kzt.\n";
                        sum += 790;
                    } else if (b == 4) {
                        basket +="Beef cheeseburger - 890 kzt.\n";
                        sum += 890;
                    } else if (b == 5) {
                        basket +="Double chicken hamburger - 990 kzt.\n";
                        sum += 990;
                    } else if (b == 6) {
                        basket +="Double chicken cheeseburger - 1090 kzt.\n";
                        sum += 1090;
                    } else if (b == 7) {
                        basket +="Double beef hamburger - 1090 kzt.\n";
                        sum += 1090;
                    } else if (b == 8) {
                        basket +="Double beef cheeseburger - 1190 kzt.\n";
                        sum += 1190;
                    } else if (b == 9) {
                        basket +="Mixed cheeseburger - 1190 kzt.\n";
                        sum += 1190;
                    } else if (b == 0) {
                        break;
                    }

                    break;
                case 2:
                    System.out.println("0. Exit menu. \n1. Spicy hot dog - 590 kzt. \n2. Hot dog - 590 kzt. ");
                    System.out.print("Choose a hot dog: ");
                    int c = s.nextInt();
                    if (c == 0) {
                        break;
                    } else if (c == 1) {
                        basket +="Spicy hot dog - 590 kzt.\n";
                        sum += 590;
                    } else if (c == 2) {
                        basket +="Hot dog - 590 kzt.\n";
                        sum += 590;
                    }
                    break;
                case 3:
                    System.out.println("0. Exit menu. \n1. French fries - 390 kzt. ");
                    System.out.print("Choose a french fries : ");
                    int d = s.nextInt();
                    if (d == 0) {
                        break;
                    } else if (d == 1) {
                        basket +="French fries - 390 kzt.\n";
                        sum +=390;
                    }
                    break;
                case 4:
                    System.out.println("0. Exit menu. \n1. Coca-Cola 0.51 - 250 kzt. \n2. Fanta 0.51 - 250 kzt. \n3. Sprite 0.51 - 250 kzt. \n4. Fuse Tea 0.51 - 300 kzt. \n5. Bon aqua 0.51 - 200 kzt. \n6. Raspberry compote 0.31 - 250 kzt. \n7. Currant compote 0.31 - 250 kzt. \n8. Piko pulpy 0.51 - 350 kzt.");
                    System.out.print("Choose a drinks: ");
                    int e = s.nextInt();
                    if (e == 0) {
                        break;
                    } else if (e == 1) {
                        basket +="Coca-Cola 0.51 - 250 kzt.\n";
                        sum +=250;
                    } else if (e == 2) {
                        basket +="Fanta 0.51 - 250 kzt.\n";
                        sum +=250;
                    } else if (e == 3) {
                        basket +="Sprite 0.51 - 250 kzt.\n";
                        sum +=250;
                    } else if (e == 4) {
                        basket +="Fuse Tea 0.51 - 300 kzt.\n";
                        sum +=300;
                    } else if (e == 5) {
                        basket +="Bon aqua 0.51 - 200 kzt.\n";
                        sum +=200;
                    } else if (e == 6) {
                        basket +="Raspberry compote 0.31 - 250 kzt.\n";
                        sum +=250;
                    } else if (e == 7) {
                        basket +="Currant compote 0.31 - 250 kzt.\n";
                        sum +=250;
                    } else if (e == 8) {
                        basket +="Piko pulpy 0.51 - 350 kzt.\n";
                        sum +=350;
                    }
                    break;
                case 5:
                    System.out.println("0. Exit menu. \n1. Ketchup - 100 kzt. \n2. Cheese sauce - 100 kzt. \n3. Sauce BBQ - 100 kzt. \n4. Spicy sauce - 50 kzt. \n5. Mustard sauce - 100 kzt. ");
                    System.out.print("Choose a sauce: ");
                    int f = s.nextInt();
                    if (f == 0) {
                        break;
                    } else if (f == 1) {
                        basket +="Ketchup - 100 kzt.\n";
                        sum +=100;
                    } else if (f == 2) {
                        basket +="Cheese sauce - 100 kzt.\n";
                        sum +=100;
                    } else if (f == 3) {
                        basket +="Sauce BBQ - 100 kzt.\n";
                        sum +=100;
                    } else if (f == 4) {
                        basket +="Spicy sauce - 50 kzt.\n";
                        sum +=50;
                    } else if (f == 5) {
                        basket +="Mustard sauce - 100 kzt.\n";
                        sum +=100;
                    }
                    break;
                case 6:
                    System.out.println("0. Exit menu. \n1. Jalapeno - 100 kzt. \n2. Cheese - 150 kzt. ");
                    System.out.print("Choose a additive: ");
                    int g = s.nextInt();

                    if (g == 0) {
                        break;
                    } else if (g == 1) {
                        basket +="Jalapeno - 100 kzt.\n";
                        sum +=100;
                    } else if (g == 2) {
                        basket +="Cheese - 150 kzt.\n";
                        sum +=150;
                    }
                    break;
                case 7:
                    System.out.println("Clear basket? \n1. YES \n2. NO");
                    int l = s.nextInt();
                    if (l == 1) {
                        sum = 0;
                        basket = " ";

                    } else if (l == 2) {
                        break;
                    }
                    break;

                case 8:
                    if (sum==0){
                    System.out.println("Basket is empty.");
                    System.out.println("Total price: 0 kzt.");

                }else if(sum!=0){
                    System.out.println("Basket: \n" + basket);

                    System.out.print("Total price: ");
                    System.out.println(sum + " kzt.");
                }
                    break;


                default:

            }

                System.out.println();

        }
    }
}






