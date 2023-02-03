
public class BalancedWordsCounter {

    public Integer count(String input) {

        if(input.isEmpty()){
            return 0;
        }

        if(!input.matches("[a-zA-Z]+")){
            throw new RuntimeException();
        }


        char[] chars = input.toCharArray();

        int count = 0;

        for (char a : chars) {
            count = (int) input.chars().filter(c -> c == a).count();
            if (chars.length % count == 0){
                return (int) count;
            }
        }
        return count;
    }
}
