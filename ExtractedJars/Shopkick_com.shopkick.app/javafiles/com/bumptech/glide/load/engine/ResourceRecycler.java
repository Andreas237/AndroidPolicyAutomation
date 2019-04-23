// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.*;
import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Resource

class ResourceRecycler
{
	private static final class ResourceRecyclerCallback
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

		ResourceRecyclerCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	ResourceRecycler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #23  <Method Looper Looper.getMainLooper()>
	//    6   12:new             #6   <Class ResourceRecycler$ResourceRecyclerCallback>
	//    7   15:dup             
	//    8   16:invokespecial   #24  <Method void ResourceRecycler$ResourceRecyclerCallback()>
	//    9   19:invokespecial   #27  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   10   22:putfield        #29  <Field Handler handler>
	//   11   25:return          
	}

	void recycle(Resource resource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #37  <Method void Util.assertMainThread()>
		if(isRecycling)
	//*   1    3:aload_0         
	//*   2    4:getfield        #39  <Field boolean isRecycling>
	//*   3    7:ifeq            23
		{
			handler.obtainMessage(1, ((Object) (resource))).sendToTarget();
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field Handler handler>
	//    6   14:iconst_1        
	//    7   15:aload_1         
	//    8   16:invokevirtual   #43  <Method Message Handler.obtainMessage(int, Object)>
	//    9   19:invokevirtual   #48  <Method void Message.sendToTarget()>
			return;
	//   10   22:return          
		} else
		{
			isRecycling = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #39  <Field boolean isRecycling>
			resource.recycle();
	//   14   28:aload_1         
	//   15   29:invokeinterface #52  <Method void Resource.recycle()>
			isRecycling = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #39  <Field boolean isRecycling>
			return;
	//   19   39:return          
		}
	}

	private final Handler handler = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new ResourceRecyclerCallback())));
	private boolean isRecycling;
}
