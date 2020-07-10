package academy.Mestidis;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Encrypt {
    private  MessageDigest md = MessageDigest.getInstance("SHA-256");

    public Encrypt() throws NoSuchAlgorithmException {
    }


    public  List<String> encrypt(List<String> list)
    {
        ArrayList<String> list2 = new ArrayList<>();
        byte[] digest;
        String data = "";
        for(int i = 0; i < list.size(); i++)
        {
            String message = list.get(i);
            md.update(message.getBytes());
            digest = md.digest();
            data = String.valueOf(digest);

        }
        list2.add(data);
        return list2;
    }
}
