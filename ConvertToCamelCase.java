package Easy;

public class ConvertToCamelCase {
    static String convertToCamelCase(String s){
        StringBuilder res=new StringBuilder();

    boolean capitalizeNext=false;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            capitalizeNext=true;
        }else if(capitalizeNext==true){
            res.append(Character.toUpperCase(s.charAt(i)));
            capitalizeNext=false;

        }else{
            res.append(s.charAt(i));
        }
    }
    return res.toString();

    }
    public static void main(String[] args){
        String s="i got intern at geeksforgeks";
        System.out.println(convertToCamelCase(s));
    }
    
    
}
