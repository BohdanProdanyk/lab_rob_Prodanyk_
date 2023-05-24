
public class Phone {
    public String model; public String color; public int price; public int memory;
   private double height; private double width; private double length;

    public Phone(String model, String color, int price, int memory, double height, double width, double length) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.memory = memory;
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    double area() {
        double s;
        s = height * width;
        return s;
    }
    int area(int height, int width) {
        int s;
        s = height * width;
        return s;
    }
    void price_memory() {
        if (memory == 256) {
            price = price + 5000;
        } else if (memory == 512) {
            price = price + 15000;
        } else if (memory == 1024) {
            price = price + 25000;
        }
        System.out.println(price);
    }
    private String sim1;
    private String sim2;
    Phone (String kievstar, String vodafon){
        sim1 = kievstar;
        sim2 = vodafon;
    }
}