import javax.management.StandardEmitterMBean;

public class Main {
    public static void main(String[] args) {

//        MyGenericQueue<String> myQueue = new MyGenericQueue();
        String palindromeTest = "s * (s – a) * (s – b) * (s – c)   ";

        String[] tempArr = palindromeTest.toLowerCase().split("");

        if (checkBracket(tempArr)) System.out.println("This is good!");
        else System.out.println("This is not good!");

    }

    public static boolean checkBracket(String[] tempArr) {
        MyGenericStack<String> myStack = new MyGenericStack();
        if (tempArr.length <= 0) return false;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i].equals("("))
                myStack.push(tempArr[i]);

            if (tempArr[i].equals(")")) {
                if (myStack.isEmpty()) return false;
                else {
                    myStack.pop();
                }
            }
        }
        return (myStack.size()==0);

    }


}
