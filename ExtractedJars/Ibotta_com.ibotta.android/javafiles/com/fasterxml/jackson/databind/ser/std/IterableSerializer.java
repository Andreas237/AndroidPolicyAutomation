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
		return iterable.iterator().hasNext() ^ true;
	//    0    0:aload_2         
	//    1    1:invokeinterface #43  <Method Iterator Iterable.iterator()>
	//    2    6:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    3   11:iconst_1        
	//    4   12:ixor            
	//    5   13:ireturn         
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
	//    2    6:astore          7
		if(iterator.hasNext())
	//*   3    8:aload           7
	//*   4   10:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            176
		{
			TypeSerializer typeserializer = _valueTypeSerializer;
	//    6   18:aload_0         
	//    7   19:getfield        #105 <Field TypeSerializer _valueTypeSerializer>
	//    8   22:astore          8
			Object obj = null;
	//    9   24:aconst_null     
	//   10   25:astore          4
			iterable = null;
	//   11   27:aconst_null     
	//   12   28:astore_1        
			do
			{
				Object obj3 = iterator.next();
	//   13   29:aload           7
	//   14   31:invokeinterface #53  <Method Object Iterator.next()>
	//   15   36:astore          9
				if(obj3 == null)
	//*  16   38:aload           9
	//*  17   40:ifnonnull       51
				{
					serializerprovider.defaultSerializeNull(jsongenerator);
	//   18   43:aload_3         
	//   19   44:aload_2         
	//   20   45:invokevirtual   #109 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				} else
	//*  21   48:goto            166
				{
					Object obj2 = ((Object) (_elementSerializer));
	//   22   51:aload_0         
	//   23   52:getfield        #30  <Field JsonSerializer _elementSerializer>
	//   24   55:astore          6
					Object obj1;
					if(obj2 == null)
	//*  25   57:aload           6
	//*  26   59:ifnonnull       114
					{
						obj2 = ((Object) (obj3.getClass()));
	//   27   62:aload           9
	//   28   64:invokevirtual   #115 <Method Class Object.getClass()>
	//   29   67:astore          6
						if(obj2 == obj)
	//*  30   69:aload           6
	//*  31   71:aload           4
	//*  32   73:if_acmpne       92
						{
							obj2 = obj;
	//   33   76:aload           4
	//   34   78:astore          6
							obj = ((Object) (iterable));
	//   35   80:aload_1         
	//   36   81:astore          4
							obj1 = ((Object) (iterable));
	//   37   83:aload_1         
	//   38   84:astore          5
							iterable = ((Iterable) (obj2));
	//   39   86:aload           6
	//   40   88:astore_1        
						} else
	//*  41   89:goto            128
						{
							obj1 = ((Object) (serializerprovider.findValueSerializer(((Class) (obj2)), _property)));
	//   42   92:aload_3         
	//   43   93:aload           6
	//   44   95:aload_0         
	//   45   96:getfield        #26  <Field BeanProperty _property>
	//   46   99:invokevirtual   #119 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   47  102:astore          5
							obj = obj1;
	//   48  104:aload           5
	//   49  106:astore          4
							iterable = ((Iterable) (obj2));
	//   50  108:aload           6
	//   51  110:astore_1        
						}
					} else
	//*  52  111:goto            128
					{
						obj1 = obj;
	//   53  114:aload           4
	//   54  116:astore          5
						obj = ((Object) (iterable));
	//   55  118:aload_1         
	//   56  119:astore          4
						iterable = ((Iterable) (obj1));
	//   57  121:aload           5
	//   58  123:astore_1        
						obj1 = obj2;
	//   59  124:aload           6
	//   60  126:astore          5
					}
					if(typeserializer == null)
	//*  61  128:aload           8
	//*  62  130:ifnonnull       145
						((JsonSerializer) (obj1)).serialize(obj3, jsongenerator, serializerprovider);
	//   63  133:aload           5
	//   64  135:aload           9
	//   65  137:aload_2         
	//   66  138:aload_3         
	//   67  139:invokevirtual   #123 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
					else
	//*  68  142:goto            156
						((JsonSerializer) (obj1)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
	//   69  145:aload           5
	//   70  147:aload           9
	//   71  149:aload_2         
	//   72  150:aload_3         
	//   73  151:aload           8
	//   74  153:invokevirtual   #127 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
					obj1 = ((Object) (iterable));
	//   75  156:aload_1         
	//   76  157:astore          5
					iterable = ((Iterable) (obj));
	//   77  159:aload           4
	//   78  161:astore_1        
					obj = obj1;
	//   79  162:aload           5
	//   80  164:astore          4
				}
			} while(iterator.hasNext());
	//   81  166:aload           7
	//   82  168:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   83  173:ifne            29
		}
	//   84  176:return          
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
