// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.images.ImageCache;
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
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.card.GiftCardHelper;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardComponent, GiftCardModule_ProvideMvpPresenterFactory, GiftCardModule_ProvidePasswordPrompterFactoryFactory, GiftCardActivity_MembersInjector, 
//			GiftCardPresenter, GiftCardView, GiftCardActivity, GiftCardModule

public final class DaggerGiftCardComponent
	implements GiftCardComponent
{
	public static final class Builder
	{

		public GiftCardComponent build()
		{
			if(giftCardModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field GiftCardModule giftCardModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((GiftCardComponent) (new DaggerGiftCardComponent(this)));
		//    6   14:new             #6   <Class DaggerGiftCardComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #31  <Method void DaggerGiftCardComponent(DaggerGiftCardComponent$Builder, DaggerGiftCardComponent$1)>
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
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/account/withdraw/giftcard/GiftCardModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #58  <Class GiftCardModule>
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

		public Builder giftCardModule(GiftCardModule giftcardmodule)
		{
			giftCardModule = (GiftCardModule)Preconditions.checkNotNull(((Object) (giftcardmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #58  <Class GiftCardModule>
		//    4    8:putfield        #22  <Field GiftCardModule giftCardModule>
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

		private GiftCardModule giftCardModule;
		private MainComponent mainComponent;


/*
		static GiftCardModule access$100(Builder builder1)
		{
			return builder1.giftCardModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field GiftCardModule giftCardModule>
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

	private static class com_ibotta_android_di_MainComponent_getGiftCardHelper
		implements Provider
	{

		public GiftCardHelper get()
		{
			return (GiftCardHelper)Preconditions.checkNotNull(((Object) (mainComponent.getGiftCardHelper())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method GiftCardHelper MainComponent.getGiftCardHelper()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class GiftCardHelper>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method GiftCardHelper get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getGiftCardHelper(MainComponent maincomponent)
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


	private DaggerGiftCardComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #85  <Method void initialize(DaggerGiftCardComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerGiftCardComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #94  <Method void DaggerGiftCardComponent$Builder(DaggerGiftCardComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.giftCardModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #98  <Method GiftCardModule DaggerGiftCardComponent$Builder.access$100(DaggerGiftCardComponent$Builder)>
	//    3    5:invokestatic    #104 <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #110 <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #112 <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #31  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   11   23:invokespecial   #119 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #121 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getUserStateProvider = new com_ibotta_android_di_MainComponent_getUserState(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #40  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getUserState>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   18   38:invokespecial   #122 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getUserState(MainComponent)>
	//   19   41:putfield        #124 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
		getGiftCardHelperProvider = new com_ibotta_android_di_MainComponent_getGiftCardHelper(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #25  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getGiftCardHelper>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   25   53:invokespecial   #125 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getGiftCardHelper(MainComponent)>
	//   26   56:putfield        #127 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getGiftCardHelper getGiftCardHelperProvider>
		getCacheClearJobFactoryProvider = new com_ibotta_android_di_MainComponent_getCacheClearJobFactory(builder1.mainComponent);
	//   27   59:aload_0         
	//   28   60:new             #19  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   32   68:invokespecial   #128 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory(MainComponent)>
	//   33   71:putfield        #130 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (GiftCardModule_ProvideMvpPresenterFactory.create(builder1.giftCardModule, ((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getUserStateProvider)), ((Provider) (getGiftCardHelperProvider)), ((Provider) (getCacheClearJobFactoryProvider))))));
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:invokestatic    #98  <Method GiftCardModule DaggerGiftCardComponent$Builder.access$100(DaggerGiftCardComponent$Builder)>
	//   37   79:aload_0         
	//   38   80:getfield        #121 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   39   83:aload_0         
	//   40   84:getfield        #124 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getUserState getUserStateProvider>
	//   41   87:aload_0         
	//   42   88:getfield        #127 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getGiftCardHelper getGiftCardHelperProvider>
	//   43   91:aload_0         
	//   44   92:getfield        #130 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider>
	//   45   95:invokestatic    #135 <Method GiftCardModule_ProvideMvpPresenterFactory GiftCardModule_ProvideMvpPresenterFactory.create(GiftCardModule, Provider, Provider, Provider, Provider)>
	//   46   98:invokestatic    #110 <Method Provider DoubleCheck.provider(Provider)>
	//   47  101:putfield        #137 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   48  104:aload_0         
	//   49  105:new             #34  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   50  108:dup             
	//   51  109:aload_1         
	//   52  110:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   53  113:invokespecial   #138 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   54  116:putfield        #140 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   55  119:aload_0         
	//   56  120:new             #28  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   57  123:dup             
	//   58  124:aload_1         
	//   59  125:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   60  128:invokespecial   #141 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   61  131:putfield        #143 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   62  134:aload_0         
	//   63  135:new             #22  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   64  138:dup             
	//   65  139:aload_1         
	//   66  140:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   67  143:invokespecial   #144 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   68  146:putfield        #146 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   69  149:aload_0         
	//   70  150:new             #13  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   71  153:dup             
	//   72  154:aload_1         
	//   73  155:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   74  158:invokespecial   #147 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   75  161:putfield        #149 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   76  164:aload_0         
	//   77  165:new             #43  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//   78  168:dup             
	//   79  169:aload_1         
	//   80  170:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//   81  173:invokespecial   #150 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//   82  176:putfield        #152 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.giftCardModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//   83  179:aload_0         
	//   84  180:aload_1         
	//   85  181:invokestatic    #98  <Method GiftCardModule DaggerGiftCardComponent$Builder.access$100(DaggerGiftCardComponent$Builder)>
	//   86  184:aload_0         
	//   87  185:getfield        #140 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//   88  188:aload_0         
	//   89  189:getfield        #143 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//   90  192:aload_0         
	//   91  193:getfield        #146 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//   92  196:aload_0         
	//   93  197:getfield        #149 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//   94  200:aload_0         
	//   95  201:getfield        #152 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//   96  204:invokestatic    #157 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//   97  207:invokestatic    #110 <Method Provider DoubleCheck.provider(Provider)>
	//   98  210:putfield        #159 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//   99  213:aload_0         
	//  100  214:aload_1         
	//  101  215:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//  102  218:putfield        #161 <Field MainComponent mainComponent>
		getPasswordCacheProvider = new com_ibotta_android_di_MainComponent_getPasswordCache(builder1.mainComponent);
	//  103  221:aload_0         
	//  104  222:new             #37  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getPasswordCache>
	//  105  225:dup             
	//  106  226:aload_1         
	//  107  227:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//  108  230:invokespecial   #162 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getPasswordCache(MainComponent)>
	//  109  233:putfield        #164 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider>
		getAppHelperProvider = new com_ibotta_android_di_MainComponent_getAppHelper(builder1.mainComponent);
	//  110  236:aload_0         
	//  111  237:new             #16  <Class DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getAppHelper>
	//  112  240:dup             
	//  113  241:aload_1         
	//  114  242:invokestatic    #116 <Method MainComponent DaggerGiftCardComponent$Builder.access$200(DaggerGiftCardComponent$Builder)>
	//  115  245:invokespecial   #165 <Method void DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getAppHelper(MainComponent)>
	//  116  248:putfield        #167 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
		providePasswordPrompterFactoryProvider = DoubleCheck.provider(((Provider) (GiftCardModule_ProvidePasswordPrompterFactoryFactory.create(builder1.giftCardModule, ((Provider) (getPasswordCacheProvider)), ((Provider) (getAppHelperProvider))))));
	//  117  251:aload_0         
	//  118  252:aload_1         
	//  119  253:invokestatic    #98  <Method GiftCardModule DaggerGiftCardComponent$Builder.access$100(DaggerGiftCardComponent$Builder)>
	//  120  256:aload_0         
	//  121  257:getfield        #164 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider>
	//  122  260:aload_0         
	//  123  261:getfield        #167 <Field DaggerGiftCardComponent$com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider>
	//  124  264:invokestatic    #172 <Method GiftCardModule_ProvidePasswordPrompterFactoryFactory GiftCardModule_ProvidePasswordPrompterFactoryFactory.create(GiftCardModule, Provider, Provider)>
	//  125  267:invokestatic    #110 <Method Provider DoubleCheck.provider(Provider)>
	//  126  270:putfield        #174 <Field Provider providePasswordPrompterFactoryProvider>
	//  127  273:return          
	}

	private GiftCardActivity injectGiftCardActivity(GiftCardActivity giftcardactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #161 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #183 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #193 <Class AppHelper>
	//    7   18:invokestatic    #199 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #161 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #203 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #205 <Class Handler>
	//   15   39:invokestatic    #209 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #161 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #213 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #215 <Class AuthManager>
	//   23   60:invokestatic    #219 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #161 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #223 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #225 <Class ButtonSdkManager>
	//   31   81:invokestatic    #229 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #161 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #233 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #235 <Class UpgradeState>
	//   39  102:invokestatic    #239 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #161 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #243 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #245 <Class AppCacheState>
	//   47  123:invokestatic    #249 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #161 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #253 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #255 <Class DebugState>
	//   55  144:invokestatic    #259 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #161 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #263 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #265 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #269 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #161 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #273 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #275 <Class GlobalEventManager>
	//   71  186:invokestatic    #279 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #161 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #283 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #285 <Class BuildProfile>
	//   79  207:invokestatic    #289 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #161 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #293 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #295 <Class Tracker>
	//   87  228:invokestatic    #299 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #161 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #303 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #305 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #309 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (giftcardactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #161 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #313 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #315 <Class NotificationTracking>
	//  103  270:invokestatic    #319 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (giftcardactivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #161 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #323 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  283:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #325 <Class RetailerParcelHelper>
	//  111  291:invokestatic    #331 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		GiftCardActivity_MembersInjector.injectImageCache(giftcardactivity, (ImageCache)Preconditions.checkNotNull(((Object) (mainComponent.getImageCache())), "Cannot return null from a non-@Nullable component method"));
	//  112  294:aload_1         
	//  113  295:aload_0         
	//  114  296:getfield        #161 <Field MainComponent mainComponent>
	//  115  299:invokeinterface #335 <Method ImageCache MainComponent.getImageCache()>
	//  116  304:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//  117  306:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//  118  309:checkcast       #337 <Class ImageCache>
	//  119  312:invokestatic    #343 <Method void GiftCardActivity_MembersInjector.injectImageCache(GiftCardActivity, ImageCache)>
		GiftCardActivity_MembersInjector.injectFormatting(giftcardactivity, (Formatting)Preconditions.checkNotNull(((Object) (mainComponent.getFormatting())), "Cannot return null from a non-@Nullable component method"));
	//  120  315:aload_1         
	//  121  316:aload_0         
	//  122  317:getfield        #161 <Field MainComponent mainComponent>
	//  123  320:invokeinterface #347 <Method Formatting MainComponent.getFormatting()>
	//  124  325:ldc1            #185 <String "Cannot return null from a non-@Nullable component method">
	//  125  327:invokestatic    #191 <Method Object Preconditions.checkNotNull(Object, String)>
	//  126  330:checkcast       #349 <Class Formatting>
	//  127  333:invokestatic    #353 <Method void GiftCardActivity_MembersInjector.injectFormatting(GiftCardActivity, Formatting)>
		GiftCardActivity_MembersInjector.injectPasswordPrompterFactory(giftcardactivity, (PasswordPrompterFactory)providePasswordPrompterFactoryProvider.get());
	//  128  336:aload_1         
	//  129  337:aload_0         
	//  130  338:getfield        #174 <Field Provider providePasswordPrompterFactoryProvider>
	//  131  341:invokeinterface #359 <Method Object Provider.get()>
	//  132  346:checkcast       #361 <Class PasswordPrompterFactory>
	//  133  349:invokestatic    #365 <Method void GiftCardActivity_MembersInjector.injectPasswordPrompterFactory(GiftCardActivity, PasswordPrompterFactory)>
		return giftcardactivity;
	//  134  352:aload_1         
	//  135  353:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #371 <Method GiftCardPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public GiftCardPresenter getMvpPresenter()
	{
		return (GiftCardPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #359 <Method Object Provider.get()>
	//    3    9:checkcast       #373 <Class GiftCardPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #378 <Method GiftCardView getMvpView()>
	//    2    4:areturn         
	}

	public GiftCardView getMvpView()
	{
		return (GiftCardView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #359 <Method Object Provider.get()>
	//    3    9:checkcast       #380 <Class GiftCardView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #359 <Method Object Provider.get()>
	//    3    9:checkcast       #384 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((GiftCardView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #380 <Class GiftCardView>
	//    3    5:invokevirtual   #389 <Method void inject(GiftCardView)>
	//    4    8:return          
	}

	public void inject(GiftCardActivity giftcardactivity)
	{
		injectGiftCardActivity(giftcardactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #392 <Method GiftCardActivity injectGiftCardActivity(GiftCardActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(GiftCardView giftcardview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getAppHelper getAppHelperProvider;
	private com_ibotta_android_di_MainComponent_getCacheClearJobFactory getCacheClearJobFactoryProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getGiftCardHelper getGiftCardHelperProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getPasswordCache getPasswordCacheProvider;
	private com_ibotta_android_di_MainComponent_getUserState getUserStateProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider providePasswordPrompterFactoryProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
