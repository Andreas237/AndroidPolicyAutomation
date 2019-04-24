// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//			UnsafeAllocator

static final class UnsafeAllocator$1 extends UnsafeAllocator
{

	public Object newInstance(Class class1)
		throws Exception
	{
		assertInstantiable(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method void assertInstantiable(Class)>
		return val$allocateInstance.invoke(val$unsafe, new Object[] {
			class1
		});
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Method val$allocateInstance>
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field Object val$unsafe>
	//    6   12:iconst_1        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:aastore         
	//   12   20:invokevirtual   #37  <Method Object Method.invoke(Object, Object[])>
	//   13   23:areturn         
	}

	final Method val$allocateInstance;
	final Object val$unsafe;

	UnsafeAllocator$1(Method method, Object obj)
	{
		val$allocateInstance = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Method val$allocateInstance>
		val$unsafe = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field Object val$unsafe>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void UnsafeAllocator()>
	//    8   14:return          
	}
}
