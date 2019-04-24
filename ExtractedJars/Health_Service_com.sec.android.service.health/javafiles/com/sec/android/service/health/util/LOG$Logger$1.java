// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import android.util.Log;

// Referenced classes of package com.sec.android.service.health.util:
//			LOG

static final class LOG$Logger$1 extends LOG.Logger
{

	void d(String s, String s1)
	{
		Log.d(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #20  <Method int Log.d(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1)
	{
		Log.e(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #23  <Method int Log.e(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1, Throwable throwable)
	{
		Log.e(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #27  <Method int Log.e(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	void i(String s, String s1)
	{
		Log.i(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #30  <Method int Log.i(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void v(String s, String s1)
	{
		Log.v(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #33  <Method int Log.v(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void w(String s, String s1)
	{
		Log.w(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #36  <Method int Log.w(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	LOG$Logger$1(String s, int j)
	{
		super(s, j, ((LOG._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #12  <Method void LOG$Logger(String, int, LOG$1)>
	//    5    7:return          
	}
}
