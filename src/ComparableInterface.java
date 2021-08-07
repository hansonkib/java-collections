import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        list.add(new Student(678,"hanson",23));
        list.add(new Student(656,"kibet",562));
        list.add(new Student(48,"sang",24));
        list.add(new Student(48,"Albert",24));
//        using collections to sort
        Collections.sort(list);
        System.out.println("Sorted list of students using collection sort method");
        for (Student k : list){
            System.out.println(k);
        }

    }
    static class Student implements Comparable<Student>{
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
        public int compareTo(Student student) {
            if (regNo == student.regNo){
                return 0;
            }
            else if (regNo< student.regNo){
                return 1;
            }
            else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "RegNo: " +getRegNo()+
                    "\tName: " +getName()+
                    "\tAge: " +getAge();
        }
    }
}
