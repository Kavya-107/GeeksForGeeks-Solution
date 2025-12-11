// User function Template for Java
class Solution {
    
    private void rec(int x,Stack<Integer> st)
    {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int i = st.peek();
        st.pop();
        rec(x,st);
        st.push(i);
    }
    
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        rec(x,st);
        return st;
    }
}