package program;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnons.class)
@interface MyAnno {
	String str() default "Тестирование";
	int value() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnons {
	MyAnno[] value();
}

class RepeatAnno {
	@MyAnno(str = "Первая аннотация", value = -1)
	@MyAnno(str = "Вторая аннотация", value = 100)
	public static void myMeth(String str, int i) {
		RepeatAnno ob = new RepeatAnno();
		
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			Annotation anno = m.getAnnotation(MyRepeatedAnnons.class);
			Program.print(anno);
		}
		catch (NoSuchMethodException e) {
			Program.print(e);
		}
	}
}