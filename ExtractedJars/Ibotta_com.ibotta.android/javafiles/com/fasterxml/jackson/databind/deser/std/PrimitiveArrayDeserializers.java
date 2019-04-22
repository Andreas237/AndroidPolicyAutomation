// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class PrimitiveArrayDeserializers extends StdDeserializer
	implements ContextualDeserializer
{
	static final class BooleanDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((boolean[])obj, (boolean[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class boolean[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class boolean[]>
		//    5    9:invokevirtual   #28  <Method boolean[] _concat(boolean[], boolean[])>
		//    6   12:areturn         
		}

		protected boolean[] _concat(boolean aflag[], boolean aflag1[])
		{
			int i = aflag.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = aflag1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			aflag = Arrays.copyOf(aflag, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #34  <Method boolean[] Arrays.copyOf(boolean[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (aflag1)), 0, ((Object) (aflag)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aflag;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #45  <Method boolean[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected boolean[] _constructEmpty()
		{
			return new boolean[0];
		//    0    0:iconst_0        
		//    1    1:newarray        boolean[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #54  <Method boolean[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			boolean aflag[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (boolean[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class boolean[]>
		//    8   16:areturn         
			booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder ArrayBuilders.getBooleanBuilder()>
		//   12   24:astore          8
			aflag = (boolean[])booleanbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class boolean[]>
		//   16   34:astore          6
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
_L2:
			JsonToken jsontoken;
			jsontoken = jsonparser.nextToken();
		//   19   38:aload_1         
		//   20   39:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
		//   21   42:astore          7
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   44:aload           7
		//   23   46:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
		//   24   49:if_acmpeq       177
			boolean flag;
			if(jsontoken == JsonToken.VALUE_TRUE)
		//*  25   52:aload           7
		//*  26   54:getstatic       #96  <Field JsonToken JsonToken.VALUE_TRUE>
		//*  27   57:if_acmpne       66
			{
				flag = true;
		//   28   60:iconst_1        
		//   29   61:istore          5
				break MISSING_BLOCK_LABEL_128;
		//   30   63:goto            128
			}
			if(jsontoken == JsonToken.VALUE_FALSE)
		//*  31   66:aload           7
		//*  32   68:getstatic       #99  <Field JsonToken JsonToken.VALUE_FALSE>
		//*  33   71:if_acmpne       80
			{
				flag = false;
		//   34   74:iconst_0        
		//   35   75:istore          5
				break MISSING_BLOCK_LABEL_128;
		//   36   77:goto            128
			}
			if(jsontoken == JsonToken.VALUE_NULL)
		//*  37   80:aload           7
		//*  38   82:getstatic       #102 <Field JsonToken JsonToken.VALUE_NULL>
		//*  39   85:if_acmpne       120
			{
				if(_nuller != null)
		//*  40   88:aload_0         
		//*  41   89:getfield        #106 <Field NullValueProvider _nuller>
		//*  42   92:ifnull          109
				{
					_nuller.getNullValue(deserializationcontext);
		//   43   95:aload_0         
		//   44   96:getfield        #106 <Field NullValueProvider _nuller>
		//   45   99:aload_2         
		//   46  100:invokeinterface #112 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   47  105:pop             
					continue; /* Loop/switch isn't completed */
		//   48  106:goto            38
				}
				int j;
				boolean aflag1[];
				try
				{
					_verifyNullForPrimitive(deserializationcontext);
		//   49  109:aload_0         
		//   50  110:aload_2         
		//   51  111:invokevirtual   #116 <Method void _verifyNullForPrimitive(DeserializationContext)>
				}
		//*  52  114:iconst_0        
		//*  53  115:istore          5
		//*  54  117:goto            128
		//*  55  120:aload_0         
		//*  56  121:aload_1         
		//*  57  122:aload_2         
		//*  58  123:invokevirtual   #120 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
		//*  59  126:istore          5
		//*  60  128:aload           6
		//*  61  130:astore          7
		//*  62  132:iload_3         
		//*  63  133:istore          4
		//*  64  135:iload_3         
		//*  65  136:aload           6
		//*  66  138:arraylength     
		//*  67  139:icmplt          158
		//*  68  142:aload           8
		//*  69  144:aload           6
		//*  70  146:iload_3         
		//*  71  147:invokevirtual   #124 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.appendCompletedChunk(Object, int)>
		//*  72  150:checkcast       #15  <Class boolean[]>
		//*  73  153:astore          7
		//*  74  155:iconst_0        
		//*  75  156:istore          4
		//*  76  158:aload           7
		//*  77  160:iload           4
		//*  78  162:iload           5
		//*  79  164:bastore         
		//*  80  165:iload           4
		//*  81  167:iconst_1        
		//*  82  168:iadd            
		//*  83  169:istore_3        
		//*  84  170:aload           7
		//*  85  172:astore          6
		//*  86  174:goto            38
		//*  87  177:aload           8
		//*  88  179:aload           6
		//*  89  181:iload_3         
		//*  90  182:invokevirtual   #127 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.completeAndClearBuffer(Object, int)>
		//*  91  185:checkcast       #15  <Class boolean[]>
		//*  92  188:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
		//*  93  189:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aflag)), booleanbuilder.bufferedSize() + i);
		//   94  190:aload_1         
		//   95  191:aload           6
		//   96  193:aload           8
		//   97  195:invokevirtual   #131 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.bufferedSize()>
		//   98  198:iload_3         
		//   99  199:iadd            
		//  100  200:invokestatic    #137 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//  101  203:athrow          
				}
				flag = false;
				break MISSING_BLOCK_LABEL_128;
			}
			flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
			aflag1 = aflag;
			j = i;
			if(i < aflag.length)
				break MISSING_BLOCK_LABEL_158;
			aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(((Object) (aflag)), i);
			j = 0;
			aflag1[j] = flag;
			i = j + 1;
			aflag = aflag1;
			if(true) goto _L2; else goto _L1
_L1:
			return (boolean[])booleanbuilder.completeAndClearBuffer(((Object) (aflag)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #140 <Method boolean[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #120 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
		//    8   11:bastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new BooleanDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$BooleanDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #144 <Method void PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected BooleanDeser(BooleanDeser booleandeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (booleandeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class ByteDeser extends PrimitiveArrayDeserializers
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
		//    8   16:invokevirtual   #77  <Method Base64Variant DeserializationContext.getBase64Variant()>
		//    9   19:invokevirtual   #81  <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
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
			return ((PrimitiveArrayDeserializers) (new ByteDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ByteDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #213 <Method void PrimitiveArrayDeserializers$ByteDeser(PrimitiveArrayDeserializers$ByteDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected ByteDeser(ByteDeser bytedeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (bytedeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class CharDeser extends PrimitiveArrayDeserializers
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
						deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot convert a JSON String of length %d into a char element of char array", new Object[] {
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
		//   87  182:invokevirtual   #147 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
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

		public CharDeser()
		{
			super([C);
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <Class char[]>
		//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
		//    3    6:return          
		}
	}

	static final class DoubleDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((double[])obj, (double[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class double[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class double[]>
		//    5    9:invokevirtual   #28  <Method double[] _concat(double[], double[])>
		//    6   12:areturn         
		}

		protected double[] _concat(double ad[], double ad1[])
		{
			int i = ad.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = ad1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			ad = Arrays.copyOf(ad, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #34  <Method double[] Arrays.copyOf(double[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (ad1)), 0, ((Object) (ad)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ad;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #45  <Method double[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected double[] _constructEmpty()
		{
			return new double[0];
		//    0    0:iconst_0        
		//    1    1:newarray        double[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #54  <Method double[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			double ad[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (double[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class double[]>
		//    8   16:areturn         
			doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder ArrayBuilders.getDoubleBuilder()>
		//   12   24:astore          9
			ad = (double[])doublebuilder.resetAndStart();
		//   13   26:aload           9
		//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class double[]>
		//   16   34:astore          7
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          5
_L2:
			JsonToken jsontoken = jsonparser.nextToken();
		//   19   39:aload_1         
		//   20   40:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
		//   21   43:astore          8
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   45:aload           8
		//   23   47:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
		//   24   50:if_acmpeq       141
			if(jsontoken == JsonToken.VALUE_NULL && _nuller != null)
		//*  25   53:aload           8
		//*  26   55:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
		//*  27   58:if_acmpne       82
		//*  28   61:aload_0         
		//*  29   62:getfield        #100 <Field NullValueProvider _nuller>
		//*  30   65:ifnull          82
			{
				_nuller.getNullValue(deserializationcontext);
		//   31   68:aload_0         
		//   32   69:getfield        #100 <Field NullValueProvider _nuller>
		//   33   72:aload_2         
		//   34   73:invokeinterface #106 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   35   78:pop             
				continue; /* Loop/switch isn't completed */
		//   36   79:goto            39
			}
			double d;
			int j;
			double ad1[];
			try
			{
				d = _parseDoublePrimitive(jsonparser, deserializationcontext);
		//   37   82:aload_0         
		//   38   83:aload_1         
		//   39   84:aload_2         
		//   40   85:invokevirtual   #110 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
		//   41   88:dstore_3        
			}
		//*  42   89:aload           7
		//*  43   91:astore          8
		//*  44   93:iload           5
		//*  45   95:istore          6
		//*  46   97:iload           5
		//*  47   99:aload           7
		//*  48  101:arraylength     
		//*  49  102:icmplt          122
		//*  50  105:aload           9
		//*  51  107:aload           7
		//*  52  109:iload           5
		//*  53  111:invokevirtual   #114 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.appendCompletedChunk(Object, int)>
		//*  54  114:checkcast       #15  <Class double[]>
		//*  55  117:astore          8
		//*  56  119:iconst_0        
		//*  57  120:istore          6
		//*  58  122:aload           8
		//*  59  124:iload           6
		//*  60  126:dload_3         
		//*  61  127:dastore         
		//*  62  128:iload           6
		//*  63  130:iconst_1        
		//*  64  131:iadd            
		//*  65  132:istore          5
		//*  66  134:aload           8
		//*  67  136:astore          7
		//*  68  138:goto            39
		//*  69  141:aload           9
		//*  70  143:aload           7
		//*  71  145:iload           5
		//*  72  147:invokevirtual   #117 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.completeAndClearBuffer(Object, int)>
		//*  73  150:checkcast       #15  <Class double[]>
		//*  74  153:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
		//*  75  154:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ad)), doublebuilder.bufferedSize() + i);
		//   76  155:aload_1         
		//   77  156:aload           7
		//   78  158:aload           9
		//   79  160:invokevirtual   #121 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.bufferedSize()>
		//   80  163:iload           5
		//   81  165:iadd            
		//   82  166:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   83  169:athrow          
			}
			ad1 = ad;
			j = i;
			if(i < ad.length)
				break MISSING_BLOCK_LABEL_122;
			ad1 = (double[])doublebuilder.appendCompletedChunk(((Object) (ad)), i);
			j = 0;
			ad1[j] = d;
			i = j + 1;
			ad = ad1;
			if(true) goto _L2; else goto _L1
_L1:
			return (double[])doublebuilder.completeAndClearBuffer(((Object) (ad)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #130 <Method double[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #110 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
		//    8   11:dastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new DoubleDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$DoubleDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #134 <Method void PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected DoubleDeser(DoubleDeser doubledeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (doubledeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class FloatDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((float[])obj, (float[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class float[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class float[]>
		//    5    9:invokevirtual   #28  <Method float[] _concat(float[], float[])>
		//    6   12:areturn         
		}

		protected float[] _concat(float af[], float af1[])
		{
			int i = af.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = af1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			af = Arrays.copyOf(af, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #34  <Method float[] Arrays.copyOf(float[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (af1)), 0, ((Object) (af)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			return af;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #45  <Method float[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected float[] _constructEmpty()
		{
			return new float[0];
		//    0    0:iconst_0        
		//    1    1:newarray        float[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #54  <Method float[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			float af[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder floatbuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (float[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class float[]>
		//    8   16:areturn         
			floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder ArrayBuilders.getFloatBuilder()>
		//   12   24:astore          8
			af = (float[])floatbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class float[]>
		//   16   34:astore          6
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          4
_L2:
			JsonToken jsontoken = jsonparser.nextToken();
		//   19   39:aload_1         
		//   20   40:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
		//   21   43:astore          7
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   45:aload           7
		//   23   47:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
		//   24   50:if_acmpeq       141
			if(jsontoken == JsonToken.VALUE_NULL && _nuller != null)
		//*  25   53:aload           7
		//*  26   55:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
		//*  27   58:if_acmpne       82
		//*  28   61:aload_0         
		//*  29   62:getfield        #100 <Field NullValueProvider _nuller>
		//*  30   65:ifnull          82
			{
				_nuller.getNullValue(deserializationcontext);
		//   31   68:aload_0         
		//   32   69:getfield        #100 <Field NullValueProvider _nuller>
		//   33   72:aload_2         
		//   34   73:invokeinterface #106 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   35   78:pop             
				continue; /* Loop/switch isn't completed */
		//   36   79:goto            39
			}
			float f;
			int j;
			float af1[];
			try
			{
				f = _parseFloatPrimitive(jsonparser, deserializationcontext);
		//   37   82:aload_0         
		//   38   83:aload_1         
		//   39   84:aload_2         
		//   40   85:invokevirtual   #110 <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
		//   41   88:fstore_3        
			}
		//*  42   89:aload           6
		//*  43   91:astore          7
		//*  44   93:iload           4
		//*  45   95:istore          5
		//*  46   97:iload           4
		//*  47   99:aload           6
		//*  48  101:arraylength     
		//*  49  102:icmplt          122
		//*  50  105:aload           8
		//*  51  107:aload           6
		//*  52  109:iload           4
		//*  53  111:invokevirtual   #114 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.appendCompletedChunk(Object, int)>
		//*  54  114:checkcast       #15  <Class float[]>
		//*  55  117:astore          7
		//*  56  119:iconst_0        
		//*  57  120:istore          5
		//*  58  122:aload           7
		//*  59  124:iload           5
		//*  60  126:fload_3         
		//*  61  127:fastore         
		//*  62  128:iload           5
		//*  63  130:iconst_1        
		//*  64  131:iadd            
		//*  65  132:istore          4
		//*  66  134:aload           7
		//*  67  136:astore          6
		//*  68  138:goto            39
		//*  69  141:aload           8
		//*  70  143:aload           6
		//*  71  145:iload           4
		//*  72  147:invokevirtual   #117 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.completeAndClearBuffer(Object, int)>
		//*  73  150:checkcast       #15  <Class float[]>
		//*  74  153:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
		//*  75  154:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (af)), floatbuilder.bufferedSize() + i);
		//   76  155:aload_1         
		//   77  156:aload           6
		//   78  158:aload           8
		//   79  160:invokevirtual   #121 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.bufferedSize()>
		//   80  163:iload           4
		//   81  165:iadd            
		//   82  166:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   83  169:athrow          
			}
			af1 = af;
			j = i;
			if(i < af.length)
				break MISSING_BLOCK_LABEL_122;
			af1 = (float[])floatbuilder.appendCompletedChunk(((Object) (af)), i);
			j = 0;
			af1[j] = f;
			i = j + 1;
			af = af1;
			if(true) goto _L2; else goto _L1
_L1:
			return (float[])floatbuilder.completeAndClearBuffer(((Object) (af)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #130 <Method float[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #110 <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
		//    8   11:fastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new FloatDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$FloatDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #134 <Method void PrimitiveArrayDeserializers$FloatDeser(PrimitiveArrayDeserializers$FloatDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected FloatDeser(FloatDeser floatdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (floatdeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class IntDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((int[])obj, (int[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class int[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class int[]>
		//    5    9:invokevirtual   #35  <Method int[] _concat(int[], int[])>
		//    6   12:areturn         
		}

		protected int[] _concat(int ai[], int ai1[])
		{
			int i = ai.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = ai1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			ai = Arrays.copyOf(ai, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #41  <Method int[] Arrays.copyOf(int[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ai;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method int[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected int[] _constructEmpty()
		{
			return new int[0];
		//    0    0:iconst_0        
		//    1    1:newarray        int[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #61  <Method int[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			int ai[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder intbuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #70  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (int[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #73  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #23  <Class int[]>
		//    8   16:areturn         
			intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #79  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #85  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder ArrayBuilders.getIntBuilder()>
		//   12   24:astore          8
			ai = (int[])intbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #90  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.resetAndStart()>
		//   15   31:checkcast       #23  <Class int[]>
		//   16   34:astore          6
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
_L2:
			int j;
			JsonToken jsontoken;
			jsontoken = jsonparser.nextToken();
		//   19   38:aload_1         
		//   20   39:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
		//   21   42:astore          7
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   44:aload           7
		//   23   46:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
		//   24   49:if_acmpeq       166
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
		//*  25   52:aload           7
		//*  26   54:getstatic       #103 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*  27   57:if_acmpne       69
			{
				j = jsonparser.getIntValue();
		//   28   60:aload_1         
		//   29   61:invokevirtual   #107 <Method int JsonParser.getIntValue()>
		//   30   64:istore          4
				break MISSING_BLOCK_LABEL_117;
		//   31   66:goto            117
			}
			if(jsontoken == JsonToken.VALUE_NULL)
		//*  32   69:aload           7
		//*  33   71:getstatic       #110 <Field JsonToken JsonToken.VALUE_NULL>
		//*  34   74:if_acmpne       109
			{
				if(_nuller != null)
		//*  35   77:aload_0         
		//*  36   78:getfield        #114 <Field NullValueProvider _nuller>
		//*  37   81:ifnull          98
				{
					_nuller.getNullValue(deserializationcontext);
		//   38   84:aload_0         
		//   39   85:getfield        #114 <Field NullValueProvider _nuller>
		//   40   88:aload_2         
		//   41   89:invokeinterface #120 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   42   94:pop             
					continue; /* Loop/switch isn't completed */
		//   43   95:goto            38
				}
				int k;
				int ai1[];
				try
				{
					_verifyNullForPrimitive(deserializationcontext);
		//   44   98:aload_0         
		//   45   99:aload_2         
		//   46  100:invokevirtual   #124 <Method void _verifyNullForPrimitive(DeserializationContext)>
				}
		//*  47  103:iconst_0        
		//*  48  104:istore          4
		//*  49  106:goto            117
		//*  50  109:aload_0         
		//*  51  110:aload_1         
		//*  52  111:aload_2         
		//*  53  112:invokevirtual   #128 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
		//*  54  115:istore          4
		//*  55  117:aload           6
		//*  56  119:astore          7
		//*  57  121:iload_3         
		//*  58  122:istore          5
		//*  59  124:iload_3         
		//*  60  125:aload           6
		//*  61  127:arraylength     
		//*  62  128:icmplt          147
		//*  63  131:aload           8
		//*  64  133:aload           6
		//*  65  135:iload_3         
		//*  66  136:invokevirtual   #132 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.appendCompletedChunk(Object, int)>
		//*  67  139:checkcast       #23  <Class int[]>
		//*  68  142:astore          7
		//*  69  144:iconst_0        
		//*  70  145:istore          5
		//*  71  147:aload           7
		//*  72  149:iload           5
		//*  73  151:iload           4
		//*  74  153:iastore         
		//*  75  154:iload           5
		//*  76  156:iconst_1        
		//*  77  157:iadd            
		//*  78  158:istore_3        
		//*  79  159:aload           7
		//*  80  161:astore          6
		//*  81  163:goto            38
		//*  82  166:aload           8
		//*  83  168:aload           6
		//*  84  170:iload_3         
		//*  85  171:invokevirtual   #135 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.completeAndClearBuffer(Object, int)>
		//*  86  174:checkcast       #23  <Class int[]>
		//*  87  177:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
		//*  88  178:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ai)), intbuilder.bufferedSize() + i);
		//   89  179:aload_1         
		//   90  180:aload           6
		//   91  182:aload           8
		//   92  184:invokevirtual   #138 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.bufferedSize()>
		//   93  187:iload_3         
		//   94  188:iadd            
		//   95  189:invokestatic    #144 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   96  192:athrow          
				}
				j = 0;
				break MISSING_BLOCK_LABEL_117;
			}
			j = _parseIntPrimitive(jsonparser, deserializationcontext);
			ai1 = ai;
			k = i;
			if(i < ai.length)
				break MISSING_BLOCK_LABEL_147;
			ai1 = (int[])intbuilder.appendCompletedChunk(((Object) (ai)), i);
			k = 0;
			ai1[k] = j;
			i = k + 1;
			ai = ai1;
			if(true) goto _L2; else goto _L1
_L1:
			return (int[])intbuilder.completeAndClearBuffer(((Object) (ai)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #147 <Method int[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #128 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
		//    8   11:iastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new IntDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$IntDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #151 <Method void PrimitiveArrayDeserializers$IntDeser(PrimitiveArrayDeserializers$IntDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected IntDeser(IntDeser intdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (intdeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class LongDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((long[])obj, (long[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class long[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class long[]>
		//    5    9:invokevirtual   #35  <Method long[] _concat(long[], long[])>
		//    6   12:areturn         
		}

		protected long[] _concat(long al[], long al1[])
		{
			int i = al.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = al1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			al = Arrays.copyOf(al, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #41  <Method long[] Arrays.copyOf(long[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (al1)), 0, ((Object) (al)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			return al;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method long[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected long[] _constructEmpty()
		{
			return new long[0];
		//    0    0:iconst_0        
		//    1    1:newarray        long[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #61  <Method long[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			long al[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #70  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (long[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #73  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #23  <Class long[]>
		//    8   16:areturn         
			longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #79  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #85  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder ArrayBuilders.getLongBuilder()>
		//   12   24:astore          9
			al = (long[])longbuilder.resetAndStart();
		//   13   26:aload           9
		//   14   28:invokevirtual   #90  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.resetAndStart()>
		//   15   31:checkcast       #23  <Class long[]>
		//   16   34:astore          7
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore_3        
_L2:
			long l;
			JsonToken jsontoken;
			jsontoken = jsonparser.nextToken();
		//   19   38:aload_1         
		//   20   39:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
		//   21   42:astore          8
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   44:aload           8
		//   23   46:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
		//   24   49:if_acmpeq       166
			if(jsontoken == JsonToken.VALUE_NUMBER_INT)
		//*  25   52:aload           8
		//*  26   54:getstatic       #103 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*  27   57:if_acmpne       69
			{
				l = jsonparser.getLongValue();
		//   28   60:aload_1         
		//   29   61:invokevirtual   #107 <Method long JsonParser.getLongValue()>
		//   30   64:lstore          5
				break MISSING_BLOCK_LABEL_117;
		//   31   66:goto            117
			}
			if(jsontoken == JsonToken.VALUE_NULL)
		//*  32   69:aload           8
		//*  33   71:getstatic       #110 <Field JsonToken JsonToken.VALUE_NULL>
		//*  34   74:if_acmpne       109
			{
				if(_nuller != null)
		//*  35   77:aload_0         
		//*  36   78:getfield        #114 <Field NullValueProvider _nuller>
		//*  37   81:ifnull          98
				{
					_nuller.getNullValue(deserializationcontext);
		//   38   84:aload_0         
		//   39   85:getfield        #114 <Field NullValueProvider _nuller>
		//   40   88:aload_2         
		//   41   89:invokeinterface #120 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   42   94:pop             
					continue; /* Loop/switch isn't completed */
		//   43   95:goto            38
				}
				int j;
				long al1[];
				try
				{
					_verifyNullForPrimitive(deserializationcontext);
		//   44   98:aload_0         
		//   45   99:aload_2         
		//   46  100:invokevirtual   #124 <Method void _verifyNullForPrimitive(DeserializationContext)>
				}
		//*  47  103:lconst_0        
		//*  48  104:lstore          5
		//*  49  106:goto            117
		//*  50  109:aload_0         
		//*  51  110:aload_1         
		//*  52  111:aload_2         
		//*  53  112:invokevirtual   #128 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
		//*  54  115:lstore          5
		//*  55  117:aload           7
		//*  56  119:astore          8
		//*  57  121:iload_3         
		//*  58  122:istore          4
		//*  59  124:iload_3         
		//*  60  125:aload           7
		//*  61  127:arraylength     
		//*  62  128:icmplt          147
		//*  63  131:aload           9
		//*  64  133:aload           7
		//*  65  135:iload_3         
		//*  66  136:invokevirtual   #132 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.appendCompletedChunk(Object, int)>
		//*  67  139:checkcast       #23  <Class long[]>
		//*  68  142:astore          8
		//*  69  144:iconst_0        
		//*  70  145:istore          4
		//*  71  147:aload           8
		//*  72  149:iload           4
		//*  73  151:lload           5
		//*  74  153:lastore         
		//*  75  154:iload           4
		//*  76  156:iconst_1        
		//*  77  157:iadd            
		//*  78  158:istore_3        
		//*  79  159:aload           8
		//*  80  161:astore          7
		//*  81  163:goto            38
		//*  82  166:aload           9
		//*  83  168:aload           7
		//*  84  170:iload_3         
		//*  85  171:invokevirtual   #135 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.completeAndClearBuffer(Object, int)>
		//*  86  174:checkcast       #23  <Class long[]>
		//*  87  177:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
		//*  88  178:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (al)), longbuilder.bufferedSize() + i);
		//   89  179:aload_1         
		//   90  180:aload           7
		//   91  182:aload           9
		//   92  184:invokevirtual   #139 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.bufferedSize()>
		//   93  187:iload_3         
		//   94  188:iadd            
		//   95  189:invokestatic    #145 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   96  192:athrow          
				}
				l = 0L;
				break MISSING_BLOCK_LABEL_117;
			}
			l = _parseLongPrimitive(jsonparser, deserializationcontext);
			al1 = al;
			j = i;
			if(i < al.length)
				break MISSING_BLOCK_LABEL_147;
			al1 = (long[])longbuilder.appendCompletedChunk(((Object) (al)), i);
			j = 0;
			al1[j] = l;
			i = j + 1;
			al = al1;
			if(true) goto _L2; else goto _L1
_L1:
			return (long[])longbuilder.completeAndClearBuffer(((Object) (al)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #148 <Method long[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #128 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
		//    8   11:lastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new LongDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #152 <Method void PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected LongDeser(LongDeser longdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (longdeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}

	static final class ShortDeser extends PrimitiveArrayDeserializers
	{

		protected volatile Object _concat(Object obj, Object obj1)
		{
			return ((Object) (_concat((short[])obj, (short[])obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class short[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class short[]>
		//    5    9:invokevirtual   #28  <Method short[] _concat(short[], short[])>
		//    6   12:areturn         
		}

		protected short[] _concat(short aword0[], short aword1[])
		{
			int i = aword0.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int j = aword1.length;
		//    3    3:aload_2         
		//    4    4:arraylength     
		//    5    5:istore          4
			aword0 = Arrays.copyOf(aword0, i + j);
		//    6    7:aload_1         
		//    7    8:iload_3         
		//    8    9:iload           4
		//    9   11:iadd            
		//   10   12:invokestatic    #34  <Method short[] Arrays.copyOf(short[], int)>
		//   11   15:astore_1        
			System.arraycopy(((Object) (aword1)), 0, ((Object) (aword0)), i, j);
		//   12   16:aload_2         
		//   13   17:iconst_0        
		//   14   18:aload_1         
		//   15   19:iload_3         
		//   16   20:iload           4
		//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aword0;
		//   18   25:aload_1         
		//   19   26:areturn         
		}

		protected volatile Object _constructEmpty()
		{
			return ((Object) (_constructEmpty()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #45  <Method short[] _constructEmpty()>
		//    2    4:areturn         
		}

		protected short[] _constructEmpty()
		{
			return new short[0];
		//    0    0:iconst_0        
		//    1    1:newarray        short[]
		//    2    3:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #54  <Method short[] deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i;
			short aword0[];
			com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder shortbuilder;
			if(!jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifne            17
				return (short[])handleNonArray(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
		//    7   13:checkcast       #15  <Class short[]>
		//    8   16:areturn         
			shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
		//    9   17:aload_2         
		//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
		//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder ArrayBuilders.getShortBuilder()>
		//   12   24:astore          8
			aword0 = (short[])shortbuilder.resetAndStart();
		//   13   26:aload           8
		//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.resetAndStart()>
		//   15   31:checkcast       #15  <Class short[]>
		//   16   34:astore          6
			i = 0;
		//   17   36:iconst_0        
		//   18   37:istore          4
_L2:
			JsonToken jsontoken;
			jsontoken = jsonparser.nextToken();
		//   19   39:aload_1         
		//   20   40:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
		//   21   43:astore          7
			if(jsontoken == JsonToken.END_ARRAY)
				break; /* Loop/switch isn't completed */
		//   22   45:aload           7
		//   23   47:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
		//   24   50:if_acmpeq       151
			if(jsontoken == JsonToken.VALUE_NULL)
		//*  25   53:aload           7
		//*  26   55:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
		//*  27   58:if_acmpne       92
			{
				if(_nuller != null)
		//*  28   61:aload_0         
		//*  29   62:getfield        #100 <Field NullValueProvider _nuller>
		//*  30   65:ifnull          82
				{
					_nuller.getNullValue(deserializationcontext);
		//   31   68:aload_0         
		//   32   69:getfield        #100 <Field NullValueProvider _nuller>
		//   33   72:aload_2         
		//   34   73:invokeinterface #106 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
		//   35   78:pop             
					continue; /* Loop/switch isn't completed */
		//   36   79:goto            39
				}
				short word0;
				int j;
				short aword1[];
				try
				{
					_verifyNullForPrimitive(deserializationcontext);
		//   37   82:aload_0         
		//   38   83:aload_2         
		//   39   84:invokevirtual   #110 <Method void _verifyNullForPrimitive(DeserializationContext)>
				}
		//*  40   87:iconst_0        
		//*  41   88:istore_3        
		//*  42   89:goto            99
		//*  43   92:aload_0         
		//*  44   93:aload_1         
		//*  45   94:aload_2         
		//*  46   95:invokevirtual   #114 <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
		//*  47   98:istore_3        
		//*  48   99:aload           6
		//*  49  101:astore          7
		//*  50  103:iload           4
		//*  51  105:istore          5
		//*  52  107:iload           4
		//*  53  109:aload           6
		//*  54  111:arraylength     
		//*  55  112:icmplt          132
		//*  56  115:aload           8
		//*  57  117:aload           6
		//*  58  119:iload           4
		//*  59  121:invokevirtual   #118 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.appendCompletedChunk(Object, int)>
		//*  60  124:checkcast       #15  <Class short[]>
		//*  61  127:astore          7
		//*  62  129:iconst_0        
		//*  63  130:istore          5
		//*  64  132:aload           7
		//*  65  134:iload           5
		//*  66  136:iload_3         
		//*  67  137:sastore         
		//*  68  138:iload           5
		//*  69  140:iconst_1        
		//*  70  141:iadd            
		//*  71  142:istore          4
		//*  72  144:aload           7
		//*  73  146:astore          6
		//*  74  148:goto            39
		//*  75  151:aload           8
		//*  76  153:aload           6
		//*  77  155:iload           4
		//*  78  157:invokevirtual   #121 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.completeAndClearBuffer(Object, int)>
		//*  79  160:checkcast       #15  <Class short[]>
		//*  80  163:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
		//*  81  164:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aword0)), shortbuilder.bufferedSize() + i);
		//   82  165:aload_1         
		//   83  166:aload           6
		//   84  168:aload           8
		//   85  170:invokevirtual   #125 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.bufferedSize()>
		//   86  173:iload           4
		//   87  175:iadd            
		//   88  176:invokestatic    #131 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
		//   89  179:athrow          
				}
				word0 = 0;
				break MISSING_BLOCK_LABEL_99;
			}
			word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
			aword1 = aword0;
			j = i;
			if(i < aword0.length)
				break MISSING_BLOCK_LABEL_132;
			aword1 = (short[])shortbuilder.appendCompletedChunk(((Object) (aword0)), i);
			j = 0;
			aword1[j] = word0;
			i = j + 1;
			aword0 = aword1;
			if(true) goto _L2; else goto _L1
_L1:
			return (short[])shortbuilder.completeAndClearBuffer(((Object) (aword0)), i);
		}

		protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #134 <Method short[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
		//    7    8:invokevirtual   #114 <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
		//    8   11:sastore         
		//    9   12:areturn         
		}

		protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			return ((PrimitiveArrayDeserializers) (new ShortDeser(this, nullvalueprovider, boolean1)));
		//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ShortDeser>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #138 <Method void PrimitiveArrayDeserializers$ShortDeser(PrimitiveArrayDeserializers$ShortDeser, NullValueProvider, Boolean)>
		//    6   10:areturn         
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

		protected ShortDeser(ShortDeser shortdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
		{
			super(((PrimitiveArrayDeserializers) (shortdeser)), nullvalueprovider, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
		//    5    7:return          
		}
	}


	protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers primitivearraydeserializers, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(primitivearraydeserializers._valueClass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #43  <Field Class _valueClass>
	//    3    5:invokespecial   #46  <Method void StdDeserializer(Class)>
		_unwrapSingle = boolean1;
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:putfield        #48  <Field Boolean _unwrapSingle>
		_nuller = nullvalueprovider;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #50  <Field NullValueProvider _nuller>
	//   10   18:return          
	}

	protected PrimitiveArrayDeserializers(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void StdDeserializer(Class)>
		_unwrapSingle = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #48  <Field Boolean _unwrapSingle>
		_nuller = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #50  <Field NullValueProvider _nuller>
	//    9   15:return          
	}

	public static JsonDeserializer forType(Class class1)
	{
		if(class1 == Integer.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #61  <Field Class Integer.TYPE>
	//*   2    4:if_acmpne       11
			return ((JsonDeserializer) (IntDeser.instance));
	//    3    7:getstatic       #65  <Field PrimitiveArrayDeserializers$IntDeser PrimitiveArrayDeserializers$IntDeser.instance>
	//    4   10:areturn         
		if(class1 == Long.TYPE)
	//*   5   11:aload_0         
	//*   6   12:getstatic       #68  <Field Class Long.TYPE>
	//*   7   15:if_acmpne       22
			return ((JsonDeserializer) (LongDeser.instance));
	//    8   18:getstatic       #71  <Field PrimitiveArrayDeserializers$LongDeser PrimitiveArrayDeserializers$LongDeser.instance>
	//    9   21:areturn         
		if(class1 == Byte.TYPE)
	//*  10   22:aload_0         
	//*  11   23:getstatic       #74  <Field Class Byte.TYPE>
	//*  12   26:if_acmpne       37
			return ((JsonDeserializer) (new ByteDeser()));
	//   13   29:new             #12  <Class PrimitiveArrayDeserializers$ByteDeser>
	//   14   32:dup             
	//   15   33:invokespecial   #77  <Method void PrimitiveArrayDeserializers$ByteDeser()>
	//   16   36:areturn         
		if(class1 == Short.TYPE)
	//*  17   37:aload_0         
	//*  18   38:getstatic       #80  <Field Class Short.TYPE>
	//*  19   41:if_acmpne       52
			return ((JsonDeserializer) (new ShortDeser()));
	//   20   44:new             #30  <Class PrimitiveArrayDeserializers$ShortDeser>
	//   21   47:dup             
	//   22   48:invokespecial   #81  <Method void PrimitiveArrayDeserializers$ShortDeser()>
	//   23   51:areturn         
		if(class1 == Float.TYPE)
	//*  24   52:aload_0         
	//*  25   53:getstatic       #84  <Field Class Float.TYPE>
	//*  26   56:if_acmpne       67
			return ((JsonDeserializer) (new FloatDeser()));
	//   27   59:new             #21  <Class PrimitiveArrayDeserializers$FloatDeser>
	//   28   62:dup             
	//   29   63:invokespecial   #85  <Method void PrimitiveArrayDeserializers$FloatDeser()>
	//   30   66:areturn         
		if(class1 == Double.TYPE)
	//*  31   67:aload_0         
	//*  32   68:getstatic       #88  <Field Class Double.TYPE>
	//*  33   71:if_acmpne       82
			return ((JsonDeserializer) (new DoubleDeser()));
	//   34   74:new             #18  <Class PrimitiveArrayDeserializers$DoubleDeser>
	//   35   77:dup             
	//   36   78:invokespecial   #89  <Method void PrimitiveArrayDeserializers$DoubleDeser()>
	//   37   81:areturn         
		if(class1 == Boolean.TYPE)
	//*  38   82:aload_0         
	//*  39   83:getstatic       #92  <Field Class Boolean.TYPE>
	//*  40   86:if_acmpne       97
			return ((JsonDeserializer) (new BooleanDeser()));
	//   41   89:new             #9   <Class PrimitiveArrayDeserializers$BooleanDeser>
	//   42   92:dup             
	//   43   93:invokespecial   #93  <Method void PrimitiveArrayDeserializers$BooleanDeser()>
	//   44   96:areturn         
		if(class1 == Character.TYPE)
	//*  45   97:aload_0         
	//*  46   98:getstatic       #96  <Field Class Character.TYPE>
	//*  47  101:if_acmpne       112
			return ((JsonDeserializer) (new CharDeser()));
	//   48  104:new             #15  <Class PrimitiveArrayDeserializers$CharDeser>
	//   49  107:dup             
	//   50  108:invokespecial   #97  <Method void PrimitiveArrayDeserializers$CharDeser()>
	//   51  111:areturn         
		else
			throw new IllegalStateException();
	//   52  112:new             #99  <Class IllegalStateException>
	//   53  115:dup             
	//   54  116:invokespecial   #100 <Method void IllegalStateException()>
	//   55  119:athrow          
	}

	protected abstract Object _concat(Object obj, Object obj1);

	protected abstract Object _constructEmpty();

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, _valueClass, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #43  <Field Class _valueClass>
	//    5    7:getstatic       #115 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//    6   10:invokevirtual   #119 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//    7   13:astore_3        
		Nulls nulls = findContentNullStyle(deserializationcontext, beanproperty);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #123 <Method Nulls findContentNullStyle(DeserializationContext, BeanProperty)>
	//   12   20:astore          4
		if(nulls == Nulls.SKIP)
	//*  13   22:aload           4
	//*  14   24:getstatic       #129 <Field Nulls Nulls.SKIP>
	//*  15   27:if_acmpne       37
			deserializationcontext = ((DeserializationContext) (NullsConstantProvider.skipper()));
	//   16   30:invokestatic    #135 <Method NullsConstantProvider NullsConstantProvider.skipper()>
	//   17   33:astore_1        
		else
	//*  18   34:goto            74
		if(nulls == Nulls.FAIL)
	//*  19   37:aload           4
	//*  20   39:getstatic       #138 <Field Nulls Nulls.FAIL>
	//*  21   42:if_acmpne       72
		{
			if(beanproperty == null)
	//*  22   45:aload_2         
	//*  23   46:ifnonnull       64
				deserializationcontext = ((DeserializationContext) (NullsFailProvider.constructForRootValue(deserializationcontext.constructType(_valueClass))));
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:getfield        #43  <Field Class _valueClass>
	//   27   54:invokevirtual   #144 <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
	//   28   57:invokestatic    #150 <Method NullsFailProvider NullsFailProvider.constructForRootValue(com.fasterxml.jackson.databind.JavaType)>
	//   29   60:astore_1        
			else
	//*  30   61:goto            74
				deserializationcontext = ((DeserializationContext) (NullsFailProvider.constructForProperty(beanproperty)));
	//   31   64:aload_2         
	//   32   65:invokestatic    #154 <Method NullsFailProvider NullsFailProvider.constructForProperty(BeanProperty)>
	//   33   68:astore_1        
		} else
	//*  34   69:goto            74
		{
			deserializationcontext = null;
	//   35   72:aconst_null     
	//   36   73:astore_1        
		}
		if(boolean1 == _unwrapSingle && deserializationcontext == _nuller)
	//*  37   74:aload_3         
	//*  38   75:aload_0         
	//*  39   76:getfield        #48  <Field Boolean _unwrapSingle>
	//*  40   79:if_acmpne       92
	//*  41   82:aload_1         
	//*  42   83:aload_0         
	//*  43   84:getfield        #50  <Field NullValueProvider _nuller>
	//*  44   87:if_acmpne       92
			return ((JsonDeserializer) (this));
	//   45   90:aload_0         
	//   46   91:areturn         
		else
			return ((JsonDeserializer) (withResolved(((NullValueProvider) (deserializationcontext)), boolean1)));
	//   47   92:aload_0         
	//   48   93:aload_1         
	//   49   94:aload_3         
	//   50   95:invokevirtual   #158 <Method PrimitiveArrayDeserializers withResolved(NullValueProvider, Boolean)>
	//   51   98:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		jsonparser = ((JsonParser) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #167 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_1        
		if(obj == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
			return ((Object) (jsonparser));
	//    7   11:aload_1         
	//    8   12:areturn         
		if(Array.getLength(obj) == 0)
	//*   9   13:aload_3         
	//*  10   14:invokestatic    #173 <Method int Array.getLength(Object)>
	//*  11   17:ifne            22
			return ((Object) (jsonparser));
	//   12   20:aload_1         
	//   13   21:areturn         
		else
			return _concat(obj, ((Object) (jsonparser)));
	//   14   22:aload_0         
	//   15   23:aload_3         
	//   16   24:aload_1         
	//   17   25:invokevirtual   #175 <Method Object _concat(Object, Object)>
	//   18   28:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #183 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.CONSTANT;
	//    0    0:getstatic       #191 <Field AccessPattern AccessPattern.CONSTANT>
	//    1    3:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		Object obj = _emptyValue;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field Object _emptyValue>
	//    2    4:astore_2        
		deserializationcontext = ((DeserializationContext) (obj));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(obj == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
		{
			deserializationcontext = ((DeserializationContext) (_constructEmpty()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #197 <Method Object _constructEmpty()>
	//    9   15:astore_1        
			_emptyValue = ((Object) (deserializationcontext));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #195 <Field Object _emptyValue>
		}
		return ((Object) (deserializationcontext));
	//   13   21:aload_1         
	//   14   22:areturn         
	}

	protected Object handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #204 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #210 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            32
	//*   4   10:aload_2         
	//*   5   11:getstatic       #216 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*   6   14:invokevirtual   #220 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            32
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #224 <Method String JsonParser.getText()>
	//*  10   24:invokevirtual   #230 <Method int String.length()>
	//*  11   27:ifne            32
			return ((Object) (null));
	//   12   30:aconst_null     
	//   13   31:areturn         
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*  14   32:aload_0         
	//*  15   33:getfield        #48  <Field Boolean _unwrapSingle>
	//*  16   36:getstatic       #233 <Field Boolean Boolean.TRUE>
	//*  17   39:if_acmpeq       67
	//*  18   42:aload_0         
	//*  19   43:getfield        #48  <Field Boolean _unwrapSingle>
	//*  20   46:ifnonnull       62
	//*  21   49:aload_2         
	//*  22   50:getstatic       #235 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  23   53:invokevirtual   #220 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  24   56:ifeq            62
	//*  25   59:goto            67
			flag = false;
	//   26   62:iconst_0        
	//   27   63:istore_3        
		else
	//*  28   64:goto            69
			flag = true;
	//   29   67:iconst_1        
	//   30   68:istore_3        
		if(flag)
	//*  31   69:iload_3         
	//*  32   70:ifeq            80
			return handleSingleElementUnwrapped(jsonparser, deserializationcontext);
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:invokevirtual   #238 <Method Object handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//   37   79:areturn         
		else
			return deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   38   80:aload_2         
	//   39   81:aload_0         
	//   40   82:getfield        #43  <Field Class _valueClass>
	//   41   85:aload_1         
	//   42   86:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   43   89:areturn         
	}

	protected abstract Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.TRUE;
	//    0    0:getstatic       #233 <Field Boolean Boolean.TRUE>
	//    1    3:areturn         
	}

	protected abstract PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1);

	private transient Object _emptyValue;
	protected final NullValueProvider _nuller;
	protected final Boolean _unwrapSingle;
}
