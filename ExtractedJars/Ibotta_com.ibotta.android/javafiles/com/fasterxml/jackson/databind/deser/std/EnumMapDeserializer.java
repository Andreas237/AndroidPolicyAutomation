// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.util.EnumMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class EnumMapDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer, ResolvableDeserializer
{

	public EnumMapDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider)
	{
		super(javatype, nullvalueprovider, ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           6
	//    3    4:aconst_null     
	//    4    5:invokespecial   #33  <Method void ContainerDeserializerBase(JavaType, NullValueProvider, Boolean)>
		_enumClass = javatype.getKeyType().getRawClass();
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:invokevirtual   #39  <Method JavaType JavaType.getKeyType()>
	//    8   13:invokevirtual   #43  <Method Class JavaType.getRawClass()>
	//    9   16:putfield        #45  <Field Class _enumClass>
		_keyDeserializer = keydeserializer;
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:putfield        #47  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = jsondeserializer;
	//   13   24:aload_0         
	//   14   25:aload           4
	//   15   27:putfield        #49  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
		_valueInstantiator = valueinstantiator;
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:putfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   22   41:return          
	}

	protected EnumMapDeserializer(EnumMapDeserializer enummapdeserializer, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider)
	{
		super(((ContainerDeserializerBase) (enummapdeserializer)), nullvalueprovider, enummapdeserializer._unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           5
	//    3    4:aload_1         
	//    4    5:getfield        #61  <Field Boolean _unwrapSingle>
	//    5    8:invokespecial   #64  <Method void ContainerDeserializerBase(ContainerDeserializerBase, NullValueProvider, Boolean)>
		_enumClass = enummapdeserializer._enumClass;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:getfield        #45  <Field Class _enumClass>
	//    9   16:putfield        #45  <Field Class _enumClass>
		_keyDeserializer = keydeserializer;
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:putfield        #47  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = jsondeserializer;
	//   13   24:aload_0         
	//   14   25:aload_3         
	//   15   26:putfield        #49  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   16   29:aload_0         
	//   17   30:aload           4
	//   18   32:putfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
		_valueInstantiator = enummapdeserializer._valueInstantiator;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   22   40:putfield        #53  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = enummapdeserializer._delegateDeserializer;
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:getfield        #66  <Field JsonDeserializer _delegateDeserializer>
	//   26   48:putfield        #66  <Field JsonDeserializer _delegateDeserializer>
		_propertyBasedCreator = enummapdeserializer._propertyBasedCreator;
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:getfield        #68  <Field PropertyBasedCreator _propertyBasedCreator>
	//   30   56:putfield        #68  <Field PropertyBasedCreator _propertyBasedCreator>
	//   31   59:return          
	}

	public EnumMap _deserializeUsingProperties(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		PropertyBasedCreator propertybasedcreator;
		PropertyValueBuffer propertyvaluebuffer;
		propertybasedcreator = _propertyBasedCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field PropertyBasedCreator _propertyBasedCreator>
	//    2    4:astore          5
		propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader) (null)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #81  <Method PropertyValueBuffer PropertyBasedCreator.startBuilding(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)>
	//    8   14:astore          6
		if(jsonparser.isExpectedStartObjectToken())
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #87  <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*  11   20:ifeq            31
			obj = ((Object) (jsonparser.nextFieldName()));
	//   12   23:aload_1         
	//   13   24:invokevirtual   #91  <Method String JsonParser.nextFieldName()>
	//   14   27:astore_3        
		else
	//*  15   28:goto            51
		if(jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*  16   31:aload_1         
	//*  17   32:getstatic       #97  <Field JsonToken JsonToken.FIELD_NAME>
	//*  18   35:invokevirtual   #101 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  19   38:ifeq            49
			obj = ((Object) (jsonparser.getCurrentName()));
	//   20   41:aload_1         
	//   21   42:invokevirtual   #104 <Method String JsonParser.getCurrentName()>
	//   22   45:astore_3        
		else
	//*  23   46:goto            51
			obj = null;
	//   24   49:aconst_null     
	//   25   50:astore_3        
_L2:
		Object obj1;
		Object obj3;
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   26   51:aload_3         
	//   27   52:ifnull          313
		obj1 = ((Object) (jsonparser.nextToken()));
	//   28   55:aload_1         
	//   29   56:invokevirtual   #108 <Method JsonToken JsonParser.nextToken()>
	//   30   59:astore          4
		obj3 = ((Object) (propertybasedcreator.findCreatorProperty(((String) (obj)))));
	//   31   61:aload           5
	//   32   63:aload_3         
	//   33   64:invokevirtual   #112 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   34   67:astore          7
		if(obj3 != null)
	//*  35   69:aload           7
	//*  36   71:ifnull          131
		{
			if(propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj3)), ((SettableBeanProperty) (obj3)).deserialize(jsonparser, deserializationcontext)))
	//*  37   74:aload           6
	//*  38   76:aload           7
	//*  39   78:aload           7
	//*  40   80:aload_1         
	//*  41   81:aload_2         
	//*  42   82:invokevirtual   #118 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//*  43   85:invokevirtual   #124 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//*  44   88:ifeq            288
			{
				try
				{
					obj1 = ((Object) ((EnumMap)propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//   45   91:aload           5
	//   46   93:aload_2         
	//   47   94:aload           6
	//   48   96:invokevirtual   #128 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//   49   99:checkcast       #130 <Class EnumMap>
	//   50  102:astore          4
				}
	//*  51  104:aload_0         
	//*  52  105:aload_1         
	//*  53  106:aload_2         
	//*  54  107:aload           4
	//*  55  109:invokevirtual   #133 <Method EnumMap deserialize(JsonParser, DeserializationContext, EnumMap)>
	//*  56  112:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//*  57  113:astore_1        
				{
					return (EnumMap)wrapAndThrow(((Throwable) (jsonparser)), ((Object) (_containerType.getRawClass())), ((String) (obj)));
	//   58  114:aload_0         
	//   59  115:aload_1         
	//   60  116:aload_0         
	//   61  117:getfield        #137 <Field JavaType _containerType>
	//   62  120:invokevirtual   #43  <Method Class JavaType.getRawClass()>
	//   63  123:aload_3         
	//   64  124:invokevirtual   #141 <Method Object wrapAndThrow(Throwable, Object, String)>
	//   65  127:checkcast       #130 <Class EnumMap>
	//   66  130:areturn         
				}
				return deserialize(jsonparser, deserializationcontext, ((EnumMap) (obj1)));
			}
			break MISSING_BLOCK_LABEL_288;
		}
		obj3 = ((Object) ((Enum)_keyDeserializer.deserializeKey(((String) (obj)), deserializationcontext)));
	//   67  131:aload_0         
	//   68  132:getfield        #47  <Field KeyDeserializer _keyDeserializer>
	//   69  135:aload_3         
	//   70  136:aload_2         
	//   71  137:invokevirtual   #147 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   72  140:checkcast       #149 <Class Enum>
	//   73  143:astore          7
		if(obj3 == null)
	//*  74  145:aload           7
	//*  75  147:ifnonnull       202
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  76  150:aload_2         
	//*  77  151:getstatic       #155 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  78  154:invokevirtual   #161 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  79  157:ifne            189
				return (EnumMap)deserializationcontext.handleWeirdStringValue(_enumClass, ((String) (obj)), "value not one of declared Enum instance names for %s", new Object[] {
					_containerType.getKeyType()
				});
	//   80  160:aload_2         
	//   81  161:aload_0         
	//   82  162:getfield        #45  <Field Class _enumClass>
	//   83  165:aload_3         
	//   84  166:ldc1            #163 <String "value not one of declared Enum instance names for %s">
	//   85  168:iconst_1        
	//   86  169:anewarray       Object[]
	//   87  172:dup             
	//   88  173:iconst_0        
	//   89  174:aload_0         
	//   90  175:getfield        #137 <Field JavaType _containerType>
	//   91  178:invokevirtual   #39  <Method JavaType JavaType.getKeyType()>
	//   92  181:aastore         
	//   93  182:invokevirtual   #169 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   94  185:checkcast       #130 <Class EnumMap>
	//   95  188:areturn         
			jsonparser.nextToken();
	//   96  189:aload_1         
	//   97  190:invokevirtual   #108 <Method JsonToken JsonParser.nextToken()>
	//   98  193:pop             
			jsonparser.skipChildren();
	//   99  194:aload_1         
	//  100  195:invokevirtual   #173 <Method JsonParser JsonParser.skipChildren()>
	//  101  198:pop             
			break MISSING_BLOCK_LABEL_288;
	//  102  199:goto            288
		}
		if(obj1 == JsonToken.VALUE_NULL)
	//* 103  202:aload           4
	//* 104  204:getstatic       #176 <Field JsonToken JsonToken.VALUE_NULL>
	//* 105  207:if_acmpne       238
		{
			if(_skipNullValues)
	//* 106  210:aload_0         
	//* 107  211:getfield        #180 <Field boolean _skipNullValues>
	//* 108  214:ifeq            220
				break MISSING_BLOCK_LABEL_288;
	//  109  217:goto            288
			Object obj2;
			try
			{
				obj2 = _nullProvider.getNullValue(deserializationcontext);
	//  110  220:aload_0         
	//  111  221:getfield        #184 <Field NullValueProvider _nullProvider>
	//  112  224:aload_2         
	//  113  225:invokeinterface #190 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//  114  230:astore          4
			}
	//* 115  232:aload           4
	//* 116  234:astore_3        
	//* 117  235:goto            280
	//* 118  238:aload_0         
	//* 119  239:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//* 120  242:ifnonnull       262
	//* 121  245:aload_0         
	//* 122  246:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//* 123  249:aload_1         
	//* 124  250:aload_2         
	//* 125  251:invokevirtual   #193 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//* 126  254:astore          4
	//* 127  256:aload           4
	//* 128  258:astore_3        
	//* 129  259:goto            280
	//* 130  262:aload_0         
	//* 131  263:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//* 132  266:aload_1         
	//* 133  267:aload_2         
	//* 134  268:aload_0         
	//* 135  269:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//* 136  272:invokevirtual   #197 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//* 137  275:astore          4
	//* 138  277:aload           4
	//* 139  279:astore_3        
	//* 140  280:aload           6
	//* 141  282:aload           7
	//* 142  284:aload_3         
	//* 143  285:invokevirtual   #201 <Method void PropertyValueBuffer.bufferMapProperty(Object, Object)>
	//* 144  288:aload_1         
	//* 145  289:invokevirtual   #91  <Method String JsonParser.nextFieldName()>
	//* 146  292:astore_3        
	//* 147  293:goto            51
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 148  296:astore_1        
			{
				wrapAndThrow(((Throwable) (jsonparser)), ((Object) (_containerType.getRawClass())), ((String) (obj)));
	//  149  297:aload_0         
	//  150  298:aload_1         
	//  151  299:aload_0         
	//  152  300:getfield        #137 <Field JavaType _containerType>
	//  153  303:invokevirtual   #43  <Method Class JavaType.getRawClass()>
	//  154  306:aload_3         
	//  155  307:invokevirtual   #141 <Method Object wrapAndThrow(Throwable, Object, String)>
	//  156  310:pop             
				return null;
	//  157  311:aconst_null     
	//  158  312:areturn         
			}
			obj = obj2;
			break MISSING_BLOCK_LABEL_280;
		}
		if(_valueTypeDeserializer != null)
			break MISSING_BLOCK_LABEL_262;
		obj2 = _valueDeserializer.deserialize(jsonparser, deserializationcontext);
		obj = obj2;
		break MISSING_BLOCK_LABEL_280;
		obj2 = _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
		obj = obj2;
		propertyvaluebuffer.bufferMapProperty(obj3, obj);
		obj = ((Object) (jsonparser.nextFieldName()));
		if(true) goto _L2; else goto _L1
_L1:
		try
		{
			jsonparser = ((JsonParser) ((EnumMap)propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  159  313:aload           5
	//  160  315:aload_2         
	//  161  316:aload           6
	//  162  318:invokevirtual   #128 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  163  321:checkcast       #130 <Class EnumMap>
	//  164  324:astore_1        
		}
	//* 165  325:aload_1         
	//* 166  326:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//* 167  327:astore_1        
		{
			wrapAndThrow(((Throwable) (jsonparser)), ((Object) (_containerType.getRawClass())), ((String) (obj)));
	//  168  328:aload_0         
	//  169  329:aload_1         
	//  170  330:aload_0         
	//  171  331:getfield        #137 <Field JavaType _containerType>
	//  172  334:invokevirtual   #43  <Method Class JavaType.getRawClass()>
	//  173  337:aload_3         
	//  174  338:invokevirtual   #141 <Method Object wrapAndThrow(Throwable, Object, String)>
	//  175  341:pop             
			return null;
	//  176  342:aconst_null     
	//  177  343:areturn         
		}
		return ((EnumMap) (jsonparser));
	}

	protected EnumMap constructMap(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueInstantiator));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
			return new EnumMap(_enumClass);
	//    5    9:new             #130 <Class EnumMap>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Class _enumClass>
	//    9   17:invokespecial   #210 <Method void EnumMap(Class)>
	//   10   20:areturn         
		try
		{
			if(!((ValueInstantiator) (obj)).canCreateUsingDefault())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #215 <Method boolean ValueInstantiator.canCreateUsingDefault()>
	//*  13   25:ifne            51
				return (EnumMap)deserializationcontext.handleMissingInstantiator(handledType(), getValueInstantiator(), ((JsonParser) (null)), "no default constructor found", new Object[0]);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #218 <Method Class handledType()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #222 <Method ValueInstantiator getValueInstantiator()>
	//   19   37:aconst_null     
	//   20   38:ldc1            #224 <String "no default constructor found">
	//   21   40:iconst_0        
	//   22   41:anewarray       Object[]
	//   23   44:invokevirtual   #228 <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, JsonParser, String, Object[])>
	//   24   47:checkcast       #130 <Class EnumMap>
	//   25   50:areturn         
			obj = ((Object) ((EnumMap)_valueInstantiator.createUsingDefault(deserializationcontext)));
	//   26   51:aload_0         
	//   27   52:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   28   55:aload_1         
	//   29   56:invokevirtual   #231 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   30   59:checkcast       #130 <Class EnumMap>
	//   31   62:astore_2        
		}
	//*  32   63:aload_2         
	//*  33   64:areturn         
		catch(IOException ioexception)
	//*  34   65:astore_2        
		{
			return (EnumMap)ClassUtil.throwAsMappingException(deserializationcontext, ioexception);
	//   35   66:aload_1         
	//   36   67:aload_2         
	//   37   68:invokestatic    #237 <Method Object ClassUtil.throwAsMappingException(DeserializationContext, IOException)>
	//   38   71:checkcast       #130 <Class EnumMap>
	//   39   74:areturn         
		}
		return ((EnumMap) (obj));
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_keyDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field KeyDeserializer _keyDeserializer>
	//    2    4:astore          4
		KeyDeserializer keydeserializer = ((KeyDeserializer) (obj));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(obj == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       27
			keydeserializer = deserializationcontext.findKeyDeserializer(_containerType.getKeyType(), beanproperty);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #137 <Field JavaType _containerType>
	//   10   19:invokevirtual   #39  <Method JavaType JavaType.getKeyType()>
	//   11   22:aload_2         
	//   12   23:invokevirtual   #244 <Method KeyDeserializer DeserializationContext.findKeyDeserializer(JavaType, BeanProperty)>
	//   13   26:astore_3        
		obj = ((Object) (_valueDeserializer));
	//   14   27:aload_0         
	//   15   28:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//   16   31:astore          4
		Object obj1 = ((Object) (_containerType.getContentType()));
	//   17   33:aload_0         
	//   18   34:getfield        #137 <Field JavaType _containerType>
	//   19   37:invokevirtual   #247 <Method JavaType JavaType.getContentType()>
	//   20   40:astore          5
		if(obj == null)
	//*  21   42:aload           4
	//*  22   44:ifnonnull       59
			obj = ((Object) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty)));
	//   23   47:aload_1         
	//   24   48:aload           5
	//   25   50:aload_2         
	//   26   51:invokevirtual   #251 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   27   54:astore          4
		else
	//*  28   56:goto            70
			obj = ((Object) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, ((JavaType) (obj1)))));
	//   29   59:aload_1         
	//   30   60:aload           4
	//   31   62:aload_2         
	//   32   63:aload           5
	//   33   65:invokevirtual   #255 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   34   68:astore          4
		TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//   35   70:aload_0         
	//   36   71:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//   37   74:astore          6
		obj1 = ((Object) (typedeserializer));
	//   38   76:aload           6
	//   39   78:astore          5
		if(typedeserializer != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
			obj1 = ((Object) (typedeserializer.forProperty(beanproperty)));
	//   42   85:aload           6
	//   43   87:aload_2         
	//   44   88:invokevirtual   #261 <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//   45   91:astore          5
		return ((JsonDeserializer) (withResolved(keydeserializer, ((JsonDeserializer) (obj)), ((TypeDeserializer) (obj1)), findContentNullProvider(deserializationcontext, beanproperty, ((JsonDeserializer) (obj))))));
	//   46   93:aload_0         
	//   47   94:aload_3         
	//   48   95:aload           4
	//   49   97:aload           5
	//   50   99:aload_0         
	//   51  100:aload_1         
	//   52  101:aload_2         
	//   53  102:aload           4
	//   54  104:invokevirtual   #265 <Method NullValueProvider findContentNullProvider(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   55  107:invokevirtual   #269 <Method EnumMapDeserializer withResolved(KeyDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider)>
	//   56  110:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #274 <Method EnumMap deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (EnumMap)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #130 <Class EnumMap>
	//    5    7:invokevirtual   #133 <Method EnumMap deserialize(JsonParser, DeserializationContext, EnumMap)>
	//    6   10:areturn         
	}

	public EnumMap deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_propertyBasedCreator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field PropertyBasedCreator _propertyBasedCreator>
	//*   2    4:ifnull          14
			return _deserializeUsingProperties(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #277 <Method EnumMap _deserializeUsingProperties(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		Object obj = ((Object) (_delegateDeserializer));
	//    8   14:aload_0         
	//    9   15:getfield        #66  <Field JsonDeserializer _delegateDeserializer>
	//   10   18:astore_3        
		if(obj != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          41
			return (EnumMap)_valueInstantiator.createUsingDelegate(deserializationcontext, ((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext));
	//   13   23:aload_0         
	//   14   24:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokevirtual   #193 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   20   34:invokevirtual   #281 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   21   37:checkcast       #130 <Class EnumMap>
	//   22   40:areturn         
		obj = ((Object) (jsonparser.getCurrentToken()));
	//   23   41:aload_1         
	//   24   42:invokevirtual   #284 <Method JsonToken JsonParser.getCurrentToken()>
	//   25   45:astore_3        
		if(obj != JsonToken.START_OBJECT && obj != JsonToken.FIELD_NAME && obj != JsonToken.END_OBJECT)
	//*  26   46:aload_3         
	//*  27   47:getstatic       #287 <Field JsonToken JsonToken.START_OBJECT>
	//*  28   50:if_acmpeq       100
	//*  29   53:aload_3         
	//*  30   54:getstatic       #97  <Field JsonToken JsonToken.FIELD_NAME>
	//*  31   57:if_acmpeq       100
	//*  32   60:aload_3         
	//*  33   61:getstatic       #290 <Field JsonToken JsonToken.END_OBJECT>
	//*  34   64:if_acmpeq       100
		{
			if(obj == JsonToken.VALUE_STRING)
	//*  35   67:aload_3         
	//*  36   68:getstatic       #293 <Field JsonToken JsonToken.VALUE_STRING>
	//*  37   71:if_acmpne       90
				return (EnumMap)_valueInstantiator.createFromString(deserializationcontext, jsonparser.getText());
	//   38   74:aload_0         
	//   39   75:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   40   78:aload_2         
	//   41   79:aload_1         
	//   42   80:invokevirtual   #296 <Method String JsonParser.getText()>
	//   43   83:invokevirtual   #300 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//   44   86:checkcast       #130 <Class EnumMap>
	//   45   89:areturn         
			else
				return (EnumMap)_deserializeFromEmpty(jsonparser, deserializationcontext);
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:aload_2         
	//   49   93:invokevirtual   #303 <Method Object _deserializeFromEmpty(JsonParser, DeserializationContext)>
	//   50   96:checkcast       #130 <Class EnumMap>
	//   51   99:areturn         
		} else
		{
			return deserialize(jsonparser, deserializationcontext, constructMap(deserializationcontext));
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload_2         
	//   55  103:aload_0         
	//   56  104:aload_2         
	//   57  105:invokevirtual   #305 <Method EnumMap constructMap(DeserializationContext)>
	//   58  108:invokevirtual   #133 <Method EnumMap deserialize(JsonParser, DeserializationContext, EnumMap)>
	//   59  111:areturn         
		}
	}

	public EnumMap deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, EnumMap enummap)
		throws IOException
	{
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		jsonparser.setCurrentValue(((Object) (enummap)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #309 <Method void JsonParser.setCurrentValue(Object)>
		jsondeserializer = _valueDeserializer;
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//    5    9:astore          5
		typedeserializer = _valueTypeDeserializer;
	//    6   11:aload_0         
	//    7   12:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//    8   15:astore          6
_L2:
		JsonToken jsontoken;
		String s;
		Enum enum;
		s = jsonparser.nextFieldName();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #91  <Method String JsonParser.nextFieldName()>
	//   11   21:astore          7
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   12   23:aload           7
	//   13   25:ifnull          193
		enum = (Enum)_keyDeserializer.deserializeKey(s, deserializationcontext);
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field KeyDeserializer _keyDeserializer>
	//   16   32:aload           7
	//   17   34:aload_2         
	//   18   35:invokevirtual   #147 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   19   38:checkcast       #149 <Class Enum>
	//   20   41:astore          8
		if(enum == null)
	//*  21   43:aload           8
	//*  22   45:ifnonnull       101
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  23   48:aload_2         
	//*  24   49:getstatic       #155 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  25   52:invokevirtual   #161 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  26   55:ifne            88
				return (EnumMap)deserializationcontext.handleWeirdStringValue(_enumClass, s, "value not one of declared Enum instance names for %s", new Object[] {
					_containerType.getKeyType()
				});
	//   27   58:aload_2         
	//   28   59:aload_0         
	//   29   60:getfield        #45  <Field Class _enumClass>
	//   30   63:aload           7
	//   31   65:ldc1            #163 <String "value not one of declared Enum instance names for %s">
	//   32   67:iconst_1        
	//   33   68:anewarray       Object[]
	//   34   71:dup             
	//   35   72:iconst_0        
	//   36   73:aload_0         
	//   37   74:getfield        #137 <Field JavaType _containerType>
	//   38   77:invokevirtual   #39  <Method JavaType JavaType.getKeyType()>
	//   39   80:aastore         
	//   40   81:invokevirtual   #169 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   41   84:checkcast       #130 <Class EnumMap>
	//   42   87:areturn         
			jsonparser.nextToken();
	//   43   88:aload_1         
	//   44   89:invokevirtual   #108 <Method JsonToken JsonParser.nextToken()>
	//   45   92:pop             
			jsonparser.skipChildren();
	//   46   93:aload_1         
	//   47   94:invokevirtual   #173 <Method JsonParser JsonParser.skipChildren()>
	//   48   97:pop             
			continue; /* Loop/switch isn't completed */
	//   49   98:goto            17
		}
		jsontoken = jsonparser.nextToken();
	//   50  101:aload_1         
	//   51  102:invokevirtual   #108 <Method JsonToken JsonParser.nextToken()>
	//   52  105:astore          4
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  53  107:aload           4
	//*  54  109:getstatic       #176 <Field JsonToken JsonToken.VALUE_NULL>
	//*  55  112:if_acmpne       140
		{
			if(_skipNullValues)
	//*  56  115:aload_0         
	//*  57  116:getfield        #180 <Field boolean _skipNullValues>
	//*  58  119:ifeq            125
				continue; /* Loop/switch isn't completed */
	//   59  122:goto            17
			Object obj;
			try
			{
				obj = _nullProvider.getNullValue(deserializationcontext);
	//   60  125:aload_0         
	//   61  126:getfield        #184 <Field NullValueProvider _nullProvider>
	//   62  129:aload_2         
	//   63  130:invokeinterface #190 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   64  135:astore          4
			}
	//*  65  137:goto            168
	//*  66  140:aload           6
	//*  67  142:ifnonnull       157
	//*  68  145:aload           5
	//*  69  147:aload_1         
	//*  70  148:aload_2         
	//*  71  149:invokevirtual   #193 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  72  152:astore          4
	//*  73  154:goto            168
	//*  74  157:aload           5
	//*  75  159:aload_1         
	//*  76  160:aload_2         
	//*  77  161:aload           6
	//*  78  163:invokevirtual   #197 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  79  166:astore          4
	//*  80  168:aload_3         
	//*  81  169:aload           8
	//*  82  171:aload           4
	//*  83  173:invokevirtual   #313 <Method Object EnumMap.put(Enum, Object)>
	//*  84  176:pop             
	//*  85  177:goto            17
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  86  180:astore_1        
			{
				return (EnumMap)wrapAndThrow(((Throwable) (jsonparser)), ((Object) (enummap)), s);
	//   87  181:aload_0         
	//   88  182:aload_1         
	//   89  183:aload_3         
	//   90  184:aload           7
	//   91  186:invokevirtual   #141 <Method Object wrapAndThrow(Throwable, Object, String)>
	//   92  189:checkcast       #130 <Class EnumMap>
	//   93  192:areturn         
			}
			break MISSING_BLOCK_LABEL_168;
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_157;
		obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
		break MISSING_BLOCK_LABEL_168;
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		enummap.put(enum, obj);
		if(true) goto _L2; else goto _L1
_L1:
		return enummap;
	//   94  193:aload_3         
	//   95  194:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #317 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (constructMap(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method EnumMap constructMap(DeserializationContext)>
	//    3    5:areturn         
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _keyDeserializer == null && _valueTypeDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field KeyDeserializer _keyDeserializer>
	//    5   11:ifnonnull       23
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//    8   18:ifnonnull       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		ValueInstantiator valueinstantiator = _valueInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//    2    4:astore_2        
		if(valueinstantiator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          202
		{
			if(valueinstantiator.canCreateUsingDelegate())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #327 <Method boolean ValueInstantiator.canCreateUsingDelegate()>
	//*   7   13:ifeq            83
			{
				JavaType javatype = _valueInstantiator.getDelegateType(deserializationcontext.getConfig());
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #331 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   12   24:invokevirtual   #335 <Method JavaType ValueInstantiator.getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   13   27:astore_2        
				if(javatype == null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       71
					deserializationcontext.reportBadDefinition(_containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[] {
						_containerType, ((Object) (_valueInstantiator)).getClass().getName()
					}));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #137 <Field JavaType _containerType>
	//   19   37:ldc2            #337 <String "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'">
	//   20   40:iconst_2        
	//   21   41:anewarray       Object[]
	//   22   44:dup             
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #137 <Field JavaType _containerType>
	//   26   50:aastore         
	//   27   51:dup             
	//   28   52:iconst_1        
	//   29   53:aload_0         
	//   30   54:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   31   57:invokevirtual   #340 <Method Class Object.getClass()>
	//   32   60:invokevirtual   #345 <Method String Class.getName()>
	//   33   63:aastore         
	//   34   64:invokestatic    #351 <Method String String.format(String, Object[])>
	//   35   67:invokevirtual   #355 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   36   70:pop             
				_delegateDeserializer = findDeserializer(deserializationcontext, javatype, ((BeanProperty) (null)));
	//   37   71:aload_0         
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:aload_2         
	//   41   75:aconst_null     
	//   42   76:invokevirtual   #359 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   43   79:putfield        #66  <Field JsonDeserializer _delegateDeserializer>
				return;
	//   44   82:return          
			}
			if(_valueInstantiator.canCreateUsingArrayDelegate())
	//*  45   83:aload_0         
	//*  46   84:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//*  47   87:invokevirtual   #362 <Method boolean ValueInstantiator.canCreateUsingArrayDelegate()>
	//*  48   90:ifeq            160
			{
				JavaType javatype1 = _valueInstantiator.getArrayDelegateType(deserializationcontext.getConfig());
	//   49   93:aload_0         
	//   50   94:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   51   97:aload_1         
	//   52   98:invokevirtual   #331 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   53  101:invokevirtual   #365 <Method JavaType ValueInstantiator.getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   54  104:astore_2        
				if(javatype1 == null)
	//*  55  105:aload_2         
	//*  56  106:ifnonnull       148
					deserializationcontext.reportBadDefinition(_containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[] {
						_containerType, ((Object) (_valueInstantiator)).getClass().getName()
					}));
	//   57  109:aload_1         
	//   58  110:aload_0         
	//   59  111:getfield        #137 <Field JavaType _containerType>
	//   60  114:ldc2            #367 <String "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'">
	//   61  117:iconst_2        
	//   62  118:anewarray       Object[]
	//   63  121:dup             
	//   64  122:iconst_0        
	//   65  123:aload_0         
	//   66  124:getfield        #137 <Field JavaType _containerType>
	//   67  127:aastore         
	//   68  128:dup             
	//   69  129:iconst_1        
	//   70  130:aload_0         
	//   71  131:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   72  134:invokevirtual   #340 <Method Class Object.getClass()>
	//   73  137:invokevirtual   #345 <Method String Class.getName()>
	//   74  140:aastore         
	//   75  141:invokestatic    #351 <Method String String.format(String, Object[])>
	//   76  144:invokevirtual   #355 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   77  147:pop             
				_delegateDeserializer = findDeserializer(deserializationcontext, javatype1, ((BeanProperty) (null)));
	//   78  148:aload_0         
	//   79  149:aload_0         
	//   80  150:aload_1         
	//   81  151:aload_2         
	//   82  152:aconst_null     
	//   83  153:invokevirtual   #359 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   84  156:putfield        #66  <Field JsonDeserializer _delegateDeserializer>
				return;
	//   85  159:return          
			}
			if(_valueInstantiator.canCreateFromObjectWith())
	//*  86  160:aload_0         
	//*  87  161:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//*  88  164:invokevirtual   #370 <Method boolean ValueInstantiator.canCreateFromObjectWith()>
	//*  89  167:ifeq            202
			{
				SettableBeanProperty asettablebeanproperty[] = _valueInstantiator.getFromObjectArguments(deserializationcontext.getConfig());
	//   90  170:aload_0         
	//   91  171:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//   92  174:aload_1         
	//   93  175:invokevirtual   #331 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   94  178:invokevirtual   #374 <Method SettableBeanProperty[] ValueInstantiator.getFromObjectArguments(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   95  181:astore_2        
				_propertyBasedCreator = PropertyBasedCreator.construct(deserializationcontext, _valueInstantiator, asettablebeanproperty, deserializationcontext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
	//   96  182:aload_0         
	//   97  183:aload_1         
	//   98  184:aload_0         
	//   99  185:getfield        #53  <Field ValueInstantiator _valueInstantiator>
	//  100  188:aload_2         
	//  101  189:aload_1         
	//  102  190:getstatic       #380 <Field MapperFeature MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//  103  193:invokevirtual   #383 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//  104  196:invokestatic    #387 <Method PropertyBasedCreator PropertyBasedCreator.construct(DeserializationContext, ValueInstantiator, SettableBeanProperty[], boolean)>
	//  105  199:putfield        #68  <Field PropertyBasedCreator _propertyBasedCreator>
			}
		}
	//  106  202:return          
	}

	public EnumMapDeserializer withResolved(KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider)
	{
		if(keydeserializer == _keyDeserializer && nullvalueprovider == _nullProvider && jsondeserializer == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field KeyDeserializer _keyDeserializer>
	//*   3    5:if_acmpne       35
	//*   4    8:aload           4
	//*   5   10:aload_0         
	//*   6   11:getfield        #184 <Field NullValueProvider _nullProvider>
	//*   7   14:if_acmpne       35
	//*   8   17:aload_2         
	//*   9   18:aload_0         
	//*  10   19:getfield        #49  <Field JsonDeserializer _valueDeserializer>
	//*  11   22:if_acmpne       35
	//*  12   25:aload_3         
	//*  13   26:aload_0         
	//*  14   27:getfield        #51  <Field TypeDeserializer _valueTypeDeserializer>
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new EnumMapDeserializer(this, keydeserializer, jsondeserializer, typedeserializer, nullvalueprovider);
	//   18   35:new             #2   <Class EnumMapDeserializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:aload           4
	//   25   45:invokespecial   #389 <Method void EnumMapDeserializer(EnumMapDeserializer, KeyDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider)>
	//   26   48:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected JsonDeserializer _delegateDeserializer;
	protected final Class _enumClass;
	protected KeyDeserializer _keyDeserializer;
	protected PropertyBasedCreator _propertyBasedCreator;
	protected JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
	protected final TypeDeserializer _valueTypeDeserializer;
}
