import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
        Scanner iw = new Scanner(System.in);
        int a = iw.nextInt();
        int b = iw.nextInt();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Умножение: " + a * b);
        System.out.println("Вычитание: " + (a-b));
        System.out.println("Деление: " + a / b);
        System.out.println("Остаток: " + a % b);
        //Напишите программу для вывода нечетных чисел от 1 до 20
        for(int i = 0; i <= 20; i++){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }
        //Напишите программу, чтобы поменять местами две переменные
        String str = "hello";
        String str1 = "world";
        System.out.println( "\n" + str + str1);
        String temp = str;
        str = str1;
        str1 = temp;
        System.out.println(str + str1);
        //Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
        int num1 = iw.nextInt();
        int num2 = iw.nextInt();
        int num3 = iw.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " cамое большое");
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " самое большое");
        } else{
            System.out.println(num3 + " самое большое");
        }
        //Напишите программу для проверки того, является ли число положительным или отрицательным
        int number = -6;
        if(number >= 0){
            System.out.println(number + " Число положительное");
        } else {
            System.out.println(number + " Число отрицательное");
        }
        //Напишите программу для замены всех символов 'a' на символы 'b'
        String stroka = "Java is great language!";
        String replaceStroka = stroka.replace("a", "b");
        System.out.println(replaceStroka);
        //Напишите программу для суммирования значений массива
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = iw.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] += i;
            System.out.print(arr[i]);
        }
        //Напишите программу для нахождения второго по величине числа из массива
        int max = 0;
        int maxScnd = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(max < maxScnd && maxScnd > arr[i]){
                maxScnd = arr[i];
            }
        }
        System.out.println("\nMax 1st:" + max);
        System.out.println("Max 2nd:" + maxScnd);
    }
}
