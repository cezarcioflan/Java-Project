package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadSingleton {

    private static ReadSingleton readSingleton = null;

    public List<String> input() {

         try (var bufferedReader = new BufferedReader(new FileReader("input.csv"));) {
             String s;
             //int k = 0;

             String[] v = new String[2];
             List<String> list = new ArrayList<>();

             while ((s = bufferedReader.readLine()) != null) {
                 v = s.split(",");
             }

             for(String i : v)
                 list.add(i);

             return list;

         } catch(FileNotFoundException e) {
             e.printStackTrace();
         } catch(IOException e) {
             e.printStackTrace();
         } /*finally {
             try{
                 if(bufferedReader != null)
                     bufferedReader.close();
             } catch(IOException e) {
                 e.printStackTrace();
             }
         } */
        return null;
    }

    //

    public static ReadSingleton getReadSingleton() {

        if(readSingleton == null)
            readSingleton = new ReadSingleton();

        return readSingleton;
    }
}
