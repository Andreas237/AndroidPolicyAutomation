// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.di.MainComponent;
import com.ibotta.api.helper.bonus.BonusHelper;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			DaggerBonusDetailComponent

private static class DaggerBonusDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper
	implements Provider
{

	public BonusHelper get()
	{
		return (BonusHelper)Preconditions.checkNotNull(((Object) (mainComponent.getBonusHelper())), "Cannot return null from a non-@Nullable component method");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MainComponent mainComponent>
	//    2    4:invokeinterface #27  <Method BonusHelper MainComponent.getBonusHelper()>
	//    3    9:ldc1            #29  <String "Cannot return null from a non-@Nullable component method">
	//    4   11:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   14:checkcast       #37  <Class BonusHelper>
	//    6   17:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method BonusHelper get()>
	//    2    4:areturn         
	}

	private final MainComponent mainComponent;

	DaggerBonusDetailComponent$com_ibotta_android_di_MainComponent_getBonusHelper(MainComponent maincomponent)
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
