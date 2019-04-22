// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRowCreator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerModule, BonusesPickerPresenter

public final class BonusesPickerModule_ProvideMvpPresenterFactory
	implements Factory
{

	public BonusesPickerModule_ProvideMvpPresenterFactory(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		module = bonusespickermodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field BonusesPickerModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider mvpPresenterActionsProvider>
		bonusPickerRowCreatorProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider bonusPickerRowCreatorProvider>
	//   11   19:return          
	}

	public static BonusesPickerModule_ProvideMvpPresenterFactory create(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
		return new BonusesPickerModule_ProvideMvpPresenterFactory(bonusespickermodule, provider, provider1);
	//    0    0:new             #2   <Class BonusesPickerModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void BonusesPickerModule_ProvideMvpPresenterFactory(BonusesPickerModule, Provider, Provider)>
	//    6   10:areturn         
	}

	public static BonusesPickerPresenter provideInstance(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
		return proxyProvideMvpPresenter(bonusespickermodule, (MvpPresenterActions)provider.get(), (BonusPickerRowCreator)provider1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method Object Provider.get()>
	//    3    7:checkcast       #43  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #41  <Method Object Provider.get()>
	//    6   16:checkcast       #45  <Class BonusPickerRowCreator>
	//    7   19:invokestatic    #49  <Method BonusesPickerPresenter proxyProvideMvpPresenter(BonusesPickerModule, MvpPresenterActions, BonusPickerRowCreator)>
	//    8   22:areturn         
	}

	public static BonusesPickerPresenter proxyProvideMvpPresenter(BonusesPickerModule bonusespickermodule, MvpPresenterActions mvppresenteractions, BonusPickerRowCreator bonuspickerrowcreator)
	{
		return (BonusesPickerPresenter)Preconditions.checkNotNull(((Object) (bonusespickermodule.provideMvpPresenter(mvppresenteractions, bonuspickerrowcreator))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method BonusesPickerPresenter BonusesPickerModule.provideMvpPresenter(MvpPresenterActions, BonusPickerRowCreator)>
	//    4    6:ldc1            #58  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #66  <Class BonusesPickerPresenter>
	//    7   14:areturn         
	}

	public BonusesPickerPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, bonusPickerRowCreatorProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BonusesPickerModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider bonusPickerRowCreatorProvider>
	//    6   12:invokestatic    #69  <Method BonusesPickerPresenter provideInstance(BonusesPickerModule, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method BonusesPickerPresenter get()>
	//    2    4:areturn         
	}

	private final Provider bonusPickerRowCreatorProvider;
	private final BonusesPickerModule module;
	private final Provider mvpPresenterActionsProvider;
}
