// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ObjectIdReader, ReadableObjectId

public final class ObjectIdValueProperty extends SettableBeanProperty
{

	public ObjectIdValueProperty(ObjectIdReader objectidreader, PropertyMetadata propertymetadata)
	{
		super(objectidreader.propertyName, objectidreader.getIdType(), propertymetadata, objectidreader.getDeserializer());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #18  <Field PropertyName ObjectIdReader.propertyName>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method com.fasterxml.jackson.databind.JavaType ObjectIdReader.getIdType()>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #26  <Method JsonDeserializer ObjectIdReader.getDeserializer()>
	//    8   14:invokespecial   #29  <Method void SettableBeanProperty(PropertyName, com.fasterxml.jackson.databind.JavaType, PropertyMetadata, JsonDeserializer)>
		_objectIdReader = objectidreader;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//   12   22:return          
	}

	protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (objectidvalueproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_objectIdReader = objectidvalueproperty._objectIdReader;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    7   11:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//    8   14:return          
	}

	protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (objectidvalueproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_objectIdReader = objectidvalueproperty._objectIdReader;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    7   11:putfield        #31  <Field ObjectIdReader _objectIdReader>
	//    8   14:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #50  <Method Object deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//    5    7:pop             
	//    6    8:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		Object obj1 = _valueDeserializer.deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field JsonDeserializer _valueDeserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #61  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    5    9:astore          4
		if(obj1 == null)
	//*   6   11:aload           4
	//*   7   13:ifnonnull       20
		{
			jsonparser = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
		} else
	//*  10   18:aload_1         
	//*  11   19:areturn         
		{
			deserializationcontext.findObjectId(obj1, _objectIdReader.generator, _objectIdReader.resolver).bindItem(obj);
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:aload_0         
	//   15   24:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   16   27:getfield        #65  <Field com.fasterxml.jackson.annotation.ObjectIdGenerator ObjectIdReader.generator>
	//   17   30:aload_0         
	//   18   31:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   19   34:getfield        #69  <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   20   37:invokevirtual   #75  <Method ReadableObjectId DeserializationContext.findObjectId(Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   21   40:aload_3         
	//   22   41:invokevirtual   #81  <Method void ReadableObjectId.bindItem(Object)>
			deserializationcontext = ((DeserializationContext) (_objectIdReader.idProperty));
	//   23   44:aload_0         
	//   24   45:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//   25   48:getfield        #85  <Field SettableBeanProperty ObjectIdReader.idProperty>
	//   26   51:astore_2        
			jsonparser = ((JsonParser) (obj));
	//   27   52:aload_3         
	//   28   53:astore_1        
			if(deserializationcontext != null)
	//*  29   54:aload_2         
	//*  30   55:ifnull          18
				return ((SettableBeanProperty) (deserializationcontext)).setAndReturn(obj, obj1);
	//   31   58:aload_2         
	//   32   59:aload_3         
	//   33   60:aload           4
	//   34   62:invokevirtual   #89  <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   35   65:areturn         
		}
		return ((Object) (jsonparser));
	}

	public Annotation getAnnotation(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedMember getMember()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #97  <Method Object setAndReturn(Object, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		SettableBeanProperty settablebeanproperty = _objectIdReader.idProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ObjectIdReader _objectIdReader>
	//    2    4:getfield        #85  <Field SettableBeanProperty ObjectIdReader.idProperty>
	//    3    7:astore_3        
		if(settablebeanproperty == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       22
			throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
	//    6   12:new             #99  <Class UnsupportedOperationException>
	//    7   15:dup             
	//    8   16:ldc1            #101 <String "Should not call set() on ObjectIdProperty that has no SettableBeanProperty">
	//    9   18:invokespecial   #104 <Method void UnsupportedOperationException(String)>
	//   10   21:athrow          
		else
			return settablebeanproperty.setAndReturn(obj, obj1);
	//   11   22:aload_3         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #89  <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   15   28:areturn         
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #109 <Method ObjectIdValueProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public ObjectIdValueProperty withName(PropertyName propertyname)
	{
		return new ObjectIdValueProperty(this, propertyname);
	//    0    0:new             #2   <Class ObjectIdValueProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #111 <Method void ObjectIdValueProperty(ObjectIdValueProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method ObjectIdValueProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public ObjectIdValueProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new ObjectIdValueProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class ObjectIdValueProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #118 <Method void ObjectIdValueProperty(ObjectIdValueProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final ObjectIdReader _objectIdReader;
}
