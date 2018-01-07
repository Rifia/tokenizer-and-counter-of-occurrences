package com.trilitr;
import java.io.*;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

class Main {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        FileReader file = new FileReader("..:\\....\\....\\...\\fileName.*");
        StreamTokenizer fileTokenizer = new StreamTokenizer(file);
        while ((fileTokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
            if (fileTokenizer.ttype == StreamTokenizer.TT_WORD)
                counter.incrementValue(toLowerCase(fileTokenizer.sval).replaceAll("[^A-Za-zА-Яа-я0-9]", ""));
        }
        file.close();
        counter.counterResult();
    }
}



