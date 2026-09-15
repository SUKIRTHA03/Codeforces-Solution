import java.util.*;
public class BEraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
          int n=sc.nextInt();
          String s=sc.next();
          int cnt=0;
          int ans=0;
          int[] vis = new int[26];
          for(int i=0;i<n;i++){
            char c = sc.charAt(i);
            if(vis[c-'a']==0){
                vis[c-'a']=1;
                cnt++;
            }
            ans+=cnt;
          }
          System.out.println(ans);
        }
    }
}