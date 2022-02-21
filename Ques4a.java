package JDK8Updates;

import java.util.Arrays;
import java.util.List;

public class Ques4a {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(23, 34, 45, 56, 67, 78, 89, 90);
        boolean matchDemo=list1.stream().allMatch(a->a%2==0);
        System.out.println(matchDemo);
        boolean matchDemo1=list1.stream().anyMatch(a->a%2==0);
        System.out.println(matchDemo1);
    }
}
/*
false
true
 */
