public class FindThe_Max {

    /** create a function and print max of the Array */

    public void max(){
        int arr[] ={45,65,78,21,5,4,988};

        int max=0;

        for (int i=0;i<arr.length;i++){

            if (arr[i] > max){
                max=arr[i];
            }
        }

        System.out.println("Max :"+max);
    }
    public static void main(String[] args) {

        FindThe_Max obj= new FindThe_Max();
           obj.max();
    }
    
}
