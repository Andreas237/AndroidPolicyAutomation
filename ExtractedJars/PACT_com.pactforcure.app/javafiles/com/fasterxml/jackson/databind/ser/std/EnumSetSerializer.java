// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			AsArraySerializerBase

public class EnumSetSerializer extends AsArraySerializerBase
{

	public EnumSetSerializer(JavaType javatype)
	{
		super(java/util/EnumSet, javatype, true, ((TypeSerializer) (null)), ((JsonSerializer) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class EnumSet>
	//    2    3:aload_1         
	//    3    4:iconst_1        
	//    4    5:aconst_null     
	//    5    6:aconst_null     
	//    6    7:invokespecial   #12  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   10:return          
	}

	public EnumSetSerializer(JavaType javatype, BeanProperty beanproperty)
	{
		this(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void EnumSetSerializer(JavaType)>
	//    3    5:return          
	}

	public EnumSetSerializer(EnumSetSerializer enumsetserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((AsArraySerializerBase) (enumsetserializer)), beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #22  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:return          
	}

	public volatile ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (_withValueTypeSerializer(typeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method EnumSetSerializer _withValueTypeSerializer(TypeSerializer)>
	//    3    5:areturn         
	}

	public EnumSetSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((EnumSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class EnumSet>
	//    3    5:invokevirtual   #34  <Method boolean hasSingleElement(EnumSet)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(EnumSet enumset)
	{
		return enumset.size() == 1;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int EnumSet.size()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (EnumSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #9   <Class EnumSet>
	//    4    6:invokevirtual   #44  <Method boolean isEmpty(SerializerProvider, EnumSet)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, EnumSet enumset)
	{
		return enumset == null || enumset.isEmpty();
	//    0    0:aload_2         
	//    1    1:ifnull          11
	//    2    4:aload_2         
	//    3    5:invokevirtual   #47  <Method boolean EnumSet.isEmpty()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((EnumSet)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class EnumSet>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #55  <Method void serialize(EnumSet, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(EnumSet enumset, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = enumset.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int EnumSet.size()>
	//    2    4:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    6:iload           4
	//*   4    8:iconst_1        
	//*   5    9:icmpne          47
	//*   6   12:aload_0         
	//*   7   13:getfield        #60  <Field Boolean _unwrapSingle>
	//*   8   16:ifnonnull       29
	//*   9   19:aload_3         
	//*  10   20:getstatic       #66  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   23:invokevirtual   #72  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   26:ifne            39
	//*  13   29:aload_0         
	//*  14   30:getfield        #60  <Field Boolean _unwrapSingle>
	//*  15   33:getstatic       #77  <Field Boolean Boolean.TRUE>
	//*  16   36:if_acmpne       47
		{
			serializeContents(enumset, jsongenerator, serializerprovider);
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:aload_3         
	//   21   43:invokevirtual   #80  <Method void serializeContents(EnumSet, JsonGenerator, SerializerProvider)>
			return;
	//   22   46:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   47:aload_2         
	//   24   48:iload           4
	//   25   50:invokevirtual   #86  <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(enumset, jsongenerator, serializerprovider);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:aload_2         
	//   29   56:aload_3         
	//   30   57:invokevirtual   #80  <Method void serializeContents(EnumSet, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   60:aload_2         
	//   32   61:invokevirtual   #90  <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   64:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((EnumSet)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class EnumSet>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #80  <Method void serializeContents(EnumSet, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(EnumSet enumset, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj = ((Object) (_elementSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field JsonSerializer _elementSerializer>
	//    2    4:astore          4
		Iterator iterator = enumset.iterator();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #99  <Method Iterator EnumSet.iterator()>
	//    5   10:astore          5
		for(enumset = ((EnumSet) (obj)); iterator.hasNext(); enumset = ((EnumSet) (obj)))
	//*   6   12:aload           4
	//*   7   14:astore_1        
	//*   8   15:aload           5
	//*   9   17:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            74
		{
			Enum enum = (Enum)iterator.next();
	//   11   25:aload           5
	//   12   27:invokeinterface #108 <Method Object Iterator.next()>
	//   13   32:checkcast       #110 <Class Enum>
	//   14   35:astore          6
			obj = ((Object) (enumset));
	//   15   37:aload_1         
	//   16   38:astore          4
			if(enumset == null)
	//*  17   40:aload_1         
	//*  18   41:ifnonnull       59
				obj = ((Object) (serializerprovider.findValueSerializer(enum.getDeclaringClass(), _property)));
	//   19   44:aload_3         
	//   20   45:aload           6
	//   21   47:invokevirtual   #114 <Method Class Enum.getDeclaringClass()>
	//   22   50:aload_0         
	//   23   51:getfield        #118 <Field BeanProperty _property>
	//   24   54:invokevirtual   #122 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   25   57:astore          4
			((JsonSerializer) (obj)).serialize(((Object) (enum)), jsongenerator, serializerprovider);
	//   26   59:aload           4
	//   27   61:aload           6
	//   28   63:aload_2         
	//   29   64:aload_3         
	//   30   65:invokevirtual   #126 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		}

	//   31   68:aload           4
	//   32   70:astore_1        
	//*  33   71:goto            15
	//   34   74:return          
	}

	public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((AsArraySerializerBase) (withResolved(beanproperty, typeserializer, jsonserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #131 <Method EnumSetSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}

	public EnumSetSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return new EnumSetSerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:new             #2   <Class EnumSetSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #133 <Method void EnumSetSerializer(EnumSetSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:areturn         
	}
}
