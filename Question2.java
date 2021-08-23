class add2{
    int A,B;
    add2(int a,int b){
        A=a;
        B=b;
    }
    int add(){
        return  A+B;
    }
}
class add3{
    int X,Y,Z;
    add3(int x,int y,int z){
        X=x;
        Y=y;
        Z=z;
    }
    int add(){
        return  X+Y+Z;
    }
}
class add4{
    int C,D,E,F;
    add4(int c,int d,int e,int f){
        C=c;
        D=d;
        E=e;
        F=f;
    }
    int add(){
        return C+D+E+F;
    }
}
public class Question2 {
    public static void main(String[] args) {
        // write your code here
            add2 a1=new add2(5,78);
            add3 a2=new add3(99,1,34);
            add4 a3=new add4(56,78,125,67);
            System.out.println(a1.add());
            System.out.println(a2.add());
            System.out.println(a3.add());
        }
}
