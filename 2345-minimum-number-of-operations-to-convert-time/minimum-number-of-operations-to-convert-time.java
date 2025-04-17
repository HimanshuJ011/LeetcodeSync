class Solution {
    public int convertTime(String current, String correct) {
        // int currenTimeMins = convertMins(current);
        // int correctTimeMins = convertMins(correct);

        int currH = ((current.charAt(0) - '0') * 10 + (current.charAt(1) - '0'))*60;
        int currM = (current.charAt(3) - '0') * 10 + (current.charAt(4) - '0');
        int corrH = ((correct.charAt(0) - '0') * 10 + (correct.charAt(1) - '0'))*60;
        int corrM = (correct.charAt(3) - '0') * 10 + (correct.charAt(4) - '0');

        System.out.println((corrH+corrM) - (currH+currM));
        // System.out.println(correctTimeMins - currenTimeMins);

        int diffMin = (corrH+corrM) - (currH+currM);
        int count = 0;

        while(diffMin > 0){
            if(diffMin >= 60){
                diffMin -=60;
            }else if(diffMin >= 15 && diffMin < 60){
                diffMin-=15;
            }else if(diffMin >=5 && diffMin < 15){
                diffMin-=5;
            }else{
                diffMin-=1;
            }
            count++;
        }
        return count;

    }
    // private int convertMins(String time){
    //     StringBuilder  hrs = new StringBuilder();
    //     StringBuilder  mins = new StringBuilder();
    //     int  flag = 0;
    //     for(char ch : time.toCharArray()){
    //         if(ch == ':') {
    //             flag = 1; 
    //             continue;
    //         }
    //         if(flag == 0){
    //             hrs.append(ch);
    //         }else{
    //             mins.append(ch);
    //         }
            
    //     }
    //     int hours = Integer.parseInt(hrs.toString());
    //     int min = Integer.parseInt(mins.toString());
    //     min+= hours * 60;

    //     return min;
    // }
}