package Homework;

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalSum = 0;

        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        totalSum = totalSum + num1;
        System.out.println("현재까지 입력된 정수들의 합: " + totalSum);

        System.out.print("정수를 입력하세요: \n");
        int num2 = sc.nextInt();
        totalSum = totalSum + num2;
        System.out.println("현재까지 입력된 정수들의 합: " + totalSum);

        System.out.print("정수를 입력하세요: \n");
        int num3 = sc.nextInt();
        totalSum = totalSum + num3;
        System.out.println("현재까지 입력된 정수들의 합: " + totalSum);

        System.out.print("정수를 입력하세요: \n");
        int num4 = sc.nextInt();
        totalSum = totalSum + num4;
        System.out.println("현재까지 입력된 정수들의 합: " + totalSum);

        System.out.print("정수를 입력하세요: \n");
        int num5 = sc.nextInt();
        totalSum = totalSum + num5;
        System.out.println("현재까지 입력된 정수들의 합: " + totalSum);
    }
}
