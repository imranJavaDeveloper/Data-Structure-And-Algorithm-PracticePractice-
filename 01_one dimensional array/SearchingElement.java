import java.util.*;
public class SearchingElement {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of the Array ");
        int size =sc.nextInt();

        int arr[]= new int[size];
        System.out.println("enter element one by one ");

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        /**Find the max value in the Array */

        System.out.println("enter number for search");
        int search=sc.nextInt();

        for (int i=0;i<arr.length;i++){

            if (arr[i]==search){
                System.out.println("element found at index :"+i);
                break;
            }


        }
    }

  
}
