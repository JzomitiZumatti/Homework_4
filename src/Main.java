import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String:");
        String s = scanner.nextLine();
        System.out.println("Enter second String:");
        String t = scanner.nextLine();

        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);

        System.out.println(result);
    }
}
