// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class StringDeserializer extends StdScalarDeserializer
{

	public StringDeserializer()
	{
		super(java/lang/String);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Class String>
	//    2    3:invokespecial   #25  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #34  <Method String deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public String deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_STRING))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #41  <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #47  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            15
			return jsonparser.getText();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #51  <Method String JsonParser.getText()>
	//    6   14:areturn         
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #55  <Method JsonToken JsonParser.getCurrentToken()>
	//    9   19:astore_3        
		if(jsontoken == JsonToken.START_ARRAY)
	//*  10   20:aload_3         
	//*  11   21:getstatic       #58  <Field JsonToken JsonToken.START_ARRAY>
	//*  12   24:if_acmpne       37
			return (String)_deserializeFromArray(jsonparser, deserializationcontext);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #61  <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//   17   33:checkcast       #22  <Class String>
	//   18   36:areturn         
		if(jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  19   37:aload_3         
	//*  20   38:getstatic       #64  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  21   41:if_acmpne       80
		{
			jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #68  <Method Object JsonParser.getEmbeddedObject()>
	//   24   48:astore_1        
			if(jsonparser == null)
	//*  25   49:aload_1         
	//*  26   50:ifnonnull       55
				return null;
	//   27   53:aconst_null     
	//   28   54:areturn         
			if(jsonparser instanceof byte[])
	//*  29   55:aload_1         
	//*  30   56:instanceof      #70  <Class byte[]>
	//*  31   59:ifeq            75
				return deserializationcontext.getBase64Variant().encode((byte[])jsonparser, false);
	//   32   62:aload_2         
	//   33   63:invokevirtual   #76  <Method Base64Variant DeserializationContext.getBase64Variant()>
	//   34   66:aload_1         
	//   35   67:checkcast       #70  <Class byte[]>
	//   36   70:iconst_0        
	//   37   71:invokevirtual   #82  <Method String Base64Variant.encode(byte[], boolean)>
	//   38   74:areturn         
			else
				return ((Object) (jsonparser)).toString();
	//   39   75:aload_1         
	//   40   76:invokevirtual   #87  <Method String Object.toString()>
	//   41   79:areturn         
		}
		if(jsontoken.isScalarValue())
	//*  42   80:aload_3         
	//*  43   81:invokevirtual   #91  <Method boolean JsonToken.isScalarValue()>
	//*  44   84:ifeq            98
		{
			String s = jsonparser.getValueAsString();
	//   45   87:aload_1         
	//   46   88:invokevirtual   #94  <Method String JsonParser.getValueAsString()>
	//   47   91:astore_3        
			if(s != null)
	//*  48   92:aload_3         
	//*  49   93:ifnull          98
				return s;
	//   50   96:aload_3         
	//   51   97:areturn         
		}
		return (String)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:getfield        #98  <Field Class _valueClass>
	//   55  103:aload_1         
	//   56  104:invokevirtual   #102 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   57  107:checkcast       #22  <Class String>
	//   58  110:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #107 <Method String deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public String deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #34  <Method String deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (""));
	//    0    0:ldc1            #113 <String "">
	//    1    2:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static final StringDeserializer instance = new StringDeserializer();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class StringDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringDeserializer()>
	//    3    7:putstatic       #19  <Field StringDeserializer instance>
	//*   4   10:return          
	}
}
