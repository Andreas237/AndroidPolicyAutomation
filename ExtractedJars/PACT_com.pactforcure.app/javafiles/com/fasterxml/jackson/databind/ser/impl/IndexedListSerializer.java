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
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

public final class IndexedListSerializer extends AsArraySerializerBase
{

	public IndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(java/util/List, javatype, flag, typeserializer, jsonserializer);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class List>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:invokespecial   #17  <Method void AsArraySerializerBase(Class, JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   11:return          
	}

	public IndexedListSerializer(IndexedListSerializer indexedlistserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((AsArraySerializerBase) (indexedlistserializer)), beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #24  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:return          
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new IndexedListSerializer(this, _property, typeserializer, _elementSerializer, _unwrapSingle)));
	//    0    0:new             #2   <Class IndexedListSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field Boolean _unwrapSingle>
	//   10   18:invokespecial   #41  <Method void IndexedListSerializer(IndexedListSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   11   21:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class List>
	//    3    5:invokevirtual   #47  <Method boolean hasSingleElement(List)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(List list)
	{
		return list.size() == 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:iconst_1        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #14  <Class List>
	//    4    6:invokevirtual   #57  <Method boolean isEmpty(SerializerProvider, List)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, List list)
	{
		return list == null || list.isEmpty();
	//    0    0:aload_2         
	//    1    1:ifnull          13
	//    2    4:aload_2         
	//    3    5:invokeinterface #60  <Method boolean List.isEmpty()>
	//    4   10:ifeq            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((List)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #68  <Method void serialize(List, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #39  <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #75  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #81  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #39  <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #86  <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       49
		{
			serializeContents(list, jsongenerator, serializerprovider);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #89  <Method void serializeContents(List, JsonGenerator, SerializerProvider)>
			return;
	//   22   48:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   49:aload_2         
	//   24   50:iload           4
	//   25   52:invokevirtual   #95  <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(list, jsongenerator, serializerprovider);
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokevirtual   #89  <Method void serializeContents(List, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   62:aload_2         
	//   32   63:invokevirtual   #99  <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   66:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((List)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #89  <Method void serializeContents(List, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_elementSerializer == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field JsonSerializer _elementSerializer>
	//    2    4:ifnull          19
_L1:
		serializeContentsUsing(list, jsongenerator, serializerprovider, _elementSerializer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:getfield        #35  <Field JsonSerializer _elementSerializer>
	//    9   15:invokevirtual   #106 <Method void serializeContentsUsing(List, JsonGenerator, SerializerProvider, JsonSerializer)>
_L14:
		return;
	//   10   18:return          
_L2:
		int i;
		int j;
		Object obj;
		Object obj1;
		Class class1;
		if(_valueTypeSerializer != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #110 <Field TypeSerializer _valueTypeSerializer>
	//*  13   23:ifnull          34
		{
			serializeTypedContents(list, jsongenerator, serializerprovider);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #113 <Method void serializeTypedContents(List, JsonGenerator, SerializerProvider)>
			return;
	//   19   33:return          
		}
		int k = list.size();
	//   20   34:aload_1         
	//   21   35:invokeinterface #51  <Method int List.size()>
	//   22   40:istore          6
		if(k == 0)
			continue; /* Loop/switch isn't completed */
	//   23   42:iload           6
	//   24   44:ifeq            18
		j = 0;
	//   25   47:iconst_0        
	//   26   48:istore          5
		i = 0;
	//   27   50:iconst_0        
	//   28   51:istore          4
		Object obj2;
		JsonSerializer jsonserializer;
		Object obj3;
		try
		{
			obj1 = ((Object) (_dynamicSerializers));
	//   29   53:aload_0         
	//   30   54:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//   31   57:astore          8
		}
	//*  32   59:iload           4
	//*  33   61:iload           6
	//*  34   63:icmpge          18
	//*  35   66:iload           4
	//*  36   68:istore          5
	//*  37   70:aload_1         
	//*  38   71:iload           4
	//*  39   73:invokeinterface #121 <Method Object List.get(int)>
	//*  40   78:astore          11
	//*  41   80:aload           11
	//*  42   82:ifnonnull       101
	//*  43   85:iload           4
	//*  44   87:istore          5
	//*  45   89:aload_3         
	//*  46   90:aload_2         
	//*  47   91:invokevirtual   #125 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  48   94:aload           8
	//*  49   96:astore          7
	//*  50   98:goto            234
	//*  51  101:iload           4
	//*  52  103:istore          5
	//*  53  105:aload           11
	//*  54  107:invokevirtual   #131 <Method Class Object.getClass()>
	//*  55  110:astore          12
	//*  56  112:iload           4
	//*  57  114:istore          5
	//*  58  116:aload           8
	//*  59  118:aload           12
	//*  60  120:invokevirtual   #137 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  61  123:astore          10
	//*  62  125:aload           10
	//*  63  127:astore          9
	//*  64  129:aload           8
	//*  65  131:astore          7
	//*  66  133:aload           10
	//*  67  135:ifnonnull       189
	//*  68  138:iload           4
	//*  69  140:istore          5
	//*  70  142:aload_0         
	//*  71  143:getfield        #141 <Field JavaType _elementType>
	//*  72  146:invokevirtual   #146 <Method boolean JavaType.hasGenericTypes()>
	//*  73  149:ifeq            216
	//*  74  152:iload           4
	//*  75  154:istore          5
	//*  76  156:aload_0         
	//*  77  157:aload           8
	//*  78  159:aload_3         
	//*  79  160:aload_0         
	//*  80  161:getfield        #141 <Field JavaType _elementType>
	//*  81  164:aload           12
	//*  82  166:invokevirtual   #150 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  83  169:aload_3         
	//*  84  170:invokevirtual   #154 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  85  173:astore          8
	//*  86  175:iload           4
	//*  87  177:istore          5
	//*  88  179:aload_0         
	//*  89  180:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//*  90  183:astore          7
	//*  91  185:aload           8
	//*  92  187:astore          9
	//*  93  189:iload           4
	//*  94  191:istore          5
	//*  95  193:aload           9
	//*  96  195:aload           11
	//*  97  197:aload_2         
	//*  98  198:aload_3         
	//*  99  199:invokevirtual   #158 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 100  202:goto            234
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//* 101  205:astore_2        
		{
			wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//  102  206:aload_0         
	//  103  207:aload_3         
	//  104  208:aload_2         
	//  105  209:aload_1         
	//  106  210:iload           5
	//  107  212:invokevirtual   #162 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			return;
	//  108  215:return          
		}
_L12:
		if(i >= k)
			continue; /* Loop/switch isn't completed */
		j = i;
		obj3 = list.get(i);
		if(obj3 != null) goto _L4; else goto _L3
_L3:
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		obj = obj1;
		  goto _L5
_L4:
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
		obj2 = ((Object) (jsonserializer));
		obj = obj1;
		if(jsonserializer != null) goto _L7; else goto _L6
_L6:
		j = i;
		if(!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
		j = i;
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
_L10:
		j = i;
		obj = ((Object) (_dynamicSerializers));
		obj2 = obj1;
_L7:
		j = i;
		((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
		break; /* Loop/switch isn't completed */
_L9:
		j = i;
	//  109  216:iload           4
	//  110  218:istore          5
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider)));
	//  111  220:aload_0         
	//  112  221:aload           8
	//  113  223:aload           12
	//  114  225:aload_3         
	//  115  226:invokevirtual   #165 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  116  229:astore          8
		if(true) goto _L10; else goto _L5
	//  117  231:goto            175
_L5:
		i++;
	//  118  234:iload           4
	//  119  236:iconst_1        
	//  120  237:iadd            
	//  121  238:istore          4
		obj1 = obj;
	//  122  240:aload           7
	//  123  242:astore          8
		if(true) goto _L12; else goto _L11
	//  124  244:goto            59
_L11:
		if(true) goto _L14; else goto _L13
_L13:
	}

	public void serializeContentsUsing(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:istore          6
		if(j != 0) goto _L2; else goto _L1
	//    3    8:iload           6
	//    4   10:ifne            14
_L1:
		return;
	//    5   13:return          
_L2:
		int i;
		TypeSerializer typeserializer;
		typeserializer = _valueTypeSerializer;
	//    6   14:aload_0         
	//    7   15:getfield        #110 <Field TypeSerializer _valueTypeSerializer>
	//    8   18:astore          7
		i = 0;
	//    9   20:iconst_0        
	//   10   21:istore          5
_L4:
		Object obj;
		if(i >= j)
			continue; /* Loop/switch isn't completed */
	//   11   23:iload           5
	//   12   25:iload           6
	//   13   27:icmpge          13
		obj = list.get(i);
	//   14   30:aload_1         
	//   15   31:iload           5
	//   16   33:invokeinterface #121 <Method Object List.get(int)>
	//   17   38:astore          8
		if(obj == null)
	//*  18   40:aload           8
	//*  19   42:ifnonnull       53
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   20   45:aload_3         
	//   21   46:aload_2         
	//   22   47:invokevirtual   #125 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			}
	//*  23   50:goto            96
	//*  24   53:aload           7
	//*  25   55:ifnonnull       85
	//*  26   58:aload           4
	//*  27   60:aload           8
	//*  28   62:aload_2         
	//*  29   63:aload_3         
	//*  30   64:invokevirtual   #158 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  31   67:goto            96
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  32   70:astore          8
			{
				wrapAndThrow(serializerprovider, ((Throwable) (obj)), ((Object) (list)), i);
	//   33   72:aload_0         
	//   34   73:aload_3         
	//   35   74:aload           8
	//   36   76:aload_1         
	//   37   77:iload           5
	//   38   79:invokevirtual   #162 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break MISSING_BLOCK_LABEL_96;
	//   39   82:goto            96
		}
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_85;
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_96;
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//   40   85:aload           4
	//   41   87:aload           8
	//   42   89:aload_2         
	//   43   90:aload_3         
	//   44   91:aload           7
	//   45   93:invokevirtual   #169 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		i++;
	//   46   96:iload           5
	//   47   98:iconst_1        
	//   48   99:iadd            
	//   49  100:istore          5
		if(true) goto _L4; else goto _L3
	//   50  102:goto            23
_L3:
		if(true) goto _L1; else goto _L5
_L5:
	}

	public void serializeTypedContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int k = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:istore          7
		if(k != 0) goto _L2; else goto _L1
	//    3    8:iload           7
	//    4   10:ifne            14
_L1:
		return;
	//    5   13:return          
_L2:
		int i;
		int j;
		Object obj;
		Object obj1;
		Class class1;
		boolean flag = false;
	//    6   14:iconst_0        
	//    7   15:istore          6
		i = 0;
	//    8   17:iconst_0        
	//    9   18:istore          4
		j = ((int) (flag));
	//   10   20:iload           6
	//   11   22:istore          5
		Object obj2;
		JsonSerializer jsonserializer;
		TypeSerializer typeserializer;
		Object obj3;
		try
		{
			typeserializer = _valueTypeSerializer;
	//   12   24:aload_0         
	//   13   25:getfield        #110 <Field TypeSerializer _valueTypeSerializer>
	//   14   28:astore          12
		}
	//*  15   30:iload           6
	//*  16   32:istore          5
	//*  17   34:aload_0         
	//*  18   35:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//*  19   38:astore          9
	//*  20   40:iload           4
	//*  21   42:iload           7
	//*  22   44:icmpge          13
	//*  23   47:iload           4
	//*  24   49:istore          5
	//*  25   51:aload_1         
	//*  26   52:iload           4
	//*  27   54:invokeinterface #121 <Method Object List.get(int)>
	//*  28   59:astore          13
	//*  29   61:aload           13
	//*  30   63:ifnonnull       82
	//*  31   66:iload           4
	//*  32   68:istore          5
	//*  33   70:aload_3         
	//*  34   71:aload_2         
	//*  35   72:invokevirtual   #125 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  36   75:aload           9
	//*  37   77:astore          8
	//*  38   79:goto            217
	//*  39   82:iload           4
	//*  40   84:istore          5
	//*  41   86:aload           13
	//*  42   88:invokevirtual   #131 <Method Class Object.getClass()>
	//*  43   91:astore          14
	//*  44   93:iload           4
	//*  45   95:istore          5
	//*  46   97:aload           9
	//*  47   99:aload           14
	//*  48  101:invokevirtual   #137 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  49  104:astore          11
	//*  50  106:aload           11
	//*  51  108:astore          10
	//*  52  110:aload           9
	//*  53  112:astore          8
	//*  54  114:aload           11
	//*  55  116:ifnonnull       170
	//*  56  119:iload           4
	//*  57  121:istore          5
	//*  58  123:aload_0         
	//*  59  124:getfield        #141 <Field JavaType _elementType>
	//*  60  127:invokevirtual   #146 <Method boolean JavaType.hasGenericTypes()>
	//*  61  130:ifeq            199
	//*  62  133:iload           4
	//*  63  135:istore          5
	//*  64  137:aload_0         
	//*  65  138:aload           9
	//*  66  140:aload_3         
	//*  67  141:aload_0         
	//*  68  142:getfield        #141 <Field JavaType _elementType>
	//*  69  145:aload           14
	//*  70  147:invokevirtual   #150 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  71  150:aload_3         
	//*  72  151:invokevirtual   #154 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  73  154:astore          9
	//*  74  156:iload           4
	//*  75  158:istore          5
	//*  76  160:aload_0         
	//*  77  161:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//*  78  164:astore          8
	//*  79  166:aload           9
	//*  80  168:astore          10
	//*  81  170:iload           4
	//*  82  172:istore          5
	//*  83  174:aload           10
	//*  84  176:aload           13
	//*  85  178:aload_2         
	//*  86  179:aload_3         
	//*  87  180:aload           12
	//*  88  182:invokevirtual   #169 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  89  185:goto            217
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  90  188:astore_2        
		{
			wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//   91  189:aload_0         
	//   92  190:aload_3         
	//   93  191:aload_2         
	//   94  192:aload_1         
	//   95  193:iload           5
	//   96  195:invokevirtual   #162 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			return;
	//   97  198:return          
		}
		j = ((int) (flag));
		obj1 = ((Object) (_dynamicSerializers));
_L12:
		if(i >= k)
			continue; /* Loop/switch isn't completed */
		j = i;
		obj3 = list.get(i);
		if(obj3 != null) goto _L4; else goto _L3
_L3:
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		obj = obj1;
		  goto _L5
_L4:
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
		obj2 = ((Object) (jsonserializer));
		obj = obj1;
		if(jsonserializer != null) goto _L7; else goto _L6
_L6:
		j = i;
		if(!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
		j = i;
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
_L10:
		j = i;
		obj = ((Object) (_dynamicSerializers));
		obj2 = obj1;
_L7:
		j = i;
		((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
		break; /* Loop/switch isn't completed */
_L9:
		j = i;
	//   98  199:iload           4
	//   99  201:istore          5
		obj1 = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider)));
	//  100  203:aload_0         
	//  101  204:aload           9
	//  102  206:aload           14
	//  103  208:aload_3         
	//  104  209:invokevirtual   #165 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  105  212:astore          9
		if(true) goto _L10; else goto _L5
	//  106  214:goto            156
_L5:
		i++;
	//  107  217:iload           4
	//  108  219:iconst_1        
	//  109  220:iadd            
	//  110  221:istore          4
		obj1 = obj;
	//  111  223:aload           8
	//  112  225:astore          9
		if(true) goto _L12; else goto _L11
	//  113  227:goto            40
_L11:
		if(true) goto _L1; else goto _L13
_L13:
	}

	public IndexedListSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return new IndexedListSerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//    0    0:new             #2   <Class IndexedListSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #41  <Method void IndexedListSerializer(IndexedListSerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
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
	//    5    6:invokevirtual   #176 <Method IndexedListSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    6    9:areturn         
	}

	private static final long serialVersionUID = 1L;
}
