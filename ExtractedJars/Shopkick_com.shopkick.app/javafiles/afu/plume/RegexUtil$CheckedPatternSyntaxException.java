// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.plume;

import java.util.regex.PatternSyntaxException;

// Referenced classes of package afu.plume:
//			RegexUtil

public static class RegexUtil$CheckedPatternSyntaxException extends Exception
{

	public String getDescription()
	{
		return pse.getDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PatternSyntaxException pse>
	//    2    4:invokevirtual   #32  <Method String PatternSyntaxException.getDescription()>
	//    3    7:areturn         
	}

	public int getIndex()
	{
		return pse.getIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PatternSyntaxException pse>
	//    2    4:invokevirtual   #36  <Method int PatternSyntaxException.getIndex()>
	//    3    7:ireturn         
	}

	public String getMessage()
	{
		return pse.getMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PatternSyntaxException pse>
	//    2    4:invokevirtual   #39  <Method String PatternSyntaxException.getMessage()>
	//    3    7:areturn         
	}

	public String getPattern()
	{
		return pse.getPattern();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PatternSyntaxException pse>
	//    2    4:invokevirtual   #42  <Method String PatternSyntaxException.getPattern()>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 0xa4752688L;
	private final PatternSyntaxException pse;

	public RegexUtil$CheckedPatternSyntaxException(String s, String s1, int i)
	{
		this(new PatternSyntaxException(s, s1, i));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class PatternSyntaxException>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #19  <Method void PatternSyntaxException(String, String, int)>
	//    7   11:invokespecial   #22  <Method void RegexUtil$CheckedPatternSyntaxException(PatternSyntaxException)>
	//    8   14:return          
	}

	public RegexUtil$CheckedPatternSyntaxException(PatternSyntaxException patternsyntaxexception)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Exception()>
		pse = patternsyntaxexception;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field PatternSyntaxException pse>
	//    5    9:return          
	}
}
