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

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsArrayTypeDeserializer

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
{

	public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
	{
		this(javatype, typeidresolver, s, flag, class1, com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:getstatic       #17  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//    7   11:invokespecial   #20  <Method void AsPropertyTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class, com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//    8   14:return          
	}

	public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1, com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		super(javatype, typeidresolver, s, flag, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #25  <Method void AsArrayTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class)>
		_inclusion = as;
	//    7   11:aload_0         
	//    8   12:aload           6
	//    9   14:putfield        #27  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//   10   17:return          
	}

	public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer aspropertytypedeserializer, BeanProperty beanproperty)
	{
		super(((AsArrayTypeDeserializer) (aspropertytypedeserializer)), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void AsArrayTypeDeserializer(AsArrayTypeDeserializer, BeanProperty)>
		_inclusion = aspropertytypedeserializer._inclusion;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #27  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    7   11:putfield        #27  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    8   14:return          
	}

	protected Object _deserializeTypedForId(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
		throws IOException
	{
		String s = jsonparser.getText();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method String JsonParser.getText()>
	//    2    4:astore          6
		JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:aload           6
	//    6   10:invokevirtual   #46  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//    7   13:astore          5
		TokenBuffer tokenbuffer1 = tokenbuffer;
	//    8   15:aload_3         
	//    9   16:astore          4
		if(_typeIdVisible)
	//*  10   18:aload_0         
	//*  11   19:getfield        #50  <Field boolean _typeIdVisible>
	//*  12   22:ifeq            59
		{
			tokenbuffer1 = tokenbuffer;
	//   13   25:aload_3         
	//   14   26:astore          4
			if(tokenbuffer == null)
	//*  15   28:aload_3         
	//*  16   29:ifnonnull       43
				tokenbuffer1 = new TokenBuffer(jsonparser, deserializationcontext);
	//   17   32:new             #52  <Class TokenBuffer>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokespecial   #55  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   22   41:astore          4
			tokenbuffer1.writeFieldName(jsonparser.getCurrentName());
	//   23   43:aload           4
	//   24   45:aload_1         
	//   25   46:invokevirtual   #58  <Method String JsonParser.getCurrentName()>
	//   26   49:invokevirtual   #62  <Method void TokenBuffer.writeFieldName(String)>
			tokenbuffer1.writeString(s);
	//   27   52:aload           4
	//   28   54:aload           6
	//   29   56:invokevirtual   #65  <Method void TokenBuffer.writeString(String)>
		}
		tokenbuffer = ((TokenBuffer) (jsonparser));
	//   30   59:aload_1         
	//   31   60:astore_3        
		if(tokenbuffer1 != null)
	//*  32   61:aload           4
	//*  33   63:ifnull          77
			tokenbuffer = ((TokenBuffer) (JsonParserSequence.createFlattened(tokenbuffer1.asParser(jsonparser), jsonparser)));
	//   34   66:aload           4
	//   35   68:aload_1         
	//   36   69:invokevirtual   #69  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   37   72:aload_1         
	//   38   73:invokestatic    #75  <Method JsonParserSequence JsonParserSequence.createFlattened(JsonParser, JsonParser)>
	//   39   76:astore_3        
		((JsonParser) (tokenbuffer)).nextToken();
	//   40   77:aload_3         
	//   41   78:invokevirtual   #79  <Method JsonToken JsonParser.nextToken()>
	//   42   81:pop             
		return jsondeserializer.deserialize(((JsonParser) (tokenbuffer)), deserializationcontext);
	//   43   82:aload           5
	//   44   84:aload_3         
	//   45   85:aload_2         
	//   46   86:invokevirtual   #85  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   47   89:areturn         
	}

	protected Object _deserializeTypedUsingDefaultImpl(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
		throws IOException
	{
		JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #91  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//    3    5:astore          5
		if(jsondeserializer != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          47
		{
			JsonParser jsonparser1 = jsonparser;
	//    6   12:aload_1         
	//    7   13:astore          4
			if(tokenbuffer != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          36
			{
				tokenbuffer.writeEndObject();
	//   10   19:aload_3         
	//   11   20:invokevirtual   #95  <Method void TokenBuffer.writeEndObject()>
				jsonparser1 = tokenbuffer.asParser(jsonparser);
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #69  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   15   28:astore          4
				jsonparser1.nextToken();
	//   16   30:aload           4
	//   17   32:invokevirtual   #79  <Method JsonToken JsonParser.nextToken()>
	//   18   35:pop             
			}
			tokenbuffer = ((TokenBuffer) (jsondeserializer.deserialize(jsonparser1, deserializationcontext)));
	//   19   36:aload           5
	//   20   38:aload           4
	//   21   40:aload_2         
	//   22   41:invokevirtual   #85  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   23   44:astore_3        
		} else
	//*  24   45:aload_3         
	//*  25   46:areturn         
		{
			Object obj = TypeDeserializer.deserializeIfNatural(jsonparser, deserializationcontext, _baseType);
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:aload_0         
	//   29   50:getfield        #99  <Field JavaType _baseType>
	//   30   53:invokestatic    #105 <Method Object TypeDeserializer.deserializeIfNatural(JsonParser, DeserializationContext, JavaType)>
	//   31   56:astore          4
			tokenbuffer = ((TokenBuffer) (obj));
	//   32   58:aload           4
	//   33   60:astore_3        
			if(obj == null)
	//*  34   61:aload           4
	//*  35   63:ifnonnull       45
				if(jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
	//*  36   66:aload_1         
	//*  37   67:invokevirtual   #108 <Method JsonToken JsonParser.getCurrentToken()>
	//*  38   70:getstatic       #114 <Field JsonToken JsonToken.START_ARRAY>
	//*  39   73:if_acmpne       83
					return super.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:aload_2         
	//   43   79:invokespecial   #117 <Method Object AsArrayTypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   44   82:areturn         
				else
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder()).append("missing property '").append(_typePropertyName).append("' that is to contain type id  (for class ").append(baseTypeName()).append(")").toString());
	//   45   83:aload_2         
	//   46   84:aload_1         
	//   47   85:getstatic       #120 <Field JsonToken JsonToken.FIELD_NAME>
	//   48   88:new             #122 <Class StringBuilder>
	//   49   91:dup             
	//   50   92:invokespecial   #124 <Method void StringBuilder()>
	//   51   95:ldc1            #126 <String "missing property '">
	//   52   97:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   53  100:aload_0         
	//   54  101:getfield        #134 <Field String _typePropertyName>
	//   55  104:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   56  107:ldc1            #136 <String "' that is to contain type id  (for class ">
	//   57  109:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   58  112:aload_0         
	//   59  113:invokevirtual   #139 <Method String baseTypeName()>
	//   60  116:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   61  119:ldc1            #141 <String ")">
	//   62  121:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   63  124:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   64  127:invokevirtual   #150 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   65  130:athrow          
		}
		return ((Object) (tokenbuffer));
	}

	public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #108 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #114 <Field JsonToken JsonToken.START_ARRAY>
	//*   3    7:if_acmpne       17
			return super.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #153 <Method Object AsArrayTypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    8   16:areturn         
		else
			return deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #156 <Method Object deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//   13   23:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.canReadTypeId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #160 <Method boolean JsonParser.canReadTypeId()>
	//*   2    4:ifeq            24
		{
			Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #164 <Method Object JsonParser.getTypeId()>
	//    5   11:astore_3        
			if(obj != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          24
				return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #168 <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   23:areturn         
		}
		Object obj2 = ((Object) (jsonparser.getCurrentToken()));
	//   14   24:aload_1         
	//   15   25:invokevirtual   #108 <Method JsonToken JsonParser.getCurrentToken()>
	//   16   28:astore          4
		Object obj1;
		if(obj2 == JsonToken.START_OBJECT)
	//*  17   30:aload           4
	//*  18   32:getstatic       #171 <Field JsonToken JsonToken.START_OBJECT>
	//*  19   35:if_acmpne       89
		{
			obj1 = ((Object) (jsonparser.nextToken()));
	//   20   38:aload_1         
	//   21   39:invokevirtual   #79  <Method JsonToken JsonParser.nextToken()>
	//   22   42:astore_3        
		} else
	//*  23   43:aconst_null     
	//*  24   44:astore          4
	//*  25   46:aload_3         
	//*  26   47:astore          5
	//*  27   49:aload           5
	//*  28   51:getstatic       #120 <Field JsonToken JsonToken.FIELD_NAME>
	//*  29   54:if_acmpne       149
	//*  30   57:aload_1         
	//*  31   58:invokevirtual   #58  <Method String JsonParser.getCurrentName()>
	//*  32   61:astore          5
	//*  33   63:aload_1         
	//*  34   64:invokevirtual   #79  <Method JsonToken JsonParser.nextToken()>
	//*  35   67:pop             
	//*  36   68:aload           5
	//*  37   70:aload_0         
	//*  38   71:getfield        #134 <Field String _typePropertyName>
	//*  39   74:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  40   77:ifeq            108
	//*  41   80:aload_0         
	//*  42   81:aload_1         
	//*  43   82:aload_2         
	//*  44   83:aload           4
	//*  45   85:invokevirtual   #179 <Method Object _deserializeTypedForId(JsonParser, DeserializationContext, TokenBuffer)>
	//*  46   88:areturn         
		{
			obj1 = obj2;
	//   47   89:aload           4
	//   48   91:astore_3        
			if(obj2 != JsonToken.FIELD_NAME)
	//*  49   92:aload           4
	//*  50   94:getstatic       #120 <Field JsonToken JsonToken.FIELD_NAME>
	//*  51   97:if_acmpeq       43
				return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (null)));
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload_2         
	//   55  103:aconst_null     
	//   56  104:invokevirtual   #181 <Method Object _deserializeTypedUsingDefaultImpl(JsonParser, DeserializationContext, TokenBuffer)>
	//   57  107:areturn         
		}
		obj2 = null;
		for(Object obj3 = obj1; obj3 == JsonToken.FIELD_NAME;)
		{
			obj3 = ((Object) (jsonparser.getCurrentName()));
			jsonparser.nextToken();
			if(((String) (obj3)).equals(((Object) (_typePropertyName))))
				return _deserializeTypedForId(jsonparser, deserializationcontext, ((TokenBuffer) (obj2)));
			obj1 = obj2;
	//   58  108:aload           4
	//   59  110:astore_3        
			if(obj2 == null)
	//*  60  111:aload           4
	//*  61  113:ifnonnull       126
				obj1 = ((Object) (new TokenBuffer(jsonparser, deserializationcontext)));
	//   62  116:new             #52  <Class TokenBuffer>
	//   63  119:dup             
	//   64  120:aload_1         
	//   65  121:aload_2         
	//   66  122:invokespecial   #55  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   67  125:astore_3        
			((TokenBuffer) (obj1)).writeFieldName(((String) (obj3)));
	//   68  126:aload_3         
	//   69  127:aload           5
	//   70  129:invokevirtual   #62  <Method void TokenBuffer.writeFieldName(String)>
			((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
	//   71  132:aload_3         
	//   72  133:aload_1         
	//   73  134:invokevirtual   #185 <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			obj3 = ((Object) (jsonparser.nextToken()));
	//   74  137:aload_1         
	//   75  138:invokevirtual   #79  <Method JsonToken JsonParser.nextToken()>
	//   76  141:astore          5
			obj2 = obj1;
	//   77  143:aload_3         
	//   78  144:astore          4
		}

	//*  79  146:goto            49
		return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (obj2)));
	//   80  149:aload_0         
	//   81  150:aload_1         
	//   82  151:aload_2         
	//   83  152:aload           4
	//   84  154:invokevirtual   #181 <Method Object _deserializeTypedUsingDefaultImpl(JsonParser, DeserializationContext, TokenBuffer)>
	//   85  157:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #191 <Field BeanProperty _property>
	//*   3    5:if_acmpne       10
			return ((TypeDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((TypeDeserializer) (new AsPropertyTypeDeserializer(this, beanproperty)));
	//    6   10:new             #2   <Class AsPropertyTypeDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #193 <Method void AsPropertyTypeDeserializer(AsPropertyTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return _inclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final com.fasterxml.jackson.annotation.JsonTypeInfo.As _inclusion;
}
