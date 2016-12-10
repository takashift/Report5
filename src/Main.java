/**
 * Created by Cokoten on 2016/12/10.
 */
public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        }
        catch( NullPointerException e) {
            System.out.println(" 　　 ∧＿∧\n" +
                    "str→（　´∀｀）＜ ぬるぽ\n");
            System.out.println("　 （　・∀・）　　　|　|　ｶﾞｯ\n" +
                    "　と　　　　）　 　 |　|\n" +
                    "　　 Ｙ　/ノ　　　 人\n" +
                    "　　　 /　）　 　 < 　>__Λ∩\n" +
                    "　 ＿/し'　／／. Ｖ｀Д´）/ ←str\n" +
                    "　（＿フ彡　　　　　 　　/");
            e.printStackTrace();
        }
    }
}
