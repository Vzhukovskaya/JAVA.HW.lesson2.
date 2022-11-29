public class Flover {
    private String kindOfFlover;
    private int price;
    private String supplierCountry;

    public Flover(String kindofFlover, int price, String supplierCountry) {
        this.kindOfFlover = kindofFlover;
        this.price = price;
        this.supplierCountry = supplierCountry;
    }

//(Задача - добавляем геттеры и сеттеры).
    public String getKindOfFlover() {
        return kindOfFlover;
    }

    public void setKindOfFlover(String  kindOfFlover) {
        this.kindOfFlover = kindOfFlover;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSupplierCountry() {
        return supplierCountry;
    }

    public void setSupplierCountry(String supplierCountry) {
        this.supplierCountry = supplierCountry;
    }
}


