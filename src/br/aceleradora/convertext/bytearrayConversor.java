package br.aceleradora.convertext;

public class bytearrayConversor {

    public static byte[] convert(String text) {

        byte[] buffer = new byte[text.length()];

        for (int i = 0; i < text.length(); i++){
            buffer[i] = (byte) text.charAt(i);
        }

        return buffer;
    }
}
