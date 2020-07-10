package academy.Mestidis;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
	// write your code here
        ReadInput readInput = new ReadInput();
        TokenKeys tokenKeys = new TokenKeys();
        List<String> list = new ArrayList<>();
        Scanner input2 = new Scanner(System.in);
        EncryptedFile encryptedFile = new EncryptedFile();
        HashMap<String, List<String>> map = new HashMap<>();
        
        Encrypt enc = new Encrypt();
        System.out.println("please enter the path");

        // check if path exists
        while (!readInput.read())
        {
            System.out.println("Path not found please re-enter the correct path");
        }

        // copy the contents of a file to arraylist
        readInput.addContents();

        // print the arraylist for visual purposes
        readInput.printList();

        // string array to store the keys
        String[] tokenize;
        String[] config;

        // extract the first element of the arraylist and tokenize
        tokenize = tokenKeys.tokenize(readInput.getZero());
        System.out.println(
        );

        // print the string array for visual purposes
        printString(tokenize);

        System.out.println("please enter the path of the second file");
        while (!readInput.read())
        {
            System.out.println("Path not found please re-enter the correct path");
        }
        readInput.addContents2();
        config = tokenKeys.tokenize(readInput.getZeroConfig());



        int num = 0;
       for(int i = 0; i < tokenize.length; i++)
       {
           list = tokenKeys.retListArr(readInput.getList(), i);
           map.put(tokenize[num++], list);
       }

        for(String key : map.keySet())
        {
            System.out.println(key + map.get(key));

        }
        System.out.println();

        // encrypt
        for(int i = 0; i < config.length; i++)
        {
            if(config[i].equals(tokenize[i]))
            {
                list = enc.encrypt(list);
                map.put(tokenize[i], list);
            }
        }

            // prompt the user to enter the path with the file name
            System.out.println("please enter the path");
            String paths = input2.nextLine();
            // call method to store the encrypted contents to the file
            encryptedFile.createNewFile(map,paths);

    }

    // print String [] array for visual purposes
    private static void printString(String [] tok)
    {
        for (int i = 0; i < tok.length; i++)
            System.out.println(i + " " + tok[i]);
    }

    // print list for visual purposes
    private static void printList(List<String> list)
    {
        for(int i = 0; i < list.size(); i ++)
            System.out.println(i + " " + list.get(i));
    }

}
