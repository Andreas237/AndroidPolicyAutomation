// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;


// Referenced classes of package com.itextpdf.text.log:
//			Logger, Level

public final class NoOpLogger
	implements Logger
{

	public NoOpLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void debug(String s)
	{
	//    0    0:return          
	}

	public void error(String s)
	{
	//    0    0:return          
	}

	public void error(String s, Exception exception)
	{
	//    0    0:return          
	}

	public Logger getLogger(Class class1)
	{
		return ((Logger) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Logger getLogger(String s)
	{
		return ((Logger) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void info(String s)
	{
	//    0    0:return          
	}

	public boolean isLogging(Level level)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void trace(String s)
	{
	//    0    0:return          
	}

	public void warn(String s)
	{
	//    0    0:return          
	}
}
