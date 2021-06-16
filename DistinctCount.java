package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCount {
    public static void main(String[] args) {
        String str="araaci";
        int k=2;
        HashSet<Character> set=new HashSet<>();
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str.length();i++){
         if(set.size()<k || !set.add(str.charAt(i)))
         {
             builder.append(str.charAt(i));
             set.add(str.charAt(i));
         }
         else
             break;
        }
        System.out.println(builder);
        List<Integer> num=new ArrayList<>();
        num.add(3);
        num.add(9);
        num.add(6);
        num.add(4);
        List<Integer> collect = num.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
