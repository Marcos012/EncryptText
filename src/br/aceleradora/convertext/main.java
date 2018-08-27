package br.aceleradora.convertext;

import java.io.*;

public class main {
    public static void main (String args[]) throws IOException {
        String text = "Minha senha é 123456";
        String key = "pass@word1234567";
        File file = new File("//home//aluno5//Desktop//secret.txt");

        try {
            
           System.out.println("Plain text: " + text + "\n");

           byte[] byteText = bytearrayConversor.convert(text);

           System.out.println("byte[] text: " + byteText + "\n");

           byte[] cipher = AESConversor.encryptAES(key.getBytes(), text);

           System.out.println("AES text: " + cipher + "\n");

           String cipherB64 = Base64Conversor.encodeBase64(cipher);

           System.out.println("Base64 text: " + cipherB64 + "\n");

           TextFileConversor.write(file, cipherB64);

           String data = TextFileConversor.read(file);

           byte[] cipherRead = Base64Conversor.decodeBase64(data);

           byte[] decrypted = AESConversor.decryptAES(key.getBytes(), cipherRead);

           System.out.println("Decrypted text: " + new String(decrypted));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
