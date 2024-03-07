public class gfg_Longest_repeating_and_non_overlapping_substring {
    static String longestSubstring(String s, int n) {
        int dp[][] = new int[n+1][n+1];
        int max = 0,end = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1) && dp[i - 1][j - 1]<(j - i))
                    dp[i][j] = 1 + dp[i-1][j-1];
                    
                if(max<dp[i][j]){
                    max = dp[i][j];
                    end = i;
                }
            }
        }
        return (max>0)?s.substring(end - max, end):"-1";
    }
    public static void main(String[] args) {
        String str = "ABDEFGABEF";
        int n = str.length();

        String longestSubstring = longestSubstring(str, n);
        System.out.println("Longest non-overlapping repeating substring: " + longestSubstring);
    }
}
