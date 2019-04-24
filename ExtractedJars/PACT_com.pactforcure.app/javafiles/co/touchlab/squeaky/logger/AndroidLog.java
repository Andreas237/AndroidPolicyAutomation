// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.logger;

import android.util.Log;

// Referenced classes of package co.touchlab.squeaky.logger:
//			OLogImpl

public class AndroidLog
	implements OLogImpl
{

	public AndroidLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void d(String s, String s1)
	{
		Log.d(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #18  <Method int Log.d(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void d(String s, String s1, Throwable throwable)
	{
		Log.d(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #22  <Method int Log.d(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	public void e(String s, String s1)
	{
		Log.e(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method int Log.e(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void e(String s, String s1, Throwable throwable)
	{
		Log.e(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #27  <Method int Log.e(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	public void i(String s, String s1)
	{
		Log.i(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #30  <Method int Log.i(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void i(String s, String s1, Throwable throwable)
	{
		Log.i(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #32  <Method int Log.i(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	public void w(String s, String s1)
	{
		Log.w(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #35  <Method int Log.w(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void w(String s, String s1, Throwable throwable)
	{
		Log.w(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #37  <Method int Log.w(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}
}
