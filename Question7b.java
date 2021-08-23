class student{
    int ID;
    String N;
    student(int id,String name){
        ID=id;
        N=name;
    }
    void display(){
        System.out.println("The ID of the student is "+ID);
        System.out.println("The name of the student is "+N);
    }
}
public class Question7b {
    public static void main(String[] args) {
        student s=new student(15,"Parmeet");
        s.display();
    } 
}
