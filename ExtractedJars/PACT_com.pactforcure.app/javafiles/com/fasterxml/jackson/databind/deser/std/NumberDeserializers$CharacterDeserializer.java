// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static class NumberDeserializers$CharacterDeserializer extends rializer
{

	public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 7: default 40
	//	               3 116
	//	               4 40
	//	               5 40
	//	               6 74
	//	               7 53;
	//    2    4:tableswitch     3 7: default 40
	//	               3 116
	//	               4 40
	//	               5 40
	//	               6 74
	//	               7 53
		   goto _L1 _L2 _L1 _L1 _L3 _L4
_L1:
		int i;
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   40:aload_2         
	//    4   41:aload_0         
	//    5   42:getfield        #55  <Field Class _valueClass>
	//    6   45:aload_1         
	//    7   46:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
	//    8   49:invokevirtual   #65  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   52:athrow          
	//*  10   53:aload_1         
	//*  11   54:invokevirtual   #68  <Method int JsonParser.getIntValue()>
	//*  12   57:istore_3        
_L4:
		if((i = jsonparser.getIntValue()) >= 0 && i <= 65535)
	//*  13   58:iload_3         
	//*  14   59:iflt            40
	//*  15   62:iload_3         
	//*  16   63:ldc1            #69  <Int 65535>
	//*  17   65:icmpgt          40
			return Character.valueOf((char)i);
	//   18   68:iload_3         
	//   19   69:int2char        
	//   20   70:invokestatic    #28  <Method Character Character.valueOf(char)>
	//   21   73:areturn         
		continue; /* Loop/switch isn't completed */
_L3:
		String s = jsonparser.getText();
	//   22   74:aload_1         
	//   23   75:invokevirtual   #73  <Method String JsonParser.getText()>
	//   24   78:astore          4
		if(s.length() == 1)
	//*  25   80:aload           4
	//*  26   82:invokevirtual   #78  <Method int String.length()>
	//*  27   85:iconst_1        
	//*  28   86:icmpne          99
			return Character.valueOf(s.charAt(0));
	//   29   89:aload           4
	//   30   91:iconst_0        
	//   31   92:invokevirtual   #82  <Method char String.charAt(int)>
	//   32   95:invokestatic    #28  <Method Character Character.valueOf(char)>
	//   33   98:areturn         
		if(s.length() == 0)
	//*  34   99:aload           4
	//*  35  101:invokevirtual   #78  <Method int String.length()>
	//*  36  104:ifne            40
			return (Character)getEmptyValue(deserializationcontext);
	//   37  107:aload_0         
	//   38  108:aload_2         
	//   39  109:invokevirtual   #86  <Method Object getEmptyValue(DeserializationContext)>
	//   40  112:checkcast       #20  <Class Character>
	//   41  115:areturn         
		continue; /* Loop/switch isn't completed */
_L2:
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  42  116:aload_2         
	//*  43  117:getstatic       #92  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  44  120:invokevirtual   #96  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  45  123:ifeq            40
		{
			jsonparser.nextToken();
	//   46  126:aload_1         
	//   47  127:invokevirtual   #99  <Method JsonToken JsonParser.nextToken()>
	//   48  130:pop             
			Character character = deserialize(jsonparser, deserializationcontext);
	//   49  131:aload_0         
	//   50  132:aload_1         
	//   51  133:aload_2         
	//   52  134:invokevirtual   #101 <Method Character deserialize(JsonParser, DeserializationContext)>
	//   53  137:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  54  139:aload_1         
	//*  55  140:invokevirtual   #99  <Method JsonToken JsonParser.nextToken()>
	//*  56  143:getstatic       #107 <Field JsonToken JsonToken.END_ARRAY>
	//*  57  146:if_acmpeq       188
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
	//   58  149:aload_2         
	//   59  150:aload_1         
	//   60  151:getstatic       #107 <Field JsonToken JsonToken.END_ARRAY>
	//   61  154:new             #109 <Class StringBuilder>
	//   62  157:dup             
	//   63  158:invokespecial   #111 <Method void StringBuilder()>
	//   64  161:ldc1            #113 <String "Attempted to unwrap single value array for single '">
	//   65  163:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   66  166:aload_0         
	//   67  167:getfield        #55  <Field Class _valueClass>
	//   68  170:invokevirtual   #122 <Method String Class.getName()>
	//   69  173:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   70  176:ldc1            #124 <String "' value but there was more than a single value in the array">
	//   71  178:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   72  181:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   73  184:invokevirtual   #131 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   74  187:athrow          
			else
				return character;
	//   75  188:aload           4
	//   76  190:areturn         
		}
		if(true) goto _L1; else goto _L5
_L5:
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #101 <Method Character deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	static final NumberDeserializers$CharacterDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$CharacterDeserializer wrapperInstance = new NumberDeserializers$CharacterDeserializer(java/lang/Character, ((Character) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$CharacterDeserializer(Character.TYPE, Character.valueOf('\0'));
	//    0    0:new             #2   <Class NumberDeserializers$CharacterDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Character.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Character Character.valueOf(char)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$CharacterDeserializer(Class, Character)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$CharacterDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$CharacterDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Character>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$CharacterDeserializer(Class, Character)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$CharacterDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$CharacterDeserializer(Class class1, Character character)
	{
		super(class1, ((Object) (character)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
