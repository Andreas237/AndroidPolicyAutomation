// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaa

public abstract class ActivityLifecycleObserver
{

	public ActivityLifecycleObserver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static final ActivityLifecycleObserver of(Activity activity)
	{
		return ((ActivityLifecycleObserver) (new zaa(activity)));
	//    0    0:new             #14  <Class zaa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #17  <Method void zaa(Activity)>
	//    4    8:areturn         
	}

	public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);
}
