//"babad"->bab/aba    "cbbd"->bb


class Longest_HuiWenString {
    String substr="";
    int max=0;
    public String longestPalindrome(String s) {
        int string_len=s.length();
        int i=0;
        int left=0,right=0;
        if(string_len==1){
            return s;
        }else{
            for(i=0;i<string_len;i++){
                FindHuiWen(s,i,i);   //考虑奇数情况
                FindHuiWen(s,i,i+1);    //考虑偶数情况
            }
        }
        return substr;
    }
    public void FindHuiWen(String s,int left,int right){
        while((left>=0)&&(right<s.length())&&(s.charAt(left)==s.charAt(right))){
            int sublen=right-left+1;
            if(sublen>max){
                substr=s.substring(left,right+1);
                max=sublen;
            }
            left--;
            right++;
        }         
    }
}