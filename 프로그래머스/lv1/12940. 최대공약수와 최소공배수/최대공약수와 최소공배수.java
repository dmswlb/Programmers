import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n, int m) {
        //최대공약수(GCD)
        int gcd=1;
        Set<Integer> arrN = new HashSet<>();
        Set<Integer> arrM = new HashSet<>();
        for(int i=1; i<=n; i++) if(n%i==0) arrN.add(i);
        for(int i=1; i<=m; i++) if(m%i==0) arrM.add(i);
        for(Integer mm: arrM){
            for(Integer nn: arrN) if(nn.equals(mm) && nn>=gcd) gcd=nn;
        }
        
        //최소공배수(LCM)
        int lcm = n*m/gcd;
        return new int[]{gcd, lcm};
    }
}