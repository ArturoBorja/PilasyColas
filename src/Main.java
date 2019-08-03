
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a [] = {"1","2","3","4","5","6","7"};
		Imprimir(a);
		Imprimir(Invertir(a));
		String s ="{2+[5-2*(2+1)]}+(8/9)";
		System.out.println(EvaluarExpresion(s));
		String pre = "*+ab-cd";
		System.out.println(pre);
		System.out.println(PrefijoToInfijo(pre));
	}
	public static String PrefijoToInfijo(String pre) {
		String inf ="";
		String a1 ="";
		Pila numero=new Pila();
		for(int a=pre.length()-1;a>=0;a--) {			
			a1=Character.toString(pre.charAt(a));			
			if(a1.equals("+")||a1.equals("-")||a1.equals("*")||a1.equals("/")) {
				inf="("+numero.Pop()+a1+numero.Pop()+")";
				numero.Push(inf);				
			}else {
				numero.Push(a1);				
			}
		}
		return inf;
	}
	public static boolean EvaluarExpresion(String exp) {
		Pila pila01 =new Pila();
		String z="";
		for(int a=0;a<exp.length();a++) {
			switch (exp.charAt(a)) {
			case '[':
				pila01.Push("1");
				break;
			case '{':
				pila01.Push("2");
				break;
			case '(':
				pila01.Push("3");
				break;
			case ']':
				z=pila01.Pop();
				if(z!="1") {
					return false;
				}
				break;
			case '}':
				z=pila01.Pop();
				if(z!="2") {
					return false;
				}
				break;
			case ')':
				z=pila01.Pop();
				if(z!="3") {
					return false;
				}
				break;
			default:
				break;
			}
		}
		if (pila01.EstaVacio()) {
			return true;
		}else {
			return false;
		}
	}
	public static String[] Invertir(String[]nums) {
		Pila pila01=new Pila();
		for(int a=0;a<nums.length;a++) {
			pila01.Push(nums[a]);
		}
		for(int a=0;a<nums.length;a++) {
			nums[a]=pila01.Pop() ;
		}
		return nums;
	}
	public static void Imprimir(String[]nums) {
		System.out.print("{ ");
		for(int a=0;a<nums.length;a++) {
			System.out.print(nums[a]+" ");
		}
		System.out.println("}");
	}
	

}
