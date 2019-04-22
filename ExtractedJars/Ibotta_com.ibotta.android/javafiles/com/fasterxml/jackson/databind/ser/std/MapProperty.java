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
import java.io.IOException;
import java.lang.annotation.Annotation;

public class MapProperty extends PropertyWriter
{

	public MapProperty(TypeSerializer typeserializer, BeanProperty beanproperty)
	{
		PropertyMetadata propertymetadata;
		if(beanproperty == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       11
			propertymetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//    2    4:getstatic       #37  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    3    7:astore_3        
		else
	//*   4    8:goto            18
			propertymetadata = beanproperty.getMetadata();
	//    5   11:aload_2         
	//    6   12:invokeinterface #43  <Method PropertyMetadata BeanProperty.getMetadata()>
	//    7   17:astore_3        
		super(propertymetadata);
	//    8   18:aload_0         
	//    9   19:aload_3         
	//   10   20:invokespecial   #46  <Method void PropertyWriter(PropertyMetadata)>
		_typeSerializer = typeserializer;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #48  <Field TypeSerializer _typeSerializer>
		typeserializer = ((TypeSerializer) (beanproperty));
	//   14   28:aload_2         
	//   15   29:astore_1        
		if(beanproperty == null)
	//*  16   30:aload_2         
	//*  17   31:ifnonnull       38
			typeserializer = ((TypeSerializer) (BOGUS_PROP));
	//   18   34:getstatic       #29  <Field BeanProperty BOGUS_PROP>
	//   19   37:astore_1        
		_property = ((BeanProperty) (typeserializer));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #50  <Field BeanProperty _property>
	//   23   43:return          
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		_property.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #56  <Method void BeanProperty.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    5   11:return          
	}

	public void depositSchemaProperty(ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
	//    0    0:return          
	}

	public Annotation getAnnotation(Class class1)
	{
		return _property.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method Annotation BeanProperty.getAnnotation(Class)>
	//    4   10:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		return _property.getContextAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:aload_1         
	//    3    5:invokeinterface #69  <Method Annotation BeanProperty.getContextAnnotation(Class)>
	//    4   10:areturn         
	}

	public PropertyName getFullName()
	{
		return new PropertyName(getName());
	//    0    0:new             #73  <Class PropertyName>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #77  <Method String getName()>
	//    4    8:invokespecial   #80  <Method void PropertyName(String)>
	//    5   11:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _property.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:invokeinterface #84  <Method AnnotatedMember BeanProperty.getMember()>
	//    3    9:areturn         
	}

	public String getName()
	{
		Object obj = _key;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Object _key>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #88  <Class String>
	//*   5    9:ifeq            17
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #88  <Class String>
	//    8   16:areturn         
		else
			return String.valueOf(obj);
	//    9   17:aload_1         
	//   10   18:invokestatic    #92  <Method String String.valueOf(Object)>
	//   11   21:areturn         
	}

	public JavaType getType()
	{
		return _property.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:invokeinterface #96  <Method JavaType BeanProperty.getType()>
	//    3    9:areturn         
	}

	public PropertyName getWrapperName()
	{
		return _property.getWrapperName();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field BeanProperty _property>
	//    2    4:invokeinterface #99  <Method PropertyName BeanProperty.getWrapperName()>
	//    3    9:areturn         
	}

	public void reset(Object obj, Object obj1, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		_key = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field Object _key>
		_value = obj1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #103 <Field Object _value>
		_keySerializer = jsonserializer;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #105 <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #107 <Field JsonSerializer _valueSerializer>
	//   12   21:return          
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		obj = ((Object) (_typeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field TypeSerializer _typeSerializer>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       23
		{
			_valueSerializer.serialize(_value, jsongenerator, serializerprovider);
	//    5    9:aload_0         
	//    6   10:getfield        #107 <Field JsonSerializer _valueSerializer>
	//    7   13:aload_0         
	//    8   14:getfield        #103 <Field Object _value>
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #117 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   12   22:return          
		} else
		{
			_valueSerializer.serializeWithType(_value, jsongenerator, serializerprovider, ((TypeSerializer) (obj)));
	//   13   23:aload_0         
	//   14   24:getfield        #107 <Field JsonSerializer _valueSerializer>
	//   15   27:aload_0         
	//   16   28:getfield        #103 <Field Object _value>
	//   17   31:aload_2         
	//   18   32:aload_3         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #121 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   21   37:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		_keySerializer.serialize(_key, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field JsonSerializer _keySerializer>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field Object _key>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #117 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		obj = ((Object) (_typeSerializer));
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field TypeSerializer _typeSerializer>
	//    9   17:astore_1        
		if(obj == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       36
		{
			_valueSerializer.serialize(_value, jsongenerator, serializerprovider);
	//   12   22:aload_0         
	//   13   23:getfield        #107 <Field JsonSerializer _valueSerializer>
	//   14   26:aload_0         
	//   15   27:getfield        #103 <Field Object _value>
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #117 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   19   35:return          
		} else
		{
			_valueSerializer.serializeWithType(_value, jsongenerator, serializerprovider, ((TypeSerializer) (obj)));
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field JsonSerializer _valueSerializer>
	//   22   40:aload_0         
	//   23   41:getfield        #103 <Field Object _value>
	//   24   44:aload_2         
	//   25   45:aload_3         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #121 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   28   50:return          
		}
	}

	public void serializeAsOmittedField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(!jsongenerator.canOmitFields())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #131 <Method boolean JsonGenerator.canOmitFields()>
	//*   2    4:ifne            15
			jsongenerator.writeOmittedField(getName());
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #77  <Method String getName()>
	//    6   12:invokevirtual   #134 <Method void JsonGenerator.writeOmittedField(String)>
	//    7   15:return          
	}

	private static final BeanProperty BOGUS_PROP = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
	private static final long serialVersionUID = 1L;
	protected Object _key;
	protected JsonSerializer _keySerializer;
	protected final BeanProperty _property;
	protected final TypeSerializer _typeSerializer;
	protected Object _value;
	protected JsonSerializer _valueSerializer;

	static 
	{
	//    0    0:new             #24  <Class com.fasterxml.jackson.databind.BeanProperty$Bogus>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void com.fasterxml.jackson.databind.BeanProperty$Bogus()>
	//    3    7:putstatic       #29  <Field BeanProperty BOGUS_PROP>
	//*   4   10:return          
	}
}
