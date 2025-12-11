class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        
        Stack<Integer> sort = new Stack<>();
        while(!st.isEmpty()){
            int t = st.pop();
            while(!sort.isEmpty() && t<sort.peek())
            {
                st.push(sort.pop());
                
            }
            sort.push(t);
        }
        
        st.addAll(sort);
    }
}