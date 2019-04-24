// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeDeserializerBase

public class AsWrapperTypeDeserializer extends TypeDeserializerBase
	implements Serializable
{

	public AsWrapperTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
	{
		super(javatype, typeidresolver, s, flag, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #14  <Method void TypeDeserializerBase(JavaType, TypeIdResolver, String, boolean, Class)>
	//    7   11:return          
	}

	protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer aswrappertypedeserializer, BeanProperty beanproperty)
	{
		super(((TypeDeserializerBase) (aswrappertypedeserializer)), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void TypeDeserializerBase(TypeDeserializerBase, BeanProperty)>
	//    4    6:return          
	}

	protected Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.canReadTypeId()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method boolean JsonParser.canReadTypeId()>
	//    2    4:ifeq            26
_L1:
		Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #35  <Method Object JsonParser.getTypeId()>
	//    5   11:astore_3        
		if(obj == null) goto _L2; else goto _L3
	//    6   12:aload_3         
	//    7   13:ifnull          26
_L3:
		jsonparser = ((JsonParser) (_deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #39  <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   23:astore_1        
_L5:
		return ((Object) (jsonparser));
	//   14   24:aload_1         
	//   15   25:areturn         
_L2:
		Object obj1 = ((Object) (jsonparser.getCurrentToken()));
	//   16   26:aload_1         
	//   17   27:invokevirtual   #43  <Method JsonToken JsonParser.getCurrentToken()>
	//   18   30:astore_3        
		if(obj1 == JsonToken.START_OBJECT)
	//*  19   31:aload_3         
	//*  20   32:getstatic       #49  <Field JsonToken JsonToken.START_OBJECT>
	//*  21   35:if_acmpne       84
		{
			if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #52  <Method JsonToken JsonParser.nextToken()>
	//*  24   42:getstatic       #55  <Field JsonToken JsonToken.FIELD_NAME>
	//*  25   45:if_acmpeq       122
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder()).append("need JSON String that contains type id (for subtype of ").append(baseTypeName()).append(")").toString());
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:getstatic       #55  <Field JsonToken JsonToken.FIELD_NAME>
	//   29   53:new             #57  <Class StringBuilder>
	//   30   56:dup             
	//   31   57:invokespecial   #60  <Method void StringBuilder()>
	//   32   60:ldc1            #62  <String "need JSON String that contains type id (for subtype of ">
	//   33   62:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:aload_0         
	//   35   66:invokevirtual   #70  <Method String baseTypeName()>
	//   36   69:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:ldc1            #72  <String ")">
	//   38   74:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   40   80:invokevirtual   #81  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   41   83:athrow          
		} else
		if(obj1 != JsonToken.FIELD_NAME)
	//*  42   84:aload_3         
	//*  43   85:getstatic       #55  <Field JsonToken JsonToken.FIELD_NAME>
	//*  44   88:if_acmpeq       122
			throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.START_OBJECT, (new StringBuilder()).append("need JSON Object to contain As.WRAPPER_OBJECT type information for class ").append(baseTypeName()).toString());
	//   45   91:aload_2         
	//   46   92:aload_1         
	//   47   93:getstatic       #49  <Field JsonToken JsonToken.START_OBJECT>
	//   48   96:new             #57  <Class StringBuilder>
	//   49   99:dup             
	//   50  100:invokespecial   #60  <Method void StringBuilder()>
	//   51  103:ldc1            #83  <String "need JSON Object to contain As.WRAPPER_OBJECT type information for class ">
	//   52  105:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:aload_0         
	//   54  109:invokevirtual   #70  <Method String baseTypeName()>
	//   55  112:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   56  115:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   57  118:invokevirtual   #81  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   58  121:athrow          
		String s = jsonparser.getText();
	//   59  122:aload_1         
	//   60  123:invokevirtual   #86  <Method String JsonParser.getText()>
	//   61  126:astore          5
		JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
	//   62  128:aload_0         
	//   63  129:aload_2         
	//   64  130:aload           5
	//   65  132:invokevirtual   #90  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//   66  135:astore          4
		jsonparser.nextToken();
	//   67  137:aload_1         
	//   68  138:invokevirtual   #52  <Method JsonToken JsonParser.nextToken()>
	//   69  141:pop             
		obj1 = ((Object) (jsonparser));
	//   70  142:aload_1         
	//   71  143:astore_3        
		if(_typeIdVisible)
	//*  72  144:aload_0         
	//*  73  145:getfield        #94  <Field boolean _typeIdVisible>
	//*  74  148:ifeq            206
		{
			obj1 = ((Object) (jsonparser));
	//   75  151:aload_1         
	//   76  152:astore_3        
			if(jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
	//*  77  153:aload_1         
	//*  78  154:invokevirtual   #43  <Method JsonToken JsonParser.getCurrentToken()>
	//*  79  157:getstatic       #49  <Field JsonToken JsonToken.START_OBJECT>
	//*  80  160:if_acmpne       206
			{
				obj1 = ((Object) (new TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec) (null)), false)));
	//   81  163:new             #96  <Class TokenBuffer>
	//   82  166:dup             
	//   83  167:aconst_null     
	//   84  168:iconst_0        
	//   85  169:invokespecial   #99  <Method void TokenBuffer(com.fasterxml.jackson.core.ObjectCodec, boolean)>
	//   86  172:astore_3        
				((TokenBuffer) (obj1)).writeStartObject();
	//   87  173:aload_3         
	//   88  174:invokevirtual   #102 <Method void TokenBuffer.writeStartObject()>
				((TokenBuffer) (obj1)).writeFieldName(_typePropertyName);
	//   89  177:aload_3         
	//   90  178:aload_0         
	//   91  179:getfield        #106 <Field String _typePropertyName>
	//   92  182:invokevirtual   #110 <Method void TokenBuffer.writeFieldName(String)>
				((TokenBuffer) (obj1)).writeString(s);
	//   93  185:aload_3         
	//   94  186:aload           5
	//   95  188:invokevirtual   #113 <Method void TokenBuffer.writeString(String)>
				obj1 = ((Object) (JsonParserSequence.createFlattened(((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser)));
	//   96  191:aload_3         
	//   97  192:aload_1         
	//   98  193:invokevirtual   #117 <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   99  196:aload_1         
	//  100  197:invokestatic    #123 <Method JsonParserSequence JsonParserSequence.createFlattened(JsonParser, JsonParser)>
	//  101  200:astore_3        
				((JsonParser) (obj1)).nextToken();
	//  102  201:aload_3         
	//  103  202:invokevirtual   #52  <Method JsonToken JsonParser.nextToken()>
	//  104  205:pop             
			}
		}
		jsonparser = ((JsonParser) (jsondeserializer.deserialize(((JsonParser) (obj1)), deserializationcontext)));
	//  105  206:aload           4
	//  106  208:aload_3         
	//  107  209:aload_2         
	//  108  210:invokevirtual   #128 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//  109  213:astore_1        
		if(((JsonParser) (obj1)).nextToken() != JsonToken.END_OBJECT)
	//* 110  214:aload_3         
	//* 111  215:invokevirtual   #52  <Method JsonToken JsonParser.nextToken()>
	//* 112  218:getstatic       #131 <Field JsonToken JsonToken.END_OBJECT>
	//* 113  221:if_acmpeq       24
			throw deserializationcontext.wrongTokenException(((JsonParser) (obj1)), JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value");
	//  114  224:aload_2         
	//  115  225:aload_3         
	//  116  226:getstatic       #131 <Field JsonToken JsonToken.END_OBJECT>
	//  117  229:ldc1            #133 <String "expected closing END_OBJECT after type information and deserialized value">
	//  118  231:invokevirtual   #81  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  119  234:athrow          
		if(true) goto _L5; else goto _L4
_L4:
	}

	public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #137 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #137 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #137 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #137 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #146 <Field BeanProperty _property>
	//*   3    5:if_acmpne       10
			return ((TypeDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((TypeDeserializer) (new AsWrapperTypeDeserializer(this, beanproperty)));
	//    6   10:new             #2   <Class AsWrapperTypeDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #148 <Method void AsWrapperTypeDeserializer(AsWrapperTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
	//    0    0:getstatic       #156 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
