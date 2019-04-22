// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$IntegerDeserializer extends serializer
{

	protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i == 3) goto _L2; else goto _L1
	//    3    5:iload_3         
	//    4    6:iconst_3        
	//    5    7:icmpeq          264
_L1:
		if(i == 11) goto _L4; else goto _L3
	//    6   10:iload_3         
	//    7   11:bipush          11
	//    8   13:icmpeq          251
_L3:
		switch(i)
	//*   9   16:iload_3         
		{
	//*  10   17:tableswitch     6 8: default 44
	//	               6 91
	//	               7 83
	//	               8 57
		default:
			return (Integer)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   11   44:aload_2         
	//   12   45:aload_0         
	//   13   46:getfield        #57  <Field Class _valueClass>
	//   14   49:aload_1         
	//   15   50:invokevirtual   #63  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   16   53:checkcast       #20  <Class Integer>
	//   17   56:areturn         

		case 8: // '\b'
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  18   57:aload_2         
	//*  19   58:getstatic       #69  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  20   61:invokevirtual   #73  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  21   64:ifne            75
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Integer");
	//   22   67:aload_0         
	//   23   68:aload_1         
	//   24   69:aload_2         
	//   25   70:ldc1            #75  <String "Integer">
	//   26   72:invokevirtual   #79  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
			return Integer.valueOf(jsonparser.getValueAsInt());
	//   27   75:aload_1         
	//   28   76:invokevirtual   #82  <Method int JsonParser.getValueAsInt()>
	//   29   79:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   30   82:areturn         

		case 7: // '\007'
			return Integer.valueOf(jsonparser.getIntValue());
	//   31   83:aload_1         
	//   32   84:invokevirtual   #85  <Method int JsonParser.getIntValue()>
	//   33   87:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   34   90:areturn         

		case 6: // '\006'
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   35   91:aload_1         
	//   36   92:invokevirtual   #89  <Method String JsonParser.getText()>
	//   37   95:invokevirtual   #94  <Method String String.trim()>
	//   38   98:astore_1        
			i = ((String) (jsonparser)).length();
	//   39   99:aload_1         
	//   40  100:invokevirtual   #97  <Method int String.length()>
	//   41  103:istore_3        
			break;
		}
		if(i == 0)
	//*  42  104:iload_3         
	//*  43  105:ifne            121
			return (Integer)_coerceEmptyString(deserializationcontext, _primitive);
	//   44  108:aload_0         
	//   45  109:aload_2         
	//   46  110:aload_0         
	//   47  111:getfield        #101 <Field boolean _primitive>
	//   48  114:invokevirtual   #105 <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   49  117:checkcast       #20  <Class Integer>
	//   50  120:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  51  121:aload_0         
	//*  52  122:aload_1         
	//*  53  123:invokevirtual   #109 <Method boolean _hasTextualNull(String)>
	//*  54  126:ifeq            142
			return (Integer)_coerceTextualNull(deserializationcontext, _primitive);
	//   55  129:aload_0         
	//   56  130:aload_2         
	//   57  131:aload_0         
	//   58  132:getfield        #101 <Field boolean _primitive>
	//   59  135:invokevirtual   #112 <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   60  138:checkcast       #20  <Class Integer>
	//   61  141:areturn         
		_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   62  142:aload_0         
	//   63  143:aload_2         
	//   64  144:aload_1         
	//   65  145:invokevirtual   #116 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
		if(i <= 9)
			break MISSING_BLOCK_LABEL_222;
	//   66  148:iload_3         
	//   67  149:bipush          9
	//   68  151:icmple          222
		long l = Long.parseLong(((String) (jsonparser)));
	//   69  154:aload_1         
	//   70  155:invokestatic    #122 <Method long Long.parseLong(String)>
	//   71  158:lstore          4
		if(_intOverflow(l))
	//*  72  160:aload_0         
	//*  73  161:lload           4
	//*  74  163:invokevirtual   #126 <Method boolean _intOverflow(long)>
	//*  75  166:ifeq            215
			return (Integer)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", new Object[] {
				jsonparser, Integer.valueOf(0x80000000), Integer.valueOf(0x7fffffff)
			}), new Object[0]);
	//   76  169:aload_2         
	//   77  170:aload_0         
	//   78  171:getfield        #57  <Field Class _valueClass>
	//   79  174:aload_1         
	//   80  175:ldc1            #128 <String "Overflow: numeric value (%s) out of range of Integer (%d - %d)">
	//   81  177:iconst_3        
	//   82  178:anewarray       Object[]
	//   83  181:dup             
	//   84  182:iconst_0        
	//   85  183:aload_1         
	//   86  184:aastore         
	//   87  185:dup             
	//   88  186:iconst_1        
	//   89  187:ldc1            #131 <Int 0x80000000>
	//   90  189:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   91  192:aastore         
	//   92  193:dup             
	//   93  194:iconst_2        
	//   94  195:ldc1            #132 <Int 0x7fffffff>
	//   95  197:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   96  200:aastore         
	//   97  201:invokestatic    #136 <Method String String.format(String, Object[])>
	//   98  204:iconst_0        
	//   99  205:anewarray       Object[]
	//  100  208:invokevirtual   #140 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//  101  211:checkcast       #20  <Class Integer>
	//  102  214:areturn         
		else
			return Integer.valueOf((int)l);
	//  103  215:lload           4
	//  104  217:l2i             
	//  105  218:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  106  221:areturn         
		i = NumberInput.parseInt(((String) (jsonparser)));
	//  107  222:aload_1         
	//  108  223:invokestatic    #146 <Method int NumberInput.parseInt(String)>
	//  109  226:istore_3        
		return Integer.valueOf(i);
	//  110  227:iload_3         
	//  111  228:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//  112  231:areturn         
_L6:
		return (Integer)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Integer value", new Object[0]);
	//  113  232:aload_2         
	//  114  233:aload_0         
	//  115  234:getfield        #57  <Field Class _valueClass>
	//  116  237:aload_1         
	//  117  238:ldc1            #148 <String "not a valid Integer value">
	//  118  240:iconst_0        
	//  119  241:anewarray       Object[]
	//  120  244:invokevirtual   #140 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//  121  247:checkcast       #20  <Class Integer>
	//  122  250:areturn         
_L4:
		return (Integer)_coerceNullToken(deserializationcontext, _primitive);
	//  123  251:aload_0         
	//  124  252:aload_2         
	//  125  253:aload_0         
	//  126  254:getfield        #101 <Field boolean _primitive>
	//  127  257:invokevirtual   #151 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//  128  260:checkcast       #20  <Class Integer>
	//  129  263:areturn         
_L2:
		return (Integer)_deserializeFromArray(jsonparser, deserializationcontext);
	//  130  264:aload_0         
	//  131  265:aload_1         
	//  132  266:aload_2         
	//  133  267:invokevirtual   #155 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//  134  270:checkcast       #20  <Class Integer>
	//  135  273:areturn         
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//  136  274:astore          6
		if(true) goto _L6; else goto _L5
	//  137  276:goto            232
_L5:
	}

	public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #163 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #167 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Integer.valueOf(jsonparser.getIntValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #85  <Method int JsonParser.getIntValue()>
	//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    7   17:areturn         
		else
			return _parseInteger(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #169 <Method Integer _parseInteger(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #173 <Method Integer deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #163 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #167 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Integer.valueOf(jsonparser.getIntValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #85  <Method int JsonParser.getIntValue()>
	//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    7   17:areturn         
		else
			return _parseInteger(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #169 <Method Integer _parseInteger(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #178 <Method Integer deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	static final NumberDeserializers$IntegerDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$IntegerDeserializer wrapperInstance = new NumberDeserializers$IntegerDeserializer(java/lang/Integer, ((Integer) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
	//    0    0:new             #2   <Class NumberDeserializers$IntegerDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Integer.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$IntegerDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$IntegerDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Integer>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$IntegerDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$IntegerDeserializer(Class class1, Integer integer)
	{
		super(class1, ((Object) (integer)), ((Object) (Integer.valueOf(0))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
