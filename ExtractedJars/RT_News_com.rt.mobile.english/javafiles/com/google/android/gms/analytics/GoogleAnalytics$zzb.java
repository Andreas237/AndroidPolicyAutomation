// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics:
//			GoogleAnalytics

final class GoogleAnalytics$zzb
	implements android.app.LifecycleCallbacks
{

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public final void onActivityPaused(Activity activity)
	{
	//    0    0:return          
	}

	public final void onActivityResumed(Activity activity)
	{
	//    0    0:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		zzrh.zza(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GoogleAnalytics zzrh>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void GoogleAnalytics.zza(Activity)>
	//    4    8:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		zzrh.zzb(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GoogleAnalytics zzrh>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method void GoogleAnalytics.zzb(Activity)>
	//    4    8:return          
	}

	private final GoogleAnalytics zzrh;

	GoogleAnalytics$zzb(GoogleAnalytics googleanalytics)
	{
		zzrh = googleanalytics;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GoogleAnalytics zzrh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
