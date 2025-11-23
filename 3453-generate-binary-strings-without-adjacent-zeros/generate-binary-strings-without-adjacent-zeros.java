class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n, new StringBuilder(), ans);
        return ans;
    }

    private void dfs(int remaining, StringBuilder sb, List<String> ans) {
        if (remaining == 0) {
            ans.add(sb.toString());
            return;
        }
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '1') {
            sb.append('0');
            dfs(remaining - 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append('1');
        dfs(remaining - 1, sb, ans);
        sb.deleteCharAt(sb.length() - 1);
    }
}
