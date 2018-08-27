package br.aceleradora.convertext;

import java.io.*;

class TextFileConversor {

    public static void write(File file, String message) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(message);
        writer.flush();
        writer.close();
    }

    public static String read(File file) throws IOException{

        StringBuilder builder = new StringBuilder();
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;

        while((data = reader.readLine()) != null){
            builder.append(data);
        }
        fileReader.close();
        reader.close();

        return builder.toString();
    }

}

