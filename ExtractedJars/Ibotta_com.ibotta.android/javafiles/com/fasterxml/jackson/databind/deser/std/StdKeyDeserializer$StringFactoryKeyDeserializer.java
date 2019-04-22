// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$StringFactoryKeyDeserializer extends StdKeyDeserializer
{

	public Object _parse(String s, DeserializationContext deserializationcontext)
		throws Exception
	{
		return _factoryMethod.invoke(((Object) (null)), new Object[] {
			s
		});
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Method _factoryMethod>
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:invokevirtual   #35  <Method Object Method.invoke(Object, Object[])>
	//   10   16:areturn         
	}

	private static final long serialVersionUID = 1L;
	final Method _factoryMethod;

	public StdKeyDeserializer$StringFactoryKeyDeserializer(Method method)
	{
		super(-1, method.getDeclaringClass());
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:invokevirtual   #19  <Method Class Method.getDeclaringClass()>
	//    4    6:invokespecial   #22  <Method void StdKeyDeserializer(int, Class)>
		_factoryMethod = method;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Method _factoryMethod>
	//    8   14:return          
	}
}
