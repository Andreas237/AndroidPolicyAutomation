// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyValue

static final class PropertyValue$Any extends PropertyValue
{

	public void assign(Object obj)
		throws IOException, JsonProcessingException
	{
		_property.set(obj, ((Object) (_propertyName)), value);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SettableAnyProperty _property>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field String _propertyName>
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Object value>
	//    7   13:invokevirtual   #35  <Method void SettableAnyProperty.set(Object, Object, Object)>
	//    8   16:return          
	}

	final SettableAnyProperty _property;
	final String _propertyName;

	public PropertyValue$Any(PropertyValue propertyvalue, Object obj, SettableAnyProperty settableanyproperty, String s)
	{
		super(propertyvalue, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void PropertyValue(PropertyValue, Object)>
		_property = settableanyproperty;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #16  <Field SettableAnyProperty _property>
		_propertyName = s;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #18  <Field String _propertyName>
	//   10   17:return          
	}
}
