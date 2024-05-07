import java.util.Stack;

public class StacksUse {
    public static void main(String[] args) {
        Stack<String> use = new Stack<String>();
        use.add("coc");
        use.add("angrybirds");
        use.add("sugarcrush");

        System.out.println(use.peek());

        System.out.println(use);

        System.out.println();
        Stack<Character> color = new Stack<Character>();

        color.add('G');
        color.add('y');
        color.add('w');

        System.out.println(color.get(2));
    }

}
