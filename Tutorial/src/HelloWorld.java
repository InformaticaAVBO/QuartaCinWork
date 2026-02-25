public class HelloWorld {
    public static void main(String[] args) {

        // stampa hello world
        System.out.println("Hello, World!");

        // stampa tutti gli argomenti passati al programma
        for (String str : args) {
            System.out.println(str);
        }

        // crea un vettore di interi e lo stampa
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
