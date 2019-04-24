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
		return val$allocateInstance.invoke(val$unsafe, new Object[] {
			class1
		});
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Method val$allocateInstance>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Object val$unsafe>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
	//   11   19:areturn         
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
