package chaoter7;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("նարմւծեք ուսանողի տվըալները");
        System.out.println("ներմւծեք ուսանողների քանակը");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("անուն:");
            String name = scanner.nextLine();
            System.out.println("ազգանուն:");
            String surname = scanner.nextLine();
            System.out.println("տարիք:");
            String age = scanner.nextLine();
            System.out.println("համար:");
            String phone = scanner.nextLine();
            Student student = new Student();
            student.setName(name);
            student.setSurname(surname);
            student.setAge(Integer.parseInt(age));
            student.setPhone(phone);
            System.out.println(student);
        }

    }
}
