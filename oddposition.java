import java.util.*;
public class oddposition
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        
       for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
           if(i%2!=0){
           arr[i]=0;
       }
       else{
           continue;
       }
       }
       System.out.println(Arrays.toString(arr));
	}
}
