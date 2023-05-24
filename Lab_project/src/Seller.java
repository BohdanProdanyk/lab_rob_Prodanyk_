import java.util.Scanner;
public class Seller {
    private static void SellerPerson() {
        System.out.println("Продавець: Доброго дня, що ви хотіли б придбати?");
        System.out.println("1. Телефон;");
        System.out.println("2. Ноутбук;");
        System.out.println("3. Допоміжні засоби;");
        System.out.println("4. Вийти.");
    }
    private static void BuyerPerson() {
        System.out.println("Введіть особисті дані;");
    }
    public static void work(Buyer buyer){
        Scanner scanner = new Scanner(System.in);
        SellerPerson();
        int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Зараз на складі є такі телефони:");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Наразі цей продукт відсутній(");
                    break;
                case 4:
                    System.out.println("Наразі цей продукт відсутній(");
                    break;
                default:
                    System.out.println("Невірний вибір!");
                    break;
            }

    }
}