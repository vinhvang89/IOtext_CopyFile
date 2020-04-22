import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter link of file  :");
        String path1 = scan.nextLine();
        System.out.println("Enter something else :");
        String path2 = scan.nextLine();
        try {
            File file1 = new File(path1);
            FileWriter file2 = new FileWriter(path2);
            BufferedReader br = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(file2);
            String line = " ";
            while ((line = br.readLine()) != null){
                bw.write(line + "\n");
                line = " ";
            }
            br.close();
            bw.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println("Error ---> buy a new computer");
        }
    }
}
