/**
 * Created by yzs on 17-4-29.
 */
import java.util.Arrays;
class Student {
    private String name;
    private int id;
    public Student(String name){
        this.name = name;
        this.id = 0;
    }
    public String getName(){
        return name;
    }
    public <T>boolean setID(T id){
        if(id instanceof String || id instanceof Integer || id instanceof Long){
            int t = Integer.parseInt(id.toString());
            if(t > 0) {
                this.id = t;
                return true;
            }
        }
        return false;
    }
    public int getID(){
        return id;
    }
    public boolean equals(Student a){
        if(a.getName() == this.name)
            return true;
        return false;
    }
}
public class HW3Q11500012804{
    public static void main(String args[]){
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student cathy = new Student("Cathy");
        Student david = new Student("David");
        Student alice2 = new Student("Alice");
        Student stu_list[] = {alice, bob, cathy, david};

        alice.setID(123);
        cathy.setID(321);
        System.out.println(alice.equals(alice2));
        Arrays.sort(stu_list, (a, b)->{
            int cmp;
            cmp = a.getID() - b.getID();
            if(a.getID() == b.getID()) {
                cmp = a.getName().compareTo(b.getName());
            }
            return cmp;
        }
        );
    }

}