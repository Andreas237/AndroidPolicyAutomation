// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.api.critical.CriticalDependency;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.util.AppHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpPresenterActionsImpl

public final class MvpPresenterActionsImpl_Factory
	implements Factory
{

	public MvpPresenterActionsImpl_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		appHelperProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Provider appHelperProvider>
		hardwareProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Provider hardwareProvider>
		criticalDependencyProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Provider criticalDependencyProvider>
		retailerParcelHelperProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field Provider retailerParcelHelperProvider>
		apiWorkSubmitterProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field Provider apiWorkSubmitterProvider>
	//   17   31:return          
	}

	public static MvpPresenterActionsImpl_Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new MvpPresenterActionsImpl_Factory(provider, provider1, provider2, provider3, provider4);
	//    0    0:new             #2   <Class MvpPresenterActionsImpl_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #40  <Method void MvpPresenterActionsImpl_Factory(Provider, Provider, Provider, Provider, Provider)>
	//    8   13:areturn         
	}

	public static MvpPresenterActionsImpl newMvpPresenterActionsImpl(AppHelper apphelper, Hardware hardware, CriticalDependency criticaldependency, RetailerParcelHelper retailerparcelhelper, ApiWorkSubmitter apiworksubmitter)
	{
		return new MvpPresenterActionsImpl(apphelper, hardware, criticaldependency, retailerparcelhelper, apiworksubmitter);
	//    0    0:new             #45  <Class MvpPresenterActionsImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #48  <Method void MvpPresenterActionsImpl(AppHelper, Hardware, CriticalDependency, RetailerParcelHelper, ApiWorkSubmitter)>
	//    8   13:areturn         
	}

	public static MvpPresenterActionsImpl provideInstance(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new MvpPresenterActionsImpl((AppHelper)provider.get(), (Hardware)provider1.get(), (CriticalDependency)provider2.get(), (RetailerParcelHelper)provider3.get(), (ApiWorkSubmitter)provider4.get());
	//    0    0:new             #45  <Class MvpPresenterActionsImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #56  <Method Object Provider.get()>
	//    4   10:checkcast       #58  <Class AppHelper>
	//    5   13:aload_1         
	//    6   14:invokeinterface #56  <Method Object Provider.get()>
	//    7   19:checkcast       #60  <Class Hardware>
	//    8   22:aload_2         
	//    9   23:invokeinterface #56  <Method Object Provider.get()>
	//   10   28:checkcast       #62  <Class CriticalDependency>
	//   11   31:aload_3         
	//   12   32:invokeinterface #56  <Method Object Provider.get()>
	//   13   37:checkcast       #64  <Class RetailerParcelHelper>
	//   14   40:aload           4
	//   15   42:invokeinterface #56  <Method Object Provider.get()>
	//   16   47:checkcast       #66  <Class ApiWorkSubmitter>
	//   17   50:invokespecial   #48  <Method void MvpPresenterActionsImpl(AppHelper, Hardware, CriticalDependency, RetailerParcelHelper, ApiWorkSubmitter)>
	//   18   53:areturn         
	}

	public MvpPresenterActionsImpl get()
	{
		return provideInstance(appHelperProvider, hardwareProvider, criticalDependencyProvider, retailerParcelHelperProvider, apiWorkSubmitterProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Provider appHelperProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Provider hardwareProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Provider criticalDependencyProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field Provider retailerParcelHelperProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field Provider apiWorkSubmitterProvider>
	//   10   20:invokestatic    #70  <Method MvpPresenterActionsImpl provideInstance(Provider, Provider, Provider, Provider, Provider)>
	//   11   23:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method MvpPresenterActionsImpl get()>
	//    2    4:areturn         
	}

	private final Provider apiWorkSubmitterProvider;
	private final Provider appHelperProvider;
	private final Provider criticalDependencyProvider;
	private final Provider hardwareProvider;
	private final Provider retailerParcelHelperProvider;
}
