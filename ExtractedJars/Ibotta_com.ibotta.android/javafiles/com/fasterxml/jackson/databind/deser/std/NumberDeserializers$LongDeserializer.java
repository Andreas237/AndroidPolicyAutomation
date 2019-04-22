// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$LongDeserializer extends rDeserializer
{

	protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i != 3)
	//*   3    5:iload_3         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          190
		{
			if(i != 11)
	//*   6   10:iload_3         
	//*   7   11:bipush          11
	//*   8   13:icmpeq          177
			{
				switch(i)
	//*   9   16:iload_3         
				{
	//*  10   17:tableswitch     6 8: default 44
	//	               6 91
	//	               7 83
	//	               8 57
				default:
					return (Long)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   11   44:aload_2         
	//   12   45:aload_0         
	//   13   46:getfield        #57  <Field Class _valueClass>
	//   14   49:aload_1         
	//   15   50:invokevirtual   #63  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   16   53:checkcast       #20  <Class Long>
	//   17   56:areturn         

				case 8: // '\b'
					if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  18   57:aload_2         
	//*  19   58:getstatic       #69  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  20   61:invokevirtual   #73  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  21   64:ifne            75
						_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Long");
	//   22   67:aload_0         
	//   23   68:aload_1         
	//   24   69:aload_2         
	//   25   70:ldc1            #75  <String "Long">
	//   26   72:invokevirtual   #79  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
					return Long.valueOf(jsonparser.getValueAsLong());
	//   27   75:aload_1         
	//   28   76:invokevirtual   #83  <Method long JsonParser.getValueAsLong()>
	//   29   79:invokestatic    #28  <Method Long Long.valueOf(long)>
	//   30   82:areturn         

				case 7: // '\007'
					return Long.valueOf(jsonparser.getLongValue());
	//   31   83:aload_1         
	//   32   84:invokevirtual   #86  <Method long JsonParser.getLongValue()>
	//   33   87:invokestatic    #28  <Method Long Long.valueOf(long)>
	//   34   90:areturn         

				case 6: // '\006'
					jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   35   91:aload_1         
	//   36   92:invokevirtual   #90  <Method String JsonParser.getText()>
	//   37   95:invokevirtual   #95  <Method String String.trim()>
	//   38   98:astore_1        
					break;
				}
				if(((String) (jsonparser)).length() == 0)
	//*  39   99:aload_1         
	//*  40  100:invokevirtual   #98  <Method int String.length()>
	//*  41  103:ifne            119
					return (Long)_coerceEmptyString(deserializationcontext, _primitive);
	//   42  106:aload_0         
	//   43  107:aload_2         
	//   44  108:aload_0         
	//   45  109:getfield        #102 <Field boolean _primitive>
	//   46  112:invokevirtual   #106 <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   47  115:checkcast       #20  <Class Long>
	//   48  118:areturn         
				if(_hasTextualNull(((String) (jsonparser))))
	//*  49  119:aload_0         
	//*  50  120:aload_1         
	//*  51  121:invokevirtual   #110 <Method boolean _hasTextualNull(String)>
	//*  52  124:ifeq            140
					return (Long)_coerceTextualNull(deserializationcontext, _primitive);
	//   53  127:aload_0         
	//   54  128:aload_2         
	//   55  129:aload_0         
	//   56  130:getfield        #102 <Field boolean _primitive>
	//   57  133:invokevirtual   #113 <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   58  136:checkcast       #20  <Class Long>
	//   59  139:areturn         
				_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   60  140:aload_0         
	//   61  141:aload_2         
	//   62  142:aload_1         
	//   63  143:invokevirtual   #117 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
				long l;
				try
				{
					l = NumberInput.parseLong(((String) (jsonparser)));
	//   64  146:aload_1         
	//   65  147:invokestatic    #123 <Method long NumberInput.parseLong(String)>
	//   66  150:lstore          4
				}
	//*  67  152:lload           4
	//*  68  154:invokestatic    #28  <Method Long Long.valueOf(long)>
	//*  69  157:areturn         
	//*  70  158:aload_2         
	//*  71  159:aload_0         
	//*  72  160:getfield        #57  <Field Class _valueClass>
	//*  73  163:aload_1         
	//*  74  164:ldc1            #125 <String "not a valid Long value">
	//*  75  166:iconst_0        
	//*  76  167:anewarray       Object[]
	//*  77  170:invokevirtual   #131 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  78  173:checkcast       #20  <Class Long>
	//*  79  176:areturn         
	//*  80  177:aload_0         
	//*  81  178:aload_2         
	//*  82  179:aload_0         
	//*  83  180:getfield        #102 <Field boolean _primitive>
	//*  84  183:invokevirtual   #134 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//*  85  186:checkcast       #20  <Class Long>
	//*  86  189:areturn         
	//*  87  190:aload_0         
	//*  88  191:aload_1         
	//*  89  192:aload_2         
	//*  90  193:invokevirtual   #138 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//*  91  196:checkcast       #20  <Class Long>
	//*  92  199:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					return (Long)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Long value", new Object[0]);
				}
				return Long.valueOf(l);
			} else
			{
				return (Long)_coerceNullToken(deserializationcontext, _primitive);
			}
		} else
		{
			return (Long)_deserializeFromArray(jsonparser, deserializationcontext);
		}
	//*  93  200:astore          6
	//*  94  202:goto            158
	}

	public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #146 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #150 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Long.valueOf(jsonparser.getLongValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #86  <Method long JsonParser.getLongValue()>
	//    6   14:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    7   17:areturn         
		else
			return _parseLong(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #152 <Method Long _parseLong(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #156 <Method Long deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #162 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	static final NumberDeserializers$LongDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$LongDeserializer wrapperInstance = new NumberDeserializers$LongDeserializer(java/lang/Long, ((Long) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$LongDeserializer(Long.TYPE, Long.valueOf(0L));
	//    0    0:new             #2   <Class NumberDeserializers$LongDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Long.TYPE>
	//    3    7:lconst_0        
	//    4    8:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$LongDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$LongDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Long>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$LongDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$LongDeserializer(Class class1, Long long1)
	{
		super(class1, ((Object) (long1)), ((Object) (Long.valueOf(0L))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
