package academy.Mestidis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInput {

    private Scanner scanner = new Scanner(System.in);
    private String path;
    File newFile;
    private List<String> list = new ArrayList<>();
    private List<String> config = new ArrayList<>();


    // check if file exists
    public boolean read()
    {

        this.path = scanner.nextLine();
        this.newFile = new File(path);
        if(newFile.exists())
        {
            return true;
        }
        return false;
    }

    // returns the path;
    public String getPath()
    {
        return path;
    }

    // add the contents of a txt file to arraylist
    public void addContents() throws FileNotFoundException {
        Scanner scan = new Scanner(newFile);
        String data;

        while (scan.hasNext())
        {
            data = scan.nextLine();
            list.add(data);
        }
    }

    // prints the contents of the list
    public void printList()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(i + " " + list.get(i));
        }
    }

    // returns the first element of the list
    public String getZero()
    {
       return list.get(0);
    }

    // return the first element of the config list
    public String getZeroConfig()
    {
        return config.get(0);
    }

    // print the config list
    public void printList2()
    {
        for(int i = 0; i < config.size(); i++)
        {
            System.out.println(i + " " + config.get(i));
        }
    }

    // handle the configuration file add the contents to a list
    public void addContents2() throws FileNotFoundException {
        Scanner scan = new Scanner(newFile);
        String data;

        while (scan.hasNext())
        {
            data = scan.nextLine();
            config.add(data);
        }
    }

    public List<String> getList() {
        return list;
    }

    public List<String> getConfig() {
        return config;
    }
}
