package Easy;

public class IsBinary {
    static boolean isString(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                return false;
            }
            
        }
        return true;
        
    }
    public static void main(String[] args){
        String s="Geeks10111100000";
        System.out.println("This is BinaryString :"+isString(s));

    }
    
}
