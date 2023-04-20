package bai_tap_ve_nha;

import java.util.ArrayList;
import java.util.Scanner;

public class MySystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<Student>();
            StudentManager studentManager = new StudentManager();
            studentManager.addClassroom();
            studentManager.addGender();
            studentManager.addStudents();


            int choice;
            do {
                System.out.println("---Menu---");
                System.out.println("1. Thêm sinh viên: ");
                System.out.println("2. Sửa thông tin sinh viên theo id: ");
                System.out.println("3. Xóa một sinh viên theo id: ");
                System.out.println("4. Hiển thị tất cả các sinh viên: ");
                System.out.println("5. Hiển thị tất cả sinh viên theo Classroom: ");
                System.out.println("6. Hiển thị tất cả sinh viên + thông tin học lực dựa theo điểm trung bình");
                System.out.println("7. Hiển thị tất cả sinh viên có điểm: 1 - Cao nhất, 2 - Thấp nhất");
                System.out.println("8. Tìm kiếm sinh viên theo tên gần đúng");
                System.out.println("9. Hiển thị tất cả sinh viên theo giới tính");
                System.out.println("10. Classroom");
                System.out.println("0. Thoát ");
                System.out.println("9.----------------------------------------------");

                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentManager.createStudent();
                        break;
                    case 2:
                        studentManager.updateStudent();
                        break;
                    case 3:
                        studentManager.deleteStudent();
                        break;
                    case 4:
                        studentManager.displayAll();
                        break;
                    case 5:
                        studentManager.displayClassroom() ;

                        break;
                    case 6:
                        studentManager.displayAllAvgPoint();

                        break;
                    case 7:
                        break;
                    case 8:
                        studentManager.displayAllClassroom();

                        break;
                    case 9:
                        studentManager.displayGender();
                        break;
                    case 10:
                        studentManager.createClassroom();
                        break;
                    case 0:
                        System.exit(0);
                }

            } while (true);
        }

    }

