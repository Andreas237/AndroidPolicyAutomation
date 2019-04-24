// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public final class StringDeserializer extends StdScalarDeserializer
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
		Object obj;
		if(jsonparser.hasToken(JsonToken.VALUE_STRING))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #41  <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #47  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            17
		{
			obj = ((Object) (jsonparser.getText()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #51  <Method String JsonParser.getText()>
	//    6   14:astore_3        
		} else
	//*   7   15:aload_3         
	//*   8   16:areturn         
		{
			obj = ((Object) (jsonparser.getCurrentToken()));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #55  <Method JsonToken JsonParser.getCurrentToken()>
	//   11   21:astore_3        
			if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  12   22:aload_3         
	//*  13   23:getstatic       #58  <Field JsonToken JsonToken.START_ARRAY>
	//*  14   26:if_acmpne       72
	//*  15   29:aload_2         
	//*  16   30:getstatic       #64  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  17   33:invokevirtual   #70  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  18   36:ifeq            72
			{
				jsonparser.nextToken();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   21   43:pop             
				obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #76  <Method String _parseString(JsonParser, DeserializationContext)>
	//   26   50:astore_3        
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//*  29   55:getstatic       #79  <Field JsonToken JsonToken.END_ARRAY>
	//*  30   58:if_acmpeq       15
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array");
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:getstatic       #79  <Field JsonToken JsonToken.END_ARRAY>
	//   34   66:ldc1            #81  <String "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array">
	//   35   68:invokevirtual   #85  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   36   71:athrow          
			} else
			{
				if(obj == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  37   72:aload_3         
	//*  38   73:getstatic       #88  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  39   76:if_acmpne       118
				{
					jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//   40   79:aload_1         
	//   41   80:invokevirtual   #92  <Method Object JsonParser.getEmbeddedObject()>
	//   42   83:astore_1        
					if(jsonparser == null)
	//*  43   84:aload_1         
	//*  44   85:ifnonnull       90
						return null;
	//   45   88:aconst_null     
	//   46   89:areturn         
					if(jsonparser instanceof byte[])
	//*  47   90:aload_1         
	//*  48   91:instanceof      #94  <Class byte[]>
	//*  49   94:ifeq            113
						return deserializationcontext.getBase64Variant().encode((byte[])(byte[])jsonparser, false);
	//   50   97:aload_2         
	//   51   98:invokevirtual   #98  <Method Base64Variant DeserializationContext.getBase64Variant()>
	//   52  101:aload_1         
	//   53  102:checkcast       #94  <Class byte[]>
	//   54  105:checkcast       #94  <Class byte[]>
	//   55  108:iconst_0        
	//   56  109:invokevirtual   #104 <Method String Base64Variant.encode(byte[], boolean)>
	//   57  112:areturn         
					else
						return ((Object) (jsonparser)).toString();
	//   58  113:aload_1         
	//   59  114:invokevirtual   #109 <Method String Object.toString()>
	//   60  117:areturn         
				}
				obj = ((Object) (jsonparser.getValueAsString()));
	//   61  118:aload_1         
	//   62  119:invokevirtual   #112 <Method String JsonParser.getValueAsString()>
	//   63  122:astore_3        
				if(obj != null)
	//*  64  123:aload_3         
	//*  65  124:ifnull          129
					return ((String) (obj));
	//   66  127:aload_3         
	//   67  128:areturn         
				else
					throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//   68  129:aload_2         
	//   69  130:aload_0         
	//   70  131:getfield        #116 <Field Class _valueClass>
	//   71  134:aload_1         
	//   72  135:invokevirtual   #55  <Method JsonToken JsonParser.getCurrentToken()>
	//   73  138:invokevirtual   #120 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   74  141:athrow          
			}
		}
		return ((String) (obj));
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #125 <Method String deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
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
