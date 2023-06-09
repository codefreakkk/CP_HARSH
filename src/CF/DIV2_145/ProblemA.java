
import java.util.*;
import java.io.*;

public class ProblemA {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException, Exception {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();

            // code here
            int t=in.nextInt();
            while(t-- > 0) {
                String num = in.nextLine();
                HashMap<Character, Integer> map = new HashMap<>();
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

                for (int i = 0; i < num.length(); i++) {
                    char ch = num.charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                    pq.offer(map.get(ch));
                }
                int top = pq.poll();
                if (top == 1 || top == 2) {
                    System.out.println(4);
                }
                else if (top == 4) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(6);
                }
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



