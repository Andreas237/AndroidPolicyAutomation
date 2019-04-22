// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyValue

static final class PropertyValue$Regular extends PropertyValue
{

	public void assign(Object obj)
		throws IOException, JsonProcessingException
	{
		_property.set(obj, value);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SettableBeanProperty _property>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field Object value>
	//    5    9:invokevirtual   #31  <Method void SettableBeanProperty.set(Object, Object)>
	//    6   12:return          
	}

	final SettableBeanProperty _property;

	public PropertyValue$Regular(PropertyValue propertyvalue, Object obj, SettableBeanProperty settablebeanproperty)
	{
		super(propertyvalue, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void PropertyValue(PropertyValue, Object)>
		_property = settablebeanproperty;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #14  <Field SettableBeanProperty _property>
	//    7   11:return          
	}
}
