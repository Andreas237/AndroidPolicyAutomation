// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;

public class IteratorSerializer extends AsArraySerializerBase
{

	public IteratorSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer)
	{
		super(java/util/Iterator, javatype, flag, typeserializer, ((JsonSerializer) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class Iterator>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:aconst_null     
	//    6    7:invokespecial   #13  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   10:return          
	}

	public IteratorSerializer(IteratorSerializer iteratorserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((AsArraySerializerBase) (iteratorserializer)), beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #18  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:return          
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new IteratorSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class IteratorSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #34  <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #36  <Method void IteratorSerializer(IteratorSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Iterator)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterator>
	//    3    5:invokevirtual   #42  <Method boolean hasSingleElement(Iterator)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Iterator iterator)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Iterator)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #10  <Class Iterator>
	//    4    6:invokevirtual   #48  <Method boolean isEmpty(SerializerProvider, Iterator)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Iterator iterator)
	{
		return iterator == null || !iterator.hasNext();
	//    0    0:aload_2         
	//    1    1:ifnull          13
	//    2    4:aload_2         
	//    3    5:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Iterator)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterator>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #60  <Method void serialize(Iterator, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if((_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE) && hasSingleElement(iterator))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Boolean _unwrapSingle>
	//*   2    4:ifnonnull       17
	//*   3    7:aload_3         
	//*   4    8:getstatic       #67  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   5   11:invokevirtual   #73  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #34  <Field Boolean _unwrapSingle>
	//*   9   21:getstatic       #78  <Field Boolean Boolean.TRUE>
	//*  10   24:if_acmpne       43
	//*  11   27:aload_0         
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #42  <Method boolean hasSingleElement(Iterator)>
	//*  14   32:ifeq            43
		{
			serializeContents(iterator, jsongenerator, serializerprovider);
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:aload_2         
	//   18   38:aload_3         
	//   19   39:invokevirtual   #81  <Method void serializeContents(Iterator, JsonGenerator, SerializerProvider)>
			return;
	//   20   42:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #87  <Method void JsonGenerator.writeStartArray()>
			serializeContents(iterator, jsongenerator, serializerprovider);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:invokevirtual   #81  <Method void serializeContents(Iterator, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   28   54:aload_2         
	//   29   55:invokevirtual   #90  <Method void JsonGenerator.writeEndArray()>
			return;
	//   30   58:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((Iterator)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterator>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #81  <Method void serializeContents(Iterator, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(iterator.hasNext())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   2    6:ifeq            48
		{
			TypeSerializer typeserializer = _valueTypeSerializer;
	//    3    9:aload_0         
	//    4   10:getfield        #95  <Field TypeSerializer _valueTypeSerializer>
	//    5   13:astore          10
			JsonSerializer jsonserializer = null;
	//    6   15:aconst_null     
	//    7   16:astore          4
			Class class1 = null;
	//    8   18:aconst_null     
	//    9   19:astore          5
			do
			{
				Object obj = iterator.next();
	//   10   21:aload_1         
	//   11   22:invokeinterface #99  <Method Object Iterator.next()>
	//   12   27:astore          11
				if(obj == null)
	//*  13   29:aload           11
	//*  14   31:ifnonnull       49
				{
					serializerprovider.defaultSerializeNull(jsongenerator);
	//   15   34:aload_3         
	//   16   35:aload_2         
	//   17   36:invokevirtual   #103 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				} else
	//*  18   39:aload_1         
	//*  19   40:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  20   45:ifne            21
	//*  21   48:return          
				{
					JsonSerializer jsonserializer3 = _elementSerializer;
	//   22   49:aload_0         
	//   23   50:getfield        #30  <Field JsonSerializer _elementSerializer>
	//   24   53:astore          9
					JsonSerializer jsonserializer1 = jsonserializer3;
	//   25   55:aload           9
	//   26   57:astore          6
					Class class2 = class1;
	//   27   59:aload           5
	//   28   61:astore          7
					JsonSerializer jsonserializer2 = jsonserializer;
	//   29   63:aload           4
	//   30   65:astore          8
					if(jsonserializer3 == null)
	//*  31   67:aload           9
	//*  32   69:ifnonnull       98
					{
						class2 = obj.getClass();
	//   33   72:aload           11
	//   34   74:invokevirtual   #109 <Method Class Object.getClass()>
	//   35   77:astore          7
						if(class2 == class1)
	//*  36   79:aload           7
	//*  37   81:aload           5
	//*  38   83:if_acmpne       123
						{
							jsonserializer1 = jsonserializer;
	//   39   86:aload           4
	//   40   88:astore          6
							jsonserializer2 = jsonserializer;
	//   41   90:aload           4
	//   42   92:astore          8
							class2 = class1;
	//   43   94:aload           5
	//   44   96:astore          7
						} else
	//*  45   98:aload           10
	//*  46  100:ifnonnull       142
	//*  47  103:aload           6
	//*  48  105:aload           11
	//*  49  107:aload_2         
	//*  50  108:aload_3         
	//*  51  109:invokevirtual   #113 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  52  112:aload           7
	//*  53  114:astore          5
	//*  54  116:aload           8
	//*  55  118:astore          4
	//*  56  120:goto            39
						{
							jsonserializer1 = serializerprovider.findValueSerializer(class2, _property);
	//   57  123:aload_3         
	//   58  124:aload           7
	//   59  126:aload_0         
	//   60  127:getfield        #26  <Field BeanProperty _property>
	//   61  130:invokevirtual   #117 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   62  133:astore          6
							jsonserializer2 = jsonserializer1;
	//   63  135:aload           6
	//   64  137:astore          8
						}
					}
					if(typeserializer == null)
					{
						jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
						class1 = class2;
						jsonserializer = jsonserializer2;
					} else
	//*  65  139:goto            98
					{
						jsonserializer1.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//   66  142:aload           6
	//   67  144:aload           11
	//   68  146:aload_2         
	//   69  147:aload_3         
	//   70  148:aload           10
	//   71  150:invokevirtual   #121 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
						class1 = class2;
	//   72  153:aload           7
	//   73  155:astore          5
						jsonserializer = jsonserializer2;
	//   74  157:aload           8
	//   75  159:astore          4
					}
				}
			} while(iterator.hasNext());
		}
	//*  76  161:goto            39
	}

	public IteratorSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return new IteratorSerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:new             #2   <Class IteratorSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #36  <Method void IteratorSerializer(IteratorSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:areturn         
	}

	public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((AsArraySerializerBase) (withResolved(beanproperty, typeserializer, jsonserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #127 <Method IteratorSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}
}
