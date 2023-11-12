import java.util.Objects;

public class CaesarCipher {
    private String textToCipher;
    private int shift;
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public CaesarCipher(String textToCipher, int shift) {
        this.shift = shift;
        this.textToCipher = textToCipher;
    }

    // Implementacion del cifrado cesar, el shift es el desplazamiento que tiene la letra en el alfabeto
    public StringBuffer cipher(){

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < this.textToCipher.length(); i++){
            for (int j = 0; j < this.alphabet.length; j++){
                char c = this.textToCipher.charAt(i);

                char a = this.alphabet[j];

                if (Objects.equals(a, c)) {
                    int index = j+shift;
                    if (index >= 26) {
                        int resto = index % 26;
                        index = resto;
                    }
                    char z = this.alphabet[index];
                    result.append(z);
                }
            }
        }


        return result;
    }

    // Hace lo mismo que el cifrado pero en reversa, basicamente en vez de sumar el desplazamiento lo resta, y si este es menor a cero se empieza del otro extremo
    public StringBuffer decipher(StringBuffer cipheredText){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < cipheredText.length(); i++){
            for (int j = 0; j < this.alphabet.length; j++){
                char c = cipheredText.charAt(i);
                char a = this.alphabet[j];

                if (Objects.equals(a, c)) {
                    int index = j - shift;
                    if (index < 0) {
                        index += 26;
                    }
                    char z = this.alphabet[index];
                    result.append(z);
                }
            }
        }
        return result;
    }

    public int getShift() {
        return shift;
    }
}
