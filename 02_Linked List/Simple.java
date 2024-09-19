package LinkedList;

public class Simple {

    public static   class Node{
        int data; // value
        Node next; // next

        public Node(int data){
              this.data=data;
        }

    }
    public static void main(String[] args) {

         /**create five nodes */

        Node a= new Node(5);
        Node b= new Node(11);
        Node c= new Node(45);
        Node d= new Node(65);
        Node e= new Node(89);

    /** connect one node and other node*/
          a.next=b;
          b.next=c;
          c.next=d;
          d.next=e;


       /**print first node data*/
        System.out.println(a.data); // 5
        System.out.println(a.next); // print Address of next node(b)
        System.out.println(a.next.data); // it will give value of the b(11)
        System.out.println("=====================================");

        /** print second node*/
        System.out.println(b.data); // 11
        System.out.println(b.next); // print Address of next node(c)
        System.out.println(b.next.data); // 45
        System.out.println("=====================================");


        /** print the third node */
        System.out.println(c.data); // 45
        System.out.println(c.next); // print Address of next node(d)
        System.out.println(c.next.data); // 65
        System.out.println("=====================================");


        /** print four node */
        System.out.println(d.data); //65
        System.out.println(d.next); // print Address of next node(e)
        System.out.println(d.next.data); // 89
        System.out.println("=====================================");


        /**print five node */
        System.out.println(e.data); //89
        System.out.println(e.next);// null
        System.out.println("=====================================");


    }

}
