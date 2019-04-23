// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.Lazy;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions, DoubleCheck

public final class ProviderOfLazy
	implements Provider
{

	private ProviderOfLazy(Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		provider = provider1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Provider provider>
	//    5    9:return          
	}

	public static Provider create(Provider provider1)
	{
		return ((Provider) (new ProviderOfLazy((Provider)Preconditions.checkNotNull(((Object) (provider1))))));
	//    0    0:new             #2   <Class ProviderOfLazy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:checkcast       #7   <Class Provider>
	//    5   11:invokespecial   #34  <Method void ProviderOfLazy(Provider)>
	//    6   14:areturn         
	}

	public Lazy get()
	{
		return DoubleCheck.lazy(provider);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Provider provider>
	//    2    4:invokestatic    #43  <Method Lazy DoubleCheck.lazy(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Lazy get()>
	//    2    4:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final Provider provider;

	static 
	{
	//    0    0:return          
	}
}
