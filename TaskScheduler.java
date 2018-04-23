/*
64 / 64 test cases passed.
Status: Accepted
Runtime: 10 ms
Beats other java submission by 91.74%
*/
class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq =new int[26];
        Arrays.fill(freq,0);
        int len=tasks.length;
        int time=0;
        for (char c: tasks)
            freq[c - 'A']++;
        int max = 0;
        int count = 1;
        for (int num :freq) {
            if (num == 0) {
                continue;
            }
            if (max < num) {
                max = num;
                count = 1;
            } else if (max == num) {
                count++;
            }
        }
        int space = (n + 1) * (max - 1) + count;
        return (space < tasks.length) ? tasks.length : space;
                
    }
}