import java.util.Scanner;
public class Lovely{
	int a,b,c,d,e,f,g,h,i,j;
	static int count;
	int lovely(int p,int x ){
		if(p==0 && x ==0){
			count++;
		}
		for(int y =p;y<x;y++){
		int r = p;
		String sc = Integer.toString(p);
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
		for(int t =0;t<sc.length();t++){

		int q = r%10;
		r = r/10;
		switch(q){
		 case 1: a++;break;
		 case 2: b++;break;
		 case 3: c++;break;
		 case 4: d++;break;
		 case 5: e++;break;
		 case 6: f++;break;
		 case 7: g++;break;
		 case 8: h++;break;
		 case 9: i++;break;
		 case 0: j++;break;}
		}
			if( a<3 && b<3 && c<3 && d<3 && e<3 && f<3 && g<3 && h<3 && i<3 && j<3){
			count++;
		}
		p++;
	}
	return count;
}
	//p++;}

public static void main(String[] args){
		int z;
		Lovely obj = new Lovely();
		int num1,num2;
		System.out.println("enter two numbers in between i need to find the Lovely numbers");
		Scanner sc = new Scanner(System.in);
		num1= sc.nextInt();
		num2 = sc.nextInt();
		z = obj.lovely(num1,num2);
		System.out.println(z+" is total lovely number in between the given numbers.");
	}
}