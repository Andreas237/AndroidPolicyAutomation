// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.mvp.base.*;
import com.ibotta.android.mvp.base.contentevents.ContentEventsActivity_MembersInjector;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.ApiJobFactory;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.call.ApiCallFactory;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectComponent, PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory, PayPalConnectModule_ProvideMvpPresenterFactory, PayPalConnectPresenter, 
//			PayPalConnectView, PayPalConnectActivity, PayPalConnectModule

public final class DaggerPayPalConnectComponent
	implements PayPalConnectComponent
{
	public static final class Builder
	{

		public PayPalConnectComponent build()
		{
			if(payPalConnectModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field PayPalConnectModule payPalConnectModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((PayPalConnectComponent) (new DaggerPayPalConnectComponent(this)));
		//    6   14:new             #6   <Class DaggerPayPalConnectComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #31  <Method void DaggerPayPalConnectComponent(DaggerPayPalConnectComponent$Builder, DaggerPayPalConnectComponent$1)>
		//   11   23:areturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   12   24:new             #33  <Class StringBuilder>
		//   13   27:dup             
		//   14   28:invokespecial   #34  <Method void StringBuilder()>
		//   15   31:astore_1        
					stringbuilder.append(((Class) (com/ibotta/android/di/MainComponent)).getCanonicalName());
		//   16   32:aload_1         
		//   17   33:ldc1            #36  <Class MainComponent>
		//   18   35:invokevirtual   #42  <Method String Class.getCanonicalName()>
		//   19   38:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
					stringbuilder.append(" must be set");
		//   21   42:aload_1         
		//   22   43:ldc1            #48  <String " must be set">
		//   23   45:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   24   48:pop             
					throw new IllegalStateException(stringbuilder.toString());
		//   25   49:new             #50  <Class IllegalStateException>
		//   26   52:dup             
		//   27   53:aload_1         
		//   28   54:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   29   57:invokespecial   #56  <Method void IllegalStateException(String)>
		//   30   60:athrow          
				}
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//   31   61:new             #33  <Class StringBuilder>
		//   32   64:dup             
		//   33   65:invokespecial   #34  <Method void StringBuilder()>
		//   34   68:astore_1        
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/account/withdraw/paypal/PayPalConnectModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #58  <Class PayPalConnectModule>
		//   37   72:invokevirtual   #42  <Method String Class.getCanonicalName()>
		//   38   75:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:pop             
				stringbuilder1.append(" must be set");
		//   40   79:aload_1         
		//   41   80:ldc1            #48  <String " must be set">
		//   42   82:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   43   85:pop             
				throw new IllegalStateException(stringbuilder1.toString());
		//   44   86:new             #50  <Class IllegalStateException>
		//   45   89:dup             
		//   46   90:aload_1         
		//   47   91:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   48   94:invokespecial   #56  <Method void IllegalStateException(String)>
		//   49   97:athrow          
			}
		}

		public Builder mainComponent(MainComponent maincomponent)
		{
			mainComponent = (MainComponent)Preconditions.checkNotNull(((Object) (maincomponent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #36  <Class MainComponent>
		//    4    8:putfield        #26  <Field MainComponent mainComponent>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder payPalConnectModule(PayPalConnectModule paypalconnectmodule)
		{
			payPalConnectModule = (PayPalConnectModule)Preconditions.checkNotNull(((Object) (paypalconnectmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #58  <Class PayPalConnectModule>
		//    4    8:putfield        #22  <Field PayPalConnectModule payPalConnectModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		private MainComponent mainComponent;
		private PayPalConnectModule payPalConnectModule;


/*
		static PayPalConnectModule access$100(Builder builder1)
		{
			return builder1.payPalConnectModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field PayPalConnectModule payPalConnectModule>
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

	private static class com_ibotta_android_di_MainComponent_getApiJobFactory
		implements Provider
	{

		public ApiJobFactory get()
		{
			return (ApiJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getApiJobFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method ApiJobFactory MainComponent.getApiJobFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class ApiJobFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method ApiJobFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getApiJobFactory(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getAppConfig
		implements Provider
	{

		public AppConfig get()
		{
			return (AppConfig)Preconditions.checkNotNull(((Object) (mainComponent.getAppConfig())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method AppConfig MainComponent.getAppConfig()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class AppConfig>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method AppConfig get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getAppConfig(MainComponent maincomponent)
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


	private DaggerPayPalConnectComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #80  <Method void initialize(DaggerPayPalConnectComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerPayPalConnectComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #89  <Method void DaggerPayPalConnectComponent$Builder(DaggerPayPalConnectComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.payPalConnectModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #93  <Method PayPalConnectModule DaggerPayPalConnectComponent$Builder.access$100(DaggerPayPalConnectComponent$Builder)>
	//    3    5:invokestatic    #99  <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #105 <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #107 <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #34  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   11   23:invokespecial   #114 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #116 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getAppConfigProvider = new com_ibotta_android_di_MainComponent_getAppConfig(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #22  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   18   38:invokespecial   #117 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig(MainComponent)>
	//   19   41:putfield        #119 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig getAppConfigProvider>
		getApiCallFactoryProvider = new com_ibotta_android_di_MainComponent_getApiCallFactory(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #13  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiCallFactory>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   25   53:invokespecial   #120 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiCallFactory(MainComponent)>
	//   26   56:putfield        #122 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider>
		getApiJobFactoryProvider = new com_ibotta_android_di_MainComponent_getApiJobFactory(builder1.mainComponent);
	//   27   59:aload_0         
	//   28   60:new             #16  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiJobFactory>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   32   68:invokespecial   #123 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiJobFactory(MainComponent)>
	//   33   71:putfield        #125 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiJobFactory getApiJobFactoryProvider>
		providePayPalConnectCollaboratorsProvider = DoubleCheck.provider(((Provider) (PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory.create(builder1.payPalConnectModule))));
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:invokestatic    #93  <Method PayPalConnectModule DaggerPayPalConnectComponent$Builder.access$100(DaggerPayPalConnectComponent$Builder)>
	//   37   79:invokestatic    #130 <Method PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory.create(PayPalConnectModule)>
	//   38   82:invokestatic    #105 <Method Provider DoubleCheck.provider(Provider)>
	//   39   85:putfield        #132 <Field Provider providePayPalConnectCollaboratorsProvider>
		getCacheClearJobFactoryProvider = new com_ibotta_android_di_MainComponent_getCacheClearJobFactory(builder1.mainComponent);
	//   40   88:aload_0         
	//   41   89:new             #25  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory>
	//   42   92:dup             
	//   43   93:aload_1         
	//   44   94:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   45   97:invokespecial   #133 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory(MainComponent)>
	//   46  100:putfield        #135 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (PayPalConnectModule_ProvideMvpPresenterFactory.create(builder1.payPalConnectModule, ((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getAppConfigProvider)), ((Provider) (getApiCallFactoryProvider)), ((Provider) (getApiJobFactoryProvider)), providePayPalConnectCollaboratorsProvider, ((Provider) (getCacheClearJobFactoryProvider))))));
	//   47  103:aload_0         
	//   48  104:aload_1         
	//   49  105:invokestatic    #93  <Method PayPalConnectModule DaggerPayPalConnectComponent$Builder.access$100(DaggerPayPalConnectComponent$Builder)>
	//   50  108:aload_0         
	//   51  109:getfield        #116 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   52  112:aload_0         
	//   53  113:getfield        #119 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig getAppConfigProvider>
	//   54  116:aload_0         
	//   55  117:getfield        #122 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider>
	//   56  120:aload_0         
	//   57  121:getfield        #125 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiJobFactory getApiJobFactoryProvider>
	//   58  124:aload_0         
	//   59  125:getfield        #132 <Field Provider providePayPalConnectCollaboratorsProvider>
	//   60  128:aload_0         
	//   61  129:getfield        #135 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
	//   62  132:invokestatic    #140 <Method PayPalConnectModule_ProvideMvpPresenterFactory PayPalConnectModule_ProvideMvpPresenterFactory.create(PayPalConnectModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   63  135:invokestatic    #105 <Method Provider DoubleCheck.provider(Provider)>
	//   64  138:putfield        #142 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   65  141:aload_0         
	//   66  142:new             #37  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   67  145:dup             
	//   68  146:aload_1         
	//   69  147:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   70  150:invokespecial   #143 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   71  153:putfield        #145 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   72  156:aload_0         
	//   73  157:new             #31  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   74  160:dup             
	//   75  161:aload_1         
	//   76  162:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   77  165:invokespecial   #146 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   78  168:putfield        #148 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   79  171:aload_0         
	//   80  172:new             #28  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   81  175:dup             
	//   82  176:aload_1         
	//   83  177:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   84  180:invokespecial   #149 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   85  183:putfield        #151 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   86  186:aload_0         
	//   87  187:new             #19  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   88  190:dup             
	//   89  191:aload_1         
	//   90  192:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   91  195:invokespecial   #152 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   92  198:putfield        #154 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   93  201:aload_0         
	//   94  202:new             #40  <Class DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//   95  205:dup             
	//   96  206:aload_1         
	//   97  207:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//   98  210:invokespecial   #155 <Method void DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//   99  213:putfield        #157 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.payPalConnectModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//  100  216:aload_0         
	//  101  217:aload_1         
	//  102  218:invokestatic    #93  <Method PayPalConnectModule DaggerPayPalConnectComponent$Builder.access$100(DaggerPayPalConnectComponent$Builder)>
	//  103  221:aload_0         
	//  104  222:getfield        #145 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//  105  225:aload_0         
	//  106  226:getfield        #148 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//  107  229:aload_0         
	//  108  230:getfield        #151 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//  109  233:aload_0         
	//  110  234:getfield        #154 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//  111  237:aload_0         
	//  112  238:getfield        #157 <Field DaggerPayPalConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//  113  241:invokestatic    #162 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//  114  244:invokestatic    #105 <Method Provider DoubleCheck.provider(Provider)>
	//  115  247:putfield        #164 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//  116  250:aload_0         
	//  117  251:aload_1         
	//  118  252:invokestatic    #111 <Method MainComponent DaggerPayPalConnectComponent$Builder.access$200(DaggerPayPalConnectComponent$Builder)>
	//  119  255:putfield        #166 <Field MainComponent mainComponent>
	//  120  258:return          
	}

	private PayPalConnectActivity injectPayPalConnectActivity(PayPalConnectActivity paypalconnectactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #166 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #175 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #185 <Class AppHelper>
	//    7   18:invokestatic    #191 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #166 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #195 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #197 <Class Handler>
	//   15   39:invokestatic    #201 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #166 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #205 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #207 <Class AuthManager>
	//   23   60:invokestatic    #211 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #166 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #215 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #217 <Class ButtonSdkManager>
	//   31   81:invokestatic    #221 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #166 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #225 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #227 <Class UpgradeState>
	//   39  102:invokestatic    #231 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #166 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #235 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #237 <Class AppCacheState>
	//   47  123:invokestatic    #241 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #166 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #245 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #247 <Class DebugState>
	//   55  144:invokestatic    #251 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #166 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #255 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #257 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #261 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #166 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #265 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #267 <Class GlobalEventManager>
	//   71  186:invokestatic    #271 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #166 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #275 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #277 <Class BuildProfile>
	//   79  207:invokestatic    #281 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #166 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #285 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #287 <Class Tracker>
	//   87  228:invokestatic    #291 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #166 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #295 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #297 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #301 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (paypalconnectactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #166 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #305 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #307 <Class NotificationTracking>
	//  103  270:invokestatic    #311 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (paypalconnectactivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #166 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #315 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  283:ldc1            #177 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #317 <Class RetailerParcelHelper>
	//  111  291:invokestatic    #323 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		return paypalconnectactivity;
	//  112  294:aload_1         
	//  113  295:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #329 <Method PayPalConnectPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public PayPalConnectPresenter getMvpPresenter()
	{
		return (PayPalConnectPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #335 <Method Object Provider.get()>
	//    3    9:checkcast       #337 <Class PayPalConnectPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method PayPalConnectView getMvpView()>
	//    2    4:areturn         
	}

	public PayPalConnectView getMvpView()
	{
		return (PayPalConnectView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #335 <Method Object Provider.get()>
	//    3    9:checkcast       #344 <Class PayPalConnectView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #335 <Method Object Provider.get()>
	//    3    9:checkcast       #348 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((PayPalConnectView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #344 <Class PayPalConnectView>
	//    3    5:invokevirtual   #353 <Method void inject(PayPalConnectView)>
	//    4    8:return          
	}

	public void inject(PayPalConnectActivity paypalconnectactivity)
	{
		injectPayPalConnectActivity(paypalconnectactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #356 <Method PayPalConnectActivity injectPayPalConnectActivity(PayPalConnectActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(PayPalConnectView paypalconnectview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiCallFactory getApiCallFactoryProvider;
	private com_ibotta_android_di_MainComponent_getApiJobFactory getApiJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getAppConfig getAppConfigProvider;
	private com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider providePayPalConnectCollaboratorsProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
