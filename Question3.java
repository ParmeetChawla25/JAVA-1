class cuboid{
    int L,B,H;
    cuboid(int l,int b,int h){
        L=l;
        B=b;
        H=h;
    }
    int volume(){
        return L*B*H;
    }
}
class circle{
    int R;
    circle(int r){
        R=r;
    }
    double area(){
        return 3.14*R*R;
    }
}
class rectangle{
    int A,B;
    rectangle(int a,int b){
        A=a;
        B=b;
    }
    int area(){
        return A*B;
    }
}
public class Question3 {
    public static void main(String[] args) {
        cuboid c1=new cuboid(4,6,5);
        cuboid c2=new cuboid(7,8,10);
        cuboid c3=new cuboid(7,5,2);
        circle c=new circle(7);
        rectangle r=new rectangle(65,4);
         System.out.println(c1.volume());
         System.out.println(c2.volume());
         System.out.println(c3.volume());
         System.out.println(c.area());
         System.out.println(r.area());
     }
}
