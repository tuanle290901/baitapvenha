package dictionary;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , String> dictionary = new HashMap<>();
        dictionary.put("hello", " xin chào");
        dictionary.put("bye","Tạm biệt");
    }
public static void addDictionary(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhập từ tiếng anh: ");
    String english = scanner.nextLine();
    System.out.println(" Nhập từ tiếng Việt: ");
    String vietnamese = scanner.nextLine();


    }

    public static void searchDictionary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên cần tìm: ");
        String search = scanner.nextLine();
        boolean check = false;





    }
}
