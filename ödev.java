import java.util.Arrays;
import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] sayiDizisi = new int[boyut];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            sayiDizisi[i] = scanner.nextInt();
        }
        Arrays.sort(sayiDizisi);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(sayiDizisi));
    }
}
