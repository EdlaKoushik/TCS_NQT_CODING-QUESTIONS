import java.util.*;
public class ProductOfDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().trim();
        long product=1;
        if(s.equals("0") ||s.isEmpty()){
            System.out.println(0);
            return;
        }
        
        for(char c:s.toCharArray()){
            product*=(c-'0');
            if(product==0)break;
        }
        System.out.println(product);
    }
}