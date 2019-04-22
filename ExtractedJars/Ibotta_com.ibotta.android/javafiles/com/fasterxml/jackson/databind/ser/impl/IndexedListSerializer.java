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
		return list.isEmpty();
	//    0    0:aload_2         
	//    1    1:invokeinterface #60  <Method boolean List.isEmpty()>
	//    2    6:ireturn         
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
		int i;
		int j;
		int k;
		if(_elementSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field JsonSerializer _elementSerializer>
	//*   2    4:ifnull          19
		{
			serializeContentsUsing(list, jsongenerator, serializerprovider, _elementSerializer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:getfield        #35  <Field JsonSerializer _elementSerializer>
	//    9   15:invokevirtual   #106 <Method void serializeContentsUsing(List, JsonGenerator, SerializerProvider, JsonSerializer)>
			return;
	//   10   18:return          
		}
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
		k = list.size();
	//   20   34:aload_1         
	//   21   35:invokeinterface #51  <Method int List.size()>
	//   22   40:istore          6
		if(k == 0)
	//*  23   42:iload           6
	//*  24   44:ifne            48
			return;
	//   25   47:return          
		j = 0;
	//   26   48:iconst_0        
	//   27   49:istore          5
		i = 0;
	//   28   51:iconst_0        
	//   29   52:istore          4
		Object obj = ((Object) (_dynamicSerializers));
	//   30   54:aload_0         
	//   31   55:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//   32   58:astore          7
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   33   60:iload           4
	//   34   62:iload           6
	//   35   64:icmpge          240
		j = i;
	//   36   67:iload           4
	//   37   69:istore          5
		Object obj3 = list.get(i);
	//   38   71:aload_1         
	//   39   72:iload           4
	//   40   74:invokeinterface #121 <Method Object List.get(int)>
	//   41   79:astore          11
		if(obj3 == null)
	//*  42   81:aload           11
	//*  43   83:ifnonnull       98
		{
			j = i;
	//   44   86:iload           4
	//   45   88:istore          5
			Object obj1;
			Object obj2;
			JsonSerializer jsonserializer;
			Class class1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   46   90:aload_3         
	//   47   91:aload_2         
	//   48   92:invokevirtual   #125 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_221;
	//   49   95:goto            221
			}
	//*  50   98:iload           4
	//*  51  100:istore          5
	//*  52  102:aload           11
	//*  53  104:invokevirtual   #131 <Method Class Object.getClass()>
	//*  54  107:astore          12
	//*  55  109:iload           4
	//*  56  111:istore          5
	//*  57  113:aload           7
	//*  58  115:aload           12
	//*  59  117:invokevirtual   #137 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  60  120:astore          10
	//*  61  122:aload           7
	//*  62  124:astore          8
	//*  63  126:aload           10
	//*  64  128:astore          9
	//*  65  130:aload           10
	//*  66  132:ifnonnull       204
	//*  67  135:iload           4
	//*  68  137:istore          5
	//*  69  139:aload_0         
	//*  70  140:getfield        #141 <Field JavaType _elementType>
	//*  71  143:invokevirtual   #146 <Method boolean JavaType.hasGenericTypes()>
	//*  72  146:ifeq            175
	//*  73  149:iload           4
	//*  74  151:istore          5
	//*  75  153:aload_0         
	//*  76  154:aload           7
	//*  77  156:aload_3         
	//*  78  157:aload_0         
	//*  79  158:getfield        #141 <Field JavaType _elementType>
	//*  80  161:aload           12
	//*  81  163:invokevirtual   #150 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  82  166:aload_3         
	//*  83  167:invokevirtual   #154 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  84  170:astore          7
	//*  85  172:goto            190
	//*  86  175:iload           4
	//*  87  177:istore          5
	//*  88  179:aload_0         
	//*  89  180:aload           7
	//*  90  182:aload           12
	//*  91  184:aload_3         
	//*  92  185:invokevirtual   #157 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//*  93  188:astore          7
	//*  94  190:iload           4
	//*  95  192:istore          5
	//*  96  194:aload_0         
	//*  97  195:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//*  98  198:astore          8
	//*  99  200:aload           7
	//* 100  202:astore          9
	//* 101  204:iload           4
	//* 102  206:istore          5
	//* 103  208:aload           9
	//* 104  210:aload           11
	//* 105  212:aload_2         
	//* 106  213:aload_3         
	//* 107  214:invokevirtual   #161 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 108  217:aload           8
	//* 109  219:astore          7
	//* 110  221:iload           4
	//* 111  223:iconst_1        
	//* 112  224:iadd            
	//* 113  225:istore          4
	//* 114  227:goto            60
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//* 115  230:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//  116  231:aload_0         
	//  117  232:aload_3         
	//  118  233:aload_2         
	//  119  234:aload_1         
	//  120  235:iload           5
	//  121  237:invokevirtual   #165 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
		obj1 = obj;
		obj2 = ((Object) (jsonserializer));
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_204;
		j = i;
		if(!_elementType.hasGenericTypes())
			break MISSING_BLOCK_LABEL_175;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
		break MISSING_BLOCK_LABEL_190;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider)));
		j = i;
		obj1 = ((Object) (_dynamicSerializers));
		obj2 = obj;
		j = i;
		((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
		obj = obj1;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//  122  240:return          
	}

	public void serializeContentsUsing(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		int i;
		int j;
		TypeSerializer typeserializer;
		j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:istore          6
		if(j == 0)
	//*   3    8:iload           6
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		typeserializer = _valueTypeSerializer;
	//    6   14:aload_0         
	//    7   15:getfield        #110 <Field TypeSerializer _valueTypeSerializer>
	//    8   18:astore          7
		i = 0;
	//    9   20:iconst_0        
	//   10   21:istore          5
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   11   23:iload           5
	//   12   25:iload           6
	//   13   27:icmpge          103
_L1:
		Exception exception;
		Object obj = list.get(i);
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
	//*  23   50:goto            94
	//*  24   53:aload           7
	//*  25   55:ifnonnull       70
	//*  26   58:aload           4
	//*  27   60:aload           8
	//*  28   62:aload_2         
	//*  29   63:aload_3         
	//*  30   64:invokevirtual   #161 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  31   67:goto            94
	//*  32   70:aload           4
	//*  33   72:aload           8
	//*  34   74:aload_2         
	//*  35   75:aload_3         
	//*  36   76:aload           7
	//*  37   78:invokevirtual   #169 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  38   81:goto            94
	//*  39   84:aload_0         
	//*  40   85:aload_3         
	//*  41   86:aload           8
	//*  42   88:aload_1         
	//*  43   89:iload           5
	//*  44   91:invokevirtual   #165 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
	//*  45   94:iload           5
	//*  46   96:iconst_1        
	//*  47   97:iadd            
	//*  48   98:istore          5
	//*  49  100:goto            23
	//*  50  103:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (list)), i);
			}
			continue; /* Loop/switch isn't completed */
		}
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_70;
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		continue; /* Loop/switch isn't completed */
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
		i++;
		  goto _L3
_L2:
	//*  51  104:astore          8
	//*  52  106:goto            84
	}

	public void serializeTypedContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		boolean flag;
		int k;
		k = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method int List.size()>
	//    2    6:istore          7
		if(k == 0)
	//*   3    8:iload           7
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		flag = false;
	//    6   14:iconst_0        
	//    7   15:istore          6
		i = 0;
	//    8   17:iconst_0        
	//    9   18:istore          4
		j = ((int) (flag));
	//   10   20:iload           6
	//   11   22:istore          5
		TypeSerializer typeserializer = _valueTypeSerializer;
	//   12   24:aload_0         
	//   13   25:getfield        #110 <Field TypeSerializer _valueTypeSerializer>
	//   14   28:astore          12
		j = ((int) (flag));
	//   15   30:iload           6
	//   16   32:istore          5
		Object obj = ((Object) (_dynamicSerializers));
	//   17   34:aload_0         
	//   18   35:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//   19   38:astore          8
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   20   40:iload           4
	//   21   42:iload           7
	//   22   44:icmpge          222
		j = i;
	//   23   47:iload           4
	//   24   49:istore          5
		Object obj3 = list.get(i);
	//   25   51:aload_1         
	//   26   52:iload           4
	//   27   54:invokeinterface #121 <Method Object List.get(int)>
	//   28   59:astore          13
		if(obj3 == null)
	//*  29   61:aload           13
	//*  30   63:ifnonnull       78
		{
			j = i;
	//   31   66:iload           4
	//   32   68:istore          5
			Object obj1;
			Object obj2;
			JsonSerializer jsonserializer;
			Class class1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   33   70:aload_3         
	//   34   71:aload_2         
	//   35   72:invokevirtual   #125 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_203;
	//   36   75:goto            203
			}
	//*  37   78:iload           4
	//*  38   80:istore          5
	//*  39   82:aload           13
	//*  40   84:invokevirtual   #131 <Method Class Object.getClass()>
	//*  41   87:astore          14
	//*  42   89:iload           4
	//*  43   91:istore          5
	//*  44   93:aload           8
	//*  45   95:aload           14
	//*  46   97:invokevirtual   #137 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  47  100:astore          11
	//*  48  102:aload           8
	//*  49  104:astore          9
	//*  50  106:aload           11
	//*  51  108:astore          10
	//*  52  110:aload           11
	//*  53  112:ifnonnull       184
	//*  54  115:iload           4
	//*  55  117:istore          5
	//*  56  119:aload_0         
	//*  57  120:getfield        #141 <Field JavaType _elementType>
	//*  58  123:invokevirtual   #146 <Method boolean JavaType.hasGenericTypes()>
	//*  59  126:ifeq            155
	//*  60  129:iload           4
	//*  61  131:istore          5
	//*  62  133:aload_0         
	//*  63  134:aload           8
	//*  64  136:aload_3         
	//*  65  137:aload_0         
	//*  66  138:getfield        #141 <Field JavaType _elementType>
	//*  67  141:aload           14
	//*  68  143:invokevirtual   #150 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  69  146:aload_3         
	//*  70  147:invokevirtual   #154 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  71  150:astore          8
	//*  72  152:goto            170
	//*  73  155:iload           4
	//*  74  157:istore          5
	//*  75  159:aload_0         
	//*  76  160:aload           8
	//*  77  162:aload           14
	//*  78  164:aload_3         
	//*  79  165:invokevirtual   #157 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//*  80  168:astore          8
	//*  81  170:iload           4
	//*  82  172:istore          5
	//*  83  174:aload_0         
	//*  84  175:getfield        #117 <Field PropertySerializerMap _dynamicSerializers>
	//*  85  178:astore          9
	//*  86  180:aload           8
	//*  87  182:astore          10
	//*  88  184:iload           4
	//*  89  186:istore          5
	//*  90  188:aload           10
	//*  91  190:aload           13
	//*  92  192:aload_2         
	//*  93  193:aload_3         
	//*  94  194:aload           12
	//*  95  196:invokevirtual   #169 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  96  199:aload           9
	//*  97  201:astore          8
	//*  98  203:iload           4
	//*  99  205:iconst_1        
	//* 100  206:iadd            
	//* 101  207:istore          4
	//* 102  209:goto            40
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//* 103  212:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//  104  213:aload_0         
	//  105  214:aload_3         
	//  106  215:aload_2         
	//  107  216:aload_1         
	//  108  217:iload           5
	//  109  219:invokevirtual   #165 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		class1 = obj3.getClass();
		j = i;
		jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
		obj1 = obj;
		obj2 = ((Object) (jsonserializer));
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_184;
		j = i;
		if(!_elementType.hasGenericTypes())
			break MISSING_BLOCK_LABEL_155;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider)));
		break MISSING_BLOCK_LABEL_170;
		j = i;
		obj = ((Object) (_findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider)));
		j = i;
		obj1 = ((Object) (_dynamicSerializers));
		obj2 = obj;
		j = i;
		((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
		obj = obj1;
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//  110  222:return          
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
