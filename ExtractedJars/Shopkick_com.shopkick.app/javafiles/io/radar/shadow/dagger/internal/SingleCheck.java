// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			DoubleCheck, Preconditions

public final class SingleCheck
	implements Provider
{

	private SingleCheck(Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		instance = UNINITIALIZED;
	//    2    4:aload_0         
	//    3    5:getstatic       #23  <Field Object UNINITIALIZED>
	//    4    8:putfield        #27  <Field Object instance>
		provider = provider1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #29  <Field Provider provider>
	//    8   16:return          
	}

	public static Provider provider(Provider provider1)
	{
		if(!(provider1 instanceof SingleCheck))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class SingleCheck>
	//*   2    4:ifne            31
		{
			if(provider1 instanceof DoubleCheck)
	//*   3    7:aload_0         
	//*   4    8:instanceof      #34  <Class DoubleCheck>
	//*   5   11:ifeq            16
				return provider1;
	//    6   14:aload_0         
	//    7   15:areturn         
			else
				return ((Provider) (new SingleCheck((Provider)Preconditions.checkNotNull(((Object) (provider1))))));
	//    8   16:new             #2   <Class SingleCheck>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object)>
	//   12   24:checkcast       #7   <Class Provider>
	//   13   27:invokespecial   #42  <Method void SingleCheck(Provider)>
	//   14   30:areturn         
		} else
		{
			return provider1;
	//   15   31:aload_0         
	//   16   32:areturn         
		}
	}

	public Object get()
	{
		Object obj1 = instance;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object instance>
	//    2    4:astore_2        
		Object obj = obj1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(obj1 == UNINITIALIZED)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #23  <Field Object UNINITIALIZED>
	//*   7   11:if_acmpne       45
		{
			obj = ((Object) (provider));
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field Provider provider>
	//   10   18:astore_1        
			if(obj == null)
	//*  11   19:aload_1         
	//*  12   20:ifnonnull       28
				return instance;
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field Object instance>
	//   15   27:areturn         
			obj = ((Provider) (obj)).get();
	//   16   28:aload_1         
	//   17   29:invokeinterface #47  <Method Object Provider.get()>
	//   18   34:astore_1        
			instance = obj;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #27  <Field Object instance>
			provider = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #29  <Field Provider provider>
		}
		return obj;
	//   25   45:aload_1         
	//   26   46:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final Object UNINITIALIZED = new Object();
	private volatile Object instance;
	private volatile Provider provider;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object UNINITIALIZED>
	//*   4   10:return          
	}
}
