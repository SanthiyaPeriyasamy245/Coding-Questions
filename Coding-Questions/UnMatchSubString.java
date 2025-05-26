import java.util.*;

public class UnMatchSubString {
    public static void main(String[] args) {
        String str1 = "schoollifeisusefull";
        String str2 = "schoollongofuselike";

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        List<String[]> answer = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                s1.append(str1.charAt(i));
                s2.append(str2.charAt(i));
            } else {
                if (s1.length() > 0) {
                    answer.add(new String[]{s1.toString(), s2.toString()});
                    s1.setLength(0);
                    s2.setLength(0);
                }
            }
        }

        // Add last mismatched part if it exists
        if (s1.length() > 0) {
            answer.add(new String[]{s1.toString(), s2.toString()});
        }

        // Print results
        for (String[] pair : answer) {
            System.out.println(pair[0] + " , " + pair[1]);
        }
    }
}
