import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class DA {
    //count the number of lines in the text file and return it
    //Used sudo code from Programiz.com to find out how to cout lines in file
    public static int numLines(String txt){
        int count = 0;
        try {
            //use scanner to read through the file
            Scanner sc = new Scanner(new File(txt));
            //initilize count variabl
            //loop through each line and add to count for every line in file
            while(sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            //closing scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        //return the number of lines in the text file
        return count;
    }
    
    //make a map that contains what word is with what number
    public static Map<Integer, String> decode(String message_file){
        //used geeksforgeeks and other resourses to figure out how to 
        //transfer the file lines into a map
        //initilize map
        Map<Integer, String> codeWords = new HashMap<>();
        //try catch reading the l=file
        try (Scanner sc = new Scanner(new File(message_file))){
            //read each line and insert the values into the map
            while(sc.hasNextLine()){
                String save = sc.nextLine();
                String[] split = save.split(" ",2);
                int num = Integer.parseInt(split[0]);
                String word = split[1];
                codeWords.put(num, word);
            }
            //close scanner
            sc.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
        //return map with all values
        return codeWords;
    }

    //make function that prints out the messeage using most right nodes of the tree
    public static void translate(Map<Integer, String> codes, int count){
        //have the starting node which is one
        int save = 1;
        //for every iteration its counter plus 1 starting at 2
        //this is to get the furthest right node in a binary tree
        int counter = 2;
        //print out the message using a while loop
        while(save <= count){
            if(save + counter <= count && save != 300){
                System.out.print(codes.get(save) + " " );
            }
            else{
                System.out.print(codes.get(save));
            }
            //move save to the next number/word
            save += counter;
            //find next furthest right node
            counter++;
        }
    }

    public static void main(String[] args) {
        //save file
        String txt = "coding_qual_input.txt";
        //save map
        Map<Integer, String> codeWords = decode(txt);
        //save number of lines in file
        int count = numLines(txt);
        translate(codeWords, count);
    }
}