public class Product {
 private int id;
 private String namePr;
 private double price;
 private int quantity;

    public Product(int id, String namePr, double price, int quantity) {
        this.id = id;
        this.namePr = namePr;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePr() {
        return namePr;
    }

    public void setNamePr(String namePr) {
        this.namePr = namePr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", namePr='" + namePr + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
