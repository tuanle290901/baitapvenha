package bai_tap_ve_nha;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements Manage {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Classroom> classrooms = new ArrayList<Classroom>();
    ArrayList<Gender> genders = new ArrayList<Gender>();


    public void addGender() {
        Gender gender1 = new Gender(1, "Nam");
        Gender gender2 = new Gender(2, "Nữ");
        Gender gender3 = new Gender(3, "Gay");
        genders.add(gender1);
        genders.add(gender2);
        genders.add(gender3);

    }


    public void addClassroom() {
        Classroom classroom1 = new Classroom(1, "CodeGym Mỹ Đình");
        Classroom classroom2 = new Classroom(2, "CodeGym Thanh Xuân");
        classrooms.add(classroom1);
        classrooms.add(classroom2);

    }
    public void createClassroom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập id của classroom: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập tên của classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(id, name);
        classrooms.add(classroom);
    }

    public void displayAllClassroom(){
        for (int i = 0; i < classrooms.size(); i++) {
            int id  = classrooms.get(i).getId();
            String name = classrooms.get(i).getName();
            System.out.println(" id: " + id + " name: " + name);
        }

    }



    public void addStudents() {
        Student student1 = new Student(1, "tuan", 23, 1, 5, 1);
        Student student2 = new Student(2, "thai", 25, 2, 6, 2);
        Student student3 = new Student(3, "dung", 20, 3, 7, 1);
        Student student4 = new Student(4, "duong", 23, 2, 8, 2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    @Override
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 6 || age > 60) {
            System.out.println("Tuổi không hợp lệ.");
            return null;
        }
        System.out.println("Nhập giới tính sinh viên:");
        System.out.println("1. Nam ");
        System.out.println("2. Nữ ");
        System.out.println("3. Gay ");
        int gender = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm trung bình");
        int avgPoint = Integer.parseInt(scanner.nextLine());
        if (avgPoint < 0 || avgPoint > 10) {
            System.out.println("điểm không hợp lệ.");
            return null;
        }
        System.out.println("Nhập classroom sinh viên");
        System.out.println("1. CodeGym Mỹ Đình ");
        System.out.println("2. CodeGym Thanh Xuân ");
        int classRoom = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, age, gender, avgPoint, classRoom);
        students.add(student);
        System.out.println(student);
        return student;
    }

    @Override
    public Student updateStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Tìm kiếm ID sinh viên muốn sửa: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        boolean checkId = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == idUpdate) {
                checkId = true;
                System.out.println("Nhập id sinh viên: ");
                students.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập tên sinh viên: ");
                students.get(i).setName(scanner.nextLine());
                System.out.println("Nhập tuổi sinh viên: ");
                students.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                for (int j = 0; j < 3; j++) {
                    System.out.println("Nhập giới tính sinh viên:");
                    System.out.println("1. Nam ");
                    System.out.println("2. Nữ ");
                    System.out.println("3. Gay ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 3) {
                        students.get(i).setGender(choice);
                        break;
                    }
                }

                System.out.println("Nhập điểm trung bình");
                students.get(i).setAvgPoint(Integer.parseInt(scanner.nextLine()));
                for (int j = 0; j < 3; j++) {
                    System.out.println("Nhập classroom sinh viên");
                    System.out.println("1. CodeGym Mỹ Đình ");
                    System.out.println("2. CodeGym Thanh Xuân ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 2) {
                        students.get(i).setClassroom(choice);
                        break;
                    }
                }

                System.out.println("Bạn đã sửa thành công");

            }
            if (!checkId) {
                System.out.println("Không tìm thấy id khả dụng");
            }
        }
        return null;
    }

    @Override
    public Student deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tìm kiếm ID sinh viên muốn sửa: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (idUpdate == students.get(i).getId()) {
                students.remove(i);
            }

        }
        System.out.println("xóa thành công.");

        return null;
    }

    @Override
    public Student findStudent(int id) {

        return null;
    }


    @Override
    public void displayClassroom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập classroom muốn hiển thị");
        System.out.println("1. CodeGym Mỹ Đình ");
        System.out.println("2. CodeGym Thanh Xuân ");
        int classroom1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (classroom1 == students.get(i).getClassroom()) {
                int id = students.get(i).getId();
                String name = students.get(i).getName();
                int age = students.get(i).getAge();
                String nameGender = " ";
                for (Gender nameGenders : genders) {
                    if (nameGenders.getId() == students.get(i).getGender()) {
                        nameGender = nameGenders.getName();
                    }
                }
                int avgPoint = students.get(i).getAvgPoint();
                String classroomName = "";
                for (Classroom classroom : classrooms) {
                    if (classroom.getId() == students.get(i).getClassroom()) {
                        classroomName = classroom.getName();
                    }
                }
                System.out.println("id: " + id + ", Tên: " + name + ", tuổi: " + age + ", giới tính: " + nameGender +
                        ", điểm trung bình: " + avgPoint + ", Lớp: " + classroomName);
            }
        }

    }

    @Override

    public void displayGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập giới tính sinh viên muốn hiển thị");
        System.out.println("1. Nam ");
        System.out.println("2. Nữ ");
        System.out.println("3. Gay ");
        int gender = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (gender == students.get(i).getGender()) {
                int id = students.get(i).getId();
                String name = students.get(i).getName();
                int age = students.get(i).getAge();
                String nameGender = " ";
                for (Gender nameGenders : genders) {
                    if (nameGenders.getId() == students.get(i).getGender()) {
                        nameGender = nameGenders.getName();
                    }
                }
                int avgPoint = students.get(i).getAvgPoint();
                String classroomName = "";
                for (Classroom classroom : classrooms) {
                    if (classroom.getId() == students.get(i).getClassroom()) {
                        classroomName = classroom.getName();
                    }
                }
                System.out.println("id: " + id + ", Tên: " + name + ", tuổi: " + age + ", giới tính: " + nameGender +
                        ", điểm trung bình: " + avgPoint + ", Lớp: " + classroomName);
            }
        }
    }

    @Override
    public void displayAvgPointMaxMin(){




    }

    @Override
    public void displayAllAvgPoint() {
        for (int i = 0; i < students.size(); i++) {
            int id = students.get(i).getId();
            String name = students.get(i).getName();
            int age = students.get(i).getAge();
            String nameGender = " ";
            for (Gender nameGenders : genders) {
                if (nameGenders.getId() == students.get(i).getGender()) {
                    nameGender = nameGenders.getName();
                }
            }

            int avgPoint = students.get(i).getAvgPoint();
            String display;
            if (avgPoint > 8 && avgPoint < 10) {
                display = " Xếp loại Giỏi";
            } else if (avgPoint > 6) {
                display = " Xếp loại khá";
            } else if (avgPoint > 4.5) {
                display = " Xếp loại trung bình";
            } else {
                display = " Xếp loại kém ";

            }

            String classroomName = "";
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == students.get(i).getClassroom()) {
                    classroomName = classroom.getName();
                }
            }
            System.out.println("id: " + id + ", Tên: " + name + ", tuổi: " + age + ", giới tính: " + nameGender +
                    ", điểm trung bình: " + avgPoint + ", Học Lực: " + display + ", Lớp: " + classroomName);
        }

    }


    @Override
    public void displayAll() {
        for (int i = 0; i < students.size(); i++) {
            int id = students.get(i).getId();
            String name = students.get(i).getName();
            int age = students.get(i).getAge();
            String nameGender = " ";
            for (Gender nameGenders : genders) {
                if (nameGenders.getId() == students.get(i).getGender()) {
                    nameGender = nameGenders.getName();
                }
            }
            int avgPoint = students.get(i).getAvgPoint();
            String classroomName = "";
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == students.get(i).getClassroom()) {
                    classroomName = classroom.getName();
                }
            }
            System.out.println("id: " + id + ", Tên: " + name + ", tuổi: " + age + ", giới tính: " + nameGender +
                    ", điểm trung bình: " + avgPoint + ", Lớp: " + classroomName);
        }

    }

}
