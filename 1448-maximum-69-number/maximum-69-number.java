class Solution {

    public int maximum69Number(int num) {
        char arr[] = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
        // StringBuilder sb = new StringBuilder(num + "");
        // for (int i = 0; i < sb.length(); i++) {
        //     if (sb.charAt(i) == '6') {
        //         sb.setCharAt(i, '9');
        //         break;
        //     }
        // }
        // return Integer.parseInt(sb.toString());
    }
}
