class Solution {
    public List<String> commonChars(String[] words) {
         int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for(String word : words){
            int[] freq = new int[26];
            for(char ch : word.toCharArray()){
                freq[ch-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(freq[i],minFreq[i]);
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<26; i++){
            int freq = minFreq[i];
            while(freq > 0){
                ans.add(String.valueOf((char) (i +'a')));
                freq--;
            }
        }
        return ans;
    }
}
