import java.util.Scanner;

public class task_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while(!done){
            System.out.println("Введите число типа float");
            String line = scanner.nextLine();
            try{
                Float number = Float.parseFloat(line);
                System.out.printf("Введённое число равно %f", number);
                done = true;
        }
        catch(NumberFormatException e){
            System.out.println("Неверно ввели число. Введите дробное число");
        }
    }
    scanner.close();
}}