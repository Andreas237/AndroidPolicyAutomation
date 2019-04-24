// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.*;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonGenerationException, JsonParser, JsonToken, 
//			JsonStreamContext, FormatSchema, Base64Variants, SerializableString, 
//			PrettyPrinter, ObjectCodec, Version, Base64Variant, 
//			TreeNode

public abstract class JsonGenerator
	implements Closeable, Flushable, Versioned
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			Feature afeature[] = values();
		//    2    2:invokestatic    #82  <Method JsonGenerator$Feature[] values()>
		//    3    5:astore          4
			int l = afeature.length;
		//    4    7:aload           4
		//    5    9:arraylength     
		//    6   10:istore_3        
			for(int i = 0; i < l;)
		//*   7   11:iconst_0        
		//*   8   12:istore_0        
		//*   9   13:iload_0         
		//*  10   14:iload_3         
		//*  11   15:icmpge          51
			{
				Feature feature = afeature[i];
		//   12   18:aload           4
		//   13   20:iload_0         
		//   14   21:aaload          
		//   15   22:astore          5
				int k = j;
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
				j = k;
		//   30   46:iload_2         
		//   31   47:istore_1        
			}

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
			return (_mask & i) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field int _mask>
		//    2    4:iload_1         
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
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	protected void _reportError(String s)
		throws JsonGenerationException
	{
		throw new JsonGenerationException(s, this);
	//    0    0:new             #24  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5    9:athrow          
	}

	protected void _reportUnsupportedOperation()
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Operation not supported by generator of type ").append(((Object)this).getClass().getName()).toString());
	//    0    0:new             #31  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #34  <Method void StringBuilder()>
	//    5   11:ldc1            #36  <String "Operation not supported by generator of type ">
	//    6   13:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #44  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #50  <Method String Class.getName()>
	//   10   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   12   29:invokespecial   #55  <Method void UnsupportedOperationException(String)>
	//   13   32:athrow          
	}

	protected final void _throwInternal()
	{
		VersionUtil.throwInternal();
	//    0    0:invokestatic    #61  <Method void VersionUtil.throwInternal()>
	//    1    3:return          
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
	//    3    5:invokevirtual   #68  <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(obj instanceof String)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #70  <Class String>
	//*   7   13:ifeq            25
		{
			writeString((String)obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #70  <Class String>
	//   11   21:invokevirtual   #73  <Method void writeString(String)>
			return;
	//   12   24:return          
		}
		if(obj instanceof Number)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #75  <Class Number>
	//*  15   29:ifeq            204
		{
			Number number = (Number)obj;
	//   16   32:aload_1         
	//   17   33:checkcast       #75  <Class Number>
	//   18   36:astore_2        
			if(number instanceof Integer)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #77  <Class Integer>
	//*  21   41:ifeq            53
			{
				writeNumber(number.intValue());
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #81  <Method int Number.intValue()>
	//   25   49:invokevirtual   #85  <Method void writeNumber(int)>
				return;
	//   26   52:return          
			}
			if(number instanceof Long)
	//*  27   53:aload_2         
	//*  28   54:instanceof      #87  <Class Long>
	//*  29   57:ifeq            69
			{
				writeNumber(number.longValue());
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #91  <Method long Number.longValue()>
	//   33   65:invokevirtual   #94  <Method void writeNumber(long)>
				return;
	//   34   68:return          
			}
			if(number instanceof Double)
	//*  35   69:aload_2         
	//*  36   70:instanceof      #96  <Class Double>
	//*  37   73:ifeq            85
			{
				writeNumber(number.doubleValue());
	//   38   76:aload_0         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #100 <Method double Number.doubleValue()>
	//   41   81:invokevirtual   #103 <Method void writeNumber(double)>
				return;
	//   42   84:return          
			}
			if(number instanceof Float)
	//*  43   85:aload_2         
	//*  44   86:instanceof      #105 <Class Float>
	//*  45   89:ifeq            101
			{
				writeNumber(number.floatValue());
	//   46   92:aload_0         
	//   47   93:aload_2         
	//   48   94:invokevirtual   #109 <Method float Number.floatValue()>
	//   49   97:invokevirtual   #112 <Method void writeNumber(float)>
				return;
	//   50  100:return          
			}
			if(number instanceof Short)
	//*  51  101:aload_2         
	//*  52  102:instanceof      #114 <Class Short>
	//*  53  105:ifeq            117
			{
				writeNumber(number.shortValue());
	//   54  108:aload_0         
	//   55  109:aload_2         
	//   56  110:invokevirtual   #118 <Method short Number.shortValue()>
	//   57  113:invokevirtual   #121 <Method void writeNumber(short)>
				return;
	//   58  116:return          
			}
			if(number instanceof Byte)
	//*  59  117:aload_2         
	//*  60  118:instanceof      #123 <Class Byte>
	//*  61  121:ifeq            134
			{
				writeNumber(number.byteValue());
	//   62  124:aload_0         
	//   63  125:aload_2         
	//   64  126:invokevirtual   #127 <Method byte Number.byteValue()>
	//   65  129:int2short       
	//   66  130:invokevirtual   #121 <Method void writeNumber(short)>
				return;
	//   67  133:return          
			}
			if(number instanceof BigInteger)
	//*  68  134:aload_2         
	//*  69  135:instanceof      #129 <Class BigInteger>
	//*  70  138:ifeq            150
			{
				writeNumber((BigInteger)number);
	//   71  141:aload_0         
	//   72  142:aload_2         
	//   73  143:checkcast       #129 <Class BigInteger>
	//   74  146:invokevirtual   #132 <Method void writeNumber(BigInteger)>
				return;
	//   75  149:return          
			}
			if(number instanceof BigDecimal)
	//*  76  150:aload_2         
	//*  77  151:instanceof      #134 <Class BigDecimal>
	//*  78  154:ifeq            166
			{
				writeNumber((BigDecimal)number);
	//   79  157:aload_0         
	//   80  158:aload_2         
	//   81  159:checkcast       #134 <Class BigDecimal>
	//   82  162:invokevirtual   #137 <Method void writeNumber(BigDecimal)>
				return;
	//   83  165:return          
			}
			if(number instanceof AtomicInteger)
	//*  84  166:aload_2         
	//*  85  167:instanceof      #139 <Class AtomicInteger>
	//*  86  170:ifeq            185
			{
				writeNumber(((AtomicInteger)number).get());
	//   87  173:aload_0         
	//   88  174:aload_2         
	//   89  175:checkcast       #139 <Class AtomicInteger>
	//   90  178:invokevirtual   #142 <Method int AtomicInteger.get()>
	//   91  181:invokevirtual   #85  <Method void writeNumber(int)>
				return;
	//   92  184:return          
			}
			if(number instanceof AtomicLong)
	//*  93  185:aload_2         
	//*  94  186:instanceof      #144 <Class AtomicLong>
	//*  95  189:ifeq            261
			{
				writeNumber(((AtomicLong)number).get());
	//   96  192:aload_0         
	//   97  193:aload_2         
	//   98  194:checkcast       #144 <Class AtomicLong>
	//   99  197:invokevirtual   #146 <Method long AtomicLong.get()>
	//  100  200:invokevirtual   #94  <Method void writeNumber(long)>
				return;
	//  101  203:return          
			}
		} else
		{
			if(obj instanceof byte[])
	//* 102  204:aload_1         
	//* 103  205:instanceof      #148 <Class byte[]>
	//* 104  208:ifeq            223
			{
				writeBinary((byte[])(byte[])obj);
	//  105  211:aload_0         
	//  106  212:aload_1         
	//  107  213:checkcast       #148 <Class byte[]>
	//  108  216:checkcast       #148 <Class byte[]>
	//  109  219:invokevirtual   #152 <Method void writeBinary(byte[])>
				return;
	//  110  222:return          
			}
			if(obj instanceof Boolean)
	//* 111  223:aload_1         
	//* 112  224:instanceof      #154 <Class Boolean>
	//* 113  227:ifeq            242
			{
				writeBoolean(((Boolean)obj).booleanValue());
	//  114  230:aload_0         
	//  115  231:aload_1         
	//  116  232:checkcast       #154 <Class Boolean>
	//  117  235:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//  118  238:invokevirtual   #162 <Method void writeBoolean(boolean)>
				return;
	//  119  241:return          
			}
			if(obj instanceof AtomicBoolean)
	//* 120  242:aload_1         
	//* 121  243:instanceof      #164 <Class AtomicBoolean>
	//* 122  246:ifeq            261
			{
				writeBoolean(((AtomicBoolean)obj).get());
	//  123  249:aload_0         
	//  124  250:aload_1         
	//  125  251:checkcast       #164 <Class AtomicBoolean>
	//  126  254:invokevirtual   #166 <Method boolean AtomicBoolean.get()>
	//  127  257:invokevirtual   #162 <Method void writeBoolean(boolean)>
				return;
	//  128  260:return          
			}
		}
		throw new IllegalStateException((new StringBuilder()).append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ").append(obj.getClass().getName()).append(")").toString());
	//  129  261:new             #168 <Class IllegalStateException>
	//  130  264:dup             
	//  131  265:new             #33  <Class StringBuilder>
	//  132  268:dup             
	//  133  269:invokespecial   #34  <Method void StringBuilder()>
	//  134  272:ldc1            #170 <String "No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ">
	//  135  274:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  136  277:aload_1         
	//  137  278:invokevirtual   #44  <Method Class Object.getClass()>
	//  138  281:invokevirtual   #50  <Method String Class.getName()>
	//  139  284:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  140  287:ldc1            #172 <String ")">
	//  141  289:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  142  292:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  143  295:invokespecial   #173 <Method void IllegalStateException(String)>
	//  144  298:athrow          
	}

	public boolean canOmitFields()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canUseSchema(FormatSchema formatschema)
	{
		return false;
	//    0    0:iconst_0        
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

	public final JsonGenerator configure(Feature feature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
		{
			enable(feature);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #186 <Method JsonGenerator enable(JsonGenerator$Feature)>
	//    5    9:pop             
			return this;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			disable(feature);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #189 <Method JsonGenerator disable(JsonGenerator$Feature)>
	//   11   17:pop             
			return this;
	//   12   18:aload_0         
	//   13   19:areturn         
		}
	}

	public void copyCurrentEvent(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_2        
		if(jsontoken == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
			_reportError("No current event to copy");
	//    5    9:aload_0         
	//    6   10:ldc1            #199 <String "No current event to copy">
	//    7   12:invokevirtual   #201 <Method void _reportError(String)>
		switch(jsontoken.id())
	//*   8   15:aload_2         
	//*   9   16:invokevirtual   #206 <Method int JsonToken.id()>
		{
	//*  10   19:tableswitch     -1 12: default 88
	//	               -1 93
	//	               0 88
	//	               1 99
	//	               2 104
	//	               3 109
	//	               4 114
	//	               5 119
	//	               6 128
	//	               7 161
	//	               8 207
	//	               9 253
	//	               10 259
	//	               11 265
	//	               12 270
		case 0: // '\0'
		default:
			_throwInternal();
	//   11   88:aload_0         
	//   12   89:invokevirtual   #208 <Method void _throwInternal()>
			return;
	//   13   92:return          

		case -1: 
			_reportError("No current event to copy");
	//   14   93:aload_0         
	//   15   94:ldc1            #199 <String "No current event to copy">
	//   16   96:invokevirtual   #201 <Method void _reportError(String)>
			// fall through

		case 1: // '\001'
			writeStartObject();
	//   17   99:aload_0         
	//   18  100:invokevirtual   #211 <Method void writeStartObject()>
			return;
	//   19  103:return          

		case 2: // '\002'
			writeEndObject();
	//   20  104:aload_0         
	//   21  105:invokevirtual   #214 <Method void writeEndObject()>
			return;
	//   22  108:return          

		case 3: // '\003'
			writeStartArray();
	//   23  109:aload_0         
	//   24  110:invokevirtual   #217 <Method void writeStartArray()>
			return;
	//   25  113:return          

		case 4: // '\004'
			writeEndArray();
	//   26  114:aload_0         
	//   27  115:invokevirtual   #220 <Method void writeEndArray()>
			return;
	//   28  118:return          

		case 5: // '\005'
			writeFieldName(jsonparser.getCurrentName());
	//   29  119:aload_0         
	//   30  120:aload_1         
	//   31  121:invokevirtual   #223 <Method String JsonParser.getCurrentName()>
	//   32  124:invokevirtual   #226 <Method void writeFieldName(String)>
			return;
	//   33  127:return          

		case 6: // '\006'
			if(jsonparser.hasTextCharacters())
	//*  34  128:aload_1         
	//*  35  129:invokevirtual   #229 <Method boolean JsonParser.hasTextCharacters()>
	//*  36  132:ifeq            152
			{
				writeString(jsonparser.getTextCharacters(), jsonparser.getTextOffset(), jsonparser.getTextLength());
	//   37  135:aload_0         
	//   38  136:aload_1         
	//   39  137:invokevirtual   #233 <Method char[] JsonParser.getTextCharacters()>
	//   40  140:aload_1         
	//   41  141:invokevirtual   #236 <Method int JsonParser.getTextOffset()>
	//   42  144:aload_1         
	//   43  145:invokevirtual   #239 <Method int JsonParser.getTextLength()>
	//   44  148:invokevirtual   #242 <Method void writeString(char[], int, int)>
				return;
	//   45  151:return          
			} else
			{
				writeString(jsonparser.getText());
	//   46  152:aload_0         
	//   47  153:aload_1         
	//   48  154:invokevirtual   #245 <Method String JsonParser.getText()>
	//   49  157:invokevirtual   #73  <Method void writeString(String)>
				return;
	//   50  160:return          
			}

		case 7: // '\007'
			JsonParser.NumberType numbertype = jsonparser.getNumberType();
	//   51  161:aload_1         
	//   52  162:invokevirtual   #249 <Method JsonParser$NumberType JsonParser.getNumberType()>
	//   53  165:astore_2        
			if(numbertype == JsonParser.NumberType.INT)
	//*  54  166:aload_2         
	//*  55  167:getstatic       #255 <Field JsonParser$NumberType JsonParser$NumberType.INT>
	//*  56  170:if_acmpne       182
			{
				writeNumber(jsonparser.getIntValue());
	//   57  173:aload_0         
	//   58  174:aload_1         
	//   59  175:invokevirtual   #258 <Method int JsonParser.getIntValue()>
	//   60  178:invokevirtual   #85  <Method void writeNumber(int)>
				return;
	//   61  181:return          
			}
			if(numbertype == JsonParser.NumberType.BIG_INTEGER)
	//*  62  182:aload_2         
	//*  63  183:getstatic       #261 <Field JsonParser$NumberType JsonParser$NumberType.BIG_INTEGER>
	//*  64  186:if_acmpne       198
			{
				writeNumber(jsonparser.getBigIntegerValue());
	//   65  189:aload_0         
	//   66  190:aload_1         
	//   67  191:invokevirtual   #265 <Method BigInteger JsonParser.getBigIntegerValue()>
	//   68  194:invokevirtual   #132 <Method void writeNumber(BigInteger)>
				return;
	//   69  197:return          
			} else
			{
				writeNumber(jsonparser.getLongValue());
	//   70  198:aload_0         
	//   71  199:aload_1         
	//   72  200:invokevirtual   #268 <Method long JsonParser.getLongValue()>
	//   73  203:invokevirtual   #94  <Method void writeNumber(long)>
				return;
	//   74  206:return          
			}

		case 8: // '\b'
			JsonParser.NumberType numbertype1 = jsonparser.getNumberType();
	//   75  207:aload_1         
	//   76  208:invokevirtual   #249 <Method JsonParser$NumberType JsonParser.getNumberType()>
	//   77  211:astore_2        
			if(numbertype1 == JsonParser.NumberType.BIG_DECIMAL)
	//*  78  212:aload_2         
	//*  79  213:getstatic       #271 <Field JsonParser$NumberType JsonParser$NumberType.BIG_DECIMAL>
	//*  80  216:if_acmpne       228
			{
				writeNumber(jsonparser.getDecimalValue());
	//   81  219:aload_0         
	//   82  220:aload_1         
	//   83  221:invokevirtual   #275 <Method BigDecimal JsonParser.getDecimalValue()>
	//   84  224:invokevirtual   #137 <Method void writeNumber(BigDecimal)>
				return;
	//   85  227:return          
			}
			if(numbertype1 == JsonParser.NumberType.FLOAT)
	//*  86  228:aload_2         
	//*  87  229:getstatic       #278 <Field JsonParser$NumberType JsonParser$NumberType.FLOAT>
	//*  88  232:if_acmpne       244
			{
				writeNumber(jsonparser.getFloatValue());
	//   89  235:aload_0         
	//   90  236:aload_1         
	//   91  237:invokevirtual   #281 <Method float JsonParser.getFloatValue()>
	//   92  240:invokevirtual   #112 <Method void writeNumber(float)>
				return;
	//   93  243:return          
			} else
			{
				writeNumber(jsonparser.getDoubleValue());
	//   94  244:aload_0         
	//   95  245:aload_1         
	//   96  246:invokevirtual   #284 <Method double JsonParser.getDoubleValue()>
	//   97  249:invokevirtual   #103 <Method void writeNumber(double)>
				return;
	//   98  252:return          
			}

		case 9: // '\t'
			writeBoolean(true);
	//   99  253:aload_0         
	//  100  254:iconst_1        
	//  101  255:invokevirtual   #162 <Method void writeBoolean(boolean)>
			return;
	//  102  258:return          

		case 10: // '\n'
			writeBoolean(false);
	//  103  259:aload_0         
	//  104  260:iconst_0        
	//  105  261:invokevirtual   #162 <Method void writeBoolean(boolean)>
			return;
	//  106  264:return          

		case 11: // '\013'
			writeNull();
	//  107  265:aload_0         
	//  108  266:invokevirtual   #68  <Method void writeNull()>
			return;
	//  109  269:return          

		case 12: // '\f'
			writeObject(jsonparser.getEmbeddedObject());
	//  110  270:aload_0         
	//  111  271:aload_1         
	//  112  272:invokevirtual   #288 <Method Object JsonParser.getEmbeddedObject()>
	//  113  275:invokevirtual   #291 <Method void writeObject(Object)>
			return;
	//  114  278:return          
		}
	}

	public void copyCurrentStructure(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(jsontoken == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
			_reportError("No current event to copy");
	//    5   11:aload_0         
	//    6   12:ldc1            #199 <String "No current event to copy">
	//    7   14:invokevirtual   #201 <Method void _reportError(String)>
		int j = jsontoken.id();
	//    8   17:aload           4
	//    9   19:invokevirtual   #206 <Method int JsonToken.id()>
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
	//   18   32:invokevirtual   #223 <Method String JsonParser.getCurrentName()>
	//   19   35:invokevirtual   #226 <Method void writeFieldName(String)>
			i = jsonparser.nextToken().id();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #295 <Method JsonToken JsonParser.nextToken()>
	//   22   42:invokevirtual   #206 <Method int JsonToken.id()>
	//   23   45:istore_2        
		}
		switch(i)
	//*  24   46:iload_2         
		{
	//*  25   47:tableswitch     1 3: default 72
	//	               1 78
	//	               2 72
	//	               3 105
		case 2: // '\002'
		default:
			copyCurrentEvent(jsonparser);
	//   26   72:aload_0         
	//   27   73:aload_1         
	//   28   74:invokevirtual   #297 <Method void copyCurrentEvent(JsonParser)>
			return;
	//   29   77:return          

		case 1: // '\001'
			writeStartObject();
	//   30   78:aload_0         
	//   31   79:invokevirtual   #211 <Method void writeStartObject()>
			for(; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser));
	//   32   82:aload_1         
	//   33   83:invokevirtual   #295 <Method JsonToken JsonParser.nextToken()>
	//   34   86:getstatic       #301 <Field JsonToken JsonToken.END_OBJECT>
	//   35   89:if_acmpeq       100
	//   36   92:aload_0         
	//   37   93:aload_1         
	//   38   94:invokevirtual   #303 <Method void copyCurrentStructure(JsonParser)>
	//*  39   97:goto            82
			writeEndObject();
	//   40  100:aload_0         
	//   41  101:invokevirtual   #214 <Method void writeEndObject()>
			return;
	//   42  104:return          

		case 3: // '\003'
			writeStartArray();
	//   43  105:aload_0         
	//   44  106:invokevirtual   #217 <Method void writeStartArray()>
			break;
		}
		for(; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser));
	//   45  109:aload_1         
	//   46  110:invokevirtual   #295 <Method JsonToken JsonParser.nextToken()>
	//   47  113:getstatic       #306 <Field JsonToken JsonToken.END_ARRAY>
	//   48  116:if_acmpeq       127
	//   49  119:aload_0         
	//   50  120:aload_1         
	//   51  121:invokevirtual   #303 <Method void copyCurrentStructure(JsonParser)>
	//*  52  124:goto            109
		writeEndArray();
	//   53  127:aload_0         
	//   54  128:invokevirtual   #220 <Method void writeEndArray()>
	//   55  131:return          
	}

	public abstract JsonGenerator disable(Feature feature);

	public abstract JsonGenerator enable(Feature feature);

	public abstract void flush()
		throws IOException;

	public CharacterEscapes getCharacterEscapes()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract ObjectCodec getCodec();

	public Object getCurrentValue()
	{
		JsonStreamContext jsonstreamcontext = getOutputContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #316 <Method JsonStreamContext getOutputContext()>
	//    2    4:astore_1        
		if(jsonstreamcontext == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return jsonstreamcontext.getCurrentValue();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #320 <Method Object JsonStreamContext.getCurrentValue()>
	//    9   15:areturn         
	}

	public abstract int getFeatureMask();

	public int getFormatFeatures()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getHighestEscapedChar()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getOutputBuffered()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public abstract JsonStreamContext getOutputContext();

	public Object getOutputTarget()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PrettyPrinter getPrettyPrinter()
	{
		return _cfgPrettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field PrettyPrinter _cfgPrettyPrinter>
	//    2    4:areturn         
	}

	public FormatSchema getSchema()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract boolean isClosed();

	public abstract boolean isEnabled(Feature feature);

	public JsonGenerator overrideFormatFeatures(int i, int j)
	{
		throw new IllegalArgumentException((new StringBuilder()).append("No FormatFeatures defined for generator of type ").append(((Object)this).getClass().getName()).toString());
	//    0    0:new             #338 <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #34  <Method void StringBuilder()>
	//    5   11:ldc2            #340 <String "No FormatFeatures defined for generator of type ">
	//    6   14:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #44  <Method Class Object.getClass()>
	//    9   21:invokevirtual   #50  <Method String Class.getName()>
	//   10   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   12   30:invokespecial   #341 <Method void IllegalArgumentException(String)>
	//   13   33:athrow          
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		return setFeatureMask(~j & getFeatureMask() | i & j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iconst_m1       
	//    3    3:ixor            
	//    4    4:aload_0         
	//    5    5:invokevirtual   #344 <Method int getFeatureMask()>
	//    6    8:iand            
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:invokevirtual   #348 <Method JsonGenerator setFeatureMask(int)>
	//   12   16:areturn         
	}

	public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public abstract JsonGenerator setCodec(ObjectCodec objectcodec);

	public void setCurrentValue(Object obj)
	{
		JsonStreamContext jsonstreamcontext = getOutputContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #316 <Method JsonStreamContext getOutputContext()>
	//    2    4:astore_2        
		if(jsonstreamcontext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsonstreamcontext.setCurrentValue(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #355 <Method void JsonStreamContext.setCurrentValue(Object)>
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
	//    2    2:putfield        #329 <Field PrettyPrinter _cfgPrettyPrinter>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #31  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #362 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void setSchema(FormatSchema formatschema)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Generator of type ").append(((Object)this).getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
	//    0    0:new             #31  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #34  <Method void StringBuilder()>
	//    5   11:ldc2            #366 <String "Generator of type ">
	//    6   14:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #44  <Method Class Object.getClass()>
	//    9   21:invokevirtual   #50  <Method String Class.getName()>
	//   10   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc2            #368 <String " does not support schema of type '">
	//   12   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   33:aload_1         
	//   14   34:invokeinterface #373 <Method String FormatSchema.getSchemaType()>
	//   15   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   16   42:ldc2            #375 <String "'">
	//   17   45:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   48:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   19   51:invokespecial   #55  <Method void UnsupportedOperationException(String)>
	//   20   54:athrow          
	}

	public abstract JsonGenerator useDefaultPrettyPrinter();

	public abstract Version version();

	public final void writeArrayFieldStart(String s)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeStartArray();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #217 <Method void writeStartArray()>
	//    5    9:return          
	}

	public abstract int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException;

	public int writeBinary(InputStream inputstream, int i)
		throws IOException
	{
		return writeBinary(Base64Variants.getDefaultVariant(), inputstream, i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #388 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #390 <Method int writeBinary(Base64Variant, InputStream, int)>
	//    5    9:ireturn         
	}

	public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException;

	public void writeBinary(byte abyte0[])
		throws IOException
	{
		writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:invokestatic    #388 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokevirtual   #393 <Method void writeBinary(Base64Variant, byte[], int, int)>
	//    7   11:return          
	}

	public void writeBinary(byte abyte0[], int i, int j)
		throws IOException
	{
		writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:invokestatic    #388 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #393 <Method void writeBinary(Base64Variant, byte[], int, int)>
	//    6   10:return          
	}

	public final void writeBinaryField(String s, byte abyte0[])
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeBinary(abyte0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #152 <Method void writeBinary(byte[])>
	//    6   10:return          
	}

	public abstract void writeBoolean(boolean flag)
		throws IOException;

	public final void writeBooleanField(String s, boolean flag)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeBoolean(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #162 <Method void writeBoolean(boolean)>
	//    6   10:return          
	}

	public abstract void writeEndArray()
		throws IOException;

	public abstract void writeEndObject()
		throws IOException;

	public abstract void writeFieldName(SerializableString serializablestring)
		throws IOException;

	public abstract void writeFieldName(String s)
		throws IOException;

	public abstract void writeNull()
		throws IOException;

	public final void writeNullField(String s)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNull();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #68  <Method void writeNull()>
	//    5    9:return          
	}

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
	//    2    2:invokevirtual   #85  <Method void writeNumber(int)>
	//    3    5:return          
	}

	public final void writeNumberField(String s, double d)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNumber(d);
	//    3    5:aload_0         
	//    4    6:dload_2         
	//    5    7:invokevirtual   #103 <Method void writeNumber(double)>
	//    6   10:return          
	}

	public final void writeNumberField(String s, float f)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNumber(f);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #112 <Method void writeNumber(float)>
	//    6   10:return          
	}

	public final void writeNumberField(String s, int i)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNumber(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #85  <Method void writeNumber(int)>
	//    6   10:return          
	}

	public final void writeNumberField(String s, long l)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNumber(l);
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:invokevirtual   #94  <Method void writeNumber(long)>
	//    6   10:return          
	}

	public final void writeNumberField(String s, BigDecimal bigdecimal)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeNumber(bigdecimal);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #137 <Method void writeNumber(BigDecimal)>
	//    6   10:return          
	}

	public abstract void writeObject(Object obj)
		throws IOException;

	public final void writeObjectField(String s, Object obj)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeObject(obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #291 <Method void writeObject(Object)>
	//    6   10:return          
	}

	public final void writeObjectFieldStart(String s)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeStartObject();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #211 <Method void writeStartObject()>
	//    5    9:return          
	}

	public void writeObjectId(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Object Ids", this);
	//    0    0:new             #24  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #412 <String "No native support for writing Object Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #27  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5   11:athrow          
	}

	public void writeObjectRef(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Object Ids", this);
	//    0    0:new             #24  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #412 <String "No native support for writing Object Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #27  <Method void JsonGenerationException(String, JsonGenerator)>
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
	//    2    2:invokeinterface #421 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #423 <Method void writeRaw(String)>
	//    4   10:return          
	}

	public abstract void writeRaw(String s)
		throws IOException;

	public abstract void writeRaw(String s, int i, int j)
		throws IOException;

	public abstract void writeRaw(char ac[], int i, int j)
		throws IOException;

	public abstract void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException;

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		writeRawValue(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #421 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #428 <Method void writeRawValue(String)>
	//    4   10:return          
	}

	public abstract void writeRawValue(String s)
		throws IOException;

	public abstract void writeRawValue(String s, int i, int j)
		throws IOException;

	public abstract void writeRawValue(char ac[], int i, int j)
		throws IOException;

	public abstract void writeStartArray()
		throws IOException;

	public void writeStartArray(int i)
		throws IOException
	{
		writeStartArray();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method void writeStartArray()>
	//    2    4:return          
	}

	public abstract void writeStartObject()
		throws IOException;

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
	//    2    2:invokevirtual   #226 <Method void writeFieldName(String)>
		writeString(s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #73  <Method void writeString(String)>
	//    6   10:return          
	}

	public abstract void writeTree(TreeNode treenode)
		throws IOException;

	public void writeTypeId(Object obj)
		throws IOException
	{
		throw new JsonGenerationException("No native support for writing Type Ids", this);
	//    0    0:new             #24  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:ldc2            #435 <String "No native support for writing Type Ids">
	//    3    7:aload_0         
	//    4    8:invokespecial   #27  <Method void JsonGenerationException(String, JsonGenerator)>
	//    5   11:athrow          
	}

	public abstract void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException;

	protected PrettyPrinter _cfgPrettyPrinter;
}
