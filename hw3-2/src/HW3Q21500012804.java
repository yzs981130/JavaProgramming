import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yzs on 17-4-29.
 */

public class HW3Q21500012804 {
    static int cnt = 0;
    public static void traverse(String path){
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0)
                return;
            else {
                for (File file2 : files) {
                    if (file2.isDirectory())
                        traverse(file2.getAbsolutePath());
                    else if(file2.getAbsolutePath().endsWith(".txt")) {
                        int num = find(file2.getAbsolutePath());
                        System.out.println("file:" + file2.getAbsolutePath() + "  has "+ num);
                    }
                }
            }
        }
    }
    public static int find(String path){
        String srcText = "", s = "";
        int t = 0;
        try {
            File fin = new File(path);
            BufferedReader in = new BufferedReader(new FileReader(fin));
            s = in.readLine();
            while ( s != null ) {
                srcText += s;
                s = in.readLine();
            }
            in.close();

        } catch (FileNotFoundException e1) {
            System.err.println("File not found!" );
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        Pattern p = Pattern.compile("Harry Potter");
        Matcher m = p.matcher(srcText);
        while (m.find()) {
            cnt++;
            t++;
        }
        return t;
    }

    public static void main(String args[]) {
        File fin = new File("dir.txt");
        String dir = "";
        try {
            try (BufferedReader in = new BufferedReader(new FileReader(fin))) {
                dir = in.readLine();
                in.close();
            }
            catch (FileNotFoundException e){
                System.err.println("File not found!");
            }
            System.out.println(dir);
            traverse(dir);
            System.out.println("Sum: " + cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
