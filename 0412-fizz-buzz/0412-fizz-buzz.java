    class Solution {
        public List<String> fizzBuzz(int n) {
            final String[] ans = new String[n];
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    ans[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    ans[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    ans[i - 1] = "Buzz";
                } else {
                    ans[i - 1] = String.valueOf(i);
                }
            }
            return List.of(ans);
        }
    }
