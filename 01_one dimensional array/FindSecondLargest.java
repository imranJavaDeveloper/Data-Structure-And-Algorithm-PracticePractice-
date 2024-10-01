public class FindSecondLargest {
    static int findSecondLargest(int a[], int n) {
        /*
        First, sort the array and find the first_largest element present in the array (at the last position).
        */
        Arrays.sort(a);
        /*
        Now for the second_largest element, we need to start from second last element as the largest element is at last.
        */
        int second_largest = 0;
        for (int i = n - 2; i >= 0; i--)
        {
            /*
            If the last and second last element are equal then check the previous one else return the second last element.
            */
            if (a[i] != a[n - 1])
            {
                second_largest = a[i];
                break;
            }
        }

        return second_largest;
    }
    public static void main(String[] args) {
        int a[] = { 12, 35, 1, 10, 34, 1 };
        int n = a.length;

        int answer = findSecondLargest(a, n);

        System.out.println("The second largest element in the array is: " + answer);
    }
}
