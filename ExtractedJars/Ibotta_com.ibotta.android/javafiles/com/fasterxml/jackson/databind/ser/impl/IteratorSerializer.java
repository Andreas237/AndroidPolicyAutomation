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

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

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

	protected void _serializeDynamicContents(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		JsonSerializer jsonserializer = _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field JsonSerializer _elementSerializer>
	//    2    4:astore          6
		TypeSerializer typeserializer = _valueTypeSerializer;
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    5   10:astore          8
		PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field PropertySerializerMap _dynamicSerializers>
	//    8   16:astore          4
		do
		{
			Object obj = iterator.next();
	//    9   18:aload_1         
	//   10   19:invokeinterface #40  <Method Object Iterator.next()>
	//   11   24:astore          9
			if(obj == null)
	//*  12   26:aload           9
	//*  13   28:ifnonnull       39
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   14   31:aload_3         
	//   15   32:aload_2         
	//   16   33:invokevirtual   #46  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			} else
	//*  17   36:goto            160
			{
				Class class1 = obj.getClass();
	//   18   39:aload           9
	//   19   41:invokevirtual   #52  <Method Class Object.getClass()>
	//   20   44:astore          10
				propertyserializermap.serializerFor(class1);
	//   21   46:aload           4
	//   22   48:aload           10
	//   23   50:invokevirtual   #58  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   24   53:pop             
				JsonSerializer jsonserializer1 = jsonserializer;
	//   25   54:aload           6
	//   26   56:astore          7
				PropertySerializerMap propertyserializermap1 = propertyserializermap;
	//   27   58:aload           4
	//   28   60:astore          5
				if(jsonserializer == null)
	//*  29   62:aload           6
	//*  30   64:ifnonnull       116
				{
					if(_elementType.hasGenericTypes())
	//*  31   67:aload_0         
	//*  32   68:getfield        #62  <Field JavaType _elementType>
	//*  33   71:invokevirtual   #68  <Method boolean JavaType.hasGenericTypes()>
	//*  34   74:ifeq            99
						jsonserializer1 = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
	//   35   77:aload_0         
	//   36   78:aload           4
	//   37   80:aload_3         
	//   38   81:aload_0         
	//   39   82:getfield        #62  <Field JavaType _elementType>
	//   40   85:aload           10
	//   41   87:invokevirtual   #72  <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   42   90:aload_3         
	//   43   91:invokevirtual   #76  <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//   44   94:astore          7
					else
	//*  45   96:goto            110
						jsonserializer1 = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   46   99:aload_0         
	//   47  100:aload           4
	//   48  102:aload           10
	//   49  104:aload_3         
	//   50  105:invokevirtual   #79  <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   51  108:astore          7
					propertyserializermap1 = _dynamicSerializers;
	//   52  110:aload_0         
	//   53  111:getfield        #36  <Field PropertySerializerMap _dynamicSerializers>
	//   54  114:astore          5
				}
				if(typeserializer == null)
	//*  55  116:aload           8
	//*  56  118:ifnonnull       141
				{
					jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
	//   57  121:aload           7
	//   58  123:aload           9
	//   59  125:aload_2         
	//   60  126:aload_3         
	//   61  127:invokevirtual   #85  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
					jsonserializer = jsonserializer1;
	//   62  130:aload           7
	//   63  132:astore          6
					propertyserializermap = propertyserializermap1;
	//   64  134:aload           5
	//   65  136:astore          4
				} else
	//*  66  138:goto            160
				{
					jsonserializer1.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//   67  141:aload           7
	//   68  143:aload           9
	//   69  145:aload_2         
	//   70  146:aload_3         
	//   71  147:aload           8
	//   72  149:invokevirtual   #89  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
					propertyserializermap = propertyserializermap1;
	//   73  152:aload           5
	//   74  154:astore          4
					jsonserializer = jsonserializer1;
	//   75  156:aload           7
	//   76  158:astore          6
				}
			}
		} while(iterator.hasNext());
	//   77  160:aload_1         
	//   78  161:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   79  166:ifne            18
	//   80  169:return          
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new IteratorSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class IteratorSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #106 <Method void IteratorSerializer(IteratorSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Iterator)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterator>
	//    3    5:invokevirtual   #112 <Method boolean hasSingleElement(Iterator)>
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
	//    4    6:invokevirtual   #118 <Method boolean isEmpty(SerializerProvider, Iterator)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Iterator iterator)
	{
		return iterator.hasNext() ^ true;
	//    0    0:aload_2         
	//    1    1:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//    2    6:iconst_1        
	//    3    7:ixor            
	//    4    8:ireturn         
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
	//    5    7:invokevirtual   #121 <Method void serialize(Iterator, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeStartArray();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #127 <Method void JsonGenerator.writeStartArray()>
		serializeContents(iterator, jsongenerator, serializerprovider);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #130 <Method void serializeContents(Iterator, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndArray();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #133 <Method void JsonGenerator.writeEndArray()>
	//    9   15:return          
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
	//    5    7:invokevirtual   #130 <Method void serializeContents(Iterator, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(!iterator.hasNext())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*   2    6:ifne            10
			return;
	//    3    9:return          
		JsonSerializer jsonserializer = _elementSerializer;
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field JsonSerializer _elementSerializer>
	//    6   14:astore          4
		if(jsonserializer == null)
	//*   7   16:aload           4
	//*   8   18:ifnonnull       29
		{
			_serializeDynamicContents(iterator, jsongenerator, serializerprovider);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokevirtual   #135 <Method void _serializeDynamicContents(Iterator, JsonGenerator, SerializerProvider)>
			return;
	//   14   28:return          
		}
		TypeSerializer typeserializer = _valueTypeSerializer;
	//   15   29:aload_0         
	//   16   30:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//   17   33:astore          5
		do
		{
			Object obj = iterator.next();
	//   18   35:aload_1         
	//   19   36:invokeinterface #40  <Method Object Iterator.next()>
	//   20   41:astore          6
			if(obj == null)
	//*  21   43:aload           6
	//*  22   45:ifnonnull       56
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   23   48:aload_3         
	//   24   49:aload_2         
	//   25   50:invokevirtual   #46  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			else
	//*  26   53:goto            84
			if(typeserializer == null)
	//*  27   56:aload           5
	//*  28   58:ifnonnull       73
				jsonserializer.serialize(obj, jsongenerator, serializerprovider);
	//   29   61:aload           4
	//   30   63:aload           6
	//   31   65:aload_2         
	//   32   66:aload_3         
	//   33   67:invokevirtual   #85  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			else
	//*  34   70:goto            84
				jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//   35   73:aload           4
	//   36   75:aload           6
	//   37   77:aload_2         
	//   38   78:aload_3         
	//   39   79:aload           5
	//   40   81:invokevirtual   #89  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		} while(iterator.hasNext());
	//   41   84:aload_1         
	//   42   85:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   43   90:ifne            35
	//   44   93:return          
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
	//    7   10:invokespecial   #106 <Method void IteratorSerializer(IteratorSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
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
	//    5    6:invokevirtual   #141 <Method IteratorSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}
}
