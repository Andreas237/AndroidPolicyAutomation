// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

public abstract class PropertyValue
{
	static final class Any extends PropertyValue
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

		public Any(PropertyValue propertyvalue, Object obj, SettableAnyProperty settableanyproperty, String s)
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

	static final class Map extends PropertyValue
	{

		public void assign(Object obj)
			throws IOException, JsonProcessingException
		{
			((java.util.Map)obj).put(_key, value);
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class java.util.Map>
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field Object _key>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field Object value>
		//    6   12:invokeinterface #30  <Method Object java.util.Map.put(Object, Object)>
		//    7   17:pop             
		//    8   18:return          
		}

		final Object _key;

		public Map(PropertyValue propertyvalue, Object obj, Object obj1)
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

	static final class Regular extends PropertyValue
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

		public Regular(PropertyValue propertyvalue, Object obj, SettableBeanProperty settablebeanproperty)
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


	protected PropertyValue(PropertyValue propertyvalue, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		next = propertyvalue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field PropertyValue next>
		value = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Object value>
	//    8   14:return          
	}

	public abstract void assign(Object obj)
		throws IOException, JsonProcessingException;

	public final PropertyValue next;
	public final Object value;
}
