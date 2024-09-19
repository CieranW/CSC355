import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int initNum = sc.nextInt();
        int lastNum = sc.nextInt();
        OddEven obj = new OddEven();
        obj.oddEven(initNum, lastNum);
    }

    public void oddEven(int firstNum, int lastNum) {
        if (firstNum > lastNum) {
            return;
        } else {
            if (firstNum % 2 == 0) {
                System.out.println(firstNum + " is even");
            } else {
                System.out.println(firstNum + " is odd");
            }
            oddEven(firstNum + 1, lastNum);
        }
    }
}