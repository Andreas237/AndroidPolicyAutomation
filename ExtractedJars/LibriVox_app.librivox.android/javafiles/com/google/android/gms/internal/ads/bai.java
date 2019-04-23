// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bar, bak, baq, ban, 
//			bam, bap, bal, bao

final class bai
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public bai(Application application, android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
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

	private final void a(bar bar1)
	{
		android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks;
		try
		{
			activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)b.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference b>
	//    2    4:invokevirtual   #36  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class android.app.Application$ActivityLifecycleCallbacks>
	//    4   10:astore_2        
		}
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
	//*   7   15:aload_1         
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #41  <Method void bar.a(android.app.Application$ActivityLifecycleCallbacks)>
	//*  10   22:return          
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
		catch(bar bar1)
	//*  22   44:astore_1        
		{
			return;
	//   23   45:return          
		}
		if(activitylifecyclecallbacks == null)
			break MISSING_BLOCK_LABEL_23;
		bar1.a(activitylifecyclecallbacks);
		return;
		if(!c)
		{
			a.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
			c = true;
		}
		return;
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		a(((bar) (new bak(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #50  <Class bak>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #53  <Method void bak(bai, Activity, Bundle)>
	//    7   11:invokespecial   #55  <Method void a(bar)>
	//    8   14:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		a(((bar) (new baq(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #59  <Class baq>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #62  <Method void baq(bai, Activity)>
	//    6   10:invokespecial   #55  <Method void a(bar)>
	//    7   13:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		a(((bar) (new ban(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class ban>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #66  <Method void ban(bai, Activity)>
	//    6   10:invokespecial   #55  <Method void a(bar)>
	//    7   13:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		a(((bar) (new bam(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #69  <Class bam>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #70  <Method void bam(bai, Activity)>
	//    6   10:invokespecial   #55  <Method void a(bar)>
	//    7   13:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		a(((bar) (new bap(this, activity, bundle))));
	//    0    0:aload_0         
	//    1    1:new             #73  <Class bap>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #74  <Method void bap(bai, Activity, Bundle)>
	//    7   11:invokespecial   #55  <Method void a(bar)>
	//    8   14:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		a(((bar) (new bal(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #77  <Class bal>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #78  <Method void bal(bai, Activity)>
	//    6   10:invokespecial   #55  <Method void a(bar)>
	//    7   13:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		a(((bar) (new bao(this, activity))));
	//    0    0:aload_0         
	//    1    1:new             #81  <Class bao>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #82  <Method void bao(bai, Activity)>
	//    6   10:invokespecial   #55  <Method void a(bar)>
	//    7   13:return          
	}

	private final Application a;
	private final WeakReference b;
	private boolean c;
}
