public class Teacher extends Person {
    private int numCourses=0;
    private String[] courses = new String[3];

    public Teacher() {
    }

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + super.getName() + ", address=" + super.getAddress() + '}';
    }

    public boolean addCourse(String course){
        for(String s: courses){
            if(s!=null && s.equals(course))
                return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course){
        int count = 0;
        for(String s: courses){
            if(s!=null && s.equals(course)){
                courses[count] = null;

                for (int i = count; i < numCourses-1; i++){
                    courses[i] = courses[i+1];
                }

                numCourses--;
                return true;
            }
            count++;
        }
        return false;
    }

    public void printCourse(){
        for(String s: courses){
            System.out.print(s + " ");
            System.out.println();
        }
    }
}
