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

	public AsArrayTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
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

	public AsArrayTypeDeserializer(AsArrayTypeDeserializer asarraytypedeserializer, BeanProperty beanproperty)
	{
		super(((TypeDeserializerBase) (asarraytypedeserializer)), beanproperty);
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
	//    2    4:ifeq            29
_L1:
		Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #35  <Method Object JsonParser.getTypeId()>
	//    5   11:astore          4
		if(obj == null) goto _L2; else goto _L3
	//    6   13:aload           4
	//    7   15:ifnull          29
_L3:
		jsonparser = ((JsonParser) (_deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload           4
	//   12   23:invokevirtual   #39  <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   26:astore_1        
_L5:
		return ((Object) (jsonparser));
	//   14   27:aload_1         
	//   15   28:areturn         
_L2:
		boolean flag = jsonparser.isExpectedStartArrayToken();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//   18   33:istore_3        
		String s = _locateTypeId(jsonparser, deserializationcontext);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:invokevirtual   #46  <Method String _locateTypeId(JsonParser, DeserializationContext)>
	//   23   40:astore          6
		Object obj2 = ((Object) (_findDeserializer(deserializationcontext, s)));
	//   24   42:aload_0         
	//   25   43:aload_2         
	//   26   44:aload           6
	//   27   46:invokevirtual   #50  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//   28   49:astore          5
		Object obj1 = ((Object) (jsonparser));
	//   29   51:aload_1         
	//   30   52:astore          4
		if(_typeIdVisible)
	//*  31   54:aload_0         
	//*  32   55:getfield        #54  <Field boolean _typeIdVisible>
	//*  33   58:ifeq            134
		{
			obj1 = ((Object) (jsonparser));
	//   34   61:aload_1         
	//   35   62:astore          4
			if(!_usesExternalId())
	//*  36   64:aload_0         
	//*  37   65:invokevirtual   #57  <Method boolean _usesExternalId()>
	//*  38   68:ifne            134
			{
				obj1 = ((Object) (jsonparser));
	//   39   71:aload_1         
	//   40   72:astore          4
				if(jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
	//*  41   74:aload_1         
	//*  42   75:invokevirtual   #61  <Method JsonToken JsonParser.getCurrentToken()>
	//*  43   78:getstatic       #67  <Field JsonToken JsonToken.START_OBJECT>
	//*  44   81:if_acmpne       134
				{
					obj1 = ((Object) (new TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec) (null)), false)));
	//   45   84:new             #69  <Class TokenBuffer>
	//   46   87:dup             
	//   47   88:aconst_null     
	//   48   89:iconst_0        
	//   49   90:invokespecial   #72  <Method void TokenBuffer(com.fasterxml.jackson.core.ObjectCodec, boolean)>
	//   50   93:astore          4
					((TokenBuffer) (obj1)).writeStartObject();
	//   51   95:aload           4
	//   52   97:invokevirtual   #76  <Method void TokenBuffer.writeStartObject()>
					((TokenBuffer) (obj1)).writeFieldName(_typePropertyName);
	//   53  100:aload           4
	//   54  102:aload_0         
	//   55  103:getfield        #80  <Field String _typePropertyName>
	//   56  106:invokevirtual   #84  <Method void TokenBuffer.writeFieldName(String)>
					((TokenBuffer) (obj1)).writeString(s);
	//   57  109:aload           4
	//   58  111:aload           6
	//   59  113:invokevirtual   #87  <Method void TokenBuffer.writeString(String)>
					obj1 = ((Object) (JsonParserSequence.createFlattened(((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser)));
	//   60  116:aload           4
	//   61  118:aload_1         
	//   62  119:invokevirtual   #91  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   63  122:aload_1         
	//   64  123:invokestatic    #97  <Method JsonParserSequence JsonParserSequence.createFlattened(JsonParser, JsonParser)>
	//   65  126:astore          4
					((JsonParser) (obj1)).nextToken();
	//   66  128:aload           4
	//   67  130:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   68  133:pop             
				}
			}
		}
		obj2 = ((JsonDeserializer) (obj2)).deserialize(((JsonParser) (obj1)), deserializationcontext);
	//   69  134:aload           5
	//   70  136:aload           4
	//   71  138:aload_2         
	//   72  139:invokevirtual   #105 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   73  142:astore          5
		jsonparser = ((JsonParser) (obj2));
	//   74  144:aload           5
	//   75  146:astore_1        
		if(flag)
	//*  76  147:iload_3         
	//*  77  148:ifeq            27
		{
			jsonparser = ((JsonParser) (obj2));
	//   78  151:aload           5
	//   79  153:astore_1        
			if(((JsonParser) (obj1)).nextToken() != JsonToken.END_ARRAY)
	//*  80  154:aload           4
	//*  81  156:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  82  159:getstatic       #108 <Field JsonToken JsonToken.END_ARRAY>
	//*  83  162:if_acmpeq       27
				throw deserializationcontext.wrongTokenException(((JsonParser) (obj1)), JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value");
	//   84  165:aload_2         
	//   85  166:aload           4
	//   86  168:getstatic       #108 <Field JsonToken JsonToken.END_ARRAY>
	//   87  171:ldc1            #110 <String "expected closing END_ARRAY after type information and deserialized value">
	//   88  173:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   89  176:athrow          
		}
		if(true) goto _L5; else goto _L4
_L4:
	}

	protected String _locateTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #42  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            55
			if(_defaultImpl != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #121 <Field JavaType _defaultImpl>
	//*   5   11:ifnull          24
				return _idResolver.idFromBaseType();
	//    6   14:aload_0         
	//    7   15:getfield        #125 <Field TypeIdResolver _idResolver>
	//    8   18:invokeinterface #131 <Method String TypeIdResolver.idFromBaseType()>
	//    9   23:areturn         
			else
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.START_ARRAY, (new StringBuilder()).append("need JSON Array to contain As.WRAPPER_ARRAY type information for class ").append(baseTypeName()).toString());
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:getstatic       #134 <Field JsonToken JsonToken.START_ARRAY>
	//   13   29:new             #136 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #138 <Method void StringBuilder()>
	//   16   36:ldc1            #140 <String "need JSON Array to contain As.WRAPPER_ARRAY type information for class ">
	//   17   38:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:aload_0         
	//   19   42:invokevirtual   #147 <Method String baseTypeName()>
	//   20   45:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   22   51:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   23   54:athrow          
		if(jsonparser.nextToken() == JsonToken.VALUE_STRING)
	//*  24   55:aload_1         
	//*  25   56:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  26   59:getstatic       #153 <Field JsonToken JsonToken.VALUE_STRING>
	//*  27   62:if_acmpne       77
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getText()));
	//   28   65:aload_1         
	//   29   66:invokevirtual   #156 <Method String JsonParser.getText()>
	//   30   69:astore_2        
			jsonparser.nextToken();
	//   31   70:aload_1         
	//   32   71:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   33   74:pop             
			return ((String) (deserializationcontext));
	//   34   75:aload_2         
	//   35   76:areturn         
		}
		if(_defaultImpl != null)
	//*  36   77:aload_0         
	//*  37   78:getfield        #121 <Field JavaType _defaultImpl>
	//*  38   81:ifnull          94
			return _idResolver.idFromBaseType();
	//   39   84:aload_0         
	//   40   85:getfield        #125 <Field TypeIdResolver _idResolver>
	//   41   88:invokeinterface #131 <Method String TypeIdResolver.idFromBaseType()>
	//   42   93:areturn         
		else
			throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.VALUE_STRING, (new StringBuilder()).append("need JSON String that contains type id (for subtype of ").append(baseTypeName()).append(")").toString());
	//   43   94:aload_2         
	//   44   95:aload_1         
	//   45   96:getstatic       #153 <Field JsonToken JsonToken.VALUE_STRING>
	//   46   99:new             #136 <Class StringBuilder>
	//   47  102:dup             
	//   48  103:invokespecial   #138 <Method void StringBuilder()>
	//   49  106:ldc1            #158 <String "need JSON String that contains type id (for subtype of ">
	//   50  108:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   51  111:aload_0         
	//   52  112:invokevirtual   #147 <Method String baseTypeName()>
	//   53  115:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   54  118:ldc1            #160 <String ")">
	//   55  120:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   56  123:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   57  126:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   58  129:athrow          
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
	//    3    3:invokevirtual   #163 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #163 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #163 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #163 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #172 <Field BeanProperty _property>
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
	//   10   16:invokespecial   #174 <Method void AsArrayTypeDeserializer(AsArrayTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
	//    0    0:getstatic       #182 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
