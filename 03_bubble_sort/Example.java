import java.util.*;
public class Example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int size=sc.nextInt();

        int arr[]= new int[size];

        System.out.println("enter the element one by one");
        for (int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }

        /**sort the Array using the bubble short*/

        for (int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){

                if (arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        /**print all Array element in ascending oder sorting*/
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
