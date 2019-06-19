public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int x = 50000;

        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }

        int[] numbers = new int[10];

        for (int k = 0; k < numbers.length; k++) {
            numbers[k]=k*7;
            System.out.println(numbers[k]);
        }
    }
}
