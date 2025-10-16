public class DT {
    public void main(String[] args) {
        byte a = 100;
        System.out.println(a);

        short b = 5000;
        System.out.println(b);

        int c = 100000;
        System.out.println(c);

        long d = 15000000000L;
        System.out.println(d);

        float f = 5.75f;
        System.out.println(f);

        double g = 19.99d;
        System.out.println(g);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false

        

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
