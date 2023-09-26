
import java.util.InputMismatchException;
import java.util.Scanner;

public class Money_HW2 {

    public static void main(String[] args) {
        int s = 1;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 현금 단위

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Price (Won) : ");
            double won = scanner.nextDouble();

            // Check if the input is a decimal number (not an integer)
            if (won % 1 != 0) {
                System.out.println("Unexpected input. Enter the amount of natural numbers.");
                s = 0;
            } else {
                // 각 현금 단위의 개수 계산
                int[] numberOfUnits = new int[unit.length]; // 각 현금 단위의 개수를 저장할 배열 생성
                double remainingAmount = won; // 입력된 금액을 remainingAmount로 초기화

                for (int i = 0; i < unit.length; i++) {
                    // 현재 현금 단위의 개수 계산
                    numberOfUnits[i] = (int) (remainingAmount / unit[i]);

                    // 현재 현금 단위의 개수를 곱한 값을 remainingAmount에서 빼서 남은 금액 업데이트
                    remainingAmount %= unit[i];
                }

                if (won <= 0) {
                    System.out.println("Unexpected input. Enter the amount larger than 0 won.");
                    s = 0;
                }

                // 결과 출력
                if (s == 1) {
                	System.out.println();
                    System.out.println("OutPut");
                    System.out.println();
                    System.out.println("input price(won) :"+(int)won);
                    System.out.println();
                    for (int i = 0; i < unit.length; i++) {
                        if (numberOfUnits[i] > 0) {
                            System.out.println(unit[i] + " : " + numberOfUnits[i]);
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Unexpected input. Please enter a valid numeric amount.");
        } finally {
            scanner.close();
        }
    }
}
