import java.util.Objects;

public class DictionaryCommandline {

    public Boolean tien_doan(String s1, String s2) {
        Boolean h = true;

        for ( int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                h = false;
            }
        }

        return h;
    }

    public void showAllWords(){
         Dictionary tu_dien = new Dictionary();
         for ( int i = 0; i< tu_dien.Words.length; i++) {
             System.out.println(tu_dien.Words[i] + " " + i);
         }
     }
    public void dictionaryBasic() {
        showAllWords();
        DictionaryManagement ql_tu_dien = new DictionaryManagement();
        ql_tu_dien.insertFromCommandline();
    }

    public void Search(String s) {
        Dictionary tu_dien = new Dictionary();
        for ( int i = 0; i< tu_dien.Words.length; i+= 2) {
            if ( tu_dien.Words[i].equals(s)) {
                System.out.println(tu_dien.Words[i+1]);
                break;
            }
            else {
                if (tu_dien.Words[i].compareTo(s) > 0 && tien_doan(tu_dien.Words[i], s)) {
                    for ( int j = i; j< i + 10; j+= 2) {
                        System.out.println(tu_dien.Words[j]);
                    }
                    break;
                }
            }
        }

    }
}
