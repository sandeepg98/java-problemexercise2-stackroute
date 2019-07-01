package com.stackroute.pe2;

import java.io.*;

public class ReadAndPrint {

    public long readPrint(String path) throws Exception{

        /*File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String store;
        String result = "";
        while ((store = br.readLine()) != null)
            result = result + store.toUpperCase();

        return result;*/

        File file = new File(path);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String store;
        while ((store = br.readLine()) != null)
            System.out.println(store.toUpperCase());

        return file.length();
    }

}
