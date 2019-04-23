// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.engine:
//			ActiveResources

class ActiveResources$1
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          24
		{
			cleanupActiveReference((sourceWeakReference)message.obj);
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field ActiveResources this$0>
	//    6   12:aload_1         
	//    7   13:getfield        #30  <Field Object Message.obj>
	//    8   16:checkcast       #32  <Class ActiveResources$ResourceWeakReference>
	//    9   19:invokevirtual   #36  <Method void ActiveResources.cleanupActiveReference(ActiveResources$ResourceWeakReference)>
			return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	final ActiveResources this$0;

	ActiveResources$1()
	{
		this$0 = ActiveResources.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActiveResources this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
