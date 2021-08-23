class calculator{
    int A,B;
    calculator(int a,int b) {
        A = a;
        B = b;
    }
    void add(){
        System.out.println(A+B);
    }
    void subtract(){
        System.out.println(A-B);
    }
    void multiply(){
        System.out.println(A*B);
    }
    void divide(){
        if(B==0){
            System.out.println("Division with 0 not possible");
        }
        else{
            System.out.println(A/B);
        }
    }
    void modulo(){
        if(B==0){
            System.out.println("Modulo with 0 not possible");
        }
        else{
            System.out.println(A%B);
        }
    }
    void and(){
        System.out.println(A&B);
    }
    void or(){
        System.out.println(A|B);
    }
    void not(){
        System.out.println(~A);
        System.out.println(~B);
    }
}
public class Question1 {
    public static void main(String[] args) {
        calculator c=new calculator(25,8);
        c.add();
        c.subtract();
        c.multiply();
        c.divide();
        c.modulo();
        c.add();
        c.or();
        c.not();
    }
}
