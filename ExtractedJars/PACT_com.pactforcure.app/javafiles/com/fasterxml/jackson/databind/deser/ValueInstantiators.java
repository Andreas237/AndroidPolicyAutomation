// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			ValueInstantiator

public interface ValueInstantiators
{
	public static class Base
		implements ValueInstantiators
	{

		public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription, ValueInstantiator valueinstantiator)
		{
			return valueinstantiator;
		//    0    0:aload_3         
		//    1    1:areturn         
		}

		public Base()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription, ValueInstantiator valueinstantiator);
}
