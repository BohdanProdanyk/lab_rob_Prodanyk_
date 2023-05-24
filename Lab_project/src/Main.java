import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Phone z = new Phone("IPhone 14 Pro Max", "Purple", 50999, 1024, 160.7, 77.6, 7.85);
        Phone x = new Phone("IPhone 13", "Blue", 31499, 512, 146.7, 71.5, 7.65);
        Phone c = new Phone("IPhone 11 Pro Max", "Midnight Green", 25919, 256, 144.0, 71.4, 8.1);
        OnlineShop z2 = new OnlineShop("Бабочка", "Чорновола 7", "Відкрито", 18.00);

        z2.toString();
        Buyer buyer = new Buyer();
        buyer.Registration();
        System.out.println("-------Ви увійшли в магазин-------");
        System.out.println("-------Оберіть ваші подальші дії: -------");
        System.out.println("1. Підійти до прилавка;");
        System.out.println("2. Прогулятися по магазину та оглянути товари;");
        System.out.println("3. Зробити сальтуху;");
        System.out.println("4. Вийти з магазину.");

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                Seller.work(buyer);
                break;
            case 2:
                System.out.println("*В розробці*");
                break;
            case 3:
                System.out.println("Ти молодець!");
                break;
            case 4:
                System.out.println("До побачення, гарного дня та заходьте ще!");
                break;
            default:
                System.out.println("Неправильна команда.");
                break;
        }
        System.out.println("1) " + z.model + " " + "2) " + x.model + " " + "3) " + c.model + " Оберіть(1/2/3)");
        int action1 = scanner.nextInt();
        switch (action1){
            case 1:
                System.out.println(z.model +" "+ z.color +" "+ z.memory +"MB");
                System.out.printf("Ціна: ");
                z.price_memory();
                break;
            case 2:
                System.out.println(x.model +" "+ x.color +" "+ x.memory +"MB");
                System.out.printf("Ціна: ");
                x.price_memory();
                break;
            case 3:
                System.out.println(c.model +" "+ c.color +" "+ c.memory +"MB");
                System.out.printf("Ціна: ");
                c.price_memory();
                break;
            case 4:
                System.out.println("До побачення, гарного дня та заходьте ще!");
                break;
            default:
                System.out.println("Неправильна команда.");
                break;
        }
        System.out.println("Продавець: Бажаєте оформити замовлення?");
        System.out.println("1. Так;");
        System.out.println("2. Ні;");
        System.out.println("3. Вийти.");
        ToIssue toIssue = new ToIssue();
        int action2 = scanner.nextInt();
        switch (action2) {
            case 1:
                toIssue.ToIssueOrder();
                break;
            case 2:

                break;
            case 3:
                System.out.println("До побачення, гарного дня та заходьте ще!");
                break;
            default:
                System.out.println("Неправильна команда.");
                break;
        }
        if(action1 == 1){
            buyer.setMany((buyer.getMany() - z.price));
            System.out.println("Дякуємо за замовлення!");
            System.out.println("Баланс: " + buyer.getMany() + "грн");
        }
        else if(action1 == 2){
            buyer.setMany((buyer.getMany() - x.price));
            System.out.println("Дякуємо за замовлення!");
            System.out.println("Баланс: " + buyer.getMany() + "грн");
        }
        else if(action1 == 3){
            buyer.setMany((buyer.getMany() - c.price));
            System.out.println("Дякуємо за замовлення!");
            System.out.println("Баланс: " + buyer.getMany() + "грн");
        }
        System.out.println("До речі площа телефону:"+ x.area());
    }
}