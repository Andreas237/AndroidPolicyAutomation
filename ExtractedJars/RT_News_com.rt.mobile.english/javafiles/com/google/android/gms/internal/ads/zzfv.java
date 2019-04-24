// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgc, zzfu

final class zzfv
	implements zzgc
{

	zzfv(zzfu zzfu, Activity activity, Bundle bundle)
	{
		val$activity = activity;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Activity val$activity>
		zzrn = bundle;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field Bundle zzrn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
	{
		activitylifecyclecallbacks.onActivityCreated(val$activity, zzrn);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field Activity val$activity>
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Bundle zzrn>
	//    5    9:invokeinterface #28  <Method void android.app.Application$ActivityLifecycleCallbacks.onActivityCreated(Activity, Bundle)>
	//    6   14:return          
	}

	private final Activity val$activity;
	private final Bundle zzrn;
}
