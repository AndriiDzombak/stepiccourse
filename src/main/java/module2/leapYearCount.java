package module2;

public class leapYearCount {

    public static void main(String[] args) {

        System.out.println(leapYearCount(9));
    }


    public static int leapYearCount(int year) {

        int yearCount;

        yearCount = year / 4 - year / 100 + year / 400;

        return yearCount;
    }
}
