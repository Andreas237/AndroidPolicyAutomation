// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.exoplayer:
//			ExoPlayerImpl

class ExoPlayerImpl$1 extends Handler
{

	public void handleMessage(Message message)
	{
		handleEvent(message);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ExoPlayerImpl this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void ExoPlayerImpl.handleEvent(Message)>
	//    4    8:return          
	}

	final ExoPlayerImpl this$0;

	ExoPlayerImpl$1()
	{
		this$0 = ExoPlayerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ExoPlayerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Handler()>
	//    5    9:return          
	}
}
