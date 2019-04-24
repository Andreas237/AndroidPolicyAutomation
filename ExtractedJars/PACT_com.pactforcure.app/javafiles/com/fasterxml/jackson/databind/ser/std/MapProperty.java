// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class MapProperty extends PropertyWriter
{

	public MapProperty(TypeSerializer typeserializer, BeanProperty beanproperty)
	{
		PropertyMetadata propertymetadata;
		if(beanproperty == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       24
			propertymetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//    2    4:getstatic       #26  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    3    7:astore_3        
		else
	//*   4    8:aload_0         
	//*   5    9:aload_3         
	//*   6   10:invokespecial   #29  <Method void PropertyWriter(PropertyMetadata)>
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:putfield        #31  <Field TypeSerializer _typeSerializer>
	//*  10   18:aload_0         
	//*  11   19:aload_2         
	//*  12   20:putfield        #33  <Field BeanProperty _property>
	//*  13   23:return          
			propertymetadata = beanproperty.getMetadata();
	//   14   24:aload_2         
	//   15   25:invokeinterface #39  <Method PropertyMetadata BeanProperty.getMetadata()>
	//   16   30:astore_3        
		super(propertymetadata);
		_typeSerializer = typeserializer;
		_property = beanproperty;
	//*  17   31:goto            8
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(_property != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnull          18
			_property.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field BeanProperty _property>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #46  <Method void BeanProperty.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    8   18:return          
	}

	public void depositSchemaProperty(ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
	//    0    0:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_property == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _property.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field BeanProperty _property>
	//    7   13:aload_1         
	//    8   14:invokeinterface #54  <Method Annotation BeanProperty.getAnnotation(Class)>
	//    9   19:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		if(_property == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _property.getContextAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field BeanProperty _property>
	//    7   13:aload_1         
	//    8   14:invokeinterface #59  <Method Annotation BeanProperty.getContextAnnotation(Class)>
	//    9   19:areturn         
	}

	public PropertyName getFullName()
	{
		return new PropertyName(getName());
	//    0    0:new             #63  <Class PropertyName>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #67  <Method String getName()>
	//    4    8:invokespecial   #70  <Method void PropertyName(String)>
	//    5   11:areturn         
	}

	public AnnotatedMember getMember()
	{
		if(_property == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _property.getMember();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field BeanProperty _property>
	//    7   13:invokeinterface #74  <Method AnnotatedMember BeanProperty.getMember()>
	//    8   18:areturn         
	}

	public String getName()
	{
		if(_key instanceof String)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field Object _key>
	//*   2    4:instanceof      #78  <Class String>
	//*   3    7:ifeq            18
			return (String)_key;
	//    4   10:aload_0         
	//    5   11:getfield        #76  <Field Object _key>
	//    6   14:checkcast       #78  <Class String>
	//    7   17:areturn         
		else
			return String.valueOf(_key);
	//    8   18:aload_0         
	//    9   19:getfield        #76  <Field Object _key>
	//   10   22:invokestatic    #82  <Method String String.valueOf(Object)>
	//   11   25:areturn         
	}

	public JavaType getType()
	{
		if(_property == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnonnull       11
			return TypeFactory.unknownType();
	//    3    7:invokestatic    #89  <Method JavaType TypeFactory.unknownType()>
	//    4   10:areturn         
		else
			return _property.getType();
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field BeanProperty _property>
	//    7   15:invokeinterface #91  <Method JavaType BeanProperty.getType()>
	//    8   20:areturn         
	}

	public PropertyName getWrapperName()
	{
		if(_property == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field BeanProperty _property>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _property.getWrapperName();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field BeanProperty _property>
	//    7   13:invokeinterface #94  <Method PropertyName BeanProperty.getWrapperName()>
	//    8   18:areturn         
	}

	public void reset(Object obj, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		_key = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field Object _key>
		_keySerializer = jsonserializer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #98  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #100 <Field JsonSerializer _valueSerializer>
	//    9   15:return          
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(_typeSerializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field TypeSerializer _typeSerializer>
	//*   2    4:ifnonnull       18
		{
			_valueSerializer.serialize(obj, jsongenerator, serializerprovider);
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field JsonSerializer _valueSerializer>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #110 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//    9   17:return          
		} else
		{
			_valueSerializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
	//   10   18:aload_0         
	//   11   19:getfield        #100 <Field JsonSerializer _valueSerializer>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:aload_0         
	//   16   26:getfield        #31  <Field TypeSerializer _typeSerializer>
	//   17   29:invokevirtual   #114 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   18   32:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		_keySerializer.serialize(_key, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field JsonSerializer _keySerializer>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field Object _key>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #110 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(_typeSerializer == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #31  <Field TypeSerializer _typeSerializer>
	//*   9   17:ifnonnull       31
		{
			_valueSerializer.serialize(obj, jsongenerator, serializerprovider);
	//   10   20:aload_0         
	//   11   21:getfield        #100 <Field JsonSerializer _valueSerializer>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #110 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   16   30:return          
		} else
		{
			_valueSerializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
	//   17   31:aload_0         
	//   18   32:getfield        #100 <Field JsonSerializer _valueSerializer>
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:aload_0         
	//   23   39:getfield        #31  <Field TypeSerializer _typeSerializer>
	//   24   42:invokevirtual   #114 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   25   45:return          
		}
	}

	public void serializeAsOmittedField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(!jsongenerator.canOmitFields())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #124 <Method boolean JsonGenerator.canOmitFields()>
	//*   2    4:ifne            15
			jsongenerator.writeOmittedField(getName());
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #67  <Method String getName()>
	//    6   12:invokevirtual   #127 <Method void JsonGenerator.writeOmittedField(String)>
	//    7   15:return          
	}

	public void serializeAsPlaceholder(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		jsongenerator.writeNull();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #132 <Method void JsonGenerator.writeNull()>
	//    2    4:return          
	}

	private static final long serialVersionUID = 1L;
	protected Object _key;
	protected JsonSerializer _keySerializer;
	protected final BeanProperty _property;
	protected final TypeSerializer _typeSerializer;
	protected JsonSerializer _valueSerializer;
}
