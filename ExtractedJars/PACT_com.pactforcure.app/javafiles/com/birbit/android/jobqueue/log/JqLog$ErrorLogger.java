// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.log;

import android.util.Log;

// Referenced classes of package com.birbit.android.jobqueue.log:
//			CustomLogger, JqLog

public static class JqLog$ErrorLogger
	implements CustomLogger
{

	public transient void d(String s, Object aobj[])
	{
	//    0    0:return          
	}

	public transient void e(String s, Object aobj[])
	{
		Log.e("JobManager", String.format(s, aobj));
	//    0    0:ldc1            #13  <String "JobManager">
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokestatic    #27  <Method String String.format(String, Object[])>
	//    4    7:invokestatic    #32  <Method int Log.e(String, String)>
	//    5   10:pop             
	//    6   11:return          
	}

	public transient void e(Throwable throwable, String s, Object aobj[])
	{
		Log.e("JobManager", String.format(s, aobj), throwable);
	//    0    0:ldc1            #13  <String "JobManager">
	//    1    2:aload_2         
	//    2    3:aload_3         
	//    3    4:invokestatic    #27  <Method String String.format(String, Object[])>
	//    4    7:aload_1         
	//    5    8:invokestatic    #36  <Method int Log.e(String, String, Throwable)>
	//    6   11:pop             
	//    7   12:return          
	}

	public boolean isDebugEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public transient void v(String s, Object aobj[])
	{
	//    0    0:return          
	}

	private static final String TAG = "JobManager";

	public JqLog$ErrorLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
