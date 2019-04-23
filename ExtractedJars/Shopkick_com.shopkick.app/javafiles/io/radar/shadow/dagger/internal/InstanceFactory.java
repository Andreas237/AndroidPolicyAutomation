// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.Lazy;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Factory, Preconditions

public final class InstanceFactory
	implements Factory, Lazy
{

	private InstanceFactory(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		instance = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Object instance>
	//    5    9:return          
	}

	public static Factory create(Object obj)
	{
		return ((Factory) (new InstanceFactory(Preconditions.checkNotNull(obj, "instance cannot be null"))));
	//    0    0:new             #2   <Class InstanceFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #34  <String "instance cannot be null">
	//    4    7:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   10:invokespecial   #21  <Method void InstanceFactory(Object)>
	//    6   13:areturn         
	}

	public static Factory createNullable(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ((Factory) (nullInstanceFactory()));
	//    2    4:invokestatic    #46  <Method InstanceFactory nullInstanceFactory()>
	//    3    7:areturn         
		else
			return ((Factory) (new InstanceFactory(obj)));
	//    4    8:new             #2   <Class InstanceFactory>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #21  <Method void InstanceFactory(Object)>
	//    8   16:areturn         
	}

	private static InstanceFactory nullInstanceFactory()
	{
		return NULL_INSTANCE_FACTORY;
	//    0    0:getstatic       #23  <Field InstanceFactory NULL_INSTANCE_FACTORY>
	//    1    3:areturn         
	}

	public Object get()
	{
		return instance;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object instance>
	//    2    4:areturn         
	}

	private static final InstanceFactory NULL_INSTANCE_FACTORY = new InstanceFactory(((Object) (null)));
	private final Object instance;

	static 
	{
	//    0    0:new             #2   <Class InstanceFactory>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #21  <Method void InstanceFactory(Object)>
	//    4    8:putstatic       #23  <Field InstanceFactory NULL_INSTANCE_FACTORY>
	//*   5   11:return          
	}
}
