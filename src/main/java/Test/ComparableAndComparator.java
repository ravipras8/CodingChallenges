package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"abc",20);
        Student s2 = new Student(2,"def",50);
        Student s3 = new Student(3,"abbc",30);
        Student s4 = new Student(4,"aabc",30);
        list.add(s1);list.add(s2);list.add(s3);list.add(s4);
        // Collections.sort(list, (l1,l2)-> l2.score.compareTo(l1.score)==0? l1.name.compareTo(l2.name): l2.score.compareTo(l1.score));
        // Collections.sort(list, new Comparator<Student>() {
        //     public int compare(Student st1, Student st2){
        //         if(st2.score > st1.score){
        //             return 1;
        //         }else if(st2.score == st1.score){
        //             return st1.name.compareTo(st2.name);
        //         }

        //         return -1;
        //     }
        // });
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}

class Student implements Comparable{
    Integer id;
    String name;
    Integer score;

    public Student(){}
    public Student(Integer id, String name, Integer score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return this.id + ":"+this.name+":"+this.score;
    }
    
    public int compareTo(Object o){
        Student st =(Student) o;
        return st.score.compareTo(this.score) == 0? this.name.compareTo(st.name):st.score.compareTo(this.score) ;
    }
}