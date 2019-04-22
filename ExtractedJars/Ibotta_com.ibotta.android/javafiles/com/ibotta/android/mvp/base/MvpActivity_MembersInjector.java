// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.util.AppHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpActivity

public final class MvpActivity_MembersInjector
	implements MembersInjector
{

	public MvpActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
			Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		appHelperProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field Provider appHelperProvider>
		handlerProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field Provider handlerProvider>
		authManagerProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field Provider authManagerProvider>
		buttonSdkManagerProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #47  <Field Provider buttonSdkManagerProvider>
		upgradeStateProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #49  <Field Provider upgradeStateProvider>
		appCacheStateProvider = provider5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #51  <Field Provider appCacheStateProvider>
		debugStateProvider = provider6;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #53  <Field Provider debugStateProvider>
		cacheClearFactoryProvider = provider7;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #55  <Field Provider cacheClearFactoryProvider>
		globalEventManagerProvider = provider8;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #57  <Field Provider globalEventManagerProvider>
		buildProfileProvider = provider9;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #59  <Field Provider buildProfileProvider>
		trackerProvider = provider10;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #61  <Field Provider trackerProvider>
		trackingFlushWorkerProvider = provider11;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #63  <Field Provider trackingFlushWorkerProvider>
		notificationTrackingProvider = provider12;
	//   38   73:aload_0         
	//   39   74:aload           13
	//   40   76:putfield        #65  <Field Provider notificationTrackingProvider>
	//   41   79:return          
	}

	public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
			Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
	{
		return ((MembersInjector) (new MvpActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12)));
	//    0    0:new             #2   <Class MvpActivity_MembersInjector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:aload           8
	//   11   18:aload           9
	//   12   20:aload           10
	//   13   22:aload           11
	//   14   24:aload           12
	//   15   26:invokespecial   #72  <Method void MvpActivity_MembersInjector(Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   16   29:areturn         
	}

	public static void injectAppCacheState(MvpActivity mvpactivity, AppCacheState appcachestate)
	{
		mvpactivity.appCacheState = appcachestate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field AppCacheState MvpActivity.appCacheState>
	//    3    5:return          
	}

	public static void injectAppHelper(MvpActivity mvpactivity, AppHelper apphelper)
	{
		mvpactivity.appHelper = apphelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field AppHelper MvpActivity.appHelper>
	//    3    5:return          
	}

	public static void injectAuthManager(MvpActivity mvpactivity, AuthManager authmanager)
	{
		mvpactivity.authManager = authmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field AuthManager MvpActivity.authManager>
	//    3    5:return          
	}

	public static void injectBuildProfile(MvpActivity mvpactivity, BuildProfile buildprofile)
	{
		mvpactivity.buildProfile = buildprofile;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field BuildProfile MvpActivity.buildProfile>
	//    3    5:return          
	}

	public static void injectButtonSdkManager(MvpActivity mvpactivity, ButtonSdkManager buttonsdkmanager)
	{
		mvpactivity.buttonSdkManager = buttonsdkmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field ButtonSdkManager MvpActivity.buttonSdkManager>
	//    3    5:return          
	}

	public static void injectCacheClearFactory(MvpActivity mvpactivity, CacheClearJobFactory cacheclearjobfactory)
	{
		mvpactivity.cacheClearFactory = cacheclearjobfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field CacheClearJobFactory MvpActivity.cacheClearFactory>
	//    3    5:return          
	}

	public static void injectDebugState(MvpActivity mvpactivity, DebugState debugstate)
	{
		mvpactivity.debugState = debugstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field DebugState MvpActivity.debugState>
	//    3    5:return          
	}

	public static void injectGlobalEventManager(MvpActivity mvpactivity, GlobalEventManager globaleventmanager)
	{
		mvpactivity.globalEventManager = globaleventmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field GlobalEventManager MvpActivity.globalEventManager>
	//    3    5:return          
	}

	public static void injectHandler(MvpActivity mvpactivity, Handler handler)
	{
		mvpactivity.handler = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field Handler MvpActivity.handler>
	//    3    5:return          
	}

	public static void injectNotificationTracking(MvpActivity mvpactivity, NotificationTracking notificationtracking)
	{
		mvpactivity.notificationTracking = notificationtracking;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field NotificationTracking MvpActivity.notificationTracking>
	//    3    5:return          
	}

	public static void injectTracker(MvpActivity mvpactivity, Tracker tracker)
	{
		mvpactivity.tracker = tracker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field Tracker MvpActivity.tracker>
	//    3    5:return          
	}

	public static void injectTrackingFlushWorker(MvpActivity mvpactivity, TrackingFlushWorker trackingflushworker)
	{
		mvpactivity.trackingFlushWorker = trackingflushworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field TrackingFlushWorker MvpActivity.trackingFlushWorker>
	//    3    5:return          
	}

	public static void injectUpgradeState(MvpActivity mvpactivity, UpgradeState upgradestate)
	{
		mvpactivity.upgradeState = upgradestate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #165 <Field UpgradeState MvpActivity.upgradeState>
	//    3    5:return          
	}

	public void injectMembers(MvpActivity mvpactivity)
	{
		injectAppHelper(mvpactivity, (AppHelper)appHelperProvider.get());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Provider appHelperProvider>
	//    3    5:invokeinterface #174 <Method Object Provider.get()>
	//    4   10:checkcast       #176 <Class AppHelper>
	//    5   13:invokestatic    #178 <Method void injectAppHelper(MvpActivity, AppHelper)>
		injectHandler(mvpactivity, (Handler)handlerProvider.get());
	//    6   16:aload_1         
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field Provider handlerProvider>
	//    9   21:invokeinterface #174 <Method Object Provider.get()>
	//   10   26:checkcast       #180 <Class Handler>
	//   11   29:invokestatic    #182 <Method void injectHandler(MvpActivity, Handler)>
		injectAuthManager(mvpactivity, (AuthManager)authManagerProvider.get());
	//   12   32:aload_1         
	//   13   33:aload_0         
	//   14   34:getfield        #45  <Field Provider authManagerProvider>
	//   15   37:invokeinterface #174 <Method Object Provider.get()>
	//   16   42:checkcast       #184 <Class AuthManager>
	//   17   45:invokestatic    #186 <Method void injectAuthManager(MvpActivity, AuthManager)>
		injectButtonSdkManager(mvpactivity, (ButtonSdkManager)buttonSdkManagerProvider.get());
	//   18   48:aload_1         
	//   19   49:aload_0         
	//   20   50:getfield        #47  <Field Provider buttonSdkManagerProvider>
	//   21   53:invokeinterface #174 <Method Object Provider.get()>
	//   22   58:checkcast       #188 <Class ButtonSdkManager>
	//   23   61:invokestatic    #190 <Method void injectButtonSdkManager(MvpActivity, ButtonSdkManager)>
		injectUpgradeState(mvpactivity, (UpgradeState)upgradeStateProvider.get());
	//   24   64:aload_1         
	//   25   65:aload_0         
	//   26   66:getfield        #49  <Field Provider upgradeStateProvider>
	//   27   69:invokeinterface #174 <Method Object Provider.get()>
	//   28   74:checkcast       #192 <Class UpgradeState>
	//   29   77:invokestatic    #194 <Method void injectUpgradeState(MvpActivity, UpgradeState)>
		injectAppCacheState(mvpactivity, (AppCacheState)appCacheStateProvider.get());
	//   30   80:aload_1         
	//   31   81:aload_0         
	//   32   82:getfield        #51  <Field Provider appCacheStateProvider>
	//   33   85:invokeinterface #174 <Method Object Provider.get()>
	//   34   90:checkcast       #196 <Class AppCacheState>
	//   35   93:invokestatic    #198 <Method void injectAppCacheState(MvpActivity, AppCacheState)>
		injectDebugState(mvpactivity, (DebugState)debugStateProvider.get());
	//   36   96:aload_1         
	//   37   97:aload_0         
	//   38   98:getfield        #53  <Field Provider debugStateProvider>
	//   39  101:invokeinterface #174 <Method Object Provider.get()>
	//   40  106:checkcast       #200 <Class DebugState>
	//   41  109:invokestatic    #202 <Method void injectDebugState(MvpActivity, DebugState)>
		injectCacheClearFactory(mvpactivity, (CacheClearJobFactory)cacheClearFactoryProvider.get());
	//   42  112:aload_1         
	//   43  113:aload_0         
	//   44  114:getfield        #55  <Field Provider cacheClearFactoryProvider>
	//   45  117:invokeinterface #174 <Method Object Provider.get()>
	//   46  122:checkcast       #204 <Class CacheClearJobFactory>
	//   47  125:invokestatic    #206 <Method void injectCacheClearFactory(MvpActivity, CacheClearJobFactory)>
		injectGlobalEventManager(mvpactivity, (GlobalEventManager)globalEventManagerProvider.get());
	//   48  128:aload_1         
	//   49  129:aload_0         
	//   50  130:getfield        #57  <Field Provider globalEventManagerProvider>
	//   51  133:invokeinterface #174 <Method Object Provider.get()>
	//   52  138:checkcast       #208 <Class GlobalEventManager>
	//   53  141:invokestatic    #210 <Method void injectGlobalEventManager(MvpActivity, GlobalEventManager)>
		injectBuildProfile(mvpactivity, (BuildProfile)buildProfileProvider.get());
	//   54  144:aload_1         
	//   55  145:aload_0         
	//   56  146:getfield        #59  <Field Provider buildProfileProvider>
	//   57  149:invokeinterface #174 <Method Object Provider.get()>
	//   58  154:checkcast       #212 <Class BuildProfile>
	//   59  157:invokestatic    #214 <Method void injectBuildProfile(MvpActivity, BuildProfile)>
		injectTracker(mvpactivity, (Tracker)trackerProvider.get());
	//   60  160:aload_1         
	//   61  161:aload_0         
	//   62  162:getfield        #61  <Field Provider trackerProvider>
	//   63  165:invokeinterface #174 <Method Object Provider.get()>
	//   64  170:checkcast       #216 <Class Tracker>
	//   65  173:invokestatic    #218 <Method void injectTracker(MvpActivity, Tracker)>
		injectTrackingFlushWorker(mvpactivity, (TrackingFlushWorker)trackingFlushWorkerProvider.get());
	//   66  176:aload_1         
	//   67  177:aload_0         
	//   68  178:getfield        #63  <Field Provider trackingFlushWorkerProvider>
	//   69  181:invokeinterface #174 <Method Object Provider.get()>
	//   70  186:checkcast       #220 <Class TrackingFlushWorker>
	//   71  189:invokestatic    #222 <Method void injectTrackingFlushWorker(MvpActivity, TrackingFlushWorker)>
		injectNotificationTracking(mvpactivity, (NotificationTracking)notificationTrackingProvider.get());
	//   72  192:aload_1         
	//   73  193:aload_0         
	//   74  194:getfield        #65  <Field Provider notificationTrackingProvider>
	//   75  197:invokeinterface #174 <Method Object Provider.get()>
	//   76  202:checkcast       #224 <Class NotificationTracking>
	//   77  205:invokestatic    #226 <Method void injectNotificationTracking(MvpActivity, NotificationTracking)>
	//   78  208:return          
	}

	public volatile void injectMembers(Object obj)
	{
		injectMembers((MvpActivity)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #77  <Class MvpActivity>
	//    3    5:invokevirtual   #230 <Method void injectMembers(MvpActivity)>
	//    4    8:return          
	}

	private final Provider appCacheStateProvider;
	private final Provider appHelperProvider;
	private final Provider authManagerProvider;
	private final Provider buildProfileProvider;
	private final Provider buttonSdkManagerProvider;
	private final Provider cacheClearFactoryProvider;
	private final Provider debugStateProvider;
	private final Provider globalEventManagerProvider;
	private final Provider handlerProvider;
	private final Provider notificationTrackingProvider;
	private final Provider trackerProvider;
	private final Provider trackingFlushWorkerProvider;
	private final Provider upgradeStateProvider;
}
