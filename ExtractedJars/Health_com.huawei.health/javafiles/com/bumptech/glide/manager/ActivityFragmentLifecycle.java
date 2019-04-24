// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;
import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			Lifecycle, LifecycleListener

class ActivityFragmentLifecycle
	implements Lifecycle
{

	ActivityFragmentLifecycle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void WeakHashMap()>
	//    6   12:invokestatic    #25  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #27  <Field Set lifecycleListeners>
	//    8   18:return          
	}

	public void addListener(LifecycleListener lifecyclelistener)
	{
		lifecycleListeners.add(((Object) (lifecyclelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set lifecycleListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean Set.add(Object)>
	//    4   10:pop             
		if(isDestroyed)
	//*   5   11:aload_0         
	//*   6   12:getfield        #38  <Field boolean isDestroyed>
	//*   7   15:ifeq            25
		{
			lifecyclelistener.onDestroy();
	//    8   18:aload_1         
	//    9   19:invokeinterface #43  <Method void LifecycleListener.onDestroy()>
			return;
	//   10   24:return          
		}
		if(isStarted)
	//*  11   25:aload_0         
	//*  12   26:getfield        #45  <Field boolean isStarted>
	//*  13   29:ifeq            39
		{
			lifecyclelistener.onStart();
	//   14   32:aload_1         
	//   15   33:invokeinterface #48  <Method void LifecycleListener.onStart()>
			return;
	//   16   38:return          
		} else
		{
			lifecyclelistener.onStop();
	//   17   39:aload_1         
	//   18   40:invokeinterface #51  <Method void LifecycleListener.onStop()>
			return;
	//   19   45:return          
		}
	}

	void onDestroy()
	{
		isDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #38  <Field boolean isDestroyed>
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (lifecycleListeners))).iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onDestroy());
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field Set lifecycleListeners>
	//    5    9:invokestatic    #57  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #63  <Method Iterator List.iterator()>
	//    7   17:astore_1        
	//    8   18:aload_1         
	//    9   19:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_1         
	//   12   28:invokeinterface #73  <Method Object Iterator.next()>
	//   13   33:checkcast       #40  <Class LifecycleListener>
	//   14   36:invokeinterface #43  <Method void LifecycleListener.onDestroy()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	void onStart()
	{
		isStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean isStarted>
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (lifecycleListeners))).iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onStart());
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field Set lifecycleListeners>
	//    5    9:invokestatic    #57  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #63  <Method Iterator List.iterator()>
	//    7   17:astore_1        
	//    8   18:aload_1         
	//    9   19:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_1         
	//   12   28:invokeinterface #73  <Method Object Iterator.next()>
	//   13   33:checkcast       #40  <Class LifecycleListener>
	//   14   36:invokeinterface #48  <Method void LifecycleListener.onStart()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	void onStop()
	{
		isStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field boolean isStarted>
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (lifecycleListeners))).iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onStop());
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field Set lifecycleListeners>
	//    5    9:invokestatic    #57  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #63  <Method Iterator List.iterator()>
	//    7   17:astore_1        
	//    8   18:aload_1         
	//    9   19:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_1         
	//   12   28:invokeinterface #73  <Method Object Iterator.next()>
	//   13   33:checkcast       #40  <Class LifecycleListener>
	//   14   36:invokeinterface #51  <Method void LifecycleListener.onStop()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	public void removeListener(LifecycleListener lifecyclelistener)
	{
		lifecycleListeners.remove(((Object) (lifecyclelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set lifecycleListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private boolean isDestroyed;
	private boolean isStarted;
	private final Set lifecycleListeners = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}
