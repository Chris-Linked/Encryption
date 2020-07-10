package academy.Mestidis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EncryptedFile {

    public void createNewFile(Map<String, List<String>> map, String path) {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        BufferedWriter bf = null;
       // BufferedWriter bf;


        try {
            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<String, List<String>> key : map.entrySet()) {
                // System.out.println(key + map.get(key));
                String message = "";
               list = key.getValue();
               String mess = key.getKey();
              ///  String message = listMan(list);
               // bf.write(key + "");
                bf.write(listMan(list, mess));
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                //always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }

    private String listMan(List<String> list, String key)
    {
        String message = "";
        for(int i = 0; i < list.size(); i++)
        {
          message = message + "\n" + list.get(i);
        }

       return key  + message + "\n";
    }
}
