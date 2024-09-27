import java.util.*;
public class FindMax_Value {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of the Array ");
        int size =sc.nextInt();
        int arr[]= new int[size];

        System.out.println("enter element one by one ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        /**  print all Array Element */

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        /**Find the max value in the Array */
        int max=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println();
        System.out.println("===================");
        System.out.println("Max Value :"+max);
    }

    
}
