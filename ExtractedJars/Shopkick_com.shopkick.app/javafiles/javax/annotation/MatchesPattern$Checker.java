// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation;

import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

// Referenced classes of package javax.annotation:
//			MatchesPattern

public static class MatchesPattern$Checker
	implements TypeQualifierValidator
{

	public volatile When forConstantValue(Annotation annotation, Object obj)
	{
		return forConstantValue((MatchesPattern)annotation, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class MatchesPattern>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #20  <Method When forConstantValue(MatchesPattern, Object)>
	//    5    9:areturn         
	}

	public When forConstantValue(MatchesPattern matchespattern, Object obj)
	{
		if(Pattern.compile(matchespattern.value(), matchespattern.flags()).matcher(((CharSequence) ((String)obj))).matches())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #24  <Method String MatchesPattern.value()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #28  <Method int MatchesPattern.flags()>
	//*   4   12:invokestatic    #34  <Method Pattern Pattern.compile(String, int)>
	//*   5   15:aload_2         
	//*   6   16:checkcast       #36  <Class String>
	//*   7   19:invokevirtual   #40  <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   22:invokevirtual   #46  <Method boolean Matcher.matches()>
	//*   9   25:ifeq            32
			return When.ALWAYS;
	//   10   28:getstatic       #52  <Field When When.ALWAYS>
	//   11   31:areturn         
		else
			return When.NEVER;
	//   12   32:getstatic       #55  <Field When When.NEVER>
	//   13   35:areturn         
	}

	public MatchesPattern$Checker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
