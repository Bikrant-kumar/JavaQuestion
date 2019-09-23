import java.util.Scanner;
import java.util.HashMap;
class Solution{

    int number,first,last;
    int count1=0;
    int count =0;
    int[] arr = new int[24];

    public int solution( int A,int B, int C, int D)
    {
        int a = A*1000+B*100+C*10+D;
        String st = String.valueOf(a);
        permute(st,0,3);
        distinctvalue();
        return count1;
    }   

    void distinctvalue()
    {
        int g =count;
        for (int i = 0; i < g; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) {
            count1++;}
        } 
        }
    
     void permute(String str, int l,int r) 
    
    { 
           if (l == r) {
            number = Integer.parseInt(str);
            first = number/100;
            last = number%100;
            if (first <24 && last<60){
              arr[count] = number;
               count ++;
               }}
        else{ 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    
        } 
  
  
public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  

    public static void main(String[] args) 
    { 
        int A,B,C,D,E;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 different numbers in between 0 to 9: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        Solution permutation = new Solution(); 
        E = permutation.solution(A,B,C,D);
        System.out.println("the total correct sequence of timming is:");
        System.out.println(E);
    } 
} 
  