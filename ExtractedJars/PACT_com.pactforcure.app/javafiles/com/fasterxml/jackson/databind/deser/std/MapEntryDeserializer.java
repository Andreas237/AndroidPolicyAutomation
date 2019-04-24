// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class MapEntryDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{

	public MapEntryDeserializer(JavaType javatype, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void ContainerDeserializerBase(JavaType)>
		if(javatype.containedTypeCount() != 2)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #32  <Method int JavaType.containedTypeCount()>
	//*   5    9:iconst_2        
	//*   6   10:icmpeq          40
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Missing generic type information for ").append(((Object) (javatype))).toString());
	//    7   13:new             #34  <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:new             #36  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void StringBuilder()>
	//   12   24:ldc1            #41  <String "Missing generic type information for ">
	//   13   26:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   17   36:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
		} else
		{
			_type = javatype;
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:putfield        #57  <Field JavaType _type>
			_keyDeserializer = keydeserializer;
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:putfield        #59  <Field KeyDeserializer _keyDeserializer>
			_valueDeserializer = jsondeserializer;
	//   25   50:aload_0         
	//   26   51:aload_3         
	//   27   52:putfield        #61  <Field JsonDeserializer _valueDeserializer>
			_valueTypeDeserializer = typedeserializer;
	//   28   55:aload_0         
	//   29   56:aload           4
	//   30   58:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
			return;
	//   31   61:return          
		}
	}

	protected MapEntryDeserializer(MapEntryDeserializer mapentrydeserializer)
	{
		super(mapentrydeserializer._type);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #57  <Field JavaType _type>
	//    3    5:invokespecial   #26  <Method void ContainerDeserializerBase(JavaType)>
		_type = mapentrydeserializer._type;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #57  <Field JavaType _type>
	//    7   13:putfield        #57  <Field JavaType _type>
		_keyDeserializer = mapentrydeserializer._keyDeserializer;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #59  <Field KeyDeserializer _keyDeserializer>
	//   11   21:putfield        #59  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = mapentrydeserializer._valueDeserializer;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//   15   29:putfield        #61  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = mapentrydeserializer._valueTypeDeserializer;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   19   37:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   20   40:return          
	}

	protected MapEntryDeserializer(MapEntryDeserializer mapentrydeserializer, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(mapentrydeserializer._type);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #57  <Field JavaType _type>
	//    3    5:invokespecial   #26  <Method void ContainerDeserializerBase(JavaType)>
		_type = mapentrydeserializer._type;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #57  <Field JavaType _type>
	//    7   13:putfield        #57  <Field JavaType _type>
		_keyDeserializer = keydeserializer;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #59  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = jsondeserializer;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #61  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:putfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   17   32:return          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (_keyDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field KeyDeserializer _keyDeserializer>
	//    2    4:astore          4
		Object obj;
		Object obj2;
		if(obj1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       92
		{
			obj = ((Object) (deserializationcontext.findKeyDeserializer(_type.containedType(0), beanproperty)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field JavaType _type>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #77  <Method JavaType JavaType.containedType(int)>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #83  <Method KeyDeserializer DeserializationContext.findKeyDeserializer(JavaType, BeanProperty)>
	//   12   24:astore_3        
		} else
	//*  13   25:aload_0         
	//*  14   26:aload_1         
	//*  15   27:aload_2         
	//*  16   28:aload_0         
	//*  17   29:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//*  18   32:invokevirtual   #87  <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//*  19   35:astore          4
	//*  20   37:aload_0         
	//*  21   38:getfield        #57  <Field JavaType _type>
	//*  22   41:iconst_1        
	//*  23   42:invokevirtual   #77  <Method JavaType JavaType.containedType(int)>
	//*  24   45:astore          5
	//*  25   47:aload           4
	//*  26   49:ifnonnull       119
	//*  27   52:aload_1         
	//*  28   53:aload           5
	//*  29   55:aload_2         
	//*  30   56:invokevirtual   #91  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//*  31   59:astore_1        
	//*  32   60:aload_0         
	//*  33   61:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//*  34   64:astore          5
	//*  35   66:aload           5
	//*  36   68:astore          4
	//*  37   70:aload           5
	//*  38   72:ifnull          83
	//*  39   75:aload           5
	//*  40   77:aload_2         
	//*  41   78:invokevirtual   #97  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//*  42   81:astore          4
	//*  43   83:aload_0         
	//*  44   84:aload_3         
	//*  45   85:aload           4
	//*  46   87:aload_1         
	//*  47   88:invokevirtual   #101 <Method MapEntryDeserializer withResolved(KeyDeserializer, TypeDeserializer, JsonDeserializer)>
	//*  48   91:areturn         
		{
			obj = obj1;
	//   49   92:aload           4
	//   50   94:astore_3        
			if(obj1 instanceof ContextualKeyDeserializer)
	//*  51   95:aload           4
	//*  52   97:instanceof      #103 <Class ContextualKeyDeserializer>
	//*  53  100:ifeq            25
				obj = ((Object) (((ContextualKeyDeserializer)obj1).createContextual(deserializationcontext, beanproperty)));
	//   54  103:aload           4
	//   55  105:checkcast       #103 <Class ContextualKeyDeserializer>
	//   56  108:aload_1         
	//   57  109:aload_2         
	//   58  110:invokeinterface #106 <Method KeyDeserializer ContextualKeyDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//   59  115:astore_3        
		}
		obj1 = ((Object) (findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer)));
		obj2 = ((Object) (_type.containedType(1)));
		if(obj1 == null)
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj2)), beanproperty)));
		else
	//*  60  116:goto            25
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj1)), beanproperty, ((JavaType) (obj2)))));
	//   61  119:aload_1         
	//   62  120:aload           4
	//   63  122:aload_2         
	//   64  123:aload           5
	//   65  125:invokevirtual   #110 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   66  128:astore_1        
		obj2 = ((Object) (_valueTypeDeserializer));
		obj1 = obj2;
		if(obj2 != null)
			obj1 = ((Object) (((TypeDeserializer) (obj2)).forProperty(beanproperty)));
		return ((JsonDeserializer) (withResolved(((KeyDeserializer) (obj)), ((TypeDeserializer) (obj1)), ((JsonDeserializer) (deserializationcontext)))));
	//*  67  129:goto            60
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #121 <Method java.util.Map$Entry deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (java.util.Map.Entry)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #124 <Class java.util.Map$Entry>
	//    5    7:invokevirtual   #127 <Method java.util.Map$Entry deserialize(JsonParser, DeserializationContext, java.util.Map$Entry)>
	//    6   10:areturn         
	}

	public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		Object obj1;
		Object obj2;
		String s;
		TypeDeserializer typedeserializer;
		JsonToken jsontoken;
		obj1 = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #135 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj1 != JsonToken.START_OBJECT && obj1 != JsonToken.FIELD_NAME && obj1 != JsonToken.END_OBJECT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #141 <Field JsonToken JsonToken.START_OBJECT>
	//*   5   11:if_acmpeq       40
	//*   6   14:aload           4
	//*   7   16:getstatic       #144 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   19:if_acmpeq       40
	//*   9   22:aload           4
	//*  10   24:getstatic       #147 <Field JsonToken JsonToken.END_OBJECT>
	//*  11   27:if_acmpeq       40
			return (java.util.Map.Entry)_deserializeFromEmpty(jsonparser, deserializationcontext);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokevirtual   #150 <Method Object _deserializeFromEmpty(JsonParser, DeserializationContext)>
	//   16   36:checkcast       #124 <Class java.util.Map$Entry>
	//   17   39:areturn         
		obj = obj1;
	//   18   40:aload           4
	//   19   42:astore_3        
		if(obj1 == JsonToken.START_OBJECT)
	//*  20   43:aload           4
	//*  21   45:getstatic       #141 <Field JsonToken JsonToken.START_OBJECT>
	//*  22   48:if_acmpne       56
			obj = ((Object) (jsonparser.nextToken()));
	//   23   51:aload_1         
	//   24   52:invokevirtual   #153 <Method JsonToken JsonParser.nextToken()>
	//   25   55:astore_3        
		if(obj != JsonToken.FIELD_NAME)
	//*  26   56:aload_3         
	//*  27   57:getstatic       #144 <Field JsonToken JsonToken.FIELD_NAME>
	//*  28   60:if_acmpeq       87
			if(obj == JsonToken.END_OBJECT)
	//*  29   63:aload_3         
	//*  30   64:getstatic       #147 <Field JsonToken JsonToken.END_OBJECT>
	//*  31   67:if_acmpne       77
				throw deserializationcontext.mappingException("Can not deserialize a Map.Entry out of empty JSON Object");
	//   32   70:aload_2         
	//   33   71:ldc1            #155 <String "Can not deserialize a Map.Entry out of empty JSON Object">
	//   34   73:invokevirtual   #159 <Method JsonMappingException DeserializationContext.mappingException(String)>
	//   35   76:athrow          
			else
				throw deserializationcontext.mappingException(handledType(), ((JsonToken) (obj)));
	//   36   77:aload_2         
	//   37   78:aload_0         
	//   38   79:invokevirtual   #163 <Method Class handledType()>
	//   39   82:aload_3         
	//   40   83:invokevirtual   #166 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   41   86:athrow          
		obj = ((Object) (_keyDeserializer));
	//   42   87:aload_0         
	//   43   88:getfield        #59  <Field KeyDeserializer _keyDeserializer>
	//   44   91:astore_3        
		obj1 = ((Object) (_valueDeserializer));
	//   45   92:aload_0         
	//   46   93:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//   47   96:astore          4
		typedeserializer = _valueTypeDeserializer;
	//   48   98:aload_0         
	//   49   99:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//   50  102:astore          7
		s = jsonparser.getCurrentName();
	//   51  104:aload_1         
	//   52  105:invokevirtual   #169 <Method String JsonParser.getCurrentName()>
	//   53  108:astore          6
		obj2 = ((KeyDeserializer) (obj)).deserializeKey(s, deserializationcontext);
	//   54  110:aload_3         
	//   55  111:aload           6
	//   56  113:aload_2         
	//   57  114:invokevirtual   #175 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   58  117:astore          5
		obj = null;
	//   59  119:aconst_null     
	//   60  120:astore_3        
		jsontoken = jsonparser.nextToken();
	//   61  121:aload_1         
	//   62  122:invokevirtual   #153 <Method JsonToken JsonParser.nextToken()>
	//   63  125:astore          8
		if(jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   64  127:aload           8
	//   65  129:getstatic       #178 <Field JsonToken JsonToken.VALUE_NULL>
	//   66  132:if_acmpne       200
_L1:
		obj1 = ((JsonDeserializer) (obj1)).getNullValue(deserializationcontext);
	//   67  135:aload           4
	//   68  137:aload_2         
	//   69  138:invokevirtual   #184 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   70  141:astore          4
		obj = obj1;
	//   71  143:aload           4
	//   72  145:astore_3        
_L3:
		obj1 = ((Object) (jsonparser.nextToken()));
	//   73  146:aload_1         
	//   74  147:invokevirtual   #153 <Method JsonToken JsonParser.nextToken()>
	//   75  150:astore          4
		if(obj1 != JsonToken.END_OBJECT)
	//*  76  152:aload           4
	//*  77  154:getstatic       #147 <Field JsonToken JsonToken.END_OBJECT>
	//*  78  157:if_acmpeq       277
		{
			if(obj1 == JsonToken.FIELD_NAME)
	//*  79  160:aload           4
	//*  80  162:getstatic       #144 <Field JsonToken JsonToken.FIELD_NAME>
	//*  81  165:if_acmpne       252
				throw deserializationcontext.mappingException((new StringBuilder()).append("Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '").append(jsonparser.getCurrentName()).append("')").toString());
	//   82  168:aload_2         
	//   83  169:new             #36  <Class StringBuilder>
	//   84  172:dup             
	//   85  173:invokespecial   #39  <Method void StringBuilder()>
	//   86  176:ldc1            #186 <String "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '">
	//   87  178:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   88  181:aload_1         
	//   89  182:invokevirtual   #169 <Method String JsonParser.getCurrentName()>
	//   90  185:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   91  188:ldc1            #188 <String "')">
	//   92  190:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   93  193:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   94  196:invokevirtual   #159 <Method JsonMappingException DeserializationContext.mappingException(String)>
	//   95  199:athrow          
			else
	//*  96  200:aload           7
	//*  97  202:ifnonnull       220
	//*  98  205:aload           4
	//*  99  207:aload_1         
	//* 100  208:aload_2         
	//* 101  209:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//* 102  212:astore          4
	//* 103  214:aload           4
	//* 104  216:astore_3        
	//* 105  217:goto            146
	//* 106  220:aload           4
	//* 107  222:aload_1         
	//* 108  223:aload_2         
	//* 109  224:aload           7
	//* 110  226:invokevirtual   #194 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//* 111  229:astore          4
	//* 112  231:aload           4
	//* 113  233:astore_3        
	//* 114  234:goto            146
	//* 115  237:astore          4
	//* 116  239:aload_0         
	//* 117  240:aload           4
	//* 118  242:ldc1            #124 <Class java.util.Map$Entry>
	//* 119  244:aload           6
	//* 120  246:invokevirtual   #198 <Method void wrapAndThrow(Throwable, Object, String)>
	//* 121  249:goto            146
				throw deserializationcontext.mappingException((new StringBuilder()).append("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ").append(obj1).toString());
	//  122  252:aload_2         
	//  123  253:new             #36  <Class StringBuilder>
	//  124  256:dup             
	//  125  257:invokespecial   #39  <Method void StringBuilder()>
	//  126  260:ldc1            #200 <String "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ">
	//  127  262:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//  128  265:aload           4
	//  129  267:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//  130  270:invokevirtual   #52  <Method String StringBuilder.toString()>
	//  131  273:invokevirtual   #159 <Method JsonMappingException DeserializationContext.mappingException(String)>
	//  132  276:athrow          
		} else
		{
			return ((java.util.Map.Entry) (new java.util.AbstractMap.SimpleEntry(obj2, obj)));
	//  133  277:new             #202 <Class java.util.AbstractMap$SimpleEntry>
	//  134  280:dup             
	//  135  281:aload           5
	//  136  283:aload_3         
	//  137  284:invokespecial   #205 <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//  138  287:areturn         
		}
_L2:
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_220;
		obj1 = ((JsonDeserializer) (obj1)).deserialize(jsonparser, deserializationcontext);
		obj = obj1;
		  goto _L3
		obj1 = ((JsonDeserializer) (obj1)).deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		obj = obj1;
		  goto _L3
		obj1;
		wrapAndThrow(((Throwable) (obj1)), java/util/Map$Entry, s);
		  goto _L3
	}

	public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, java.util.Map.Entry entry)
		throws IOException
	{
		throw new IllegalStateException("Can not update Map.Entry values");
	//    0    0:new             #208 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #210 <String "Can not update Map.Entry values">
	//    3    6:invokespecial   #211 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #215 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _type.containedType(1);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JavaType _type>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #77  <Method JavaType JavaType.containedType(int)>
	//    4    8:areturn         
	}

	public JavaType getValueType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JavaType _type>
	//    2    4:areturn         
	}

	protected MapEntryDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		if(_keyDeserializer == keydeserializer && _valueDeserializer == jsondeserializer && _valueTypeDeserializer == typedeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field KeyDeserializer _keyDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:getfield        #61  <Field JsonDeserializer _valueDeserializer>
	//*   6   12:aload_3         
	//*   7   13:if_acmpne       26
	//*   8   16:aload_0         
	//*   9   17:getfield        #63  <Field TypeDeserializer _valueTypeDeserializer>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new MapEntryDeserializer(this, keydeserializer, jsondeserializer, typedeserializer);
	//   14   26:new             #2   <Class MapEntryDeserializer>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #223 <Method void MapEntryDeserializer(MapEntryDeserializer, KeyDeserializer, JsonDeserializer, TypeDeserializer)>
	//   21   37:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final KeyDeserializer _keyDeserializer;
	protected final JavaType _type;
	protected final JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
