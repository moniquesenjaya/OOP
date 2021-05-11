public class Driver {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Rezza");
        s1.setAddress("Binus");

        System.out.println(s1.getName() + " " + s1.getAddress());

        s1.addCourseGrade("OOP", 90);
        s1.addCourseGrade("Math", 50);
        s1.addCourseGrade("DS", 50);

        s1.printGrades();

        System.out.println(s1.getAverageGrade());

        Teacher t1 = new Teacher();

        t1.setName("Any");
        t1.setAddress("Binus");

        if (t1.addCourse("OOP")) {
            System.out.println("Course added");
        } else {
            System.out.println("Course already exists");
        }

        if (t1.addCourse("DS")) {
            System.out.println("Course added");
        } else {
            System.out.println("Course already exists");
        }

        if (t1.addCourse("OOP")) {
            System.out.println("Course added");
        } else {
            System.out.println("Course already exists");
        }

        if (t1.addCourse("Math")) {
            System.out.println("Course added");
        } else {
            System.out.println("Course already exists");
        }

        if (t1.removeCourse("Math")) {
            System.out.println("Course removed");
        } else {
            System.out.println("Course doesn't exist");
        }

        if (t1.removeCourse("English")) {
            System.out.println("Course removed");
        } else {
            System.out.println("Course doesn't exist");
        }

        t1.printCourse();

        if (t1.addCourse("Aceng")) {
            System.out.println("Course added");
        } else {
            System.out.println("Course already exists");
        }

        t1.printCourse();
    }
}
