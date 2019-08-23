import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class balancedBracket {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        Stack<Character> ref = new Stack<>();
        char[] data = s.toCharArray();
        int len = data.length;
        for(int i = 0;i<len;i++)
        {
            if(data[i] == '(' || data[i] == '[' || data[i] == '{')
            {
                ref.push(data[i]);
            }
            if(data[i] == ')' || data[i] == '}'|| data[i] == ']')
            {
                if(!ref.empty()) {
                    if (ref.peek() == '(') {
                        ref.pop();
                    } else if (ref.peek() == '{') {
                        ref.pop();
                    } else if (ref.peek() == '[') {
                        ref.pop();
                    } else
                        ref.push(data[i]);
                }
                else
                    return "NO";
            }
        }
        if(ref.empty())
        {
            return "YES";
        }
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "{{[[(())]]}}";
        String s1 = "{)[](}]}]}))}(())(";
        System.out.println(isBalanced(s1));
    }
}
