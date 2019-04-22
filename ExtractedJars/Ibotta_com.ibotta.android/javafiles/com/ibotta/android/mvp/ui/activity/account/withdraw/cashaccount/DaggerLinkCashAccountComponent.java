// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import android.content.res.Resources;
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
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactory;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.security.PasswordCache;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.title.TitleBarReducer;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.util.*;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountComponent, LinkCashAccountModule_ProvideLinkCashAccountReducerFactory, LinkCashAccountModule_ProvideMvpPresenterFactory, LinkCashAccountModule_ProvidePasswordPrompterFactoryFactory, 
//			LinkCashAccountActivity_MembersInjector, LinkCashAccountPresenter, LinkCashAccountView, LinkCashAccountActivity, 
//			LinkCashAccountModule

public final class DaggerLinkCashAccountComponent
	implements LinkCashAccountComponent
{
	public static final class Builder
	{

		public LinkCashAccountComponent build()
		{
			if(linkCashAccountModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field LinkCashAccountModule linkCashAccountModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((LinkCashAccountComponent) (new DaggerLinkCashAccountComponent(this)));
		//    6   14:new             #6   <Class DaggerLinkCashAccountComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #31  <Method void DaggerLinkCashAccountComponent(DaggerLinkCashAccountComponent$Builder, DaggerLinkCashAccountComponent$1)>
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
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/account/withdraw/cashaccount/LinkCashAccountModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #58  <Class LinkCashAccountModule>
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

		public Builder linkCashAccountModule(LinkCashAccountModule linkcashaccountmodule)
		{
			linkCashAccountModule = (LinkCashAccountModule)Preconditions.checkNotNull(((Object) (linkcashaccountmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #58  <Class LinkCashAccountModule>
		//    4    8:putfield        #22  <Field LinkCashAccountModule linkCashAccountModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
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

		private LinkCashAccountModule linkCashAccountModule;
		private MainComponent mainComponent;


/*
		static LinkCashAccountModule access$100(Builder builder1)
		{
			return builder1.linkCashAccountModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field LinkCashAccountModule linkCashAccountModule>
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

	private static class com_ibotta_android_di_MainComponent_getPasswordCache
		implements Provider
	{

		public PasswordCache get()
		{
			return (PasswordCache)Preconditions.checkNotNull(((Object) (mainComponent.getPasswordCache())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method PasswordCache MainComponent.getPasswordCache()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class PasswordCache>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method PasswordCache get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getPasswordCache(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getResources
		implements Provider
	{

		public Resources get()
		{
			return (Resources)Preconditions.checkNotNull(((Object) (mainComponent.getResources())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method Resources MainComponent.getResources()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class Resources>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Resources get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getResources(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getTitleBarReducer
		implements Provider
	{

		public TitleBarReducer get()
		{
			return (TitleBarReducer)Preconditions.checkNotNull(((Object) (mainComponent.getTitleBarReducer())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method TitleBarReducer MainComponent.getTitleBarReducer()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class TitleBarReducer>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method TitleBarReducer get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getTitleBarReducer(MainComponent maincomponent)
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

	private static class com_ibotta_android_di_MainComponent_getValidation
		implements Provider
	{

		public Validation get()
		{
			return (Validation)Preconditions.checkNotNull(((Object) (mainComponent.getValidation())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method Validation MainComponent.getValidation()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class Validation>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Validation get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getValidation(MainComponent maincomponent)
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


	private DaggerLinkCashAccountComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #97  <Method void initialize(DaggerLinkCashAccountComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerLinkCashAccountComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #106 <Method void DaggerLinkCashAccountComponent$Builder(DaggerLinkCashAccountComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.linkCashAccountModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #110 <Method LinkCashAccountModule DaggerLinkCashAccountComponent$Builder.access$100(DaggerLinkCashAccountComponent$Builder)>
	//    3    5:invokestatic    #116 <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #122 <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #124 <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #28  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   11   23:invokespecial   #131 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #133 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getUserStateProvider = new com_ibotta_android_di_MainComponent_getUserState(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #43  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getUserState>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   18   38:invokespecial   #134 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getUserState(MainComponent)>
	//   19   41:putfield        #136 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
		getValidationProvider = new com_ibotta_android_di_MainComponent_getValidation(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #46  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getValidation>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   25   53:invokespecial   #137 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getValidation(MainComponent)>
	//   26   56:putfield        #139 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getValidation getValidationProvider>
		getCacheClearJobFactoryProvider = new com_ibotta_android_di_MainComponent_getCacheClearJobFactory(builder1.mainComponent);
	//   27   59:aload_0         
	//   28   60:new             #19  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   32   68:invokespecial   #140 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory(MainComponent)>
	//   33   71:putfield        #142 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
		getTitleBarReducerProvider = new com_ibotta_android_di_MainComponent_getTitleBarReducer(builder1.mainComponent);
	//   34   74:aload_0         
	//   35   75:new             #40  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer>
	//   36   78:dup             
	//   37   79:aload_1         
	//   38   80:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   39   83:invokespecial   #143 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer(MainComponent)>
	//   40   86:putfield        #145 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider>
		getResourcesProvider = new com_ibotta_android_di_MainComponent_getResources(builder1.mainComponent);
	//   41   89:aload_0         
	//   42   90:new             #37  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getResources>
	//   43   93:dup             
	//   44   94:aload_1         
	//   45   95:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   46   98:invokespecial   #146 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getResources(MainComponent)>
	//   47  101:putfield        #148 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getResources getResourcesProvider>
		provideLinkCashAccountReducerProvider = LinkCashAccountModule_ProvideLinkCashAccountReducerFactory.create(((Provider) (getTitleBarReducerProvider)), ((Provider) (getResourcesProvider)));
	//   48  104:aload_0         
	//   49  105:aload_0         
	//   50  106:getfield        #145 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider>
	//   51  109:aload_0         
	//   52  110:getfield        #148 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getResources getResourcesProvider>
	//   53  113:invokestatic    #153 <Method LinkCashAccountModule_ProvideLinkCashAccountReducerFactory LinkCashAccountModule_ProvideLinkCashAccountReducerFactory.create(Provider, Provider)>
	//   54  116:putfield        #155 <Field LinkCashAccountModule_ProvideLinkCashAccountReducerFactory provideLinkCashAccountReducerProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (LinkCashAccountModule_ProvideMvpPresenterFactory.create(builder1.linkCashAccountModule, ((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getUserStateProvider)), ((Provider) (getValidationProvider)), ((Provider) (getCacheClearJobFactoryProvider)), ((Provider) (provideLinkCashAccountReducerProvider))))));
	//   55  119:aload_0         
	//   56  120:aload_1         
	//   57  121:invokestatic    #110 <Method LinkCashAccountModule DaggerLinkCashAccountComponent$Builder.access$100(DaggerLinkCashAccountComponent$Builder)>
	//   58  124:aload_0         
	//   59  125:getfield        #133 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   60  128:aload_0         
	//   61  129:getfield        #136 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
	//   62  132:aload_0         
	//   63  133:getfield        #139 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getValidation getValidationProvider>
	//   64  136:aload_0         
	//   65  137:getfield        #142 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
	//   66  140:aload_0         
	//   67  141:getfield        #155 <Field LinkCashAccountModule_ProvideLinkCashAccountReducerFactory provideLinkCashAccountReducerProvider>
	//   68  144:invokestatic    #160 <Method LinkCashAccountModule_ProvideMvpPresenterFactory LinkCashAccountModule_ProvideMvpPresenterFactory.create(LinkCashAccountModule, Provider, Provider, Provider, Provider, Provider)>
	//   69  147:invokestatic    #122 <Method Provider DoubleCheck.provider(Provider)>
	//   70  150:putfield        #162 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   71  153:aload_0         
	//   72  154:new             #31  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   73  157:dup             
	//   74  158:aload_1         
	//   75  159:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   76  162:invokespecial   #163 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   77  165:putfield        #165 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   78  168:aload_0         
	//   79  169:new             #25  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   80  172:dup             
	//   81  173:aload_1         
	//   82  174:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   83  177:invokespecial   #166 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   84  180:putfield        #168 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   85  183:aload_0         
	//   86  184:new             #22  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   87  187:dup             
	//   88  188:aload_1         
	//   89  189:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   90  192:invokespecial   #169 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   91  195:putfield        #171 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   92  198:aload_0         
	//   93  199:new             #13  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   94  202:dup             
	//   95  203:aload_1         
	//   96  204:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//   97  207:invokespecial   #172 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   98  210:putfield        #174 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   99  213:aload_0         
	//  100  214:new             #49  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//  101  217:dup             
	//  102  218:aload_1         
	//  103  219:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//  104  222:invokespecial   #175 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//  105  225:putfield        #177 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.linkCashAccountModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//  106  228:aload_0         
	//  107  229:aload_1         
	//  108  230:invokestatic    #110 <Method LinkCashAccountModule DaggerLinkCashAccountComponent$Builder.access$100(DaggerLinkCashAccountComponent$Builder)>
	//  109  233:aload_0         
	//  110  234:getfield        #165 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//  111  237:aload_0         
	//  112  238:getfield        #168 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//  113  241:aload_0         
	//  114  242:getfield        #171 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//  115  245:aload_0         
	//  116  246:getfield        #174 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//  117  249:aload_0         
	//  118  250:getfield        #177 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//  119  253:invokestatic    #182 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//  120  256:invokestatic    #122 <Method Provider DoubleCheck.provider(Provider)>
	//  121  259:putfield        #184 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//  122  262:aload_0         
	//  123  263:aload_1         
	//  124  264:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//  125  267:putfield        #186 <Field MainComponent mainComponent>
		getPasswordCacheProvider = new com_ibotta_android_di_MainComponent_getPasswordCache(builder1.mainComponent);
	//  126  270:aload_0         
	//  127  271:new             #34  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getPasswordCache>
	//  128  274:dup             
	//  129  275:aload_1         
	//  130  276:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//  131  279:invokespecial   #187 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getPasswordCache(MainComponent)>
	//  132  282:putfield        #189 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider>
		getAppHelperProvider = new com_ibotta_android_di_MainComponent_getAppHelper(builder1.mainComponent);
	//  133  285:aload_0         
	//  134  286:new             #16  <Class DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper>
	//  135  289:dup             
	//  136  290:aload_1         
	//  137  291:invokestatic    #128 <Method MainComponent DaggerLinkCashAccountComponent$Builder.access$200(DaggerLinkCashAccountComponent$Builder)>
	//  138  294:invokespecial   #190 <Method void DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper(MainComponent)>
	//  139  297:putfield        #192 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
		providePasswordPrompterFactoryProvider = DoubleCheck.provider(((Provider) (LinkCashAccountModule_ProvidePasswordPrompterFactoryFactory.create(builder1.linkCashAccountModule, ((Provider) (getPasswordCacheProvider)), ((Provider) (getAppHelperProvider))))));
	//  140  300:aload_0         
	//  141  301:aload_1         
	//  142  302:invokestatic    #110 <Method LinkCashAccountModule DaggerLinkCashAccountComponent$Builder.access$100(DaggerLinkCashAccountComponent$Builder)>
	//  143  305:aload_0         
	//  144  306:getfield        #189 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider>
	//  145  309:aload_0         
	//  146  310:getfield        #192 <Field DaggerLinkCashAccountComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
	//  147  313:invokestatic    #197 <Method LinkCashAccountModule_ProvidePasswordPrompterFactoryFactory LinkCashAccountModule_ProvidePasswordPrompterFactoryFactory.create(LinkCashAccountModule, Provider, Provider)>
	//  148  316:invokestatic    #122 <Method Provider DoubleCheck.provider(Provider)>
	//  149  319:putfield        #199 <Field Provider providePasswordPrompterFactoryProvider>
	//  150  322:return          
	}

	private LinkCashAccountActivity injectLinkCashAccountActivity(LinkCashAccountActivity linkcashaccountactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #186 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #208 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #218 <Class AppHelper>
	//    7   18:invokestatic    #224 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #186 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #228 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #230 <Class Handler>
	//   15   39:invokestatic    #234 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #186 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #238 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #240 <Class AuthManager>
	//   23   60:invokestatic    #244 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #186 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #248 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #250 <Class ButtonSdkManager>
	//   31   81:invokestatic    #254 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #186 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #258 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #260 <Class UpgradeState>
	//   39  102:invokestatic    #264 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #186 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #268 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #270 <Class AppCacheState>
	//   47  123:invokestatic    #274 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #186 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #278 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #280 <Class DebugState>
	//   55  144:invokestatic    #284 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #186 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #288 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #290 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #294 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #186 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #298 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #300 <Class GlobalEventManager>
	//   71  186:invokestatic    #304 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #186 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #308 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #310 <Class BuildProfile>
	//   79  207:invokestatic    #314 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #186 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #318 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #320 <Class Tracker>
	//   87  228:invokestatic    #324 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #186 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #328 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #330 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #334 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (linkcashaccountactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #186 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #338 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #340 <Class NotificationTracking>
	//  103  270:invokestatic    #344 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (linkcashaccountactivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #186 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #348 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  283:ldc1            #210 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #350 <Class RetailerParcelHelper>
	//  111  291:invokestatic    #356 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		LinkCashAccountActivity_MembersInjector.injectPasswordPrompterFactory(linkcashaccountactivity, (PasswordPrompterFactory)providePasswordPrompterFactoryProvider.get());
	//  112  294:aload_1         
	//  113  295:aload_0         
	//  114  296:getfield        #199 <Field Provider providePasswordPrompterFactoryProvider>
	//  115  299:invokeinterface #362 <Method Object Provider.get()>
	//  116  304:checkcast       #364 <Class PasswordPrompterFactory>
	//  117  307:invokestatic    #370 <Method void LinkCashAccountActivity_MembersInjector.injectPasswordPrompterFactory(LinkCashAccountActivity, PasswordPrompterFactory)>
		return linkcashaccountactivity;
	//  118  310:aload_1         
	//  119  311:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method LinkCashAccountPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public LinkCashAccountPresenter getMvpPresenter()
	{
		return (LinkCashAccountPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #362 <Method Object Provider.get()>
	//    3    9:checkcast       #378 <Class LinkCashAccountPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #383 <Method LinkCashAccountView getMvpView()>
	//    2    4:areturn         
	}

	public LinkCashAccountView getMvpView()
	{
		return (LinkCashAccountView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #362 <Method Object Provider.get()>
	//    3    9:checkcast       #385 <Class LinkCashAccountView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #362 <Method Object Provider.get()>
	//    3    9:checkcast       #389 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((LinkCashAccountView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #385 <Class LinkCashAccountView>
	//    3    5:invokevirtual   #394 <Method void inject(LinkCashAccountView)>
	//    4    8:return          
	}

	public void inject(LinkCashAccountActivity linkcashaccountactivity)
	{
		injectLinkCashAccountActivity(linkcashaccountactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #397 <Method LinkCashAccountActivity injectLinkCashAccountActivity(LinkCashAccountActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(LinkCashAccountView linkcashaccountview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider;
	private com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider;
	private com_ibotta_android_di_MainComponent_getResources getResourcesProvider;
	private com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider;
	private com_ibotta_android_di_MainComponent_getUserState getUserStateProvider;
	private com_ibotta_android_di_MainComponent_getValidation getValidationProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private LinkCashAccountModule_ProvideLinkCashAccountReducerFactory provideLinkCashAccountReducerProvider;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider providePasswordPrompterFactoryProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
