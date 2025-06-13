public class SearchCharacter2{
    public static int findCharaterIndex(String s,char ch){
        int idx=s.indexOf(ch);
        return(idx!=-1) ? idx:-1;
    }
    public static void main(String[] args){
        String s="geeksForgeeks";
        char ch='k';

        int index=findCharaterIndex(s, ch);
        System.out.println(index);
    }
}