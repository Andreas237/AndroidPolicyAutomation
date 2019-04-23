// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import android.content.Context;
import io.radar.sdk.Radar;
import io.radar.sdk.Radar_MembersInjector;
import io.radar.sdk.api.*;
import io.radar.sdk.config.ConfigRepository_Factory;
import io.radar.sdk.internal.repository.*;
import io.radar.sdk.location.*;
import io.radar.sdk.state.*;
import io.radar.sdk.util.IntegrationHelper_Factory;
import io.radar.shadow.dagger.internal.DoubleCheck;
import io.radar.shadow.dagger.internal.Preconditions;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.di:
//			RadarComponent, CoreModule_ContextFactory, LocationModule_GeofencingClientFactory, LocationModule_LocationClientFactory, 
//			CoreModule_DeviceHelperFactory, CoreModule, LocationModule

public final class DaggerRadarComponent
	implements RadarComponent
{
	public static final class Builder
	{

		public RadarComponent build()
		{
			if(coreModule != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field CoreModule coreModule>
		//*   2    4:ifnull          17
			{
				return ((RadarComponent) (new DaggerRadarComponent(this)));
		//    3    7:new             #6   <Class DaggerRadarComponent>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aconst_null     
		//    7   13:invokespecial   #25  <Method void DaggerRadarComponent(DaggerRadarComponent$Builder, DaggerRadarComponent$1)>
		//    8   16:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    9   17:new             #27  <Class StringBuilder>
		//   10   20:dup             
		//   11   21:invokespecial   #28  <Method void StringBuilder()>
		//   12   24:astore_1        
				stringbuilder.append(((Class) (io/radar/sdk/di/CoreModule)).getCanonicalName());
		//   13   25:aload_1         
		//   14   26:ldc1            #30  <Class CoreModule>
		//   15   28:invokevirtual   #36  <Method String Class.getCanonicalName()>
		//   16   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   17   34:pop             
				stringbuilder.append(" must be set");
		//   18   35:aload_1         
		//   19   36:ldc1            #42  <String " must be set">
		//   20   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   21   41:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   22   42:new             #44  <Class IllegalStateException>
		//   23   45:dup             
		//   24   46:aload_1         
		//   25   47:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   26   50:invokespecial   #50  <Method void IllegalStateException(String)>
		//   27   53:athrow          
			}
		}

		public Builder coreModule(CoreModule coremodule)
		{
			coreModule = (CoreModule)Preconditions.checkNotNull(((Object) (coremodule)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #30  <Class CoreModule>
		//    4    8:putfield        #20  <Field CoreModule coreModule>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder locationModule(LocationModule locationmodule)
		{
			Preconditions.checkNotNull(((Object) (locationmodule)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
		//    2    4:pop             
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private CoreModule coreModule;


/*
		static CoreModule access$100(Builder builder1)
		{
			return builder1.coreModule;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field CoreModule coreModule>
		//    2    4:areturn         
		}

*/

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	private DaggerRadarComponent(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		initialize(builder1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #50  <Method void initialize(DaggerRadarComponent$Builder)>
	//    5    9:return          
	}


	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #10  <Class DaggerRadarComponent$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #59  <Method void DaggerRadarComponent$Builder(DaggerRadarComponent$1)>
	//    4    8:areturn         
	}

	private void initialize(Builder builder1)
	{
		contextProvider = DoubleCheck.provider(((Provider) (CoreModule_ContextFactory.create(builder1.coreModule))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #63  <Method CoreModule DaggerRadarComponent$Builder.access$100(DaggerRadarComponent$Builder)>
	//    3    5:invokestatic    #69  <Method CoreModule_ContextFactory CoreModule_ContextFactory.create(CoreModule)>
	//    4    8:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//    5   11:putfield        #77  <Field Provider contextProvider>
		optionsRepositoryProvider = DoubleCheck.provider(((Provider) (OptionsRepository_Factory.create(contextProvider))));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #77  <Field Provider contextProvider>
	//    9   19:invokestatic    #82  <Method OptionsRepository_Factory OptionsRepository_Factory.create(Provider)>
	//   10   22:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   11   25:putfield        #84  <Field Provider optionsRepositoryProvider>
		identityRepositoryProvider = DoubleCheck.provider(((Provider) (IdentityRepository_Factory.create(contextProvider))));
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #77  <Field Provider contextProvider>
	//   15   33:invokestatic    #89  <Method IdentityRepository_Factory IdentityRepository_Factory.create(Provider)>
	//   16   36:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   17   39:putfield        #91  <Field Provider identityRepositoryProvider>
		stateManagerRepositoryProvider = DoubleCheck.provider(((Provider) (StateManagerRepository_Factory.create(contextProvider))));
	//   18   42:aload_0         
	//   19   43:aload_0         
	//   20   44:getfield        #77  <Field Provider contextProvider>
	//   21   47:invokestatic    #96  <Method StateManagerRepository_Factory StateManagerRepository_Factory.create(Provider)>
	//   22   50:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   23   53:putfield        #98  <Field Provider stateManagerRepositoryProvider>
		stateManagerProvider = DoubleCheck.provider(((Provider) (StateManager_Factory.create(contextProvider, stateManagerRepositoryProvider))));
	//   24   56:aload_0         
	//   25   57:aload_0         
	//   26   58:getfield        #77  <Field Provider contextProvider>
	//   27   61:aload_0         
	//   28   62:getfield        #98  <Field Provider stateManagerRepositoryProvider>
	//   29   65:invokestatic    #103 <Method StateManager_Factory StateManager_Factory.create(Provider, Provider)>
	//   30   68:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   31   71:putfield        #105 <Field Provider stateManagerProvider>
		locationManagerRepositoryProvider = DoubleCheck.provider(((Provider) (LocationManagerRepository_Factory.create(contextProvider))));
	//   32   74:aload_0         
	//   33   75:aload_0         
	//   34   76:getfield        #77  <Field Provider contextProvider>
	//   35   79:invokestatic    #110 <Method LocationManagerRepository_Factory LocationManagerRepository_Factory.create(Provider)>
	//   36   82:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   37   85:putfield        #112 <Field Provider locationManagerRepositoryProvider>
		geofencingClientProvider = DoubleCheck.provider(((Provider) (LocationModule_GeofencingClientFactory.create(contextProvider))));
	//   38   88:aload_0         
	//   39   89:aload_0         
	//   40   90:getfield        #77  <Field Provider contextProvider>
	//   41   93:invokestatic    #117 <Method LocationModule_GeofencingClientFactory LocationModule_GeofencingClientFactory.create(Provider)>
	//   42   96:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   43   99:putfield        #119 <Field Provider geofencingClientProvider>
		locationClientProvider = DoubleCheck.provider(((Provider) (LocationModule_LocationClientFactory.create(contextProvider))));
	//   44  102:aload_0         
	//   45  103:aload_0         
	//   46  104:getfield        #77  <Field Provider contextProvider>
	//   47  107:invokestatic    #124 <Method LocationModule_LocationClientFactory LocationModule_LocationClientFactory.create(Provider)>
	//   48  110:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   49  113:putfield        #126 <Field Provider locationClientProvider>
		locationManagerProvider = DoubleCheck.provider(((Provider) (LocationManager_Factory.create(contextProvider, optionsRepositoryProvider, locationManagerRepositoryProvider, geofencingClientProvider, locationClientProvider))));
	//   50  116:aload_0         
	//   51  117:aload_0         
	//   52  118:getfield        #77  <Field Provider contextProvider>
	//   53  121:aload_0         
	//   54  122:getfield        #84  <Field Provider optionsRepositoryProvider>
	//   55  125:aload_0         
	//   56  126:getfield        #112 <Field Provider locationManagerRepositoryProvider>
	//   57  129:aload_0         
	//   58  130:getfield        #119 <Field Provider geofencingClientProvider>
	//   59  133:aload_0         
	//   60  134:getfield        #126 <Field Provider locationClientProvider>
	//   61  137:invokestatic    #131 <Method LocationManager_Factory LocationManager_Factory.create(Provider, Provider, Provider, Provider, Provider)>
	//   62  140:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   63  143:putfield        #133 <Field Provider locationManagerProvider>
		apiClientRepositoryProvider = DoubleCheck.provider(((Provider) (ApiClientRepository_Factory.create(contextProvider))));
	//   64  146:aload_0         
	//   65  147:aload_0         
	//   66  148:getfield        #77  <Field Provider contextProvider>
	//   67  151:invokestatic    #138 <Method ApiClientRepository_Factory ApiClientRepository_Factory.create(Provider)>
	//   68  154:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   69  157:putfield        #140 <Field Provider apiClientRepositoryProvider>
		configRepositoryProvider = DoubleCheck.provider(((Provider) (ConfigRepository_Factory.create(contextProvider))));
	//   70  160:aload_0         
	//   71  161:aload_0         
	//   72  162:getfield        #77  <Field Provider contextProvider>
	//   73  165:invokestatic    #145 <Method ConfigRepository_Factory ConfigRepository_Factory.create(Provider)>
	//   74  168:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   75  171:putfield        #147 <Field Provider configRepositoryProvider>
		integrationHelperProvider = DoubleCheck.provider(((Provider) (IntegrationHelper_Factory.create())));
	//   76  174:aload_0         
	//   77  175:invokestatic    #152 <Method IntegrationHelper_Factory IntegrationHelper_Factory.create()>
	//   78  178:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   79  181:putfield        #154 <Field Provider integrationHelperProvider>
		deviceHelperProvider = DoubleCheck.provider(((Provider) (CoreModule_DeviceHelperFactory.create(builder1.coreModule))));
	//   80  184:aload_0         
	//   81  185:aload_1         
	//   82  186:invokestatic    #63  <Method CoreModule DaggerRadarComponent$Builder.access$100(DaggerRadarComponent$Builder)>
	//   83  189:invokestatic    #159 <Method CoreModule_DeviceHelperFactory CoreModule_DeviceHelperFactory.create(CoreModule)>
	//   84  192:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//   85  195:putfield        #161 <Field Provider deviceHelperProvider>
		apiServiceProvider = DoubleCheck.provider(((Provider) (ApiService_Factory.create(contextProvider, identityRepositoryProvider, optionsRepositoryProvider, apiClientRepositoryProvider, configRepositoryProvider, integrationHelperProvider, deviceHelperProvider))));
	//   86  198:aload_0         
	//   87  199:aload_0         
	//   88  200:getfield        #77  <Field Provider contextProvider>
	//   89  203:aload_0         
	//   90  204:getfield        #91  <Field Provider identityRepositoryProvider>
	//   91  207:aload_0         
	//   92  208:getfield        #84  <Field Provider optionsRepositoryProvider>
	//   93  211:aload_0         
	//   94  212:getfield        #140 <Field Provider apiClientRepositoryProvider>
	//   95  215:aload_0         
	//   96  216:getfield        #147 <Field Provider configRepositoryProvider>
	//   97  219:aload_0         
	//   98  220:getfield        #154 <Field Provider integrationHelperProvider>
	//   99  223:aload_0         
	//  100  224:getfield        #161 <Field Provider deviceHelperProvider>
	//  101  227:invokestatic    #166 <Method ApiService_Factory ApiService_Factory.create(Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//  102  230:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//  103  233:putfield        #168 <Field Provider apiServiceProvider>
		apiClientProvider = DoubleCheck.provider(((Provider) (ApiClient_Factory.create(contextProvider, identityRepositoryProvider, optionsRepositoryProvider, apiClientRepositoryProvider, apiServiceProvider))));
	//  104  236:aload_0         
	//  105  237:aload_0         
	//  106  238:getfield        #77  <Field Provider contextProvider>
	//  107  241:aload_0         
	//  108  242:getfield        #91  <Field Provider identityRepositoryProvider>
	//  109  245:aload_0         
	//  110  246:getfield        #84  <Field Provider optionsRepositoryProvider>
	//  111  249:aload_0         
	//  112  250:getfield        #140 <Field Provider apiClientRepositoryProvider>
	//  113  253:aload_0         
	//  114  254:getfield        #168 <Field Provider apiServiceProvider>
	//  115  257:invokestatic    #173 <Method ApiClient_Factory ApiClient_Factory.create(Provider, Provider, Provider, Provider, Provider)>
	//  116  260:invokestatic    #75  <Method Provider DoubleCheck.provider(Provider)>
	//  117  263:putfield        #175 <Field Provider apiClientProvider>
	//  118  266:return          
	}

	private Radar injectRadar(Radar radar)
	{
		Radar_MembersInjector.injectInit$sdk_release(radar, (Context)contextProvider.get(), (OptionsRepository)optionsRepositoryProvider.get(), (IdentityRepository)identityRepositoryProvider.get(), (StateManager)stateManagerProvider.get(), (LocationManager)locationManagerProvider.get(), (ApiClient)apiClientProvider.get());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field Provider contextProvider>
	//    3    5:invokeinterface #183 <Method Object Provider.get()>
	//    4   10:checkcast       #185 <Class Context>
	//    5   13:aload_0         
	//    6   14:getfield        #84  <Field Provider optionsRepositoryProvider>
	//    7   17:invokeinterface #183 <Method Object Provider.get()>
	//    8   22:checkcast       #187 <Class OptionsRepository>
	//    9   25:aload_0         
	//   10   26:getfield        #91  <Field Provider identityRepositoryProvider>
	//   11   29:invokeinterface #183 <Method Object Provider.get()>
	//   12   34:checkcast       #189 <Class IdentityRepository>
	//   13   37:aload_0         
	//   14   38:getfield        #105 <Field Provider stateManagerProvider>
	//   15   41:invokeinterface #183 <Method Object Provider.get()>
	//   16   46:checkcast       #191 <Class StateManager>
	//   17   49:aload_0         
	//   18   50:getfield        #133 <Field Provider locationManagerProvider>
	//   19   53:invokeinterface #183 <Method Object Provider.get()>
	//   20   58:checkcast       #193 <Class LocationManager>
	//   21   61:aload_0         
	//   22   62:getfield        #175 <Field Provider apiClientProvider>
	//   23   65:invokeinterface #183 <Method Object Provider.get()>
	//   24   70:checkcast       #195 <Class ApiClient>
	//   25   73:invokestatic    #201 <Method void Radar_MembersInjector.injectInit$sdk_release(Radar, Context, OptionsRepository, IdentityRepository, StateManager, LocationManager, ApiClient)>
		return radar;
	//   26   76:aload_1         
	//   27   77:areturn         
	}

	public void inject(Radar radar)
	{
		injectRadar(radar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method Radar injectRadar(Radar)>
	//    3    5:pop             
	//    4    6:return          
	}

	private Provider apiClientProvider;
	private Provider apiClientRepositoryProvider;
	private Provider apiServiceProvider;
	private Provider configRepositoryProvider;
	private Provider contextProvider;
	private Provider deviceHelperProvider;
	private Provider geofencingClientProvider;
	private Provider identityRepositoryProvider;
	private Provider integrationHelperProvider;
	private Provider locationClientProvider;
	private Provider locationManagerProvider;
	private Provider locationManagerRepositoryProvider;
	private Provider optionsRepositoryProvider;
	private Provider stateManagerProvider;
	private Provider stateManagerRepositoryProvider;
}
