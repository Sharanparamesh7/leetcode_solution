class Solution {
    public String replaceDigits(String str) {
        StringBuffer s = new StringBuffer(str);
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                char n=(char)(s.charAt(i-1)+s.charAt(i)-'0');
                s.setCharAt(i, n);
            }
        }
        return s.toString();
    }
}