// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.baidu.android.pushservice:
//			PushMessageReceiver

class PushMessageReceiver$1 extends PushMessageReceiver$a
{

	public void handleMessage(Message message)
	{
		if(d.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field WeakReference d>
	//*   2    4:invokevirtual   #39  <Method Object WeakReference.get()>
	//*   3    7:ifnull          62
		{
			c.onMessage((Context)d.get(), message.getData().getString("message"), message.getData().getString("custom_content"));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field PushMessageReceiver c>
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field WeakReference d>
	//    8   18:invokevirtual   #39  <Method Object WeakReference.get()>
	//    9   21:checkcast       #41  <Class Context>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #47  <Method Bundle Message.getData()>
	//   12   28:ldc1            #49  <String "message">
	//   13   30:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   14   33:aload_1         
	//   15   34:invokevirtual   #47  <Method Bundle Message.getData()>
	//   16   37:ldc1            #57  <String "custom_content">
	//   17   39:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   18   42:invokevirtual   #61  <Method void PushMessageReceiver.onMessage(Context, String, String)>
			PushMessageReceiver.access$000(c, a, b, 10);
	//   19   45:aload_0         
	//   20   46:getfield        #19  <Field PushMessageReceiver c>
	//   21   49:aload_0         
	//   22   50:getfield        #21  <Field Context a>
	//   23   53:aload_0         
	//   24   54:getfield        #23  <Field Intent b>
	//   25   57:bipush          10
	//   26   59:invokestatic    #65  <Method void PushMessageReceiver.access$000(PushMessageReceiver, Context, Intent, int)>
		}
	//   27   62:return          
	}

	final Context a;
	final Intent b;
	final PushMessageReceiver c;

	PushMessageReceiver$1(PushMessageReceiver pushmessagereceiver, Context context, Context context1, Intent intent)
	{
		c = pushmessagereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PushMessageReceiver c>
		a = context1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field Context a>
		b = intent;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #23  <Field Intent b>
		super(context);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #26  <Method void PushMessageReceiver$a(Context)>
	//   12   21:return          
	}
}
