import java.util.ArrayList;

public class ObjectsArraylist {
    public static void main(String[] args) {
        Student s1 = new Student(822,"hanson",23);
        Student s2 = new Student(823,"kibet",34);
        Student s3 = new Student(824,"sang",38);
        ArrayList<Student> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        System.out.println("list of all students in the list");
        for (Student k : stud){
            System.out.println(k);
        }


    }
    static class Student{
        int regNo;
        String name;
        int age;

        public Student(int regNo, String name, int age) {
            this.regNo = regNo;
            this.name = name;
            this.age = age;
        }

        public int getRegNo() {
            return regNo;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Name:\t" +getName()+
                    "\tregNo:" +getRegNo()+
                    "\tAge:" +getAge();
        }
    }
}
