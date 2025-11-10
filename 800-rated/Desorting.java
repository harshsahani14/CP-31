import java.util.Scanner;

public class Desorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
    
        while(t-->0){
            
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            int minDiff = Integer.MAX_VALUE;
            arr[0] = sc.nextInt();
            
            
            for(int i=1;i<n;i++){
                arr[i] = sc.nextInt();
                
                minDiff = Math.min(minDiff, arr[i]-arr[i-1] );
            }            
            
            if(minDiff<0){
                System.out.println(0);
            }
            else{
                minDiff = minDiff/2 ;
                System.out.println(++minDiff);
            }
            
        }

        sc.close();
    }
}
