package main.java;

/*Creating class MyStack wich will allow to create the array like a stack(
the ability to access only the last element of an array*/
public class MyStack {
    private int mSize; //mSize-max size of array
    private char[] stackArray; //array
    private int top;       //last index of array

    public MyStack(int m) {
        this.mSize = m;
        stackArray = new char[mSize];
        top = -1;
    }

    public void addElement(char element) {
        stackArray[++top] = element;
    }

    public char deleteElement() {
        return stackArray[top--];
    }

    public char readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }

}

/*Class that allow to check bracket alignment*/
class Check {

    private String input;    //text of file
    private int lenghtInput; //the length of text
    private MyStack stack;   //stack in wich we will add opening brackets

    //in the constructor we implements fields
    public Check(String input) {
        this.input = input;
        this.lenghtInput = input.length();
        stack = new MyStack(lenghtInput);
    }

    /*Method that allow to check bracket alignment
    * if bracket is opening it added to stack
    * if it closed it compare with last element in stack and get the result
    * it reports if the closing bracket is absent
    * or it get information about correct bracket alignment*/
    public void makeCheck() {

        String answer = "";
        for (int i = 0; i < lenghtInput; i++) {

            char ch = input.charAt(i);

            switch (ch) {
                //cases that fill stack
                case '{':
                case '[':
                case '(':
                    stack.addElement(ch);
                    break;
                //cases that check bracket alignment
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char chClosed = stack.deleteElement();

                        //result of incorrect bracket alignment
                        if ((ch == '}' && chClosed != '{')
                                || (ch == ']' && chClosed != '[')
                                || (ch == ')' && chClosed != '(')) {
                            answer = "Incorrect!";
                            System.out.println(answer+" Bracket " + ch + " in " + i + " position");
                        }

                    } else {
                        //result of incorrect bracket alignment
                        answer = "Incorrect!";
                        System.out.println(answer+" Bracket " + ch + " in " + i + " position.");
                    }
                    break;
                default:
                    break;
            }
        }

        //result of absence closing bracket
        if(!stack.isEmpty()){
            answer = "Incorrect!";
            System.out.println(answer+" Closing bracket is absent");
        }

        //result of correct bracket alignment
        if(answer.equals("")){
            System.out.println("Correct!");
        }
    }
}


