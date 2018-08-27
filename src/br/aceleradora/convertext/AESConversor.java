package br.aceleradora.convertext;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESConversor {

    public static byte[] encryptAES(byte[] key, String base64Text) throws Exception {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");

        Cipher cipher = Cipher.getInstance("AES");

        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

        byte[] encrypted = cipher.doFinal(base64Text.getBytes());

        return encrypted;

    }

    public static byte[] decryptAES(byte[] key,  byte[] encrypted ) throws Exception {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");

        Cipher cipher = Cipher.getInstance("AES");

        cipher.init(Cipher.DECRYPT_MODE, skeySpec);

        return cipher.doFinal(encrypted);

    }

}
