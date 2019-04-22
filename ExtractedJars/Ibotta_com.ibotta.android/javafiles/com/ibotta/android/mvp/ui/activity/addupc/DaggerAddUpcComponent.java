// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import android.os.Handler;
import com.ibotta.android.buttonsdk.ButtonSdkManager;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.images.ImageCache;
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
import com.ibotta.android.tracking.Tracker;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcComponent, AddUpcModule_ProvideMvpPresenterFactory, AddUpcActivity_MembersInjector, AddUpcPresenter, 
//			AddUpcView, AddUpcActivity, AddUpcModule

public final class DaggerAddUpcComponent
	implements AddUpcComponent
{
	public static final class Builder
	{

		public Builder addUpcModule(AddUpcModule addupcmodule)
		{
			addUpcModule = (AddUpcModule)Preconditions.checkNotNull(((Object) (addupcmodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #35  <Class AddUpcModule>
		//    4    8:putfield        #22  <Field AddUpcModule addUpcModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public AddUpcComponent build()
		{
			if(addUpcModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field AddUpcModule addUpcModule>
		//*   2    4:ifnull          61
			{
				if(mainComponent != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field MainComponent mainComponent>
		//*   5   11:ifnull          24
				{
					return ((AddUpcComponent) (new DaggerAddUpcComponent(this)));
		//    6   14:new             #6   <Class DaggerAddUpcComponent>
		//    7   17:dup             
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:invokespecial   #40  <Method void DaggerAddUpcComponent(DaggerAddUpcComponent$Builder, DaggerAddUpcComponent$1)>
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
				stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/addupc/AddUpcModule)).getCanonicalName());
		//   35   69:aload_1         
		//   36   70:ldc1            #35  <Class AddUpcModule>
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

		private AddUpcModule addUpcModule;
		private MainComponent mainComponent;


/*
		static AddUpcModule access$100(Builder builder1)
		{
			return builder1.addUpcModule;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AddUpcModule addUpcModule>
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


	private DaggerAddUpcComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #63  <Method void initialize(DaggerAddUpcComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerAddUpcComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #72  <Method void DaggerAddUpcComponent$Builder(DaggerAddUpcComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		provideMvpViewProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideMvpViewFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.addUpcModule))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method AddUpcModule DaggerAddUpcComponent$Builder.access$100(DaggerAddUpcComponent$Builder)>
	//    3    5:invokestatic    #82  <Method AbstractMvpModule_ProvideMvpViewFactory AbstractMvpModule_ProvideMvpViewFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule)>
	//    4    8:invokestatic    #88  <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #90  <Field Provider provideMvpViewProvider>
		getMvpPresenterActionsProvider = new com_ibotta_android_di_MainComponent_getMvpPresenterActions(builder1.mainComponent);
	//    6   14:aload_0         
	//    7   15:new             #25  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   11   23:invokespecial   #97  <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions(MainComponent)>
	//   12   26:putfield        #99  <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
		getGraphQLCallFactoryProvider = new com_ibotta_android_di_MainComponent_getGraphQLCallFactory(builder1.mainComponent);
	//   13   29:aload_0         
	//   14   30:new             #19  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   18   38:invokespecial   #100 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory(MainComponent)>
	//   19   41:putfield        #102 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider>
		provideMvpPresenterProvider = DoubleCheck.provider(((Provider) (AddUpcModule_ProvideMvpPresenterFactory.create(builder1.addUpcModule, ((Provider) (getMvpPresenterActionsProvider)), ((Provider) (getGraphQLCallFactoryProvider))))));
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:invokestatic    #76  <Method AddUpcModule DaggerAddUpcComponent$Builder.access$100(DaggerAddUpcComponent$Builder)>
	//   23   49:aload_0         
	//   24   50:getfield        #99  <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider>
	//   25   53:aload_0         
	//   26   54:getfield        #102 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider>
	//   27   57:invokestatic    #107 <Method AddUpcModule_ProvideMvpPresenterFactory AddUpcModule_ProvideMvpPresenterFactory.create(AddUpcModule, Provider, Provider)>
	//   28   60:invokestatic    #88  <Method Provider DoubleCheck.provider(Provider)>
	//   29   63:putfield        #109 <Field Provider provideMvpPresenterProvider>
		getOfferHelperProvider = new com_ibotta_android_di_MainComponent_getOfferHelper(builder1.mainComponent);
	//   30   66:aload_0         
	//   31   67:new             #28  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getOfferHelper>
	//   32   70:dup             
	//   33   71:aload_1         
	//   34   72:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   35   75:invokespecial   #110 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getOfferHelper(MainComponent)>
	//   36   78:putfield        #112 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
		getHardwareProvider = new com_ibotta_android_di_MainComponent_getHardware(builder1.mainComponent);
	//   37   81:aload_0         
	//   38   82:new             #22  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getHardware>
	//   39   85:dup             
	//   40   86:aload_1         
	//   41   87:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   42   90:invokespecial   #113 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getHardware(MainComponent)>
	//   43   93:putfield        #115 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
		getFormattingProvider = new com_ibotta_android_di_MainComponent_getFormatting(builder1.mainComponent);
	//   44   96:aload_0         
	//   45   97:new             #16  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getFormatting>
	//   46  100:dup             
	//   47  101:aload_1         
	//   48  102:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   49  105:invokespecial   #116 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getFormatting(MainComponent)>
	//   50  108:putfield        #118 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
		getApiWorkSubmitterProvider = new com_ibotta_android_di_MainComponent_getApiWorkSubmitter(builder1.mainComponent);
	//   51  111:aload_0         
	//   52  112:new             #13  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter>
	//   53  115:dup             
	//   54  116:aload_1         
	//   55  117:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   56  120:invokespecial   #119 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter(MainComponent)>
	//   57  123:putfield        #121 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
		getVariantFactoryProvider = new com_ibotta_android_di_MainComponent_getVariantFactory(builder1.mainComponent);
	//   58  126:aload_0         
	//   59  127:new             #31  <Class DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getVariantFactory>
	//   60  130:dup             
	//   61  131:aload_1         
	//   62  132:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   63  135:invokespecial   #122 <Method void DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getVariantFactory(MainComponent)>
	//   64  138:putfield        #124 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
		provideRedeemPreflightHelperProvider = DoubleCheck.provider(((Provider) (AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(((com.ibotta.android.mvp.base.AbstractMvpModule) (builder1.addUpcModule)), ((Provider) (getOfferHelperProvider)), ((Provider) (getHardwareProvider)), ((Provider) (getFormattingProvider)), ((Provider) (getApiWorkSubmitterProvider)), ((Provider) (getVariantFactoryProvider))))));
	//   65  141:aload_0         
	//   66  142:aload_1         
	//   67  143:invokestatic    #76  <Method AddUpcModule DaggerAddUpcComponent$Builder.access$100(DaggerAddUpcComponent$Builder)>
	//   68  146:aload_0         
	//   69  147:getfield        #112 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider>
	//   70  150:aload_0         
	//   71  151:getfield        #115 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getHardware getHardwareProvider>
	//   72  154:aload_0         
	//   73  155:getfield        #118 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider>
	//   74  158:aload_0         
	//   75  159:getfield        #121 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider>
	//   76  162:aload_0         
	//   77  163:getfield        #124 <Field DaggerAddUpcComponent$com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider>
	//   78  166:invokestatic    #129 <Method AbstractMvpModule_ProvideRedeemPreflightHelperFactory AbstractMvpModule_ProvideRedeemPreflightHelperFactory.create(com.ibotta.android.mvp.base.AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//   79  169:invokestatic    #88  <Method Provider DoubleCheck.provider(Provider)>
	//   80  172:putfield        #131 <Field Provider provideRedeemPreflightHelperProvider>
		mainComponent = builder1.mainComponent;
	//   81  175:aload_0         
	//   82  176:aload_1         
	//   83  177:invokestatic    #94  <Method MainComponent DaggerAddUpcComponent$Builder.access$200(DaggerAddUpcComponent$Builder)>
	//   84  180:putfield        #133 <Field MainComponent mainComponent>
	//   85  183:return          
	}

	private AddUpcActivity injectAddUpcActivity(AddUpcActivity addupcactivity)
	{
		MvpActivity_MembersInjector.injectAppHelper(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AppHelper)Preconditions.checkNotNull(((Object) (mainComponent.getAppHelper())), "Cannot return null from a non-@Nullable component method"));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field MainComponent mainComponent>
	//    3    5:invokeinterface #142 <Method AppHelper MainComponent.getAppHelper()>
	//    4   10:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//    5   12:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   15:checkcast       #152 <Class AppHelper>
	//    7   18:invokestatic    #158 <Method void MvpActivity_MembersInjector.injectAppHelper(com.ibotta.android.mvp.base.MvpActivity, AppHelper)>
		MvpActivity_MembersInjector.injectHandler(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (Handler)Preconditions.checkNotNull(((Object) (mainComponent.getHandler())), "Cannot return null from a non-@Nullable component method"));
	//    8   21:aload_1         
	//    9   22:aload_0         
	//   10   23:getfield        #133 <Field MainComponent mainComponent>
	//   11   26:invokeinterface #162 <Method Handler MainComponent.getHandler()>
	//   12   31:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   13   33:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   36:checkcast       #164 <Class Handler>
	//   15   39:invokestatic    #168 <Method void MvpActivity_MembersInjector.injectHandler(com.ibotta.android.mvp.base.MvpActivity, Handler)>
		MvpActivity_MembersInjector.injectAuthManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AuthManager)Preconditions.checkNotNull(((Object) (mainComponent.getAuthManager())), "Cannot return null from a non-@Nullable component method"));
	//   16   42:aload_1         
	//   17   43:aload_0         
	//   18   44:getfield        #133 <Field MainComponent mainComponent>
	//   19   47:invokeinterface #172 <Method AuthManager MainComponent.getAuthManager()>
	//   20   52:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   21   54:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   57:checkcast       #174 <Class AuthManager>
	//   23   60:invokestatic    #178 <Method void MvpActivity_MembersInjector.injectAuthManager(com.ibotta.android.mvp.base.MvpActivity, AuthManager)>
		MvpActivity_MembersInjector.injectButtonSdkManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (ButtonSdkManager)Preconditions.checkNotNull(((Object) (mainComponent.getButtonSdkManager())), "Cannot return null from a non-@Nullable component method"));
	//   24   63:aload_1         
	//   25   64:aload_0         
	//   26   65:getfield        #133 <Field MainComponent mainComponent>
	//   27   68:invokeinterface #182 <Method ButtonSdkManager MainComponent.getButtonSdkManager()>
	//   28   73:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   29   75:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   78:checkcast       #184 <Class ButtonSdkManager>
	//   31   81:invokestatic    #188 <Method void MvpActivity_MembersInjector.injectButtonSdkManager(com.ibotta.android.mvp.base.MvpActivity, ButtonSdkManager)>
		MvpActivity_MembersInjector.injectUpgradeState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (UpgradeState)Preconditions.checkNotNull(((Object) (mainComponent.getUpgradeState())), "Cannot return null from a non-@Nullable component method"));
	//   32   84:aload_1         
	//   33   85:aload_0         
	//   34   86:getfield        #133 <Field MainComponent mainComponent>
	//   35   89:invokeinterface #192 <Method UpgradeState MainComponent.getUpgradeState()>
	//   36   94:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   37   96:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   38   99:checkcast       #194 <Class UpgradeState>
	//   39  102:invokestatic    #198 <Method void MvpActivity_MembersInjector.injectUpgradeState(com.ibotta.android.mvp.base.MvpActivity, UpgradeState)>
		MvpActivity_MembersInjector.injectAppCacheState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (AppCacheState)Preconditions.checkNotNull(((Object) (mainComponent.getAppCacheState())), "Cannot return null from a non-@Nullable component method"));
	//   40  105:aload_1         
	//   41  106:aload_0         
	//   42  107:getfield        #133 <Field MainComponent mainComponent>
	//   43  110:invokeinterface #202 <Method AppCacheState MainComponent.getAppCacheState()>
	//   44  115:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   45  117:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   46  120:checkcast       #204 <Class AppCacheState>
	//   47  123:invokestatic    #208 <Method void MvpActivity_MembersInjector.injectAppCacheState(com.ibotta.android.mvp.base.MvpActivity, AppCacheState)>
		MvpActivity_MembersInjector.injectDebugState(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (DebugState)Preconditions.checkNotNull(((Object) (mainComponent.getDebugState())), "Cannot return null from a non-@Nullable component method"));
	//   48  126:aload_1         
	//   49  127:aload_0         
	//   50  128:getfield        #133 <Field MainComponent mainComponent>
	//   51  131:invokeinterface #212 <Method DebugState MainComponent.getDebugState()>
	//   52  136:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   53  138:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   54  141:checkcast       #214 <Class DebugState>
	//   55  144:invokestatic    #218 <Method void MvpActivity_MembersInjector.injectDebugState(com.ibotta.android.mvp.base.MvpActivity, DebugState)>
		MvpActivity_MembersInjector.injectCacheClearFactory(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (CacheClearJobFactory)Preconditions.checkNotNull(((Object) (mainComponent.getCacheClearJobFactory())), "Cannot return null from a non-@Nullable component method"));
	//   56  147:aload_1         
	//   57  148:aload_0         
	//   58  149:getfield        #133 <Field MainComponent mainComponent>
	//   59  152:invokeinterface #222 <Method CacheClearJobFactory MainComponent.getCacheClearJobFactory()>
	//   60  157:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   61  159:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   62  162:checkcast       #224 <Class CacheClearJobFactory>
	//   63  165:invokestatic    #228 <Method void MvpActivity_MembersInjector.injectCacheClearFactory(com.ibotta.android.mvp.base.MvpActivity, CacheClearJobFactory)>
		MvpActivity_MembersInjector.injectGlobalEventManager(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (GlobalEventManager)Preconditions.checkNotNull(((Object) (mainComponent.getGlobalEventManager())), "Cannot return null from a non-@Nullable component method"));
	//   64  168:aload_1         
	//   65  169:aload_0         
	//   66  170:getfield        #133 <Field MainComponent mainComponent>
	//   67  173:invokeinterface #232 <Method GlobalEventManager MainComponent.getGlobalEventManager()>
	//   68  178:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   69  180:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   70  183:checkcast       #234 <Class GlobalEventManager>
	//   71  186:invokestatic    #238 <Method void MvpActivity_MembersInjector.injectGlobalEventManager(com.ibotta.android.mvp.base.MvpActivity, GlobalEventManager)>
		MvpActivity_MembersInjector.injectBuildProfile(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (BuildProfile)Preconditions.checkNotNull(((Object) (mainComponent.getBuildProfile())), "Cannot return null from a non-@Nullable component method"));
	//   72  189:aload_1         
	//   73  190:aload_0         
	//   74  191:getfield        #133 <Field MainComponent mainComponent>
	//   75  194:invokeinterface #242 <Method BuildProfile MainComponent.getBuildProfile()>
	//   76  199:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   77  201:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   78  204:checkcast       #244 <Class BuildProfile>
	//   79  207:invokestatic    #248 <Method void MvpActivity_MembersInjector.injectBuildProfile(com.ibotta.android.mvp.base.MvpActivity, BuildProfile)>
		MvpActivity_MembersInjector.injectTracker(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (Tracker)Preconditions.checkNotNull(((Object) (mainComponent.getTracker())), "Cannot return null from a non-@Nullable component method"));
	//   80  210:aload_1         
	//   81  211:aload_0         
	//   82  212:getfield        #133 <Field MainComponent mainComponent>
	//   83  215:invokeinterface #252 <Method Tracker MainComponent.getTracker()>
	//   84  220:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   85  222:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   86  225:checkcast       #254 <Class Tracker>
	//   87  228:invokestatic    #258 <Method void MvpActivity_MembersInjector.injectTracker(com.ibotta.android.mvp.base.MvpActivity, Tracker)>
		MvpActivity_MembersInjector.injectTrackingFlushWorker(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (TrackingFlushWorker)Preconditions.checkNotNull(((Object) (mainComponent.getTrackingFlushWorker())), "Cannot return null from a non-@Nullable component method"));
	//   88  231:aload_1         
	//   89  232:aload_0         
	//   90  233:getfield        #133 <Field MainComponent mainComponent>
	//   91  236:invokeinterface #262 <Method TrackingFlushWorker MainComponent.getTrackingFlushWorker()>
	//   92  241:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//   93  243:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//   94  246:checkcast       #264 <Class TrackingFlushWorker>
	//   95  249:invokestatic    #268 <Method void MvpActivity_MembersInjector.injectTrackingFlushWorker(com.ibotta.android.mvp.base.MvpActivity, TrackingFlushWorker)>
		MvpActivity_MembersInjector.injectNotificationTracking(((com.ibotta.android.mvp.base.MvpActivity) (addupcactivity)), (NotificationTracking)Preconditions.checkNotNull(((Object) (mainComponent.getNotificationTracking())), "Cannot return null from a non-@Nullable component method"));
	//   96  252:aload_1         
	//   97  253:aload_0         
	//   98  254:getfield        #133 <Field MainComponent mainComponent>
	//   99  257:invokeinterface #272 <Method NotificationTracking MainComponent.getNotificationTracking()>
	//  100  262:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//  101  264:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//  102  267:checkcast       #274 <Class NotificationTracking>
	//  103  270:invokestatic    #278 <Method void MvpActivity_MembersInjector.injectNotificationTracking(com.ibotta.android.mvp.base.MvpActivity, NotificationTracking)>
		ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(((com.ibotta.android.mvp.base.contentevents.ContentEventsActivity) (addupcactivity)), (RetailerParcelHelper)Preconditions.checkNotNull(((Object) (mainComponent.getRetailerParcelHelper())), "Cannot return null from a non-@Nullable component method"));
	//  104  273:aload_1         
	//  105  274:aload_0         
	//  106  275:getfield        #133 <Field MainComponent mainComponent>
	//  107  278:invokeinterface #282 <Method RetailerParcelHelper MainComponent.getRetailerParcelHelper()>
	//  108  283:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//  109  285:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//  110  288:checkcast       #284 <Class RetailerParcelHelper>
	//  111  291:invokestatic    #290 <Method void ContentEventsActivity_MembersInjector.injectRetailerParcelHelper(com.ibotta.android.mvp.base.contentevents.ContentEventsActivity, RetailerParcelHelper)>
		AddUpcActivity_MembersInjector.injectImageCache(addupcactivity, (ImageCache)Preconditions.checkNotNull(((Object) (mainComponent.getImageCache())), "Cannot return null from a non-@Nullable component method"));
	//  112  294:aload_1         
	//  113  295:aload_0         
	//  114  296:getfield        #133 <Field MainComponent mainComponent>
	//  115  299:invokeinterface #294 <Method ImageCache MainComponent.getImageCache()>
	//  116  304:ldc1            #144 <String "Cannot return null from a non-@Nullable component method">
	//  117  306:invokestatic    #150 <Method Object Preconditions.checkNotNull(Object, String)>
	//  118  309:checkcast       #296 <Class ImageCache>
	//  119  312:invokestatic    #302 <Method void AddUpcActivity_MembersInjector.injectImageCache(AddUpcActivity, ImageCache)>
		return addupcactivity;
	//  120  315:aload_1         
	//  121  316:areturn         
	}

	public volatile MvpPresenter getMvpPresenter()
	{
		return ((MvpPresenter) (getMvpPresenter()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method AddUpcPresenter getMvpPresenter()>
	//    2    4:areturn         
	}

	public AddUpcPresenter getMvpPresenter()
	{
		return (AddUpcPresenter)provideMvpPresenterProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Provider provideMvpPresenterProvider>
	//    2    4:invokeinterface #314 <Method Object Provider.get()>
	//    3    9:checkcast       #316 <Class AddUpcPresenter>
	//    4   12:areturn         
	}

	public volatile MvpView getMvpView()
	{
		return ((MvpView) (getMvpView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method AddUpcView getMvpView()>
	//    2    4:areturn         
	}

	public AddUpcView getMvpView()
	{
		return (AddUpcView)provideMvpViewProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Provider provideMvpViewProvider>
	//    2    4:invokeinterface #314 <Method Object Provider.get()>
	//    3    9:checkcast       #323 <Class AddUpcView>
	//    4   12:areturn         
	}

	public RedeemPreFlightHelper getRedeemPreflightHelper()
	{
		return (RedeemPreFlightHelper)provideRedeemPreflightHelperProvider.get();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field Provider provideRedeemPreflightHelperProvider>
	//    2    4:invokeinterface #314 <Method Object Provider.get()>
	//    3    9:checkcast       #327 <Class RedeemPreFlightHelper>
	//    4   12:areturn         
	}

	public volatile void inject(MvpView mvpview)
	{
		inject((AddUpcView)mvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #323 <Class AddUpcView>
	//    3    5:invokevirtual   #332 <Method void inject(AddUpcView)>
	//    4    8:return          
	}

	public void inject(AddUpcActivity addupcactivity)
	{
		injectAddUpcActivity(addupcactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #335 <Method AddUpcActivity injectAddUpcActivity(AddUpcActivity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void inject(AddUpcView addupcview)
	{
	//    0    0:return          
	}

	private com_ibotta_android_di_MainComponent_getApiWorkSubmitter getApiWorkSubmitterProvider;
	private com_ibotta_android_di_MainComponent_getFormatting getFormattingProvider;
	private com_ibotta_android_di_MainComponent_getGraphQLCallFactory getGraphQLCallFactoryProvider;
	private com_ibotta_android_di_MainComponent_getHardware getHardwareProvider;
	private com_ibotta_android_di_MainComponent_getMvpPresenterActions getMvpPresenterActionsProvider;
	private com_ibotta_android_di_MainComponent_getOfferHelper getOfferHelperProvider;
	private com_ibotta_android_di_MainComponent_getVariantFactory getVariantFactoryProvider;
	private MainComponent mainComponent;
	private Provider provideMvpPresenterProvider;
	private Provider provideMvpViewProvider;
	private Provider provideRedeemPreflightHelperProvider;
}
