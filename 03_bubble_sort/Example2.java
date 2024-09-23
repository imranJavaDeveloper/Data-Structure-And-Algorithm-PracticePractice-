
public class Example2 {
    /**create a method for take input array and print */
    public static void takeArray(int arr[]){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[]={78,64,65,25,88,44};

         /** Bubble sort sorting with Ascending oder */

         for (int i=0;i<arr.length;i++){

             for (int j=0;j<arr.length-1;j++){

                 if (arr[j]>arr[j+1]){

                     int temp =arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
         /** call the function and pass the arr as argument*/

        takeArray(arr);
    }
}
