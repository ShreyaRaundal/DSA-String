package Easy;
public class CountSubString{
    int countSubString(char str[],int n){
        
        int res=0;
        for(int i=0;i<n;i++){
            if(str[i]=='1'){
                for(int j=i+1;j<n;j++){
                    if(str[j]=='1'){
                        res++;
                    }
                }

            }
           
        }
         return res;
    }
    public static void main(String[] args){
        CountSubString count=new CountSubString();
        String string="10000100101";
        char str[]=string.toCharArray();
        int n=str.length;
        System.out.println(count.countSubString(str, n));

    }
}