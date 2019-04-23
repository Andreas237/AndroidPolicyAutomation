// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import android.os.Bundle;
import com.appboy.push.AppboyNotificationRoutingActivity;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

// Referenced classes of package com.appboy:
//			Appboy

public class AppboyLifecycleCallbackListener
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public AppboyLifecycleCallbackListener()
	{
		this(true, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:invokespecial   #14  <Method void AppboyLifecycleCallbackListener(boolean, boolean)>
	//    4    6:return          
	}

	public AppboyLifecycleCallbackListener(boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mRegisterInAppMessageManager = flag1;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #19  <Field boolean mRegisterInAppMessageManager>
		mSessionHandlingEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #21  <Field boolean mSessionHandlingEnabled>
	//    8   14:return          
	}

	private static boolean shouldIgnoreActivity(Activity activity)
	{
		return ((Object) (((Object) (activity)).getClass())).equals(com/appboy/push/AppboyNotificationRoutingActivity);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Class Object.getClass()>
	//    2    4:ldc1            #29  <Class AppboyNotificationRoutingActivity>
	//    3    6:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//    4    9:ireturn         
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		if(mRegisterInAppMessageManager && !shouldIgnoreActivity(activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            24
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #37  <Method boolean shouldIgnoreActivity(Activity)>
	//*   5   11:ifne            24
			AppboyInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(activity.getApplicationContext());
	//    6   14:invokestatic    #43  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #49  <Method android.content.Context Activity.getApplicationContext()>
	//    9   21:invokevirtual   #53  <Method void AppboyInAppMessageManager.ensureSubscribedToInAppMessageEvents(android.content.Context)>
	//   10   24:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
		if(mRegisterInAppMessageManager && !shouldIgnoreActivity(activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            21
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #37  <Method boolean shouldIgnoreActivity(Activity)>
	//*   5   11:ifne            21
			AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
	//    6   14:invokestatic    #43  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #59  <Method void AppboyInAppMessageManager.unregisterInAppMessageManager(Activity)>
	//    9   21:return          
	}

	public void onActivityResumed(Activity activity)
	{
		if(mRegisterInAppMessageManager && !shouldIgnoreActivity(activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            21
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #37  <Method boolean shouldIgnoreActivity(Activity)>
	//*   5   11:ifne            21
			AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
	//    6   14:invokestatic    #43  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #63  <Method void AppboyInAppMessageManager.registerInAppMessageManager(Activity)>
	//    9   21:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
		if(mSessionHandlingEnabled && !shouldIgnoreActivity(activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean mSessionHandlingEnabled>
	//*   2    4:ifeq            25
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #37  <Method boolean shouldIgnoreActivity(Activity)>
	//*   5   11:ifne            25
			Appboy.getInstance(activity.getApplicationContext()).openSession(activity);
	//    6   14:aload_1         
	//    7   15:invokevirtual   #49  <Method android.content.Context Activity.getApplicationContext()>
	//    8   18:invokestatic    #70  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #73  <Method void Appboy.openSession(Activity)>
	//   11   25:return          
	}

	public void onActivityStopped(Activity activity)
	{
		if(mSessionHandlingEnabled && !shouldIgnoreActivity(activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean mSessionHandlingEnabled>
	//*   2    4:ifeq            25
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #37  <Method boolean shouldIgnoreActivity(Activity)>
	//*   5   11:ifne            25
			Appboy.getInstance(activity.getApplicationContext()).closeSession(activity);
	//    6   14:aload_1         
	//    7   15:invokevirtual   #49  <Method android.content.Context Activity.getApplicationContext()>
	//    8   18:invokestatic    #70  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #77  <Method void Appboy.closeSession(Activity)>
	//   11   25:return          
	}

	private final boolean mRegisterInAppMessageManager;
	private final boolean mSessionHandlingEnabled;
}
