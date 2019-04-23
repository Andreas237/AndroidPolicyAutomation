// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.engine:
//			ResourceRecycler, Resource

private static final class ResourceRecycler$ResourceRecyclerCallback
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          22
		{
			((Resource)message.obj).recycle();
	//    4    8:aload_1         
	//    5    9:getfield        #28  <Field Object Message.obj>
	//    6   12:checkcast       #30  <Class Resource>
	//    7   15:invokeinterface #33  <Method void Resource.recycle()>
			return true;
	//    8   20:iconst_1        
	//    9   21:ireturn         
		} else
		{
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		}
	}

	static final int RECYCLE_RESOURCE = 1;

	ResourceRecycler$ResourceRecyclerCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
