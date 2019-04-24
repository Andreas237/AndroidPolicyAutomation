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
		return val$newInstance.invoke(((Object) (null)), new Object[] {
			class1, Integer.valueOf(val$constructorId)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Method val$newInstance>
	//    2    4:aconst_null     
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_0         
	//   12   16:getfield        #17  <Field int val$constructorId>
	//   13   19:invokestatic    #33  <Method Integer Integer.valueOf(int)>
	//   14   22:aastore         
	//   15   23:invokevirtual   #39  <Method Object Method.invoke(Object, Object[])>
	//   16   26:areturn         
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
