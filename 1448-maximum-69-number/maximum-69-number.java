class Solution {

    public int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        System.out.println(Arrays.toString(digits));

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '9') {
                digits[i] = '9';
                break;
            }
        }

        System.out.println(Arrays.toString(digits));

        StringBuilder sb = new StringBuilder();

        for (char digit : digits) {
            sb.append(digit);
        }

        int number = Integer.parseInt(sb.toString());

        return number;
    }
}
