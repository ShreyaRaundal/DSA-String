public class DeleteChar2 {
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("GeeksForgeeks");
        int pos =5;

        str.deleteCharAt(pos);

        System.out.println("Modified string: "+str);
    }
    
}
