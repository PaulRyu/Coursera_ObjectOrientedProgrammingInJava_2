public class CaesarCipher {

    static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        String secret = "JESSICA IS BEING ATTACKED BY MINA THE BRAVE";
        String encryptedMessage = encrypt(secret, 23);
        System.out.println("Original Message: " + secret);
        System.out.println(encryptedMessage);

    }

    // Decrypt message
    public static String encrypt(String messageToEncrypt, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        char letterToFind;
        int indexOfLetterInAlphabet;
        char encryptedLetter;
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (int i = 0; i < messageToEncrypt.length(); i++) {
            letterToFind = messageToEncrypt.charAt(i);
            if (letterToFind == ' ') {
                encryptedMessage.append(' ');
                continue;
            }
            indexOfLetterInAlphabet = alphabet.indexOf(letterToFind);
            encryptedLetter = shiftedAlphabet.charAt(indexOfLetterInAlphabet);
            encryptedMessage.append(encryptedLetter);
        }
        return "Encrypted Message: " + encryptedMessage.toString();
    }
}
