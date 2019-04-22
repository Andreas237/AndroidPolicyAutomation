// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.mvp.ui.view.ScrollingBottomSpace;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountModule

public final class AccountModule_ProvideScrollingBottomSpaceFactory
	implements Factory
{

	public AccountModule_ProvideScrollingBottomSpaceFactory(AccountModule accountmodule)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		module = accountmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field AccountModule module>
	//    5    9:return          
	}

	public static AccountModule_ProvideScrollingBottomSpaceFactory create(AccountModule accountmodule)
	{
		return new AccountModule_ProvideScrollingBottomSpaceFactory(accountmodule);
	//    0    0:new             #2   <Class AccountModule_ProvideScrollingBottomSpaceFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void AccountModule_ProvideScrollingBottomSpaceFactory(AccountModule)>
	//    4    8:areturn         
	}

	public static ScrollingBottomSpace provideInstance(AccountModule accountmodule)
	{
		return proxyProvideScrollingBottomSpace(accountmodule);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method ScrollingBottomSpace proxyProvideScrollingBottomSpace(AccountModule)>
	//    2    4:areturn         
	}

	public static ScrollingBottomSpace proxyProvideScrollingBottomSpace(AccountModule accountmodule)
	{
		return (ScrollingBottomSpace)Preconditions.checkNotNull(((Object) (accountmodule.provideScrollingBottomSpace())), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method ScrollingBottomSpace AccountModule.provideScrollingBottomSpace()>
	//    2    4:ldc1            #34  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #42  <Class ScrollingBottomSpace>
	//    5   12:areturn         
	}

	public ScrollingBottomSpace get()
	{
		return provideInstance(module);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccountModule module>
	//    2    4:invokestatic    #45  <Method ScrollingBottomSpace provideInstance(AccountModule)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method ScrollingBottomSpace get()>
	//    2    4:areturn         
	}

	private final AccountModule module;
}
