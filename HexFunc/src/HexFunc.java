public class HexFunc {
    
    static int raw_convert(int n, int[] num) {
        int length, rem;
        length = 0;
        if (n == 0) {
            num[0] = 0;
        } else {
            while (n > 0) {
                rem = n % 16;
                num[length] = rem;
                length++;
                n = n / 16;
            }
            length--;
        }
        return length;
        
    }

    static void print_hex(int k, int[] ans) {
        // print array
        int temp;
        System.out.printf("Your number in hexadecimal is: ");
        while (k >= 0) {
            temp = ans[k];
            if (temp == 10) {
                System.out.printf("A");
            } else if (temp == 11) {
                System.out.printf("B");
            } else if (temp == 12) {
                System.out.printf("C");
            } else if (temp == 13) {
                System.out.printf("D");
            } else if (temp == 14) {
                System.out.printf("E");
            } else if (temp == 15) {
                System.out.printf("F");
            } else {
                System.out.printf("%d", temp);
            }
            k--;
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int n;
        int k;
        int[] ans = new int[100];

        System.out.printf("Type in a non-negative integer in base 10 decimal:  \n");
        n = StdIn.readInt();

        k = raw_convert(n, ans);
        print_hex(k, ans);
    }

}