// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;


// Referenced classes of package io.fabric.sdk.android:
//			Logger

public class SilentLogger
	implements Logger
{

	public SilentLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		logLevel = 7;
	//    2    4:aload_0         
	//    3    5:bipush          7
	//    4    7:putfield        #14  <Field int logLevel>
	//    5   10:return          
	}

	public void d(String s, String s1)
	{
	//    0    0:return          
	}

	public void d(String s, String s1, Throwable throwable)
	{
	//    0    0:return          
	}

	public void e(String s, String s1)
	{
	//    0    0:return          
	}

	public void e(String s, String s1, Throwable throwable)
	{
	//    0    0:return          
	}

	public int getLogLevel()
	{
		return logLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int logLevel>
	//    2    4:ireturn         
	}

	public void i(String s, String s1)
	{
	//    0    0:return          
	}

	public void i(String s, String s1, Throwable throwable)
	{
	//    0    0:return          
	}

	public boolean isLoggable(String s, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void log(int j, String s, String s1)
	{
	//    0    0:return          
	}

	public void log(int j, String s, String s1, boolean flag)
	{
	//    0    0:return          
	}

	public void setLogLevel(int j)
	{
	//    0    0:return          
	}

	public void v(String s, String s1)
	{
	//    0    0:return          
	}

	public void v(String s, String s1, Throwable throwable)
	{
	//    0    0:return          
	}

	public void w(String s, String s1)
	{
	//    0    0:return          
	}

	public void w(String s, String s1, Throwable throwable)
	{
	//    0    0:return          
	}

	private int logLevel;
}
