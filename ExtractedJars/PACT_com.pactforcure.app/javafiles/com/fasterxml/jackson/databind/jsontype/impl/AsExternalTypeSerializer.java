// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeSerializerBase

public class AsExternalTypeSerializer extends TypeSerializerBase
{

	public AsExternalTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void TypeSerializerBase(TypeIdResolver, BeanProperty)>
		_typePropertyName = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #13  <Field String _typePropertyName>
	//    7   11:return          
	}

	protected final void _writeArrayPrefix(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeStartArray();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method void JsonGenerator.writeStartArray()>
	//    2    4:return          
	}

	protected final void _writeArraySuffix(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		jsongenerator.writeEndArray();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method void JsonGenerator.writeEndArray()>
		if(s != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          17
			jsongenerator.writeStringField(_typePropertyName, s);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field String _typePropertyName>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #34  <Method void JsonGenerator.writeStringField(String, String)>
	//    9   17:return          
	}

	protected final void _writeObjectPrefix(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeStartObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #38  <Method void JsonGenerator.writeStartObject()>
	//    2    4:return          
	}

	protected final void _writeObjectSuffix(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		jsongenerator.writeEndObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #42  <Method void JsonGenerator.writeEndObject()>
		if(s != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          17
			jsongenerator.writeStringField(_typePropertyName, s);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field String _typePropertyName>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #34  <Method void JsonGenerator.writeStringField(String, String)>
	//    9   17:return          
	}

	protected final void _writeScalarPrefix(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
	//    0    0:return          
	}

	protected final void _writeScalarSuffix(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(s != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          13
			jsongenerator.writeStringField(_typePropertyName, s);
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field String _typePropertyName>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #34  <Method void JsonGenerator.writeStringField(String, String)>
	//    7   13:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method AsExternalTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsExternalTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsExternalTypeSerializer(_idResolver, beanproperty, _typePropertyName);
	//    6   10:new             #2   <Class AsExternalTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field String _typePropertyName>
	//   13   23:invokespecial   #59  <Method void AsExternalTypeSerializer(TypeIdResolver, BeanProperty, String)>
	//   14   26:areturn         
	}

	public String getPropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
	//    0    0:getstatic       #69  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//    1    3:areturn         
	}

	public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeArrayPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #72  <Method void _writeArrayPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeObjectPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #75  <Method void _writeObjectPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeScalarPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method void _writeScalarPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeArraySuffix(obj, jsongenerator, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #81  <Method void _writeArraySuffix(Object, JsonGenerator, String)>
	//    5    7:return          
	}

	public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeObjectSuffix(obj, jsongenerator, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #84  <Method void _writeObjectSuffix(Object, JsonGenerator, String)>
	//    5    7:return          
	}

	public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		_writeScalarSuffix(obj, jsongenerator, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #87  <Method void _writeScalarSuffix(Object, JsonGenerator, String)>
	//    5    7:return          
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeArrayPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #72  <Method void _writeArrayPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		_writeArrayPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #72  <Method void _writeArrayPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeObjectPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #75  <Method void _writeObjectPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		_writeObjectPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #75  <Method void _writeObjectPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeScalarPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method void _writeScalarPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		_writeScalarPrefix(obj, jsongenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method void _writeScalarPrefix(Object, JsonGenerator)>
	//    4    6:return          
	}

	public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeArraySuffix(obj, jsongenerator, idFromValue(obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #98  <Method String idFromValue(Object)>
	//    6    8:invokevirtual   #81  <Method void _writeArraySuffix(Object, JsonGenerator, String)>
	//    7   11:return          
	}

	public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeObjectSuffix(obj, jsongenerator, idFromValue(obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #98  <Method String idFromValue(Object)>
	//    6    8:invokevirtual   #84  <Method void _writeObjectSuffix(Object, JsonGenerator, String)>
	//    7   11:return          
	}

	public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		_writeScalarSuffix(obj, jsongenerator, idFromValue(obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #98  <Method String idFromValue(Object)>
	//    6    8:invokevirtual   #87  <Method void _writeScalarSuffix(Object, JsonGenerator, String)>
	//    7   11:return          
	}

	protected final String _typePropertyName;
}
