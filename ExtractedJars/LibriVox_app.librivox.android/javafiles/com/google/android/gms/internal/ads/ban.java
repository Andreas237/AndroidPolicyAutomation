// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bar, bai

final class ban
	implements bar
{

	ban(bai bai, Activity activity)
	{
		a = activity;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Activity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks)
	{
		activitylifecyclecallbacks.onActivityPaused(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #12  <Field Activity a>
	//    3    5:invokeinterface #23  <Method void android.app.Application$ActivityLifecycleCallbacks.onActivityPaused(Activity)>
	//    4   10:return          
	}

	private final Activity a;
}
