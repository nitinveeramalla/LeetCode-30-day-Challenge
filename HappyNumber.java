class Solution {
    public boolean isHappy(int n) {
        Set<Integer> value = new HashSet<Integer>();    
        while(value.add(n)){
            int sum = 0;
            while(n>0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            n=sum;
        }
        if(n==1){return true;}
        return false;
    }
}
