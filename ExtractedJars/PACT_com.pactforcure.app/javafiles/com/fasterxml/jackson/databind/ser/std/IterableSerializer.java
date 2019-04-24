// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			AsArraySerializerBase

public class IterableSerializer extends AsArraySerializerBase
{

	public IterableSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer)
	{
		super(java/lang/Iterable, javatype, flag, typeserializer, ((JsonSerializer) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class Iterable>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:aconst_null     
	//    6    7:invokespecial   #13  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   10:return          
	}

	public IterableSerializer(IterableSerializer iterableserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((AsArraySerializerBase) (iterableserializer)), beanproperty, typeserializer, jsonserializer, boolean1);
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
		return ((ContainerSerializer) (new IterableSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class IterableSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #34  <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #36  <Method void IterableSerializer(IterableSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public boolean hasSingleElement(Iterable iterable)
	{
		if(iterable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
		{
			iterable = ((Iterable) (iterable.iterator()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #43  <Method Iterator Iterable.iterator()>
	//    4   10:astore_1        
			if(((Iterator) (iterable)).hasNext())
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   7   17:ifeq            38
			{
				((Iterator) (iterable)).next();
	//    8   20:aload_1         
	//    9   21:invokeinterface #53  <Method Object Iterator.next()>
	//   10   26:pop             
				if(!((Iterator) (iterable)).hasNext())
	//*  11   27:aload_1         
	//*  12   28:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  13   33:ifne            38
					return true;
	//   14   36:iconst_1        
	//   15   37:ireturn         
			}
		}
		return false;
	//   16   38:iconst_0        
	//   17   39:ireturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Iterable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterable>
	//    3    5:invokevirtual   #57  <Method boolean hasSingleElement(Iterable)>
	//    4    8:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Iterable iterable)
	{
		return iterable == null || !iterable.iterator().hasNext();
	//    0    0:aload_2         
	//    1    1:ifnull          18
	//    2    4:aload_2         
	//    3    5:invokeinterface #43  <Method Iterator Iterable.iterator()>
	//    4   10:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    5   15:ifne            20
	//    6   18:iconst_1        
	//    7   19:ireturn         
	//    8   20:iconst_0        
	//    9   21:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Iterable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #10  <Class Iterable>
	//    4    6:invokevirtual   #63  <Method boolean isEmpty(SerializerProvider, Iterable)>
	//    5    9:ireturn         
	}

	public final void serialize(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if((_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE) && hasSingleElement(iterable))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Boolean _unwrapSingle>
	//*   2    4:ifnonnull       17
	//*   3    7:aload_3         
	//*   4    8:getstatic       #73  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   5   11:invokevirtual   #79  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #34  <Field Boolean _unwrapSingle>
	//*   9   21:getstatic       #84  <Field Boolean Boolean.TRUE>
	//*  10   24:if_acmpne       43
	//*  11   27:aload_0         
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #57  <Method boolean hasSingleElement(Iterable)>
	//*  14   32:ifeq            43
		{
			serializeContents(iterable, jsongenerator, serializerprovider);
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:aload_2         
	//   18   38:aload_3         
	//   19   39:invokevirtual   #87  <Method void serializeContents(Iterable, JsonGenerator, SerializerProvider)>
			return;
	//   20   42:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #93  <Method void JsonGenerator.writeStartArray()>
			serializeContents(iterable, jsongenerator, serializerprovider);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:invokevirtual   #87  <Method void serializeContents(Iterable, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   28   54:aload_2         
	//   29   55:invokevirtual   #96  <Method void JsonGenerator.writeEndArray()>
			return;
	//   30   58:return          
		}
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Iterable)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #101 <Method void serialize(Iterable, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Iterator iterator = iterable.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #43  <Method Iterator Iterable.iterator()>
	//    2    6:astore          9
		if(iterator.hasNext())
	//*   3    8:aload           9
	//*   4   10:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            58
		{
			TypeSerializer typeserializer = _valueTypeSerializer;
	//    6   18:aload_0         
	//    7   19:getfield        #105 <Field TypeSerializer _valueTypeSerializer>
	//    8   22:astore          10
			iterable = null;
	//    9   24:aconst_null     
	//   10   25:astore_1        
			Class class1 = null;
	//   11   26:aconst_null     
	//   12   27:astore          4
			do
			{
				Object obj2 = iterator.next();
	//   13   29:aload           9
	//   14   31:invokeinterface #53  <Method Object Iterator.next()>
	//   15   36:astore          11
				if(obj2 == null)
	//*  16   38:aload           11
	//*  17   40:ifnonnull       59
				{
					serializerprovider.defaultSerializeNull(jsongenerator);
	//   18   43:aload_3         
	//   19   44:aload_2         
	//   20   45:invokevirtual   #109 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				} else
	//*  21   48:aload           9
	//*  22   50:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  23   55:ifne            29
	//*  24   58:return          
				{
					JsonSerializer jsonserializer = _elementSerializer;
	//   25   59:aload_0         
	//   26   60:getfield        #30  <Field JsonSerializer _elementSerializer>
	//   27   63:astore          8
					Object obj = ((Object) (jsonserializer));
	//   28   65:aload           8
	//   29   67:astore          5
					Class class2 = class1;
	//   30   69:aload           4
	//   31   71:astore          6
					Object obj1 = ((Object) (iterable));
	//   32   73:aload_1         
	//   33   74:astore          7
					if(jsonserializer == null)
	//*  34   76:aload           8
	//*  35   78:ifnonnull       105
					{
						class2 = obj2.getClass();
	//   36   81:aload           11
	//   37   83:invokevirtual   #115 <Method Class Object.getClass()>
	//   38   86:astore          6
						if(class2 == class1)
	//*  39   88:aload           6
	//*  40   90:aload           4
	//*  41   92:if_acmpne       129
						{
							obj = ((Object) (iterable));
	//   42   95:aload_1         
	//   43   96:astore          5
							obj1 = ((Object) (iterable));
	//   44   98:aload_1         
	//   45   99:astore          7
							class2 = class1;
	//   46  101:aload           4
	//   47  103:astore          6
						} else
	//*  48  105:aload           10
	//*  49  107:ifnonnull       148
	//*  50  110:aload           5
	//*  51  112:aload           11
	//*  52  114:aload_2         
	//*  53  115:aload_3         
	//*  54  116:invokevirtual   #119 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  55  119:aload           6
	//*  56  121:astore          4
	//*  57  123:aload           7
	//*  58  125:astore_1        
	//*  59  126:goto            48
						{
							obj = ((Object) (serializerprovider.findValueSerializer(class2, _property)));
	//   60  129:aload_3         
	//   61  130:aload           6
	//   62  132:aload_0         
	//   63  133:getfield        #26  <Field BeanProperty _property>
	//   64  136:invokevirtual   #123 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   65  139:astore          5
							obj1 = obj;
	//   66  141:aload           5
	//   67  143:astore          7
						}
					}
					if(typeserializer == null)
					{
						((JsonSerializer) (obj)).serialize(obj2, jsongenerator, serializerprovider);
						class1 = class2;
						iterable = ((Iterable) (obj1));
					} else
	//*  68  145:goto            105
					{
						((JsonSerializer) (obj)).serializeWithType(obj2, jsongenerator, serializerprovider, typeserializer);
	//   69  148:aload           5
	//   70  150:aload           11
	//   71  152:aload_2         
	//   72  153:aload_3         
	//   73  154:aload           10
	//   74  156:invokevirtual   #127 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
						class1 = class2;
	//   75  159:aload           6
	//   76  161:astore          4
						iterable = ((Iterable) (obj1));
	//   77  163:aload           7
	//   78  165:astore_1        
					}
				}
			} while(iterator.hasNext());
		}
	//*  79  166:goto            48
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((Iterable)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Iterable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #87  <Method void serializeContents(Iterable, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((AsArraySerializerBase) (withResolved(beanproperty, typeserializer, jsonserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #132 <Method IterableSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}

	public IterableSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return new IterableSerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:new             #2   <Class IterableSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #36  <Method void IterableSerializer(IterableSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:areturn         
	}
}
