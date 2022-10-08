//Answer to exercise 24 A
public class Q24A {
    
    public static String gauss(int n){
        int total = 1; 
        
        for(int i = 2; i<=n;i++){
            total+=i;
        }
        
        return "Total: " + total;
        
    }
    //Test test 
}
