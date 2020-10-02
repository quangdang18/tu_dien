package sample;

public class Dictionary {
    Word [] words;
    public Dictionary() {
        String [] wd = {"ability","Khả năng\n" ,
                "able","thể\n" ,
                "accept", "chấp nhận\n" ,
                "acceptable", "chấp nhận được\n" ,
                "accident", "Tai nạn\n" ,
                "according", "theo\n" ,
                "account", "tính toán\n" ,
                "accurate", "chính xác\n" ,
                "achieve", "đạt được\n" ,
                "act", "hành động\n" ,
                "action", "hành động\n" ,
                "active", "hoạt động\n" ,
                "activity", "Hoạt động\n" ,
                "actor", "Diễn viên\n" ,
                "actual", "thực tế\n" ,
                "ad", "Quảng cáo\n" ,
                "add", "thêm vào\n" ,
                "addition", "Thêm vào\n" ,
                "additional", "thêm\n" ,
                "administration", "Quyền quản trị\n" ,
                "administrative", "hành chính\n" ,
                "admit", "thừa nhận\n" ,
                "adult", "người lớn\n" ,
                "advertising", "Quảng cáo\n" ,
                "advice", "Lời khuyên\n" ,
                "affair", "Việc\n" ,
                "affect", "có ảnh hưởng đến\n" ,
                "afford", "đủ khả năng\n" ,
                "afraid", "sợ\n" ,
                "after", "sau\n" ,
                "afternoon", "buổi chiều"};
        words = new Word[wd.length/2];
        for ( int i = 0; i< wd.length/2; i++) {
            words[i] = new Word();
        }
        for ( int i = 0; i < wd.length/2; i++) {
            words[i].setWord_target(wd[i * 2]);
            words[i].setWord_explain(wd[2 * i + 1]);

        }

    }

    public String get(String s) {

        String m = "a";

        for ( int i = 0; i < words.length; i++) {
            if ( words[i].getWord_target().equals(s)) {
                m = words[i].getWord_explain();
                System.out.println("tim thay");
            }
        }
        return m;
    }

}
