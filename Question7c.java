class employee{
    int id;
    String name;
    float salary;
    employee(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class Question7c {
    public static void main(String[] args) {
        employee e1=new employee(101,"ajeet",45000);
        employee e2=new employee(102,"irfan",25000);
        employee e3=new employee(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
    }   
}
