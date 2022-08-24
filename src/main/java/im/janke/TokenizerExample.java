package im.janke;

public class TokenizerExample {

    public static void main(String[] args) {
        String text =  "This is an example test that contains various words and special cases. Peter's house is 25.6 meters high. Éduardo is cool.\nHänsel likes cookies; Gretel writes JavaDoc: \"\n/**\n* This class uses variable _int and calls toString().\n*/\n\"";
        System.out.println(text);
        var tokenizer = new Tokenizer();
        for (var token : tokenizer.tokenize(text)) {
            System.out.println(token);
        }
    }


}
