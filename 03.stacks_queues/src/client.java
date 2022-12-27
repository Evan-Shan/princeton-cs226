public class client {
    public static void main(String[] args){
        Stack s = new Stack<String>();
        s.push('s');
        s.push('f');
        s.push('k');
        s.push('h');
        for (Object i : s){
           System.out.println(i);
        }
    }
}
