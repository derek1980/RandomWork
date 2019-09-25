public class RandomWork {

    // Recursion method example
    public static int factorial(int in){
        if (in == 0){
            return 1;
        }else
            return in * factorial(in-1);
    }

    // Hello World method.
    public static void show(String username){
        System.out.println("Hello World,"+ username);
    }
}
