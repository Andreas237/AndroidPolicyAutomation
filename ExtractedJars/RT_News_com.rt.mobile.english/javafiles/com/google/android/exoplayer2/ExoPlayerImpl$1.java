// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.*;

// Referenced classes of package com.google.android.exoplayer2:
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

	ExoPlayerImpl$1(Looper looper)
	{
		this$0 = ExoPlayerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ExoPlayerImpl this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
