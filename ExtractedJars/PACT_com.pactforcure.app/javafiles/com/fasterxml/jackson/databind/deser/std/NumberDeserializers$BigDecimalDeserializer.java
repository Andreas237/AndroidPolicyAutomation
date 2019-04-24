// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.math.BigDecimal;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

public static class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method BigDecimal deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 8: default 44
	//	               3 105
	//	               4 44
	//	               5 44
	//	               6 64
	//	               7 57
	//	               8 57;
	//    2    4:tableswitch     3 8: default 44
	//	               3 105
	//	               4 44
	//	               5 44
	//	               6 64
	//	               7 57
	//	               8 57
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L4
_L1:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   44:aload_2         
	//    4   45:aload_0         
	//    5   46:getfield        #46  <Field Class _valueClass>
	//    6   49:aload_1         
	//    7   50:invokevirtual   #50  <Method JsonToken JsonParser.getCurrentToken()>
	//    8   53:invokevirtual   #56  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   56:athrow          
_L4:
		Object obj = ((Object) (jsonparser.getDecimalValue()));
	//   10   57:aload_1         
	//   11   58:invokevirtual   #60  <Method BigDecimal JsonParser.getDecimalValue()>
	//   12   61:astore_3        
_L6:
		return ((BigDecimal) (obj));
	//   13   62:aload_3         
	//   14   63:areturn         
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   15   64:aload_1         
	//   16   65:invokevirtual   #64  <Method String JsonParser.getText()>
	//   17   68:invokevirtual   #69  <Method String String.trim()>
	//   18   71:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  19   72:aload_1         
	//*  20   73:invokevirtual   #72  <Method int String.length()>
	//*  21   76:ifne            81
			return null;
	//   22   79:aconst_null     
	//   23   80:areturn         
		try
		{
			obj = ((Object) (new BigDecimal(((String) (jsonparser)))));
	//   24   81:new             #21  <Class BigDecimal>
	//   25   84:dup             
	//   26   85:aload_1         
	//   27   86:invokespecial   #75  <Method void BigDecimal(String)>
	//   28   89:astore_3        
		}
	//*  29   90:aload_3         
	//*  30   91:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  31   92:astore_3        
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid representation");
	//   32   93:aload_2         
	//   33   94:aload_1         
	//   34   95:aload_0         
	//   35   96:getfield        #46  <Field Class _valueClass>
	//   36   99:ldc1            #77  <String "not a valid representation">
	//   37  101:invokevirtual   #81  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   38  104:athrow          
		}
		return ((BigDecimal) (obj));
_L2:
		if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
			continue; /* Loop/switch isn't completed */
	//   39  105:aload_2         
	//   40  106:getstatic       #87  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//   41  109:invokevirtual   #91  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   42  112:ifeq            44
		jsonparser.nextToken();
	//   43  115:aload_1         
	//   44  116:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
	//   45  119:pop             
		obj = ((Object) (deserialize(jsonparser, deserializationcontext)));
	//   46  120:aload_0         
	//   47  121:aload_1         
	//   48  122:aload_2         
	//   49  123:invokevirtual   #33  <Method BigDecimal deserialize(JsonParser, DeserializationContext)>
	//   50  126:astore_3        
		if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  51  127:aload_1         
	//*  52  128:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
	//*  53  131:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
	//*  54  134:if_acmpeq       62
			throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'BigDecimal' value but there was more than a single value in the array");
	//   55  137:aload_2         
	//   56  138:aload_1         
	//   57  139:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
	//   58  142:ldc1            #102 <String "Attempted to unwrap single value array for single 'BigDecimal' value but there was more than a single value in the array">
	//   59  144:invokevirtual   #106 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   60  147:athrow          
		if(true) goto _L6; else goto _L5
_L5:
		if(true) goto _L1; else goto _L7
_L7:
	}

	public static final NumberDeserializers$BigDecimalDeserializer instance = new NumberDeserializers$BigDecimalDeserializer();

	static 
	{
	//    0    0:new             #2   <Class NumberDeserializers$BigDecimalDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberDeserializers$BigDecimalDeserializer()>
	//    3    7:putstatic       #18  <Field NumberDeserializers$BigDecimalDeserializer instance>
	//*   4   10:return          
	}

	public NumberDeserializers$BigDecimalDeserializer()
	{
		super(java/math/BigDecimal);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class BigDecimal>
	//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}
}
