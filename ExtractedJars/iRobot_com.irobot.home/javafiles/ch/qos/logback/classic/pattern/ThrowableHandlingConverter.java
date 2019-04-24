// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;


// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public abstract class ThrowableHandlingConverter extends ClassicConverter
{

	public ThrowableHandlingConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ClassicConverter()>
	//    2    4:return          
	}

	boolean handlesThrowable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
