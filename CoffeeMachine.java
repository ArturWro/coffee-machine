package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int water = 400, milk = 540, coffeeBeans = 120, cups = 9, money = 550;
        int filler;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            switch (input) {
                case ("buy"): {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String option = scanner.next();
                    switch (option) {
                        case ("1"): {
                            // espresso 250 water, 16g beans 4$
                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                                water -= 250;
                                coffeeBeans -= 16;
                                cups -= 1;
                                money += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (coffeeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            break;
                        }
                        case ("2"): {
                            // latte 350 water 75 milk 20 beans 7$
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                cups -= 1;
                                money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (coffeeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }

                            break;
                        }
                        case ("3"): {
                            //cappuccino 200 water 100 milk 12 beans 6$
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                cups -= 1;
                                money += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (coffeeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                        }
                        case ("back"):{
                            continue;
                        }
                    }
                    break;
                }
                case ("fill"): {
                    System.out.println("Write how many ml of water do you want to add: ");
                    filler = scanner.nextInt();
                    water += filler;

                    System.out.println("Write how many ml of milk do you want to add:");
                    filler = scanner.nextInt();
                    milk += filler;

                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    filler = scanner.nextInt();
                    coffeeBeans += filler;

                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    filler = scanner.nextInt();
                    cups += filler;

                    break;
                }
                case ("take"): {
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;
                }
                case ("remaining"): {
                    state(water, milk, coffeeBeans, cups, money);
                    break;
                }
                case ("exit"): {
                    System.exit(0);
                }
            }

        }
    }

    public static void state(int water, int milk, int coffeeBeans, int cups, int money) {
        System.out.println("The coffee machine has:\n ");
        System.out.println(water + " of water\n"
                + milk + " of milk\n"
                + coffeeBeans + " of coffee beans\n"
                + cups + " of disposable cups\n"
                + money + " of money");
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }

}
