public class LongestOddNumberInString {

    String largeOddNum(String s){
        int index = -1;
        for(int i = s.length()-1;i >= 0; i--){
            if((s.charAt(i) - '0') % 2 != 0){
                index = i;
                break;
            }
        }
        if(index == -1) return  "";

        for(int i = 0; i <= index; i++){
            if(s.charAt(i) == '0'){
                continue;
            }
            return  s.substring(i,index +1 );
        }
        return "";  
    }

    public static void main(String[] args) {
        LongestOddNumberInString solution = new LongestOddNumberInString();
        String num = "504";
        String result = solution.largeOddNum(num);
        System.out.println("Largest odd number: " + result);
    }
}
