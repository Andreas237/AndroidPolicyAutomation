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

public class AsArrayTypeDeserializer extends TypeDeserializerBase
	implements Serializable
{

	public AsArrayTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, JavaType javatype1)
	{
		super(javatype, typeidresolver, s, flag, javatype1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #14  <Method void TypeDeserializerBase(JavaType, TypeIdResolver, String, boolean, JavaType)>
	//    7   11:return          
	}

	public AsArrayTypeDeserializer(AsArrayTypeDeserializer asarraytypedeserializer, BeanProperty beanproperty)
	{
		super(((TypeDeserializerBase) (asarraytypedeserializer)), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void TypeDeserializerBase(TypeDeserializerBase, BeanProperty)>
	//    4    6:return          
	}

	protected Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.canReadTypeId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #29  <Method boolean JsonParser.canReadTypeId()>
	//*   2    4:ifeq            27
		{
			Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Object JsonParser.getTypeId()>
	//    5   11:astore          4
			if(obj != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          27
				return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload           4
	//   12   23:invokevirtual   #37  <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   26:areturn         
		}
		boolean flag = jsonparser.isExpectedStartArrayToken();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #40  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//   16   31:istore_3        
		String s = _locateTypeId(jsonparser, deserializationcontext);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #44  <Method String _locateTypeId(JsonParser, DeserializationContext)>
	//   21   38:astore          6
		JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:aload           6
	//   25   44:invokevirtual   #48  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//   26   47:astore          5
		Object obj1 = ((Object) (jsonparser));
	//   27   49:aload_1         
	//   28   50:astore          4
		if(_typeIdVisible)
	//*  29   52:aload_0         
	//*  30   53:getfield        #52  <Field boolean _typeIdVisible>
	//*  31   56:ifeq            137
		{
			obj1 = ((Object) (jsonparser));
	//   32   59:aload_1         
	//   33   60:astore          4
			if(!_usesExternalId())
	//*  34   62:aload_0         
	//*  35   63:invokevirtual   #55  <Method boolean _usesExternalId()>
	//*  36   66:ifne            137
			{
				obj1 = ((Object) (jsonparser));
	//   37   69:aload_1         
	//   38   70:astore          4
				if(jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
	//*  39   72:aload_1         
	//*  40   73:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
	//*  41   76:getstatic       #65  <Field JsonToken JsonToken.START_OBJECT>
	//*  42   79:if_acmpne       137
				{
					obj1 = ((Object) (new TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec) (null)), false)));
	//   43   82:new             #67  <Class TokenBuffer>
	//   44   85:dup             
	//   45   86:aconst_null     
	//   46   87:iconst_0        
	//   47   88:invokespecial   #70  <Method void TokenBuffer(com.fasterxml.jackson.core.ObjectCodec, boolean)>
	//   48   91:astore          4
					((TokenBuffer) (obj1)).writeStartObject();
	//   49   93:aload           4
	//   50   95:invokevirtual   #74  <Method void TokenBuffer.writeStartObject()>
					((TokenBuffer) (obj1)).writeFieldName(_typePropertyName);
	//   51   98:aload           4
	//   52  100:aload_0         
	//   53  101:getfield        #78  <Field String _typePropertyName>
	//   54  104:invokevirtual   #82  <Method void TokenBuffer.writeFieldName(String)>
					((TokenBuffer) (obj1)).writeString(s);
	//   55  107:aload           4
	//   56  109:aload           6
	//   57  111:invokevirtual   #85  <Method void TokenBuffer.writeString(String)>
					jsonparser.clearCurrentToken();
	//   58  114:aload_1         
	//   59  115:invokevirtual   #88  <Method void JsonParser.clearCurrentToken()>
					obj1 = ((Object) (JsonParserSequence.createFlattened(false, ((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser)));
	//   60  118:iconst_0        
	//   61  119:aload           4
	//   62  121:aload_1         
	//   63  122:invokevirtual   #92  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   64  125:aload_1         
	//   65  126:invokestatic    #98  <Method JsonParserSequence JsonParserSequence.createFlattened(boolean, JsonParser, JsonParser)>
	//   66  129:astore          4
					((JsonParser) (obj1)).nextToken();
	//   67  131:aload           4
	//   68  133:invokevirtual   #101 <Method JsonToken JsonParser.nextToken()>
	//   69  136:pop             
				}
			}
		}
		jsonparser = ((JsonParser) (jsondeserializer.deserialize(((JsonParser) (obj1)), deserializationcontext)));
	//   70  137:aload           5
	//   71  139:aload           4
	//   72  141:aload_2         
	//   73  142:invokevirtual   #106 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   74  145:astore_1        
		if(flag && ((JsonParser) (obj1)).nextToken() != JsonToken.END_ARRAY)
	//*  75  146:iload_3         
	//*  76  147:ifeq            178
	//*  77  150:aload           4
	//*  78  152:invokevirtual   #101 <Method JsonToken JsonParser.nextToken()>
	//*  79  155:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  80  158:if_acmpeq       178
			deserializationcontext.reportWrongTokenException(baseType(), JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
	//   81  161:aload_2         
	//   82  162:aload_0         
	//   83  163:invokevirtual   #113 <Method JavaType baseType()>
	//   84  166:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   85  169:ldc1            #115 <String "expected closing END_ARRAY after type information and deserialized value">
	//   86  171:iconst_0        
	//   87  172:anewarray       Object[]
	//   88  175:invokevirtual   #123 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		return ((Object) (jsonparser));
	//   89  178:aload_1         
	//   90  179:areturn         
	}

	protected String _locateTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #40  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            77
			if(_defaultImpl != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #128 <Field JavaType _defaultImpl>
	//*   5   11:ifnull          24
			{
				return _idResolver.idFromBaseType();
	//    6   14:aload_0         
	//    7   15:getfield        #132 <Field TypeIdResolver _idResolver>
	//    8   18:invokeinterface #138 <Method String TypeIdResolver.idFromBaseType()>
	//    9   23:areturn         
			} else
			{
				jsonparser = ((JsonParser) (baseType()));
	//   10   24:aload_0         
	//   11   25:invokevirtual   #113 <Method JavaType baseType()>
	//   12   28:astore_1        
				JsonToken jsontoken = JsonToken.START_ARRAY;
	//   13   29:getstatic       #141 <Field JsonToken JsonToken.START_ARRAY>
	//   14   32:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   15   33:new             #143 <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #145 <Method void StringBuilder()>
	//   18   40:astore          4
				stringbuilder.append("need JSON Array to contain As.WRAPPER_ARRAY type information for class ");
	//   19   42:aload           4
	//   20   44:ldc1            #147 <String "need JSON Array to contain As.WRAPPER_ARRAY type information for class ">
	//   21   46:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
				stringbuilder.append(baseTypeName());
	//   23   50:aload           4
	//   24   52:aload_0         
	//   25   53:invokevirtual   #154 <Method String baseTypeName()>
	//   26   56:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
				deserializationcontext.reportWrongTokenException(((JavaType) (jsonparser)), jsontoken, stringbuilder.toString(), new Object[0]);
	//   28   60:aload_2         
	//   29   61:aload_1         
	//   30   62:aload_3         
	//   31   63:aload           4
	//   32   65:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   33   68:iconst_0        
	//   34   69:anewarray       Object[]
	//   35   72:invokevirtual   #123 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
				return null;
	//   36   75:aconst_null     
	//   37   76:areturn         
			}
		if(jsonparser.nextToken() == JsonToken.VALUE_STRING)
	//*  38   77:aload_1         
	//*  39   78:invokevirtual   #101 <Method JsonToken JsonParser.nextToken()>
	//*  40   81:getstatic       #160 <Field JsonToken JsonToken.VALUE_STRING>
	//*  41   84:if_acmpne       99
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getText()));
	//   42   87:aload_1         
	//   43   88:invokevirtual   #163 <Method String JsonParser.getText()>
	//   44   91:astore_2        
			jsonparser.nextToken();
	//   45   92:aload_1         
	//   46   93:invokevirtual   #101 <Method JsonToken JsonParser.nextToken()>
	//   47   96:pop             
			return ((String) (deserializationcontext));
	//   48   97:aload_2         
	//   49   98:areturn         
		}
		if(_defaultImpl != null)
	//*  50   99:aload_0         
	//*  51  100:getfield        #128 <Field JavaType _defaultImpl>
	//*  52  103:ifnull          116
		{
			return _idResolver.idFromBaseType();
	//   53  106:aload_0         
	//   54  107:getfield        #132 <Field TypeIdResolver _idResolver>
	//   55  110:invokeinterface #138 <Method String TypeIdResolver.idFromBaseType()>
	//   56  115:areturn         
		} else
		{
			deserializationcontext.reportWrongTokenException(baseType(), JsonToken.VALUE_STRING, "need JSON String that contains type id (for subtype of %s)", new Object[] {
				baseTypeName()
			});
	//   57  116:aload_2         
	//   58  117:aload_0         
	//   59  118:invokevirtual   #113 <Method JavaType baseType()>
	//   60  121:getstatic       #160 <Field JsonToken JsonToken.VALUE_STRING>
	//   61  124:ldc1            #165 <String "need JSON String that contains type id (for subtype of %s)">
	//   62  126:iconst_1        
	//   63  127:anewarray       Object[]
	//   64  130:dup             
	//   65  131:iconst_0        
	//   66  132:aload_0         
	//   67  133:invokevirtual   #154 <Method String baseTypeName()>
	//   68  136:aastore         
	//   69  137:invokevirtual   #123 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
			return null;
	//   70  140:aconst_null     
	//   71  141:areturn         
		}
	}

	protected boolean _usesExternalId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #177 <Field BeanProperty _property>
	//*   3    5:if_acmpne       10
			return ((TypeDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((TypeDeserializer) (new AsArrayTypeDeserializer(this, beanproperty)));
	//    6   10:new             #2   <Class AsArrayTypeDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #179 <Method void AsArrayTypeDeserializer(AsArrayTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
	//    0    0:getstatic       #187 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
