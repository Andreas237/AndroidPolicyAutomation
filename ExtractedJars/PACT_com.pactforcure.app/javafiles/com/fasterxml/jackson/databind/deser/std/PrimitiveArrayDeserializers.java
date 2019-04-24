// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class PrimitiveArrayDeserializers extends StdDeserializer
	implements ContextualDeserializer
{
	static final class BooleanDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method boolean[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (boolean[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class boolean[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder ArrayBuilders.getBooleanBuilder()>
		//   12   24:astore          8
			boolean aflag[] = (boolean[])booleanbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class boolean[]>
		//   16   34:astore          6
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
label0:
			do
			{
label1:
				{
					int j;
					boolean flag;
					boolean aflag1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   38:aload_1         
		//   20   39:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
		//   21   42:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
		//   22   45:if_acmpeq       114
						flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
		//   23   48:aload_0         
		//   24   49:aload_1         
		//   25   50:aload_2         
		//   26   51:invokevirtual   #76  <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
		//   27   54:istore          5
						if(i < aflag.length)
							break label1;
		//   28   56:iload_3         
		//   29   57:aload           6
		//   30   59:arraylength     
		//   31   60:icmplt          126
						aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(((Object) (aflag)), i);
		//   32   63:aload           8
		//   33   65:aload           6
		//   34   67:iload_3         
		//   35   68:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.appendCompletedChunk(Object, int)>
		//   36   71:checkcast       #15  <Class boolean[]>
		//   37   74:astore          7
					}
		//*  38   76:iconst_0        
		//*  39   77:istore_3        
		//*  40   78:aload           7
		//*  41   80:astore          6
		//*  42   82:iload_3         
		//*  43   83:iconst_1        
		//*  44   84:iadd            
		//*  45   85:istore          4
		//*  46   87:aload           6
		//*  47   89:iload_3         
		//*  48   90:iload           5
		//*  49   92:bastore         
		//*  50   93:iload           4
		//*  51   95:istore_3        
		//*  52   96:goto            38
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53   99:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aflag)), booleanbuilder.bufferedSize() + i);
		//   54  100:aload_1         
		//   55  101:aload           6
		//   56  103:aload           8
		//   57  105:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.bufferedSize()>
		//   58  108:iload_3         
		//   59  109:iadd            
		//   60  110:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  113:athrow          
					}
					i = 0;
					aflag = aflag1;
				}
				j = i + 1;
				aflag[i] = flag;
				i = j;
			} while(true);
			return (boolean[])booleanbuilder.completeAndClearBuffer(((Object) (aflag)), i);
		//   62  114:aload           8
		//   63  116:aload           6
		//   64  118:iload_3         
		//   65  119:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.completeAndClearBuffer(Object, int)>
		//   66  122:checkcast       #15  <Class boolean[]>
		//   67  125:areturn         
		//*  68  126:goto            82
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #96  <Method boolean[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected boolean[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new boolean[] {
				_parseBooleanPrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        boolean[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #76  <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
		//    8   11:bastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new BooleanDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$BooleanDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser, Boolean)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		public BooleanDeser()
		{
			super([Z);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class boolean[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected BooleanDeser(BooleanDeser booleandeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (booleandeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class ByteDeser extends PrimitiveArrayDeserializers
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
		//    8   16:invokevirtual   #53  <Method Base64Variant DeserializationContext.getBase64Variant()>
		//    9   19:invokevirtual   #57  <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
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
			return ((PrimitiveArrayDeserializers) (new ByteDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ByteDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #143 <Method void PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser, Boolean)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		public ByteDeser()
		{
			super([B);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class byte[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected ByteDeser(ByteDeser bytedeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (bytedeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class CharDeser extends PrimitiveArrayDeserializers
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

		public CharDeser()
		{
			super([C);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class char[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected CharDeser(CharDeser chardeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (chardeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class DoubleDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method double[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (double[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class double[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder ArrayBuilders.getDoubleBuilder()>
		//   12   24:astore          9
			double ad[] = (double[])doublebuilder.resetAndStart();
		//   13   26:aload           9
		//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class double[]>
		//   16   34:astore          7
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          5
label0:
			do
			{
label1:
				{
					double d;
					int j;
					double ad1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   39:aload_1         
		//   20   40:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
		//   21   43:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
		//   22   46:if_acmpeq       120
						d = _parseDoublePrimitive(jsonparser, deserializationcontext);
		//   23   49:aload_0         
		//   24   50:aload_1         
		//   25   51:aload_2         
		//   26   52:invokevirtual   #76  <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
		//   27   55:dstore_3        
						if(i < ad.length)
							break label1;
		//   28   56:iload           5
		//   29   58:aload           7
		//   30   60:arraylength     
		//   31   61:icmplt          133
						ad1 = (double[])doublebuilder.appendCompletedChunk(((Object) (ad)), i);
		//   32   64:aload           9
		//   33   66:aload           7
		//   34   68:iload           5
		//   35   70:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.appendCompletedChunk(Object, int)>
		//   36   73:checkcast       #15  <Class double[]>
		//   37   76:astore          8
					}
		//*  38   78:iconst_0        
		//*  39   79:istore          5
		//*  40   81:aload           8
		//*  41   83:astore          7
		//*  42   85:iload           5
		//*  43   87:iconst_1        
		//*  44   88:iadd            
		//*  45   89:istore          6
		//*  46   91:aload           7
		//*  47   93:iload           5
		//*  48   95:dload_3         
		//*  49   96:dastore         
		//*  50   97:iload           6
		//*  51   99:istore          5
		//*  52  101:goto            39
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53  104:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ad)), doublebuilder.bufferedSize() + i);
		//   54  105:aload_1         
		//   55  106:aload           7
		//   56  108:aload           9
		//   57  110:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.bufferedSize()>
		//   58  113:iload           5
		//   59  115:iadd            
		//   60  116:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  119:athrow          
					}
					i = 0;
					ad = ad1;
				}
				j = i + 1;
				ad[i] = d;
				i = j;
			} while(true);
			return (double[])doublebuilder.completeAndClearBuffer(((Object) (ad)), i);
		//   62  120:aload           9
		//   63  122:aload           7
		//   64  124:iload           5
		//   65  126:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.completeAndClearBuffer(Object, int)>
		//   66  129:checkcast       #15  <Class double[]>
		//   67  132:areturn         
		//*  68  133:goto            85
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #96  <Method double[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected double[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new double[] {
				_parseDoublePrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #76  <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
		//    8   11:dastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new DoubleDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$DoubleDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser, Boolean)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		public DoubleDeser()
		{
			super([D);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class double[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected DoubleDeser(DoubleDeser doubledeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (doubledeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class FloatDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method float[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (float[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class float[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder ArrayBuilders.getFloatBuilder()>
		//   12   24:astore          8
			float af[] = (float[])floatbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class float[]>
		//   16   34:astore          6
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          4
label0:
			do
			{
label1:
				{
					float f;
					int j;
					float af1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   39:aload_1         
		//   20   40:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
		//   21   43:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
		//   22   46:if_acmpeq       120
						f = _parseFloatPrimitive(jsonparser, deserializationcontext);
		//   23   49:aload_0         
		//   24   50:aload_1         
		//   25   51:aload_2         
		//   26   52:invokevirtual   #76  <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
		//   27   55:fstore_3        
						if(i < af.length)
							break label1;
		//   28   56:iload           4
		//   29   58:aload           6
		//   30   60:arraylength     
		//   31   61:icmplt          133
						af1 = (float[])floatbuilder.appendCompletedChunk(((Object) (af)), i);
		//   32   64:aload           8
		//   33   66:aload           6
		//   34   68:iload           4
		//   35   70:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.appendCompletedChunk(Object, int)>
		//   36   73:checkcast       #15  <Class float[]>
		//   37   76:astore          7
					}
		//*  38   78:iconst_0        
		//*  39   79:istore          4
		//*  40   81:aload           7
		//*  41   83:astore          6
		//*  42   85:iload           4
		//*  43   87:iconst_1        
		//*  44   88:iadd            
		//*  45   89:istore          5
		//*  46   91:aload           6
		//*  47   93:iload           4
		//*  48   95:fload_3         
		//*  49   96:fastore         
		//*  50   97:iload           5
		//*  51   99:istore          4
		//*  52  101:goto            39
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53  104:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (af)), floatbuilder.bufferedSize() + i);
		//   54  105:aload_1         
		//   55  106:aload           6
		//   56  108:aload           8
		//   57  110:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.bufferedSize()>
		//   58  113:iload           4
		//   59  115:iadd            
		//   60  116:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  119:athrow          
					}
					i = 0;
					af = af1;
				}
				j = i + 1;
				af[i] = f;
				i = j;
			} while(true);
			return (float[])floatbuilder.completeAndClearBuffer(((Object) (af)), i);
		//   62  120:aload           8
		//   63  122:aload           6
		//   64  124:iload           4
		//   65  126:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.completeAndClearBuffer(Object, int)>
		//   66  129:checkcast       #15  <Class float[]>
		//   67  132:areturn         
		//*  68  133:goto            85
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #96  <Method float[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected float[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new float[] {
				_parseFloatPrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        float[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #76  <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
		//    8   11:fastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new FloatDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$FloatDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$FloatDeser(PrimitiveArrayDeserializers$FloatDeser, Boolean)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		public FloatDeser()
		{
			super([F);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class float[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected FloatDeser(FloatDeser floatdeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (floatdeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class IntDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #39  <Method int[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #48  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (int[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #51  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #23  <Class int[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #57  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #63  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder ArrayBuilders.getIntBuilder()>
		//   12   24:astore          8
			int ai[] = (int[])intbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #69  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.resetAndStart()>
		//   15   31:checkcast       #23  <Class int[]>
		//   16   34:astore          6
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
label0:
			do
			{
label1:
				{
					int j;
					int k;
					int ai1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   38:aload_1         
		//   20   39:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
		//   21   42:getstatic       #79  <Field JsonToken JsonToken.END_ARRAY>
		//   22   45:if_acmpeq       114
						k = _parseIntPrimitive(jsonparser, deserializationcontext);
		//   23   48:aload_0         
		//   24   49:aload_1         
		//   25   50:aload_2         
		//   26   51:invokevirtual   #83  <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
		//   27   54:istore          5
						if(i < ai.length)
							break label1;
		//   28   56:iload_3         
		//   29   57:aload           6
		//   30   59:arraylength     
		//   31   60:icmplt          126
						ai1 = (int[])intbuilder.appendCompletedChunk(((Object) (ai)), i);
		//   32   63:aload           8
		//   33   65:aload           6
		//   34   67:iload_3         
		//   35   68:invokevirtual   #87  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.appendCompletedChunk(Object, int)>
		//   36   71:checkcast       #23  <Class int[]>
		//   37   74:astore          7
					}
		//*  38   76:iconst_0        
		//*  39   77:istore_3        
		//*  40   78:aload           7
		//*  41   80:astore          6
		//*  42   82:iload_3         
		//*  43   83:iconst_1        
		//*  44   84:iadd            
		//*  45   85:istore          4
		//*  46   87:aload           6
		//*  47   89:iload_3         
		//*  48   90:iload           5
		//*  49   92:iastore         
		//*  50   93:iload           4
		//*  51   95:istore_3        
		//*  52   96:goto            38
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53   99:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ai)), intbuilder.bufferedSize() + i);
		//   54  100:aload_1         
		//   55  101:aload           6
		//   56  103:aload           8
		//   57  105:invokevirtual   #91  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.bufferedSize()>
		//   58  108:iload_3         
		//   59  109:iadd            
		//   60  110:invokestatic    #97  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  113:athrow          
					}
					i = 0;
					ai = ai1;
				}
				j = i + 1;
				ai[i] = k;
				i = j;
			} while(true);
			return (int[])intbuilder.completeAndClearBuffer(((Object) (ai)), i);
		//   62  114:aload           8
		//   63  116:aload           6
		//   64  118:iload_3         
		//   65  119:invokevirtual   #100 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.completeAndClearBuffer(Object, int)>
		//   66  122:checkcast       #23  <Class int[]>
		//   67  125:areturn         
		//*  68  126:goto            82
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #103 <Method int[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected int[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new int[] {
				_parseIntPrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #83  <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
		//    8   11:iastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new IntDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$IntDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #107 <Method void PrimitiveArrayDeserializers$IntDeser(PrimitiveArrayDeserializers$IntDeser, Boolean)>
		//    5    9:areturn         
		}

		public static final IntDeser instance = new IntDeser();
		private static final long serialVersionUID = 1L;

		static 
		{
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$IntDeser>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void PrimitiveArrayDeserializers$IntDeser()>
		//    3    7:putstatic       #20  <Field PrimitiveArrayDeserializers$IntDeser instance>
		//*   4   10:return          
		}

		public IntDeser()
		{
			super([I);
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <Class int[]>
		//    2    3:invokespecial   #26  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected IntDeser(IntDeser intdeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (intdeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class LongDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #39  <Method long[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #48  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (long[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #51  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #23  <Class long[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #57  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #63  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder ArrayBuilders.getLongBuilder()>
		//   12   24:astore          9
			long al[] = (long[])longbuilder.resetAndStart();
		//   13   26:aload           9
		//   14   28:invokevirtual   #69  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.resetAndStart()>
		//   15   31:checkcast       #23  <Class long[]>
		//   16   34:astore          7
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
label0:
			do
			{
label1:
				{
					int j;
					long l;
					long al1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   38:aload_1         
		//   20   39:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
		//   21   42:getstatic       #79  <Field JsonToken JsonToken.END_ARRAY>
		//   22   45:if_acmpeq       114
						l = _parseLongPrimitive(jsonparser, deserializationcontext);
		//   23   48:aload_0         
		//   24   49:aload_1         
		//   25   50:aload_2         
		//   26   51:invokevirtual   #83  <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
		//   27   54:lstore          5
						if(i < al.length)
							break label1;
		//   28   56:iload_3         
		//   29   57:aload           7
		//   30   59:arraylength     
		//   31   60:icmplt          126
						al1 = (long[])longbuilder.appendCompletedChunk(((Object) (al)), i);
		//   32   63:aload           9
		//   33   65:aload           7
		//   34   67:iload_3         
		//   35   68:invokevirtual   #87  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.appendCompletedChunk(Object, int)>
		//   36   71:checkcast       #23  <Class long[]>
		//   37   74:astore          8
					}
		//*  38   76:iconst_0        
		//*  39   77:istore_3        
		//*  40   78:aload           8
		//*  41   80:astore          7
		//*  42   82:iload_3         
		//*  43   83:iconst_1        
		//*  44   84:iadd            
		//*  45   85:istore          4
		//*  46   87:aload           7
		//*  47   89:iload_3         
		//*  48   90:lload           5
		//*  49   92:lastore         
		//*  50   93:iload           4
		//*  51   95:istore_3        
		//*  52   96:goto            38
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53   99:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (al)), longbuilder.bufferedSize() + i);
		//   54  100:aload_1         
		//   55  101:aload           7
		//   56  103:aload           9
		//   57  105:invokevirtual   #91  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.bufferedSize()>
		//   58  108:iload_3         
		//   59  109:iadd            
		//   60  110:invokestatic    #97  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  113:athrow          
					}
					i = 0;
					al = al1;
				}
				j = i + 1;
				al[i] = l;
				i = j;
			} while(true);
			return (long[])longbuilder.completeAndClearBuffer(((Object) (al)), i);
		//   62  114:aload           9
		//   63  116:aload           7
		//   64  118:iload_3         
		//   65  119:invokevirtual   #100 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.completeAndClearBuffer(Object, int)>
		//   66  122:checkcast       #23  <Class long[]>
		//   67  125:areturn         
		//*  68  126:goto            82
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #103 <Method long[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected long[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new long[] {
				_parseLongPrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        long[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #83  <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
		//    8   11:lastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new LongDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #107 <Method void PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser, Boolean)>
		//    5    9:areturn         
		}

		public static final LongDeser instance = new LongDeser();
		private static final long serialVersionUID = 1L;

		static 
		{
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void PrimitiveArrayDeserializers$LongDeser()>
		//    3    7:putstatic       #20  <Field PrimitiveArrayDeserializers$LongDeser instance>
		//*   4   10:return          
		}

		public LongDeser()
		{
			super([J);
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <Class long[]>
		//    2    3:invokespecial   #26  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected LongDeser(LongDeser longdeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (longdeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}

	static final class ShortDeser extends PrimitiveArrayDeserializers
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method short[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (short[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class short[]>
		//    8   16:areturn         
			com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder ArrayBuilders.getShortBuilder()>
		//   12   24:astore          8
			short aword0[] = (short[])shortbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class short[]>
		//   16   34:astore          6
			int i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          4
label0:
			do
			{
label1:
				{
					short word0;
					int j;
					short aword1[];
					try
					{
						if(jsonparser.nextToken() == JsonToken.END_ARRAY)
							break label0;
		//   19   39:aload_1         
		//   20   40:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
		//   21   43:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
		//   22   46:if_acmpeq       120
						word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
		//   23   49:aload_0         
		//   24   50:aload_1         
		//   25   51:aload_2         
		//   26   52:invokevirtual   #76  <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
		//   27   55:istore_3        
						if(i < aword0.length)
							break label1;
		//   28   56:iload           4
		//   29   58:aload           6
		//   30   60:arraylength     
		//   31   61:icmplt          133
						aword1 = (short[])shortbuilder.appendCompletedChunk(((Object) (aword0)), i);
		//   32   64:aload           8
		//   33   66:aload           6
		//   34   68:iload           4
		//   35   70:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.appendCompletedChunk(Object, int)>
		//   36   73:checkcast       #15  <Class short[]>
		//   37   76:astore          7
					}
		//*  38   78:iconst_0        
		//*  39   79:istore          4
		//*  40   81:aload           7
		//*  41   83:astore          6
		//*  42   85:iload           4
		//*  43   87:iconst_1        
		//*  44   88:iadd            
		//*  45   89:istore          5
		//*  46   91:aload           6
		//*  47   93:iload           4
		//*  48   95:iload_3         
		//*  49   96:sastore         
		//*  50   97:iload           5
		//*  51   99:istore          4
		//*  52  101:goto            39
					// Misplaced declaration of an exception variable
					catch(JsonParser jsonparser)
		//*  53  104:astore_1        
					{
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aword0)), shortbuilder.bufferedSize() + i);
		//   54  105:aload_1         
		//   55  106:aload           6
		//   56  108:aload           8
		//   57  110:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.bufferedSize()>
		//   58  113:iload           4
		//   59  115:iadd            
		//   60  116:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   61  119:athrow          
					}
					i = 0;
					aword0 = aword1;
				}
				j = i + 1;
				aword0[i] = word0;
				i = j;
			} while(true);
			return (short[])shortbuilder.completeAndClearBuffer(((Object) (aword0)), i);
		//   62  120:aload           8
		//   63  122:aload           6
		//   64  124:iload           4
		//   65  126:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.completeAndClearBuffer(Object, int)>
		//   66  129:checkcast       #15  <Class short[]>
		//   67  132:areturn         
		//*  68  133:goto            85
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #96  <Method short[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		protected short[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return (new short[] {
				_parseShortPrimitive(jsonparser, deserializationcontext)
			});
		//    0    0:iconst_1        
		//    1    1:newarray        short[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:aload_1         
		//    6    7:aload_2         
		//    7    8:invokevirtual   #76  <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
		//    8   11:sastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new ShortDeser(this, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ShortDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$ShortDeser(PrimitiveArrayDeserializers$ShortDeser, Boolean)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		public ShortDeser()
		{
			super([S);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class short[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}

		protected ShortDeser(ShortDeser shortdeser, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (shortdeser)), boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
		//    4    6:return          
		}
	}


	protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers primitivearraydeserializers, Boolean boolean1)
	{
		super(primitivearraydeserializers._valueClass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #39  <Field Class _valueClass>
	//    3    5:invokespecial   #42  <Method void StdDeserializer(Class)>
		_unwrapSingle = boolean1;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #44  <Field Boolean _unwrapSingle>
	//    7   13:return          
	}

	protected PrimitiveArrayDeserializers(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void StdDeserializer(Class)>
		_unwrapSingle = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #44  <Field Boolean _unwrapSingle>
	//    6   10:return          
	}

	public static JsonDeserializer forType(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #55  <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       11
			return ((JsonDeserializer) (IntDeser.instance));
	//    3    7:getstatic       #59  <Field PrimitiveArrayDeserializers$IntDeser PrimitiveArrayDeserializers$IntDeser.instance>
	//    4   10:areturn         
		if(class1 == Long.TYPE)
	//*   5   11:aload_0         
	//*   6   12:getstatic       #62  <Field Class Long.TYPE>
	//*   7   15:if_acmpne       22
			return ((JsonDeserializer) (LongDeser.instance));
	//    8   18:getstatic       #65  <Field PrimitiveArrayDeserializers$LongDeser PrimitiveArrayDeserializers$LongDeser.instance>
	//    9   21:areturn         
		if(class1 == Byte.TYPE)
	//*  10   22:aload_0         
	//*  11   23:getstatic       #68  <Field Class Byte.TYPE>
	//*  12   26:if_acmpne       37
			return ((JsonDeserializer) (new ByteDeser()));
	//   13   29:new             #12  <Class PrimitiveArrayDeserializers$ByteDeser>
	//   14   32:dup             
	//   15   33:invokespecial   #71  <Method void PrimitiveArrayDeserializers$ByteDeser()>
	//   16   36:areturn         
		if(class1 == Short.TYPE)
	//*  17   37:aload_0         
	//*  18   38:getstatic       #74  <Field Class Short.TYPE>
	//*  19   41:if_acmpne       52
			return ((JsonDeserializer) (new ShortDeser()));
	//   20   44:new             #30  <Class PrimitiveArrayDeserializers$ShortDeser>
	//   21   47:dup             
	//   22   48:invokespecial   #75  <Method void PrimitiveArrayDeserializers$ShortDeser()>
	//   23   51:areturn         
		if(class1 == Float.TYPE)
	//*  24   52:aload_0         
	//*  25   53:getstatic       #78  <Field Class Float.TYPE>
	//*  26   56:if_acmpne       67
			return ((JsonDeserializer) (new FloatDeser()));
	//   27   59:new             #21  <Class PrimitiveArrayDeserializers$FloatDeser>
	//   28   62:dup             
	//   29   63:invokespecial   #79  <Method void PrimitiveArrayDeserializers$FloatDeser()>
	//   30   66:areturn         
		if(class1 == Double.TYPE)
	//*  31   67:aload_0         
	//*  32   68:getstatic       #82  <Field Class Double.TYPE>
	//*  33   71:if_acmpne       82
			return ((JsonDeserializer) (new DoubleDeser()));
	//   34   74:new             #18  <Class PrimitiveArrayDeserializers$DoubleDeser>
	//   35   77:dup             
	//   36   78:invokespecial   #83  <Method void PrimitiveArrayDeserializers$DoubleDeser()>
	//   37   81:areturn         
		if(class1 == Boolean.TYPE)
	//*  38   82:aload_0         
	//*  39   83:getstatic       #86  <Field Class Boolean.TYPE>
	//*  40   86:if_acmpne       97
			return ((JsonDeserializer) (new BooleanDeser()));
	//   41   89:new             #9   <Class PrimitiveArrayDeserializers$BooleanDeser>
	//   42   92:dup             
	//   43   93:invokespecial   #87  <Method void PrimitiveArrayDeserializers$BooleanDeser()>
	//   44   96:areturn         
		if(class1 == Character.TYPE)
	//*  45   97:aload_0         
	//*  46   98:getstatic       #90  <Field Class Character.TYPE>
	//*  47  101:if_acmpne       112
			return ((JsonDeserializer) (new CharDeser()));
	//   48  104:new             #15  <Class PrimitiveArrayDeserializers$CharDeser>
	//   49  107:dup             
	//   50  108:invokespecial   #91  <Method void PrimitiveArrayDeserializers$CharDeser()>
	//   51  111:areturn         
		else
			throw new IllegalStateException();
	//   52  112:new             #93  <Class IllegalStateException>
	//   53  115:dup             
	//   54  116:invokespecial   #94  <Method void IllegalStateException()>
	//   55  119:athrow          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		deserializationcontext = ((DeserializationContext) (findFormatFeature(deserializationcontext, beanproperty, _valueClass, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #39  <Field Class _valueClass>
	//    5    7:getstatic       #105 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//    6   10:invokevirtual   #109 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//    7   13:astore_1        
		if(deserializationcontext == _unwrapSingle)
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #44  <Field Boolean _unwrapSingle>
	//*  11   19:if_acmpne       24
			return ((JsonDeserializer) (this));
	//   12   22:aload_0         
	//   13   23:areturn         
		else
			return ((JsonDeserializer) (withResolved(((Boolean) (deserializationcontext)))));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #113 <Method PrimitiveArrayDeserializers withResolved(Boolean)>
	//   17   29:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #125 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected Object handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #132 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #138 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            32
	//*   4   10:aload_2         
	//*   5   11:getstatic       #144 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*   6   14:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            32
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #154 <Method String JsonParser.getText()>
	//*  10   24:invokevirtual   #160 <Method int String.length()>
	//*  11   27:ifne            32
			return ((Object) (null));
	//   12   30:aconst_null     
	//   13   31:areturn         
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*  14   32:aload_0         
	//*  15   33:getfield        #44  <Field Boolean _unwrapSingle>
	//*  16   36:getstatic       #163 <Field Boolean Boolean.TRUE>
	//*  17   39:if_acmpeq       59
	//*  18   42:aload_0         
	//*  19   43:getfield        #44  <Field Boolean _unwrapSingle>
	//*  20   46:ifnonnull       72
	//*  21   49:aload_2         
	//*  22   50:getstatic       #165 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  23   53:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  24   56:ifeq            72
			flag = true;
	//   25   59:iconst_1        
	//   26   60:istore_3        
		else
	//*  27   61:iload_3         
	//*  28   62:ifeq            77
	//*  29   65:aload_0         
	//*  30   66:aload_1         
	//*  31   67:aload_2         
	//*  32   68:invokevirtual   #168 <Method Object handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//*  33   71:areturn         
			flag = false;
	//   34   72:iconst_0        
	//   35   73:istore_3        
		if(flag)
			return handleSingleElementUnwrapped(jsonparser, deserializationcontext);
		else
	//*  36   74:goto            61
			throw deserializationcontext.mappingException(_valueClass);
	//   37   77:aload_2         
	//   38   78:aload_0         
	//   39   79:getfield        #39  <Field Class _valueClass>
	//   40   82:invokevirtual   #172 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   41   85:athrow          
	}

	protected abstract Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	protected abstract PrimitiveArrayDeserializers withResolved(Boolean boolean1);

	protected final Boolean _unwrapSingle;
}
