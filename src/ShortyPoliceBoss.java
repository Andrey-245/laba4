import java.util.Scanner;

public class ShortyPoliceBoss extends PoliceShorty{

    public static void Request() throws AriphmeticErrorException{
        Scanner console = new Scanner(System.in);
        System.out.println("Босс полицейских запрашивает кол-во репортеров");
        int a = console.nextInt();
        System.out.println("Босс полицейских запрашивает кол-во коротышек на площади");
        int b = console.nextInt();
        int c = (a * 100)/b;
        System.out.println("Полицейский Simon докладывает, процент репортеров на площади равен:");
        System.out.println(c);


    }

    public static void order() {

    }
}
