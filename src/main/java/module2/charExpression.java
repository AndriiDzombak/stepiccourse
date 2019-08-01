package module2;

public class charExpression {

    public static void main(String[] args) {

        System.out.println(charExpression(29));
    }

    public static char charExpression(int a) {

        return (char) ('\\' + a);
    }
}
