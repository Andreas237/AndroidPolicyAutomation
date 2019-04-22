// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.mvp.base.*;
import com.ibotta.android.mvp.base.contentevents.ContentEventsActivity_MembersInjector;
import com.ibotta.android.mvp.ui.activity.notifications.NotificationTracking;
import com.ibotta.android.profile.BuildProfile;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.service.work.tracking.TrackingFlushWorker;
import com.ibotta.android.state.GlobalEventManager;
import com.ibotta.android.state.app.cache.AppCacheState;
import com.ibotta.android.state.app.debug.DebugState;
import com.ibotta.android.state.app.upgrade.UpgradeState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.title.TitleBarReducer;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerComponent, BonusesPickerModule_ProvideBonusPickerReducerFactory, BonusesPickerModule_ProvideBonusPickerRowCreatorFactory, BonusesPickerModule_ProvideMvpPresenterFactory, 
//			BonusesPickerActivity_MembersInjector, BonusesPickerPresenter, BonusesPickerView, BonusesPickerActivity, 
//			BonusesPickerModule

public final class DaggerBonusesPickerComponent
	implements BonusesPickerComponent
{
	public static final class Builder
	{

		public Builder bonusesPickerModule(BonusesPickerModule bonusespickermodule)
		{
			bonusesPickerModule = (BonusesPickerModule)Preconditions.checkNotNull(((Object) (bonusespickermodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #35  <Class BonusesPickerModule>
		//    4    8:putfield        #22  <Field BonusesPickerModule bonusesPickerModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public BonusesPickerComponent build()
		{
			if(bonusesPickerModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field BonusesPickerModule bonusesPickerModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((BonusesPickerComponent) (new DaggerBonusesPickerComponent(this)));
		//    6   14:new             #6   <Class DaggerBonusesPickerComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #40  <Method void DaggerBonusesPickerComponent(DaggerBonusesPickerComponent$Builder, DaggerBonusesPickerComponent$1)>
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
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/bonus/BonusesPickerModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #35  <Class BonusesPickerModule>
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

		private BonusesPickerModule bonusesPickerModule;
		private MainComponent mainComponent;


/*
		static BonusesPickerModule access$100(Builder builder1)
		{
			return builder1.bonusesPickerModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field BonusesPickerModule bonusesPickerModule>
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

	private static class com_ibotta_android_di_MainComponent_getGraphQLCallFactory
		implements Provider
	{

		public GraphQLCallFactory get()
		{
			return (GraphQLCallFactory)Preconditions.checkNotNull(((Object) (mainComponent.getGraphQLCallFactory())), "Cannot return null from a non-@Nullable component method");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MainComponent mainComponent>
		//    2    4:invokeinterface #27  <Method GraphQLCallFactory MainComponent.getGraphQLCallFactory()>
		//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
		//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
		//    5   14:checkcast       #37  <Class GraphQLCallFactory>
		//    6   17:areturn         
		}

		public volatile Object get()
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method GraphQLCallFactory get()>
		//    2    4:areturn         
		}

		private final MainComponent mainComponent;

		com_ibotta_android_di_MainComponent_getGraphQLCallFactory(MainComponent maincomponent)
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


	private DaggerBonusesPickerComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #72  <Method void initialize(DaggerBonusesPickerComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerBonusesPickerComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #81  <Method void DaggerBonusesPickerComponent$Builder(DaggerBonusesPickerComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.bonusesPickerModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method BonusesPickerModule DaggerBonusesPickerComponent$Builder.access$100(DaggerBonusesPickerComponent$Builder)>
	//    3    5:invokestatic    #91  <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #97  <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #99  <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #25  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   11   23:invokespecial   #106 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #108 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getGraphQLCallFactoryProvider = new com_ibotta_android_di_MainComponent_getGraphQLCallFactory(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #19  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   18   38:invokespecial   #109 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory(MainComponent)>
	//   19   41:putfield        #111 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider>
		getTitleBarReducerProvider = new com_ibotta_android_di_MainComponent_getTitleBarReducer(builder1.mainComponent);
	//   20   44:aload_0         
	//   21   45:new             #31  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   25   53:invokespecial   #112 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer(MainComponent)>
	//   26   56:putfield        #114 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider>
		provideBonusPickerReducerProvider = BonusesPickerModule_ProvideBonusPickerReducerFactory.create(((Provider) (getTitleBarReducerProvider)));
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getfield        #114 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider>
	//   30   64:invokestatic    #119 <Method BonusesPickerModule_ProvideBonusPickerReducerFactory BonusesPickerModule_ProvideBonusPickerReducerFactory.create(Provider)>
	//   31   67:putfield        #121 <Field BonusesPickerModule_ProvideBonusPickerReducerFactory provideBonusPickerReducerProvider>
		provideBonusPickerRowCreatorProvider = DoubleCheck.provider(((Provider) (BonusesPickerModule_ProvideBonusPickerRowCreatorFactory.create(builder1.bonusesPickerModule, ((Provider) (getGraphQLCallFactoryProvider)), ((Provider) (provideBonusPickerReducerProvider))))));
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:invokestatic    #85  <Method BonusesPickerModule DaggerBonusesPickerComponent$Builder.access$100(DaggerBonusesPickerComponent$Builder)>
	//   35   75:aload_0         
	//   36   76:getfield        #111 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider>
	//   37   79:aload_0         
	//   38   80:getfield        #121 <Field BonusesPickerModule_ProvideBonusPickerReducerFactory provideBonusPickerReducerProvider>
	//   39   83:invokestatic    #126 <Method BonusesPickerModule_ProvideBonusPickerRowCreatorFactory BonusesPickerModule_ProvideBonusPickerRowCreatorFactory.create(BonusesPickerModule, Provider, Provider)>
	//   40   86:invokestatic    #97  <Method Provider DoubleCheck.provider(Provider)>
	//   41   89:putfield        #128 <Field Provider provideBonusPickerRowCreatorProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (BonusesPickerModule_ProvideMvpPresenterFactory.create(builder1.bonusesPickerModule, ((Provider) (getMvpPresenterActionsProvider)), provideBonusPickerRowCreatorProvider))));
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:invokestatic    #85  <Method BonusesPickerModule DaggerBonusesPickerComponent$Builder.access$100(DaggerBonusesPickerComponent$Builder)>
	//   45   97:aload_0         
	//   46   98:getfield        #108 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   47  101:aload_0         
	//   48  102:getfield        #128 <Field Provider provideBonusPickerRowCreatorProvider>
	//   49  105:invokestatic    #133 <Method BonusesPickerModule_ProvideMvpPresenterFactory BonusesPickerModule_ProvideMvpPresenterFactory.create(BonusesPickerModule, Provider, Provider)>
	//   50  108:invokestatic    #97  <Method Provider DoubleCheck.provider(Provider)>
	//   51  111:putfield        #135 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   52  114:aload_0         
	//   53  115:new             #28  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   54  118:dup             
	//   55  119:aload_1         
	//   56  120:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   57  123:invokespecial   #136 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   58  126:putfield        #138 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   59  129:aload_0         
	//   60  130:new             #22  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   61  133:dup             
	//   62  134:aload_1         
	//   63  135:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   64  138:invokespecial   #139 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   65  141:putfield        #141 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   66  144:aload_0         
	//   67  145:new             #16  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   68  148:dup             
	//   69  149:aload_1         
	//   70  150:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   71  153:invokespecial   #142 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   72  156:putfield        #144 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   73  159:aload_0         
	//   74  160:new             #13  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   75  163:dup             
	//   76  164:aload_1         
	//   77  165:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   78  168:invokespecial   #145 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   79  171:putfield        #147 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   80  174:aload_0         
	//   81  175:new             #34  <Class DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//   82  178:dup             
	//   83  179:aload_1         
	//   84  180:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//   85  183:invokespecial   #148 <Method void DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//   86  186:putfield        #150 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.bonusesPickerModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//   87  189:aload_0         
	//   88  190:aload_1         
	//   89  191:invokestatic    #85  <Method BonusesPickerModule DaggerBonusesPickerComponent$Builder.access$100(DaggerBonusesPickerComponent$Builder)>
	//   90  194:aload_0         
	//   91  195:getfield        #138 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//   92  198:aload_0         
	//   93  199:getfield        #141 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//   94  202:aload_0         
	//   95  203:getfield        #144 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//   96  206:aload_0         
	//   97  207:getfield        #147 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//   98  210:aload_0         
	//   99  211:getfield        #150 <Field DaggerBonusesPickerComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//  100  214:invokestatic    #155 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//  101  217:invokestatic    #97  <Method Provider DoubleCheck.provider(Provider)>
	//  102  220:putfield        #157 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//  103  223:aload_0         
	//  104  224:aload_1         
	//  105  225:invokestatic    #103 <Method MainComponent DaggerBonusesPickerComponent$Builder.access$200(DaggerBonusesPickerComponent$Builder)>
	//  106  228:putfield        #159 <Field MainComponent mainComponent>
	//  107  231:return          
	}

	private BonusesPickerActivity injectBonusesPickerActivity(BonusesPickerActivity bonusespickeractivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #168 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #178 <Class AppHelper>
	//    7   18:invokestatic    #184 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #159 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #188 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #190 <Class Handler>
	//   15   39:invokestatic    #194 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #159 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #198 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #200 <Class AuthManager>
	//   23   60:invokestatic    #204 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #159 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #208 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #210 <Class ButtonSdkManager>
	//   31   81:invokestatic    #214 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #159 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #218 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #220 <Class UpgradeState>
	//   39  102:invokestatic    #224 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #159 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #228 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #230 <Class AppCacheState>
	//   47  123:invokestatic    #234 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #159 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #238 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #240 <Class DebugState>
	//   55  144:invokestatic    #244 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #159 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #248 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #250 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #254 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #159 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #258 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #260 <Class GlobalEventManager>
	//   71  186:invokestatic    #264 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #159 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #268 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #270 <Class BuildProfile>
	//   79  207:invokestatic    #274 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #159 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #278 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #280 <Class Tracker>
	//   87  228:invokestatic    #284 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #159 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #288 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #290 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #294 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (bonusespickeractivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #159 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #298 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #300 <Class NotificationTracking>
	//  103  270:invokestatic    #304 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (bonusespickeractivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #159 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #308 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  283:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #310 <Class RetailerParcelHelper>
	//  111  291:invokestatic    #316 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		BonusesPickerActivity_MembersInjector.injectBrazeTracking(bonusespickeractivity, (BrazeTracking)Preconditions.checkNotNull(((Object) (mainComponent.getBrazeTracking())), "Cannot return null from a non-@Nullable component method"));
	//  112  294:aload_1         
	//  113  295:aload_0         
	//  114  296:getfield        #159 <Field MainComponent mainComponent>
	//  115  299:invokeinterface #320 <Method BrazeTracking MainComponent.getBrazeTracking()>
	//  116  304:ldc1            #170 <String "Cannot return null from a non-@Nullable component method">
	//  117  306:invokestatic    #176 <Method Object Preconditions.checkNotNull(Object, String)>
	//  118  309:checkcast       #322 <Class BrazeTracking>
	//  119  312:invokestatic    #328 <Method void BonusesPickerActivity_MembersInjector.injectBrazeTracking(BonusesPickerActivity, BrazeTracking)>
		return bonusespickeractivity;
	//  120  315:aload_1         
	//  121  316:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method BonusesPickerPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public BonusesPickerPresenter getMvpPresenter()
	{
		return (BonusesPickerPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #340 <Method Object Provider.get()>
	//    3    9:checkcast       #342 <Class BonusesPickerPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #347 <Method BonusesPickerView getMvpView()>
	//    2    4:areturn         
	}

	public BonusesPickerView getMvpView()
	{
		return (BonusesPickerView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #340 <Method Object Provider.get()>
	//    3    9:checkcast       #349 <Class BonusesPickerView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #340 <Method Object Provider.get()>
	//    3    9:checkcast       #353 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((BonusesPickerView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #349 <Class BonusesPickerView>
	//    3    5:invokevirtual   #358 <Method void inject(BonusesPickerView)>
	//    4    8:return          
	}

	public void inject(BonusesPickerActivity bonusespickeractivity)
	{
		injectBonusesPickerActivity(bonusespickeractivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #361 <Method BonusesPickerActivity injectBonusesPickerActivity(BonusesPickerActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(BonusesPickerView bonusespickerview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getTitleBarReducer getTitleBarReducerProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private BonusesPickerModule_ProvideBonusPickerReducerFactory provideBonusPickerReducerProvider;
	private Provider provideBonusPickerRowCreatorProvider;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
