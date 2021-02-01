package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        file1.createNewFile();

        File file2 = new File("file2.txt");
        file2.createNewFile();


        //Задание 4
        ArrayList<File> fileArrayList = new ArrayList<>();
//        searchFile(new File("/Users/pikapika/IdeaProjects/homework_8_1"),
//                fileArrayList,"parturient");


//текст ниже сделан через онлайн приложение создания рандосного текста
        String s1 = new String("Eros erat viverra libero nisi fusce potenti ante class etiam sodales, \n" +
                "per id euismod a cursus primis penatibus hendrerit nibh netus ligula, \n" +
                "sapien aenean tempor morbi laoreet justo malesuada platea neque. \n" +
                "Augue phasellus tincidunt natoque venenatis donec mauris lectus orci mi fusce faucibus, \n" +
                "gravida aliquam senectus luctus ac netus id primis accumsan velit euismod, habitant sem \n" +
                "pharetra parturient tellus hac dignissim adipiscing integer tristique. Tempor senectus rhoncus \n" +
                "pulvinar ornare velit faucibus mollis facilisi quisque habitant, varius mi nisi diam dis porttitor \n");
        String s2 = new String("    maecenas purus cras montes, libero dictum felis habitasse vitae ipsum fringilla et aliquam. Natoque \n" +
                "est sit malesuada donec neque, diam justo vivamus hendrerit cras praesent, efficitur ornare aliquet \n" +
                "adipiscing. Primis mi facilisi consequat nisi euismod nullam sodales accumsan torquent, eget iaculis \n" +
                "aliquet et pharetra amet facilisis lorem suspendisse ut, venenatis feugiat lectus ante tempor curabitur\n" +
                " maecenas condimentum. Per a tempus ad parturient in egestas mauris nascetur, nullam senectus blandit \n" +
                "tristique vel varius ante, laoreet vitae quisque tempor ultricies cras cursus.");
        FileOutputStream fos1 = new FileOutputStream(file1);
        fos1.write(s1.getBytes());
        FileOutputStream fos2 = new FileOutputStream(file2);
        fos2.write(s2.getBytes());

        FileInputStream fil1 = new FileInputStream(file1);
        FileInputStream fil2 = new FileInputStream(file2);

        //Задание 2
//        printText(fil1, fil2);
        //Задание 3
//        searchWord("laoreet", fil1, fil2);



    }
    public static void printText(FileInputStream f, FileInputStream f2) throws IOException {
        int b1;
        int b2;
        while ((b1 = f.read()) != -1)
            System.out.print((char) b1);
        while ((b2 = f2.read()) != -1)
            System.out.print((char) b2);
    }

    public static void searchWord(String s, FileInputStream f1, FileInputStream f2) throws IOException {
        Scanner scanner1 = new Scanner(f1);
        Scanner scanner2 = new Scanner(f2);
        boolean b = true;
        int a = 0;

        while (scanner1.hasNextLine() && scanner2.hasNextLine()) {
            String sScanner1 = scanner1.nextLine();
            String sScanner2 = scanner2.nextLine();
            if (sScanner1.contains(s) == true){
                b = true;
                a++;

            }else if (sScanner2.contains(s)==true){
                b = true;
                a++;

            }else b = false;

        }
        if (a >0)
            System.out.println(true);
        else System.out.println(false);
    }

    private static void searchFile(File rootFile, List<File>fileList, String s) throws FileNotFoundException {
        boolean b = true;
        int a = 0;
        if (rootFile.isDirectory()){
            File[] dirFile = rootFile.listFiles();
            if (dirFile!= null) {
                for (File file:dirFile) {
                        if (file.getName().toLowerCase().endsWith(".txt"));
                        fileList.add(file);
                        //
                        for (File files: fileList) {
                            files.getName();
                            if ( file.getName().endsWith(".txt")){
                                FileInputStream f = new FileInputStream(files);
                                Scanner scanner = new Scanner(f);
                                while (scanner.hasNextLine()){
                                    String sScanner = scanner.nextLine();
                                    if (sScanner.contains(s) == true){
                                        b = true;
                                        a ++;
                                    }else b = false;
                                }
                            }
                        }
                }
                if (a>0){
                    System.out.println("Есть ли в папке искомое слово? " + true );
                }
                else System.out.println("Есть ли в папке искомое слово? " + false);

                }
        }

    }

}
