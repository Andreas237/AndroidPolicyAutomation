// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyValue

static final class PropertyValue$Map extends PropertyValue
{

	public void assign(Object obj)
		throws IOException, JsonProcessingException
	{
		((Map)obj).put(_key, value);
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class Map>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field Object _key>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field Object value>
	//    6   12:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	final Object _key;

	public PropertyValue$Map(PropertyValue propertyvalue, Object obj, Object obj1)
	{
		super(propertyvalue, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void PropertyValue(PropertyValue, Object)>
		_key = obj1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #14  <Field Object _key>
	//    7   11:return          
	}
}
