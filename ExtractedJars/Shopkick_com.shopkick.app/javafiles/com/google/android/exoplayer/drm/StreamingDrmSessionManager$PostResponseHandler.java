// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.os.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager

private class StreamingDrmSessionManager$PostResponseHandler extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #28  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 41
	//	               1 29
		default:
			return;
	//    3   28:return          

		case 1: // '\001'
			StreamingDrmSessionManager.access$800(StreamingDrmSessionManager.this, message.obj);
	//    4   29:aload_0         
	//    5   30:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//    6   33:aload_1         
	//    7   34:getfield        #32  <Field Object Message.obj>
	//    8   37:invokestatic    #36  <Method void StreamingDrmSessionManager.access$800(StreamingDrmSessionManager, Object)>
			return;
	//    9   40:return          

		case 0: // '\0'
			StreamingDrmSessionManager.access$700(StreamingDrmSessionManager.this, message.obj);
	//   10   41:aload_0         
	//   11   42:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   12   45:aload_1         
	//   13   46:getfield        #32  <Field Object Message.obj>
	//   14   49:invokestatic    #39  <Method void StreamingDrmSessionManager.access$700(StreamingDrmSessionManager, Object)>
			return;
	//   15   52:return          
		}
	}

	final StreamingDrmSessionManager this$0;

	public StreamingDrmSessionManager$PostResponseHandler(Looper looper)
	{
		this$0 = StreamingDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
