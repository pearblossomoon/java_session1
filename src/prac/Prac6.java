package prac;

import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        //입력할 숫자의 개수를 입력받고, 해당 숫자만큼 수를 입력하여 입력한 정수의 합계와 평균을 구하자.
        //합계와 평균을 구하는 메서드를 만들어서 해보자. (하단 sum, avg 메서드를 완성해서)

        //코드 작성
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 숫자 개수: ");
        int num = scanner.nextInt();

        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }

        int sum_num = sum(nums);
        double avg_num = avg(nums, sum_num);

        System.out.println("입력한 숫자 합계: " + sum_num);
        System.out.println("입력한 숫자 평균: " + avg_num);

        scanner.close();
        /* [실행 결과 예시]
        입력할 숫자 개수: 4
        1
        2
        3
        4
        입력한 숫자 합계: 10
        입력한 숫자 평균: 2.5
         */
    }
    public static int sum(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            temp += num;
        }
        return temp;
    }

    public static double avg(int[] nums, int sum) {
        return (double) sum / nums.length;
    }
}
