public class OnlineShop {
    private String name; private String adres; public String stateShop; public double time;
    public OnlineShop(String name, String adres, String stateShop, double time) {
        this.name = name;
        this.adres = adres;
        this.stateShop = stateShop;
        this.time = time;
    }
    public String toString() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~ Магазин ~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Назва магазину: " + name);
        System.out.println("Адреса магазину: " + adres);
        System.out.println("Зараз магазин - " + stateShop);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return null;
    }

    public String getName() {return name;}

    public String getAdres() {return adres;}

    public String getStateShop() {return stateShop;}

    public double getTime() {return time;}
    public void setName(String name) {this.name = name;}

    public void setAdres(String adres) {this.adres = adres;}

    public void setStateShop(String stateShop) {this.stateShop = stateShop;}

    public void setTime(double time) {this.time = time;}
}