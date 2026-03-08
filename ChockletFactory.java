import java.util.*;
public class ChockletFactory{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine().trim());
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(sc.nextLine().trim());
        }

        int j=0;
        for(int i=0;i<N;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
            while(j<N){
                arr[j]=0;
                j++;
            }
        for(int i=0;i<N;i++){
            if(i>0)System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}