import java.util.Scanner;

public class Example_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /** Create String Array*/
        String [] name= new String[5];
        System.out.println("enter five name");

        for (int i=0;i<5;i++){
             name[i]=sc.nextLine();
        }

        /** print all Array element*/

        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
    
}
