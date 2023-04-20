package bai_tap_ve_nha;

public interface Manage<E> {

    E createStudent();
    E updateStudent();
    E deleteStudent();
    E findStudent(int id);

    void displayClassroom();

    void displayGender();

    void displayAvgPointMaxMin();

    void displayAllAvgPoint();

    void displayAll();


}