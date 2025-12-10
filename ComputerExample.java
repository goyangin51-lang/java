package sec01.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator Calculator = new Calculator();
        System.out.println("원면적 : " + Calculator.areaCircle(r));
        System.out.println();

        Computer Computer = new Computer();
        System.out.println("원면적 : " + Computer.areaCircle(r));
    }
}