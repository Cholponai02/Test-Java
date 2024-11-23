import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {// neqw
        Scanner scan = new Scanner(System.in);
  /*      System.out.println("Введите фамилию: ");
        String lastName = scan.nextLine();
        System.out.print("Введите имя: ");
        String firstName = scan.nextLine();
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
        System.out.println("Фамилия: " + lastName + "; Имя: " + firstName + "; Возраст: " + age + " лет.");
*/
        // нужно ввести сумму затрат денег в одном месяце. Найти ежедневныые затраты
  /*      System.out.print(" Траты за месяц: ");
        double sum = scan.nextDouble();
        int month = 30;
        double result = sum / month;
        System.out.println("Ежедневные затраты: " + result);

        var name = "Какое-то слово";
        var number = 12;

        final int birthDay = 2002;
        //birthDay = 2001;
        //long num1 = 1000000000;
        // int num2 = 10000000;

        boolean value1 = true;
        boolean value2 = false;*/

    /*    int num1 = 10;
        int num2 = 20;
        int num3 = 20;   //   false   or    true  == true
        boolean isEqual = num1 == num2 || num2 == num3;
        System.out.println(isEqual);

     */
        //   or    and    not
        //   ||    &&      !
    /*    System.out.print("Введите класс: ");
        int age = scan.nextInt();
        if (age >= 18){
            System.out.println("Вы совершеннолетний");
        }
        else if (age == 17) {

        } else if (age == 16) {

        } else{
            System.out.println("Вы несовершеннолетний");
        }

        System.out.println("Номер дня недели ( от 1 до 7): ");
        int day = scan.nextInt();
        String dayName;
        switch (day){
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
                // и т.д.
            default:
                dayName = "Некорректный номер дня";
                break;
        }
        System.out.print("Выбран день недели: " + dayName);
        scan.close();
*/
   /*     int a = checkAge(20);
        if(a!=0){
            System.out.println("da mozhno");
        }
        else{
            System.out.println("nelzy vhodit");
        }

    }
    public static int checkAge(int a) {
        if(a > 18){
            System.out.println("yes 18");
            return a;
        }
        else {
            return 0;
        }
    }
    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }*/


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать список покупок");
            System.out.println("2. Добавить товар");
            System.out.println("3. Удалить товар");
            System.out.println("4. Проверить наличие товара");
            System.out.println("5. Выйти");
            System.out.println("6. Сортировать список покупок");
            System.out.println("7. Количество товаров");

            System.out.print("Выберите действие (1-7): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showList();
                    break;
                case "2":
                    System.out.print("Введите название товара, который хотите добавить: ");
                    String addItem = scanner.nextLine();
                    addItem(addItem);
                    break;
                case "3":
                    System.out.print("Введите название товара, который хотите удалить: ");
                    String removeItem = scanner.nextLine();
                    removeItem(removeItem);
                    break;
                case "4":
                    System.out.print("Введите название товара для проверки: ");
                    String checkItem = scanner.nextLine();
                    checkItem(checkItem);
                    break;
                case "5":
                    System.out.println("Выход из программы. Хорошего дня!");
                    scanner.close();
                    return;
                case "6":
                    sortList();
                    break;
                case "7":
                    countItems();
                    break;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }



    }

/* ------------------------ */
// Список покупок (изменяемый)
static List<String> shoppingList = new ArrayList<>();

    // Популярные товары (неизменяемый список)
    static List<String> popularItems = Arrays.asList("хлеб", "молоко", "яйца");

    // Функция для отображения списка покупок
    public static void showList() {
        System.out.println("\nВаш список покупок:");
        if (!shoppingList.isEmpty()) {
            for (String item : shoppingList) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("Список пока пуст.");
        }
        System.out.println("Часто покупаемые товары: " + popularItems);
    }

    // Функция для добавления товара в список
    public static void addItem(String item) {
        if (!shoppingList.contains(item)) {
            shoppingList.add(item);
            System.out.println("'" + item + "' добавлен в список покупок.");
        } else {
            System.out.println("'" + item + "' уже в списке покупок.");
        }
    }

    // Функция для удаления товара из списка
    public static void removeItem(String item) {
        if (shoppingList.contains(item)) {
            shoppingList.remove(item);
            System.out.println("'" + item + "' удален из списка покупок.");
        } else {
            System.out.println("'" + item + "' не найден в списке покупок.");
        }
    }

    // Функция для проверки наличия товара в списке
    public static void checkItem(String item) {
        if (shoppingList.contains(item) || popularItems.contains(item)) {
            System.out.println("'" + item + "' есть в списке покупок или среди часто покупаемых товаров.");
        } else {
            System.out.println("'" + item + "' нет в списке покупок.");
        }
    }

    // Функция для сортировки списка
    public static void sortList() {
        Collections.sort(shoppingList);
        System.out.println("Список покупок отсортирован по алфавиту.");
    }

    // Функция для подсчета товаров в списке
    public static void countItems() {
        System.out.println("В вашем списке покупок " + shoppingList.size() + " товаров.");
    }



}