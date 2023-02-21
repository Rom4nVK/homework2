import java.util.Scanner;

public class Task10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);  //вводим класс Scanner
        System.out.println("введите трехзначное число");
        int a = scanner.nextInt(); // ввод переменного числа классом Scanner
        String str = String.valueOf(a); //переход от числа к строке
        if(str.length()<=3 && str.length()>2){               //ввод условия, при котором число должно быть трехзначным
            System.out.println(str.charAt(1)); //вывод 2 символа на экран
        }
    else //вывод альтернативного условия, которое не удовлетворяет заданию
            System.out.println("вы ввели неправильное количество символов");
    }
}
