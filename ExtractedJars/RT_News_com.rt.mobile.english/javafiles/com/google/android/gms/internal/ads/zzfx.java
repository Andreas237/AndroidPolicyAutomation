// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgc, zzfu

final class zzfx
	implements zzgc
{

	zzfx(zzfu zzfu, Activity activity)
	{
		val$activity = activity;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Activity val$activity>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
	{
		activitylifecyclecallbacks.onActivityResumed(val$activity);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #12  <Field Activity val$activity>
	//    3    5:invokeinterface #24  <Method void android.app.Application$ActivityLifecycleCallbacks.onActivityResumed(Activity)>
	//    4   10:return          
	}

	private final Activity val$activity;
}
