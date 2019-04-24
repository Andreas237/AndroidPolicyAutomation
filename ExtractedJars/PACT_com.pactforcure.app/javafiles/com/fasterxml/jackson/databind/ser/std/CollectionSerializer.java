// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
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

	public CollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
	{
		this(javatype, flag, typeserializer, jsonserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:invokespecial   #15  <Method void CollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    6    9:return          
	}

	public CollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(java/util/Collection, javatype, flag, typeserializer, jsonserializer);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Collection>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:invokespecial   #24  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
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
	//    6    8:invokespecial   #29  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:return          
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new CollectionSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class CollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #46  <Method void CollectionSerializer(CollectionSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Collection>
	//    3    5:invokevirtual   #52  <Method boolean hasSingleElement(Collection)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
		if(((Iterator) (collection)).hasNext())
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*   5   13:ifne            18
	//*   6   16:iconst_0        
	//*   7   17:ireturn         
		{
			((Iterator) (collection)).next();
	//    8   18:aload_1         
	//    9   19:invokeinterface #66  <Method Object Iterator.next()>
	//   10   24:pop             
			if(!((Iterator) (collection)).hasNext())
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*  13   31:ifne            16
				return true;
	//   14   34:iconst_1        
	//   15   35:ireturn         
		}
		return false;
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #21  <Class Collection>
	//    4    6:invokevirtual   #72  <Method boolean isEmpty(SerializerProvider, Collection)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Collection collection)
	{
		return collection == null || collection.isEmpty();
	//    0    0:aload_2         
	//    1    1:ifnull          13
	//    2    4:aload_2         
	//    3    5:invokeinterface #74  <Method boolean Collection.isEmpty()>
	//    4   10:ifeq            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Collection)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #82  <Method void serialize(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = collection.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #87  <Method int Collection.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #44  <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #93  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #99  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #44  <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #104 <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       49
		{
			serializeContents(collection, jsongenerator, serializerprovider);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #107 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			return;
	//   22   48:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   49:aload_2         
	//   24   50:iload           4
	//   25   52:invokevirtual   #113 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(collection, jsongenerator, serializerprovider);
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokevirtual   #107 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   62:aload_2         
	//   32   63:invokevirtual   #117 <Method void JsonGenerator.writeEndArray()>
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
	//    2    2:checkcast       #21  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #107 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_elementSerializer == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JsonSerializer _elementSerializer>
	//    2    4:ifnull          19
_L1:
		serializeContentsUsing(collection, jsongenerator, serializerprovider, _elementSerializer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:getfield        #40  <Field JsonSerializer _elementSerializer>
	//    9   15:invokevirtual   #124 <Method void serializeContentsUsing(Collection, JsonGenerator, SerializerProvider, JsonSerializer)>
_L4:
		return;
	//   10   18:return          
_L2:
		Iterator iterator = collection.iterator();
	//   11   19:aload_1         
	//   12   20:invokeinterface #56  <Method Iterator Collection.iterator()>
	//   13   25:astore          10
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//   14   27:aload           10
	//   15   29:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            18
_L3:
		int i;
		Object obj1;
		TypeSerializer typeserializer;
		obj1 = ((Object) (_dynamicSerializers));
	//   17   37:aload_0         
	//   18   38:getfield        #128 <Field PropertySerializerMap _dynamicSerializers>
	//   19   41:astore          7
		typeserializer = _valueTypeSerializer;
	//   20   43:aload_0         
	//   21   44:getfield        #132 <Field TypeSerializer _valueTypeSerializer>
	//   22   47:astore          11
		i = 0;
	//   23   49:iconst_0        
	//   24   50:istore          4
_L8:
		int j;
		Object obj2;
		Object obj3;
		Class class1;
		j = i;
	//   25   52:iload           4
	//   26   54:istore          5
		Object obj;
		JsonSerializer jsonserializer;
		try
		{
			obj3 = iterator.next();
	//   27   56:aload           10
	//   28   58:invokeinterface #66  <Method Object Iterator.next()>
	//   29   63:astore          12
		}
	//*  30   65:aload           12
	//*  31   67:ifnonnull       108
	//*  32   70:iload           4
	//*  33   72:istore          5
	//*  34   74:aload_3         
	//*  35   75:aload_2         
	//*  36   76:invokevirtual   #136 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  37   79:aload           7
	//*  38   81:astore          6
	//*  39   83:iload           4
	//*  40   85:iconst_1        
	//*  41   86:iadd            
	//*  42   87:istore          5
	//*  43   89:iload           5
	//*  44   91:istore          4
	//*  45   93:aload           6
	//*  46   95:astore          7
	//*  47   97:aload           10
	//*  48   99:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*  49  104:ifne            52
	//*  50  107:return          
	//*  51  108:iload           4
	//*  52  110:istore          5
	//*  53  112:aload           12
	//*  54  114:invokevirtual   #142 <Method Class Object.getClass()>
	//*  55  117:astore          13
	//*  56  119:iload           4
	//*  57  121:istore          5
	//*  58  123:aload           7
	//*  59  125:aload           13
	//*  60  127:invokevirtual   #148 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  61  130:astore          9
	//*  62  132:aload           9
	//*  63  134:astore          8
	//*  64  136:aload           7
	//*  65  138:astore          6
	//*  66  140:aload           9
	//*  67  142:ifnonnull       196
	//*  68  145:iload           4
	//*  69  147:istore          5
	//*  70  149:aload_0         
	//*  71  150:getfield        #152 <Field JavaType _elementType>
	//*  72  153:invokevirtual   #157 <Method boolean JavaType.hasGenericTypes()>
	//*  73  156:ifeq            228
	//*  74  159:iload           4
	//*  75  161:istore          5
	//*  76  163:aload_0         
	//*  77  164:aload           7
	//*  78  166:aload_3         
	//*  79  167:aload_0         
	//*  80  168:getfield        #152 <Field JavaType _elementType>
	//*  81  171:aload           13
	//*  82  173:invokevirtual   #161 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  83  176:aload_3         
	//*  84  177:invokevirtual   #165 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  85  180:astore          7
	//*  86  182:iload           4
	//*  87  184:istore          5
	//*  88  186:aload_0         
	//*  89  187:getfield        #128 <Field PropertySerializerMap _dynamicSerializers>
	//*  90  190:astore          6
	//*  91  192:aload           7
	//*  92  194:astore          8
	//*  93  196:aload           11
	//*  94  198:ifnonnull       246
	//*  95  201:iload           4
	//*  96  203:istore          5
	//*  97  205:aload           8
	//*  98  207:aload           12
	//*  99  209:aload_2         
	//* 100  210:aload_3         
	//* 101  211:invokevirtual   #169 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 102  214:goto            83
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//* 103  217:astore_2        
		{
			wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (collection)), j);
	//  104  218:aload_0         
	//  105  219:aload_3         
	//  106  220:aload_2         
	//  107  221:aload_1         
	//  108  222:iload           5
	//  109  224:invokevirtual   #173 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			return;
	//  110  227:return          
		}
		if(obj3 != null) goto _L6; else goto _L5
_L5:
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		obj = obj1;
_L13:
		j = i + 1;
		i = j;
		obj1 = obj;
		if(iterator.hasNext()) goto _L8; else goto _L7
_L7:
		return;
_L6:
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
		obj2 = ((Object) (jsonserializer));
		obj = obj1;
		if(jsonserializer != null) goto _L10; else goto _L9
_L9:
		j = i;
		if(!_elementType.hasGenericTypes()) goto _L12; else goto _L11
_L11:
		j = i;
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
_L14:
		j = i;
		obj = ((Object) (_dynamicSerializers));
		obj2 = obj1;
_L10:
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_246;
		j = i;
		((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
		  goto _L13
_L12:
		j = i;
	//  111  228:iload           4
	//  112  230:istore          5
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider)));
	//  113  232:aload_0         
	//  114  233:aload           7
	//  115  235:aload           13
	//  116  237:aload_3         
	//  117  238:invokevirtual   #176 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  118  241:astore          7
		  goto _L14
	//* 119  243:goto            182
		j = i;
	//  120  246:iload           4
	//  121  248:istore          5
		((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
	//  122  250:aload           8
	//  123  252:aload           12
	//  124  254:aload_2         
	//  125  255:aload_3         
	//  126  256:aload           11
	//  127  258:invokevirtual   #180 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		  goto _L13
	//* 128  261:goto            83
	}

	public void serializeContentsUsing(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException, JsonGenerationException
	{
		Iterator iterator = collection.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method Iterator Collection.iterator()>
	//    2    6:astore          6
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    3    8:aload           6
	//    4   10:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            62
_L1:
		int i;
		TypeSerializer typeserializer;
		typeserializer = _valueTypeSerializer;
	//    6   18:aload_0         
	//    7   19:getfield        #132 <Field TypeSerializer _valueTypeSerializer>
	//    8   22:astore          7
		i = 0;
	//    9   24:iconst_0        
	//   10   25:istore          5
_L5:
		Object obj = iterator.next();
	//   11   27:aload           6
	//   12   29:invokeinterface #66  <Method Object Iterator.next()>
	//   13   34:astore          8
		if(obj != null) goto _L4; else goto _L3
	//   14   36:aload           8
	//   15   38:ifnonnull       63
_L3:
		serializerprovider.defaultSerializeNull(jsongenerator);
	//   16   41:aload_3         
	//   17   42:aload_2         
	//   18   43:invokevirtual   #136 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
_L6:
		i++;
	//   19   46:iload           5
	//   20   48:iconst_1        
	//   21   49:iadd            
	//   22   50:istore          5
_L7:
		if(iterator.hasNext()) goto _L5; else goto _L2
	//   23   52:aload           6
	//   24   54:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   25   59:ifne            27
_L2:
		return;
	//   26   62:return          
_L4:
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_95;
	//   27   63:aload           7
	//   28   65:ifnonnull       95
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
	//   29   68:aload           4
	//   30   70:aload           8
	//   31   72:aload_2         
	//   32   73:aload_3         
	//   33   74:invokevirtual   #169 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		  goto _L6
	//*  34   77:goto            46
		obj;
	//   35   80:astore          8
		wrapAndThrow(serializerprovider, ((Throwable) (obj)), ((Object) (collection)), i);
	//   36   82:aload_0         
	//   37   83:aload_3         
	//   38   84:aload           8
	//   39   86:aload_1         
	//   40   87:iload           5
	//   41   89:invokevirtual   #173 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
		  goto _L7
	//*  42   92:goto            52
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//   43   95:aload           4
	//   44   97:aload           8
	//   45   99:aload_2         
	//   46  100:aload_3         
	//   47  101:aload           7
	//   48  103:invokevirtual   #180 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		  goto _L6
	//*  49  106:goto            46
	}

	public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((AsArraySerializerBase) (withResolved(beanproperty, typeserializer, jsonserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #188 <Method CollectionSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
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
	//    7   10:invokespecial   #46  <Method void CollectionSerializer(CollectionSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:areturn         
	}

	private static final long serialVersionUID = 1L;
}
