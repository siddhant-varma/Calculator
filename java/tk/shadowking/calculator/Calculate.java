package tk.shadowking.calculator;

import java.util.Stack;

class Calculate
{
    static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            if(Character.isDigit(c))
                stack.push(c - '0');

            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

