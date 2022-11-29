public class Main {
    public static void main(String[] args) {
//(Задача - создать процедуру).
        number(7, 17, 77);
//(Задача - создать функцию).
        System.out.println(num(7, 7));
//Создаю обьект и меняю значение свойства:
        Flover flover = new Flover("Peony", 100, "Holland");
        System.out.println("Kind of flover: " + flover.getKindOfFlover() + " Price: " + flover.getPrice()
                        + " Supplier Country: " + flover.getSupplierCountry());
        flover.setSupplierCountry("Ukraine");
        System.out.println("Kind of flover: " + flover.getKindOfFlover() + " Price: " + flover.getPrice()
                + " Supplier Country: " + flover.getSupplierCountry());

    }
    static void number(int a, int b, int c){
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
    static int num(int a, int b) {
        return a * b;
    }
}