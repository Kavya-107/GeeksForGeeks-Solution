class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer> h = new HashSet<>();
        
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            h.add(b[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>(h);
        return list;
    }
}