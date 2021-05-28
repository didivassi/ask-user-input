package academy.mindswap;

import academy.mindswap.user_input.InputUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ask user input
        //Check what is happening
       /* File file= listDirectory();
        //System.out.println(file.getAbsoluteFile());

        String[] listFolder= file.list();

        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter("resources/output.txt"));

            for (String filename:listFolder) {
                writer.write(filename+"\n");
                writer.flush();
            }

        }catch (IOException e){
            System.out.println(e);
        }

        */

        File file2 = findFile();
        if(file2!=null){
            System.out.println(file2.getName());
        }


        // file= new File("resources");
        //Check what is happening
        //System.out.println(file.getAbsoluteFile());

    }

    public static File listDirectory(){
        String input= InputUtils.askUserInput("What's the path you wanna list");
        File file= new File(input);
        if(!file.isDirectory()){
            System.out.println("This path does not exists or not a directory path");
            return listDirectory();
        }
        return file;
    }

    public static File findFile(){
        String input= InputUtils.askUserInput("What's the path you wanna list?");
        File file= new File(input);
        if(!file.isDirectory()){
            System.out.println("This path does not exists or not a directory path");
            return findFile();
        }
        String inputFile= InputUtils.askUserInput("What's the filename you want to find?");
        file= new File(input+"/"+inputFile);
        if(!file.isFile()){
            System.out.println("This file does not exists");
            return null;
        }
        System.out.println("file exists");
        return file;
    }
}
