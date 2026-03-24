package prac;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        //앞에 공백 있이 오름차순으로 별 출력하기

        //코드 작성하기
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 줄 개수 입력: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
        /* [실행 결과 예시]
        출력할 줄 개수 입력: 5
            *
           **
          ***
         ****
        *****
         */
    }
}
