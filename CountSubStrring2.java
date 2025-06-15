package Easy;

public class CountSubStrring2 {
    int countSubString(char str[],int n){
        
        int m=0;
        for(int i=0;i<n;i++){
            if(str[i]=='1')
            m++;
        }
        return m*(m-1)/2;
    }
    public static void main(String[] args){
        String string="000010001";
        char str[]=string.toCharArray();
        int n=str.length;
        System.out.println(count.countSubString(str,n));

    }
    
}
