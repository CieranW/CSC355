import java.util.Scanner;

public class SumNum {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int initNum = sc.nextInt();
    int sum = 0;

    SumNum obj = new SumNum();
    sum = obj.sumNum(initNum);
    System.out.println("The sum of the numbers from 1 to " + initNum + " is: " + sum);

}

public int sumNum(int num) {
    if (num == 0) {
        return 0;
    } else {
        return num + sumNum(num - 1);
    }
}
}