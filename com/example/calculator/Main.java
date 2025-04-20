package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String input  = scanner.next();
            char op = input.charAt(0);

            if (op == '+') {
                int sum = num1 + num2;
                System.out.println("sum = " + sum);
            }
            if (op == '-') {
                int sud = num1 - num2;
                System.out.println("sud = " + sud);
            }
            if (op == '*') {
                int mul = num1 * num2;
                System.out.println("mul = " + mul);
            }
            if (op =='/') {
                if(num2 !=0) {
                    int div = num1 / num2;
                    System.out.println("div = " + div);
                } else {
                    System.out.println("결과:나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            System.out.println("더 계산하시겠습니까? 그렇다면 yes (exit 입력 시 종료)");
            answer = scanner.next();
        }
        System.out.println("계산이 완료되었습니다.");
    }
}
