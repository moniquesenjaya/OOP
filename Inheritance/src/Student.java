public class Student extends Person {
    private int numCourses=0;
    private String[] courses = new String[3];
    private int[] grades = new int[3];

    public Student() {
    }

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + super.getName() + ", address=" + super.getAddress() + '}';
    }

    public void addCourseGrade(String course, int grade){
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }
    }

    public double getAverageGrade(){
        double ave = 0;
        double sum = 0;
        for(int i =0;i<grades.length;i++){
            sum += grades[i];
        }
        return sum/grades.length;
    }
}

