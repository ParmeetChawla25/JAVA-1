public class Question5b {
    static void max(int a,int b,int c,int d){
        int x = 0;
        int arr[]={a,b,c,d};
        for(int i=0;i<3;i++){
            x=arr[i]>arr[i+1]?arr[i] :arr[i+1];
        }
        System.out.println("The maximum number is: "+x);
    }
    static void min(int a,int b,int c,int d){
        int y=0;
        int arr[]={a,b,c,d};
        for(int i=0;i<3;i++){
            y=arr[i]<arr[i+1]?arr[i]:arr[i+1];
        }
        System.out.println("The minimum number is "+y);
    }
    public static void main(String[] args) {
	   max(56,77,89,124);
	   min(23,45,0,34);
    }
}
