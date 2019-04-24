// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;


public class ScanException extends Exception
{

	public ScanException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void Exception(String)>
	//    3    5:return          
	}

	public ScanException(String s, Throwable throwable)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void Exception(String)>
		cause = throwable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Throwable cause>
	//    6   10:return          
	}

	public Throwable getCause()
	{
		return cause;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Throwable cause>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 0x61c8aff6L;
	Throwable cause;
}
