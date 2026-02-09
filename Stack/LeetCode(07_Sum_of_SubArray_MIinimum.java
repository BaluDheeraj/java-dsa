class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int[] left= new int[arr.length];
        Arrays.fill(left,-1);
        int[] right = new int[arr.length];
        Arrays.fill(right,arr.length);
          for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
         int mod = (int) 1e9 + 7;
        long answer = 0;
        for (int i = 0; i <arr.length; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) * arr[i] ;
            answer %= mod;
        }
      
        return (int) answer;
      
        
    }
}
