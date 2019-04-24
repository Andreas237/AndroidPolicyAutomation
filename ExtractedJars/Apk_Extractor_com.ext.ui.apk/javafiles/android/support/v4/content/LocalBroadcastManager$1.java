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
	//*   2    4:tableswitch     1 1: default 24
	//	               1 30
		default:
			super.handleMessage(message);
	//    3   24:aload_0         
	//    4   25:aload_1         
	//    5   26:invokespecial   #28  <Method void Handler.handleMessage(Message)>
			return;
	//    6   29:return          

		case 1: // '\001'
			LocalBroadcastManager.access$000(LocalBroadcastManager.this);
	//    7   30:aload_0         
	//    8   31:getfield        #14  <Field LocalBroadcastManager this$0>
	//    9   34:invokestatic    #32  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
			break;
		}
	//   10   37:return          
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
