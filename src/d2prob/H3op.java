package d2prob;
import java.util.Scanner;
/*
ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
*/
public class H3op {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n번째 알파벳 : " + (char)(64 + n));
    }
}