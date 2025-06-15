package Easy;
import java.util.*;
public class OccuranceOfCharacter {
    public static void main(String[] args){
        String s="aabbabcb";
        char c='a';
        s=s.replace(String.valueOf(c), " ");
        System.out.println("Occurance of character : "+s);
    }
}
