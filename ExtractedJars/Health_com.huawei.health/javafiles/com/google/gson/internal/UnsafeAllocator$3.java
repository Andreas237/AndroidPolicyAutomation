// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//			UnsafeAllocator

static final class UnsafeAllocator$3 extends UnsafeAllocator
{

	public Object newInstance(Class class1)
		throws Exception
	{
		assertInstantiable(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method void assertInstantiable(Class)>
		return val$newInstance.invoke(((Object) (null)), new Object[] {
			class1, java/lang/Object
		});
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field Method val$newInstance>
	//    4    8:aconst_null     
	//    5    9:iconst_2        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:ldc1            #27  <Class Object>
	//   14   21:aastore         
	//   15   22:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
	//   16   25:areturn         
	}

	final Method val$newInstance;

	UnsafeAllocator$3(Method method)
	{
		val$newInstance = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Method val$newInstance>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void UnsafeAllocator()>
	//    5    9:return          
	}
}
