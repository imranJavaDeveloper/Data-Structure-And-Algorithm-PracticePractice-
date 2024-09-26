public class Example_03 {

    public static void main(String[] args) {

        /** create float Array*/

        float arr[]= new float[5];
         arr[0]=45;
         arr[1]=65;
         arr[2]=89;
         arr[3]=36;
         arr[4]=78;

         /**print all Array element using the for loop*/

         for (int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }


         /**print Array using the  for each loop*/

         for (float x: arr){
             System.out.println(x);
         }

    }
    
}
