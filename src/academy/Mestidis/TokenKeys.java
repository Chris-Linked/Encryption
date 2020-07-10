package academy.Mestidis;

import java.util.ArrayList;
import java.util.List;

public class TokenKeys {

  //  private List<String> list = new ArrayList<>();

    public String[] tokenize(String message)
    {
        String[] token = message.split("\t");
        return token;
    }

    // this method extracts every element of an array uses the split method and stores the contents to a new array
    public List<String> retListArr(List<String> list, int number)
    {
        int len = list.size() -1;
        List<String> list2 = new ArrayList<>();
        String token[] = new String[len];
        String data;
        String [] values = new String[len];
        int num = 0;
        for(int i = 1; i < list.size(); i++)
        {
            data = list.get(i);
            token = data.split("\t");
            values[num++] = token[number];

        }

        for(int i = 0; i < values.length; i++)
        {
            list2.add(values[i]);
        }
        return list2;
    }
}
