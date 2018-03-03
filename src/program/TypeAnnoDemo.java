package program;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnno { }

@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

@Target(ElementType.TYPE_USE)
@interface Unique { }

@Target(ElementType.TYPE_USE)
@interface MaxLen {
	int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
	String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK { }

@Target(ElementType.METHOD)
@interface Recomended { }



class TypeAnnoDemo<@What (description = "Данные обобщенного типа") T> {
	
	// Применить типовую аннотацию в конструкторе
	public @Unique TypeAnnoDemo() { }
	
	@TypeAnno String str;
	@EmptyOK String test;
	
	public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
		return 10;
	}
	
	public @TypeAnno int f2(int j, int k) {
		return j + k;
	}
	
	public @Recomended int f3(String str) {
		return str.length() / 2;
	}
	
	public void f4() throws @TypeAnno NullPointerException {
		
	}
	
	String @MaxLen(10) [] @NotZeroLen [] w;
	@TypeAnno int[] vec;
	
	public static void myMeth(int i) {
		TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();
		
		@Unique TypeAnnoDemo<Integer> ob2 = new TypeAnnoDemo<Integer>();
		
		Object x = new Integer(10);
		Integer y;
		
		y = (@TypeAnno Integer)x;
	}
}

class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
	
}
