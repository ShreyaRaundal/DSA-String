public class InsertChar {
    static String insertChar(StringBuilder sb,char c,int pos){
        sb.insert(pos,c);
        return sb.toString();
    }
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Geeks");
        System.out.println(insertChar(sb,'A',3));
    }
}
