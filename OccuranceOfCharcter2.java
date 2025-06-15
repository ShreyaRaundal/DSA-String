package Easy;
import java.util.*;
public class OccuranceOfCharcter2 {
    public static String remove(String word,char ch){
        StringBuilder s=new StringBuilder(word);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                s.deleteCharAt(i);
                i--;
            }
        }
        return s.toString();
    }
    public static void main(String[] args){
        String word="GeeksGeeks";
        char ch='G';
        System.out.println(remove(word, ch));

    }
}
