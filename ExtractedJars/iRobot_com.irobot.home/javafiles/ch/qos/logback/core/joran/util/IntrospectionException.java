// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;


public class IntrospectionException extends RuntimeException
{

	public IntrospectionException(Exception exception)
	{
		super(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}

	public IntrospectionException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void RuntimeException(String)>
	//    3    5:return          
	}

	private static final long serialVersionUID = 0x8ad8d402L;
}
