// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static class NumberDeserializers$CharacterDeserializer extends rializer
{

	public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i != 3)
	//*   3    5:iload_3         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          142
		{
			if(i != 11)
	//*   6   10:iload_3         
	//*   7   11:bipush          11
	//*   8   13:icmpeq          129
			{
				switch(i)
	//*   9   16:iload_3         
				{
				default:
					break;

	//*  10   17:tableswitch     6 7: default 40
	//	               6 70
	//	               7 43
	//*  11   40:goto            116
				case 7: // '\007'
					_verifyNumberForScalarCoercion(deserializationcontext, jsonparser);
	//   12   43:aload_0         
	//   13   44:aload_2         
	//   14   45:aload_1         
	//   15   46:invokevirtual   #56  <Method void _verifyNumberForScalarCoercion(DeserializationContext, JsonParser)>
					int j = jsonparser.getIntValue();
	//   16   49:aload_1         
	//   17   50:invokevirtual   #59  <Method int JsonParser.getIntValue()>
	//   18   53:istore_3        
					if(j >= 0 && j <= 65535)
	//*  19   54:iload_3         
	//*  20   55:iflt            116
	//*  21   58:iload_3         
	//*  22   59:ldc1            #60  <Int 65535>
	//*  23   61:icmpgt          116
						return Character.valueOf((char)j);
	//   24   64:iload_3         
	//   25   65:int2char        
	//   26   66:invokestatic    #28  <Method Character Character.valueOf(char)>
	//   27   69:areturn         
					break;

				case 6: // '\006'
					String s = jsonparser.getText();
	//   28   70:aload_1         
	//   29   71:invokevirtual   #64  <Method String JsonParser.getText()>
	//   30   74:astore          4
					if(s.length() == 1)
	//*  31   76:aload           4
	//*  32   78:invokevirtual   #69  <Method int String.length()>
	//*  33   81:iconst_1        
	//*  34   82:icmpne          95
						return Character.valueOf(s.charAt(0));
	//   35   85:aload           4
	//   36   87:iconst_0        
	//   37   88:invokevirtual   #73  <Method char String.charAt(int)>
	//   38   91:invokestatic    #28  <Method Character Character.valueOf(char)>
	//   39   94:areturn         
					if(s.length() == 0)
	//*  40   95:aload           4
	//*  41   97:invokevirtual   #69  <Method int String.length()>
	//*  42  100:ifne            116
						return (Character)_coerceEmptyString(deserializationcontext, _primitive);
	//   43  103:aload_0         
	//   44  104:aload_2         
	//   45  105:aload_0         
	//   46  106:getfield        #77  <Field boolean _primitive>
	//   47  109:invokevirtual   #81  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   48  112:checkcast       #20  <Class Character>
	//   49  115:areturn         
					break;
				}
				return (Character)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   50  116:aload_2         
	//   51  117:aload_0         
	//   52  118:getfield        #84  <Field Class _valueClass>
	//   53  121:aload_1         
	//   54  122:invokevirtual   #90  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   55  125:checkcast       #20  <Class Character>
	//   56  128:areturn         
			} else
			{
				return (Character)_coerceNullToken(deserializationcontext, _primitive);
	//   57  129:aload_0         
	//   58  130:aload_2         
	//   59  131:aload_0         
	//   60  132:getfield        #77  <Field boolean _primitive>
	//   61  135:invokevirtual   #93  <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//   62  138:checkcast       #20  <Class Character>
	//   63  141:areturn         
			}
		} else
		{
			return (Character)_deserializeFromArray(jsonparser, deserializationcontext);
	//   64  142:aload_0         
	//   65  143:aload_1         
	//   66  144:aload_2         
	//   67  145:invokevirtual   #97  <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//   68  148:checkcast       #20  <Class Character>
	//   69  151:areturn         
		}
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #102 <Method Character deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
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
		super(class1, ((Object) (character)), ((Object) (Character.valueOf('\0'))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #28  <Method Character Character.valueOf(char)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
