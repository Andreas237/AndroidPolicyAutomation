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
	//    2    2:invokespecial   #24  <Method void ContainerDeserializerBase(JavaType)>
		if(javatype.containedTypeCount() == 2)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #30  <Method int JavaType.containedTypeCount()>
	//*   5    9:iconst_2        
	//*   6   10:icmpne          30
		{
			_keyDeserializer = keydeserializer;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #32  <Field KeyDeserializer _keyDeserializer>
			_valueDeserializer = jsondeserializer;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #34  <Field JsonDeserializer _valueDeserializer>
			_valueTypeDeserializer = typedeserializer;
	//   13   23:aload_0         
	//   14   24:aload           4
	//   15   26:putfield        #36  <Field TypeDeserializer _valueTypeDeserializer>
			return;
	//   16   29:return          
		} else
		{
			keydeserializer = ((KeyDeserializer) (new StringBuilder()));
	//   17   30:new             #38  <Class StringBuilder>
	//   18   33:dup             
	//   19   34:invokespecial   #41  <Method void StringBuilder()>
	//   20   37:astore_2        
			((StringBuilder) (keydeserializer)).append("Missing generic type information for ");
	//   21   38:aload_2         
	//   22   39:ldc1            #43  <String "Missing generic type information for ">
	//   23   41:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			((StringBuilder) (keydeserializer)).append(((Object) (javatype)));
	//   25   45:aload_2         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   28   50:pop             
			throw new IllegalArgumentException(((StringBuilder) (keydeserializer)).toString());
	//   29   51:new             #52  <Class IllegalArgumentException>
	//   30   54:dup             
	//   31   55:aload_2         
	//   32   56:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   33   59:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   34   62:athrow          
		}
	}

	protected MapEntryDeserializer(MapEntryDeserializer mapentrydeserializer, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(((ContainerDeserializerBase) (mapentrydeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void ContainerDeserializerBase(ContainerDeserializerBase)>
		_keyDeserializer = keydeserializer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field KeyDeserializer _keyDeserializer>
		_valueDeserializer = jsondeserializer;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #36  <Field TypeDeserializer _valueTypeDeserializer>
	//   12   21:return          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_keyDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field KeyDeserializer _keyDeserializer>
	//    2    4:astore          4
		KeyDeserializer keydeserializer;
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       28
		{
			keydeserializer = deserializationcontext.findKeyDeserializer(_containerType.containedType(0), beanproperty);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field JavaType _containerType>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #79  <Method JavaType JavaType.containedType(int)>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #85  <Method KeyDeserializer DeserializationContext.findKeyDeserializer(JavaType, BeanProperty)>
	//   12   24:astore_3        
		} else
	//*  13   25:goto            52
		{
			keydeserializer = ((KeyDeserializer) (obj));
	//   14   28:aload           4
	//   15   30:astore_3        
			if(obj instanceof ContextualKeyDeserializer)
	//*  16   31:aload           4
	//*  17   33:instanceof      #87  <Class ContextualKeyDeserializer>
	//*  18   36:ifeq            52
				keydeserializer = ((ContextualKeyDeserializer)obj).createContextual(deserializationcontext, beanproperty);
	//   19   39:aload           4
	//   20   41:checkcast       #87  <Class ContextualKeyDeserializer>
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:invokeinterface #90  <Method KeyDeserializer ContextualKeyDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//   24   51:astore_3        
		}
		obj = ((Object) (findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer)));
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:aload_0         
	//   29   56:getfield        #34  <Field JsonDeserializer _valueDeserializer>
	//   30   59:invokevirtual   #94  <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   31   62:astore          4
		Object obj1 = ((Object) (_containerType.containedType(1)));
	//   32   64:aload_0         
	//   33   65:getfield        #75  <Field JavaType _containerType>
	//   34   68:iconst_1        
	//   35   69:invokevirtual   #79  <Method JavaType JavaType.containedType(int)>
	//   36   72:astore          5
		if(obj == null)
	//*  37   74:aload           4
	//*  38   76:ifnonnull       90
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty)));
	//   39   79:aload_1         
	//   40   80:aload           5
	//   41   82:aload_2         
	//   42   83:invokevirtual   #98  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   43   86:astore_1        
		else
	//*  44   87:goto            100
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, ((JavaType) (obj1)))));
	//   45   90:aload_1         
	//   46   91:aload           4
	//   47   93:aload_2         
	//   48   94:aload           5
	//   49   96:invokevirtual   #102 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   50   99:astore_1        
		obj1 = ((Object) (_valueTypeDeserializer));
	//   51  100:aload_0         
	//   52  101:getfield        #36  <Field TypeDeserializer _valueTypeDeserializer>
	//   53  104:astore          5
		obj = obj1;
	//   54  106:aload           5
	//   55  108:astore          4
		if(obj1 != null)
	//*  56  110:aload           5
	//*  57  112:ifnull          123
			obj = ((Object) (((TypeDeserializer) (obj1)).forProperty(beanproperty)));
	//   58  115:aload           5
	//   59  117:aload_2         
	//   60  118:invokevirtual   #108 <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//   61  121:astore          4
		return ((JsonDeserializer) (withResolved(keydeserializer, ((TypeDeserializer) (obj)), ((JsonDeserializer) (deserializationcontext)))));
	//   62  123:aload_0         
	//   63  124:aload_3         
	//   64  125:aload           4
	//   65  127:aload_1         
	//   66  128:invokevirtual   #112 <Method MapEntryDeserializer withResolved(KeyDeserializer, TypeDeserializer, JsonDeserializer)>
	//   67  131:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #123 <Method java.util.Map$Entry deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (java.util.Map.Entry)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #126 <Class java.util.Map$Entry>
	//    5    7:invokevirtual   #129 <Method java.util.Map$Entry deserialize(JsonParser, DeserializationContext, java.util.Map$Entry)>
	//    6   10:areturn         
	}

	public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		Object obj1;
		String s;
		TypeDeserializer typedeserializer;
		JsonToken jsontoken1;
		obj1 = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #137 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj1 != JsonToken.START_OBJECT && obj1 != JsonToken.FIELD_NAME && obj1 != JsonToken.END_OBJECT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #143 <Field JsonToken JsonToken.START_OBJECT>
	//*   5   11:if_acmpeq       40
	//*   6   14:aload           4
	//*   7   16:getstatic       #146 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   19:if_acmpeq       40
	//*   9   22:aload           4
	//*  10   24:getstatic       #149 <Field JsonToken JsonToken.END_OBJECT>
	//*  11   27:if_acmpeq       40
			return (java.util.Map.Entry)_deserializeFromEmpty(jsonparser, deserializationcontext);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokevirtual   #152 <Method Object _deserializeFromEmpty(JsonParser, DeserializationContext)>
	//   16   36:checkcast       #126 <Class java.util.Map$Entry>
	//   17   39:areturn         
		obj = obj1;
	//   18   40:aload           4
	//   19   42:astore_3        
		if(obj1 == JsonToken.START_OBJECT)
	//*  20   43:aload           4
	//*  21   45:getstatic       #143 <Field JsonToken JsonToken.START_OBJECT>
	//*  22   48:if_acmpne       56
			obj = ((Object) (jsonparser.nextToken()));
	//   23   51:aload_1         
	//   24   52:invokevirtual   #155 <Method JsonToken JsonParser.nextToken()>
	//   25   55:astore_3        
		if(obj != JsonToken.FIELD_NAME)
	//*  26   56:aload_3         
	//*  27   57:getstatic       #146 <Field JsonToken JsonToken.FIELD_NAME>
	//*  28   60:if_acmpeq       98
			if(obj == JsonToken.END_OBJECT)
	//*  29   63:aload_3         
	//*  30   64:getstatic       #149 <Field JsonToken JsonToken.END_OBJECT>
	//*  31   67:if_acmpne       85
				return (java.util.Map.Entry)deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
	//   32   70:aload_2         
	//   33   71:aload_0         
	//   34   72:ldc1            #157 <String "Cannot deserialize a Map.Entry out of empty JSON Object">
	//   35   74:iconst_0        
	//   36   75:anewarray       Object[]
	//   37   78:invokevirtual   #163 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//   38   81:checkcast       #126 <Class java.util.Map$Entry>
	//   39   84:areturn         
			else
				return (java.util.Map.Entry)deserializationcontext.handleUnexpectedToken(handledType(), jsonparser);
	//   40   85:aload_2         
	//   41   86:aload_0         
	//   42   87:invokevirtual   #167 <Method Class handledType()>
	//   43   90:aload_1         
	//   44   91:invokevirtual   #171 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   45   94:checkcast       #126 <Class java.util.Map$Entry>
	//   46   97:areturn         
		obj1 = ((Object) (_keyDeserializer));
	//   47   98:aload_0         
	//   48   99:getfield        #32  <Field KeyDeserializer _keyDeserializer>
	//   49  102:astore          4
		obj = ((Object) (_valueDeserializer));
	//   50  104:aload_0         
	//   51  105:getfield        #34  <Field JsonDeserializer _valueDeserializer>
	//   52  108:astore_3        
		typedeserializer = _valueTypeDeserializer;
	//   53  109:aload_0         
	//   54  110:getfield        #36  <Field TypeDeserializer _valueTypeDeserializer>
	//   55  113:astore          6
		s = jsonparser.getCurrentName();
	//   56  115:aload_1         
	//   57  116:invokevirtual   #174 <Method String JsonParser.getCurrentName()>
	//   58  119:astore          5
		obj1 = ((KeyDeserializer) (obj1)).deserializeKey(s, deserializationcontext);
	//   59  121:aload           4
	//   60  123:aload           5
	//   61  125:aload_2         
	//   62  126:invokevirtual   #180 <Method Object KeyDeserializer.deserializeKey(String, DeserializationContext)>
	//   63  129:astore          4
		jsontoken1 = jsonparser.nextToken();
	//   64  131:aload_1         
	//   65  132:invokevirtual   #155 <Method JsonToken JsonParser.nextToken()>
	//   66  135:astore          7
		if(jsontoken1 == JsonToken.VALUE_NULL)
	//*  67  137:aload           7
	//*  68  139:getstatic       #183 <Field JsonToken JsonToken.VALUE_NULL>
	//*  69  142:if_acmpne       154
		{
			obj = ((JsonDeserializer) (obj)).getNullValue(deserializationcontext);
	//   70  145:aload_3         
	//   71  146:aload_2         
	//   72  147:invokevirtual   #189 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   73  150:astore_3        
			break MISSING_BLOCK_LABEL_194;
	//   74  151:goto            194
		}
		if(typedeserializer == null)
	//*  75  154:aload           6
	//*  76  156:ifnonnull       169
		{
			try
			{
				obj = ((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext);
	//   77  159:aload_3         
	//   78  160:aload_1         
	//   79  161:aload_2         
	//   80  162:invokevirtual   #191 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   81  165:astore_3        
			}
	//*  82  166:goto            194
	//*  83  169:aload_3         
	//*  84  170:aload_1         
	//*  85  171:aload_2         
	//*  86  172:aload           6
	//*  87  174:invokevirtual   #195 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  88  177:astore_3        
	//*  89  178:goto            194
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  90  181:astore_3        
			{
				wrapAndThrow(((Throwable) (obj)), java/util/Map$Entry, s);
	//   91  182:aload_0         
	//   92  183:aload_3         
	//   93  184:ldc1            #126 <Class java.util.Map$Entry>
	//   94  186:aload           5
	//   95  188:invokevirtual   #199 <Method Object wrapAndThrow(Throwable, Object, String)>
	//   96  191:pop             
				obj = null;
	//   97  192:aconst_null     
	//   98  193:astore_3        
			}
			break MISSING_BLOCK_LABEL_194;
		}
		obj = ((JsonDeserializer) (obj)).deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		JsonToken jsontoken = jsonparser.nextToken();
	//   99  194:aload_1         
	//  100  195:invokevirtual   #155 <Method JsonToken JsonParser.nextToken()>
	//  101  198:astore          5
		if(jsontoken != JsonToken.END_OBJECT)
	//* 102  200:aload           5
	//* 103  202:getstatic       #149 <Field JsonToken JsonToken.END_OBJECT>
	//* 104  205:if_acmpeq       275
		{
			if(jsontoken == JsonToken.FIELD_NAME)
	//* 105  208:aload           5
	//* 106  210:getstatic       #146 <Field JsonToken JsonToken.FIELD_NAME>
	//* 107  213:if_acmpne       237
			{
				deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", new Object[] {
					jsonparser.getCurrentName()
				});
	//  108  216:aload_2         
	//  109  217:aload_0         
	//  110  218:ldc1            #201 <String "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')">
	//  111  220:iconst_1        
	//  112  221:anewarray       Object[]
	//  113  224:dup             
	//  114  225:iconst_0        
	//  115  226:aload_1         
	//  116  227:invokevirtual   #174 <Method String JsonParser.getCurrentName()>
	//  117  230:aastore         
	//  118  231:invokevirtual   #163 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//  119  234:pop             
				return null;
	//  120  235:aconst_null     
	//  121  236:areturn         
			} else
			{
				jsonparser = ((JsonParser) (new StringBuilder()));
	//  122  237:new             #38  <Class StringBuilder>
	//  123  240:dup             
	//  124  241:invokespecial   #41  <Method void StringBuilder()>
	//  125  244:astore_1        
				((StringBuilder) (jsonparser)).append("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ");
	//  126  245:aload_1         
	//  127  246:ldc1            #203 <String "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ">
	//  128  248:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  129  251:pop             
				((StringBuilder) (jsonparser)).append(((Object) (jsontoken)));
	//  130  252:aload_1         
	//  131  253:aload           5
	//  132  255:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//  133  258:pop             
				deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), ((StringBuilder) (jsonparser)).toString(), new Object[0]);
	//  134  259:aload_2         
	//  135  260:aload_0         
	//  136  261:aload_1         
	//  137  262:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  138  265:iconst_0        
	//  139  266:anewarray       Object[]
	//  140  269:invokevirtual   #163 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//  141  272:pop             
				return null;
	//  142  273:aconst_null     
	//  143  274:areturn         
			}
		} else
		{
			return ((java.util.Map.Entry) (new java.util.AbstractMap.SimpleEntry(obj1, obj)));
	//  144  275:new             #205 <Class java.util.AbstractMap$SimpleEntry>
	//  145  278:dup             
	//  146  279:aload           4
	//  147  281:aload_3         
	//  148  282:invokespecial   #208 <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//  149  285:areturn         
		}
	}

	public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, java.util.Map.Entry entry)
		throws IOException
	{
		throw new IllegalStateException("Cannot update Map.Entry values");
	//    0    0:new             #211 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #213 <String "Cannot update Map.Entry values">
	//    3    6:invokespecial   #214 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #218 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	protected MapEntryDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		if(_keyDeserializer == keydeserializer && _valueDeserializer == jsondeserializer && _valueTypeDeserializer == typedeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field KeyDeserializer _keyDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field JsonDeserializer _valueDeserializer>
	//*   6   12:aload_3         
	//*   7   13:if_acmpne       26
	//*   8   16:aload_0         
	//*   9   17:getfield        #36  <Field TypeDeserializer _valueTypeDeserializer>
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
	protected final JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
