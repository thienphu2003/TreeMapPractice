import java.util.Scanner;
public class TreeMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào một chuỗi bất kì để thử : ");
        String string =sc.nextLine();
        char[] arr = string.toCharArray();
        TreeMapPractice tree = new TreeMapPractice();
        System.out.println(arr);
        for(int i=0;i<arr.length;i++)
        {
            tree.add(arr[i]);
        }
        tree.show();

    }
}
