// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException, DeserializationContext, BeanProperty

public abstract class InjectableValues
{

	public abstract Object findInjectableValue(Object obj, DeserializationContext deserializationcontext, BeanProperty beanproperty, Object obj1)
		throws JsonMappingException;
}
