public class SubString2 {
    public static void main(String[] args){
        String txt="GeeksforGekks";
        String pat="eks";

        int idx=txt.indexOf(pat);

        if(idx!=-1){
            System.out.println(idx);
        }else{
            System.out.println(-1);
        }
    }
    
}
