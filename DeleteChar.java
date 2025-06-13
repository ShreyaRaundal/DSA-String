public class DeleteChar {
    public static String deleteChar(String s,char ch){
        StringBuilder newStr=new StringBuilder();
            for(char c:s.toCharArray()){
                 if(c!=ch){
                     newStr.append(c);
                }
             }
            return newStr.toString();

     }
     public static void main(String[] args){
        String s="Hello";
        char ch='l';
        System.out.println(deleteChar(s, ch));

     }
    
}

