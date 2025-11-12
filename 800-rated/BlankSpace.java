import java.util.Scanner;

public class BlankSpace{
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            
            int n = sc.nextInt();
            
            int currCons = 0;
            int maxCons = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                
                int curr = sc.nextInt();
                
                if(curr == 1){
                    currCons = 0;
                } 
                else{
                    currCons++;
                }
                
                maxCons = Math.max(maxCons,currCons);
            }
            
            System.out.println(maxCons);
        }
    }
}
