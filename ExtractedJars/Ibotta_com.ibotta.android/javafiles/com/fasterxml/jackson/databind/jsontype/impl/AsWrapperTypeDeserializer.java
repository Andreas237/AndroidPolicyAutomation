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

	public AsWrapperTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, JavaType javatype1)
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

	protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer aswrappertypedeserializer, BeanProperty beanproperty)
	{
		super(((TypeDeserializerBase) (aswrappertypedeserializer)), beanproperty);
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
	//*   2    4:ifeq            24
		{
			Object obj = jsonparser.getTypeId();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Object JsonParser.getTypeId()>
	//    5   11:astore_3        
			if(obj != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          24
				return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #37  <Method Object _deserializeWithNativeTypeId(JsonParser, DeserializationContext, Object)>
	//   13   23:areturn         
		}
		Object obj1 = ((Object) (jsonparser.getCurrentToken()));
	//   14   24:aload_1         
	//   15   25:invokevirtual   #41  <Method JsonToken JsonParser.getCurrentToken()>
	//   16   28:astore_3        
		if(obj1 == JsonToken.START_OBJECT)
	//*  17   29:aload_3         
	//*  18   30:getstatic       #47  <Field JsonToken JsonToken.START_OBJECT>
	//*  19   33:if_acmpne       110
		{
			if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #50  <Method JsonToken JsonParser.nextToken()>
	//*  22   40:getstatic       #53  <Field JsonToken JsonToken.FIELD_NAME>
	//*  23   43:if_acmpeq       170
			{
				obj1 = ((Object) (baseType()));
	//   24   46:aload_0         
	//   25   47:invokevirtual   #57  <Method JavaType baseType()>
	//   26   50:astore_3        
				JsonToken jsontoken = JsonToken.FIELD_NAME;
	//   27   51:getstatic       #53  <Field JsonToken JsonToken.FIELD_NAME>
	//   28   54:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   29   56:new             #59  <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #62  <Method void StringBuilder()>
	//   32   63:astore          5
				stringbuilder.append("need JSON String that contains type id (for subtype of ");
	//   33   65:aload           5
	//   34   67:ldc1            #64  <String "need JSON String that contains type id (for subtype of ">
	//   35   69:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
				stringbuilder.append(baseTypeName());
	//   37   73:aload           5
	//   38   75:aload_0         
	//   39   76:invokevirtual   #72  <Method String baseTypeName()>
	//   40   79:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
				stringbuilder.append(")");
	//   42   83:aload           5
	//   43   85:ldc1            #74  <String ")">
	//   44   87:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
				deserializationcontext.reportWrongTokenException(((JavaType) (obj1)), jsontoken, stringbuilder.toString(), new Object[0]);
	//   46   91:aload_2         
	//   47   92:aload_3         
	//   48   93:aload           4
	//   49   95:aload           5
	//   50   97:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   51  100:iconst_0        
	//   52  101:anewarray       Object[]
	//   53  104:invokevirtual   #85  <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
			}
		} else
	//*  54  107:goto            170
		if(obj1 != JsonToken.FIELD_NAME)
	//*  55  110:aload_3         
	//*  56  111:getstatic       #53  <Field JsonToken JsonToken.FIELD_NAME>
	//*  57  114:if_acmpeq       170
		{
			obj1 = ((Object) (baseType()));
	//   58  117:aload_0         
	//   59  118:invokevirtual   #57  <Method JavaType baseType()>
	//   60  121:astore_3        
			JsonToken jsontoken1 = JsonToken.START_OBJECT;
	//   61  122:getstatic       #47  <Field JsonToken JsonToken.START_OBJECT>
	//   62  125:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   63  127:new             #59  <Class StringBuilder>
	//   64  130:dup             
	//   65  131:invokespecial   #62  <Method void StringBuilder()>
	//   66  134:astore          5
			stringbuilder1.append("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
	//   67  136:aload           5
	//   68  138:ldc1            #87  <String "need JSON Object to contain As.WRAPPER_OBJECT type information for class ">
	//   69  140:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
			stringbuilder1.append(baseTypeName());
	//   71  144:aload           5
	//   72  146:aload_0         
	//   73  147:invokevirtual   #72  <Method String baseTypeName()>
	//   74  150:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   75  153:pop             
			deserializationcontext.reportWrongTokenException(((JavaType) (obj1)), jsontoken1, stringbuilder1.toString(), new Object[0]);
	//   76  154:aload_2         
	//   77  155:aload_3         
	//   78  156:aload           4
	//   79  158:aload           5
	//   80  160:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   81  163:iconst_0        
	//   82  164:anewarray       Object[]
	//   83  167:invokevirtual   #85  <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		}
		String s = jsonparser.getText();
	//   84  170:aload_1         
	//   85  171:invokevirtual   #90  <Method String JsonParser.getText()>
	//   86  174:astore          5
		JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
	//   87  176:aload_0         
	//   88  177:aload_2         
	//   89  178:aload           5
	//   90  180:invokevirtual   #94  <Method JsonDeserializer _findDeserializer(DeserializationContext, String)>
	//   91  183:astore          4
		jsonparser.nextToken();
	//   92  185:aload_1         
	//   93  186:invokevirtual   #50  <Method JsonToken JsonParser.nextToken()>
	//   94  189:pop             
		obj1 = ((Object) (jsonparser));
	//   95  190:aload_1         
	//   96  191:astore_3        
		if(_typeIdVisible)
	//*  97  192:aload_0         
	//*  98  193:getfield        #98  <Field boolean _typeIdVisible>
	//*  99  196:ifeq            259
		{
			obj1 = ((Object) (jsonparser));
	//  100  199:aload_1         
	//  101  200:astore_3        
			if(jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
	//* 102  201:aload_1         
	//* 103  202:invokevirtual   #41  <Method JsonToken JsonParser.getCurrentToken()>
	//* 104  205:getstatic       #47  <Field JsonToken JsonToken.START_OBJECT>
	//* 105  208:if_acmpne       259
			{
				obj1 = ((Object) (new TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec) (null)), false)));
	//  106  211:new             #100 <Class TokenBuffer>
	//  107  214:dup             
	//  108  215:aconst_null     
	//  109  216:iconst_0        
	//  110  217:invokespecial   #103 <Method void TokenBuffer(com.fasterxml.jackson.core.ObjectCodec, boolean)>
	//  111  220:astore_3        
				((TokenBuffer) (obj1)).writeStartObject();
	//  112  221:aload_3         
	//  113  222:invokevirtual   #106 <Method void TokenBuffer.writeStartObject()>
				((TokenBuffer) (obj1)).writeFieldName(_typePropertyName);
	//  114  225:aload_3         
	//  115  226:aload_0         
	//  116  227:getfield        #110 <Field String _typePropertyName>
	//  117  230:invokevirtual   #114 <Method void TokenBuffer.writeFieldName(String)>
				((TokenBuffer) (obj1)).writeString(s);
	//  118  233:aload_3         
	//  119  234:aload           5
	//  120  236:invokevirtual   #117 <Method void TokenBuffer.writeString(String)>
				jsonparser.clearCurrentToken();
	//  121  239:aload_1         
	//  122  240:invokevirtual   #120 <Method void JsonParser.clearCurrentToken()>
				obj1 = ((Object) (JsonParserSequence.createFlattened(false, ((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser)));
	//  123  243:iconst_0        
	//  124  244:aload_3         
	//  125  245:aload_1         
	//  126  246:invokevirtual   #124 <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//  127  249:aload_1         
	//  128  250:invokestatic    #130 <Method JsonParserSequence JsonParserSequence.createFlattened(boolean, JsonParser, JsonParser)>
	//  129  253:astore_3        
				((JsonParser) (obj1)).nextToken();
	//  130  254:aload_3         
	//  131  255:invokevirtual   #50  <Method JsonToken JsonParser.nextToken()>
	//  132  258:pop             
			}
		}
		jsonparser = ((JsonParser) (jsondeserializer.deserialize(((JsonParser) (obj1)), deserializationcontext)));
	//  133  259:aload           4
	//  134  261:aload_3         
	//  135  262:aload_2         
	//  136  263:invokevirtual   #135 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//  137  266:astore_1        
		if(((JsonParser) (obj1)).nextToken() != JsonToken.END_OBJECT)
	//* 138  267:aload_3         
	//* 139  268:invokevirtual   #50  <Method JsonToken JsonParser.nextToken()>
	//* 140  271:getstatic       #138 <Field JsonToken JsonToken.END_OBJECT>
	//* 141  274:if_acmpeq       294
			deserializationcontext.reportWrongTokenException(baseType(), JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
	//  142  277:aload_2         
	//  143  278:aload_0         
	//  144  279:invokevirtual   #57  <Method JavaType baseType()>
	//  145  282:getstatic       #138 <Field JsonToken JsonToken.END_OBJECT>
	//  146  285:ldc1            #140 <String "expected closing END_OBJECT after type information and deserialized value">
	//  147  287:iconst_0        
	//  148  288:anewarray       Object[]
	//  149  291:invokevirtual   #85  <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		return ((Object) (jsonparser));
	//  150  294:aload_1         
	//  151  295:areturn         
	}

	public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #144 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #144 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #144 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #144 <Method Object _deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #153 <Field BeanProperty _property>
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
	//   10   16:invokespecial   #155 <Method void AsWrapperTypeDeserializer(AsWrapperTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
	//    0    0:getstatic       #163 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
