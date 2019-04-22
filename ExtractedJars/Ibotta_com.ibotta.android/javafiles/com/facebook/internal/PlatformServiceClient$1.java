// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.internal:
//			PlatformServiceClient

class PlatformServiceClient$1 extends Handler
{

	public void handleMessage(Message message)
	{
		PlatformServiceClient.this.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PlatformServiceClient this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method void PlatformServiceClient.handleMessage(Message)>
	//    4    8:return          
	}

	final PlatformServiceClient this$0;

	PlatformServiceClient$1()
	{
		this$0 = PlatformServiceClient.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PlatformServiceClient this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Handler()>
	//    5    9:return          
	}
}
