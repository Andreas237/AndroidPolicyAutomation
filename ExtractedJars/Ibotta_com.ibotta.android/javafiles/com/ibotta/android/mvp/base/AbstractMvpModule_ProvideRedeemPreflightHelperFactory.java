// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.offer.OfferHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.base:
//			AbstractMvpModule

public final class AbstractMvpModule_ProvideRedeemPreflightHelperFactory
	implements Factory
{

	public AbstractMvpModule_ProvideRedeemPreflightHelperFactory(AbstractMvpModule abstractmvpmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		module = abstractmvpmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field AbstractMvpModule module>
		offerHelperProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field Provider offerHelperProvider>
		hardwareProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field Provider hardwareProvider>
		formattingProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field Provider formattingProvider>
		apiWorkSubmitterProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field Provider apiWorkSubmitterProvider>
		variantFactoryProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #38  <Field Provider variantFactoryProvider>
	//   20   37:return          
	}

	public static AbstractMvpModule_ProvideRedeemPreflightHelperFactory create(AbstractMvpModule abstractmvpmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new AbstractMvpModule_ProvideRedeemPreflightHelperFactory(abstractmvpmodule, provider, provider1, provider2, provider3, provider4);
	//    0    0:new             #2   <Class AbstractMvpModule_ProvideRedeemPreflightHelperFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #45  <Method void AbstractMvpModule_ProvideRedeemPreflightHelperFactory(AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//    9   15:areturn         
	}

	public static RedeemPreFlightHelper provideInstance(AbstractMvpModule abstractmvpmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return proxyProvideRedeemPreflightHelper(abstractmvpmodule, (OfferHelper)provider.get(), (Hardware)provider1.get(), (Formatting)provider2.get(), (ApiWorkSubmitter)provider3.get(), (VariantFactory)provider4.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #54  <Method Object Provider.get()>
	//    3    7:checkcast       #56  <Class OfferHelper>
	//    4   10:aload_2         
	//    5   11:invokeinterface #54  <Method Object Provider.get()>
	//    6   16:checkcast       #58  <Class Hardware>
	//    7   19:aload_3         
	//    8   20:invokeinterface #54  <Method Object Provider.get()>
	//    9   25:checkcast       #60  <Class Formatting>
	//   10   28:aload           4
	//   11   30:invokeinterface #54  <Method Object Provider.get()>
	//   12   35:checkcast       #62  <Class ApiWorkSubmitter>
	//   13   38:aload           5
	//   14   40:invokeinterface #54  <Method Object Provider.get()>
	//   15   45:checkcast       #64  <Class VariantFactory>
	//   16   48:invokestatic    #68  <Method RedeemPreFlightHelper proxyProvideRedeemPreflightHelper(AbstractMvpModule, OfferHelper, Hardware, Formatting, ApiWorkSubmitter, VariantFactory)>
	//   17   51:areturn         
	}

	public static RedeemPreFlightHelper proxyProvideRedeemPreflightHelper(AbstractMvpModule abstractmvpmodule, OfferHelper offerhelper, Hardware hardware, Formatting formatting, ApiWorkSubmitter apiworksubmitter, VariantFactory variantfactory)
	{
		return (RedeemPreFlightHelper)Preconditions.checkNotNull(((Object) (abstractmvpmodule.provideRedeemPreflightHelper(offerhelper, hardware, formatting, apiworksubmitter, variantfactory))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #75  <Method RedeemPreFlightHelper AbstractMvpModule.provideRedeemPreflightHelper(OfferHelper, Hardware, Formatting, ApiWorkSubmitter, VariantFactory)>
	//    7   11:ldc1            #77  <String "Cannot return null from a non-@Nullable @Provides method">
	//    8   13:invokestatic    #83  <Method Object Preconditions.checkNotNull(Object, String)>
	//    9   16:checkcast       #85  <Class RedeemPreFlightHelper>
	//   10   19:areturn         
	}

	public RedeemPreFlightHelper get()
	{
		return provideInstance(module, offerHelperProvider, hardwareProvider, formattingProvider, apiWorkSubmitterProvider, variantFactoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field AbstractMvpModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Provider offerHelperProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Provider hardwareProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field Provider formattingProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field Provider apiWorkSubmitterProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field Provider variantFactoryProvider>
	//   12   24:invokestatic    #89  <Method RedeemPreFlightHelper provideInstance(AbstractMvpModule, Provider, Provider, Provider, Provider, Provider)>
	//   13   27:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method RedeemPreFlightHelper get()>
	//    2    4:areturn         
	}

	private final Provider apiWorkSubmitterProvider;
	private final Provider formattingProvider;
	private final Provider hardwareProvider;
	private final AbstractMvpModule module;
	private final Provider offerHelperProvider;
	private final Provider variantFactoryProvider;
}
