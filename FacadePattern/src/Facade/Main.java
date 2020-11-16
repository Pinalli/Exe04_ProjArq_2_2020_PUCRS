package Facade;

import Facade.appFacade.Facade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        while (true) {
            System.out.println("Tell me what you want to do?");
            System.out.println("1. Purchase items in shopping cart");
            System.out.println("2. Add items in shopping cart");
            System.out.println("3. Remove items in shopping cart");
            System.out.println("4. See shopping cart");
            System.out.println("5. See total for the shopping cart");
            System.out.println("6. See your balance");
            System.out.println("7. Exit");
            flag = scanner.nextInt();
            if (flag == 7) { break; }
            switch (flag) {
                case 1: facade.purchase(); break;
                case 2: facade.addItem(); break;
                case 3: facade.removeItem(); break;
                case 4: facade.lookShoppingCart(); break;
                case 5: facade.lookTotal(); break;
                case 6: facade.checkBalance(); break;
                default: System.out.println("Please, type a number from 1 to 4.\n");
            }
        }
    }

}
