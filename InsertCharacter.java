
package Easy;

import java.util.*;

public class InsertCharacter {
    public static String addStar(String s,int stars[]){

        String ans=" ";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<stars.length && i==stars[j]){
                ans+="*";
                j++;
            }
            ans +=s.charAt(i);
        }
        return ans;

    }
    public static void main(String[] args){
        String str="geksforgeeks";
        int chars[]={1,3,5,7};
        String ans=addStar(str,chars);

        System.out.println(ans);

    }
    
}
