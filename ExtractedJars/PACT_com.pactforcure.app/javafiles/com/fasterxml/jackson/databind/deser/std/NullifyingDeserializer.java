// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
		if(!jsonparser.hasToken(JsonToken.FIELD_NAME))
			break MISSING_BLOCK_LABEL_36;
	//    0    0:aload_1         
	//    1    1:getstatic       #34  <Field JsonToken JsonToken.FIELD_NAME>
	//    2    4:invokevirtual   #40  <Method boolean JsonParser.hasToken(JsonToken)>
	//    3    7:ifeq            36
_L3:
		deserializationcontext = ((DeserializationContext) (jsonparser.nextToken()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #44  <Method JsonToken JsonParser.nextToken()>
	//    6   14:astore_2        
		if(deserializationcontext != null && deserializationcontext != JsonToken.END_OBJECT) goto _L2; else goto _L1
	//    7   15:aload_2         
	//    8   16:ifnull          26
	//    9   19:aload_2         
	//   10   20:getstatic       #47  <Field JsonToken JsonToken.END_OBJECT>
	//   11   23:if_acmpne       28
_L1:
		return ((Object) (null));
	//   12   26:aconst_null     
	//   13   27:areturn         
_L2:
		jsonparser.skipChildren();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #51  <Method JsonParser JsonParser.skipChildren()>
	//   16   32:pop             
		  goto _L3
	//*  17   33:goto            10
		jsonparser.skipChildren();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #51  <Method JsonParser JsonParser.skipChildren()>
	//   20   40:pop             
		  goto _L1
	//*  21   41:goto            26
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #58  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 42
	//	               2 40
	//	               3 42
	//	               4 40
	//	               5 42
		case 2: // '\002'
		case 4: // '\004'
		default:
			return ((Object) (null));
	//    3   40:aconst_null     
	//    4   41:areturn         

		case 1: // '\001'
		case 3: // '\003'
		case 5: // '\005'
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    5   42:aload_3         
	//    6   43:aload_1         
	//    7   44:aload_2         
	//    8   45:invokevirtual   #63  <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    9   48:areturn         
		}
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
