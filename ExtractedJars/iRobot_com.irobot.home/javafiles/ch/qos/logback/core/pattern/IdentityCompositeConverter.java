// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


// Referenced classes of package ch.qos.logback.core.pattern:
//			CompositeConverter

public class IdentityCompositeConverter extends CompositeConverter
{

	public IdentityCompositeConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void CompositeConverter()>
	//    2    4:return          
	}

	protected String transform(Object obj, String s)
	{
		return s;
	//    0    0:aload_2         
	//    1    1:areturn         
	}
}
