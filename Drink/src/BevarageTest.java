import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BevarageTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)? ");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("Do you want extras with your coffee (yes/no)? ");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Bevarages tea = new Tea();
        tea.setWantsExtras(teaExtras);
        Bevarages coffee = new Coffee();
        coffee.setWantsExtras(coffeeExtras);

        System.out.println("Making tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee...");
        coffee.finalTemplateMethod();

        scanner.close();




    }
}