// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$CharDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method char[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public char[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          5
		if(obj == JsonToken.VALUE_STRING)
	//*   3    6:aload           5
	//*   4    8:getstatic       #45  <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpne       46
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getTextCharacters()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #49  <Method char[] JsonParser.getTextCharacters()>
	//    8   18:astore_2        
			int i = jsonparser.getTextOffset();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #53  <Method int JsonParser.getTextOffset()>
	//   11   23:istore_3        
			int j = jsonparser.getTextLength();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #56  <Method int JsonParser.getTextLength()>
	//   14   28:istore          4
			jsonparser = ((JsonParser) (new char[j]));
	//   15   30:iload           4
	//   16   32:newarray        char[]
	//   17   34:astore_1        
			System.arraycopy(((Object) (deserializationcontext)), i, ((Object) (jsonparser)), 0, j);
	//   18   35:aload_2         
	//   19   36:iload_3         
	//   20   37:aload_1         
	//   21   38:iconst_0        
	//   22   39:iload           4
	//   23   41:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((char []) (jsonparser));
	//   24   44:aload_1         
	//   25   45:areturn         
		}
		if(jsonparser.isExpectedStartArrayToken())
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #66  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  28   50:ifeq            166
		{
			obj = ((Object) (new StringBuilder(64)));
	//   29   53:new             #68  <Class StringBuilder>
	//   30   56:dup             
	//   31   57:bipush          64
	//   32   59:invokespecial   #71  <Method void StringBuilder(int)>
	//   33   62:astore          5
			do
			{
				Object obj1 = ((Object) (jsonparser.nextToken()));
	//   34   64:aload_1         
	//   35   65:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//   36   68:astore          6
				if(obj1 != JsonToken.END_ARRAY)
	//*  37   70:aload           6
	//*  38   72:getstatic       #77  <Field JsonToken JsonToken.END_ARRAY>
	//*  39   75:if_acmpeq       157
				{
					if(obj1 != JsonToken.VALUE_STRING)
	//*  40   78:aload           6
	//*  41   80:getstatic       #45  <Field JsonToken JsonToken.VALUE_STRING>
	//*  42   83:if_acmpeq       94
						throw deserializationcontext.mappingException(Character.TYPE);
	//   43   86:aload_2         
	//   44   87:getstatic       #83  <Field Class Character.TYPE>
	//   45   90:invokevirtual   #89  <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   46   93:athrow          
					obj1 = ((Object) (jsonparser.getText()));
	//   47   94:aload_1         
	//   48   95:invokevirtual   #93  <Method String JsonParser.getText()>
	//   49   98:astore          6
					if(((String) (obj1)).length() != 1)
	//*  50  100:aload           6
	//*  51  102:invokevirtual   #98  <Method int String.length()>
	//*  52  105:iconst_1        
	//*  53  106:icmpeq          142
						throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not convert a JSON String of length ").append(((String) (obj1)).length()).append(" into a char element of char array").toString());
	//   54  109:aload_1         
	//   55  110:new             #68  <Class StringBuilder>
	//   56  113:dup             
	//   57  114:invokespecial   #100 <Method void StringBuilder()>
	//   58  117:ldc1            #102 <String "Can not convert a JSON String of length ">
	//   59  119:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:aload           6
	//   61  124:invokevirtual   #98  <Method int String.length()>
	//   62  127:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//   63  130:ldc1            #111 <String " into a char element of char array">
	//   64  132:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   66  138:invokestatic    #120 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   67  141:athrow          
					((StringBuilder) (obj)).append(((String) (obj1)).charAt(0));
	//   68  142:aload           5
	//   69  144:aload           6
	//   70  146:iconst_0        
	//   71  147:invokevirtual   #124 <Method char String.charAt(int)>
	//   72  150:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   73  153:pop             
				} else
	//*  74  154:goto            64
				{
					return ((StringBuilder) (obj)).toString().toCharArray();
	//   75  157:aload           5
	//   76  159:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   77  162:invokevirtual   #130 <Method char[] String.toCharArray()>
	//   78  165:areturn         
				}
			} while(true);
		}
		if(obj == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  79  166:aload           5
	//*  80  168:getstatic       #133 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  81  171:if_acmpne       240
		{
			jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//   82  174:aload_1         
	//   83  175:invokevirtual   #137 <Method Object JsonParser.getEmbeddedObject()>
	//   84  178:astore_1        
			if(jsonparser == null)
	//*  85  179:aload_1         
	//*  86  180:ifnonnull       185
				return null;
	//   87  183:aconst_null     
	//   88  184:areturn         
			if(jsonparser instanceof char[])
	//*  89  185:aload_1         
	//*  90  186:instanceof      #15  <Class char[]>
	//*  91  189:ifeq            200
				return (char[])(char[])jsonparser;
	//   92  192:aload_1         
	//   93  193:checkcast       #15  <Class char[]>
	//   94  196:checkcast       #15  <Class char[]>
	//   95  199:areturn         
			if(jsonparser instanceof String)
	//*  96  200:aload_1         
	//*  97  201:instanceof      #95  <Class String>
	//*  98  204:ifeq            215
				return ((String)jsonparser).toCharArray();
	//   99  207:aload_1         
	//  100  208:checkcast       #95  <Class String>
	//  101  211:invokevirtual   #130 <Method char[] String.toCharArray()>
	//  102  214:areturn         
			if(jsonparser instanceof byte[])
	//* 103  215:aload_1         
	//* 104  216:instanceof      #139 <Class byte[]>
	//* 105  219:ifeq            240
				return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false).toCharArray();
	//  106  222:invokestatic    #145 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//  107  225:aload_1         
	//  108  226:checkcast       #139 <Class byte[]>
	//  109  229:checkcast       #139 <Class byte[]>
	//  110  232:iconst_0        
	//  111  233:invokevirtual   #151 <Method String Base64Variant.encode(byte[], boolean)>
	//  112  236:invokevirtual   #130 <Method char[] String.toCharArray()>
	//  113  239:areturn         
		}
		throw deserializationcontext.mappingException(_valueClass);
	//  114  240:aload_2         
	//  115  241:aload_0         
	//  116  242:getfield        #154 <Field Class _valueClass>
	//  117  245:invokevirtual   #89  <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//  118  248:athrow          
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #157 <Method char[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected char[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw deserializationcontext.mappingException(_valueClass);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #154 <Field Class _valueClass>
	//    3    5:invokevirtual   #89  <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//    4    8:athrow          
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$CharDeser()
	{
		super([C);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class char[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$CharDeser(PrimitiveArrayDeserializers$CharDeser primitivearraydeserializers$chardeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$chardeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
