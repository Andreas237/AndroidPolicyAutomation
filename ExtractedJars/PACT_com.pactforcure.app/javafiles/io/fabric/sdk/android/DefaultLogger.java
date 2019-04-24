// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.util.Log;

// Referenced classes of package io.fabric.sdk.android:
//			Logger

public class DefaultLogger
	implements Logger
{

	public DefaultLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		logLevel = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #14  <Field int logLevel>
	//    5    9:return          
	}

	public DefaultLogger(int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		logLevel = j;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int logLevel>
	//    5    9:return          
	}

	public void d(String s, String s1)
	{
		d(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #21  <Method void d(String, String, Throwable)>
	//    5    7:return          
	}

	public void d(String s, String s1, Throwable throwable)
	{
		if(isLoggable(s, 3))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_3        
	//*   3    3:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   4    6:ifeq            16
			Log.d(s, s1, throwable);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #30  <Method int Log.d(String, String, Throwable)>
	//    9   15:pop             
	//   10   16:return          
	}

	public void e(String s, String s1)
	{
		e(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #33  <Method void e(String, String, Throwable)>
	//    5    7:return          
	}

	public void e(String s, String s1, Throwable throwable)
	{
		if(isLoggable(s, 6))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:bipush          6
	//*   3    4:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   4    7:ifeq            17
			Log.e(s, s1, throwable);
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokestatic    #35  <Method int Log.e(String, String, Throwable)>
	//    9   16:pop             
	//   10   17:return          
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
		i(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #40  <Method void i(String, String, Throwable)>
	//    5    7:return          
	}

	public void i(String s, String s1, Throwable throwable)
	{
		if(isLoggable(s, 4))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_4        
	//*   3    3:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   4    6:ifeq            16
			Log.i(s, s1, throwable);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #42  <Method int Log.i(String, String, Throwable)>
	//    9   15:pop             
	//   10   16:return          
	}

	public boolean isLoggable(String s, int j)
	{
		return logLevel <= j;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int logLevel>
	//    2    4:iload_2         
	//    3    5:icmpgt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void log(int j, String s, String s1)
	{
		log(j, s, s1, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #47  <Method void log(int, String, String, boolean)>
	//    6    8:return          
	}

	public void log(int j, String s, String s1, boolean flag)
	{
		if(flag || isLoggable(s, j))
	//*   0    0:iload           4
	//*   1    2:ifne            14
	//*   2    5:aload_0         
	//*   3    6:aload_2         
	//*   4    7:iload_1         
	//*   5    8:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   6   11:ifeq            21
			Log.println(j, s, s1);
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:invokestatic    #51  <Method int Log.println(int, String, String)>
	//   11   20:pop             
	//   12   21:return          
	}

	public void setLogLevel(int j)
	{
		logLevel = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field int logLevel>
	//    3    5:return          
	}

	public void v(String s, String s1)
	{
		v(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #55  <Method void v(String, String, Throwable)>
	//    5    7:return          
	}

	public void v(String s, String s1, Throwable throwable)
	{
		if(isLoggable(s, 2))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_2        
	//*   3    3:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   4    6:ifeq            16
			Log.v(s, s1, throwable);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #57  <Method int Log.v(String, String, Throwable)>
	//    9   15:pop             
	//   10   16:return          
	}

	public void w(String s, String s1)
	{
		w(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #60  <Method void w(String, String, Throwable)>
	//    5    7:return          
	}

	public void w(String s, String s1, Throwable throwable)
	{
		if(isLoggable(s, 5))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_5        
	//*   3    3:invokevirtual   #25  <Method boolean isLoggable(String, int)>
	//*   4    6:ifeq            16
			Log.w(s, s1, throwable);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #62  <Method int Log.w(String, String, Throwable)>
	//    9   15:pop             
	//   10   16:return          
	}

	private int logLevel;
}
