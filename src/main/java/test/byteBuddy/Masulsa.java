package test.byteBuddy;

import java.io.File;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

public class Masulsa {
	
	public static void main(String[] args) {
		
		//redfine > Moja 클래스 재정의
		//.method(("pullOut")).intercept(FixedValue.value("Rabbit!")) //pullOut method 가로채기
		
//		try {
//			new ByteBuddy().redefine(Moja.class)
//			  .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//			  .make().saveIn(new File("D:/sy_workspace/theJava_study2/target/classes/"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// 위 코드 실행 한 뒤 주석처리.
		// 소스코드와 상관없이 바이트코드를 변경하는 방법
		
		System.out.println(new Moja().pullOut());
		
	}
}
