import java.util.Scanner;

public class ForbiddenInteger{
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            
            if(x!=1){
                System.out.println("Yes");
                
                System.out.println(n);
                
                for(int i=0;i<n;i++){
                    System.out.print("1"+ " ");
                }
            }
            else{
                
                if( k==1 || ( k==2 && n%2!=0 ) ){
                    System.out.println("No");
                }
                else{
                    
                    System.out.println("Yes");
                    
                    if(n%2==0){
                        
                        System.out.println(n/2);
                        for(int i=0;i<n/2;i++){
                            System.out.println("2"+ " ");
                        }
                    
                    }
                    else{
                        System.out.println( (n-3)/2+1  );
                        for(int i=0;i<(n-3)/2;i++){
                            System.out.print("2"+ " ");
                        }
                        
                        System.out.print("3"+ " ");
                    }
                    
                }
                
            }
        }
        
        sc.close();
    }
}
