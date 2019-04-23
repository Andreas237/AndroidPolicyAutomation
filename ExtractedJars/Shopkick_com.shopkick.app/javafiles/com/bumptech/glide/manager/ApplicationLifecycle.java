// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;


// Referenced classes of package com.bumptech.glide.manager:
//			Lifecycle, LifecycleListener

class ApplicationLifecycle
	implements Lifecycle
{

	ApplicationLifecycle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void addListener(LifecycleListener lifecyclelistener)
	{
		lifecyclelistener.onStart();
	//    0    0:aload_1         
	//    1    1:invokeinterface #19  <Method void LifecycleListener.onStart()>
	//    2    6:return          
	}

	public void removeListener(LifecycleListener lifecyclelistener)
	{
	//    0    0:return          
	}
}
