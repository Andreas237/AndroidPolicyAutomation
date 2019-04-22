// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;

public class ObjectIdReader
	implements Serializable
{

	protected ObjectIdReader(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty, ObjectIdResolver objectidresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_idType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field JavaType _idType>
		propertyName = propertyname;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field PropertyName propertyName>
		generator = objectidgenerator;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field ObjectIdGenerator generator>
		resolver = objectidresolver;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #37  <Field ObjectIdResolver resolver>
		_deserializer = jsondeserializer;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #39  <Field JsonDeserializer _deserializer>
		idProperty = settablebeanproperty;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #41  <Field SettableBeanProperty idProperty>
	//   20   37:return          
	}

	public static ObjectIdReader construct(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty, ObjectIdResolver objectidresolver)
	{
		return new ObjectIdReader(javatype, propertyname, objectidgenerator, jsondeserializer, settablebeanproperty, objectidresolver);
	//    0    0:new             #2   <Class ObjectIdReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #48  <Method void ObjectIdReader(JavaType, PropertyName, ObjectIdGenerator, JsonDeserializer, SettableBeanProperty, ObjectIdResolver)>
	//    9   15:areturn         
	}

	public JsonDeserializer getDeserializer()
	{
		return _deserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _deserializer>
	//    2    4:areturn         
	}

	public JavaType getIdType()
	{
		return _idType;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _idType>
	//    2    4:areturn         
	}

	public boolean isValidReferencePropertyName(String s, JsonParser jsonparser)
	{
		return generator.isValidReferencePropertyName(s, ((Object) (jsonparser)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ObjectIdGenerator generator>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #61  <Method boolean ObjectIdGenerator.isValidReferencePropertyName(String, Object)>
	//    5    9:ireturn         
	}

	public boolean maySerializeAsObject()
	{
		return generator.maySerializeAsObject();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ObjectIdGenerator generator>
	//    2    4:invokevirtual   #65  <Method boolean ObjectIdGenerator.maySerializeAsObject()>
	//    3    7:ireturn         
	}

	public Object readObjectReference(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializer.deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #74  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _deserializer;
	protected final JavaType _idType;
	public final ObjectIdGenerator generator;
	public final SettableBeanProperty idProperty;
	public final PropertyName propertyName;
	public final ObjectIdResolver resolver;
}
