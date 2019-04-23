// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqh, wx, bqa, bqg, 
//			bqd, bqc, bqf, bqb, 
//			bqe

final class bpz
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public bpz(Application application, android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean c>
		b = new WeakReference(((Object) (activitylifecyclecallbacks)));
	//    5    9:aload_0         
	//    6   10:new             #21  <Class WeakReference>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #24  <Method void WeakReference(Object)>
	//   10   18:putfield        #26  <Field WeakReference b>
		a = application;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #28  <Field Application a>
	//   14   26:return          
	}

	private final void a(bqh bqh1)
	{
		android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)b.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference b>
	//    2    4:invokevirtual   #36  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.app.Application$ActivityLifecycleCallbacks>
	//    4   10:astore_2        
		if(activitylifecyclecallbacks != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
		{
			try
			{
				bqh1.a(activitylifecyclecallbacks);
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #41  <Method void bqh.a(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   10   22:return          
			}
	//*  11   23:aload_0         
	//*  12   24:getfield        #19  <Field boolean c>
	//*  13   27:ifne            43
	//*  14   30:aload_0         
	//*  15   31:getfield        #28  <Field Application a>
	//*  16   34:aload_0         
	//*  17   35:invokevirtual   #46  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//*  18   38:aload_0         
	//*  19   39:iconst_1        
	//*  20   40:putfield        #19  <Field boolean c>
	//*  21   43:return          
			// Misplaced declaration of an exception variable
			catch(bqh bqh1)
	//*  22   44:astore_1        
			{
				wx.b("Error while dispatching lifecycle callback.", ((Throwable) (bqh1)));
	//   23   45:ldc1            #48  <String "Error while dispatching lifecycle callback.">
	//   24   47:aload_1         
	//   25   48:invokestatic    #53  <Method void wx.b(String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_51;
		}
		if(!c)
		{
			a.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
			c = true;
		}
		return;
	//   26   51:return          
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		a(((bqh) (new bqa(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #57  <Class bqa>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #60  <Method void bqa(bpz, Activity, Bundle)>
	//    7   11:invokespecial   #62  <Method void a(bqh)>
	//    8   14:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		a(((bqh) (new bqg(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #66  <Class bqg>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #69  <Method void bqg(bpz, Activity)>
	//    6   10:invokespecial   #62  <Method void a(bqh)>
	//    7   13:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		a(((bqh) (new bqd(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #72  <Class bqd>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #73  <Method void bqd(bpz, Activity)>
	//    6   10:invokespecial   #62  <Method void a(bqh)>
	//    7   13:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		a(((bqh) (new bqc(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #76  <Class bqc>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #77  <Method void bqc(bpz, Activity)>
	//    6   10:invokespecial   #62  <Method void a(bqh)>
	//    7   13:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		a(((bqh) (new bqf(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #80  <Class bqf>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #81  <Method void bqf(bpz, Activity, Bundle)>
	//    7   11:invokespecial   #62  <Method void a(bqh)>
	//    8   14:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		a(((bqh) (new bqb(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #84  <Class bqb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #85  <Method void bqb(bpz, Activity)>
	//    6   10:invokespecial   #62  <Method void a(bqh)>
	//    7   13:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		a(((bqh) (new bqe(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #88  <Class bqe>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #89  <Method void bqe(bpz, Activity)>
	//    6   10:invokespecial   #62  <Method void a(bqh)>
	//    7   13:return          
	}

	private final Application a;
	private final WeakReference b;
	private boolean c;
}
