import java.util.Scanner;

public class demo {

    private static Scanner sc;

    public static void main(String[] args) {

        int i, Number, Minimum, Maximum,Sum = 0;
        sc = new Scanner(System.in);

        System.out.println("33550300");
        Minimum = sc.nextInt();

        System.out.println("33550400");
        Maximum = sc.nextInt();

        for(Number = Minimum; Number <=Maximum; Number++){
            for(i = 1, Sum =0; i < Number; i++)  {
                if(Number % i == 0){
                    Sum = Sum + i;
                }
            }
            if (Sum==Number)  {
                System.out.format("%d \t", Number);
            }
        }
    }
}
// write your code here


