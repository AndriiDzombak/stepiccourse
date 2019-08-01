public class HelloWorld {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            // тело цикла
            System.out.println("first cylcle" + i);
        }


        for (int i = 0; i < 5; ) {
            // тело цикла
            i++;
            System.out.println("second cylcle" + i);
        }


    }
}