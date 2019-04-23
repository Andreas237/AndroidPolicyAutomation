// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public interface RegEx
	extends Annotation
{
	public static class Checker
		implements TypeQualifierValidator
	{

		public volatile When forConstantValue(Annotation annotation, Object obj)
		{
			return forConstantValue((RegEx)annotation, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class RegEx>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #20  <Method When forConstantValue(RegEx, Object)>
		//    5    9:areturn         
		}

		public When forConstantValue(RegEx regex, Object obj)
		{
			if(!(obj instanceof String))
		//*   0    0:aload_2         
		//*   1    1:instanceof      #24  <Class String>
		//*   2    4:ifne            11
				return When.NEVER;
		//    3    7:getstatic       #30  <Field When When.NEVER>
		//    4   10:areturn         
			try
			{
				Pattern.compile((String)obj);
		//    5   11:aload_2         
		//    6   12:checkcast       #24  <Class String>
		//    7   15:invokestatic    #36  <Method Pattern Pattern.compile(String)>
		//    8   18:pop             
			}
		//*   9   19:getstatic       #39  <Field When When.ALWAYS>
		//*  10   22:areturn         
		//*  11   23:getstatic       #30  <Field When When.NEVER>
		//*  12   26:areturn         
			// Misplaced declaration of an exception variable
			catch(RegEx regex)
			{
				return When.NEVER;
			}
			return When.ALWAYS;
		//*  13   27:astore_1        
		//*  14   28:goto            23
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
