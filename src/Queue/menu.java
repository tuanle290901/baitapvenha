package Queue;

import dictionary.Dictionary;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        int choice;
        do {
            System.out.println("1: Thêm từ điển: ");
            System.out.println("2: Tra từ điển: ");
            System.out.println("3: Sửa từ điển: ");
            System.out.println("0: Thoát ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Dictionary.addDictionary();

                    break;
                case 2:

                    break;
                case 3:
                    break;
            }


        } while (true);


    }
}
