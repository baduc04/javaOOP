import java.util.Scanner;

public class Slide90 {
  public static void main(String[] args) {
    String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao chuoi ky tu bat ky: ");
    chuoi = scanner.nextLine();
    System.out.println("Cac ky tu co trong chuoi la : ");
    for (int i = 0; i < chuoi.length(); i++) {
      kyTu = chuoi.charAt(i);
      System.out.println(kyTu);
    }
  }
}