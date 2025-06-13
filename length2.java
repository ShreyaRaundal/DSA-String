public class length2 {
    static int getLength(String s){
        int cnt=0;
        for(char c:s.toCharArray()){
            cnt++;
        }
        return cnt;

    }
    public static void main(String[] args){
        String s="GeeksForGeeks";
        System.out.println(getLength(s));
    }
    
}
