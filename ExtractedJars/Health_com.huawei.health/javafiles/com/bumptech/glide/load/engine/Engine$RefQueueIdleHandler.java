// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import java.lang.ref.ReferenceQueue;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine

static class Engine$RefQueueIdleHandler
	implements android.os.MessageQueue.IdleHandler
{

	public boolean queueIdle()
	{
		e e = (e)queue.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ReferenceQueue queue>
	//    2    4:invokevirtual   #35  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//    3    7:checkcast       #37  <Class Engine$ResourceWeakReference>
	//    4   10:astore_1        
		if(e != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          29
			activeResources.remove(((Object) (e.key)));
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field Map activeResources>
	//    9   19:aload_1         
	//   10   20:getfield        #41  <Field com.bumptech.glide.load.Key Engine$ResourceWeakReference.key>
	//   11   23:invokeinterface #47  <Method Object Map.remove(Object)>
	//   12   28:pop             
		return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	private final Map activeResources;
	private final ReferenceQueue queue;

	public Engine$RefQueueIdleHandler(Map map, ReferenceQueue referencequeue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		activeResources = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Map activeResources>
		queue = referencequeue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ReferenceQueue queue>
	//    8   14:return          
	}
}
