import java.util.Scanner;

public class NeedleInHaystackLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the haystack String:");
        String haystack = sc.nextLine();

        System.out.println("Enter the needle String:");
        String needle = sc.nextLine();

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Needle found at index: " + index);
        } else {
            System.out.println("Needle not found in haystack");
        }

        sc.close();
    }
}
