import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline() {
        int sl_tu;
        String ta, tv;
        Scanner input = new Scanner(System.in);
        sl_tu = input.nextInt();
        for (int i = 0; i < sl_tu; i++) {
            ta = input.next();
            tv = input.next();
        }
    }


}
