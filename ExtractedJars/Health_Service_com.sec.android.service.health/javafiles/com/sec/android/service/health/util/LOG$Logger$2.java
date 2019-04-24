// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import android.util.secutil.Log;

// Referenced classes of package com.sec.android.service.health.util:
//			LOG

static final class LOG$Logger$2 extends LOG.Logger
{

	void d(String s, String s1)
	{
		Log.secD(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #21  <Method int Log.secD(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1)
	{
		Log.secE(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method int Log.secE(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1, Throwable throwable)
	{
		Log.secE(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #29  <Method int Log.secE(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	void i(String s, String s1)
	{
		Log.secI(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #33  <Method int Log.secI(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void v(String s, String s1)
	{
		Log.secV(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #37  <Method int Log.secV(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void w(String s, String s1)
	{
		Log.secW(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #41  <Method int Log.secW(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	LOG$Logger$2(String s, int j)
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
