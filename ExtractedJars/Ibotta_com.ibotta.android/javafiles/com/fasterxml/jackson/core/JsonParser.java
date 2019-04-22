// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonParseException, Base64Variants, JsonToken, 
//			ObjectCodec, JsonStreamContext, FormatSchema, Base64Variant, 
//			JsonLocation, Version

public abstract class JsonParser
	implements Versioned, Closeable
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			Feature afeature[] = values();
		//    0    0:invokestatic    #98  <Method JsonParser$Feature[] values()>
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
		//*  19   28:invokevirtual   #102 <Method boolean enabledByDefault()>
		//*  20   31:ifeq            42
					k = j | feature.getMask();
		//   21   34:iload_1         
		//   22   35:aload           5
		//   23   37:invokevirtual   #105 <Method int getMask()>
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
			return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$Feature, s);
		//    0    0:ldc1            #2   <Class JsonParser$Feature>
		//    1    2:aload_0         
		//    2    3:invokestatic    #110 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonParser$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #79  <Field JsonParser$Feature[] $VALUES>
		//    1    3:invokevirtual   #115 <Method Object _5B_Lcom.fasterxml.jackson.core.JsonParser$Feature_3B_.clone()>
		//    2    6:checkcast       #111 <Class JsonParser$Feature[]>
		//    3    9:areturn         
		}

		public boolean enabledByDefault()
		{
			return _defaultState;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field boolean _defaultState>
		//    2    4:ireturn         
		}

		public boolean enabledIn(int i)
		{
			return (i & _mask) != 0;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #89  <Field int _mask>
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
		//    1    1:getfield        #89  <Field int _mask>
		//    2    4:ireturn         
		}

		private static final Feature $VALUES[];
		public static final Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
		public static final Feature ALLOW_COMMENTS;
		public static final Feature ALLOW_MISSING_VALUES;
		public static final Feature ALLOW_NON_NUMERIC_NUMBERS;
		public static final Feature ALLOW_NUMERIC_LEADING_ZEROS;
		public static final Feature ALLOW_SINGLE_QUOTES;
		public static final Feature ALLOW_TRAILING_COMMA;
		public static final Feature ALLOW_UNQUOTED_CONTROL_CHARS;
		public static final Feature ALLOW_UNQUOTED_FIELD_NAMES;
		public static final Feature ALLOW_YAML_COMMENTS;
		public static final Feature AUTO_CLOSE_SOURCE;
		public static final Feature IGNORE_UNDEFINED;
		public static final Feature INCLUDE_SOURCE_IN_LOCATION;
		public static final Feature STRICT_DUPLICATE_DETECTION;
		private final boolean _defaultState;
		private final int _mask = 1 << ordinal();

		static 
		{
			AUTO_CLOSE_SOURCE = new Feature("AUTO_CLOSE_SOURCE", 0, true);
		//    0    0:new             #2   <Class JsonParser$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "AUTO_CLOSE_SOURCE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//    6   11:putstatic       #38  <Field JsonParser$Feature AUTO_CLOSE_SOURCE>
			ALLOW_COMMENTS = new Feature("ALLOW_COMMENTS", 1, false);
		//    7   14:new             #2   <Class JsonParser$Feature>
		//    8   17:dup             
		//    9   18:ldc1            #39  <String "ALLOW_COMMENTS">
		//   10   20:iconst_1        
		//   11   21:iconst_0        
		//   12   22:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   13   25:putstatic       #41  <Field JsonParser$Feature ALLOW_COMMENTS>
			ALLOW_YAML_COMMENTS = new Feature("ALLOW_YAML_COMMENTS", 2, false);
		//   14   28:new             #2   <Class JsonParser$Feature>
		//   15   31:dup             
		//   16   32:ldc1            #42  <String "ALLOW_YAML_COMMENTS">
		//   17   34:iconst_2        
		//   18   35:iconst_0        
		//   19   36:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   20   39:putstatic       #44  <Field JsonParser$Feature ALLOW_YAML_COMMENTS>
			ALLOW_UNQUOTED_FIELD_NAMES = new Feature("ALLOW_UNQUOTED_FIELD_NAMES", 3, false);
		//   21   42:new             #2   <Class JsonParser$Feature>
		//   22   45:dup             
		//   23   46:ldc1            #45  <String "ALLOW_UNQUOTED_FIELD_NAMES">
		//   24   48:iconst_3        
		//   25   49:iconst_0        
		//   26   50:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   27   53:putstatic       #47  <Field JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES>
			ALLOW_SINGLE_QUOTES = new Feature("ALLOW_SINGLE_QUOTES", 4, false);
		//   28   56:new             #2   <Class JsonParser$Feature>
		//   29   59:dup             
		//   30   60:ldc1            #48  <String "ALLOW_SINGLE_QUOTES">
		//   31   62:iconst_4        
		//   32   63:iconst_0        
		//   33   64:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   34   67:putstatic       #50  <Field JsonParser$Feature ALLOW_SINGLE_QUOTES>
			ALLOW_UNQUOTED_CONTROL_CHARS = new Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 5, false);
		//   35   70:new             #2   <Class JsonParser$Feature>
		//   36   73:dup             
		//   37   74:ldc1            #51  <String "ALLOW_UNQUOTED_CONTROL_CHARS">
		//   38   76:iconst_5        
		//   39   77:iconst_0        
		//   40   78:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   41   81:putstatic       #53  <Field JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS>
			ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER = new Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 6, false);
		//   42   84:new             #2   <Class JsonParser$Feature>
		//   43   87:dup             
		//   44   88:ldc1            #54  <String "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER">
		//   45   90:bipush          6
		//   46   92:iconst_0        
		//   47   93:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   48   96:putstatic       #56  <Field JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
			ALLOW_NUMERIC_LEADING_ZEROS = new Feature("ALLOW_NUMERIC_LEADING_ZEROS", 7, false);
		//   49   99:new             #2   <Class JsonParser$Feature>
		//   50  102:dup             
		//   51  103:ldc1            #57  <String "ALLOW_NUMERIC_LEADING_ZEROS">
		//   52  105:bipush          7
		//   53  107:iconst_0        
		//   54  108:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   55  111:putstatic       #59  <Field JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS>
			ALLOW_NON_NUMERIC_NUMBERS = new Feature("ALLOW_NON_NUMERIC_NUMBERS", 8, false);
		//   56  114:new             #2   <Class JsonParser$Feature>
		//   57  117:dup             
		//   58  118:ldc1            #60  <String "ALLOW_NON_NUMERIC_NUMBERS">
		//   59  120:bipush          8
		//   60  122:iconst_0        
		//   61  123:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   62  126:putstatic       #62  <Field JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS>
			ALLOW_MISSING_VALUES = new Feature("ALLOW_MISSING_VALUES", 9, false);
		//   63  129:new             #2   <Class JsonParser$Feature>
		//   64  132:dup             
		//   65  133:ldc1            #63  <String "ALLOW_MISSING_VALUES">
		//   66  135:bipush          9
		//   67  137:iconst_0        
		//   68  138:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   69  141:putstatic       #65  <Field JsonParser$Feature ALLOW_MISSING_VALUES>
			ALLOW_TRAILING_COMMA = new Feature("ALLOW_TRAILING_COMMA", 10, false);
		//   70  144:new             #2   <Class JsonParser$Feature>
		//   71  147:dup             
		//   72  148:ldc1            #66  <String "ALLOW_TRAILING_COMMA">
		//   73  150:bipush          10
		//   74  152:iconst_0        
		//   75  153:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   76  156:putstatic       #68  <Field JsonParser$Feature ALLOW_TRAILING_COMMA>
			STRICT_DUPLICATE_DETECTION = new Feature("STRICT_DUPLICATE_DETECTION", 11, false);
		//   77  159:new             #2   <Class JsonParser$Feature>
		//   78  162:dup             
		//   79  163:ldc1            #69  <String "STRICT_DUPLICATE_DETECTION">
		//   80  165:bipush          11
		//   81  167:iconst_0        
		//   82  168:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   83  171:putstatic       #71  <Field JsonParser$Feature STRICT_DUPLICATE_DETECTION>
			IGNORE_UNDEFINED = new Feature("IGNORE_UNDEFINED", 12, false);
		//   84  174:new             #2   <Class JsonParser$Feature>
		//   85  177:dup             
		//   86  178:ldc1            #72  <String "IGNORE_UNDEFINED">
		//   87  180:bipush          12
		//   88  182:iconst_0        
		//   89  183:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   90  186:putstatic       #74  <Field JsonParser$Feature IGNORE_UNDEFINED>
			INCLUDE_SOURCE_IN_LOCATION = new Feature("INCLUDE_SOURCE_IN_LOCATION", 13, true);
		//   91  189:new             #2   <Class JsonParser$Feature>
		//   92  192:dup             
		//   93  193:ldc1            #75  <String "INCLUDE_SOURCE_IN_LOCATION">
		//   94  195:bipush          13
		//   95  197:iconst_1        
		//   96  198:invokespecial   #36  <Method void JsonParser$Feature(String, int, boolean)>
		//   97  201:putstatic       #77  <Field JsonParser$Feature INCLUDE_SOURCE_IN_LOCATION>
			$VALUES = (new Feature[] {
				AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_NON_NUMERIC_NUMBERS, ALLOW_MISSING_VALUES, 
				ALLOW_TRAILING_COMMA, STRICT_DUPLICATE_DETECTION, IGNORE_UNDEFINED, INCLUDE_SOURCE_IN_LOCATION
			});
		//   98  204:bipush          14
		//   99  206:anewarray       Feature[]
		//  100  209:dup             
		//  101  210:iconst_0        
		//  102  211:getstatic       #38  <Field JsonParser$Feature AUTO_CLOSE_SOURCE>
		//  103  214:aastore         
		//  104  215:dup             
		//  105  216:iconst_1        
		//  106  217:getstatic       #41  <Field JsonParser$Feature ALLOW_COMMENTS>
		//  107  220:aastore         
		//  108  221:dup             
		//  109  222:iconst_2        
		//  110  223:getstatic       #44  <Field JsonParser$Feature ALLOW_YAML_COMMENTS>
		//  111  226:aastore         
		//  112  227:dup             
		//  113  228:iconst_3        
		//  114  229:getstatic       #47  <Field JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES>
		//  115  232:aastore         
		//  116  233:dup             
		//  117  234:iconst_4        
		//  118  235:getstatic       #50  <Field JsonParser$Feature ALLOW_SINGLE_QUOTES>
		//  119  238:aastore         
		//  120  239:dup             
		//  121  240:iconst_5        
		//  122  241:getstatic       #53  <Field JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS>
		//  123  244:aastore         
		//  124  245:dup             
		//  125  246:bipush          6
		//  126  248:getstatic       #56  <Field JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
		//  127  251:aastore         
		//  128  252:dup             
		//  129  253:bipush          7
		//  130  255:getstatic       #59  <Field JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS>
		//  131  258:aastore         
		//  132  259:dup             
		//  133  260:bipush          8
		//  134  262:getstatic       #62  <Field JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS>
		//  135  265:aastore         
		//  136  266:dup             
		//  137  267:bipush          9
		//  138  269:getstatic       #65  <Field JsonParser$Feature ALLOW_MISSING_VALUES>
		//  139  272:aastore         
		//  140  273:dup             
		//  141  274:bipush          10
		//  142  276:getstatic       #68  <Field JsonParser$Feature ALLOW_TRAILING_COMMA>
		//  143  279:aastore         
		//  144  280:dup             
		//  145  281:bipush          11
		//  146  283:getstatic       #71  <Field JsonParser$Feature STRICT_DUPLICATE_DETECTION>
		//  147  286:aastore         
		//  148  287:dup             
		//  149  288:bipush          12
		//  150  290:getstatic       #74  <Field JsonParser$Feature IGNORE_UNDEFINED>
		//  151  293:aastore         
		//  152  294:dup             
		//  153  295:bipush          13
		//  154  297:getstatic       #77  <Field JsonParser$Feature INCLUDE_SOURCE_IN_LOCATION>
		//  155  300:aastore         
		//  156  301:putstatic       #79  <Field JsonParser$Feature[] $VALUES>
		//* 157  304:return          
		}

		private Feature(String s, int i, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #83  <Method void Enum(String, int)>
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:aload_0         
		//    7    9:invokevirtual   #87  <Method int ordinal()>
		//    8   12:ishl            
		//    9   13:putfield        #89  <Field int _mask>
			_defaultState = flag;
		//   10   16:aload_0         
		//   11   17:iload_3         
		//   12   18:putfield        #91  <Field boolean _defaultState>
		//   13   21:return          
		}
	}

	public static final class NumberType extends Enum
	{

		public static NumberType valueOf(String s)
		{
			return (NumberType)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$NumberType, s);
		//    0    0:ldc1            #2   <Class JsonParser$NumberType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonParser$NumberType>
		//    4    9:areturn         
		}

		public static NumberType[] values()
		{
			return (NumberType[])((NumberType []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field JsonParser$NumberType[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonParser$NumberType_3B_.clone()>
		//    2    6:checkcast       #54  <Class JsonParser$NumberType[]>
		//    3    9:areturn         
		}

		private static final NumberType $VALUES[];
		public static final NumberType BIG_DECIMAL;
		public static final NumberType BIG_INTEGER;
		public static final NumberType DOUBLE;
		public static final NumberType FLOAT;
		public static final NumberType INT;
		public static final NumberType LONG;

		static 
		{
			INT = new NumberType("INT", 0);
		//    0    0:new             #2   <Class JsonParser$NumberType>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "INT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//    5   10:putstatic       #26  <Field JsonParser$NumberType INT>
			LONG = new NumberType("LONG", 1);
		//    6   13:new             #2   <Class JsonParser$NumberType>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "LONG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//   11   23:putstatic       #29  <Field JsonParser$NumberType LONG>
			BIG_INTEGER = new NumberType("BIG_INTEGER", 2);
		//   12   26:new             #2   <Class JsonParser$NumberType>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "BIG_INTEGER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//   17   36:putstatic       #32  <Field JsonParser$NumberType BIG_INTEGER>
			FLOAT = new NumberType("FLOAT", 3);
		//   18   39:new             #2   <Class JsonParser$NumberType>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "FLOAT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//   23   49:putstatic       #35  <Field JsonParser$NumberType FLOAT>
			DOUBLE = new NumberType("DOUBLE", 4);
		//   24   52:new             #2   <Class JsonParser$NumberType>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "DOUBLE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//   29   62:putstatic       #38  <Field JsonParser$NumberType DOUBLE>
			BIG_DECIMAL = new NumberType("BIG_DECIMAL", 5);
		//   30   65:new             #2   <Class JsonParser$NumberType>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "BIG_DECIMAL">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
		//   35   75:putstatic       #41  <Field JsonParser$NumberType BIG_DECIMAL>
			$VALUES = (new NumberType[] {
				INT, LONG, BIG_INTEGER, FLOAT, DOUBLE, BIG_DECIMAL
			});
		//   36   78:bipush          6
		//   37   80:anewarray       NumberType[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field JsonParser$NumberType INT>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field JsonParser$NumberType LONG>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field JsonParser$NumberType BIG_INTEGER>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field JsonParser$NumberType FLOAT>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field JsonParser$NumberType DOUBLE>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field JsonParser$NumberType BIG_DECIMAL>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field JsonParser$NumberType[] $VALUES>
		//*  63  122:return          
		}

		private NumberType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	protected JsonParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	protected JsonParser(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_features = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int _features>
	//    5    9:return          
	}

	protected ObjectCodec _codec()
	{
		ObjectCodec objectcodec = getCodec();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method ObjectCodec getCodec()>
	//    2    4:astore_1        
		if(objectcodec != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return objectcodec;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
	//    7   11:new             #33  <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc1            #35  <String "No ObjectCodec defined for parser, needed for deserialization">
	//   10   17:invokespecial   #38  <Method void IllegalStateException(String)>
	//   11   20:athrow          
	}

	protected JsonParseException _constructError(String s)
	{
		return (new JsonParseException(this, s)).withRequestPayload(_requestPayload);
	//    0    0:new             #42  <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #45  <Method void JsonParseException(JsonParser, String)>
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field RequestPayload _requestPayload>
	//    7   13:invokevirtual   #51  <Method JsonParseException JsonParseException.withRequestPayload(RequestPayload)>
	//    8   16:areturn         
	}

	protected void _reportUnsupportedOperation()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Operation not supported by parser of type ");
	//    4    8:aload_1         
	//    5    9:ldc1            #57  <String "Operation not supported by parser of type ">
	//    6   11:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #65  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #71  <Method String Class.getName()>
	//   12   23:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   14   27:new             #73  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #77  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public boolean canReadObjectId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canReadTypeId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void clearCurrentToken();

	public abstract void close()
		throws IOException;

	public JsonToken currentToken()
	{
		return getCurrentToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method JsonToken getCurrentToken()>
	//    2    4:areturn         
	}

	public JsonParser enable(Feature feature)
	{
		int i = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int _features>
	//    2    4:istore_2        
		_features = feature.getMask() | i;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #95  <Method int JsonParser$Feature.getMask()>
	//    6   10:iload_2         
	//    7   11:ior             
	//    8   12:putfield        #26  <Field int _features>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public abstract BigInteger getBigIntegerValue()
		throws IOException;

	public byte[] getBinaryValue()
		throws IOException
	{
		return getBinaryValue(Base64Variants.getDefaultVariant());
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:invokevirtual   #108 <Method byte[] getBinaryValue(Base64Variant)>
	//    3    7:areturn         
	}

	public abstract byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException;

	public byte getByteValue()
		throws IOException
	{
		int i = getIntValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int getIntValue()>
	//    2    4:istore_1        
		if(i >= -128 && i <= 255)
	//*   3    5:iload_1         
	//*   4    6:bipush          -128
	//*   5    8:icmplt          21
	//*   6   11:iload_1         
	//*   7   12:sipush          255
	//*   8   15:icmpgt          21
		{
			return (byte)i;
	//    9   18:iload_1         
	//   10   19:int2byte        
	//   11   20:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   21:new             #54  <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #55  <Method void StringBuilder()>
	//   15   28:astore_2        
			stringbuilder.append("Numeric value (");
	//   16   29:aload_2         
	//   17   30:ldc1            #116 <String "Numeric value (">
	//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			stringbuilder.append(getText());
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #119 <Method String getText()>
	//   23   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			stringbuilder.append(") out of range of Java byte");
	//   25   45:aload_2         
	//   26   46:ldc1            #121 <String ") out of range of Java byte">
	//   27   48:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   28   51:pop             
			throw _constructError(stringbuilder.toString());
	//   29   52:aload_0         
	//   30   53:aload_2         
	//   31   54:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   32   57:invokevirtual   #123 <Method JsonParseException _constructError(String)>
	//   33   60:athrow          
		}
	}

	public abstract ObjectCodec getCodec();

	public abstract JsonLocation getCurrentLocation();

	public abstract String getCurrentName()
		throws IOException;

	public abstract JsonToken getCurrentToken();

	public abstract int getCurrentTokenId();

	public abstract BigDecimal getDecimalValue()
		throws IOException;

	public abstract double getDoubleValue()
		throws IOException;

	public Object getEmbeddedObject()
		throws IOException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract float getFloatValue()
		throws IOException;

	public abstract int getIntValue()
		throws IOException;

	public abstract long getLongValue()
		throws IOException;

	public abstract NumberType getNumberType()
		throws IOException;

	public abstract Number getNumberValue()
		throws IOException;

	public Object getObjectId()
		throws IOException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract JsonStreamContext getParsingContext();

	public short getShortValue()
		throws IOException
	{
		int i = getIntValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int getIntValue()>
	//    2    4:istore_1        
		if(i >= -32768 && i <= 32767)
	//*   3    5:iload_1         
	//*   4    6:sipush          -32768
	//*   5    9:icmplt          22
	//*   6   12:iload_1         
	//*   7   13:sipush          32767
	//*   8   16:icmpgt          22
		{
			return (short)i;
	//    9   19:iload_1         
	//   10   20:int2short       
	//   11   21:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #54  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #55  <Method void StringBuilder()>
	//   15   29:astore_2        
			stringbuilder.append("Numeric value (");
	//   16   30:aload_2         
	//   17   31:ldc1            #116 <String "Numeric value (">
	//   18   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			stringbuilder.append(getText());
	//   20   37:aload_2         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #119 <Method String getText()>
	//   23   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(") out of range of Java short");
	//   25   46:aload_2         
	//   26   47:ldc1            #148 <String ") out of range of Java short">
	//   27   49:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			throw _constructError(stringbuilder.toString());
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   32   58:invokevirtual   #123 <Method JsonParseException _constructError(String)>
	//   33   61:athrow          
		}
	}

	public abstract String getText()
		throws IOException;

	public abstract char[] getTextCharacters()
		throws IOException;

	public abstract int getTextLength()
		throws IOException;

	public abstract int getTextOffset()
		throws IOException;

	public abstract JsonLocation getTokenLocation();

	public Object getTypeId()
		throws IOException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return getValueAsInt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #158 <Method int getValueAsInt(int)>
	//    3    5:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return i;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return getValueAsLong(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokevirtual   #162 <Method long getValueAsLong(long)>
	//    3    5:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return getValueAsString(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #166 <Method String getValueAsString(String)>
	//    3    5:areturn         
	}

	public abstract String getValueAsString(String s)
		throws IOException;

	public abstract boolean hasCurrentToken();

	public abstract boolean hasTextCharacters();

	public abstract boolean hasToken(JsonToken jsontoken);

	public abstract boolean hasTokenId(int i);

	public boolean isEnabled(Feature feature)
	{
		return feature.enabledIn(_features);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int _features>
	//    3    5:invokevirtual   #177 <Method boolean JsonParser$Feature.enabledIn(int)>
	//    4    8:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return currentToken() == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method JsonToken currentToken()>
	//    2    4:getstatic       #186 <Field JsonToken JsonToken.START_ARRAY>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isExpectedStartObjectToken()
	{
		return currentToken() == JsonToken.START_OBJECT;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method JsonToken currentToken()>
	//    2    4:getstatic       #190 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isNaN()
		throws IOException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String nextFieldName()
		throws IOException
	{
		if(nextToken() == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #195 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #198 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return getCurrentName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #200 <Method String getCurrentName()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String nextTextValue()
		throws IOException
	{
		if(nextToken() == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #195 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #204 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #119 <Method String getText()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public abstract JsonToken nextToken()
		throws IOException;

	public abstract JsonToken nextValue()
		throws IOException;

	public JsonParser overrideFormatFeatures(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("No FormatFeatures defined for parser of type ");
	//    4    8:aload_3         
	//    5    9:ldc1            #209 <String "No FormatFeatures defined for parser of type ">
	//    6   11:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #65  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #71  <Method String Class.getName()>
	//   12   23:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   14   27:new             #211 <Class IllegalArgumentException>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   19   38:athrow          
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		return setFeatureMask(i & j | _features & j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #26  <Field int _features>
	//    6    8:iload_2         
	//    7    9:iand            
	//    8   10:ior             
	//    9   11:invokevirtual   #217 <Method JsonParser setFeatureMask(int)>
	//   10   14:areturn         
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method void _reportUnsupportedOperation()>
		return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	}

	public Object readValueAs(Class class1)
		throws IOException
	{
		return _codec().readValue(this, class1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #231 <Method Object ObjectCodec.readValue(JsonParser, Class)>
	//    5    9:areturn         
	}

	public boolean requiresCustomCodec()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCurrentValue(Object obj)
	{
		JsonStreamContext jsonstreamcontext = getParsingContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method JsonStreamContext getParsingContext()>
	//    2    4:astore_2        
		if(jsonstreamcontext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsonstreamcontext.setCurrentValue(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #242 <Method void JsonStreamContext.setCurrentValue(Object)>
	//    8   14:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		_features = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int _features>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setSchema(FormatSchema formatschema)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Parser of type ");
	//    4    8:aload_2         
	//    5    9:ldc1            #248 <String "Parser of type ">
	//    6   11:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #65  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #71  <Method String Class.getName()>
	//   12   23:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" does not support schema of type '");
	//   14   27:aload_2         
	//   15   28:ldc1            #250 <String " does not support schema of type '">
	//   16   30:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(formatschema.getSchemaType());
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokeinterface #255 <Method String FormatSchema.getSchemaType()>
	//   21   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append("'");
	//   23   45:aload_2         
	//   24   46:ldc2            #257 <String "'">
	//   25   49:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   27   53:new             #73  <Class UnsupportedOperationException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #77  <Method void UnsupportedOperationException(String)>
	//   32   64:athrow          
	}

	public abstract JsonParser skipChildren()
		throws IOException;

	public abstract Version version();

	protected int _features;
	protected transient RequestPayload _requestPayload;
}
