// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


// Referenced classes of package ch.qos.logback.core.pattern:
//			Converter

public final class LiteralConverter extends Converter
{

	public LiteralConverter(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Converter()>
		literal = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String literal>
	//    5    9:return          
	}

	public String convert(Object obj)
	{
		return literal;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String literal>
	//    2    4:areturn         
	}

	String literal;
}
