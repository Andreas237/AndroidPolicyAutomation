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
		if(message.what != 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          14
		{
			super.handleMessage(message);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #28  <Method void Handler.handleMessage(Message)>
			return;
	//    7   13:return          
		} else
		{
			LocalBroadcastManager.access$000(LocalBroadcastManager.this);
	//    8   14:aload_0         
	//    9   15:getfield        #14  <Field LocalBroadcastManager this$0>
	//   10   18:invokestatic    #32  <Method void LocalBroadcastManager.access$000(LocalBroadcastManager)>
			return;
	//   11   21:return          
		}
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
