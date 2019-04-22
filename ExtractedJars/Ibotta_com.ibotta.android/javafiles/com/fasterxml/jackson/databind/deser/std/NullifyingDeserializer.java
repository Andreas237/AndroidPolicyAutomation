// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class NullifyingDeserializer extends StdDeserializer
{

	public NullifyingDeserializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Object>
	//    2    3:invokespecial   #24  <Method void StdDeserializer(Class)>
	//    3    6:return          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #34  <Field JsonToken JsonToken.FIELD_NAME>
	//*   2    4:invokevirtual   #40  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            37
			do
			{
				deserializationcontext = ((DeserializationContext) (jsonparser.nextToken()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #44  <Method JsonToken JsonParser.nextToken()>
	//    6   14:astore_2        
				if(deserializationcontext == null || deserializationcontext == JsonToken.END_OBJECT)
	//*   7   15:aload_2         
	//*   8   16:ifnull          42
	//*   9   19:aload_2         
	//*  10   20:getstatic       #47  <Field JsonToken JsonToken.END_OBJECT>
	//*  11   23:if_acmpne       29
					break;
	//   12   26:goto            42
				jsonparser.skipChildren();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #51  <Method JsonParser JsonParser.skipChildren()>
	//   15   33:pop             
			} while(true);
	//   16   34:goto            10
		else
			jsonparser.skipChildren();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #51  <Method JsonParser JsonParser.skipChildren()>
	//   19   41:pop             
		return ((Object) (null));
	//   20   42:aconst_null     
	//   21   43:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore          4
		if(i != 1 && i != 3 && i != 5)
	//*   3    6:iload           4
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          26
	//*   6   12:iload           4
	//*   7   14:iconst_3        
	//*   8   15:icmpeq          26
	//*   9   18:iload           4
	//*  10   20:iconst_5        
	//*  11   21:icmpeq          26
			return ((Object) (null));
	//   12   24:aconst_null     
	//   13   25:areturn         
		else
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #63  <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   18   32:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.FALSE;
	//    0    0:getstatic       #71  <Field Boolean Boolean.FALSE>
	//    1    3:areturn         
	}

	public static final NullifyingDeserializer instance = new NullifyingDeserializer();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class NullifyingDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NullifyingDeserializer()>
	//    3    7:putstatic       #18  <Field NullifyingDeserializer instance>
	//*   4   10:return          
	}
}
