// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectModule, PayPalConnectCollaborators

public final class PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory
	implements Factory
{

	public PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory(PayPalConnectModule paypalconnectmodule)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		module = paypalconnectmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field PayPalConnectModule module>
	//    5    9:return          
	}

	public static PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory create(PayPalConnectModule paypalconnectmodule)
	{
		return new PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory(paypalconnectmodule);
	//    0    0:new             #2   <Class PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void PayPalConnectModule_ProvidePayPalConnectCollaboratorsFactory(PayPalConnectModule)>
	//    4    8:areturn         
	}

	public static PayPalConnectCollaborators provideInstance(PayPalConnectModule paypalconnectmodule)
	{
		return proxyProvidePayPalConnectCollaborators(paypalconnectmodule);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method PayPalConnectCollaborators proxyProvidePayPalConnectCollaborators(PayPalConnectModule)>
	//    2    4:areturn         
	}

	public static PayPalConnectCollaborators proxyProvidePayPalConnectCollaborators(PayPalConnectModule paypalconnectmodule)
	{
		return (PayPalConnectCollaborators)Preconditions.checkNotNull(((Object) (paypalconnectmodule.providePayPalConnectCollaborators())), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method PayPalConnectCollaborators PayPalConnectModule.providePayPalConnectCollaborators()>
	//    2    4:ldc1            #34  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #42  <Class PayPalConnectCollaborators>
	//    5   12:areturn         
	}

	public PayPalConnectCollaborators get()
	{
		return provideInstance(module);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PayPalConnectModule module>
	//    2    4:invokestatic    #45  <Method PayPalConnectCollaborators provideInstance(PayPalConnectModule)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method PayPalConnectCollaborators get()>
	//    2    4:areturn         
	}

	private final PayPalConnectModule module;
}
