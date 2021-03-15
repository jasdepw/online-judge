class Solution {
    public boolean isPalindrome(String s) {
        
        String temp = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        StringBuffer sb = new StringBuffer();
        
        sb.append(temp);
        sb.reverse();
        
        String temp2 = sb.toString();
        
        return temp.equals(temp2);        
    }
}