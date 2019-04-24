// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

public abstract class ArraySerializerBase extends ContainerSerializer
	implements ContextualSerializer
{

	protected ArraySerializerBase(ArraySerializerBase arrayserializerbase)
	{
		super(arrayserializerbase._handledType, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #17  <Field Class _handledType>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #20  <Method void ContainerSerializer(Class, boolean)>
		_property = arrayserializerbase._property;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #22  <Field BeanProperty _property>
	//    8   14:putfield        #22  <Field BeanProperty _property>
		_unwrapSingle = arrayserializerbase._unwrapSingle;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #24  <Field Boolean _unwrapSingle>
	//   12   22:putfield        #24  <Field Boolean _unwrapSingle>
	//   13   25:return          
	}

	protected ArraySerializerBase(ArraySerializerBase arrayserializerbase, BeanProperty beanproperty)
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
		_unwrapSingle = arrayserializerbase._unwrapSingle;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #24  <Field Boolean _unwrapSingle>
	//   11   19:putfield        #24  <Field Boolean _unwrapSingle>
	//   12   22:return          
	}

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
	//    2    2:invokespecial   #36  <Method void ContainerSerializer(Class)>
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

	protected ArraySerializerBase(Class class1, BeanProperty beanproperty)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void ContainerSerializer(Class)>
		_property = beanproperty;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field BeanProperty _property>
		_unwrapSingle = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #24  <Field Boolean _unwrapSingle>
	//    9   15:return          
	}

	public abstract JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1);

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(beanproperty != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          52
		{
			serializerprovider = ((SerializerProvider) (beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), _handledType)));
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #51  <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field Class _handledType>
	//    9   15:invokeinterface #57  <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//   10   20:astore_1        
			obj = ((Object) (this));
	//   11   21:aload_0         
	//   12   22:astore_3        
			if(serializerprovider != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          52
			{
				serializerprovider = ((SerializerProvider) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)));
	//   15   27:aload_1         
	//   16   28:getstatic       #63  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   17   31:invokevirtual   #69  <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   18   34:astore_1        
				obj = ((Object) (this));
	//   19   35:aload_0         
	//   20   36:astore_3        
				if(serializerprovider != _unwrapSingle)
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #24  <Field Boolean _unwrapSingle>
	//*  24   42:if_acmpeq       52
					obj = ((Object) (_withResolved(beanproperty, ((Boolean) (serializerprovider)))));
	//   25   45:aload_0         
	//   26   46:aload_2         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #71  <Method JsonSerializer _withResolved(BeanProperty, Boolean)>
	//   29   51:astore_3        
			}
		}
		return ((JsonSerializer) (obj));
	//   30   52:aload_3         
	//   31   53:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if((_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE) && hasSingleElement(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Boolean _unwrapSingle>
	//*   2    4:ifnonnull       17
	//*   3    7:aload_3         
	//*   4    8:getstatic       #82  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   5   11:invokevirtual   #86  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #24  <Field Boolean _unwrapSingle>
	//*   9   21:getstatic       #91  <Field Boolean Boolean.TRUE>
	//*  10   24:if_acmpne       43
	//*  11   27:aload_0         
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #95  <Method boolean hasSingleElement(Object)>
	//*  14   32:ifeq            43
		{
			serializeContents(obj, jsongenerator, serializerprovider);
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:aload_2         
	//   18   38:aload_3         
	//   19   39:invokevirtual   #98  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			return;
	//   20   42:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #104 <Method void JsonGenerator.writeStartArray()>
			jsongenerator.setCurrentValue(obj);
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #108 <Method void JsonGenerator.setCurrentValue(Object)>
			serializeContents(obj, jsongenerator, serializerprovider);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:aload_3         
	//   30   56:invokevirtual   #98  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   59:aload_2         
	//   32   60:invokevirtual   #111 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   63:return          
		}
	}

	protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForArray(obj, jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #120 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
		jsongenerator.setCurrentValue(obj);
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #108 <Method void JsonGenerator.setCurrentValue(Object)>
		serializeContents(obj, jsongenerator, serializerprovider);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:aload_3         
	//   11   16:invokevirtual   #98  <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
	//   12   19:aload           4
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #123 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//   16   26:return          
	}

	protected final BeanProperty _property;
	protected final Boolean _unwrapSingle;
}
