// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$ByteDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method byte[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		byte abyte0[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.ByteBuilder bytebuilder;
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          6
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   3    6:aload           6
	//*   4    8:getstatic       #47  <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpne       23
			return jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #53  <Method com.fasterxml.jackson.core.Base64Variant DeserializationContext.getBase64Variant()>
	//    9   19:invokevirtual   #57  <Method byte[] JsonParser.getBinaryValue(com.fasterxml.jackson.core.Base64Variant)>
	//   10   22:areturn         
		if(jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  11   23:aload           6
	//*  12   25:getstatic       #60  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  13   28:if_acmpne       61
		{
			Object obj = jsonparser.getEmbeddedObject();
	//   14   31:aload_1         
	//   15   32:invokevirtual   #64  <Method Object JsonParser.getEmbeddedObject()>
	//   16   35:astore          6
			if(obj == null)
	//*  17   37:aload           6
	//*  18   39:ifnonnull       44
				return null;
	//   19   42:aconst_null     
	//   20   43:areturn         
			if(obj instanceof byte[])
	//*  21   44:aload           6
	//*  22   46:instanceof      #15  <Class byte[]>
	//*  23   49:ifeq            61
				return (byte[])(byte[])obj;
	//   24   52:aload           6
	//   25   54:checkcast       #15  <Class byte[]>
	//   26   57:checkcast       #15  <Class byte[]>
	//   27   60:areturn         
		}
		if(!jsonparser.isExpectedStartArrayToken())
	//*  28   61:aload_1         
	//*  29   62:invokevirtual   #68  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  30   65:ifne            78
			return (byte[])handleNonArray(jsonparser, deserializationcontext);
	//   31   68:aload_0         
	//   32   69:aload_1         
	//   33   70:aload_2         
	//   34   71:invokevirtual   #71  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//   35   74:checkcast       #15  <Class byte[]>
	//   36   77:areturn         
		bytebuilder = deserializationcontext.getArrayBuilders().getByteBuilder();
	//   37   78:aload_2         
	//   38   79:invokevirtual   #75  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   39   82:invokevirtual   #81  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder ArrayBuilders.getByteBuilder()>
	//   40   85:astore          8
		abyte0 = (byte[])bytebuilder.resetAndStart();
	//   41   87:aload           8
	//   42   89:invokevirtual   #86  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.resetAndStart()>
	//   43   92:checkcast       #15  <Class byte[]>
	//   44   95:astore          6
		i = 0;
	//   45   97:iconst_0        
	//   46   98:istore          4
_L5:
		byte byte0;
		Object obj1;
		obj1 = ((Object) (jsonparser.nextToken()));
	//   47  100:aload_1         
	//   48  101:invokevirtual   #89  <Method JsonToken JsonParser.nextToken()>
	//   49  104:astore          7
		if(obj1 == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_224;
	//   50  106:aload           7
	//   51  108:getstatic       #92  <Field JsonToken JsonToken.END_ARRAY>
	//   52  111:if_acmpeq       224
		if(obj1 != JsonToken.VALUE_NUMBER_INT && obj1 != JsonToken.VALUE_NUMBER_FLOAT)
			break MISSING_BLOCK_LABEL_199;
	//   53  114:aload           7
	//   54  116:getstatic       #95  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   55  119:if_acmpeq       130
	//   56  122:aload           7
	//   57  124:getstatic       #98  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   58  127:if_acmpne       199
		byte0 = jsonparser.getByteValue();
	//   59  130:aload_1         
	//   60  131:invokevirtual   #102 <Method byte JsonParser.getByteValue()>
	//   61  134:istore_3        
_L3:
		if(i < abyte0.length) goto _L2; else goto _L1
	//   62  135:iload           4
	//   63  137:aload           6
	//   64  139:arraylength     
	//   65  140:icmplt          237
_L1:
		obj1 = ((Object) ((byte[])bytebuilder.appendCompletedChunk(((Object) (abyte0)), i)));
	//   66  143:aload           8
	//   67  145:aload           6
	//   68  147:iload           4
	//   69  149:invokevirtual   #106 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.appendCompletedChunk(Object, int)>
	//   70  152:checkcast       #15  <Class byte[]>
	//   71  155:astore          7
		i = 0;
	//   72  157:iconst_0        
	//   73  158:istore          4
		abyte0 = ((byte []) (obj1));
	//   74  160:aload           7
	//   75  162:astore          6
_L2:
		int j = i + 1;
	//   76  164:iload           4
	//   77  166:iconst_1        
	//   78  167:iadd            
	//   79  168:istore          5
		abyte0[i] = byte0;
	//   80  170:aload           6
	//   81  172:iload           4
	//   82  174:iload_3         
	//   83  175:bastore         
		i = j;
	//   84  176:iload           5
	//   85  178:istore          4
		continue; /* Loop/switch isn't completed */
	//   86  180:goto            100
	//*  87  183:astore_1        
	//*  88  184:aload_1         
	//*  89  185:aload           6
	//*  90  187:aload           8
	//*  91  189:invokevirtual   #110 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.bufferedSize()>
	//*  92  192:iload           4
	//*  93  194:iadd            
	//*  94  195:invokestatic    #116 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//*  95  198:athrow          
		try
		{
			if(obj1 != JsonToken.VALUE_NULL)
	//*  96  199:aload           7
	//*  97  201:getstatic       #119 <Field JsonToken JsonToken.VALUE_NULL>
	//*  98  204:if_acmpeq       219
				throw deserializationcontext.mappingException(_valueClass.getComponentType());
	//   99  207:aload_2         
	//  100  208:aload_0         
	//  101  209:getfield        #123 <Field Class _valueClass>
	//  102  212:invokevirtual   #129 <Method Class Class.getComponentType()>
	//  103  215:invokevirtual   #133 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//  104  218:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (abyte0)), bytebuilder.bufferedSize() + i);
		}
		byte0 = 0;
	//  105  219:iconst_0        
	//  106  220:istore_3        
		  goto _L3
	//* 107  221:goto            135
		return (byte[])bytebuilder.completeAndClearBuffer(((Object) (abyte0)), i);
	//  108  224:aload           8
	//  109  226:aload           6
	//  110  228:iload           4
	//  111  230:invokevirtual   #136 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder.completeAndClearBuffer(Object, int)>
	//  112  233:checkcast       #15  <Class byte[]>
	//  113  236:areturn         
		if(true) goto _L5; else goto _L4
	//  114  237:goto            164
_L4:
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #139 <Method byte[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected byte[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		byte byte0;
		if(jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #95  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       22
	//*   6   14:aload           4
	//*   7   16:getstatic       #98  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       35
		{
			byte0 = jsonparser.getByteValue();
	//    9   22:aload_1         
	//   10   23:invokevirtual   #102 <Method byte JsonParser.getByteValue()>
	//   11   26:istore_3        
		} else
	//*  12   27:iconst_1        
	//*  13   28:newarray        byte[]
	//*  14   30:dup             
	//*  15   31:iconst_0        
	//*  16   32:iload_3         
	//*  17   33:bastore         
	//*  18   34:areturn         
		{
			if(jsontoken != JsonToken.VALUE_NULL)
	//*  19   35:aload           4
	//*  20   37:getstatic       #119 <Field JsonToken JsonToken.VALUE_NULL>
	//*  21   40:if_acmpeq       55
				throw deserializationcontext.mappingException(_valueClass.getComponentType());
	//   22   43:aload_2         
	//   23   44:aload_0         
	//   24   45:getfield        #123 <Field Class _valueClass>
	//   25   48:invokevirtual   #129 <Method Class Class.getComponentType()>
	//   26   51:invokevirtual   #133 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   27   54:athrow          
			byte0 = 0;
	//   28   55:iconst_0        
	//   29   56:istore_3        
		}
		return (new byte[] {
			byte0
		});
	//*  30   57:goto            27
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$ByteDeser(this, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ByteDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #143 <Method void PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser, Boolean)>
	//    5    9:areturn         
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

	protected PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser primitivearraydeserializers$bytedeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$bytedeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
