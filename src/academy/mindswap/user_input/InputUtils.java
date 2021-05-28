package academy.mindswap.user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class InputUtils {

    public static String askUserInput(String message){
        try{
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(message);
            return  r.readLine(); // blocking method
        }catch (IOException e){
            System.out.println(e.getMessage());
            return "";
        }
    }
}
