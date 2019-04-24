// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgc, zzakb, zzfv, zzgb, 
//			zzfy, zzfx, zzga, zzfw, 
//			zzfz

final class zzfu
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public zzfu(Application application, android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzagw = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean zzagw>
		zzagv = new WeakReference(((Object) (activitylifecyclecallbacks)));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class WeakReference>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #25  <Method void WeakReference(Object)>
	//   10   18:putfield        #27  <Field WeakReference zzagv>
		zzagd = application;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #29  <Field Application zzagd>
	//   14   26:return          
	}

	private final void zza(zzgc zzgc1)
	{
		android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)zzagv.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference zzagv>
	//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.app.Application$ActivityLifecycleCallbacks>
	//    4   10:astore_2        
		if(activitylifecyclecallbacks != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
		{
			try
			{
				zzgc1.zza(activitylifecyclecallbacks);
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #43  <Method void zzgc.zza(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   10   22:return          
			}
	//*  11   23:aload_0         
	//*  12   24:getfield        #20  <Field boolean zzagw>
	//*  13   27:ifne            43
	//*  14   30:aload_0         
	//*  15   31:getfield        #29  <Field Application zzagd>
	//*  16   34:aload_0         
	//*  17   35:invokevirtual   #48  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//*  18   38:aload_0         
	//*  19   39:iconst_1        
	//*  20   40:putfield        #20  <Field boolean zzagw>
	//*  21   43:return          
			// Misplaced declaration of an exception variable
			catch(zzgc zzgc1)
	//*  22   44:astore_1        
			{
				zzakb.zzb("Error while dispatching lifecycle callback.", ((Throwable) (zzgc1)));
	//   23   45:ldc1            #50  <String "Error while dispatching lifecycle callback.">
	//   24   47:aload_1         
	//   25   48:invokestatic    #56  <Method void zzakb.zzb(String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_51;
		}
		if(!zzagw)
		{
			zzagd.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
			zzagw = true;
		}
		return;
	//   26   51:return          
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		zza(((zzgc) (new zzfv(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #60  <Class zzfv>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #63  <Method void zzfv(zzfu, Activity, Bundle)>
	//    7   11:invokespecial   #65  <Method void zza(zzgc)>
	//    8   14:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		zza(((zzgc) (new zzgb(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #69  <Class zzgb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #72  <Method void zzgb(zzfu, Activity)>
	//    6   10:invokespecial   #65  <Method void zza(zzgc)>
	//    7   13:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		zza(((zzgc) (new zzfy(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #75  <Class zzfy>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #76  <Method void zzfy(zzfu, Activity)>
	//    6   10:invokespecial   #65  <Method void zza(zzgc)>
	//    7   13:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		zza(((zzgc) (new zzfx(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #79  <Class zzfx>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #80  <Method void zzfx(zzfu, Activity)>
	//    6   10:invokespecial   #65  <Method void zza(zzgc)>
	//    7   13:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		zza(((zzgc) (new zzga(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #83  <Class zzga>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #84  <Method void zzga(zzfu, Activity, Bundle)>
	//    7   11:invokespecial   #65  <Method void zza(zzgc)>
	//    8   14:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		zza(((zzgc) (new zzfw(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #87  <Class zzfw>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #88  <Method void zzfw(zzfu, Activity)>
	//    6   10:invokespecial   #65  <Method void zza(zzgc)>
	//    7   13:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		zza(((zzgc) (new zzfz(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #91  <Class zzfz>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #92  <Method void zzfz(zzfu, Activity)>
	//    6   10:invokespecial   #65  <Method void zza(zzgc)>
	//    7   13:return          
	}

	private final Application zzagd;
	private final WeakReference zzagv;
	private boolean zzagw;
}
