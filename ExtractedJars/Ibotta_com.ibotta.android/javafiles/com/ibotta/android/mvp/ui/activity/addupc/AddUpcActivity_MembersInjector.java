// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.images.ImageCache;
import com.ibotta.android.mvp.base.MvpActivity_MembersInjector;
import com.ibotta.android.mvp.base.contentevents.ContentEventsActivity_MembersInjector;
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

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcActivity

public final class AddUpcActivity_MembersInjector
	implements MembersInjector
{

	public AddUpcActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
			Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
			Provider provider14)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		appHelperProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field Provider appHelperProvider>
		handlerProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field Provider handlerProvider>
		authManagerProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field Provider authManagerProvider>
		buttonSdkManagerProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #51  <Field Provider buttonSdkManagerProvider>
		upgradeStateProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #53  <Field Provider upgradeStateProvider>
		appCacheStateProvider = provider5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #55  <Field Provider appCacheStateProvider>
		debugStateProvider = provider6;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #57  <Field Provider debugStateProvider>
		cacheClearFactoryProvider = provider7;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #59  <Field Provider cacheClearFactoryProvider>
		globalEventManagerProvider = provider8;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #61  <Field Provider globalEventManagerProvider>
		buildProfileProvider = provider9;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #63  <Field Provider buildProfileProvider>
		trackerProvider = provider10;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #65  <Field Provider trackerProvider>
		trackingFlushWorkerProvider = provider11;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #67  <Field Provider trackingFlushWorkerProvider>
		notificationTrackingProvider = provider12;
	//   38   73:aload_0         
	//   39   74:aload           13
	//   40   76:putfield        #69  <Field Provider notificationTrackingProvider>
		retailerParcelHelperProvider = provider13;
	//   41   79:aload_0         
	//   42   80:aload           14
	//   43   82:putfield        #71  <Field Provider retailerParcelHelperProvider>
		imageCacheProvider = provider14;
	//   44   85:aload_0         
	//   45   86:aload           15
	//   46   88:putfield        #73  <Field Provider imageCacheProvider>
	//   47   91:return          
	}

	public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
			Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14)
	{
		return ((MembersInjector) (new AddUpcActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14)));
	//    0    0:new             #2   <Class AddUpcActivity_MembersInjector>
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
	//   15   26:aload           13
	//   16   28:aload           14
	//   17   30:invokespecial   #80  <Method void AddUpcActivity_MembersInjector(Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   18   33:areturn         
	}

	public static void injectImageCache(AddUpcActivity addupcactivity, ImageCache imagecache)
	{
		addupcactivity.imageCache = imagecache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field ImageCache AddUpcActivity.imageCache>
	//    3    5:return          
	}

	public void injectMembers(AddUpcActivity addupcactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AppHelper)appHelperProvider.get());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field Provider appHelperProvider>
	//    3    5:invokeinterface #97  <Method Object Provider.get()>
	//    4   10:checkcast       #99  <Class AppHelper>
	//    5   13:invokestatic    #105 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (Handler)handlerProvider.get());
	//    6   16:aload_1         
	//    7   17:aload_0         
	//    8   18:getfield        #47  <Field Provider handlerProvider>
	//    9   21:invokeinterface #97  <Method Object Provider.get()>
	//   10   26:checkcast       #107 <Class Handler>
	//   11   29:invokestatic    #111 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AuthManager)authManagerProvider.get());
	//   12   32:aload_1         
	//   13   33:aload_0         
	//   14   34:getfield        #49  <Field Provider authManagerProvider>
	//   15   37:invokeinterface #97  <Method Object Provider.get()>
	//   16   42:checkcast       #113 <Class AuthManager>
	//   17   45:invokestatic    #117 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (ButtonSdkManager)buttonSdkManagerProvider.get());
	//   18   48:aload_1         
	//   19   49:aload_0         
	//   20   50:getfield        #51  <Field Provider buttonSdkManagerProvider>
	//   21   53:invokeinterface #97  <Method Object Provider.get()>
	//   22   58:checkcast       #119 <Class ButtonSdkManager>
	//   23   61:invokestatic    #123 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (UpgradeState)upgradeStateProvider.get());
	//   24   64:aload_1         
	//   25   65:aload_0         
	//   26   66:getfield        #53  <Field Provider upgradeStateProvider>
	//   27   69:invokeinterface #97  <Method Object Provider.get()>
	//   28   74:checkcast       #125 <Class UpgradeState>
	//   29   77:invokestatic    #129 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AppCacheState)appCacheStateProvider.get());
	//   30   80:aload_1         
	//   31   81:aload_0         
	//   32   82:getfield        #55  <Field Provider appCacheStateProvider>
	//   33   85:invokeinterface #97  <Method Object Provider.get()>
	//   34   90:checkcast       #131 <Class AppCacheState>
	//   35   93:invokestatic    #135 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (DebugState)debugStateProvider.get());
	//   36   96:aload_1         
	//   37   97:aload_0         
	//   38   98:getfield        #57  <Field Provider debugStateProvider>
	//   39  101:invokeinterface #97  <Method Object Provider.get()>
	//   40  106:checkcast       #137 <Class DebugState>
	//   41  109:invokestatic    #141 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (CacheClearJobFactory)cacheClearFactoryProvider.get());
	//   42  112:aload_1         
	//   43  113:aload_0         
	//   44  114:getfield        #59  <Field Provider cacheClearFactoryProvider>
	//   45  117:invokeinterface #97  <Method Object Provider.get()>
	//   46  122:checkcast       #143 <Class CacheClearJobFactory>
	//   47  125:invokestatic    #147 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (GlobalEventManager)globalEventManagerProvider.get());
	//   48  128:aload_1         
	//   49  129:aload_0         
	//   50  130:getfield        #61  <Field Provider globalEventManagerProvider>
	//   51  133:invokeinterface #97  <Method Object Provider.get()>
	//   52  138:checkcast       #149 <Class GlobalEventManager>
	//   53  141:invokestatic    #153 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (BuildProfile)buildProfileProvider.get());
	//   54  144:aload_1         
	//   55  145:aload_0         
	//   56  146:getfield        #63  <Field Provider buildProfileProvider>
	//   57  149:invokeinterface #97  <Method Object Provider.get()>
	//   58  154:checkcast       #155 <Class BuildProfile>
	//   59  157:invokestatic    #159 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (Tracker)trackerProvider.get());
	//   60  160:aload_1         
	//   61  161:aload_0         
	//   62  162:getfield        #65  <Field Provider trackerProvider>
	//   63  165:invokeinterface #97  <Method Object Provider.get()>
	//   64  170:checkcast       #161 <Class Tracker>
	//   65  173:invokestatic    #165 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (TrackingFlushWorker)trackingFlushWorkerProvider.get());
	//   66  176:aload_1         
	//   67  177:aload_0         
	//   68  178:getfield        #67  <Field Provider trackingFlushWorkerProvider>
	//   69  181:invokeinterface #97  <Method Object Provider.get()>
	//   70  186:checkcast       #167 <Class TrackingFlushWorker>
	//   71  189:invokestatic    #171 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (NotificationTracking)notificationTrackingProvider.get());
	//   72  192:aload_1         
	//   73  193:aload_0         
	//   74  194:getfield        #69  <Field Provider notificationTrackingProvider>
	//   75  197:invokeinterface #97  <Method Object Provider.get()>
	//   76  202:checkcast       #173 <Class NotificationTracking>
	//   77  205:invokestatic    #177 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (addupcactivity)), (RetailerParcelHelper)retailerParcelHelperProvider.get());
	//   78  208:aload_1         
	//   79  209:aload_0         
	//   80  210:getfield        #71  <Field Provider retailerParcelHelperProvider>
	//   81  213:invokeinterface #97  <Method Object Provider.get()>
	//   82  218:checkcast       #179 <Class RetailerParcelHelper>
	//   83  221:invokestatic    #185 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		injectImageCache(addupcactivity, (ImageCache)imageCacheProvider.get());
	//   84  224:aload_1         
	//   85  225:aload_0         
	//   86  226:getfield        #73  <Field Provider imageCacheProvider>
	//   87  229:invokeinterface #97  <Method Object Provider.get()>
	//   88  234:checkcast       #187 <Class ImageCache>
	//   89  237:invokestatic    #189 <Method void injectImageCache(AddUpcActivity, ImageCache)>
	//   90  240:return          
	}

	public volatile void injectMembers(Object obj)
	{
		injectMembers((AddUpcActivity)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class AddUpcActivity>
	//    3    5:invokevirtual   #192 <Method void injectMembers(AddUpcActivity)>
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
	private final Provider imageCacheProvider;
	private final Provider notificationTrackingProvider;
	private final Provider retailerParcelHelperProvider;
	private final Provider trackerProvider;
	private final Provider trackingFlushWorkerProvider;
	private final Provider upgradeStateProvider;
}
