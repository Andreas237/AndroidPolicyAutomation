// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.util.Log;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			FlowLog

static final class FlowLog$Level$6 extends FlowLog.Level
{

	void call(String s, String s1, Throwable throwable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          8
	//*   2    5:icmplt          16
		{
			Log.wtf(s, s1, throwable);
	//    3    8:aload_1         
	//    4    9:aload_2         
	//    5   10:aload_3         
	//    6   11:invokestatic    #27  <Method int Log.wtf(String, String, Throwable)>
	//    7   14:pop             
			return;
	//    8   15:return          
		} else
		{
			Log.e(s, (new StringBuilder()).append("!!!!!!!!*******").append(s1).append("********!!!!!!").toString(), throwable);
	//    9   16:aload_1         
	//   10   17:new             #29  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #32  <Method void StringBuilder()>
	//   13   24:ldc1            #34  <String "!!!!!!!!*******">
	//   14   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:ldc1            #40  <String "********!!!!!!">
	//   18   35:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   20   41:aload_3         
	//   21   42:invokestatic    #47  <Method int Log.e(String, String, Throwable)>
	//   22   45:pop             
			return;
	//   23   46:return          
		}
	}

	FlowLog$Level$6(String s, int i)
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
