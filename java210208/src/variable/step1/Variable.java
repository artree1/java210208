package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언
	void methodA(int x) {
		
	}
	double methodB(int x) {//x는 지변 밖에서는 사용불가
		System.out.println(x);//1
		return 3.14;
	}
	//메인 메소드 - exe 파일로 만들 수 있어요.
	/*************************************************************
	 * 문제해결능력 키움
	 * @return void이다. - 비어 있다. - 돌려 받을 수 있는 값이 없다. - 이것 때문에 에러가 발생할 수도 있다.
	 * @param args
	 *************************************************************/
	public static void main(String[] args) {
		//System:너의 컴터 out 속성:출력장치(하드웨어-모니커, 프린터...), print():이건 illegal, print(int i), print(double pi), print("안녕")
		System.out.print(5);//줄바꿈 안 됨, 메소드 호출할 수 있니? 너는??? 주소번지.methodA();
		//메소드 선언할 때는 좌중괄호 우중괄호를 사용하고...
		//메소드 호출할 때는 ;
		//API, XXX.jar, 이 안(클래스[소스가 만들어졌으니까 구체적이다] 안, 객체[결정되지 않았다.Sonata.java, class Sonata{}. 클래스는 구체적-승수, 추상적-대학] 안)에 있는 것을 꺼내쓴다.
		//print 메소드는 여러 개이다. 같은 이름의 메소드를 여러 개 만들 수도 있다.
		//SELECT 이름 FROM 회원 집합
		// WHERE 아이디='test'
		//   AND 비번='123'
		//System.out.print();//줄바꿈 안 됨 - 반환값이 없으니까 에러인거야? 출력결과물//
		Variable v = new Variable();
		System.out.println(v.methodB(1));//1은 파라미타. 3.14
		System.out.println(v.methodA(1));
		//System.out.println(v.methodB(x));
		//System.out.println(v.methodA(x));
		System.out.print(1+" "+1);//줄바꿈 안 됨
		System.out.print(10+10);//줄바꿈 안 됨
		System.out.print(10+"10");//줄바꿈 안 됨
		System.out.print(10+""+10);//줄바꿈 안 됨
		System.out.print(" ");//줄바꿈 안 됨. 빈칸
		System.out.println();//줄바꿈 추가된 메소드
		//파라미터는 사용자가 입력한 값
		
	}

}
