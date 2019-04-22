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

	public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, JavaType javatype1, com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		super(javatype, typeidresolver, s, flag, javatype1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #15  <Method void AsArrayTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType)>
		_inclusion = as;
	//    7   11:aload_0         
	//    8   12:aload           6
	//    9   14:putfield        #17  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//   10   17:return          
	}

	public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer aspropertytypedeserializer, BeanProperty beanproperty)
	{
		super(((AsArrayTypeDeserializer) (aspropertytypedeserializer)), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void AsArrayTypeDeserializer(AsArrayTypeDeserializer, BeanProperty)>
		_inclusion = aspropertytypedeserializer._inclusion;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #17  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    7   11:putfield        #17  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    8   14:return          
	}

	protected Object _deserializeTypedForId(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
		throws IOException
	{
		String s = jsonparser.getText();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method String JsonParser.getText()>
	//    2    4:astore          6
		JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:aload           6
	//    6   10:invokevirtual   #36  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//    7   13:astore          5
		TokenBuffer tokenbuffer1 = tokenbuffer;
	//    8   15:aload_3         
	//    9   16:astore          4
		if(_typeIdVisible)
	//*  10   18:aload_0         
	//*  11   19:getfield        #40  <Field boolean _typeIdVisible>
	//*  12   22:ifeq            59
		{
			tokenbuffer1 = tokenbuffer;
	//   13   25:aload_3         
	//   14   26:astore          4
			if(tokenbuffer == null)
	//*  15   28:aload_3         
	//*  16   29:ifnonnull       43
				tokenbuffer1 = new TokenBuffer(jsonparser, deserializationcontext);
	//   17   32:new             #42  <Class TokenBuffer>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokespecial   #45  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   22   41:astore          4
			tokenbuffer1.writeFieldName(jsonparser.getCurrentName());
	//   23   43:aload           4
	//   24   45:aload_1         
	//   25   46:invokevirtual   #48  <Method String JsonParser.getCurrentName()>
	//   26   49:invokevirtual   #52  <Method void TokenBuffer.writeFieldName(String)>
			tokenbuffer1.writeString(s);
	//   27   52:aload           4
	//   28   54:aload           6
	//   29   56:invokevirtual   #55  <Method void TokenBuffer.writeString(String)>
		}
		tokenbuffer = ((TokenBuffer) (jsonparser));
	//   30   59:aload_1         
	//   31   60:astore_3        
		if(tokenbuffer1 != null)
	//*  32   61:aload           4
	//*  33   63:ifnull          82
		{
			jsonparser.clearCurrentToken();
	//   34   66:aload_1         
	//   35   67:invokevirtual   #59  <Method void JsonParser.clearCurrentToken()>
			tokenbuffer = ((TokenBuffer) (JsonParserSequence.createFlattened(false, tokenbuffer1.asParser(jsonparser), jsonparser)));
	//   36   70:iconst_0        
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokevirtual   #63  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   40   77:aload_1         
	//   41   78:invokestatic    #69  <Method JsonParserSequence JsonParserSequence.createFlattened(boolean, JsonParser, JsonParser)>
	//   42   81:astore_3        
		}
		((JsonParser) (tokenbuffer)).nextToken();
	//   43   82:aload_3         
	//   44   83:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   45   86:pop             
		return jsondeserializer.deserialize(((JsonParser) (tokenbuffer)), deserializationcontext);
	//   46   87:aload           5
	//   47   89:aload_3         
	//   48   90:aload_2         
	//   49   91:invokevirtual   #79  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   50   94:areturn         
	}

	protected Object _deserializeTypedUsingDefaultImpl(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
		throws IOException
	{
		Object obj1 = ((Object) (_findDefaultImplDeserializer(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #85  <Method JsonDeserializer _findDefaultImplDeserializer(DeserializationContext)>
	//    3    5:astore          5
		Object obj = obj1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(obj1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       169
		{
			obj = TypeDeserializer.deserializeIfNatural(jsonparser, deserializationcontext, _baseType);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #89  <Field JavaType _baseType>
	//   12   22:invokestatic    #95  <Method Object TypeDeserializer.deserializeIfNatural(JsonParser, DeserializationContext, JavaType)>
	//   13   25:astore          4
			if(obj != null)
	//*  14   27:aload           4
	//*  15   29:ifnull          35
				return obj;
	//   16   32:aload           4
	//   17   34:areturn         
			if(jsonparser.isExpectedStartArrayToken())
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #99  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  20   39:ifeq            49
				return super.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:invokespecial   #102 <Method Object AsArrayTypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   25   48:areturn         
			if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().trim().isEmpty())
	//*  26   49:aload_1         
	//*  27   50:getstatic       #108 <Field JsonToken JsonToken.VALUE_STRING>
	//*  28   53:invokevirtual   #112 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  29   56:ifeq            84
	//*  30   59:aload_2         
	//*  31   60:getstatic       #118 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*  32   63:invokevirtual   #124 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  33   66:ifeq            84
	//*  34   69:aload_1         
	//*  35   70:invokevirtual   #32  <Method String JsonParser.getText()>
	//*  36   73:invokevirtual   #129 <Method String String.trim()>
	//*  37   76:invokevirtual   #132 <Method boolean String.isEmpty()>
	//*  38   79:ifeq            84
				return ((Object) (null));
	//   39   82:aconst_null     
	//   40   83:areturn         
			obj1 = ((Object) (String.format("missing type id property '%s'", new Object[] {
				_typePropertyName
			})));
	//   41   84:ldc1            #134 <String "missing type id property '%s'">
	//   42   86:iconst_1        
	//   43   87:anewarray       Object[]
	//   44   90:dup             
	//   45   91:iconst_0        
	//   46   92:aload_0         
	//   47   93:getfield        #140 <Field String _typePropertyName>
	//   48   96:aastore         
	//   49   97:invokestatic    #144 <Method String String.format(String, Object[])>
	//   50  100:astore          5
			obj = obj1;
	//   51  102:aload           5
	//   52  104:astore          4
			if(_property != null)
	//*  53  106:aload_0         
	//*  54  107:getfield        #148 <Field BeanProperty _property>
	//*  55  110:ifnull          141
				obj = ((Object) (String.format("%s (for POJO property '%s')", new Object[] {
					obj1, _property.getName()
				})));
	//   56  113:ldc1            #150 <String "%s (for POJO property '%s')">
	//   57  115:iconst_2        
	//   58  116:anewarray       Object[]
	//   59  119:dup             
	//   60  120:iconst_0        
	//   61  121:aload           5
	//   62  123:aastore         
	//   63  124:dup             
	//   64  125:iconst_1        
	//   65  126:aload_0         
	//   66  127:getfield        #148 <Field BeanProperty _property>
	//   67  130:invokeinterface #155 <Method String BeanProperty.getName()>
	//   68  135:aastore         
	//   69  136:invokestatic    #144 <Method String String.format(String, Object[])>
	//   70  139:astore          4
			obj = ((Object) (_handleMissingTypeId(deserializationcontext, ((String) (obj)))));
	//   71  141:aload_0         
	//   72  142:aload_2         
	//   73  143:aload           4
	//   74  145:invokevirtual   #159 <Method JavaType _handleMissingTypeId(DeserializationContext, String)>
	//   75  148:astore          4
			if(obj == null)
	//*  76  150:aload           4
	//*  77  152:ifnonnull       157
				return ((Object) (null));
	//   78  155:aconst_null     
	//   79  156:areturn         
			obj = ((Object) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), _property)));
	//   80  157:aload_2         
	//   81  158:aload           4
	//   82  160:aload_0         
	//   83  161:getfield        #148 <Field BeanProperty _property>
	//   84  164:invokevirtual   #163 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   85  167:astore          4
		}
		obj1 = ((Object) (jsonparser));
	//   86  169:aload_1         
	//   87  170:astore          5
		if(tokenbuffer != null)
	//*  88  172:aload_3         
	//*  89  173:ifnull          193
		{
			tokenbuffer.writeEndObject();
	//   90  176:aload_3         
	//   91  177:invokevirtual   #166 <Method void TokenBuffer.writeEndObject()>
			obj1 = ((Object) (tokenbuffer.asParser(jsonparser)));
	//   92  180:aload_3         
	//   93  181:aload_1         
	//   94  182:invokevirtual   #63  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   95  185:astore          5
			((JsonParser) (obj1)).nextToken();
	//   96  187:aload           5
	//   97  189:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   98  192:pop             
		}
		return ((JsonDeserializer) (obj)).deserialize(((JsonParser) (obj1)), deserializationcontext);
	//   99  193:aload           4
	//  100  195:aload           5
	//  101  197:aload_2         
	//  102  198:invokevirtual   #79  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//  103  201:areturn         
	}

	public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #169 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #172 <Field JsonToken JsonToken.START_ARRAY>
	//*   3    7:if_acmpne       17
			return super.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #175 <Method Object AsArrayTypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    8   16:areturn         
		else
			return deserializeTypedFromObject(jsonparser, deserializationcontext);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #178 <Method Object deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//   13   23:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.canReadTypeId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #181 <Method boolean JsonParser.canReadTypeId()>
	//*   2    4:ifeq            24
		{
			Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #185 <Method Object JsonParser.getTypeId()>
	//    5   11:astore_3        
			if(obj != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          24
				return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #189 <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   23:areturn         
		}
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #169 <Method JsonToken JsonParser.getCurrentToken()>
	//   16   28:astore          5
		Object obj1 = ((Object) (JsonToken.START_OBJECT));
	//   17   30:getstatic       #192 <Field JsonToken JsonToken.START_OBJECT>
	//   18   33:astore_3        
		TokenBuffer tokenbuffer = null;
	//   19   34:aconst_null     
	//   20   35:astore          4
		if(jsontoken == obj1)
	//*  21   37:aload           5
	//*  22   39:aload_3         
	//*  23   40:if_acmpne       51
		{
			obj1 = ((Object) (jsonparser.nextToken()));
	//   24   43:aload_1         
	//   25   44:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   26   47:astore_3        
		} else
	//*  27   48:goto            70
		{
			obj1 = ((Object) (jsontoken));
	//   28   51:aload           5
	//   29   53:astore_3        
			if(jsontoken != JsonToken.FIELD_NAME)
	//*  30   54:aload           5
	//*  31   56:getstatic       #195 <Field JsonToken JsonToken.FIELD_NAME>
	//*  32   59:if_acmpeq       70
				return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (null)));
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:aload_2         
	//   36   65:aconst_null     
	//   37   66:invokevirtual   #197 <Method Object _deserializeTypedUsingDefaultImpl(JsonParser, DeserializationContext, TokenBuffer)>
	//   38   69:areturn         
		}
		while(obj1 == JsonToken.FIELD_NAME) 
	//*  39   70:aload_3         
	//*  40   71:getstatic       #195 <Field JsonToken JsonToken.FIELD_NAME>
	//*  41   74:if_acmpne       151
		{
			obj1 = ((Object) (jsonparser.getCurrentName()));
	//   42   77:aload_1         
	//   43   78:invokevirtual   #48  <Method String JsonParser.getCurrentName()>
	//   44   81:astore_3        
			jsonparser.nextToken();
	//   45   82:aload_1         
	//   46   83:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   47   86:pop             
			if(((String) (obj1)).equals(((Object) (_typePropertyName))))
	//*  48   87:aload_3         
	//*  49   88:aload_0         
	//*  50   89:getfield        #140 <Field String _typePropertyName>
	//*  51   92:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  52   95:ifeq            107
				return _deserializeTypedForId(jsonparser, deserializationcontext, tokenbuffer);
	//   53   98:aload_0         
	//   54   99:aload_1         
	//   55  100:aload_2         
	//   56  101:aload           4
	//   57  103:invokevirtual   #203 <Method Object _deserializeTypedForId(JsonParser, DeserializationContext, TokenBuffer)>
	//   58  106:areturn         
			TokenBuffer tokenbuffer1 = tokenbuffer;
	//   59  107:aload           4
	//   60  109:astore          5
			if(tokenbuffer == null)
	//*  61  111:aload           4
	//*  62  113:ifnonnull       127
				tokenbuffer1 = new TokenBuffer(jsonparser, deserializationcontext);
	//   63  116:new             #42  <Class TokenBuffer>
	//   64  119:dup             
	//   65  120:aload_1         
	//   66  121:aload_2         
	//   67  122:invokespecial   #45  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   68  125:astore          5
			tokenbuffer1.writeFieldName(((String) (obj1)));
	//   69  127:aload           5
	//   70  129:aload_3         
	//   71  130:invokevirtual   #52  <Method void TokenBuffer.writeFieldName(String)>
			tokenbuffer1.copyCurrentStructure(jsonparser);
	//   72  133:aload           5
	//   73  135:aload_1         
	//   74  136:invokevirtual   #207 <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			obj1 = ((Object) (jsonparser.nextToken()));
	//   75  139:aload_1         
	//   76  140:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   77  143:astore_3        
			tokenbuffer = tokenbuffer1;
	//   78  144:aload           5
	//   79  146:astore          4
		}
	//*  80  148:goto            70
		return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, tokenbuffer);
	//   81  151:aload_0         
	//   82  152:aload_1         
	//   83  153:aload_2         
	//   84  154:aload           4
	//   85  156:invokevirtual   #197 <Method Object _deserializeTypedUsingDefaultImpl(JsonParser, DeserializationContext, TokenBuffer)>
	//   86  159:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #148 <Field BeanProperty _property>
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
	//   10   16:invokespecial   #211 <Method void AsPropertyTypeDeserializer(AsPropertyTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return _inclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _inclusion>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final com.fasterxml.jackson.annotation.JsonTypeInfo.As _inclusion;
}
