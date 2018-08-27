package br.aceleradora.convertext;

import java.util.Base64;

public class Base64Conversor {

    public static String encodeBase64(byte[] text) throws Exception {

        return Base64.getEncoder().encodeToString(text);
    }

    public static byte[] decodeBase64(String base64Text) {

        return Base64.getDecoder().decode(base64Text);

    }

}
