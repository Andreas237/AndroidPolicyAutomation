// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.app.Activity;
import android.app.Application;

// Referenced classes of package com.squareup.leakcanary:
//			Preconditions, RefWatcher

public final class ActivityRefWatcher
{

	public ActivityRefWatcher(Application application1, RefWatcher refwatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ActivityRefWatcher$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #20  <Method void ActivityRefWatcher$1(ActivityRefWatcher)>
	//    7   13:putfield        #22  <Field android.app.Application$ActivityLifecycleCallbacks lifecycleCallbacks>
		application = (Application)Preconditions.checkNotNull(((Object) (application1)), "application");
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #23  <String "application">
	//   11   20:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, String)>
	//   12   23:checkcast       #31  <Class Application>
	//   13   26:putfield        #33  <Field Application application>
		refWatcher = (RefWatcher)Preconditions.checkNotNull(((Object) (refwatcher)), "refWatcher");
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:ldc1            #34  <String "refWatcher">
	//   17   33:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, String)>
	//   18   36:checkcast       #36  <Class RefWatcher>
	//   19   39:putfield        #38  <Field RefWatcher refWatcher>
	//   20   42:return          
	}

	public static void install(Application application1, RefWatcher refwatcher)
	{
		(new ActivityRefWatcher(application1, refwatcher)).watchActivities();
	//    0    0:new             #2   <Class ActivityRefWatcher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #42  <Method void ActivityRefWatcher(Application, RefWatcher)>
	//    5    9:invokevirtual   #45  <Method void watchActivities()>
	//    6   12:return          
	}

	public static void installOnIcsPlus(Application application1, RefWatcher refwatcher)
	{
		install(application1, refwatcher);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #49  <Method void install(Application, RefWatcher)>
	//    3    5:return          
	}

	void onActivityDestroyed(Activity activity)
	{
		refWatcher.watch(((Object) (activity)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field RefWatcher refWatcher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method void RefWatcher.watch(Object)>
	//    4    8:return          
	}

	public void stopWatchingActivities()
	{
		application.unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Application application>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field android.app.Application$ActivityLifecycleCallbacks lifecycleCallbacks>
	//    4    8:invokevirtual   #61  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//    5   11:return          
	}

	public void watchActivities()
	{
		stopWatchingActivities();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method void stopWatchingActivities()>
		application.registerActivityLifecycleCallbacks(lifecycleCallbacks);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Application application>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field android.app.Application$ActivityLifecycleCallbacks lifecycleCallbacks>
	//    6   12:invokevirtual   #66  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//    7   15:return          
	}

	private final Application application;
	private final android.app.Application.ActivityLifecycleCallbacks lifecycleCallbacks = new _cls1();
	private final RefWatcher refWatcher;

	/* member class not found */
	class _cls1 {}

}
