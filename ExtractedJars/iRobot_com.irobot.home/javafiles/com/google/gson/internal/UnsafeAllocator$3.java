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
	{
		return val$newInstance.invoke(((Object) (null)), new Object[] {
			class1, java/lang/Object
		});
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Method val$newInstance>
	//    2    4:aconst_null     
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:ldc1            #21  <Class Object>
	//   12   17:aastore         
	//   13   18:invokevirtual   #27  <Method Object Method.invoke(Object, Object[])>
	//   14   21:areturn         
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
