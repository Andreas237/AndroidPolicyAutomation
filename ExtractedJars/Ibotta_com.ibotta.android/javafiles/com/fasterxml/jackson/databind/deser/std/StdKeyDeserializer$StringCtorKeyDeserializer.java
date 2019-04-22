// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$StringCtorKeyDeserializer extends StdKeyDeserializer
{

	public Object _parse(String s, DeserializationContext deserializationcontext)
		throws Exception
	{
		return _ctor.newInstance(new Object[] {
			s
		});
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Constructor _ctor>
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #38  <Method Object Constructor.newInstance(Object[])>
	//    9   15:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Constructor _ctor;

	public StdKeyDeserializer$StringCtorKeyDeserializer(Constructor constructor)
	{
		super(-1, constructor.getDeclaringClass());
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:invokevirtual   #20  <Method Class Constructor.getDeclaringClass()>
	//    4    6:invokespecial   #23  <Method void StdKeyDeserializer(int, Class)>
		_ctor = constructor;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field Constructor _ctor>
	//    8   14:return          
	}
}
