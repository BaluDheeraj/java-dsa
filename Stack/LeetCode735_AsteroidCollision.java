class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (stack.peek() < -a) {
                    stack.pop();          
                    continue;
                } else if (stack.peek() == -a) {
                    stack.pop();           
                }
                destroyed = true;         
                break;
            }
            if (!destroyed) {
                stack.push(a);
            }
        }
        int n = stack.size();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}

