// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import android.os.Handler;
import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.features.variant.account.TeamworkVariant;
import com.ibotta.android.features.variant.pwi.PwiVariant;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.mvp.base.*;
import com.ibotta.android.mvp.base.contentevents.ContentEventsActivity_MembersInjector;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.mvp.ui.view.ScrollingBottomSpace;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.security.DeviceSecurity;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.call.ApiCallFactory;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountComponent, AccountModule_ProvidesAccountTrackingFactory, AccountModule_ProvideMvpPresenterFactory, AccountModule_ProvideScrollingBottomSpaceFactory, 
//			AccountModule_ProvideFacebookManagerFactory, AccountActivity_MembersInjector, AccountPresenter, AccountView, 
//			AccountActivity, AccountModule

public final class DaggerAccountComponent
	implements AccountComponent
{
	public static final class Builder
	{

		public Builder accountModule(AccountModule accountmodule)
		{
			accountModule = (AccountModule)Preconditions.checkNotNull(((Object) (accountmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #35  <Class AccountModule>
		//    4    8:putfield        #22  <Field AccountModule accountModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public AccountComponent build()
		{
			if(accountModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field AccountModule accountModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((AccountComponent) (new DaggerAccountComponent(this)));
		//    6   14:new             #6   <Class DaggerAccountComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #40  <Method void DaggerAccountComponent(DaggerAccountComponent$Builder, DaggerAccountComponent$1)>
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
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/account/AccountModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #35  <Class AccountModule>
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

		private AccountModule accountModule;
		private MainComponent mainComponent;


/*
		static AccountModule access$100(Builder builder1)
		{
			return builder1.accountModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AccountModule accountModule>
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

	private static class com_ibotta_android_di_MainComponent_getAccountEventContextProvider
		implements Provider
	{

		public EventContextProvider get()
		{
			return (EventContextProvider)Preconditions.checkNotNull(((Object) (mainComponent.getAccountEventContextProvider())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method EventContextProvider MainComponent.getAccountEventContextProvider()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class EventContextProvider>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method EventContextProvider get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getAccountEventContextProvider(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getApiCallFactory
		implements Provider
	{

		public ApiCallFactory get()
		{
			return (ApiCallFactory)Preconditions.checkNotNull(((Object) (mainComponent.getApiCallFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method ApiCallFactory MainComponent.getApiCallFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class ApiCallFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method ApiCallFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getApiCallFactory(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getCacheClearJobFactory
		implements Provider
	{

		public CacheClearJobFactory get()
		{
			return (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class CacheClearJobFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method CacheClearJobFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getCacheClearJobFactory(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getDeviceSecurity
		implements Provider
	{

		public DeviceSecurity get()
		{
			return (DeviceSecurity)Preconditions.checkNotNull(((Object) (mainComponent.getDeviceSecurity())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method DeviceSecurity MainComponent.getDeviceSecurity()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class DeviceSecurity>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method DeviceSecurity get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getDeviceSecurity(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory
		implements Provider
	{

		public PostAuthWorkJobFactory get()
		{
			return (PostAuthWorkJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getPostAuthWorkJobFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method PostAuthWorkJobFactory MainComponent.getPostAuthWorkJobFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class PostAuthWorkJobFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method PostAuthWorkJobFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getPwiVariant
		implements Provider
	{

		public PwiVariant get()
		{
			return (PwiVariant)Preconditions.checkNotNull(((Object) (mainComponent.getPwiVariant())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method PwiVariant MainComponent.getPwiVariant()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class PwiVariant>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method PwiVariant get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getPwiVariant(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getTeamworkVariant
		implements Provider
	{

		public TeamworkVariant get()
		{
			return (TeamworkVariant)Preconditions.checkNotNull(((Object) (mainComponent.getTeamworkVariant())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method TeamworkVariant MainComponent.getTeamworkVariant()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class TeamworkVariant>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method TeamworkVariant get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getTeamworkVariant(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getTracker
		implements Provider
	{

		public Tracker get()
		{
			return (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method Tracker MainComponent.getTracker()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class Tracker>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Tracker get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getTracker(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getTrackingQueue
		implements Provider
	{

		public TrackingQueue get()
		{
			return (TrackingQueue)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingQueue())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method TrackingQueue MainComponent.getTrackingQueue()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class TrackingQueue>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method TrackingQueue get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getTrackingQueue(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getUserState
		implements Provider
	{

		public UserState get()
		{
			return (UserState)Preconditions.checkNotNull(((Object) (mainComponent.getUserState())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method UserState MainComponent.getUserState()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class UserState>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method UserState get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getUserState(MainComponent maincomponent)
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


	private DaggerAccountComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #124 <Method void initialize(DaggerAccountComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerAccountComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #133 <Method void DaggerAccountComponent$Builder(DaggerAccountComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.accountModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//    3    5:invokestatic    #143 <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #151 <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #40  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   11   23:invokespecial   #158 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #160 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getUserStateProvider = new com_ibotta_android_di_MainComponent_getUserState(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #61  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getUserState>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   18   38:invokespecial   #161 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getUserState(MainComponent)>
	//   19   41:putfield        #163 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
		getTrackerProvider = new com_ibotta_android_di_MainComponent_getTracker(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #55  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTracker>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   25   53:invokespecial   #164 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTracker(MainComponent)>
	//   26   56:putfield        #166 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTracker getTrackerProvider>
		getAppHelperProvider = new com_ibotta_android_di_MainComponent_getAppHelper(builder1.mainComponent);
	//   27   59:aload_0         
	//   28   60:new             #22  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   32   68:invokespecial   #167 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper(MainComponent)>
	//   33   71:putfield        #169 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
		getAccountEventContextProvider = new com_ibotta_android_di_MainComponent_getAccountEventContextProvider(builder1.mainComponent);
	//   34   74:aload_0         
	//   35   75:new             #13  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAccountEventContextProvider>
	//   36   78:dup             
	//   37   79:aload_1         
	//   38   80:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   39   83:invokespecial   #170 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAccountEventContextProvider(MainComponent)>
	//   40   86:putfield        #172 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAccountEventContextProvider getAccountEventContextProvider>
		getTrackingQueueProvider = new com_ibotta_android_di_MainComponent_getTrackingQueue(builder1.mainComponent);
	//   41   89:aload_0         
	//   42   90:new             #58  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTrackingQueue>
	//   43   93:dup             
	//   44   94:aload_1         
	//   45   95:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   46   98:invokespecial   #173 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTrackingQueue(MainComponent)>
	//   47  101:putfield        #175 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTrackingQueue getTrackingQueueProvider>
		providesAccountTrackingProvider = DoubleCheck.provider(((Provider) (AccountModule_ProvidesAccountTrackingFactory.create(builder1.accountModule, ((Provider) (getAppHelperProvider)), ((Provider) (getAccountEventContextProvider)), ((Provider) (getTrackingQueueProvider))))));
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//   51  109:aload_0         
	//   52  110:getfield        #169 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
	//   53  113:aload_0         
	//   54  114:getfield        #172 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAccountEventContextProvider getAccountEventContextProvider>
	//   55  117:aload_0         
	//   56  118:getfield        #175 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTrackingQueue getTrackingQueueProvider>
	//   57  121:invokestatic    #180 <Method AccountModule_ProvidesAccountTrackingFactory AccountModule_ProvidesAccountTrackingFactory.create(AccountModule, Provider, Provider, Provider)>
	//   58  124:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//   59  127:putfield        #182 <Field Provider providesAccountTrackingProvider>
		getPwiVariantProvider = new com_ibotta_android_di_MainComponent_getPwiVariant(builder1.mainComponent);
	//   60  130:aload_0         
	//   61  131:new             #49  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPwiVariant>
	//   62  134:dup             
	//   63  135:aload_1         
	//   64  136:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   65  139:invokespecial   #183 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPwiVariant(MainComponent)>
	//   66  142:putfield        #185 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPwiVariant getPwiVariantProvider>
		getTeamworkVariantProvider = new com_ibotta_android_di_MainComponent_getTeamworkVariant(builder1.mainComponent);
	//   67  145:aload_0         
	//   68  146:new             #52  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTeamworkVariant>
	//   69  149:dup             
	//   70  150:aload_1         
	//   71  151:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   72  154:invokespecial   #186 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTeamworkVariant(MainComponent)>
	//   73  157:putfield        #188 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTeamworkVariant getTeamworkVariantProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (AccountModule_ProvideMvpPresenterFactory.create(builder1.accountModule, ((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getUserStateProvider)), ((Provider) (getTrackerProvider)), providesAccountTrackingProvider, ((Provider) (getPwiVariantProvider)), ((Provider) (getTeamworkVariantProvider))))));
	//   74  160:aload_0         
	//   75  161:aload_1         
	//   76  162:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//   77  165:aload_0         
	//   78  166:getfield        #160 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   79  169:aload_0         
	//   80  170:getfield        #163 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
	//   81  173:aload_0         
	//   82  174:getfield        #166 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTracker getTrackerProvider>
	//   83  177:aload_0         
	//   84  178:getfield        #182 <Field Provider providesAccountTrackingProvider>
	//   85  181:aload_0         
	//   86  182:getfield        #185 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPwiVariant getPwiVariantProvider>
	//   87  185:aload_0         
	//   88  186:getfield        #188 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getTeamworkVariant getTeamworkVariantProvider>
	//   89  189:invokestatic    #193 <Method AccountModule_ProvideMvpPresenterFactory AccountModule_ProvideMvpPresenterFactory.create(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   90  192:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//   91  195:putfield        #195 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   92  198:aload_0         
	//   93  199:new             #43  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   94  202:dup             
	//   95  203:aload_1         
	//   96  204:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//   97  207:invokespecial   #196 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   98  210:putfield        #198 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   99  213:aload_0         
	//  100  214:new             #37  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getHardware>
	//  101  217:dup             
	//  102  218:aload_1         
	//  103  219:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  104  222:invokespecial   #199 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//  105  225:putfield        #201 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//  106  228:aload_0         
	//  107  229:new             #34  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//  108  232:dup             
	//  109  233:aload_1         
	//  110  234:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  111  237:invokespecial   #202 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//  112  240:putfield        #204 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//  113  243:aload_0         
	//  114  244:new             #19  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//  115  247:dup             
	//  116  248:aload_1         
	//  117  249:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  118  252:invokespecial   #205 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//  119  255:putfield        #207 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//  120  258:aload_0         
	//  121  259:new             #64  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//  122  262:dup             
	//  123  263:aload_1         
	//  124  264:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  125  267:invokespecial   #208 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//  126  270:putfield        #210 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.accountModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//  127  273:aload_0         
	//  128  274:aload_1         
	//  129  275:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//  130  278:aload_0         
	//  131  279:getfield        #198 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//  132  282:aload_0         
	//  133  283:getfield        #201 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//  134  286:aload_0         
	//  135  287:getfield        #204 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//  136  290:aload_0         
	//  137  291:getfield        #207 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//  138  294:aload_0         
	//  139  295:getfield        #210 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//  140  298:invokestatic    #215 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//  141  301:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//  142  304:putfield        #217 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//  143  307:aload_0         
	//  144  308:aload_1         
	//  145  309:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  146  312:putfield        #219 <Field MainComponent mainComponent>
		provideScrollingBottomSpaceProvider = DoubleCheck.provider(((Provider) (AccountModule_ProvideScrollingBottomSpaceFactory.create(builder1.accountModule))));
	//  147  315:aload_0         
	//  148  316:aload_1         
	//  149  317:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//  150  320:invokestatic    #224 <Method AccountModule_ProvideScrollingBottomSpaceFactory AccountModule_ProvideScrollingBottomSpaceFactory.create(AccountModule)>
	//  151  323:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//  152  326:putfield        #226 <Field Provider provideScrollingBottomSpaceProvider>
		getDeviceSecurityProvider = new com_ibotta_android_di_MainComponent_getDeviceSecurity(builder1.mainComponent);
	//  153  329:aload_0         
	//  154  330:new             #31  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity>
	//  155  333:dup             
	//  156  334:aload_1         
	//  157  335:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  158  338:invokespecial   #227 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity(MainComponent)>
	//  159  341:putfield        #229 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity getDeviceSecurityProvider>
		getPostAuthWorkJobFactoryProvider = new com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory(builder1.mainComponent);
	//  160  344:aload_0         
	//  161  345:new             #46  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory>
	//  162  348:dup             
	//  163  349:aload_1         
	//  164  350:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  165  353:invokespecial   #230 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory(MainComponent)>
	//  166  356:putfield        #232 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory getPostAuthWorkJobFactoryProvider>
		getApiCallFactoryProvider = new com_ibotta_android_di_MainComponent_getApiCallFactory(builder1.mainComponent);
	//  167  359:aload_0         
	//  168  360:new             #16  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiCallFactory>
	//  169  363:dup             
	//  170  364:aload_1         
	//  171  365:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  172  368:invokespecial   #233 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiCallFactory(MainComponent)>
	//  173  371:putfield        #235 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider>
		getAuthManagerProvider = new com_ibotta_android_di_MainComponent_getAuthManager(builder1.mainComponent);
	//  174  374:aload_0         
	//  175  375:new             #25  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAuthManager>
	//  176  378:dup             
	//  177  379:aload_1         
	//  178  380:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  179  383:invokespecial   #236 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAuthManager(MainComponent)>
	//  180  386:putfield        #238 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider>
		getCacheClearJobFactoryProvider = new com_ibotta_android_di_MainComponent_getCacheClearJobFactory(builder1.mainComponent);
	//  181  389:aload_0         
	//  182  390:new             #28  <Class DaggerAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory>
	//  183  393:dup             
	//  184  394:aload_1         
	//  185  395:invokestatic    #155 <Method MainComponent DaggerAccountComponent$Builder.access$200(DaggerAccountComponent$Builder)>
	//  186  398:invokespecial   #239 <Method void DaggerAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory(MainComponent)>
	//  187  401:putfield        #241 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
		provideFacebookManagerProvider = DoubleCheck.provider(((Provider) (AccountModule_ProvideFacebookManagerFactory.create(builder1.accountModule, ((Provider) (getDeviceSecurityProvider)), ((Provider) (getPostAuthWorkJobFactoryProvider)), ((Provider) (getApiCallFactoryProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getUserStateProvider)), ((Provider) (getAuthManagerProvider)), ((Provider) (getCacheClearJobFactoryProvider))))));
	//  188  404:aload_0         
	//  189  405:aload_1         
	//  190  406:invokestatic    #137 <Method AccountModule DaggerAccountComponent$Builder.access$100(DaggerAccountComponent$Builder)>
	//  191  409:aload_0         
	//  192  410:getfield        #229 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity getDeviceSecurityProvider>
	//  193  413:aload_0         
	//  194  414:getfield        #232 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory getPostAuthWorkJobFactoryProvider>
	//  195  417:aload_0         
	//  196  418:getfield        #235 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider>
	//  197  421:aload_0         
	//  198  422:getfield        #207 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//  199  425:aload_0         
	//  200  426:getfield        #163 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
	//  201  429:aload_0         
	//  202  430:getfield        #238 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider>
	//  203  433:aload_0         
	//  204  434:getfield        #241 <Field DaggerAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
	//  205  437:invokestatic    #246 <Method AccountModule_ProvideFacebookManagerFactory AccountModule_ProvideFacebookManagerFactory.create(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//  206  440:invokestatic    #149 <Method Provider DoubleCheck.provider(Provider)>
	//  207  443:putfield        #248 <Field Provider provideFacebookManagerProvider>
	//  208  446:return          
	}

	private AccountActivity injectAccountActivity(AccountActivity accountactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #219 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #257 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//    5   13:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   16:checkcast       #267 <Class AppHelper>
	//    7   19:invokestatic    #273 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   22:aload_1         
	//    9   23:aload_0         
	//   10   24:getfield        #219 <Field MainComponent mainComponent>
	//   11   27:invokeinterface #277 <Method Handler MainComponent.getHandler()>
	//   12   32:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   13   35:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   38:checkcast       #279 <Class Handler>
	//   15   41:invokestatic    #283 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   44:aload_1         
	//   17   45:aload_0         
	//   18   46:getfield        #219 <Field MainComponent mainComponent>
	//   19   49:invokeinterface #287 <Method AuthManager MainComponent.getAuthManager()>
	//   20   54:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   21   57:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   60:checkcast       #289 <Class AuthManager>
	//   23   63:invokestatic    #293 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   66:aload_1         
	//   25   67:aload_0         
	//   26   68:getfield        #219 <Field MainComponent mainComponent>
	//   27   71:invokeinterface #297 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   76:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   29   79:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   82:checkcast       #299 <Class ButtonSdkManager>
	//   31   85:invokestatic    #303 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   88:aload_1         
	//   33   89:aload_0         
	//   34   90:getfield        #219 <Field MainComponent mainComponent>
	//   35   93:invokeinterface #307 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   98:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   37  101:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38  104:checkcast       #309 <Class UpgradeState>
	//   39  107:invokestatic    #313 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  110:aload_1         
	//   41  111:aload_0         
	//   42  112:getfield        #219 <Field MainComponent mainComponent>
	//   43  115:invokeinterface #317 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  120:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   45  123:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  126:checkcast       #319 <Class AppCacheState>
	//   47  129:invokestatic    #323 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  132:aload_1         
	//   49  133:aload_0         
	//   50  134:getfield        #219 <Field MainComponent mainComponent>
	//   51  137:invokeinterface #327 <Method DebugState MainComponent.getDebugState()>
	//   52  142:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   53  145:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  148:checkcast       #329 <Class DebugState>
	//   55  151:invokestatic    #333 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  154:aload_1         
	//   57  155:aload_0         
	//   58  156:getfield        #219 <Field MainComponent mainComponent>
	//   59  159:invokeinterface #337 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  164:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   61  167:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  170:checkcast       #339 <Class CacheClearJobFactory>
	//   63  173:invokestatic    #343 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  176:aload_1         
	//   65  177:aload_0         
	//   66  178:getfield        #219 <Field MainComponent mainComponent>
	//   67  181:invokeinterface #347 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  186:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   69  189:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  192:checkcast       #349 <Class GlobalEventManager>
	//   71  195:invokestatic    #353 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  198:aload_1         
	//   73  199:aload_0         
	//   74  200:getfield        #219 <Field MainComponent mainComponent>
	//   75  203:invokeinterface #357 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  208:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   77  211:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  214:checkcast       #359 <Class BuildProfile>
	//   79  217:invokestatic    #363 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  220:aload_1         
	//   81  221:aload_0         
	//   82  222:getfield        #219 <Field MainComponent mainComponent>
	//   83  225:invokeinterface #367 <Method Tracker MainComponent.getTracker()>
	//   84  230:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   85  233:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  236:checkcast       #369 <Class Tracker>
	//   87  239:invokestatic    #373 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  242:aload_1         
	//   89  243:aload_0         
	//   90  244:getfield        #219 <Field MainComponent mainComponent>
	//   91  247:invokeinterface #377 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  252:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//   93  255:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  258:checkcast       #379 <Class TrackingFlushWorker>
	//   95  261:invokestatic    #383 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (accountactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  264:aload_1         
	//   97  265:aload_0         
	//   98  266:getfield        #219 <Field MainComponent mainComponent>
	//   99  269:invokeinterface #387 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  274:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  101  277:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  280:checkcast       #389 <Class NotificationTracking>
	//  103  283:invokestatic    #393 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (accountactivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  286:aload_1         
	//  105  287:aload_0         
	//  106  288:getfield        #219 <Field MainComponent mainComponent>
	//  107  291:invokeinterface #397 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  296:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  109  299:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  302:checkcast       #399 <Class RetailerParcelHelper>
	//  111  305:invokestatic    #405 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		AccountActivity_MembersInjector.injectAppHelper(accountactivity, (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//  112  308:aload_1         
	//  113  309:aload_0         
	//  114  310:getfield        #219 <Field MainComponent mainComponent>
	//  115  313:invokeinterface #257 <Method AppHelper MainComponent.getAppHelper()>
	//  116  318:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  117  321:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  118  324:checkcast       #267 <Class AppHelper>
	//  119  327:invokestatic    #410 <Method void AccountActivity_MembersInjector.injectAppHelper(AccountActivity, AppHelper)>
		AccountActivity_MembersInjector.injectAppConfig(accountactivity, (AppConfig)Preconditions.checkNotNull(((Object) (mainComponent.getAppConfig())), "Cannot return null from a non-@Nullable component method"));
	//  120  330:aload_1         
	//  121  331:aload_0         
	//  122  332:getfield        #219 <Field MainComponent mainComponent>
	//  123  335:invokeinterface #414 <Method AppConfig MainComponent.getAppConfig()>
	//  124  340:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  125  343:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  126  346:checkcast       #416 <Class AppConfig>
	//  127  349:invokestatic    #420 <Method void AccountActivity_MembersInjector.injectAppConfig(AccountActivity, AppConfig)>
		AccountActivity_MembersInjector.injectBrazeTracking(accountactivity, (BrazeTracking)Preconditions.checkNotNull(((Object) (mainComponent.getBrazeTracking())), "Cannot return null from a non-@Nullable component method"));
	//  128  352:aload_1         
	//  129  353:aload_0         
	//  130  354:getfield        #219 <Field MainComponent mainComponent>
	//  131  357:invokeinterface #424 <Method BrazeTracking MainComponent.getBrazeTracking()>
	//  132  362:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  133  365:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  134  368:checkcast       #426 <Class BrazeTracking>
	//  135  371:invokestatic    #430 <Method void AccountActivity_MembersInjector.injectBrazeTracking(AccountActivity, BrazeTracking)>
		AccountActivity_MembersInjector.injectDeviceSecurity(accountactivity, (DeviceSecurity)Preconditions.checkNotNull(((Object) (mainComponent.getDeviceSecurity())), "Cannot return null from a non-@Nullable component method"));
	//  136  374:aload_1         
	//  137  375:aload_0         
	//  138  376:getfield        #219 <Field MainComponent mainComponent>
	//  139  379:invokeinterface #434 <Method DeviceSecurity MainComponent.getDeviceSecurity()>
	//  140  384:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  141  387:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  142  390:checkcast       #436 <Class DeviceSecurity>
	//  143  393:invokestatic    #440 <Method void AccountActivity_MembersInjector.injectDeviceSecurity(AccountActivity, DeviceSecurity)>
		AccountActivity_MembersInjector.injectScrollingBottomSpace(accountactivity, (ScrollingBottomSpace)provideScrollingBottomSpaceProvider.get());
	//  144  396:aload_1         
	//  145  397:aload_0         
	//  146  398:getfield        #226 <Field Provider provideScrollingBottomSpaceProvider>
	//  147  401:invokeinterface #446 <Method Object Provider.get()>
	//  148  406:checkcast       #448 <Class ScrollingBottomSpace>
	//  149  409:invokestatic    #452 <Method void AccountActivity_MembersInjector.injectScrollingBottomSpace(AccountActivity, ScrollingBottomSpace)>
		AccountActivity_MembersInjector.injectFbManager(accountactivity, (FacebookManager)provideFacebookManagerProvider.get());
	//  150  412:aload_1         
	//  151  413:aload_0         
	//  152  414:getfield        #248 <Field Provider provideFacebookManagerProvider>
	//  153  417:invokeinterface #446 <Method Object Provider.get()>
	//  154  422:checkcast       #454 <Class FacebookManager>
	//  155  425:invokestatic    #458 <Method void AccountActivity_MembersInjector.injectFbManager(AccountActivity, FacebookManager)>
		AccountActivity_MembersInjector.injectCacheClearFactory(accountactivity, (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//  156  428:aload_1         
	//  157  429:aload_0         
	//  158  430:getfield        #219 <Field MainComponent mainComponent>
	//  159  433:invokeinterface #337 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//  160  438:ldc2            #259 <String "Cannot return null from a non-@Nullable component method">
	//  161  441:invokestatic    #265 <Method Object Preconditions.checkNotNull(Object, String)>
	//  162  444:checkcast       #339 <Class CacheClearJobFactory>
	//  163  447:invokestatic    #461 <Method void AccountActivity_MembersInjector.injectCacheClearFactory(AccountActivity, CacheClearJobFactory)>
		return accountactivity;
	//  164  450:aload_1         
	//  165  451:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method AccountPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public AccountPresenter getMvpPresenter()
	{
		return (AccountPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #446 <Method Object Provider.get()>
	//    3    9:checkcast       #469 <Class AccountPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #474 <Method AccountView getMvpView()>
	//    2    4:areturn         
	}

	public AccountView getMvpView()
	{
		return (AccountView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #446 <Method Object Provider.get()>
	//    3    9:checkcast       #476 <Class AccountView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #446 <Method Object Provider.get()>
	//    3    9:checkcast       #480 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((AccountView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #476 <Class AccountView>
	//    3    5:invokevirtual   #485 <Method void inject(AccountView)>
	//    4    8:return          
	}

	public void inject(AccountActivity accountactivity)
	{
		injectAccountActivity(accountactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #488 <Method AccountActivity injectAccountActivity(AccountActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(AccountView accountview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getAccountEventContextProvider getAccountEventContextProvider;
	private com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider;
	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider;
	private com_ibotta_android_di_MainComponent_getAuthManager getAuthManagerProvider;
	private com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getDeviceSecurity getDeviceSecurityProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory getPostAuthWorkJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getPwiVariant getPwiVariantProvider;
	private com_ibotta_android_di_MainComponent_getTeamworkVariant getTeamworkVariantProvider;
	private com_ibotta_android_di_MainComponent_getTracker getTrackerProvider;
	private com_ibotta_android_di_MainComponent_getTrackingQueue getTrackingQueueProvider;
	private com_ibotta_android_di_MainComponent_getUserState getUserStateProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private Provider provideFacebookManagerProvider;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider provideRedeemPreflightHelperProvider;
	private Provider provideScrollingBottomSpaceProvider;
	private Provider providesAccountTrackingProvider;
}
