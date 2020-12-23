public class CaesarCipher {

    private int shift;

    CaesarCipher() {
        setShift(13);
    }

    CaesarCipher(int shift) {
        setShift(shift);
    }

    public String encrypt(String text) {
        checkText(text);
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            int currentChar = text.charAt(i);
            encryptedText += getEncryptedChar(currentChar);
        }
        return encryptedText;
    }

    public char getEncryptedChar(int currentChar) {
        char encryptedChar = (char) (currentChar + shift);
        if (currentChar >= 'a' && currentChar <= 'z') {
            if (encryptedChar > 'z') {
                encryptedChar = (char) (encryptedChar - 26);
            }
        } else if (currentChar >= 'A' && currentChar <= 'Z') {
            if (encryptedChar > 'Z') {
                encryptedChar = (char) (encryptedChar - 26);
            }
        } else {
            encryptedChar = (char) currentChar;
        }
        return encryptedChar;
    }

    public String decrypt(String text) {
        checkText(text);
        String decryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            int currentChar = text.charAt(i);
            decryptedText += getDecryptedChar(currentChar);
        }
        return decryptedText;
    }

    public char getDecryptedChar(int currentChar) {
        char decryptedChar = (char) (currentChar - shift);
        if (currentChar >= 'a' && currentChar <= 'z') {
            if (decryptedChar < 'a') {
                decryptedChar = (char) (decryptedChar + 26);
            }
        } else if (currentChar >= 'A' && currentChar <= 'Z') {
            if (decryptedChar < 'A') {
                decryptedChar = (char) (decryptedChar + 26);
            }
        } else {
            decryptedChar = (char) currentChar;
        }
        return decryptedChar;
    }

    public void checkText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Invalid text! (It cant be null)");
        }
    }

    public void setShift(int shift) {
        if (shift > 26) {
            shift = shift % 26;
        }
        this.shift = shift;
    }
}
