class Solution {
    
    public void rec(ArrayList<Integer> r,int n)
    {
        if(n <= 0){
            r.add(n);
            return;
        }
        r.add(n);
        rec(r,n-5);
        r.add(n);
    }
    
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> r = new ArrayList<Integer>();
        if(n<=0){
            r.add(n);
            return r;
        }
        rec(r,n);
        return r;
    }
}