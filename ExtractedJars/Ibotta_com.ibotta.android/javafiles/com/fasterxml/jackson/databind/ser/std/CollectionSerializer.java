// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			AsArraySerializerBase

public class CollectionSerializer extends AsArraySerializerBase
{

	public CollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(java/util/Collection, javatype, flag, typeserializer, jsonserializer);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Collection>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:invokespecial   #16  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   11:return          
	}

	public CollectionSerializer(CollectionSerializer collectionserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((AsArraySerializerBase) (collectionserializer)), beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #23  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:return          
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new CollectionSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class CollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #40  <Method void CollectionSerializer(CollectionSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Collection>
	//    3    5:invokevirtual   #46  <Method boolean hasSingleElement(Collection)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Collection collection)
	{
		return collection.size() == 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #50  <Method int Collection.size()>
	//    2    6:iconst_1        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #13  <Class Collection>
	//    4    6:invokevirtual   #56  <Method boolean isEmpty(SerializerProvider, Collection)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Collection collection)
	{
		return collection.isEmpty();
	//    0    0:aload_2         
	//    1    1:invokeinterface #59  <Method boolean Collection.isEmpty()>
	//    2    6:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Collection)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #67  <Method void serialize(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = collection.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #50  <Method int Collection.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #38  <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #74  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #80  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #38  <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #85  <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       49
		{
			serializeContents(collection, jsongenerator, serializerprovider);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #88  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			return;
	//   22   48:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   49:aload_2         
	//   24   50:iload           4
	//   25   52:invokevirtual   #94  <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(collection, jsongenerator, serializerprovider);
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokevirtual   #88  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   62:aload_2         
	//   32   63:invokevirtual   #98  <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   66:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((Collection)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #88  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		Object obj;
		Iterator iterator;
		TypeSerializer typeserializer;
		jsongenerator.setCurrentValue(((Object) (collection)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method void JsonGenerator.setCurrentValue(Object)>
		if(_elementSerializer != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field JsonSerializer _elementSerializer>
	//*   5    9:ifnull          24
		{
			serializeContentsUsing(collection, jsongenerator, serializerprovider, _elementSerializer);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field JsonSerializer _elementSerializer>
	//   12   20:invokevirtual   #109 <Method void serializeContentsUsing(Collection, JsonGenerator, SerializerProvider, JsonSerializer)>
			return;
	//   13   23:return          
		}
		iterator = collection.iterator();
	//   14   24:aload_1         
	//   15   25:invokeinterface #113 <Method Iterator Collection.iterator()>
	//   16   30:astore          11
		if(!iterator.hasNext())
	//*  17   32:aload           11
	//*  18   34:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*  19   39:ifne            43
			return;
	//   20   42:return          
		obj = ((Object) (_dynamicSerializers));
	//   21   43:aload_0         
	//   22   44:getfield        #122 <Field PropertySerializerMap _dynamicSerializers>
	//   23   47:astore          7
		typeserializer = _valueTypeSerializer;
	//   24   49:aload_0         
	//   25   50:getfield        #126 <Field TypeSerializer _valueTypeSerializer>
	//   26   53:astore          12
		i = 0;
	//   27   55:iconst_0        
	//   28   56:istore          4
_L1:
		int j = i;
	//   29   58:iload           4
	//   30   60:istore          5
		boolean flag;
		Object obj1;
		Object obj2;
		JsonSerializer jsonserializer;
		Object obj3;
		Class class1;
		try
		{
			obj3 = iterator.next();
	//   31   62:aload           11
	//   32   64:invokeinterface #130 <Method Object Iterator.next()>
	//   33   69:astore          13
		}
	//*  34   71:aload           13
	//*  35   73:ifnonnull       88
	//*  36   76:iload           4
	//*  37   78:istore          5
	//*  38   80:aload_3         
	//*  39   81:aload_2         
	//*  40   82:invokevirtual   #134 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  41   85:goto            238
	//*  42   88:iload           4
	//*  43   90:istore          5
	//*  44   92:aload           13
	//*  45   94:invokevirtual   #140 <Method Class Object.getClass()>
	//*  46   97:astore          14
	//*  47   99:iload           4
	//*  48  101:istore          5
	//*  49  103:aload           7
	//*  50  105:aload           14
	//*  51  107:invokevirtual   #146 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  52  110:astore          10
	//*  53  112:aload           7
	//*  54  114:astore          8
	//*  55  116:aload           10
	//*  56  118:astore          9
	//*  57  120:aload           10
	//*  58  122:ifnonnull       194
	//*  59  125:iload           4
	//*  60  127:istore          5
	//*  61  129:aload_0         
	//*  62  130:getfield        #150 <Field JavaType _elementType>
	//*  63  133:invokevirtual   #155 <Method boolean JavaType.hasGenericTypes()>
	//*  64  136:ifeq            165
	//*  65  139:iload           4
	//*  66  141:istore          5
	//*  67  143:aload_0         
	//*  68  144:aload           7
	//*  69  146:aload_3         
	//*  70  147:aload_0         
	//*  71  148:getfield        #150 <Field JavaType _elementType>
	//*  72  151:aload           14
	//*  73  153:invokevirtual   #159 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  74  156:aload_3         
	//*  75  157:invokevirtual   #163 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  76  160:astore          7
	//*  77  162:goto            180
	//*  78  165:iload           4
	//*  79  167:istore          5
	//*  80  169:aload_0         
	//*  81  170:aload           7
	//*  82  172:aload           14
	//*  83  174:aload_3         
	//*  84  175:invokevirtual   #166 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//*  85  178:astore          7
	//*  86  180:iload           4
	//*  87  182:istore          5
	//*  88  184:aload_0         
	//*  89  185:getfield        #122 <Field PropertySerializerMap _dynamicSerializers>
	//*  90  188:astore          8
	//*  91  190:aload           7
	//*  92  192:astore          9
	//*  93  194:aload           12
	//*  94  196:ifnonnull       219
	//*  95  199:iload           4
	//*  96  201:istore          5
	//*  97  203:aload           9
	//*  98  205:aload           13
	//*  99  207:aload_2         
	//* 100  208:aload_3         
	//* 101  209:invokevirtual   #170 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 102  212:aload           8
	//* 103  214:astore          7
	//* 104  216:goto            238
	//* 105  219:iload           4
	//* 106  221:istore          5
	//* 107  223:aload           9
	//* 108  225:aload           13
	//* 109  227:aload_2         
	//* 110  228:aload_3         
	//* 111  229:aload           12
	//* 112  231:invokevirtual   #174 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//* 113  234:aload           8
	//* 114  236:astore          7
	//* 115  238:iload           4
	//* 116  240:iconst_1        
	//* 117  241:iadd            
	//* 118  242:istore          4
	//* 119  244:iload           4
	//* 120  246:istore          5
	//* 121  248:aload           11
	//* 122  250:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//* 123  255:istore          6
	//* 124  257:iload           6
	//* 125  259:ifne            58
	//* 126  262:return          
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//* 127  263:astore_2        
		{
			wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (collection)), j);
	//  128  264:aload_0         
	//  129  265:aload_3         
	//  130  266:aload_2         
	//  131  267:aload_1         
	//  132  268:iload           5
	//  133  270:invokevirtual   #178 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			return;
	//  134  273:return          
		}
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_88;
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		break MISSING_BLOCK_LABEL_238;
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
		obj1 = obj;
		obj2 = ((Object) (jsonserializer));
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_194;
		j = i;
		if(!_elementType.hasGenericTypes())
			break MISSING_BLOCK_LABEL_165;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
		break MISSING_BLOCK_LABEL_180;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider)));
		j = i;
		obj1 = ((Object) (_dynamicSerializers));
		obj2 = obj;
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_219;
		j = i;
		((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
		obj = obj1;
		break MISSING_BLOCK_LABEL_238;
		j = i;
		((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
		obj = obj1;
		i++;
		j = i;
		flag = iterator.hasNext();
		if(!flag)
			return;
		  goto _L1
	}

	public void serializeContentsUsing(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		Iterator iterator = collection.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #113 <Method Iterator Collection.iterator()>
	//    2    6:astore          6
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    3    8:aload           6
	//    4   10:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            106
_L1:
		int i;
		TypeSerializer typeserializer;
		typeserializer = _valueTypeSerializer;
	//    6   18:aload_0         
	//    7   19:getfield        #126 <Field TypeSerializer _valueTypeSerializer>
	//    8   22:astore          7
		i = 0;
	//    9   24:iconst_0        
	//   10   25:istore          5
_L3:
		Exception exception;
		Object obj = iterator.next();
	//   11   27:aload           6
	//   12   29:invokeinterface #130 <Method Object Iterator.next()>
	//   13   34:astore          8
		if(obj == null)
	//*  14   36:aload           8
	//*  15   38:ifnonnull       49
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   16   41:aload_3         
	//   17   42:aload_2         
	//   18   43:invokevirtual   #134 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_77;
	//   19   46:goto            77
			}
	//*  20   49:aload           7
	//*  21   51:ifnonnull       66
	//*  22   54:aload           4
	//*  23   56:aload           8
	//*  24   58:aload_2         
	//*  25   59:aload_3         
	//*  26   60:invokevirtual   #170 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  27   63:goto            77
	//*  28   66:aload           4
	//*  29   68:aload           8
	//*  30   70:aload_2         
	//*  31   71:aload_3         
	//*  32   72:aload           7
	//*  33   74:invokevirtual   #174 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  34   77:iload           5
	//*  35   79:iconst_1        
	//*  36   80:iadd            
	//*  37   81:istore          5
	//*  38   83:goto            96
	//*  39   86:aload_0         
	//*  40   87:aload_3         
	//*  41   88:aload           8
	//*  42   90:aload_1         
	//*  43   91:iload           5
	//*  44   93:invokevirtual   #178 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
	//*  45   96:aload           6
	//*  46   98:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*  47  103:ifne            27
	//*  48  106:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (collection)), i);
			}
			continue; /* Loop/switch isn't completed */
		}
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_66;
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_77;
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
		i++;
		continue; /* Loop/switch isn't completed */
		if(iterator.hasNext()) goto _L3; else goto _L2
_L2:
	//*  49  107:astore          8
	//*  50  109:goto            86
	}

	public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((AsArraySerializerBase) (withResolved(beanproperty, typeserializer, jsonserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #184 <Method CollectionSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}

	public CollectionSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return new CollectionSerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:new             #2   <Class CollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #40  <Method void CollectionSerializer(CollectionSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:areturn         
	}

	private static final long serialVersionUID = 1L;
}
