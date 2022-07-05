package Project1;

public class SolvingVariousTasks {

    public static void main(String[] args) {
        System.out.println(findValue(5,7));
        transmitsNumber(-3);
        System.out.println(returningValue(-5));
        transmissionLine("Александр",4);
        System.out.println(isLeapYear(1840));
    }

    // Lesson 1
    public static boolean findValue(int a, int b){
        int summa = a + b;
        return summa >= 10 && summa <= 20;
    }

    // Lesson 2
    public static void transmitsNumber(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + "положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }

    // Lesson 3
    public static boolean returningValue(int a) {
        return a < 0;
    }

    // Lesson 4
    public static void transmissionLine(String name, int repeat){
        for(int i = 0; i < repeat; i++) {
            System.out.println("Привет, " + name + "!");
        }
    }

    // Lesson 5
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return false;
        } else return year % 400 == 0 || year % 4 == 0;
    }
}


