package educationCenter;

import educationCenter.exception.DuplicateLessonException;
import educationCenter.model.Lesson;
import educationCenter.model.Student;
import educationCenter.storage.LessonStorage;
import educationCenter.storage.StudentStorage;

import java.util.Scanner;

public class EducationCenterMain implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static LessonStorage lessonStorage = new LessonStorage();
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Please input number ! ");
                command = -1;
            }
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessons();
                    break;
                case PRINT_STUDENTS_BY_LESSON_NAME:
                    printStudentsByLessonName();
                    break;
                default:
                    System.out.println(" Wrong command ! ");
            }
        }
    }

    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println(" Please add lesson first: ");
            return;
        }
        try {
            Lesson[] lessons = chooseLessons();
            if (lessons.length > 0) {
                System.out.println(" Please input Student data: name,surname,phone,email");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(",");
                Student byEmail = studentStorage.getByEmail(studentData[3]);
                if (byEmail != null) {
                    System.out.println(" Duplicate Student ! ");
                    addStudent();
                } else {
                    Student student = new Student();
                    student.setName(studentData[0]);
                    student.setSurname(studentData[1]);
                    student.setPhone(studentData[2]);
                    student.setEmail(studentData[3]);
                    student.setLessons(lessons);
                    studentStorage.add(student);
                    System.out.println(" Thank you, Student was added ");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Invalid Data! please try again ");
            addStudent();
        }

    }

    private static void addLesson() {
        System.out.println("Please input Lesson data: name, lecturerName, duration, price");
        try {
            String lessonDataStr = scanner.nextLine();
            String[] lessonData = lessonDataStr.split(",");
            Lesson lesson = new Lesson();
            lesson.setName(lessonData[0]);
            lesson.setLecturerName(lessonData[1]);
            lesson.setDuration(Integer.parseInt(lessonData[2]));
            lesson.setPrice(Double.parseDouble(lessonData[3]));
            lessonStorage.add(lesson);
            System.out.println("Lesson was added!");

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Incorrect value! Please try again");
            addLesson();
        } catch (DuplicateLessonException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void changeStudentLessons() {
        System.out.println("Please input Student email");
        String studentName = scanner.nextLine();
        Student student = studentStorage.getByEmail(studentName);
        if (student == null) {
            System.out.println("Wrong name!");
            changeStudentLessons();
        } else {
            Lesson[] lessons = chooseLessons();
            if (lessons.length > 0) {
                student.setLessons(lessons);
                System.out.println("Student lessons are changed!");
            }

        }
    }


    private static void printStudentsByLessonName() {
        String lessonName = scanner.nextLine();
        Lesson byName = lessonStorage.getByName(lessonName);
        if (byName == null) {
            System.out.println("Wrong lesson Name!");
            printStudentsByLessonName();
        } else {
            studentStorage.printByLesson(byName);
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + CHANGE_STUDENT_LESSON + " for CHANGE_STUDENT_LESSON");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON_NAME + " for PRINT_STUDENTS_BY_LESSON_NAME");
    }

    private static Lesson[] chooseLessons() {
        System.out.println("Please choose Lessons from list");
        lessonStorage.print();
        String lessonsStr = scanner.nextLine();
        String[] lessonNames = lessonsStr.split(",");
        Lesson[] lessons = new Lesson[lessonNames.length];
        int i = 0;
        for (String lessonName : lessonNames) {
            Lesson byName = lessonStorage.getByName(lessonName);
            if (byName != null) {
                lessons[i++] = byName;
            }
        }
        return lessons;
    }

}
