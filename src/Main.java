
public class Main {
    public static void main(String[] args) {

        CaesarCipher cipher = new CaesarCipher("HOLA MUNDO", 14);

        StringBuffer cipheredText = cipher.cipher();
        StringBuffer decipheredText = cipher.decipher(cipheredText);

        System.out.println("Texto Cifrado: " + cipheredText);
        System.out.println("Texto decifrado: " + decipheredText);
        System.out.println("Desplazamiento: " + cipher.getShift());
    }
}