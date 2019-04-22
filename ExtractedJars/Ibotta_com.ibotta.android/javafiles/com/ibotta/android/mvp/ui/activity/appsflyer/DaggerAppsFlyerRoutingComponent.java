// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.mvp.base.*;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.pojo.AppsFlyerState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.tracking.sdk.LifecycleTracker;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingComponent, AppsFlyerRoutingModule_ProvideMvpPresenterFactory, AppsFlyerRoutingActivity_MembersInjector, AppsFlyerRoutingPresenter, 
//			AppsFlyerRoutingView, AppsFlyerRoutingActivity, AppsFlyerRoutingModule

public final class DaggerAppsFlyerRoutingComponent
	implements AppsFlyerRoutingComponent
{
	public static final class Builder
	{

		public Builder appsFlyerRoutingModule(AppsFlyerRoutingModule appsflyerroutingmodule)
		{
			appsFlyerRoutingModule = (AppsFlyerRoutingModule)Preconditions.checkNotNull(((Object) (appsflyerroutingmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #35  <Class AppsFlyerRoutingModule>
		//    4    8:putfield        #22  <Field AppsFlyerRoutingModule appsFlyerRoutingModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public AppsFlyerRoutingComponent build()
		{
			if(appsFlyerRoutingModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field AppsFlyerRoutingModule appsFlyerRoutingModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((AppsFlyerRoutingComponent) (new DaggerAppsFlyerRoutingComponent(this)));
		//    6   14:new             #6   <Class DaggerAppsFlyerRoutingComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #40  <Method void DaggerAppsFlyerRoutingComponent(DaggerAppsFlyerRoutingComponent$Builder, DaggerAppsFlyerRoutingComponent$1)>
		//   11   23:areturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   12   24:new             #42  <Class StringBuilder>
		//   13   27:dup             
		//   14   28:invokespecial   #43  <Method void StringBuilder()>
		//   15   31:astore_1        
					stringbuilder.append(((Class) (com/ibotta/android/di/MainComponent)).getCanonicalName());
		//   16   32:aload_1         
		//   17   33:ldc1            #45  <Class MainComponent>
		//   18   35:invokevirtual   #51  <Method String Class.getCanonicalName()>
		//   19   38:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
					stringbuilder.append(" must be set");
		//   21   42:aload_1         
		//   22   43:ldc1            #57  <String " must be set">
		//   23   45:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   24   48:pop             
					throw new IllegalStateException(stringbuilder.toString());
		//   25   49:new             #59  <Class IllegalStateException>
		//   26   52:dup             
		//   27   53:aload_1         
		//   28   54:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   29   57:invokespecial   #65  <Method void IllegalStateException(String)>
		//   30   60:athrow          
				}
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//   31   61:new             #42  <Class StringBuilder>
		//   32   64:dup             
		//   33   65:invokespecial   #43  <Method void StringBuilder()>
		//   34   68:astore_1        
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/appsflyer/AppsFlyerRoutingModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #35  <Class AppsFlyerRoutingModule>
		//   37   72:invokevirtual   #51  <Method String Class.getCanonicalName()>
		//   38   75:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:pop             
				stringbuilder1.append(" must be set");
		//   40   79:aload_1         
		//   41   80:ldc1            #57  <String " must be set">
		//   42   82:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   43   85:pop             
				throw new IllegalStateException(stringbuilder1.toString());
		//   44   86:new             #59  <Class IllegalStateException>
		//   45   89:dup             
		//   46   90:aload_1         
		//   47   91:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   48   94:invokespecial   #65  <Method void IllegalStateException(String)>
		//   49   97:athrow          
			}
		}

		public Builder mainComponent(MainComponent maincomponent)
		{
			mainComponent = (MainComponent)Preconditions.checkNotNull(((Object) (maincomponent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #45  <Class MainComponent>
		//    4    8:putfield        #26  <Field MainComponent mainComponent>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		private AppsFlyerRoutingModule appsFlyerRoutingModule;
		private MainComponent mainComponent;


/*
		static AppsFlyerRoutingModule access$100(Builder builder1)
		{
			return builder1.appsFlyerRoutingModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AppsFlyerRoutingModule appsFlyerRoutingModule>
		//    2    4:areturn         
		}

*/


/*
		static MainComponent access$200(Builder builder1)
		{
			return builder1.mainComponent;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field MainComponent mainComponent>
		//    2    4:areturn         
		}

*/

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class com_ibotta_android_di_MainComponent_getApiWorkSubmitter
		implements Provider
	{

		public ApiWorkSubmitter get()
		{
			return (ApiWorkSubmitter)Preconditions.checkNotNull(((Object) (mainComponent.getApiWorkSubmitter())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method ApiWorkSubmitter MainComponent.getApiWorkSubmitter()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class ApiWorkSubmitter>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method ApiWorkSubmitter get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getAppHelper
		implements Provider
	{

		public AppHelper get()
		{
			return (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method AppHelper MainComponent.getAppHelper()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class AppHelper>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method AppHelper get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getAppHelper(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getAppsFlyerState
		implements Provider
	{

		public AppsFlyerState get()
		{
			return (AppsFlyerState)Preconditions.checkNotNull(((Object) (mainComponent.getAppsFlyerState())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method AppsFlyerState MainComponent.getAppsFlyerState()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class AppsFlyerState>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method AppsFlyerState get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getAppsFlyerState(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getAuthManager
		implements Provider
	{

		public AuthManager get()
		{
			return (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method AuthManager MainComponent.getAuthManager()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class AuthManager>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method AuthManager get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getAuthManager(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getFormatting
		implements Provider
	{

		public Formatting get()
		{
			return (Formatting)Preconditions.checkNotNull(((Object) (mainComponent.getFormatting())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method Formatting MainComponent.getFormatting()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class Formatting>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Formatting get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getFormatting(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getHardware
		implements Provider
	{

		public Hardware get()
		{
			return (Hardware)Preconditions.checkNotNull(((Object) (mainComponent.getHardware())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method Hardware MainComponent.getHardware()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class Hardware>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Hardware get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getHardware(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getMvpPresenterActions
		implements Provider
	{

		public MvpPresenterActions get()
		{
			return (MvpPresenterActions)Preconditions.checkNotNull(((Object) (mainComponent.getMvpPresenterActions())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method MvpPresenterActions MainComponent.getMvpPresenterActions()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class MvpPresenterActions>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method MvpPresenterActions get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getOfferHelper
		implements Provider
	{

		public OfferHelper get()
		{
			return (OfferHelper)Preconditions.checkNotNull(((Object) (mainComponent.getOfferHelper())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method OfferHelper MainComponent.getOfferHelper()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class OfferHelper>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method OfferHelper get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}

	private static class com_ibotta_android_di_MainComponent_getVariantFactory
		implements Provider
	{

		public VariantFactory get()
		{
			return (VariantFactory)Preconditions.checkNotNull(((Object) (mainComponent.getVariantFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method VariantFactory MainComponent.getVariantFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class VariantFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method VariantFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent maincomponent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mainComponent = maincomponent;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field MainComponent mainComponent>
		//    5    9:return          
		}
	}


	private DaggerAppsFlyerRoutingComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #73  <Method void initialize(DaggerAppsFlyerRoutingComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerAppsFlyerRoutingComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #82  <Method void DaggerAppsFlyerRoutingComponent$Builder(DaggerAppsFlyerRoutingComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.appsFlyerRoutingModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #86  <Method AppsFlyerRoutingModule DaggerAppsFlyerRoutingComponent$Builder.access$100(DaggerAppsFlyerRoutingComponent$Builder)>
	//    3    5:invokestatic    #92  <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #98  <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #100 <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #31  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   11   23:invokespecial   #107 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #109 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getAppHelperProvider = new com_ibotta_android_di_MainComponent_getAppHelper(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #16  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppHelper>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   18   38:invokespecial   #110 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppHelper(MainComponent)>
	//   19   41:putfield        #112 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
		getAuthManagerProvider = new com_ibotta_android_di_MainComponent_getAuthManager(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #22  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAuthManager>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   25   53:invokespecial   #113 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAuthManager(MainComponent)>
	//   26   56:putfield        #115 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider>
		getAppsFlyerStateProvider = new com_ibotta_android_di_MainComponent_getAppsFlyerState(builder1.mainComponent);
	//   27   59:aload_0         
	//   28   60:new             #19  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppsFlyerState>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   32   68:invokespecial   #116 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppsFlyerState(MainComponent)>
	//   33   71:putfield        #118 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppsFlyerState getAppsFlyerStateProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (AppsFlyerRoutingModule_ProvideMvpPresenterFactory.create(((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getAppHelperProvider)), ((Provider) (getAuthManagerProvider)), ((Provider) (getAppsFlyerStateProvider))))));
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #109 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   37   79:aload_0         
	//   38   80:getfield        #112 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
	//   39   83:aload_0         
	//   40   84:getfield        #115 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider>
	//   41   87:aload_0         
	//   42   88:getfield        #118 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getAppsFlyerState getAppsFlyerStateProvider>
	//   43   91:invokestatic    #123 <Method AppsFlyerRoutingModule_ProvideMvpPresenterFactory AppsFlyerRoutingModule_ProvideMvpPresenterFactory.create(Provider, Provider, Provider, Provider)>
	//   44   94:invokestatic    #98  <Method Provider DoubleCheck.provider(Provider)>
	//   45   97:putfield        #125 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   46  100:aload_0         
	//   47  101:new             #34  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   48  104:dup             
	//   49  105:aload_1         
	//   50  106:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   51  109:invokespecial   #126 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   52  112:putfield        #128 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   53  115:aload_0         
	//   54  116:new             #28  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   55  119:dup             
	//   56  120:aload_1         
	//   57  121:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   58  124:invokespecial   #129 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   59  127:putfield        #131 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   60  130:aload_0         
	//   61  131:new             #25  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   62  134:dup             
	//   63  135:aload_1         
	//   64  136:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   65  139:invokespecial   #132 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   66  142:putfield        #134 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   67  145:aload_0         
	//   68  146:new             #13  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   69  149:dup             
	//   70  150:aload_1         
	//   71  151:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   72  154:invokespecial   #135 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   73  157:putfield        #137 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   74  160:aload_0         
	//   75  161:new             #37  <Class DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//   76  164:dup             
	//   77  165:aload_1         
	//   78  166:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//   79  169:invokespecial   #138 <Method void DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//   80  172:putfield        #140 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.appsFlyerRoutingModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//   81  175:aload_0         
	//   82  176:aload_1         
	//   83  177:invokestatic    #86  <Method AppsFlyerRoutingModule DaggerAppsFlyerRoutingComponent$Builder.access$100(DaggerAppsFlyerRoutingComponent$Builder)>
	//   84  180:aload_0         
	//   85  181:getfield        #128 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//   86  184:aload_0         
	//   87  185:getfield        #131 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//   88  188:aload_0         
	//   89  189:getfield        #134 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//   90  192:aload_0         
	//   91  193:getfield        #137 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//   92  196:aload_0         
	//   93  197:getfield        #140 <Field DaggerAppsFlyerRoutingComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//   94  200:invokestatic    #145 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//   95  203:invokestatic    #98  <Method Provider DoubleCheck.provider(Provider)>
	//   96  206:putfield        #147 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//   97  209:aload_0         
	//   98  210:aload_1         
	//   99  211:invokestatic    #104 <Method MainComponent DaggerAppsFlyerRoutingComponent$Builder.access$200(DaggerAppsFlyerRoutingComponent$Builder)>
	//  100  214:putfield        #149 <Field MainComponent mainComponent>
	//  101  217:return          
	}

	private AppsFlyerRoutingActivity injectAppsFlyerRoutingActivity(AppsFlyerRoutingActivity appsflyerroutingactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #149 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #158 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #168 <Class AppHelper>
	//    7   18:invokestatic    #174 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #149 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #178 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #180 <Class Handler>
	//   15   39:invokestatic    #184 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #149 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #188 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #190 <Class AuthManager>
	//   23   60:invokestatic    #194 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #149 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #198 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #200 <Class ButtonSdkManager>
	//   31   81:invokestatic    #204 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #149 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #208 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #210 <Class UpgradeState>
	//   39  102:invokestatic    #214 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #149 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #218 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #220 <Class AppCacheState>
	//   47  123:invokestatic    #224 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #149 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #228 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #230 <Class DebugState>
	//   55  144:invokestatic    #234 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #149 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #238 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #240 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #244 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #149 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #248 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #250 <Class GlobalEventManager>
	//   71  186:invokestatic    #254 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #149 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #258 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #260 <Class BuildProfile>
	//   79  207:invokestatic    #264 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #149 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #268 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #270 <Class Tracker>
	//   87  228:invokestatic    #274 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #149 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #278 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #280 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #284 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (appsflyerroutingactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #149 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #288 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #290 <Class NotificationTracking>
	//  103  270:invokestatic    #294 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		AppsFlyerRoutingActivity_MembersInjector.injectLifecycleTracker(appsflyerroutingactivity, (LifecycleTracker)Preconditions.checkNotNull(((Object) (mainComponent.getLifecycleTracker())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #149 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #298 <Method LifecycleTracker MainComponent.getLifecycleTracker()>
	//  108  283:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #300 <Class LifecycleTracker>
	//  111  291:invokestatic    #306 <Method void AppsFlyerRoutingActivity_MembersInjector.injectLifecycleTracker(AppsFlyerRoutingActivity, LifecycleTracker)>
		AppsFlyerRoutingActivity_MembersInjector.injectUserState(appsflyerroutingactivity, (UserState)Preconditions.checkNotNull(((Object) (mainComponent.getUserState())), "Cannot return null from a non-@Nullable component method"));
	//  112  294:aload_1         
	//  113  295:aload_0         
	//  114  296:getfield        #149 <Field MainComponent mainComponent>
	//  115  299:invokeinterface #310 <Method UserState MainComponent.getUserState()>
	//  116  304:ldc1            #160 <String "Cannot return null from a non-@Nullable component method">
	//  117  306:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object, String)>
	//  118  309:checkcast       #312 <Class UserState>
	//  119  312:invokestatic    #316 <Method void AppsFlyerRoutingActivity_MembersInjector.injectUserState(AppsFlyerRoutingActivity, UserState)>
		return appsflyerroutingactivity;
	//  120  315:aload_1         
	//  121  316:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method AppsFlyerRoutingPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public AppsFlyerRoutingPresenter getMvpPresenter()
	{
		return (AppsFlyerRoutingPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #328 <Method Object Provider.get()>
	//    3    9:checkcast       #330 <Class AppsFlyerRoutingPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #335 <Method AppsFlyerRoutingView getMvpView()>
	//    2    4:areturn         
	}

	public AppsFlyerRoutingView getMvpView()
	{
		return (AppsFlyerRoutingView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #328 <Method Object Provider.get()>
	//    3    9:checkcast       #337 <Class AppsFlyerRoutingView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #328 <Method Object Provider.get()>
	//    3    9:checkcast       #341 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((AppsFlyerRoutingView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #337 <Class AppsFlyerRoutingView>
	//    3    5:invokevirtual   #346 <Method void inject(AppsFlyerRoutingView)>
	//    4    8:return          
	}

	public void inject(AppsFlyerRoutingActivity appsflyerroutingactivity)
	{
		injectAppsFlyerRoutingActivity(appsflyerroutingactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #349 <Method AppsFlyerRoutingActivity injectAppsFlyerRoutingActivity(AppsFlyerRoutingActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(AppsFlyerRoutingView appsflyerroutingview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider;
	private com_ibotta_android_di_MainComponent_getAppsFlyerState getAppsFlyerStateProvider;
	private com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
