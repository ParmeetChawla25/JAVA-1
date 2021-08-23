public class Question5 {
    static int max(int a,int b,int c,int d){
        int arr[]={a,b,c,d};
        int x=arr[0];
        for(int i=0;i<4;i++){
            if(x<arr[i]){
                x=arr[i];
            }
        }
        return x;
    }
    static int min(int a,int b,int c,int d){
        int arr[]={a,b,c,d};
        int y=arr[0];
        for(int i=0;i<4;i++){
            if(y>arr[i]){
                y=arr[i];
            }
        }
        return y;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Maximum among the given numbers is:");
        System.out.println(max(88,99,3,42));
        System.out.println("Minimum among the given numbers is:");
        System.out.println(min(56,77,23,12));
    } 
}
