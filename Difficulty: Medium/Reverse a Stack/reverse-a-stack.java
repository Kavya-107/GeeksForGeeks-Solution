class Solution {
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        
        st.addAll(s);
    }
}
