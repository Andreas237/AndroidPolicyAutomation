// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Method;

// Referenced classes of package com.google.gson.internal:
//			UnsafeAllocator

static final class UnsafeAllocator$2 extends UnsafeAllocator
{

	public Object newInstance(Class class1)
		throws Exception
	{
		assertInstantiable(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method void assertInstantiable(Class)>
		return val$newInstance.invoke(((Object) (null)), new Object[] {
			class1, Integer.valueOf(val$constructorId)
		});
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Method val$newInstance>
	//    4    8:aconst_null     
	//    5    9:iconst_2        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:aload_0         
	//   14   20:getfield        #17  <Field int val$constructorId>
	//   15   23:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   16   26:aastore         
	//   17   27:invokevirtual   #43  <Method Object Method.invoke(Object, Object[])>
	//   18   30:areturn         
	}

	final int val$constructorId;
	final Method val$newInstance;

	UnsafeAllocator$2(Method method, int i)
	{
		val$newInstance = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Method val$newInstance>
		val$constructorId = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int val$constructorId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void UnsafeAllocator()>
	//    8   14:return          
	}
}
