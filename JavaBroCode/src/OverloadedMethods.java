public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        // method name + parameters = method signature

        // int x = add(1, 2, 3, 4);
        double x = add(1.0, 2.0, 3.0, 4.0);

        System.out.println(x);
    
    }

    static int add(int a, int b){
        System.out.println("Overloaded Method 1");
        return a + b;
    }
    
    static int add(int a, int b, int c) {
        System.out.println("Overloaded Method 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overloaded Method 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Overloaded Method 4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Overloaded Method 5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("Overloaded Method 6");
        return a + b + c + d;
    }
}
