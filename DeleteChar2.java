package Easy;

public class DeleteChar2 {
    public static int deleteChar(StringBuilder s,int pos){

         if(pos < 0 || pos >= s.length()){
            return;
        }

        for(int i=pos;i<s.length()-1;i++){
            s.setCharAt(i,s.charAt(i+1));
        }
        s.deleteCharAt(s.length()-1);
    }
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("acvbbgf");
        int pos=1;
        deleteChar(s,pos);
        System.out.println(s);
    }
   
    
}
