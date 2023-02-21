import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //вводим класс Scanner
        System.out.println("введите  число");
        int a = scanner.nextInt(); // присвоение переменной символа с помощью ввода с клавиатуры
        if (a>=1 && a<=5){ //условие выбора рабочих дней
            System.out.println("Рабочий день");
        } else if (a>=6 && a<=7) {//условие выбора выходных дней
            System.out.println("Выходной");
        }
        else //условие при котором условия выше не подходят
            System.out.println("Это не день недели");
    }
}
