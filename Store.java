public class Main {
    public static void main(String[] args) {
        double books = 150;
        double pens = 10;
        double notebooks = 25;
        double discount = 0.15;
        
        double total = (books * 2) + (pens * 5) + (notebooks * 3);
        System.out.println("Total: " + total);
        
        if (total >= 350) {
            double discountedPrice = discount * total;
            System.out.println("Discounted Amount: " + discountedPrice);
            System.out.println("Total Bills: " + (total - discountedPrice));
        } else {
            System.out.println("No Discount");
        }
    }
}