

public class Example1 {
    public static void main(String[] args) {

        int arr[]={4,6,5,8,7,9};

        for (int i=0;i<arr.length;i++){

             int smallest=i;
            for (int j=i+1;j<arr.length;j++){

                if (arr[smallest]>arr[j]){
                    int temp = arr[smallest];
                    arr[smallest]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        /**print all element with accending oder sorting  */
          for (int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }


        System.out.println("thank you");
    }
}

