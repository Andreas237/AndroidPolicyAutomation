// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$ByteDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((byte[])obj, (byte[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class byte[]>
	//    5    9:invokevirtual   #28  <Method byte[] _concat(byte[], byte[])>
	//    6   12:areturn         
	}

	protected byte[] _concat(byte abyte0[], byte abyte1[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = abyte1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		abyte0 = Arrays.copyOf(abyte0, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #34  <Method byte[] Arrays.copyOf(byte[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method byte[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected byte[] _constructEmpty()
	{
		return new byte[0];
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method byte[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken;
		jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          6
		if(jsontoken != JsonToken.VALUE_STRING)
			break MISSING_BLOCK_LABEL_66;
	//    3    6:aload           6
	//    4    8:getstatic       #71  <Field JsonToken JsonToken.VALUE_STRING>
	//    5   11:if_acmpne       66
		byte abyte1[] = jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #77  <Method com.fasterxml.jackson.core.Base64Variant DeserializationContext.getBase64Variant()>
	//    9   19:invokevirtual   #81  <Method byte[] JsonParser.getBinaryValue(com.fasterxml.jackson.core.Base64Variant)>
	//   10   22:astore          7
		return abyte1;
	//   11   24:aload           7
	//   12   26:areturn         
		JsonParseException jsonparseexception;
		jsonparseexception;
	//   13   27:astore          7
		String s = jsonparseexception.getOriginalMessage();
	//   14   29:aload           7
	//   15   31:invokevirtual   #85  <Method String JsonParseException.getOriginalMessage()>
	//   16   34:astore          7
		if(s.contains("base64"))
	//*  17   36:aload           7
	//*  18   38:ldc1            #87  <String "base64">
	//*  19   40:invokevirtual   #93  <Method boolean String.contains(CharSequence)>
	//*  20   43:ifeq            66
			return (byte[])deserializationcontext.handleWeirdStringValue([B, jsonparser.getText(), s, new Object[0]);
	//   21   46:aload_2         
	//   22   47:ldc1            #15  <Class byte[]>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #96  <Method String JsonParser.getText()>
	//   25   53:aload           7
	//   26   55:iconst_0        
	//   27   56:anewarray       Object[]
	//   28   59:invokevirtual   #102 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   29   62:checkcast       #15  <Class byte[]>
	//   30   65:areturn         
		int i;
		byte abyte0[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.ByteBuilder bytebuilder;
		if(jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  31   66:aload           6
	//*  32   68:getstatic       #105 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  33   71:if_acmpne       101
		{
			Object obj = jsonparser.getEmbeddedObject();
	//   34   74:aload_1         
	//   35   75:invokevirtual   #108 <Method Object JsonParser.getEmbeddedObject()>
	//   36   78:astore          6
			if(obj == null)
	//*  37   80:aload           6
	//*  38   82:ifnonnull       87
				return null;
	//   39   85:aconst_null     
	//   40   86:areturn         
			if(obj instanceof byte[])
	//*  41   87:aload           6
	//*  42   89:instanceof      #15  <Class byte[]>
	//*  43   92:ifeq            101
				return (byte[])obj;
	//   44   95:aload           6
	//   45   97:checkcast       #15  <Class byte[]>
	//   46  100:areturn         
		}
		if(!jsonparser.isExpectedStartArrayToken())
	//*  47  101:aload_1         
	//*  48  102:invokevirtual   #112 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  49  105:ifne            118
			return (byte[])handleNonArray(jsonparser, deserializationcontext);
	//   50  108:aload_0         
	//   51  109:aload_1         
	//   52  110:aload_2         
	//   53  111:invokevirtual   #115 <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//   54  114:checkcast       #15  <Class byte[]>
	//   55  117:areturn         
		bytebuilder = deserializationcontext.getArrayBuilders().getByteBuilder();
	//   56  118:aload_2         
	//   57  119:invokevirtual   #119 <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   58  122:invokevirtual   #125 <Method com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder ArrayBuilders.getByteBuilder()>
	//   59  125:astore          8
		abyte0 = (byte[])bytebuilder.resetAndStart();
	//   60  127:aload           8
	//   61  129:invokevirtual   #130 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.resetAndStart()>
	//   62  132:checkcast       #15  <Class byte[]>
	//   63  135:astore          6
		i = 0;
	//   64  137:iconst_0        
	//   65  138:istore          4
_L2:
		JsonToken jsontoken1;
		jsontoken1 = jsonparser.nextToken();
	//   66  140:aload_1         
	//   67  141:invokevirtual   #133 <Method JsonToken JsonParser.nextToken()>
	//   68  144:astore          7
		if(jsontoken1 == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   69  146:aload           7
	//   70  148:getstatic       #136 <Field JsonToken JsonToken.END_ARRAY>
	//   71  151:if_acmpeq       279
		if(jsontoken1 == JsonToken.VALUE_NUMBER_INT || jsontoken1 == JsonToken.VALUE_NUMBER_FLOAT)
	//*  72  154:aload           7
	//*  73  156:getstatic       #139 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  74  159:if_acmpeq       222
	//*  75  162:aload           7
	//*  76  164:getstatic       #142 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  77  167:if_acmpne       173
			break MISSING_BLOCK_LABEL_222;
	//   78  170:goto            222
		if(jsontoken1 == JsonToken.VALUE_NULL)
	//*  79  173:aload           7
	//*  80  175:getstatic       #145 <Field JsonToken JsonToken.VALUE_NULL>
	//*  81  178:if_acmpne       212
		{
			if(_nuller != null)
	//*  82  181:aload_0         
	//*  83  182:getfield        #149 <Field NullValueProvider _nuller>
	//*  84  185:ifnull          202
			{
				_nuller.getNullValue(deserializationcontext);
	//   85  188:aload_0         
	//   86  189:getfield        #149 <Field NullValueProvider _nuller>
	//   87  192:aload_2         
	//   88  193:invokeinterface #155 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   89  198:pop             
				continue; /* Loop/switch isn't completed */
	//   90  199:goto            140
			}
			byte byte0;
			int j;
			byte abyte2[];
			try
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   91  202:aload_0         
	//   92  203:aload_2         
	//   93  204:invokevirtual   #159 <Method void _verifyNullForPrimitive(DeserializationContext)>
			}
	//*  94  207:iconst_0        
	//*  95  208:istore_3        
	//*  96  209:goto            227
	//*  97  212:aload_0         
	//*  98  213:aload_1         
	//*  99  214:aload_2         
	//* 100  215:invokevirtual   #163 <Method byte _parseBytePrimitive(JsonParser, DeserializationContext)>
	//* 101  218:istore_3        
	//* 102  219:goto            227
	//* 103  222:aload_1         
	//* 104  223:invokevirtual   #167 <Method byte JsonParser.getByteValue()>
	//* 105  226:istore_3        
	//* 106  227:aload           6
	//* 107  229:astore          7
	//* 108  231:iload           4
	//* 109  233:istore          5
	//* 110  235:iload           4
	//* 111  237:aload           6
	//* 112  239:arraylength     
	//* 113  240:icmplt          260
	//* 114  243:aload           8
	//* 115  245:aload           6
	//* 116  247:iload           4
	//* 117  249:invokevirtual   #171 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.appendCompletedChunk(Object, int)>
	//* 118  252:checkcast       #15  <Class byte[]>
	//* 119  255:astore          7
	//* 120  257:iconst_0        
	//* 121  258:istore          5
	//* 122  260:aload           7
	//* 123  262:iload           5
	//* 124  264:iload_3         
	//* 125  265:bastore         
	//* 126  266:iload           5
	//* 127  268:iconst_1        
	//* 128  269:iadd            
	//* 129  270:istore          4
	//* 130  272:aload           7
	//* 131  274:astore          6
	//* 132  276:goto            140
	//* 133  279:aload           8
	//* 134  281:aload           6
	//* 135  283:iload           4
	//* 136  285:invokevirtual   #174 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.completeAndClearBuffer(Object, int)>
	//* 137  288:checkcast       #15  <Class byte[]>
	//* 138  291:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 139  292:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (abyte0)), bytebuilder.bufferedSize() + i);
	//  140  293:aload_1         
	//  141  294:aload           6
	//  142  296:aload           8
	//  143  298:invokevirtual   #178 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.bufferedSize()>
	//  144  301:iload           4
	//  145  303:iadd            
	//  146  304:invokestatic    #184 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  147  307:athrow          
			}
			byte0 = 0;
			break MISSING_BLOCK_LABEL_227;
		}
		byte0 = _parseBytePrimitive(jsonparser, deserializationcontext);
		break MISSING_BLOCK_LABEL_227;
		byte0 = jsonparser.getByteValue();
		abyte2 = abyte0;
		j = i;
		if(i < abyte0.length)
			break MISSING_BLOCK_LABEL_260;
		abyte2 = (byte[])bytebuilder.appendCompletedChunk(((Object) (abyte0)), i);
		j = 0;
		abyte2[j] = byte0;
		i = j + 1;
		abyte0 = abyte2;
		if(true) goto _L2; else goto _L1
_L1:
		return (byte[])bytebuilder.completeAndClearBuffer(((Object) (abyte0)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #187 <Method byte[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected byte[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		byte byte0;
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #139 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       89
	//*   6   14:aload           4
	//*   7   16:getstatic       #142 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            89
		{
			if(jsontoken == JsonToken.VALUE_NULL)
	//*  10   25:aload           4
	//*  11   27:getstatic       #145 <Field JsonToken JsonToken.VALUE_NULL>
	//*  12   30:if_acmpne       67
				if(_nuller != null)
	//*  13   33:aload_0         
	//*  14   34:getfield        #149 <Field NullValueProvider _nuller>
	//*  15   37:ifnull          60
				{
					_nuller.getNullValue(deserializationcontext);
	//   16   40:aload_0         
	//   17   41:getfield        #149 <Field NullValueProvider _nuller>
	//   18   44:aload_2         
	//   19   45:invokeinterface #155 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   20   50:pop             
					return (byte[])getEmptyValue(deserializationcontext);
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokevirtual   #190 <Method Object getEmptyValue(DeserializationContext)>
	//   24   56:checkcast       #15  <Class byte[]>
	//   25   59:areturn         
				} else
				{
					_verifyNullForPrimitive(deserializationcontext);
	//   26   60:aload_0         
	//   27   61:aload_2         
	//   28   62:invokevirtual   #159 <Method void _verifyNullForPrimitive(DeserializationContext)>
					return null;
	//   29   65:aconst_null     
	//   30   66:areturn         
				}
			byte0 = ((Number)deserializationcontext.handleUnexpectedToken(_valueClass.getComponentType(), jsonparser)).byteValue();
	//   31   67:aload_2         
	//   32   68:aload_0         
	//   33   69:getfield        #194 <Field Class _valueClass>
	//   34   72:invokevirtual   #200 <Method Class Class.getComponentType()>
	//   35   75:aload_1         
	//   36   76:invokevirtual   #204 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   37   79:checkcast       #206 <Class Number>
	//   38   82:invokevirtual   #209 <Method byte Number.byteValue()>
	//   39   85:istore_3        
		} else
	//*  40   86:goto            94
		{
			byte0 = jsonparser.getByteValue();
	//   41   89:aload_1         
	//   42   90:invokevirtual   #167 <Method byte JsonParser.getByteValue()>
	//   43   93:istore_3        
		}
		return (new byte[] {
			byte0
		});
	//   44   94:iconst_1        
	//   45   95:newarray        byte[]
	//   46   97:dup             
	//   47   98:iconst_0        
	//   48   99:iload_3         
	//   49  100:bastore         
	//   50  101:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$ByteDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ByteDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #213 <Method void PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$ByteDeser()
	{
		super([B);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class byte[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser primitivearraydeserializers$bytedeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$bytedeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
