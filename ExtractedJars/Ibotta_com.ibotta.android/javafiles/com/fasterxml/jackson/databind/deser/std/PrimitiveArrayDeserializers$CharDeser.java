// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$CharDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((char[])obj, (char[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class char[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class char[]>
	//    5    9:invokevirtual   #24  <Method char[] _concat(char[], char[])>
	//    6   12:areturn         
	}

	protected char[] _concat(char ac[], char ac1[])
	{
		int i = ac.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = ac1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		ac = Arrays.copyOf(ac, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #30  <Method char[] Arrays.copyOf(char[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (ac1)), 0, ((Object) (ac)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
		return ac;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method char[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected char[] _constructEmpty()
	{
		return new char[0];
	//    0    0:iconst_0        
	//    1    1:newarray        char[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method char[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public char[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          5
		if(obj == JsonToken.VALUE_STRING)
	//*   3    6:aload           5
	//*   4    8:getstatic       #63  <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpne       46
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getTextCharacters()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #66  <Method char[] JsonParser.getTextCharacters()>
	//    8   18:astore_2        
			int i = jsonparser.getTextOffset();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #70  <Method int JsonParser.getTextOffset()>
	//   11   23:istore_3        
			int j = jsonparser.getTextLength();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #73  <Method int JsonParser.getTextLength()>
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
	//   23   41:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((char []) (jsonparser));
	//   24   44:aload_1         
	//   25   45:areturn         
		}
		if(jsonparser.isExpectedStartArrayToken())
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #77  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  28   50:ifeq            210
		{
			StringBuilder stringbuilder = new StringBuilder(64);
	//   29   53:new             #79  <Class StringBuilder>
	//   30   56:dup             
	//   31   57:bipush          64
	//   32   59:invokespecial   #82  <Method void StringBuilder(int)>
	//   33   62:astore          6
			do
			{
				obj = ((Object) (jsonparser.nextToken()));
	//   34   64:aload_1         
	//   35   65:invokevirtual   #85  <Method JsonToken JsonParser.nextToken()>
	//   36   68:astore          5
				if(obj == JsonToken.END_ARRAY)
					break;
	//   37   70:aload           5
	//   38   72:getstatic       #88  <Field JsonToken JsonToken.END_ARRAY>
	//   39   75:if_acmpeq       201
				if(obj == JsonToken.VALUE_STRING)
	//*  40   78:aload           5
	//*  41   80:getstatic       #63  <Field JsonToken JsonToken.VALUE_STRING>
	//*  42   83:if_acmpne       95
					obj = ((Object) (jsonparser.getText()));
	//   43   86:aload_1         
	//   44   87:invokevirtual   #92  <Method String JsonParser.getText()>
	//   45   90:astore          5
				else
	//*  46   92:goto            154
				if(obj == JsonToken.VALUE_NULL)
	//*  47   95:aload           5
	//*  48   97:getstatic       #95  <Field JsonToken JsonToken.VALUE_NULL>
	//*  49  100:if_acmpne       136
				{
					if(_nuller != null)
	//*  50  103:aload_0         
	//*  51  104:getfield        #99  <Field NullValueProvider _nuller>
	//*  52  107:ifnull          124
					{
						_nuller.getNullValue(deserializationcontext);
	//   53  110:aload_0         
	//   54  111:getfield        #99  <Field NullValueProvider _nuller>
	//   55  114:aload_2         
	//   56  115:invokeinterface #105 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   57  120:pop             
						continue;
	//   58  121:goto            64
					}
					_verifyNullForPrimitive(deserializationcontext);
	//   59  124:aload_0         
	//   60  125:aload_2         
	//   61  126:invokevirtual   #109 <Method void _verifyNullForPrimitive(DeserializationContext)>
					obj = "\0";
	//   62  129:ldc1            #111 <String "\0">
	//   63  131:astore          5
				} else
	//*  64  133:goto            154
				{
					obj = ((Object) (((CharSequence)deserializationcontext.handleUnexpectedToken(Character.TYPE, jsonparser)).toString()));
	//   65  136:aload_2         
	//   66  137:getstatic       #117 <Field Class Character.TYPE>
	//   67  140:aload_1         
	//   68  141:invokevirtual   #123 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   69  144:checkcast       #125 <Class CharSequence>
	//   70  147:invokeinterface #128 <Method String CharSequence.toString()>
	//   71  152:astore          5
				}
				if(((String) (obj)).length() != 1)
	//*  72  154:aload           5
	//*  73  156:invokevirtual   #133 <Method int String.length()>
	//*  74  159:iconst_1        
	//*  75  160:icmpeq          186
					deserializationcontext.reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer) (this)), "Cannot convert a JSON String of length %d into a char element of char array", new Object[] {
						Integer.valueOf(((String) (obj)).length())
					});
	//   76  163:aload_2         
	//   77  164:aload_0         
	//   78  165:ldc1            #135 <String "Cannot convert a JSON String of length %d into a char element of char array">
	//   79  167:iconst_1        
	//   80  168:anewarray       Object[]
	//   81  171:dup             
	//   82  172:iconst_0        
	//   83  173:aload           5
	//   84  175:invokevirtual   #133 <Method int String.length()>
	//   85  178:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   86  181:aastore         
	//   87  182:invokevirtual   #147 <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, String, Object[])>
	//   88  185:pop             
				stringbuilder.append(((String) (obj)).charAt(0));
	//   89  186:aload           6
	//   90  188:aload           5
	//   91  190:iconst_0        
	//   92  191:invokevirtual   #151 <Method char String.charAt(int)>
	//   93  194:invokevirtual   #155 <Method StringBuilder StringBuilder.append(char)>
	//   94  197:pop             
			} while(true);
	//   95  198:goto            64
			return stringbuilder.toString().toCharArray();
	//   96  201:aload           6
	//   97  203:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   98  206:invokevirtual   #159 <Method char[] String.toCharArray()>
	//   99  209:areturn         
		}
		if(obj == JsonToken.VALUE_EMBEDDED_OBJECT)
	//* 100  210:aload           5
	//* 101  212:getstatic       #162 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//* 102  215:if_acmpne       286
		{
			Object obj1 = jsonparser.getEmbeddedObject();
	//  103  218:aload_1         
	//  104  219:invokevirtual   #165 <Method Object JsonParser.getEmbeddedObject()>
	//  105  222:astore          5
			if(obj1 == null)
	//* 106  224:aload           5
	//* 107  226:ifnonnull       231
				return null;
	//  108  229:aconst_null     
	//  109  230:areturn         
			if(obj1 instanceof char[])
	//* 110  231:aload           5
	//* 111  233:instanceof      #15  <Class char[]>
	//* 112  236:ifeq            245
				return (char[])obj1;
	//  113  239:aload           5
	//  114  241:checkcast       #15  <Class char[]>
	//  115  244:areturn         
			if(obj1 instanceof String)
	//* 116  245:aload           5
	//* 117  247:instanceof      #130 <Class String>
	//* 118  250:ifeq            262
				return ((String)obj1).toCharArray();
	//  119  253:aload           5
	//  120  255:checkcast       #130 <Class String>
	//  121  258:invokevirtual   #159 <Method char[] String.toCharArray()>
	//  122  261:areturn         
			if(obj1 instanceof byte[])
	//* 123  262:aload           5
	//* 124  264:instanceof      #167 <Class byte[]>
	//* 125  267:ifeq            286
				return Base64Variants.getDefaultVariant().encode((byte[])obj1, false).toCharArray();
	//  126  270:invokestatic    #173 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//  127  273:aload           5
	//  128  275:checkcast       #167 <Class byte[]>
	//  129  278:iconst_0        
	//  130  279:invokevirtual   #179 <Method String Base64Variant.encode(byte[], boolean)>
	//  131  282:invokevirtual   #159 <Method char[] String.toCharArray()>
	//  132  285:areturn         
		}
		return (char[])deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//  133  286:aload_2         
	//  134  287:aload_0         
	//  135  288:getfield        #182 <Field Class _valueClass>
	//  136  291:aload_1         
	//  137  292:invokevirtual   #123 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//  138  295:checkcast       #15  <Class char[]>
	//  139  298:areturn         
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #185 <Method char[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected char[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (char[])deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #182 <Field Class _valueClass>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #123 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//    5    9:checkcast       #15  <Class char[]>
	//    6   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
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
}
