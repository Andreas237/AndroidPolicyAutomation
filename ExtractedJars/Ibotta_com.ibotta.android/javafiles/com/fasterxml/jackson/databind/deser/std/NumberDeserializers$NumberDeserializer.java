// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

public static class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer
{

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i == 3)
			break MISSING_BLOCK_LABEL_295;
	//    3    5:iload_3         
	//    4    6:iconst_3        
	//    5    7:icmpeq          295
		switch(i)
	//*   6   10:iload_3         
		{
	//*   7   11:tableswitch     6 8: default 36
	//	               6 95
	//	               7 73
	//	               8 46
		default:
			return deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//    8   36:aload_2         
	//    9   37:aload_0         
	//   10   38:getfield        #40  <Field Class _valueClass>
	//   11   41:aload_1         
	//   12   42:invokevirtual   #46  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   13   45:areturn         

		case 8: // '\b'
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonparser.isNaN())
	//*  14   46:aload_2         
	//*  15   47:getstatic       #52  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  16   50:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  17   53:ifeq            68
	//*  18   56:aload_1         
	//*  19   57:invokevirtual   #60  <Method boolean JsonParser.isNaN()>
	//*  20   60:ifne            68
				return ((Object) (jsonparser.getDecimalValue()));
	//   21   63:aload_1         
	//   22   64:invokevirtual   #64  <Method BigDecimal JsonParser.getDecimalValue()>
	//   23   67:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   24   68:aload_1         
	//   25   69:invokevirtual   #68  <Method Number JsonParser.getNumberValue()>
	//   26   72:areturn         

		case 7: // '\007'
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  27   73:aload_2         
	//*  28   74:getstatic       #72  <Field int F_MASK_INT_COERCIONS>
	//*  29   77:invokevirtual   #76  <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  30   80:ifeq            90
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   31   83:aload_0         
	//   32   84:aload_1         
	//   33   85:aload_2         
	//   34   86:invokevirtual   #79  <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   35   89:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   36   90:aload_1         
	//   37   91:invokevirtual   #68  <Method Number JsonParser.getNumberValue()>
	//   38   94:areturn         

		case 6: // '\006'
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   39   95:aload_1         
	//   40   96:invokevirtual   #83  <Method String JsonParser.getText()>
	//   41   99:invokevirtual   #88  <Method String String.trim()>
	//   42  102:astore_1        
			break;
		}
		if(((String) (jsonparser)).length() == 0)
	//*  43  103:aload_1         
	//*  44  104:invokevirtual   #91  <Method int String.length()>
	//*  45  107:ifne            116
			return getNullValue(deserializationcontext);
	//   46  110:aload_0         
	//   47  111:aload_2         
	//   48  112:invokevirtual   #95  <Method Object getNullValue(DeserializationContext)>
	//   49  115:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  50  116:aload_0         
	//*  51  117:aload_1         
	//*  52  118:invokevirtual   #99  <Method boolean _hasTextualNull(String)>
	//*  53  121:ifeq            130
			return getNullValue(deserializationcontext);
	//   54  124:aload_0         
	//   55  125:aload_2         
	//   56  126:invokevirtual   #95  <Method Object getNullValue(DeserializationContext)>
	//   57  129:areturn         
		if(_isPosInf(((String) (jsonparser))))
	//*  58  130:aload_0         
	//*  59  131:aload_1         
	//*  60  132:invokevirtual   #102 <Method boolean _isPosInf(String)>
	//*  61  135:ifeq            145
			return ((Object) (Double.valueOf((1.0D / 0.0D))));
	//   62  138:ldc2w           #103 <Double (1.0D / 0.0D)>
	//   63  141:invokestatic    #110 <Method Double Double.valueOf(double)>
	//   64  144:areturn         
		if(_isNegInf(((String) (jsonparser))))
	//*  65  145:aload_0         
	//*  66  146:aload_1         
	//*  67  147:invokevirtual   #113 <Method boolean _isNegInf(String)>
	//*  68  150:ifeq            160
			return ((Object) (Double.valueOf((-1.0D / 0.0D))));
	//   69  153:ldc2w           #114 <Double (-1.0D / 0.0D)>
	//   70  156:invokestatic    #110 <Method Double Double.valueOf(double)>
	//   71  159:areturn         
		if(_isNaN(((String) (jsonparser))))
	//*  72  160:aload_0         
	//*  73  161:aload_1         
	//*  74  162:invokevirtual   #118 <Method boolean _isNaN(String)>
	//*  75  165:ifeq            175
			return ((Object) (Double.valueOf((0.0D / 0.0D))));
	//   76  168:ldc2w           #119 <Double (0.0D / 0.0D)>
	//   77  171:invokestatic    #110 <Method Double Double.valueOf(double)>
	//   78  174:areturn         
		_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   79  175:aload_0         
	//   80  176:aload_2         
	//   81  177:aload_1         
	//   82  178:invokevirtual   #124 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
		long l;
		if(!_isIntNumber(((String) (jsonparser))))
	//*  83  181:aload_0         
	//*  84  182:aload_1         
	//*  85  183:invokevirtual   #127 <Method boolean _isIntNumber(String)>
	//*  86  186:ifne            213
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  87  189:aload_2         
	//*  88  190:getstatic       #52  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  89  193:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  90  196:ifeq            208
				return ((Object) (new BigDecimal(((String) (jsonparser)))));
	//   91  199:new             #129 <Class BigDecimal>
	//   92  202:dup             
	//   93  203:aload_1         
	//   94  204:invokespecial   #132 <Method void BigDecimal(String)>
	//   95  207:areturn         
			else
				return ((Object) (Double.valueOf(((String) (jsonparser)))));
	//   96  208:aload_1         
	//   97  209:invokestatic    #135 <Method Double Double.valueOf(String)>
	//   98  212:areturn         
		if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
	//*  99  213:aload_2         
	//* 100  214:getstatic       #138 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//* 101  217:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 102  220:ifeq            232
			return ((Object) (new BigInteger(((String) (jsonparser)))));
	//  103  223:new             #140 <Class BigInteger>
	//  104  226:dup             
	//  105  227:aload_1         
	//  106  228:invokespecial   #141 <Method void BigInteger(String)>
	//  107  231:areturn         
		l = Long.parseLong(((String) (jsonparser)));
	//  108  232:aload_1         
	//  109  233:invokestatic    #147 <Method long Long.parseLong(String)>
	//  110  236:lstore          4
		if(!deserializationcontext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && l <= 0x7fffffffL && l >= 0x80000000L)
	//* 111  238:aload_2         
	//* 112  239:getstatic       #150 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//* 113  242:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 114  245:ifne            273
	//* 115  248:lload           4
	//* 116  250:ldc2w           #151 <Long 0x7fffffffL>
	//* 117  253:lcmp            
	//* 118  254:ifgt            273
	//* 119  257:lload           4
	//* 120  259:ldc2w           #153 <Long 0x80000000L>
	//* 121  262:lcmp            
	//* 122  263:iflt            273
			try
			{
				return ((Object) (Integer.valueOf((int)l)));
	//  123  266:lload           4
	//  124  268:l2i             
	//  125  269:invokestatic    #159 <Method Integer Integer.valueOf(int)>
	//  126  272:areturn         
			}
	//* 127  273:lload           4
	//* 128  275:invokestatic    #162 <Method Long Long.valueOf(long)>
	//* 129  278:areturn         
	//* 130  279:aload_2         
	//* 131  280:aload_0         
	//* 132  281:getfield        #40  <Field Class _valueClass>
	//* 133  284:aload_1         
	//* 134  285:ldc1            #164 <String "not a valid number">
	//* 135  287:iconst_0        
	//* 136  288:anewarray       Object[]
	//* 137  291:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//* 138  294:areturn         
	//* 139  295:aload_0         
	//* 140  296:aload_1         
	//* 141  297:aload_2         
	//* 142  298:invokevirtual   #173 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//* 143  301:areturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid number", new Object[0]);
			}
		else
			return ((Object) (Long.valueOf(l)));
		IllegalArgumentException illegalargumentexception;
		return _deserializeFromArray(jsonparser, deserializationcontext);
	//* 144  302:astore          6
	//* 145  304:goto            279
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     6 8: default 32
	//	               6 39
	//	               7 39
	//	               8 39
		default:
			return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);
	//    3   32:aload_3         
	//    4   33:aload_1         
	//    5   34:aload_2         
	//    6   35:invokevirtual   #181 <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
	//    7   38:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return deserialize(jsonparser, deserializationcontext);
	//    8   39:aload_0         
	//    9   40:aload_1         
	//   10   41:aload_2         
	//   11   42:invokevirtual   #183 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   12   45:areturn         
		}
	}

	public static final NumberDeserializers$NumberDeserializer instance = new NumberDeserializers$NumberDeserializer();

	static 
	{
	//    0    0:new             #2   <Class NumberDeserializers$NumberDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberDeserializers$NumberDeserializer()>
	//    3    7:putstatic       #18  <Field NumberDeserializers$NumberDeserializer instance>
	//*   4   10:return          
	}

	public NumberDeserializers$NumberDeserializer()
	{
		super(java/lang/Number);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Number>
	//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}
}
