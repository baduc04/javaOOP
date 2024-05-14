
import java.util.ArrayList;
import java.util.Scanner;

public class Max {
  public static void main(String[] args) {
    ArrayList<Integer> arrayListiIntegers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int number;
    System.out.println("nhap so phan tu cua arraylist ");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("nhap phan tu thu " + i + "=");
      n = sc.nextInt();
      arrayListiIntegers.add(n);
    }
    int Max = arrayListiIntegers.get(0);

    for (int i = 1; i < arrayListiIntegers.size(); i++) {
      if (arrayListiIntegers.get(i).compareTo(Max) > 0) {
        Max = arrayListiIntegers.get(i);
      }
    }
    System.out.println("phan tu lon nhat trong arraylist =" + Max);

  }
}
