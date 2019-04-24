// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.*;

// Referenced classes of package android.support.v4.content:
//			LocalBroadcastManager

class LocalBroadcastManager$1 extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               1: 27
	//*   3   24:goto            35
		case 1: // '\001'
			LocalBroadcastManager.access$000(LocalBroadcastManager.this);
	//    4   27:aload_0         
	//    5   28:getfield        #14  <Field LocalBroadcastManager this$0>
	//    6   31:invokestatic    #30  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
			return;
	//    7   34:return          
		}
		super.handleMessage(message);
	//    8   35:aload_0         
	//    9   36:aload_1         
	//   10   37:invokespecial   #32  <Method void Handler.handleMessage(Message)>
	//   11   40:return          
	}

	final LocalBroadcastManager this$0;

	LocalBroadcastManager$1(Looper looper)
	{
		this$0 = LocalBroadcastManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LocalBroadcastManager this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
