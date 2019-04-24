// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.amap.api.mapcore.util:
//			ga

class ga$1 extends Handler
{

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Handler.handleMessage(Message)>
		int i = message.arg1;
	//    3    5:aload_1         
	//    4    6:getfield        #28  <Field int Message.arg1>
	//    5    9:istore_2        
		int j = message.arg2;
	//    6   10:aload_1         
	//    7   11:getfield        #31  <Field int Message.arg2>
	//    8   14:istore_3        
		try
		{
			ga.a(a, i, j);
	//    9   15:aload_0         
	//   10   16:getfield        #12  <Field ga a>
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:invokestatic    #34  <Method void ga.a(ga, int, int)>
			return;
	//   14   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*  15   25:astore_1        
		{
			((Exception) (message)).printStackTrace();
	//   16   26:aload_1         
	//   17   27:invokevirtual   #37  <Method void Exception.printStackTrace()>
		}
	//   18   30:return          
	}

	final ga a;

	ga$1(ga ga1)
	{
		a = ga1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ga a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Handler()>
	//    5    9:return          
	}
}
