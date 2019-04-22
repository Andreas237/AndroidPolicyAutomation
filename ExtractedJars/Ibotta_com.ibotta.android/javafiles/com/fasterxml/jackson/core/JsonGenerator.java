// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.*;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonGenerationException, JsonParser, JsonToken, 
//			JsonStreamContext, FormatSchema, Base64Variants, SerializableString, 
//			PrettyPrinter, Base64Variant

public abstract class JsonGenerator
	implements Versioned, Closeable, Flushable
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			Feature afeature[] = values();
		//    0    0:invokestatic    #82  <Method JsonGenerator$Feature[] values()>
		//    1    3:astore          4
			int l = afeature.length;
		//    2    5:aload           4
		//    3    7:arraylength     
		//    4    8:istore_3        
			int i = 0;
		//    5    9:iconst_0        
		//    6   10:istore_0        
			int j;
			int k;
			for(j = 0; i < l; j = k)
		//*   7   11:iconst_0        
		//*   8   12:istore_1        
		//*   9   13:iload_0         
		//*  10   14:iload_3         
		//*  11   15:icmpge          51
			{
				Feature feature = afeature[i];
		//   12   18:aload           4
		//   13   20:iload_0         
		//   14   21:aaload          
		//   15   22:astore          5
				k = j;
		//   16   24:iload_1         
		//   17   25:istore_2        
				if(feature.enabledByDefault())
		//*  18   26:aload           5
		//*  19   28:invokevirtual   #86  <Method boolean enabledByDefault()>
		//*  20   31:ifeq            42
					k = j | feature.getMask();
		//   21   34:iload_1         
		//   22   35:aload           5
		//   23   37:invokevirtual   #89  <Method int getMask()>
		//   24   40:ior             
		//   25   41:istore_2        
				i++;
		//   26   42:iload_0         
		//   27   43:iconst_1        
		//   28   44:iadd            
		//   29   45:istore_0        
			}

		//   30   46:iload_2         
		//   31   47:istore_1        
		//*  32   48:goto            13
			return j;
		//   33   51:iload_1         
		//   34   52:ireturn         
		}

		public static Feature valueOf(String s)
		{
			return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
		//    0    0:ldc1            #2   <Class JsonGenerator$Feature>
		//    1    2:aload_0         
		//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonGenerator$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field JsonGenerator$Feature[] $VALUES>
		//    1    3:invokevirtual   #99  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonGenerator$Feature_3B_.clone()>
		//    2    6:checkcast       #95  <Class JsonGenerator$Feature[]>
		//    3    9:areturn         
		}

		public boolean enabledByDefault()
		{
			return _defaultState;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field boolean _defaultState>
		//    2    4:ireturn         
		}

		public boolean enabledIn(int i)
		{
			return (i & _mask) != 0;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #75  <Field int _mask>
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		public int getMask()
		{
			return _mask;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field int _mask>
		//    2    4:ireturn         
		}

		private static final Feature $VALUES[];
		public static final Feature AUTO_CLOSE_JSON_CONTENT;
		public static final Feature AUTO_CLOSE_TARGET;
		public static final Feature ESCAPE_NON_ASCII;
		public static final Feature FLUSH_PASSED_TO_STREAM;
		public static final Feature IGNORE_UNKNOWN;
		public static final Feature QUOTE_FIELD_NAMES;
		public static final Feature QUOTE_NON_NUMERIC_NUMBERS;
		public static final Feature STRICT_DUPLICATE_DETECTION;
		public static final Feature WRITE_BIGDECIMAL_AS_PLAIN;
		public static final Feature WRITE_NUMBERS_AS_STRINGS;
		private final boolean _defaultState;
		private final int _mask = 1 << ordinal();

		static 
		{
			AUTO_CLOSE_TARGET = new Feature("AUTO_CLOSE_TARGET", 0, true);
		//    0    0:new             #2   <Class JsonGenerator$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "AUTO_CLOSE_TARGET">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//    6   11:putstatic       #34  <Field JsonGenerator$Feature AUTO_CLOSE_TARGET>
			AUTO_CLOSE_JSON_CONTENT = new Feature("AUTO_CLOSE_JSON_CONTENT", 1, true);
		//    7   14:new             #2   <Class JsonGenerator$Feature>
		//    8   17:dup             
		//    9   18:ldc1            #35  <String "AUTO_CLOSE_JSON_CONTENT">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   13   25:putstatic       #37  <Field JsonGenerator$Feature AUTO_CLOSE_JSON_CONTENT>
			FLUSH_PASSED_TO_STREAM = new Feature("FLUSH_PASSED_TO_STREAM", 2, true);
		//   14   28:new             #2   <Class JsonGenerator$Feature>
		//   15   31:dup             
		//   16   32:ldc1            #38  <String "FLUSH_PASSED_TO_STREAM">
		//   17   34:iconst_2        
		//   18   35:iconst_1        
		//   19   36:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   20   39:putstatic       #40  <Field JsonGenerator$Feature FLUSH_PASSED_TO_STREAM>
			QUOTE_FIELD_NAMES = new Feature("QUOTE_FIELD_NAMES", 3, true);
		//   21   42:new             #2   <Class JsonGenerator$Feature>
		//   22   45:dup             
		//   23   46:ldc1            #41  <String "QUOTE_FIELD_NAMES">
		//   24   48:iconst_3        
		//   25   49:iconst_1        
		//   26   50:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   27   53:putstatic       #43  <Field JsonGenerator$Feature QUOTE_FIELD_NAMES>
			QUOTE_NON_NUMERIC_NUMBERS = new Feature("QUOTE_NON_NUMERIC_NUMBERS", 4, true);
		//   28   56:new             #2   <Class JsonGenerator$Feature>
		//   29   59:dup             
		//   30   60:ldc1            #44  <String "QUOTE_NON_NUMERIC_NUMBERS">
		//   31   62:iconst_4        
		//   32   63:iconst_1        
		//   33   64:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   34   67:putstatic       #46  <Field JsonGenerator$Feature QUOTE_NON_NUMERIC_NUMBERS>
			WRITE_NUMBERS_AS_STRINGS = new Feature("WRITE_NUMBERS_AS_STRINGS", 5, false);
		//   35   70:new             #2   <Class JsonGenerator$Feature>
		//   36   73:dup             
		//   37   74:ldc1            #47  <String "WRITE_NUMBERS_AS_STRINGS">
		//   38   76:iconst_5        
		//   39   77:iconst_0        
		//   40   78:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   41   81:putstatic       #49  <Field JsonGenerator$Feature WRITE_NUMBERS_AS_STRINGS>
			WRITE_BIGDECIMAL_AS_PLAIN = new Feature("WRITE_BIGDECIMAL_AS_PLAIN", 6, false);
		//   42   84:new             #2   <Class JsonGenerator$Feature>
		//   43   87:dup             
		//   44   88:ldc1            #50  <String "WRITE_BIGDECIMAL_AS_PLAIN">
		//   45   90:bipush          6
		//   46   92:iconst_0        
		//   47   93:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   48   96:putstatic       #52  <Field JsonGenerator$Feature WRITE_BIGDECIMAL_AS_PLAIN>
			ESCAPE_NON_ASCII = new Feature("ESCAPE_NON_ASCII", 7, false);
		//   49   99:new             #2   <Class JsonGenerator$Feature>
		//   50  102:dup             
		//   51  103:ldc1            #53  <String "ESCAPE_NON_ASCII">
		//   52  105:bipush          7
		//   53  107:iconst_0        
		//   54  108:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   55  111:putstatic       #55  <Field JsonGenerator$Feature ESCAPE_NON_ASCII>
			STRICT_DUPLICATE_DETECTION = new Feature("STRICT_DUPLICATE_DETECTION", 8, false);
		//   56  114:new             #2   <Class JsonGenerator$Feature>
		//   57  117:dup             
		//   58  118:ldc1            #56  <String "STRICT_DUPLICATE_DETECTION">
		//   59  120:bipush          8
		//   60  122:iconst_0        
		//   61  123:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   62  126:putstatic       #58  <Field JsonGenerator$Feature STRICT_DUPLICATE_DETECTION>
			IGNORE_UNKNOWN = new Feature("IGNORE_UNKNOWN", 9, false);
		//   63  129:new             #2   <Class JsonGenerator$Feature>
		//   64  132:dup             
		//   65  133:ldc1            #59  <String "IGNORE_UNKNOWN">
		//   66  135:bipush          9
		//   67  137:iconst_0        
		//   68  138:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
		//   69  141:putstatic       #61  <Field JsonGenerator$Feature IGNORE_UNKNOWN>
			$VALUES = (new Feature[] {
				AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, FLUSH_PASSED_TO_STREAM, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, WRITE_NUMBERS_AS_STRINGS, WRITE_BIGDECIMAL_AS_PLAIN, ESCAPE_NON_ASCII, STRICT_DUPLICATE_DETECTION, IGNORE_UNKNOWN
			});
		//   70  144:bipush          10
		//   71  146:anewarray       Feature[]
		//   72  149:dup             
		//   73  150:iconst_0        
		//   74  151:getstatic       #34  <Field JsonGenerator$Feature AUTO_CLOSE_TARGET>
		//   75  154:aastore         
		//   76  155:dup             
		//   77  156:iconst_1        
		//   78  157:getstatic       #37  <Field JsonGenerator$Feature AUTO_CLOSE_JSON_CONTENT>
		//   79  160:aastore         
		//   80  161:dup             
		//   81  162:iconst_2        
		//   82  163:getstatic       #40  <Field JsonGenerator$Feature FLUSH_PASSED_TO_STREAM>
		//   83  166:aastore         
		//   84  167:dup             
		//   85  168:iconst_3        
		//   86  169:getstatic       #43  <Field JsonGenerator$Feature QUOTE_FIELD_NAMES>
		//   87  172:aastore         
		//   88  173:dup             
		//   89  174:iconst_4        
		//   90  175:getstatic       #46  <Field JsonGenerator$Feature QUOTE_NON_NUMERIC_NUMBERS>
		//   91  178:aastore         
		//   92  179:dup             
		//   93  180:iconst_5        
		//   94  181:getstatic       #49  <Field JsonGenerator$Feature WRITE_NUMBERS_AS_STRINGS>
		//   95  184:aastore         
		//   96  185:dup             
		//   97  186:bipush          6
		//   98  188:getstatic       #52  <Field JsonGenerator$Feature WRITE_BIGDECIMAL_AS_PLAIN>
		//   99  191:aastore         
		//  100  192:dup             
		//  101  193:bipush          7
		//  102  195:getstatic       #55  <Field JsonGenerator$Feature ESCAPE_NON_ASCII>
		//  103  198:aastore         
		//  104  199:dup             
		//  105  200:bipush          8
		//  106  202:getstatic       #58  <Field JsonGenerator$Feature STRICT_DUPLICATE_DETECTION>
		//  107  205:aastore         
		//  108  206:dup             
		//  109  207:bipush          9
		//  110  209:getstatic       #61  <Field JsonGenerator$Feature IGNORE_UNKNOWN>
		//  111  212:aastore         
		//  112  213:putstatic       #63  <Field JsonGenerator$Feature[] $VALUES>
		//* 113  216:return          
		}

		private Feature(String s, int i, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #67  <Method void Enum(String, int)>
			_defaultState = flag;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #69  <Field boolean _defaultState>
		//    7   11:aload_0         
		//    8   12:iconst_1        
		//    9   13:aload_0         
		//   10   14:invokevirtual   #73  <Method int ordinal()>
		//   11   17:ishl            
		//   12   18:putfield        #75  <Field int _mask>
		//   13   21:return          
		}
	}


	protected JsonGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	protected void _reportError(String s)
		throws JsonGenerationException
	{
		throw new JsonGenerationException(s, this);
	//    0    0:new             #26  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5    9:athrow          
	}

	protected void _reportUnsupportedOperation()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Operation not supported by generator of type ");
	//    4    8:aload_1         
	//    5    9:ldc1            #36  <String "Operation not supported by generator of type ">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #44  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #50  <Method String Class.getName()>
	//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   14   27:new             #52  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #57  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	protected final void _throwInternal()
	{
		VersionUtil.throwInternal();
	//    0    0:invokestatic    #63  <Method void VersionUtil.throwInternal()>
	//    1    3:return          
	}

	protected final void _verifyOffsets(int i, int j, int k)
	{
		if(j >= 0 && j + k <= i)
	//*   0    0:iload_2         
	//*   1    1:iflt            12
	//*   2    4:iload_2         
	//*   3    5:iload_3         
	//*   4    6:iadd            
	//*   5    7:iload_1         
	//*   6    8:icmpgt          12
			return;
	//    7   11:return          
		else
			throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[] {
				Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
			}));
	//    8   12:new             #67  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #69  <String "invalid argument(s) (offset=%d, length=%d) for input array of %d element">
	//   11   18:iconst_3        
	//   12   19:anewarray       Object[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:iload_2         
	//   16   25:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_1        
	//   20   31:iload_3         
	//   21   32:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_2        
	//   25   38:iload_1         
	//   26   39:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   27   42:aastore         
	//   28   43:invokestatic    #81  <Method String String.format(String, Object[])>
	//   29   46:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   30   49:athrow          
	}

	protected void _writeSimpleObject(Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(obj instanceof String)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #77  <Class String>
	//*   7   13:ifeq            25
		{
			writeString((String)obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #77  <Class String>
	//   11   21:invokevirtual   #92  <Method void writeString(String)>
			return;
	//   12   24:return          
		}
		if(obj instanceof Number)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #94  <Class Number>
	//*  15   29:ifeq            204
		{
			Number number = (Number)obj;
	//   16   32:aload_1         
	//   17   33:checkcast       #94  <Class Number>
	//   18   36:astore_2        
			if(number instanceof Integer)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #71  <Class Integer>
	//*  21   41:ifeq            53
			{
				writeNumber(number.intValue());
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #98  <Method int Number.intValue()>
	//   25   49:invokevirtual   #102 <Method void writeNumber(int)>
				return;
	//   26   52:return          
			}
			if(number instanceof Long)
	//*  27   53:aload_2         
	//*  28   54:instanceof      #104 <Class Long>
	//*  29   57:ifeq            69
			{
				writeNumber(number.longValue());
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #108 <Method long Number.longValue()>
	//   33   65:invokevirtual   #111 <Method void writeNumber(long)>
				return;
	//   34   68:return          
			}
			if(number instanceof Double)
	//*  35   69:aload_2         
	//*  36   70:instanceof      #113 <Class Double>
	//*  37   73:ifeq            85
			{
				writeNumber(number.doubleValue());
	//   38   76:aload_0         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #117 <Method double Number.doubleValue()>
	//   41   81:invokevirtual   #120 <Method void writeNumber(double)>
				return;
	//   42   84:return          
			}
			if(number instanceof Float)
	//*  43   85:aload_2         
	//*  44   86:instanceof      #122 <Class Float>
	//*  45   89:ifeq            101
			{
				writeNumber(number.floatValue());
	//   46   92:aload_0         
	//   47   93:aload_2         
	//   48   94:invokevirtual   #126 <Method float Number.floatValue()>
	//   49   97:invokevirtual   #129 <Method void writeNumber(float)>
				return;
	//   50  100:return          
			}
			if(number instanceof Short)
	//*  51  101:aload_2         
	//*  52  102:instanceof      #131 <Class Short>
	//*  53  105:ifeq            117
			{
				writeNumber(number.shortValue());
	//   54  108:aload_0         
	//   55  109:aload_2         
	//   56  110:invokevirtual   #135 <Method short Number.shortValue()>
	//   57  113:invokevirtual   #138 <Method void writeNumber(short)>
				return;
	//   58  116:return          
			}
			if(number instanceof Byte)
	//*  59  117:aload_2         
	//*  60  118:instanceof      #140 <Class Byte>
	//*  61  121:ifeq            134
			{
				writeNumber(number.byteValue());
	//   62  124:aload_0         
	//   63  125:aload_2         
	//   64  126:invokevirtual   #144 <Method byte Number.byteValue()>
	//   65  129:int2short       
	//   66  130:invokevirtual   #138 <Method void writeNumber(short)>
				return;
	//   67  133:return          
			}
			if(number instanceof BigInteger)
	//*  68  134:aload_2         
	//*  69  135:instanceof      #146 <Class BigInteger>
	//*  70  138:ifeq            150
			{
				writeNumber((BigInteger)number);
	//   71  141:aload_0         
	//   72  142:aload_2         
	//   73  143:checkcast       #146 <Class BigInteger>
	//   74  146:invokevirtual   #149 <Method void writeNumber(BigInteger)>
				return;
	//   75  149:return          
			}
			if(number instanceof BigDecimal)
	//*  76  150:aload_2         
	//*  77  151:instanceof      #151 <Class BigDecimal>
	//*  78  154:ifeq            166
			{
				writeNumber((BigDecimal)number);
	//   79  157:aload_0         
	//   80  158:aload_2         
	//   81  159:checkcast       #151 <Class BigDecimal>
	//   82  162:invokevirtual   #154 <Method void writeNumber(BigDecimal)>
				return;
	//   83  165:return          
			}
			if(number instanceof AtomicInteger)
	//*  84  166:aload_2         
	//*  85  167:instanceof      #156 <Class AtomicInteger>
	//*  86  170:ifeq            185
			{
				writeNumber(((AtomicInteger)number).get());
	//   87  173:aload_0         
	//   88  174:aload_2         
	//   89  175:checkcast       #156 <Class AtomicInteger>
	//   90  178:invokevirtual   #159 <Method int AtomicInteger.get()>
	//   91  181:invokevirtual   #102 <Method void writeNumber(int)>
				return;
	//   92  184:return          
			}
			if(number instanceof AtomicLong)
	//*  93  185:aload_2         
	//*  94  186:instanceof      #161 <Class AtomicLong>
	//*  95  189:ifeq            258
			{
				writeNumber(((AtomicLong)number).get());
	//   96  192:aload_0         
	//   97  193:aload_2         
	//   98  194:checkcast       #161 <Class AtomicLong>
	//   99  197:invokevirtual   #163 <Method long AtomicLong.get()>
	//  100  200:invokevirtual   #111 <Method void writeNumber(long)>
				return;
	//  101  203:return          
			}
		} else
		{
			if(obj instanceof byte[])
	//* 102  204:aload_1         
	//* 103  205:instanceof      #165 <Class byte[]>
	//* 104  208:ifeq            220
			{
				writeBinary((byte[])obj);
	//  105  211:aload_0         
	//  106  212:aload_1         
	//  107  213:checkcast       #165 <Class byte[]>
	//  108  216:invokevirtual   #169 <Method void writeBinary(byte[])>
				return;
	//  109  219:return          
			}
			if(obj instanceof Boolean)
	//* 110  220:aload_1         
	//* 111  221:instanceof      #171 <Class Boolean>
	//* 112  224:ifeq            239
			{
				writeBoolean(((Boolean)obj).booleanValue());
	//  113  227:aload_0         
	//  114  228:aload_1         
	//  115  229:checkcast       #171 <Class Boolean>
	//  116  232:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//  117  235:invokevirtual   #179 <Method void writeBoolean(boolean)>
				return;
	//  118  238:return          
			}
			if(obj instanceof AtomicBoolean)
	//* 119  239:aload_1         
	//* 120  240:instanceof      #181 <Class AtomicBoolean>
	//* 121  243:ifeq            258
			{
				writeBoolean(((AtomicBoolean)obj).get());
	//  122  246:aload_0         
	//  123  247:aload_1         
	//  124  248:checkcast       #181 <Class AtomicBoolean>
	//  125  251:invokevirtual   #183 <Method boolean AtomicBoolean.get()>
	//  126  254:invokevirtual   #179 <Method void writeBoolean(boolean)>
				return;
	//  127  257:return          
			}
		}
		StringBuilder stringbuilder = new StringBuilder();
	//  128  258:new             #33  <Class StringBuilder>
	//  129  261:dup             
	//  130  262:invokespecial   #34  <Method void StringBuilder()>
	//  131  265:astore_2        
		stringbuilder.append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
	//  132  266:aload_2         
	//  133  267:ldc1            #185 <String "No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ">
	//  134  269:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  135  272:pop             
		stringbuilder.append(obj.getClass().getName());
	//  136  273:aload_2         
	//  137  274:aload_1         
	//  138  275:invokevirtual   #44  <Method Class Object.getClass()>
	//  139  278:invokevirtual   #50  <Method String Class.getName()>
	//  140  281:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  141  284:pop             
		stringbuilder.append(")");
	//  142  285:aload_2         
	//  143  286:ldc1            #187 <String ")">
	//  144  288:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  145  291:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//  146  292:new             #189 <Class IllegalStateException>
	//  147  295:dup             
	//  148  296:aload_2         
	//  149  297:invokevirtual   #55  <Method String StringBuilder.toString()>
	//  150  300:invokespecial   #190 <Method void IllegalStateException(String)>
	//  151  303:athrow          
	}

	public boolean canOmitFields()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canWriteBinaryNatively()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canWriteObjectId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canWriteTypeId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void close()
		throws IOException;

	public void copyCurrentEvent(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.currentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #203 <Method JsonToken JsonParser.currentToken()>
	//    2    4:astore_3        
		if(jsontoken == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       15
			_reportError("No current event to copy");
	//    5    9:aload_0         
	//    6   10:ldc1            #205 <String "No current event to copy">
	//    7   12:invokevirtual   #207 <Method void _reportError(String)>
		int i = jsontoken.id();
	//    8   15:aload_3         
	//    9   16:invokevirtual   #212 <Method int JsonToken.id()>
	//   10   19:istore_2        
		if(i != -1)
	//*  11   20:iload_2         
	//*  12   21:iconst_m1       
	//*  13   22:icmpeq          273
		{
			switch(i)
	//*  14   25:iload_2         
			{
	//*  15   26:tableswitch     1 12: default 88
	//	               1 268
	//	               2 263
	//	               3 258
	//	               4 253
	//	               5 244
	//	               6 211
	//	               7 165
	//	               8 119
	//	               9 113
	//	               10 107
	//	               11 102
	//	               12 93
			default:
				_throwInternal();
	//   16   88:aload_0         
	//   17   89:invokevirtual   #214 <Method void _throwInternal()>
				return;
	//   18   92:return          

			case 12: // '\f'
				writeObject(jsonparser.getEmbeddedObject());
	//   19   93:aload_0         
	//   20   94:aload_1         
	//   21   95:invokevirtual   #218 <Method Object JsonParser.getEmbeddedObject()>
	//   22   98:invokevirtual   #221 <Method void writeObject(Object)>
				return;
	//   23  101:return          

			case 11: // '\013'
				writeNull();
	//   24  102:aload_0         
	//   25  103:invokevirtual   #89  <Method void writeNull()>
				return;
	//   26  106:return          

			case 10: // '\n'
				writeBoolean(false);
	//   27  107:aload_0         
	//   28  108:iconst_0        
	//   29  109:invokevirtual   #179 <Method void writeBoolean(boolean)>
				return;
	//   30  112:return          

			case 9: // '\t'
				writeBoolean(true);
	//   31  113:aload_0         
	//   32  114:iconst_1        
	//   33  115:invokevirtual   #179 <Method void writeBoolean(boolean)>
				return;
	//   34  118:return          

			case 8: // '\b'
				JsonParser.NumberType numbertype = jsonparser.getNumberType();
	//   35  119:aload_1         
	//   36  120:invokevirtual   #225 <Method JsonParser$NumberType JsonParser.getNumberType()>
	//   37  123:astore_3        
				if(numbertype == JsonParser.NumberType.BIG_DECIMAL)
	//*  38  124:aload_3         
	//*  39  125:getstatic       #231 <Field JsonParser$NumberType JsonParser$NumberType.BIG_DECIMAL>
	//*  40  128:if_acmpne       140
				{
					writeNumber(jsonparser.getDecimalValue());
	//   41  131:aload_0         
	//   42  132:aload_1         
	//   43  133:invokevirtual   #235 <Method BigDecimal JsonParser.getDecimalValue()>
	//   44  136:invokevirtual   #154 <Method void writeNumber(BigDecimal)>
					return;
	//   45  139:return          
				}
				if(numbertype == JsonParser.NumberType.FLOAT)
	//*  46  140:aload_3         
	//*  47  141:getstatic       #238 <Field JsonParser$NumberType JsonParser$NumberType.FLOAT>
	//*  48  144:if_acmpne       156
				{
					writeNumber(jsonparser.getFloatValue());
	//   49  147:aload_0         
	//   50  148:aload_1         
	//   51  149:invokevirtual   #241 <Method float JsonParser.getFloatValue()>
	//   52  152:invokevirtual   #129 <Method void writeNumber(float)>
					return;
	//   53  155:return          
				} else
				{
					writeNumber(jsonparser.getDoubleValue());
	//   54  156:aload_0         
	//   55  157:aload_1         
	//   56  158:invokevirtual   #244 <Method double JsonParser.getDoubleValue()>
	//   57  161:invokevirtual   #120 <Method void writeNumber(double)>
					return;
	//   58  164:return          
				}

			case 7: // '\007'
				JsonParser.NumberType numbertype1 = jsonparser.getNumberType();
	//   59  165:aload_1         
	//   60  166:invokevirtual   #225 <Method JsonParser$NumberType JsonParser.getNumberType()>
	//   61  169:astore_3        
				if(numbertype1 == JsonParser.NumberType.INT)
	//*  62  170:aload_3         
	//*  63  171:getstatic       #247 <Field JsonParser$NumberType JsonParser$NumberType.INT>
	//*  64  174:if_acmpne       186
				{
					writeNumber(jsonparser.getIntValue());
	//   65  177:aload_0         
	//   66  178:aload_1         
	//   67  179:invokevirtual   #250 <Method int JsonParser.getIntValue()>
	//   68  182:invokevirtual   #102 <Method void writeNumber(int)>
					return;
	//   69  185:return          
				}
				if(numbertype1 == JsonParser.NumberType.BIG_INTEGER)
	//*  70  186:aload_3         
	//*  71  187:getstatic       #253 <Field JsonParser$NumberType JsonParser$NumberType.BIG_INTEGER>
	//*  72  190:if_acmpne       202
				{
					writeNumber(jsonparser.getBigIntegerValue());
	//   73  193:aload_0         
	//   74  194:aload_1         
	//   75  195:invokevirtual   #257 <Method BigInteger JsonParser.getBigIntegerValue()>
	//   76  198:invokevirtual   #149 <Method void writeNumber(BigInteger)>
					return;
	//   77  201:return          
				} else
				{
					writeNumber(jsonparser.getLongValue());
	//   78  202:aload_0         
	//   79  203:aload_1         
	//   80  204:invokevirtual   #260 <Method long JsonParser.getLongValue()>
	//   81  207:invokevirtual   #111 <Method void writeNumber(long)>
					return;
	//   82  210:return          
				}

			case 6: // '\006'
				if(jsonparser.hasTextCharacters())
	//*  83  211:aload_1         
	//*  84  212:invokevirtual   #263 <Method boolean JsonParser.hasTextCharacters()>
	//*  85  215:ifeq            235
				{
					writeString(jsonparser.getTextCharacters(), jsonparser.getTextOffset(), jsonparser.getTextLength());
	//   86  218:aload_0         
	//   87  219:aload_1         
	//   88  220:invokevirtual   #267 <Method char[] JsonParser.getTextCharacters()>
	//   89  223:aload_1         
	//   90  224:invokevirtual   #270 <Method int JsonParser.getTextOffset()>
	//   91  227:aload_1         
	//   92  228:invokevirtual   #273 <Method int JsonParser.getTextLength()>
	//   93  231:invokevirtual   #276 <Method void writeString(char[], int, int)>
					return;
	//   94  234:return          
				} else
				{
					writeString(jsonparser.getText());
	//   95  235:aload_0         
	//   96  236:aload_1         
	//   97  237:invokevirtual   #279 <Method String JsonParser.getText()>
	//   98  240:invokevirtual   #92  <Method void writeString(String)>
					return;
	//   99  243:return          
				}

			case 5: // '\005'
				writeFieldName(jsonparser.getCurrentName());
	//  100  244:aload_0         
	//  101  245:aload_1         
	//  102  246:invokevirtual   #282 <Method String JsonParser.getCurrentName()>
	//  103  249:invokevirtual   #285 <Method void writeFieldName(String)>
				return;
	//  104  252:return          

			case 4: // '\004'
				writeEndArray();
	//  105  253:aload_0         
	//  106  254:invokevirtual   #288 <Method void writeEndArray()>
				return;
	//  107  257:return          

			case 3: // '\003'
				writeStartArray();
	//  108  258:aload_0         
	//  109  259:invokevirtual   #291 <Method void writeStartArray()>
				return;
	//  110  262:return          

			case 2: // '\002'
				writeEndObject();
	//  111  263:aload_0         
	//  112  264:invokevirtual   #294 <Method void writeEndObject()>
				return;
	//  113  267:return          

			case 1: // '\001'
				writeStartObject();
	//  114  268:aload_0         
	//  115  269:invokevirtual   #297 <Method void writeStartObject()>
				return;
	//  116  272:return          
			}
		} else
		{
			_reportError("No current event to copy");
	//  117  273:aload_0         
	//  118  274:ldc1            #205 <String "No current event to copy">
	//  119  276:invokevirtual   #207 <Method void _reportError(String)>
			return;
	//  120  279:return          
		}
	}

	public void copyCurrentStructure(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.currentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #203 <Method JsonToken JsonParser.currentToken()>
	//    2    4:astore          4
		if(jsontoken == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
			_reportError("No current event to copy");
	//    5   11:aload_0         
	//    6   12:ldc1            #205 <String "No current event to copy">
	//    7   14:invokevirtual   #207 <Method void _reportError(String)>
		int j = jsontoken.id();
	//    8   17:aload           4
	//    9   19:invokevirtual   #212 <Method int JsonToken.id()>
	//   10   22:istore_3        
		int i = j;
	//   11   23:iload_3         
	//   12   24:istore_2        
		if(j == 5)
	//*  13   25:iload_3         
	//*  14   26:iconst_5        
	//*  15   27:icmpne          46
		{
			writeFieldName(jsonparser.getCurrentName());
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #282 <Method String JsonParser.getCurrentName()>
	//   19   35:invokevirtual   #285 <Method void writeFieldName(String)>
			i = jsonparser.nextToken().id();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #301 <Method JsonToken JsonParser.nextToken()>
	//   22   42:invokevirtual   #212 <Method int JsonToken.id()>
	//   23   45:istore_2        
		}
		if(i != 1)
	//*  24   46:iload_2         
	//*  25   47:iconst_1        
	//*  26   48:icmpeq          89
		{
			if(i != 3)
	//*  27   51:iload_2         
	//*  28   52:iconst_3        
	//*  29   53:icmpeq          62
			{
				copyCurrentEvent(jsonparser);
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #303 <Method void copyCurrentEvent(JsonParser)>
				return;
	//   33   61:return          
			}
			writeStartArray();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #291 <Method void writeStartArray()>
			for(; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser));
	//   36   66:aload_1         
	//   37   67:invokevirtual   #301 <Method JsonToken JsonParser.nextToken()>
	//   38   70:getstatic       #307 <Field JsonToken JsonToken.END_ARRAY>
	//   39   73:if_acmpeq       84
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:invokevirtual   #309 <Method void copyCurrentStructure(JsonParser)>
	//*  43   81:goto            66
			writeEndArray();
	//   44   84:aload_0         
	//   45   85:invokevirtual   #288 <Method void writeEndArray()>
			return;
	//   46   88:return          
		}
		writeStartObject();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #297 <Method void writeStartObject()>
		for(; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser));
	//   49   93:aload_1         
	//   50   94:invokevirtual   #301 <Method JsonToken JsonParser.nextToken()>
	//   51   97:getstatic       #312 <Field JsonToken JsonToken.END_OBJECT>
	//   52  100:if_acmpeq       111
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:invokevirtual   #309 <Method void copyCurrentStructure(JsonParser)>
	//*  56  108:goto            93
		writeEndObject();
	//   57  111:aload_0         
	//   58  112:invokevirtual   #294 <Method void writeEndObject()>
	//   59  115:return          
	}

	public abstract JsonGenerator disable(Feature feature);

	public abstract void flush()
		throws IOException;

	public abstract int getFeatureMask();

	public abstract JsonStreamContext getOutputContext();

	public PrettyPrinter getPrettyPrinter()
	{
		return _cfgPrettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field PrettyPrinter _cfgPrettyPrinter>
	//    2    4:areturn         
	}

	public JsonGenerator overrideFormatFeatures(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("No FormatFeatures defined for generator of type ");
	//    4    8:aload_3         
	//    5    9:ldc2            #326 <String "No FormatFeatures defined for generator of type ">
	//    6   12:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #44  <Method Class Object.getClass()>
	//   11   21:invokevirtual   #50  <Method String Class.getName()>
	//   12   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   14   28:new             #67  <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:aload_3         
	//   17   33:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   18   36:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   19   39:athrow          
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		return setFeatureMask(i & j | getFeatureMask() & j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:invokevirtual   #329 <Method int getFeatureMask()>
	//    6    8:iload_2         
	//    7    9:iand            
	//    8   10:ior             
	//    9   11:invokevirtual   #333 <Method JsonGenerator setFeatureMask(int)>
	//   10   14:areturn         
	}

	public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		JsonStreamContext jsonstreamcontext = getOutputContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #338 <Method JsonStreamContext getOutputContext()>
	//    2    4:astore_2        
		if(jsonstreamcontext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsonstreamcontext.setCurrentValue(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #342 <Method void JsonStreamContext.setCurrentValue(Object)>
	//    8   14:return          
	}

	public abstract JsonGenerator setFeatureMask(int i);

	public JsonGenerator setHighestNonEscapedChar(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
	{
		_cfgPrettyPrinter = prettyprinter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #322 <Field PrettyPrinter _cfgPrettyPrinter>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #52  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #349 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void setSchema(FormatSchema formatschema)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Generator of type ");
	//    4    8:aload_2         
	//    5    9:ldc2            #353 <String "Generator of type ">
	//    6   12:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #44  <Method Class Object.getClass()>
	//   11   21:invokevirtual   #50  <Method String Class.getName()>
	//   12   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" does not support schema of type '");
	//   14   28:aload_2         
	//   15   29:ldc2            #355 <String " does not support schema of type '">
	//   16   32:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(formatschema.getSchemaType());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokeinterface #360 <Method String FormatSchema.getSchemaType()>
	//   21   43:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append("'");
	//   23   47:aload_2         
	//   24   48:ldc2            #362 <String "'">
	//   25   51:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   27   55:new             #52  <Class UnsupportedOperationException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #57  <Method void UnsupportedOperationException(String)>
	//   32   66:athrow          
	}

	public void writeArray(double ad[], int i, int j)
		throws IOException
	{
		if(ad != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          49
		{
			_verifyOffsets(ad.length, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #366 <Method void _verifyOffsets(int, int, int)>
			writeStartArray();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #291 <Method void writeStartArray()>
			for(int k = i; k < j + i; k++)
	//*  10   16:iload_2         
	//*  11   17:istore          4
	//*  12   19:iload           4
	//*  13   21:iload_3         
	//*  14   22:iload_2         
	//*  15   23:iadd            
	//*  16   24:icmpge          44
				writeNumber(ad[k]);
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:iload           4
	//   20   31:daload          
	//   21   32:invokevirtual   #120 <Method void writeNumber(double)>

	//   22   35:iload           4
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore          4
	//*  26   41:goto            19
			writeEndArray();
	//   27   44:aload_0         
	//   28   45:invokevirtual   #288 <Method void writeEndArray()>
			return;
	//   29   48:return          
		} else
		{
			throw new IllegalArgumentException("null array");
	//   30   49:new             #67  <Class IllegalArgumentException>
	//   31   52:dup             
	//   32   53:ldc2            #368 <String "null array">
	//   33   56:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   34   59:athrow          
		}
	}

	public void writeArray(int ai[], int i, int j)
		throws IOException
	{
		if(ai != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          49
		{
			_verifyOffsets(ai.length, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #366 <Method void _verifyOffsets(int, int, int)>
			writeStartArray();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #291 <Method void writeStartArray()>
			for(int k = i; k < j + i; k++)
	//*  10   16:iload_2         
	//*  11   17:istore          4
	//*  12   19:iload           4
	//*  13   21:iload_3         
	//*  14   22:iload_2         
	//*  15   23:iadd            
	//*  16   24:icmpge          44
				writeNumber(ai[k]);
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:iload           4
	//   20   31:iaload          
	//   21   32:invokevirtual   #102 <Method void writeNumber(int)>

	//   22   35:iload           4
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore          4
	//*  26   41:goto            19
			writeEndArray();
	//   27   44:aload_0         
	//   28   45:invokevirtual   #288 <Method void writeEndArray()>
			return;
	//   29   48:return          
		} else
		{
			throw new IllegalArgumentException("null array");
	//   30   49:new             #67  <Class IllegalArgumentException>
	//   31   52:dup             
	//   32   53:ldc2            #368 <String "null array">
	//   33   56:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   34   59:athrow          
		}
	}

	public void writeArray(long al[], int i, int j)
		throws IOException
	{
		if(al != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          49
		{
			_verifyOffsets(al.length, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #366 <Method void _verifyOffsets(int, int, int)>
			writeStartArray();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #291 <Method void writeStartArray()>
			for(int k = i; k < j + i; k++)
	//*  10   16:iload_2         
	//*  11   17:istore          4
	//*  12   19:iload           4
	//*  13   21:iload_3         
	//*  14   22:iload_2         
	//*  15   23:iadd            
	//*  16   24:icmpge          44
				writeNumber(al[k]);
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:iload           4
	//   20   31:laload          
	//   21   32:invokevirtual   #111 <Method void writeNumber(long)>

	//   22   35:iload           4
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore          4
	//*  26   41:goto            19
			writeEndArray();
	//   27   44:aload_0         
	//   28   45:invokevirtual   #288 <Method void writeEndArray()>
			return;
	//   29   48:return          
		} else
		{
			throw new IllegalArgumentException("null array");
	//   30   49:new             #67  <Class IllegalArgumentException>
	//   31   52:dup             
	//   32   53:ldc2            #368 <String "null array">
	//   33   56:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   34   59:athrow          
		}
	}

	public abstract int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException;

	public int writeBinary(InputStream inputstream, int i)
		throws IOException
	{
		return writeBinary(Base64Variants.getDefaultVariant(), inputstream, i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #378 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #380 <Method int writeBinary(Base64Variant, InputStream, int)>
	//    5    9:ireturn         
	}

	public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException;

	public void writeBinary(byte abyte0[])
		throws IOException
	{
		writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:invokestatic    #378 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokevirtual   #383 <Method void writeBinary(Base64Variant, byte[], int, int)>
	//    7   11:return          
	}

	public void writeBinary(byte abyte0[], int i, int j)
		throws IOException
	{
		writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:invokestatic    #378 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #383 <Method void writeBinary(Base64Variant, byte[], int, int)>
	//    6   10:return          
	}

	public abstract void writeBoolean(boolean flag)
		throws IOException;

	public void writeEmbeddedObject(Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(obj instanceof byte[])
	//*   5    9:aload_1         
	//*   6   10:instanceof      #165 <Class byte[]>
	//*   7   13:ifeq            25
		{
			writeBinary((byte[])obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #165 <Class byte[]>
	//   11   21:invokevirtual   #169 <Method void writeBinary(byte[])>
			return;
	//   12   24:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #33  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #34  <Method void StringBuilder()>
	//   16   32:astore_2        
			stringbuilder.append("No native support for writing embedded objects of type ");
	//   17   33:aload_2         
	//   18   34:ldc2            #387 <String "No native support for writing embedded objects of type ">
	//   19   37:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(obj.getClass().getName());
	//   21   41:aload_2         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #44  <Method Class Object.getClass()>
	//   24   46:invokevirtual   #50  <Method String Class.getName()>
	//   25   49:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new JsonGenerationException(stringbuilder.toString(), this);
	//   27   53:new             #26  <Class JsonGenerationException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   61:aload_0         
	//   32   62:invokespecial   #29  <Method void JsonGenerationException(String, JsonGenerator)>
	//   33   65:athrow          
		}
	}

	public abstract void writeEndArray()
		throws IOException;

	public abstract void writeEndObject()
		throws IOException;

	public void writeFieldId(long l)
		throws IOException
	{
		writeFieldName(Long.toString(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #391 <Method String Long.toString(long)>
	//    3    5:invokevirtual   #285 <Method void writeFieldName(String)>
	//    4    8:return          
	}

	public abstract void writeFieldName(SerializableString serializablestring)
		throws IOException;

	public abstract void writeFieldName(String s)
		throws IOException;

	public abstract void writeNull()
		throws IOException;

	public abstract void writeNumber(double d)
		throws IOException;

	public abstract void writeNumber(float f)
		throws IOException;

	public abstract void writeNumber(int i)
		throws IOException;

	public abstract void writeNumber(long l)
		throws IOException;

	public abstract void writeNumber(String s)
		throws IOException;

	public abstract void writeNumber(BigDecimal bigdecimal)
		throws IOException;

	public abstract void writeNumber(BigInteger biginteger)
		throws IOException;

	public void writeNumber(short word0)
		throws IOException
	{
		writeNumber(((int) (word0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #102 <Method void writeNumber(int)>
	//    3    5:return          
	}

	public abstract void writeObject(Object obj)
		throws IOException;

	public void writeObjectId(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Object Ids", this);
	//    0    0:new             #26  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #395 <String "No native support for writing Object Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #29  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5   11:athrow          
	}

	public void writeObjectRef(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Object Ids", this);
	//    0    0:new             #26  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #395 <String "No native support for writing Object Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #29  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5   11:athrow          
	}

	public void writeOmittedField(String s)
		throws IOException
	{
	//    0    0:return          
	}

	public abstract void writeRaw(char c)
		throws IOException;

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		writeRaw(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #404 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #406 <Method void writeRaw(String)>
	//    4   10:return          
	}

	public abstract void writeRaw(String s)
		throws IOException;

	public abstract void writeRaw(char ac[], int i, int j)
		throws IOException;

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		writeRawValue(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #404 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #409 <Method void writeRawValue(String)>
	//    4   10:return          
	}

	public abstract void writeRawValue(String s)
		throws IOException;

	public abstract void writeStartArray()
		throws IOException;

	public void writeStartArray(int i)
		throws IOException
	{
		writeStartArray();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method void writeStartArray()>
	//    2    4:return          
	}

	public abstract void writeStartObject()
		throws IOException;

	public void writeStartObject(Object obj)
		throws IOException
	{
		writeStartObject();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method void writeStartObject()>
		setCurrentValue(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #410 <Method void setCurrentValue(Object)>
	//    5    9:return          
	}

	public abstract void writeString(SerializableString serializablestring)
		throws IOException;

	public abstract void writeString(String s)
		throws IOException;

	public abstract void writeString(char ac[], int i, int j)
		throws IOException;

	public void writeStringField(String s, String s1)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #285 <Method void writeFieldName(String)>
		writeString(s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #92  <Method void writeString(String)>
	//    6   10:return          
	}

	public void writeTypeId(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Type Ids", this);
	//    0    0:new             #26  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #415 <String "No native support for writing Type Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #29  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5   11:athrow          
	}

	public WritableTypeId writeTypePrefix(WritableTypeId writabletypeid)
		throws IOException
	{
		Object obj = writabletypeid.id;
	//    0    0:aload_1         
	//    1    1:getfield        #422 <Field Object WritableTypeId.id>
	//    2    4:astore_2        
		JsonToken jsontoken = writabletypeid.valueShape;
	//    3    5:aload_1         
	//    4    6:getfield        #425 <Field JsonToken WritableTypeId.valueShape>
	//    5    9:astore          5
		if(canWriteTypeId())
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #427 <Method boolean canWriteTypeId()>
	//*   8   15:ifeq            31
		{
			writabletypeid.wrapperWritten = false;
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:putfield        #431 <Field boolean WritableTypeId.wrapperWritten>
			writeTypeId(obj);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #433 <Method void writeTypeId(Object)>
		} else
	//*  15   28:goto            175
		{
			if(obj instanceof String)
	//*  16   31:aload_2         
	//*  17   32:instanceof      #77  <Class String>
	//*  18   35:ifeq            46
				obj = ((Object) ((String)obj));
	//   19   38:aload_2         
	//   20   39:checkcast       #77  <Class String>
	//   21   42:astore_2        
			else
	//*  22   43:goto            51
				obj = ((Object) (String.valueOf(obj)));
	//   23   46:aload_2         
	//   24   47:invokestatic    #436 <Method String String.valueOf(Object)>
	//   25   50:astore_2        
			writabletypeid.wrapperWritten = true;
	//   26   51:aload_1         
	//   27   52:iconst_1        
	//   28   53:putfield        #431 <Field boolean WritableTypeId.wrapperWritten>
			com.fasterxml.jackson.core.type.WritableTypeId.Inclusion inclusion1 = writabletypeid.include;
	//   29   56:aload_1         
	//   30   57:getfield        #440 <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
	//   31   60:astore          4
			com.fasterxml.jackson.core.type.WritableTypeId.Inclusion inclusion = inclusion1;
	//   32   62:aload           4
	//   33   64:astore_3        
			if(jsontoken != JsonToken.START_OBJECT)
	//*  34   65:aload           5
	//*  35   67:getstatic       #443 <Field JsonToken JsonToken.START_OBJECT>
	//*  36   70:if_acmpeq       93
			{
				inclusion = inclusion1;
	//   37   73:aload           4
	//   38   75:astore_3        
				if(inclusion1.requiresObjectContext())
	//*  39   76:aload           4
	//*  40   78:invokevirtual   #448 <Method boolean com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.requiresObjectContext()>
	//*  41   81:ifeq            93
				{
					inclusion = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_ARRAY;
	//   42   84:getstatic       #451 <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.WRAPPER_ARRAY>
	//   43   87:astore_3        
					writabletypeid.include = inclusion;
	//   44   88:aload_1         
	//   45   89:aload_3         
	//   46   90:putfield        #440 <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
				}
			}
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion = new int[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.values().length];
				//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.core.type.WritableTypeId$Inclusion[] com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
				//    5   12:getstatic       #24  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.PARENT_PROPERTY>
				//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
				//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.PAYLOAD_PROPERTY>
				//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
				//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.METADATA_PROPERTY>
				//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
				//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.WRAPPER_OBJECT>
				//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
				//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.WRAPPER_ARRAY>
				//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   30   65:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
					}
				//*  31   66:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   32   69:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
					}
				//*  33   70:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   34   73:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
					}
				//*  35   74:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   36   77:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
					}
				//*  37   78:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   38   81:astore_0        
				//*  39   82:return          
				}
			}

			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.type.WritableTypeId.Inclusion[inclusion.ordinal()])
	//*  47   93:getstatic       #455 <Field int[] JsonGenerator$1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
	//*  48   96:aload_3         
	//*  49   97:invokevirtual   #458 <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
	//*  50  100:iaload          
			{
	//*  51  101:tableswitch     1 4: default 132
	//	               1 175
	//	               2 175
	//	               3 156
	//	               4 144
			default:
				writeStartArray();
	//   52  132:aload_0         
	//   53  133:invokevirtual   #291 <Method void writeStartArray()>
				writeString(((String) (obj)));
	//   54  136:aload_0         
	//   55  137:aload_2         
	//   56  138:invokevirtual   #92  <Method void writeString(String)>
				break;

	//*  57  141:goto            175
			case 4: // '\004'
				writeStartObject();
	//   58  144:aload_0         
	//   59  145:invokevirtual   #297 <Method void writeStartObject()>
				writeFieldName(((String) (obj)));
	//   60  148:aload_0         
	//   61  149:aload_2         
	//   62  150:invokevirtual   #285 <Method void writeFieldName(String)>
				break;

	//*  63  153:goto            175
			case 3: // '\003'
				writeStartObject(writabletypeid.forValue);
	//   64  156:aload_0         
	//   65  157:aload_1         
	//   66  158:getfield        #461 <Field Object WritableTypeId.forValue>
	//   67  161:invokevirtual   #463 <Method void writeStartObject(Object)>
				writeStringField(writabletypeid.asProperty, ((String) (obj)));
	//   68  164:aload_0         
	//   69  165:aload_1         
	//   70  166:getfield        #467 <Field String WritableTypeId.asProperty>
	//   71  169:aload_2         
	//   72  170:invokevirtual   #469 <Method void writeStringField(String, String)>
				return writabletypeid;
	//   73  173:aload_1         
	//   74  174:areturn         

			case 1: // '\001'
			case 2: // '\002'
				break;
			}
		}
		if(jsontoken == JsonToken.START_OBJECT)
	//*  75  175:aload           5
	//*  76  177:getstatic       #443 <Field JsonToken JsonToken.START_OBJECT>
	//*  77  180:if_acmpne       193
		{
			writeStartObject(writabletypeid.forValue);
	//   78  183:aload_0         
	//   79  184:aload_1         
	//   80  185:getfield        #461 <Field Object WritableTypeId.forValue>
	//   81  188:invokevirtual   #463 <Method void writeStartObject(Object)>
			return writabletypeid;
	//   82  191:aload_1         
	//   83  192:areturn         
		}
		if(jsontoken == JsonToken.START_ARRAY)
	//*  84  193:aload           5
	//*  85  195:getstatic       #472 <Field JsonToken JsonToken.START_ARRAY>
	//*  86  198:if_acmpne       205
			writeStartArray();
	//   87  201:aload_0         
	//   88  202:invokevirtual   #291 <Method void writeStartArray()>
		return writabletypeid;
	//   89  205:aload_1         
	//   90  206:areturn         
	}

	public WritableTypeId writeTypeSuffix(WritableTypeId writabletypeid)
		throws IOException
	{
		JsonToken jsontoken = writabletypeid.valueShape;
	//    0    0:aload_1         
	//    1    1:getfield        #425 <Field JsonToken WritableTypeId.valueShape>
	//    2    4:astore_3        
		if(jsontoken == JsonToken.START_OBJECT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #443 <Field JsonToken JsonToken.START_OBJECT>
	//*   5    9:if_acmpne       19
			writeEndObject();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #294 <Method void writeEndObject()>
		else
	//*   8   16:goto            30
		if(jsontoken == JsonToken.START_ARRAY)
	//*   9   19:aload_3         
	//*  10   20:getstatic       #472 <Field JsonToken JsonToken.START_ARRAY>
	//*  11   23:if_acmpne       30
			writeEndArray();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #288 <Method void writeEndArray()>
		if(writabletypeid.wrapperWritten)
	//*  14   30:aload_1         
	//*  15   31:getfield        #431 <Field boolean WritableTypeId.wrapperWritten>
	//*  16   34:ifeq            126
		{
			int i = _cls1..SwitchMap.com.fasterxml.jackson.core.type.WritableTypeId.Inclusion[writabletypeid.include.ordinal()];
	//   17   37:getstatic       #455 <Field int[] JsonGenerator$1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion>
	//   18   40:aload_1         
	//   19   41:getfield        #440 <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
	//   20   44:invokevirtual   #458 <Method int com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.ordinal()>
	//   21   47:iaload          
	//   22   48:istore_2        
			if(i != 5)
	//*  23   49:iload_2         
	//*  24   50:iconst_5        
	//*  25   51:icmpeq          122
				switch(i)
	//*  26   54:iload_2         
				{
	//*  27   55:tableswitch     1 3: default 80
	//	               1 86
	//	               2 126
	//	               3 126
				default:
					writeEndObject();
	//   28   80:aload_0         
	//   29   81:invokevirtual   #294 <Method void writeEndObject()>
					return writabletypeid;
	//   30   84:aload_1         
	//   31   85:areturn         

				case 1: // '\001'
					Object obj = writabletypeid.id;
	//   32   86:aload_1         
	//   33   87:getfield        #422 <Field Object WritableTypeId.id>
	//   34   90:astore_3        
					if(obj instanceof String)
	//*  35   91:aload_3         
	//*  36   92:instanceof      #77  <Class String>
	//*  37   95:ifeq            106
						obj = ((Object) ((String)obj));
	//   38   98:aload_3         
	//   39   99:checkcast       #77  <Class String>
	//   40  102:astore_3        
					else
	//*  41  103:goto            111
						obj = ((Object) (String.valueOf(obj)));
	//   42  106:aload_3         
	//   43  107:invokestatic    #436 <Method String String.valueOf(Object)>
	//   44  110:astore_3        
					writeStringField(writabletypeid.asProperty, ((String) (obj)));
	//   45  111:aload_0         
	//   46  112:aload_1         
	//   47  113:getfield        #467 <Field String WritableTypeId.asProperty>
	//   48  116:aload_3         
	//   49  117:invokevirtual   #469 <Method void writeStringField(String, String)>
					return writabletypeid;
	//   50  120:aload_1         
	//   51  121:areturn         

				case 2: // '\002'
				case 3: // '\003'
					break;
				}
			else
				writeEndArray();
	//   52  122:aload_0         
	//   53  123:invokevirtual   #288 <Method void writeEndArray()>
		}
		return writabletypeid;
	//   54  126:aload_1         
	//   55  127:areturn         
	}

	protected PrettyPrinter _cfgPrettyPrinter;
}
