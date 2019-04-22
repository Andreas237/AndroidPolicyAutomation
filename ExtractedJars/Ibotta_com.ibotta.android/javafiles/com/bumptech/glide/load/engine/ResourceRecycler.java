// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.*;

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
		//*   1    1:getfield        #22  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          22
			{
				((Resource)message.obj).recycle();
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Object Message.obj>
		//    6   12:checkcast       #28  <Class Resource>
		//    7   15:invokeinterface #31  <Method void Resource.recycle()>
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

		ResourceRecyclerCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isRecycling)
	//*   2    2:aload_0         
	//*   3    3:getfield        #34  <Field boolean isRecycling>
	//*   4    6:ifeq            24
		{
			handler.obtainMessage(1, ((Object) (resource))).sendToTarget();
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Handler handler>
	//    7   13:iconst_1        
	//    8   14:aload_1         
	//    9   15:invokevirtual   #38  <Method Message Handler.obtainMessage(int, Object)>
	//   10   18:invokevirtual   #43  <Method void Message.sendToTarget()>
			break MISSING_BLOCK_LABEL_40;
	//   11   21:goto            40
		}
		isRecycling = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #34  <Field boolean isRecycling>
		resource.recycle();
	//   15   29:aload_1         
	//   16   30:invokeinterface #47  <Method void Resource.recycle()>
		isRecycling = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #34  <Field boolean isRecycling>
		this;
	//   20   40:aload_0         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		resource;
	//   23   43:astore_1        
	//*  24   44:aload_0         
		throw resource;
	//   25   45:monitorexit     
	//   26   46:aload_1         
	//   27   47:athrow          
	}

	private final Handler handler = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new ResourceRecyclerCallback())));
	private boolean isRecycling;
}
