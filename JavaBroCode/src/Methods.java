public class Methods {
    public static void main(String[] args) {
        // method = block of code executed whenever called upon
        // hello(); // invoking or calling the method

        // arguments = the value you pass to a method
        // String name = "Bro";
        // int age = 21;
        // hello(name, age); 

        // return types
        int x = 3;
        int y = 4;

        int z = add(x,y);
        System.out.println(add(x,y));

    }
    
    // creating a new method
    // static void hello(String name, int age) {  // parameters
    //     System.out.println("Hello " + name);
    //     System.out.println("You are " + age);
    // }

    static int add(int x, int y) {
        
        int z = x + y;
        return z;
    }
}
