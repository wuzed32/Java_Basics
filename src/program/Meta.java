package program;

import java.lang.reflect.Method;

public class Meta {
	
	@MyAnno(str = "Метод принимает объект, который выводит на экран", value = 100)
	public static void meth() {
		Meta ob = new Meta();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("meth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.value());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
