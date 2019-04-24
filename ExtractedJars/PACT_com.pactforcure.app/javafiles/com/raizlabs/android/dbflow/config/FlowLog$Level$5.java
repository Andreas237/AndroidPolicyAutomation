// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.util.Log;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			FlowLog

static final class FlowLog$Level$5 extends FlowLog.Level
{

	void call(String s, String s1, Throwable throwable)
	{
		Log.e(s, s1, throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #21  <Method int Log.e(String, String, Throwable)>
	//    4    6:pop             
	//    5    7:return          
	}

	FlowLog$Level$5(String s, int i)
	{
		super(s, i, ((FlowLog._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
	//    5    7:return          
	}
}
