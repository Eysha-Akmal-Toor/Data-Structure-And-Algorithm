package postfixtoinfixconversion;

public class Functions extends Operators{

    String PostfixToInfix(String postfix) {
        Operators operators = new Operators();
        String c = null;

        for (int i = 0; i <= postfix.length() - 1; i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetter(postfix.charAt(i))||Character.isDigit(postfix.charAt(i))) {
                operators.Push(ch + "");
            } else {
                String operand1 = operators.Pop(c);
                String operand2 = operators.Pop(c);
                operators.Push("(" + operand2 + "" + ch + "" + operand1 + ")");
            }
        }
        return operators.Pop(c);
    }
}
