import java.util.Stack;

public class  bottomP
{
    public static void pushBI(Stack<Integer>st,int x)
    {
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushBI(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st)
    {
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);

        pushBI(st,top);
    }
    public static void main(String[] args)
    {
        Stack<Integer>st=new Stack<>();
        st.push(30);
        st.push(12);
        st.push(29);
        st.push(98);
        st.push(132);
        System.out.println(st);

        reverse(st);
        System.out.println(st);
    }
}