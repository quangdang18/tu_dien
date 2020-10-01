import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String m;
        m = input.nextLine();
        DictionaryManagement a = new DictionaryManagement();

        DictionaryCommandline b = new DictionaryCommandline();

        b.Search(m);

    }
}
