import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите непустую строку: ");
        String line = sc.nextLine();
        sc.close();
        if(line.equals("")){
            throw new RuntimeException("Пустую строку вводить нельзя");
        } 
        System.out.printf("Вы ввели строку '%s'", line);
        sc.close();
    }
}
