class slide74 (public class TinhTongSoChan {
  public static void main(String[] args) {
      int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int tong = 0;
      
      for (int i = 0; i < mang.length; i++) {
          if (mang[i] % 2 == 0) {
              tong += mang[i];
          }
      }
      
      System.out.println("Tổng các số chẵn trong mảng là: " + tong);
  }
}

)