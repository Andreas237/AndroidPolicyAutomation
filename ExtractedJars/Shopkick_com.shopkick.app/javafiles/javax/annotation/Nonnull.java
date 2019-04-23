// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public interface Nonnull
	extends Annotation
{
	public static class Checker
		implements TypeQualifierValidator
	{

		public volatile When forConstantValue(Annotation annotation, Object obj)
		{
			return forConstantValue((Nonnull)annotation, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class Nonnull>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #20  <Method When forConstantValue(Nonnull, Object)>
		//    5    9:areturn         
		}

		public When forConstantValue(Nonnull nonnull, Object obj)
		{
			if(obj == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       8
				return When.NEVER;
		//    2    4:getstatic       #26  <Field When When.NEVER>
		//    3    7:areturn         
			else
				return When.ALWAYS;
		//    4    8:getstatic       #29  <Field When When.ALWAYS>
		//    5   11:areturn         
		}

		public Checker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract When when();
}
