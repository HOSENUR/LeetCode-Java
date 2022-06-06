class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder x= new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                x.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return x.toString().equals(x.reverse().toString());
    }
}