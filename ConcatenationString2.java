package Easy;

public class ConcatenationString2 {
    public static String concat(String s1,String s2){
        StringBuilder res=new StringBuilder();

        for(char c:s1.toCharArray()){
            res.append(c);
        }

        for(char c:s2.toCharArray()){
            res.append(c);
        }
        return res.toString();

    }
    public static void main(String[] args){
        String s1="hello";
        String s2="Shreya";

        String res=concat(s1,s2);

        System.out.println(res);

    }
}
