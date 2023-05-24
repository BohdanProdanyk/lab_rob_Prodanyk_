import java.util.Scanner;
public class Buyer {
    private String fname; private String lname;
    private long number; private int old; private double many;
    private String email; private String city; private int mail;

    public void Registration(){
        System.out.println("Будь ласка, зареєструйте користувача!");
        System.out.print("Ім'я: ");
        Scanner scanner = new Scanner(System.in);
        this.setFname(scanner.nextLine());

        System.out.print("Прізвище: ");
        this.setLname(scanner.nextLine());

        System.out.print("Вік: ");
        this.setOld(scanner.nextInt());

        System.out.print("Сума грошей у гаманці: ");
        this.setMany(scanner.nextDouble());

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public double getMany() {
        return many;
    }

    public void setMany(double many) {
        this.many = many;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {this.city = city;}
    public void setMail(int mail) {this.mail = mail;}
    public int getMail() {
        return mail;
    }
}

class ToIssue extends Buyer{
    public void ToIssueOrder() {
        System.out.println("Введіть ваші особисті дані:");
        System.out.print("Електронна пошта: ");
        Scanner scanner = new Scanner(System.in);
        this.setEmail(scanner.nextLine());

        System.out.print("Місто: ");
        this.setCity(scanner.nextLine());

        System.out.print("Номер телефону: ");
        this.setNumber(scanner.nextLong());

        System.out.print("Відділення нової пошти: ");
        this.setMail(scanner.nextInt());
    }
}