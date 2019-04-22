// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import android.os.Bundle;
import com.appboy.push.AppboyNotificationRoutingActivity;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.appboy:
//			Appboy

public class AppboyLifecycleCallbackListener
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public AppboyLifecycleCallbackListener()
	{
		this(true, true, Collections.emptySet(), Collections.emptySet());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #34  <Method Set Collections.emptySet()>
	//    4    6:invokestatic    #34  <Method Set Collections.emptySet()>
	//    5    9:invokespecial   #37  <Method void AppboyLifecycleCallbackListener(boolean, boolean, Set, Set)>
	//    6   12:return          
	}

	public AppboyLifecycleCallbackListener(Set set)
	{
		this(true, true, set, Collections.emptySet());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:aload_1         
	//    4    4:invokestatic    #34  <Method Set Collections.emptySet()>
	//    5    7:invokespecial   #37  <Method void AppboyLifecycleCallbackListener(boolean, boolean, Set, Set)>
	//    6   10:return          
	}

	public AppboyLifecycleCallbackListener(Set set, Set set1)
	{
		this(true, true, set, set1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokespecial   #37  <Method void AppboyLifecycleCallbackListener(boolean, boolean, Set, Set)>
	//    6    8:return          
	}

	public AppboyLifecycleCallbackListener(boolean flag, boolean flag1)
	{
		this(flag, flag1, Collections.emptySet(), Collections.emptySet());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #34  <Method Set Collections.emptySet()>
	//    4    6:invokestatic    #34  <Method Set Collections.emptySet()>
	//    5    9:invokespecial   #37  <Method void AppboyLifecycleCallbackListener(boolean, boolean, Set, Set)>
	//    6   12:return          
	}

	public AppboyLifecycleCallbackListener(boolean flag, boolean flag1, Set set, Set set1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		mRegisterInAppMessageManager = flag1;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #49  <Field boolean mRegisterInAppMessageManager>
		mSessionHandlingEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #51  <Field boolean mSessionHandlingEnabled>
		if(set == null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          21
	//*  10   18:goto            25
			set = Collections.emptySet();
	//   11   21:invokestatic    #34  <Method Set Collections.emptySet()>
	//   12   24:astore_3        
		mInAppMessagingRegistrationBlacklist = set;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #53  <Field Set mInAppMessagingRegistrationBlacklist>
		if(set1 == null)
	//*  16   30:aload           4
	//*  17   32:ifnull          38
	//*  18   35:goto            43
			set1 = Collections.emptySet();
	//   19   38:invokestatic    #34  <Method Set Collections.emptySet()>
	//   20   41:astore          4
		mSessionHandlingBlacklist = set1;
	//   21   43:aload_0         
	//   22   44:aload           4
	//   23   46:putfield        #55  <Field Set mSessionHandlingBlacklist>
		set = ((Set) (TAG));
	//   24   49:getstatic       #26  <Field String TAG>
	//   25   52:astore_3        
		set1 = ((Set) (new StringBuilder()));
	//   26   53:new             #57  <Class StringBuilder>
	//   27   56:dup             
	//   28   57:invokespecial   #58  <Method void StringBuilder()>
	//   29   60:astore          4
		((StringBuilder) (set1)).append("AppboyLifecycleCallbackListener using in-app messaging blacklist: ");
	//   30   62:aload           4
	//   31   64:ldc1            #60  <String "AppboyLifecycleCallbackListener using in-app messaging blacklist: ">
	//   32   66:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
		((StringBuilder) (set1)).append(((Object) (mInAppMessagingRegistrationBlacklist)));
	//   34   70:aload           4
	//   35   72:aload_0         
	//   36   73:getfield        #53  <Field Set mInAppMessagingRegistrationBlacklist>
	//   37   76:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   38   79:pop             
		AppboyLogger.v(((String) (set)), ((StringBuilder) (set1)).toString());
	//   39   80:aload_3         
	//   40   81:aload           4
	//   41   83:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   42   86:invokestatic    #75  <Method int AppboyLogger.v(String, String)>
	//   43   89:pop             
		set = ((Set) (TAG));
	//   44   90:getstatic       #26  <Field String TAG>
	//   45   93:astore_3        
		set1 = ((Set) (new StringBuilder()));
	//   46   94:new             #57  <Class StringBuilder>
	//   47   97:dup             
	//   48   98:invokespecial   #58  <Method void StringBuilder()>
	//   49  101:astore          4
		((StringBuilder) (set1)).append("AppboyLifecycleCallbackListener using session handling blacklist: ");
	//   50  103:aload           4
	//   51  105:ldc1            #77  <String "AppboyLifecycleCallbackListener using session handling blacklist: ">
	//   52  107:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   53  110:pop             
		((StringBuilder) (set1)).append(((Object) (mSessionHandlingBlacklist)));
	//   54  111:aload           4
	//   55  113:aload_0         
	//   56  114:getfield        #55  <Field Set mSessionHandlingBlacklist>
	//   57  117:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   58  120:pop             
		AppboyLogger.v(((String) (set)), ((StringBuilder) (set1)).toString());
	//   59  121:aload_3         
	//   60  122:aload           4
	//   61  124:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   62  127:invokestatic    #75  <Method int AppboyLogger.v(String, String)>
	//   63  130:pop             
	//   64  131:return          
	}

	private boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean flag)
	{
		activity = ((Activity) (((Object) (activity)).getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method Class Object.getClass()>
	//    2    4:astore_1        
		if(((Object) (activity)).equals(com/appboy/push/AppboyNotificationRoutingActivity))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #86  <Class AppboyNotificationRoutingActivity>
	//*   5    8:invokevirtual   #90  <Method boolean Object.equals(Object)>
	//*   6   11:ifeq            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		if(flag)
	//*   9   16:iload_2         
	//*  10   17:ifeq            33
			return mSessionHandlingBlacklist.contains(((Object) (activity))) ^ true;
	//   11   20:aload_0         
	//   12   21:getfield        #55  <Field Set mSessionHandlingBlacklist>
	//   13   24:aload_1         
	//   14   25:invokeinterface #95  <Method boolean Set.contains(Object)>
	//   15   30:iconst_1        
	//   16   31:ixor            
	//   17   32:ireturn         
		else
			return mInAppMessagingRegistrationBlacklist.contains(((Object) (activity))) ^ true;
	//   18   33:aload_0         
	//   19   34:getfield        #53  <Field Set mInAppMessagingRegistrationBlacklist>
	//   20   37:aload_1         
	//   21   38:invokeinterface #95  <Method boolean Set.contains(Object)>
	//   22   43:iconst_1        
	//   23   44:ixor            
	//   24   45:ireturn         
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		if(mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            26
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:iconst_0        
	//*   6   10:invokespecial   #99  <Method boolean shouldHandleLifecycleMethodsInActivity(Activity, boolean)>
	//*   7   13:ifeq            26
			AppboyInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(activity.getApplicationContext());
	//    8   16:invokestatic    #105 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #111 <Method android.content.Context Activity.getApplicationContext()>
	//   11   23:invokevirtual   #115 <Method void AppboyInAppMessageManager.ensureSubscribedToInAppMessageEvents(android.content.Context)>
	//   12   26:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
		if(mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:iconst_0        
	//*   6   10:invokespecial   #99  <Method boolean shouldHandleLifecycleMethodsInActivity(Activity, boolean)>
	//*   7   13:ifeq            23
			AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
	//    8   16:invokestatic    #105 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #121 <Method void AppboyInAppMessageManager.unregisterInAppMessageManager(Activity)>
	//   11   23:return          
	}

	public void onActivityResumed(Activity activity)
	{
		if(mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mRegisterInAppMessageManager>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:iconst_0        
	//*   6   10:invokespecial   #99  <Method boolean shouldHandleLifecycleMethodsInActivity(Activity, boolean)>
	//*   7   13:ifeq            23
			AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
	//    8   16:invokestatic    #105 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #125 <Method void AppboyInAppMessageManager.registerInAppMessageManager(Activity)>
	//   11   23:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
		if(mSessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mSessionHandlingEnabled>
	//*   2    4:ifeq            27
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:iconst_1        
	//*   6   10:invokespecial   #99  <Method boolean shouldHandleLifecycleMethodsInActivity(Activity, boolean)>
	//*   7   13:ifeq            27
			Appboy.getInstance(activity.getApplicationContext()).openSession(activity);
	//    8   16:aload_1         
	//    9   17:invokevirtual   #111 <Method android.content.Context Activity.getApplicationContext()>
	//   10   20:invokestatic    #132 <Method Appboy Appboy.getInstance(android.content.Context)>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #135 <Method void Appboy.openSession(Activity)>
	//   13   27:return          
	}

	public void onActivityStopped(Activity activity)
	{
		if(mSessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mSessionHandlingEnabled>
	//*   2    4:ifeq            27
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:iconst_1        
	//*   6   10:invokespecial   #99  <Method boolean shouldHandleLifecycleMethodsInActivity(Activity, boolean)>
	//*   7   13:ifeq            27
			Appboy.getInstance(activity.getApplicationContext()).closeSession(activity);
	//    8   16:aload_1         
	//    9   17:invokevirtual   #111 <Method android.content.Context Activity.getApplicationContext()>
	//   10   20:invokestatic    #132 <Method Appboy Appboy.getInstance(android.content.Context)>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #139 <Method void Appboy.closeSession(Activity)>
	//   13   27:return          
	}

	public void setInAppMessagingRegistrationBlacklist(Set set)
	{
		String s = TAG;
	//    0    0:getstatic       #26  <Field String TAG>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #57  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("setInAppMessagingRegistrationBlacklist called with blacklist: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #142 <String "setInAppMessagingRegistrationBlacklist called with blacklist: ">
	//    8   15:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (set)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #75  <Method int AppboyLogger.v(String, String)>
	//   18   33:pop             
		mInAppMessagingRegistrationBlacklist = set;
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:putfield        #53  <Field Set mInAppMessagingRegistrationBlacklist>
	//   22   39:return          
	}

	public void setSessionHandlingBlacklist(Set set)
	{
		String s = TAG;
	//    0    0:getstatic       #26  <Field String TAG>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #57  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("setSessionHandlingBlacklist called with blacklist: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #145 <String "setSessionHandlingBlacklist called with blacklist: ">
	//    8   15:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (set)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #75  <Method int AppboyLogger.v(String, String)>
	//   18   33:pop             
		mSessionHandlingBlacklist = set;
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:putfield        #55  <Field Set mSessionHandlingBlacklist>
	//   22   39:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/AppboyLifecycleCallbackListener);
	private Set mInAppMessagingRegistrationBlacklist;
	private final boolean mRegisterInAppMessageManager;
	private Set mSessionHandlingBlacklist;
	private final boolean mSessionHandlingEnabled;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLifecycleCallbackListener>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}
}
