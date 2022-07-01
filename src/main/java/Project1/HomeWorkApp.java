package Project1;

public class HomeWorkApp {
    // Lesson 1
    public static void main(String[] args) {
        printThreeWords();
        checkHomework();
        printColor();
        compareNumbers();
    }

    // Lesson 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Lesson 3
    public static void checkHomework() {
        int a = 3;
        int b = 6;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Lesson 4
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    //Lesson 5
    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
