// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

public abstract class ArraySerializerBase extends ContainerSerializer
	implements ContextualSerializer
{

	protected ArraySerializerBase(ArraySerializerBase arrayserializerbase, BeanProperty beanproperty, Boolean boolean1)
	{
		super(arrayserializerbase._handledType, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #17  <Field Class _handledType>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #20  <Method void ContainerSerializer(Class, boolean)>
		_property = beanproperty;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field BeanProperty _property>
		_unwrapSingle = boolean1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Boolean _unwrapSingle>
	//   11   19:return          
	}

	protected ArraySerializerBase(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ContainerSerializer(Class)>
		_property = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field BeanProperty _property>
		_unwrapSingle = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #24  <Field Boolean _unwrapSingle>
	//    9   15:return          
	}

	protected final boolean _shouldUnwrapSingle(SerializerProvider serializerprovider)
	{
		Boolean boolean1 = _unwrapSingle;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Boolean _unwrapSingle>
	//    2    4:astore_2        
		if(boolean1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       17
			return serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	//    5    9:aload_1         
	//    6   10:getstatic       #39  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//    7   13:invokevirtual   #45  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//    8   16:ireturn         
		else
			return boolean1.booleanValue();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #51  <Method boolean Boolean.booleanValue()>
	//   11   21:ireturn         
	}

	public abstract JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1);

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          42
		{
			serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #61  <Method Class handledType()>
	//    7   11:invokevirtual   #65  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    8   14:astore_1        
			if(serializerprovider != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          42
			{
				serializerprovider = ((SerializerProvider) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)));
	//   11   19:aload_1         
	//   12   20:getstatic       #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   13   23:invokevirtual   #76  <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   14   26:astore_1        
				if(serializerprovider != _unwrapSingle)
	//*  15   27:aload_1         
	//*  16   28:aload_0         
	//*  17   29:getfield        #24  <Field Boolean _unwrapSingle>
	//*  18   32:if_acmpeq       42
					return _withResolved(beanproperty, ((Boolean) (serializerprovider)));
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #78  <Method JsonSerializer _withResolved(BeanProperty, Boolean)>
	//   23   41:areturn         
			}
		}
		return ((JsonSerializer) (this));
	//   24   42:aload_0         
	//   25   43:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_shouldUnwrapSingle(serializerprovider) && hasSingleElement(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #86  <Method boolean _shouldUnwrapSingle(SerializerProvider)>
	//*   3    5:ifeq            24
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #90  <Method boolean hasSingleElement(Object)>
	//*   7   13:ifeq            24
		{
			serializeContents(obj, jsongenerator, serializerprovider);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #93  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			return;
	//   13   23:return          
		} else
		{
			jsongenerator.setCurrentValue(obj);
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #99  <Method void JsonGenerator.setCurrentValue(Object)>
			jsongenerator.writeStartArray();
	//   17   29:aload_2         
	//   18   30:invokevirtual   #103 <Method void JsonGenerator.writeStartArray()>
			serializeContents(obj, jsongenerator, serializerprovider);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #93  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   24   40:aload_2         
	//   25   41:invokevirtual   #106 <Method void JsonGenerator.writeEndArray()>
			return;
	//   26   44:return          
		}
	}

	protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.setCurrentValue(obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #99  <Method void JsonGenerator.setCurrentValue(Object)>
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(obj, JsonToken.START_ARRAY));
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:getstatic       #115 <Field JsonToken JsonToken.START_ARRAY>
	//    8   14:invokevirtual   #121 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:invokevirtual   #125 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   10   20:astore          5
		serializeContents(obj, jsongenerator, serializerprovider);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #93  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   16   29:aload           4
	//   17   31:aload_2         
	//   18   32:aload           5
	//   19   34:invokevirtual   #128 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   20   37:pop             
	//   21   38:return          
	}

	protected final BeanProperty _property;
	protected final Boolean _unwrapSingle;
}
