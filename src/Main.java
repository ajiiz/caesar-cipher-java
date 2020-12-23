public class Main {
    public static void main(String[] args) {
        String text = "Hold it hold it! C.O.T.E!! ASDASDASDASDAWdwadasfea";
        CaesarCipher cipher = new CaesarCipher(124);
        System.out.println(cipher.encrypt(text));
        text = "Bifx cn bifx cn! W.I.N.Y!! UMXUMXUMXUMXUQxquxumzyu";
        System.out.println(cipher.decrypt(text));
    }
}
