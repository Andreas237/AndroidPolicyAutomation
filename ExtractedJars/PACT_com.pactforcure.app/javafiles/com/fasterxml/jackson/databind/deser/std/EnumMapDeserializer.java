// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class EnumMapDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{

	public EnumMapDeserializer(JavaType javatype, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ContainerDeserializerBase(JavaType)>
		_mapType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #30  <Field JavaType _mapType>
		_enumClass = javatype.getKeyType().getRawClass();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #36  <Method JavaType JavaType.getKeyType()>
	//    9   15:invokevirtual   #40  <Method Class JavaType.getRawClass()>
	//   10   18:putfield        #42  <Field Class _enumClass>
		_keyDeserializer = keydeserializer;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #44  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = jsondeserializer;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #46  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//   20   37:return          
	}

	protected EnumMap constructMap()
	{
		return new EnumMap(_enumClass);
	//    0    0:new             #55  <Class EnumMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field Class _enumClass>
	//    4    8:invokespecial   #58  <Method void EnumMap(Class)>
	//    5   11:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_keyDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field KeyDeserializer _keyDeserializer>
	//    2    4:astore          4
		KeyDeserializer keydeserializer = ((KeyDeserializer) (obj));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(obj == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       27
			keydeserializer = deserializationcontext.findKeyDeserializer(_mapType.getKeyType(), beanproperty);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #30  <Field JavaType _mapType>
	//   10   19:invokevirtual   #36  <Method JavaType JavaType.getKeyType()>
	//   11   22:aload_2         
	//   12   23:invokevirtual   #69  <Method KeyDeserializer DeserializationContext.findKeyDeserializer(JavaType, BeanProperty)>
	//   13   26:astore_3        
		obj = ((Object) (_valueDeserializer));
	//   14   27:aload_0         
	//   15   28:getfield        #46  <Field JsonDeserializer _valueDeserializer>
	//   16   31:astore          4
		Object obj1 = ((Object) (_mapType.getContentType()));
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field JavaType _mapType>
	//   19   37:invokevirtual   #72  <Method JavaType JavaType.getContentType()>
	//   20   40:astore          5
		if(obj == null)
	//*  21   42:aload           4
	//*  22   44:ifnonnull       87
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty)));
	//   23   47:aload_1         
	//   24   48:aload           5
	//   25   50:aload_2         
	//   26   51:invokevirtual   #76  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   27   54:astore_1        
		else
	//*  28   55:aload_0         
	//*  29   56:getfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//*  30   59:astore          5
	//*  31   61:aload           5
	//*  32   63:astore          4
	//*  33   65:aload           5
	//*  34   67:ifnull          78
	//*  35   70:aload           5
	//*  36   72:aload_2         
	//*  37   73:invokevirtual   #82  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//*  38   76:astore          4
	//*  39   78:aload_0         
	//*  40   79:aload_3         
	//*  41   80:aload_1         
	//*  42   81:aload           4
	//*  43   83:invokevirtual   #86  <Method EnumMapDeserializer withResolved(KeyDeserializer, JsonDeserializer, TypeDeserializer)>
	//*  44   86:areturn         
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, ((JavaType) (obj1)))));
	//   45   87:aload_1         
	//   46   88:aload           4
	//   47   90:aload_2         
	//   48   91:aload           5
	//   49   93:invokevirtual   #90  <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   50   96:astore_1        
		obj1 = ((Object) (_valueTypeDeserializer));
		obj = obj1;
		if(obj1 != null)
			obj = ((Object) (((TypeDeserializer) (obj1)).forProperty(beanproperty)));
		return ((JsonDeserializer) (withResolved(keydeserializer, ((JsonDeserializer) (deserializationcontext)), ((TypeDeserializer) (obj)))));
	//*  51   97:goto            55
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #101 <Method EnumMap deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public EnumMap deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		EnumMap enummap;
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		if(jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #109 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #115 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       20
			return (EnumMap)_deserializeFromEmpty(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #118 <Method Object _deserializeFromEmpty(JsonParser, DeserializationContext)>
	//    8   16:checkcast       #55  <Class EnumMap>
	//    9   19:areturn         
		enummap = constructMap();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #120 <Method EnumMap constructMap()>
	//   12   24:astore          4
		jsondeserializer = _valueDeserializer;
	//   13   26:aload_0         
	//   14   27:getfield        #46  <Field JsonDeserializer _valueDeserializer>
	//   15   30:astore          5
		typedeserializer = _valueTypeDeserializer;
	//   16   32:aload_0         
	//   17   33:getfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//   18   36:astore          6
_L2:
		Object obj;
		Enum enum;
		String s;
		if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
			break MISSING_BLOCK_LABEL_205;
	//   19   38:aload_1         
	//   20   39:invokevirtual   #123 <Method JsonToken JsonParser.nextToken()>
	//   21   42:getstatic       #126 <Field JsonToken JsonToken.FIELD_NAME>
	//   22   45:if_acmpne       205
		s = jsonparser.getCurrentName();
	//   23   48:aload_1         
	//   24   49:invokevirtual   #130 <Method String JsonParser.getCurrentName()>
	//   25   52:astore          8
		enum = (Enum)_keyDeserializer.deserializeKey(s, deserializationcontext);
	//   26   54:aload_0         
	//   27   55:getfield        #44  <Field KeyDeserializer _keyDeserializer>
	//   28   58:aload           8
	//   29   60:aload_2         
	//   30   61:invokevirtual   #136 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   31   64:checkcast       #138 <Class Enum>
	//   32   67:astore          7
		if(enum == null)
	//*  33   69:aload           7
	//*  34   71:ifnonnull       133
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  35   74:aload_2         
	//*  36   75:getstatic       #144 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  37   78:invokevirtual   #148 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  38   81:ifne            120
				throw deserializationcontext.weirdStringException(s, _enumClass, (new StringBuilder()).append("value not one of declared Enum instance names for ").append(((Object) (_mapType.getKeyType()))).toString());
	//   39   84:aload_2         
	//   40   85:aload           8
	//   41   87:aload_0         
	//   42   88:getfield        #42  <Field Class _enumClass>
	//   43   91:new             #150 <Class StringBuilder>
	//   44   94:dup             
	//   45   95:invokespecial   #153 <Method void StringBuilder()>
	//   46   98:ldc1            #155 <String "value not one of declared Enum instance names for ">
	//   47  100:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   48  103:aload_0         
	//   49  104:getfield        #30  <Field JavaType _mapType>
	//   50  107:invokevirtual   #36  <Method JavaType JavaType.getKeyType()>
	//   51  110:invokevirtual   #162 <Method StringBuilder StringBuilder.append(Object)>
	//   52  113:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   53  116:invokevirtual   #169 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   54  119:athrow          
			jsonparser.nextToken();
	//   55  120:aload_1         
	//   56  121:invokevirtual   #123 <Method JsonToken JsonParser.nextToken()>
	//   57  124:pop             
			jsonparser.skipChildren();
	//   58  125:aload_1         
	//   59  126:invokevirtual   #173 <Method JsonParser JsonParser.skipChildren()>
	//   60  129:pop             
			continue; /* Loop/switch isn't completed */
	//   61  130:goto            38
		}
		obj = ((Object) (jsonparser.nextToken()));
	//   62  133:aload_1         
	//   63  134:invokevirtual   #123 <Method JsonToken JsonParser.nextToken()>
	//   64  137:astore_3        
		if(obj != JsonToken.VALUE_NULL)
			break; /* Loop/switch isn't completed */
	//   65  138:aload_3         
	//   66  139:getstatic       #176 <Field JsonToken JsonToken.VALUE_NULL>
	//   67  142:if_acmpne       164
		obj = jsondeserializer.getNullValue(deserializationcontext);
	//   68  145:aload           5
	//   69  147:aload_2         
	//   70  148:invokevirtual   #182 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   71  151:astore_3        
_L3:
		enummap.put(enum, obj);
	//   72  152:aload           4
	//   73  154:aload           7
	//   74  156:aload_3         
	//   75  157:invokevirtual   #186 <Method Object EnumMap.put(Enum, Object)>
	//   76  160:pop             
		if(true) goto _L2; else goto _L1
	//   77  161:goto            38
_L1:
label0:
		{
			if(typedeserializer != null)
				break label0;
	//   78  164:aload           6
	//   79  166:ifnonnull       180
			try
			{
				obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
	//   80  169:aload           5
	//   81  171:aload_1         
	//   82  172:aload_2         
	//   83  173:invokevirtual   #188 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   84  176:astore_3        
			}
	//*  85  177:goto            152
	//*  86  180:aload           5
	//*  87  182:aload_1         
	//*  88  183:aload_2         
	//*  89  184:aload           6
	//*  90  186:invokevirtual   #192 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  91  189:astore_3        
	//*  92  190:goto            152
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  93  193:astore_1        
			{
				wrapAndThrow(((Throwable) (jsonparser)), ((Object) (enummap)), s);
	//   94  194:aload_0         
	//   95  195:aload_1         
	//   96  196:aload           4
	//   97  198:aload           8
	//   98  200:invokevirtual   #196 <Method void wrapAndThrow(Throwable, Object, String)>
				return null;
	//   99  203:aconst_null     
	//  100  204:areturn         
			}
		}
		  goto _L3
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		  goto _L3
		return enummap;
	//  101  205:aload           4
	//  102  207:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #200 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _mapType.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _mapType>
	//    2    4:invokevirtual   #72  <Method JavaType JavaType.getContentType()>
	//    3    7:areturn         
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _keyDeserializer == null && _valueTypeDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field KeyDeserializer _keyDeserializer>
	//    5   11:ifnonnull       23
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//    8   18:ifnonnull       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public EnumMapDeserializer withResolved(KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		if(keydeserializer == _keyDeserializer && jsondeserializer == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #44  <Field KeyDeserializer _keyDeserializer>
	//*   3    5:if_acmpne       26
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #46  <Field JsonDeserializer _valueDeserializer>
	//*   7   13:if_acmpne       26
	//*   8   16:aload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new EnumMapDeserializer(_mapType, keydeserializer, jsondeserializer, _valueTypeDeserializer);
	//   14   26:new             #2   <Class EnumMapDeserializer>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #30  <Field JavaType _mapType>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:aload_0         
	//   21   37:getfield        #48  <Field TypeDeserializer _valueTypeDeserializer>
	//   22   40:invokespecial   #207 <Method void EnumMapDeserializer(JavaType, KeyDeserializer, JsonDeserializer, TypeDeserializer)>
	//   23   43:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _enumClass;
	protected KeyDeserializer _keyDeserializer;
	protected final JavaType _mapType;
	protected JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
