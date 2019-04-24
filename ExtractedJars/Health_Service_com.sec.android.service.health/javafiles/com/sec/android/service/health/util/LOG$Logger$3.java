// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import com.samsung.android.util.SemLog;

// Referenced classes of package com.sec.android.service.health.util:
//			LOG

static final class LOG$Logger$3 extends LOG.Logger
{

	void d(String s, String s1)
	{
		SemLog.secD(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #21  <Method int SemLog.secD(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1)
	{
		SemLog.secE(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method int SemLog.secE(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void e(String s, String s1, Throwable throwable)
	{
		SemLog.secE(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #29  <Method int SemLog.secE(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	void i(String s, String s1)
	{
		SemLog.secI(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #33  <Method int SemLog.secI(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void v(String s, String s1)
	{
		SemLog.secV(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #37  <Method int SemLog.secV(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	void w(String s, String s1)
	{
		SemLog.secW(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #41  <Method int SemLog.secW(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	LOG$Logger$3(String s, int j)
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
