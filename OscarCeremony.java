import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double artifactPrice = rent * 0.70;
        double cateringPrice = artifactPrice * 0.85;
        double soundPrice = cateringPrice / 2;
        double totalPrice = rent + artifactPrice + cateringPrice + soundPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
