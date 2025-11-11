import java.util.Scanner;

public class UnitArray{
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            
            int n = sc.nextInt();
            
            int pos = 0;
            int neg = 0;
            
            
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                
                if(curr==1) pos++;
                else neg++;
            }
            
            int ops = 0;
            
            while( pos<neg || neg%2!=0 ){
                pos++;
                neg--;
                ops++;
            }
            
            System.out.println(ops);
        }
        sc.close();
    }
    
    
}
