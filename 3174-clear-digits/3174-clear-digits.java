class Solution {
    public String clearDigits(String s1) {
        StringBuilder s = new StringBuilder(s1);
        int i = 0;

        
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                // Remove digit and previous character
                s = find(i, s);
                // Reset index to start scanning from the beginning
                i = 0;
            } else {
                // Move to the next character
                i++;
            }
        }

        return s.toString();
    }

    public StringBuilder find(int n, StringBuilder str) {
        // Ensure we do not attempt to delete characters out of bounds
     
            str.deleteCharAt(n); // Delete the character at index n
            str.deleteCharAt(n - 1); // Delete the character at index n-1
     

        return str;
    }
}
