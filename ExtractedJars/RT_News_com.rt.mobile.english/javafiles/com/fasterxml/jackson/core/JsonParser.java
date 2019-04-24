// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonParseException, Base64Variants, JsonToken, 
//			JsonStreamContext, SerializableString, ObjectCodec, FormatSchema, 
//			Base64Variant, JsonLocation, TreeNode, Version

public abstract class JsonParser
	implements Closeable, Versioned
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			Feature afeature[] = values();
		//    0    0:invokestatic    #90  <Method JsonParser$Feature[] values()>
		//    1    3:astore          4
			int i = 0;
		//    2    5:iconst_0        
		//    3    6:istore_0        
			int l = afeature.length;
		//    4    7:aload           4
		//    5    9:arraylength     
		//    6   10:istore_3        
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
		//*  19   28:invokevirtual   #94  <Method boolean enabledByDefault()>
		//*  20   31:ifeq            42
					k = j | feature.getMask();
		//   21   34:iload_1         
		//   22   35:aload           5
		//   23   37:invokevirtual   #97  <Method int getMask()>
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
		//    2    3:invokestatic    #102 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonParser$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #71  <Field JsonParser$Feature[] $VALUES>
		//    1    3:invokevirtual   #107 <Method Object _5B_Lcom.fasterxml.jackson.core.JsonParser$Feature_3B_.clone()>
		//    2    6:checkcast       #103 <Class JsonParser$Feature[]>
		//    3    9:areturn         
		}

		public boolean enabledByDefault()
		{
			return _defaultState;
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field boolean _defaultState>
		//    2    4:ireturn         
		}

		public boolean enabledIn(int i)
		{
			return (i & _mask) != 0;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #81  <Field int _mask>
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
		//    1    1:getfield        #81  <Field int _mask>
		//    2    4:ireturn         
		}

		private static final Feature $VALUES[];
		public static final Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
		public static final Feature ALLOW_COMMENTS;
		public static final Feature ALLOW_MISSING_VALUES;
		public static final Feature ALLOW_NON_NUMERIC_NUMBERS;
		public static final Feature ALLOW_NUMERIC_LEADING_ZEROS;
		public static final Feature ALLOW_SINGLE_QUOTES;
		public static final Feature ALLOW_UNQUOTED_CONTROL_CHARS;
		public static final Feature ALLOW_UNQUOTED_FIELD_NAMES;
		public static final Feature ALLOW_YAML_COMMENTS;
		public static final Feature AUTO_CLOSE_SOURCE;
		public static final Feature IGNORE_UNDEFINED;
		public static final Feature STRICT_DUPLICATE_DETECTION;
		private final boolean _defaultState;
		private final int _mask = 1 << ordinal();

		static 
		{
			AUTO_CLOSE_SOURCE = new Feature("AUTO_CLOSE_SOURCE", 0, true);
		//    0    0:new             #2   <Class JsonParser$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "AUTO_CLOSE_SOURCE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//    6   11:putstatic       #36  <Field JsonParser$Feature AUTO_CLOSE_SOURCE>
			ALLOW_COMMENTS = new Feature("ALLOW_COMMENTS", 1, false);
		//    7   14:new             #2   <Class JsonParser$Feature>
		//    8   17:dup             
		//    9   18:ldc1            #37  <String "ALLOW_COMMENTS">
		//   10   20:iconst_1        
		//   11   21:iconst_0        
		//   12   22:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   13   25:putstatic       #39  <Field JsonParser$Feature ALLOW_COMMENTS>
			ALLOW_YAML_COMMENTS = new Feature("ALLOW_YAML_COMMENTS", 2, false);
		//   14   28:new             #2   <Class JsonParser$Feature>
		//   15   31:dup             
		//   16   32:ldc1            #40  <String "ALLOW_YAML_COMMENTS">
		//   17   34:iconst_2        
		//   18   35:iconst_0        
		//   19   36:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   20   39:putstatic       #42  <Field JsonParser$Feature ALLOW_YAML_COMMENTS>
			ALLOW_UNQUOTED_FIELD_NAMES = new Feature("ALLOW_UNQUOTED_FIELD_NAMES", 3, false);
		//   21   42:new             #2   <Class JsonParser$Feature>
		//   22   45:dup             
		//   23   46:ldc1            #43  <String "ALLOW_UNQUOTED_FIELD_NAMES">
		//   24   48:iconst_3        
		//   25   49:iconst_0        
		//   26   50:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   27   53:putstatic       #45  <Field JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES>
			ALLOW_SINGLE_QUOTES = new Feature("ALLOW_SINGLE_QUOTES", 4, false);
		//   28   56:new             #2   <Class JsonParser$Feature>
		//   29   59:dup             
		//   30   60:ldc1            #46  <String "ALLOW_SINGLE_QUOTES">
		//   31   62:iconst_4        
		//   32   63:iconst_0        
		//   33   64:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   34   67:putstatic       #48  <Field JsonParser$Feature ALLOW_SINGLE_QUOTES>
			ALLOW_UNQUOTED_CONTROL_CHARS = new Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 5, false);
		//   35   70:new             #2   <Class JsonParser$Feature>
		//   36   73:dup             
		//   37   74:ldc1            #49  <String "ALLOW_UNQUOTED_CONTROL_CHARS">
		//   38   76:iconst_5        
		//   39   77:iconst_0        
		//   40   78:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   41   81:putstatic       #51  <Field JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS>
			ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER = new Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 6, false);
		//   42   84:new             #2   <Class JsonParser$Feature>
		//   43   87:dup             
		//   44   88:ldc1            #52  <String "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER">
		//   45   90:bipush          6
		//   46   92:iconst_0        
		//   47   93:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   48   96:putstatic       #54  <Field JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
			ALLOW_NUMERIC_LEADING_ZEROS = new Feature("ALLOW_NUMERIC_LEADING_ZEROS", 7, false);
		//   49   99:new             #2   <Class JsonParser$Feature>
		//   50  102:dup             
		//   51  103:ldc1            #55  <String "ALLOW_NUMERIC_LEADING_ZEROS">
		//   52  105:bipush          7
		//   53  107:iconst_0        
		//   54  108:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   55  111:putstatic       #57  <Field JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS>
			ALLOW_NON_NUMERIC_NUMBERS = new Feature("ALLOW_NON_NUMERIC_NUMBERS", 8, false);
		//   56  114:new             #2   <Class JsonParser$Feature>
		//   57  117:dup             
		//   58  118:ldc1            #58  <String "ALLOW_NON_NUMERIC_NUMBERS">
		//   59  120:bipush          8
		//   60  122:iconst_0        
		//   61  123:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   62  126:putstatic       #60  <Field JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS>
			STRICT_DUPLICATE_DETECTION = new Feature("STRICT_DUPLICATE_DETECTION", 9, false);
		//   63  129:new             #2   <Class JsonParser$Feature>
		//   64  132:dup             
		//   65  133:ldc1            #61  <String "STRICT_DUPLICATE_DETECTION">
		//   66  135:bipush          9
		//   67  137:iconst_0        
		//   68  138:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   69  141:putstatic       #63  <Field JsonParser$Feature STRICT_DUPLICATE_DETECTION>
			IGNORE_UNDEFINED = new Feature("IGNORE_UNDEFINED", 10, false);
		//   70  144:new             #2   <Class JsonParser$Feature>
		//   71  147:dup             
		//   72  148:ldc1            #64  <String "IGNORE_UNDEFINED">
		//   73  150:bipush          10
		//   74  152:iconst_0        
		//   75  153:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   76  156:putstatic       #66  <Field JsonParser$Feature IGNORE_UNDEFINED>
			ALLOW_MISSING_VALUES = new Feature("ALLOW_MISSING_VALUES", 11, false);
		//   77  159:new             #2   <Class JsonParser$Feature>
		//   78  162:dup             
		//   79  163:ldc1            #67  <String "ALLOW_MISSING_VALUES">
		//   80  165:bipush          11
		//   81  167:iconst_0        
		//   82  168:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
		//   83  171:putstatic       #69  <Field JsonParser$Feature ALLOW_MISSING_VALUES>
			$VALUES = (new Feature[] {
				AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_NON_NUMERIC_NUMBERS, STRICT_DUPLICATE_DETECTION, 
				IGNORE_UNDEFINED, ALLOW_MISSING_VALUES
			});
		//   84  174:bipush          12
		//   85  176:anewarray       Feature[]
		//   86  179:dup             
		//   87  180:iconst_0        
		//   88  181:getstatic       #36  <Field JsonParser$Feature AUTO_CLOSE_SOURCE>
		//   89  184:aastore         
		//   90  185:dup             
		//   91  186:iconst_1        
		//   92  187:getstatic       #39  <Field JsonParser$Feature ALLOW_COMMENTS>
		//   93  190:aastore         
		//   94  191:dup             
		//   95  192:iconst_2        
		//   96  193:getstatic       #42  <Field JsonParser$Feature ALLOW_YAML_COMMENTS>
		//   97  196:aastore         
		//   98  197:dup             
		//   99  198:iconst_3        
		//  100  199:getstatic       #45  <Field JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES>
		//  101  202:aastore         
		//  102  203:dup             
		//  103  204:iconst_4        
		//  104  205:getstatic       #48  <Field JsonParser$Feature ALLOW_SINGLE_QUOTES>
		//  105  208:aastore         
		//  106  209:dup             
		//  107  210:iconst_5        
		//  108  211:getstatic       #51  <Field JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS>
		//  109  214:aastore         
		//  110  215:dup             
		//  111  216:bipush          6
		//  112  218:getstatic       #54  <Field JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
		//  113  221:aastore         
		//  114  222:dup             
		//  115  223:bipush          7
		//  116  225:getstatic       #57  <Field JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS>
		//  117  228:aastore         
		//  118  229:dup             
		//  119  230:bipush          8
		//  120  232:getstatic       #60  <Field JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS>
		//  121  235:aastore         
		//  122  236:dup             
		//  123  237:bipush          9
		//  124  239:getstatic       #63  <Field JsonParser$Feature STRICT_DUPLICATE_DETECTION>
		//  125  242:aastore         
		//  126  243:dup             
		//  127  244:bipush          10
		//  128  246:getstatic       #66  <Field JsonParser$Feature IGNORE_UNDEFINED>
		//  129  249:aastore         
		//  130  250:dup             
		//  131  251:bipush          11
		//  132  253:getstatic       #69  <Field JsonParser$Feature ALLOW_MISSING_VALUES>
		//  133  256:aastore         
		//  134  257:putstatic       #71  <Field JsonParser$Feature[] $VALUES>
		//* 135  260:return          
		}

		private Feature(String s, int i, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #75  <Method void Enum(String, int)>
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:aload_0         
		//    7    9:invokevirtual   #79  <Method int ordinal()>
		//    8   12:ishl            
		//    9   13:putfield        #81  <Field int _mask>
			_defaultState = flag;
		//   10   16:aload_0         
		//   11   17:iload_3         
		//   12   18:putfield        #83  <Field boolean _defaultState>
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
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	protected JsonParser(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		_features = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int _features>
	//    5    9:return          
	}

	protected ObjectCodec _codec()
	{
		ObjectCodec objectcodec = getCodec();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method ObjectCodec getCodec()>
	//    2    4:astore_1        
		if(objectcodec == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
	//    5    9:new             #41  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #43  <String "No ObjectCodec defined for parser, needed for deserialization">
	//    8   15:invokespecial   #46  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		else
			return objectcodec;
	//   10   19:aload_1         
	//   11   20:areturn         
	}

	protected JsonParseException _constructError(String s)
	{
		return (new JsonParseException(this, s)).withRequestPayload(_requestPayload);
	//    0    0:new             #50  <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void JsonParseException(JsonParser, String)>
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field RequestPayload _requestPayload>
	//    7   13:invokevirtual   #59  <Method JsonParseException JsonParseException.withRequestPayload(RequestPayload)>
	//    8   16:areturn         
	}

	protected void _reportUnsupportedOperation()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Operation not supported by parser of type ");
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "Operation not supported by parser of type ">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #73  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #79  <Method String Class.getName()>
	//   12   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   14   27:new             #81  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #85  <Method void UnsupportedOperationException(String)>
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

	public boolean canUseSchema(FormatSchema formatschema)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void clearCurrentToken();

	public abstract void close()
		throws IOException;

	public JsonParser configure(Feature feature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
		{
			enable(feature);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #100 <Method JsonParser enable(JsonParser$Feature)>
	//    5    9:pop             
			return this;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			disable(feature);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #103 <Method JsonParser disable(JsonParser$Feature)>
	//   11   17:pop             
			return this;
	//   12   18:aload_0         
	//   13   19:areturn         
		}
	}

	public JsonToken currentToken()
	{
		return getCurrentToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method JsonToken getCurrentToken()>
	//    2    4:areturn         
	}

	public int currentTokenId()
	{
		return getCurrentTokenId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method int getCurrentTokenId()>
	//    2    4:ireturn         
	}

	public JsonParser disable(Feature feature)
	{
		int i = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _features>
	//    2    4:istore_2        
		_features = ~feature.getMask() & i;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #116 <Method int JsonParser$Feature.getMask()>
	//    6   10:iconst_m1       
	//    7   11:ixor            
	//    8   12:iload_2         
	//    9   13:iand            
	//   10   14:putfield        #34  <Field int _features>
		return this;
	//   11   17:aload_0         
	//   12   18:areturn         
	}

	public JsonParser enable(Feature feature)
	{
		int i = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _features>
	//    2    4:istore_2        
		_features = feature.getMask() | i;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #116 <Method int JsonParser$Feature.getMask()>
	//    6   10:iload_2         
	//    7   11:ior             
	//    8   12:putfield        #34  <Field int _features>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public void finishToken()
		throws IOException
	{
	//    0    0:return          
	}

	public abstract BigInteger getBigIntegerValue()
		throws IOException;

	public byte[] getBinaryValue()
		throws IOException
	{
		return getBinaryValue(Base64Variants.getDefaultVariant());
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:invokevirtual   #131 <Method byte[] getBinaryValue(Base64Variant)>
	//    3    7:areturn         
	}

	public abstract byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException;

	public boolean getBooleanValue()
		throws IOException
	{
		JsonToken jsontoken = currentToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method JsonToken currentToken()>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #140 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5    9:if_acmpne       14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*   8   14:aload_1         
	//*   9   15:getstatic       #143 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   18:if_acmpne       23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		else
			throw (new JsonParseException(this, String.format("Current token (%s) not of boolean type", new Object[] {
				jsontoken
			}))).withRequestPayload(_requestPayload);
	//   13   23:new             #50  <Class JsonParseException>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:ldc1            #145 <String "Current token (%s) not of boolean type">
	//   17   30:iconst_1        
	//   18   31:anewarray       Object[]
	//   19   34:dup             
	//   20   35:iconst_0        
	//   21   36:aload_1         
	//   22   37:aastore         
	//   23   38:invokestatic    #151 <Method String String.format(String, Object[])>
	//   24   41:invokespecial   #53  <Method void JsonParseException(JsonParser, String)>
	//   25   44:aload_0         
	//   26   45:getfield        #55  <Field RequestPayload _requestPayload>
	//   27   48:invokevirtual   #59  <Method JsonParseException JsonParseException.withRequestPayload(RequestPayload)>
	//   28   51:athrow          
	}

	public byte getByteValue()
		throws IOException
	{
		int i = getIntValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method int getIntValue()>
	//    2    4:istore_1        
		if(i >= -128 && i <= 255)
	//*   3    5:iload_1         
	//*   4    6:bipush          -128
	//*   5    8:icmplt          24
	//*   6   11:iload_1         
	//*   7   12:sipush          255
	//*   8   15:icmple          21
	//*   9   18:goto            24
		{
			return (byte)i;
	//   10   21:iload_1         
	//   11   22:int2byte        
	//   12   23:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   24:new             #62  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #63  <Method void StringBuilder()>
	//   16   31:astore_2        
			stringbuilder.append("Numeric value (");
	//   17   32:aload_2         
	//   18   33:ldc1            #158 <String "Numeric value (">
	//   19   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(getText());
	//   21   39:aload_2         
	//   22   40:aload_0         
	//   23   41:invokevirtual   #161 <Method String getText()>
	//   24   44:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(") out of range of Java byte");
	//   26   48:aload_2         
	//   27   49:ldc1            #163 <String ") out of range of Java byte">
	//   28   51:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			throw _constructError(stringbuilder.toString());
	//   30   55:aload_0         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   33   60:invokevirtual   #165 <Method JsonParseException _constructError(String)>
	//   34   63:athrow          
		}
	}

	public abstract ObjectCodec getCodec();

	public abstract JsonLocation getCurrentLocation();

	public abstract String getCurrentName()
		throws IOException;

	public abstract JsonToken getCurrentToken();

	public abstract int getCurrentTokenId();

	public Object getCurrentValue()
	{
		JsonStreamContext jsonstreamcontext = getParsingContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method JsonStreamContext getParsingContext()>
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
	//    8   12:invokevirtual   #178 <Method Object JsonStreamContext.getCurrentValue()>
	//    9   15:areturn         
	}

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

	public int getFeatureMask()
	{
		return _features;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _features>
	//    2    4:ireturn         
	}

	public abstract float getFloatValue()
		throws IOException;

	public int getFormatFeatures()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getInputSource()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract int getIntValue()
		throws IOException;

	public abstract JsonToken getLastClearedToken();

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

	public FormatSchema getSchema()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		int i = getIntValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method int getIntValue()>
	//    2    4:istore_1        
		if(i >= -32768 && i <= 32767)
	//*   3    5:iload_1         
	//*   4    6:sipush          -32768
	//*   5    9:icmplt          25
	//*   6   12:iload_1         
	//*   7   13:sipush          32767
	//*   8   16:icmple          22
	//*   9   19:goto            25
		{
			return (short)i;
	//   10   22:iload_1         
	//   11   23:int2short       
	//   12   24:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   25:new             #62  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #63  <Method void StringBuilder()>
	//   16   32:astore_2        
			stringbuilder.append("Numeric value (");
	//   17   33:aload_2         
	//   18   34:ldc1            #158 <String "Numeric value (">
	//   19   36:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(getText());
	//   21   40:aload_2         
	//   22   41:aload_0         
	//   23   42:invokevirtual   #161 <Method String getText()>
	//   24   45:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			stringbuilder.append(") out of range of Java short");
	//   26   49:aload_2         
	//   27   50:ldc1            #202 <String ") out of range of Java short">
	//   28   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
			throw _constructError(stringbuilder.toString());
	//   30   56:aload_0         
	//   31   57:aload_2         
	//   32   58:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   33   61:invokevirtual   #165 <Method JsonParseException _constructError(String)>
	//   34   64:athrow          
		}
	}

	public int getText(Writer writer)
		throws IOException, UnsupportedOperationException
	{
		String s = getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method String getText()>
	//    2    4:astore_2        
		if(s == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
		{
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		} else
		{
			writer.write(s);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #208 <Method void Writer.write(String)>
			return s.length();
	//   10   16:aload_2         
	//   11   17:invokevirtual   #211 <Method int String.length()>
	//   12   20:ireturn         
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

	public boolean getValueAsBoolean()
		throws IOException
	{
		return getValueAsBoolean(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #221 <Method boolean getValueAsBoolean(boolean)>
	//    3    5:ireturn         
	}

	public boolean getValueAsBoolean(boolean flag)
		throws IOException
	{
		return flag;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public double getValueAsDouble()
		throws IOException
	{
		return getValueAsDouble(0.0D);
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:invokevirtual   #225 <Method double getValueAsDouble(double)>
	//    3    5:dreturn         
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		return d;
	//    0    0:dload_1         
	//    1    1:dreturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return getValueAsInt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #229 <Method int getValueAsInt(int)>
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
	//    2    2:invokevirtual   #233 <Method long getValueAsLong(long)>
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
	//    2    2:invokevirtual   #237 <Method String getValueAsString(String)>
	//    3    5:areturn         
	}

	public abstract String getValueAsString(String s)
		throws IOException;

	public abstract boolean hasCurrentToken();

	public abstract boolean hasTextCharacters();

	public abstract boolean hasToken(JsonToken jsontoken);

	public abstract boolean hasTokenId(int i);

	public abstract boolean isClosed();

	public boolean isEnabled(Feature feature)
	{
		return feature.enabledIn(_features);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int _features>
	//    3    5:invokevirtual   #249 <Method boolean JsonParser$Feature.enabledIn(int)>
	//    4    8:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return currentToken() == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method JsonToken currentToken()>
	//    2    4:getstatic       #253 <Field JsonToken JsonToken.START_ARRAY>
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
	//    1    1:invokevirtual   #134 <Method JsonToken currentToken()>
	//    2    4:getstatic       #257 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Boolean nextBooleanValue()
		throws IOException
	{
		JsonToken jsontoken = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #140 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5    9:if_acmpne       16
			return Boolean.TRUE;
	//    6   12:getstatic       #268 <Field Boolean Boolean.TRUE>
	//    7   15:areturn         
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*   8   16:aload_1         
	//*   9   17:getstatic       #143 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   20:if_acmpne       27
			return Boolean.FALSE;
	//   11   23:getstatic       #271 <Field Boolean Boolean.FALSE>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public String nextFieldName()
		throws IOException
	{
		if(nextToken() == JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #275 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:if_acmpne       15
			return getCurrentName();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #277 <Method String getCurrentName()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public boolean nextFieldName(SerializableString serializablestring)
		throws IOException
	{
		return nextToken() == JsonToken.FIELD_NAME && serializablestring.getValue().equals(((Object) (getCurrentName())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//    2    4:getstatic       #275 <Field JsonToken JsonToken.FIELD_NAME>
	//    3    7:if_acmpne       28
	//    4   10:aload_1         
	//    5   11:invokeinterface #283 <Method String SerializableString.getValue()>
	//    6   16:aload_0         
	//    7   17:invokevirtual   #277 <Method String getCurrentName()>
	//    8   20:invokevirtual   #287 <Method boolean String.equals(Object)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public int nextIntValue(int i)
		throws IOException
	{
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #291 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       15
			i = getIntValue();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #156 <Method int getIntValue()>
	//    6   14:istore_1        
		return i;
	//    7   15:iload_1         
	//    8   16:ireturn         
	}

	public long nextLongValue(long l)
		throws IOException
	{
		if(nextToken() == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #291 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       15
			l = getLongValue();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #294 <Method long getLongValue()>
	//    6   14:lstore_1        
		return l;
	//    7   15:lload_1         
	//    8   16:lreturn         
	}

	public String nextTextValue()
		throws IOException
	{
		if(nextToken() == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method JsonToken nextToken()>
	//*   2    4:getstatic       #298 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #161 <Method String getText()>
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

	public abstract void overrideCurrentName(String s);

	public JsonParser overrideFormatFeatures(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("No FormatFeatures defined for parser of type ");
	//    4    8:aload_3         
	//    5    9:ldc2            #304 <String "No FormatFeatures defined for parser of type ">
	//    6   12:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #73  <Method Class Object.getClass()>
	//   11   21:invokevirtual   #79  <Method String Class.getName()>
	//   12   24:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   14   28:new             #306 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:aload_3         
	//   17   33:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   18   36:invokespecial   #307 <Method void IllegalArgumentException(String)>
	//   19   39:athrow          
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		return setFeatureMask(i & j | _features & ~j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #34  <Field int _features>
	//    6    8:iload_2         
	//    7    9:iconst_m1       
	//    8   10:ixor            
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:invokevirtual   #312 <Method JsonParser setFeatureMask(int)>
	//   12   16:areturn         
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #316 <Method void _reportUnsupportedOperation()>
		return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	}

	public int readBinaryValue(OutputStream outputstream)
		throws IOException
	{
		return readBinaryValue(Base64Variants.getDefaultVariant(), outputstream);
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method int readBinaryValue(Base64Variant, OutputStream)>
	//    4    8:ireturn         
	}

	public Object readValueAs(TypeReference typereference)
		throws IOException
	{
		return _codec().readValue(this, typereference);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #329 <Method Object ObjectCodec.readValue(JsonParser, TypeReference)>
	//    5    9:areturn         
	}

	public Object readValueAs(Class class1)
		throws IOException
	{
		return _codec().readValue(this, class1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #335 <Method Object ObjectCodec.readValue(JsonParser, Class)>
	//    5    9:areturn         
	}

	public TreeNode readValueAsTree()
		throws IOException
	{
		return _codec().readTree(this);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #342 <Method TreeNode ObjectCodec.readTree(JsonParser)>
	//    4    8:areturn         
	}

	public Iterator readValuesAs(TypeReference typereference)
		throws IOException
	{
		return _codec().readValues(this, typereference);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #349 <Method Iterator ObjectCodec.readValues(JsonParser, TypeReference)>
	//    5    9:areturn         
	}

	public Iterator readValuesAs(Class class1)
		throws IOException
	{
		return _codec().readValues(this, class1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method ObjectCodec _codec()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #354 <Method Iterator ObjectCodec.readValues(JsonParser, Class)>
	//    5    9:areturn         
	}

	public int releaseBuffered(OutputStream outputstream)
		throws IOException
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int releaseBuffered(Writer writer)
		throws IOException
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public boolean requiresCustomCodec()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void setCodec(ObjectCodec objectcodec);

	public void setCurrentValue(Object obj)
	{
		JsonStreamContext jsonstreamcontext = getParsingContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method JsonStreamContext getParsingContext()>
	//    2    4:astore_2        
		if(jsonstreamcontext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsonstreamcontext.setCurrentValue(obj);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #363 <Method void JsonStreamContext.setCurrentValue(Object)>
	//    8   14:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		_features = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int _features>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setRequestPayloadOnError(RequestPayload requestpayload)
	{
		_requestPayload = requestpayload;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field RequestPayload _requestPayload>
	//    3    5:return          
	}

	public void setRequestPayloadOnError(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            18
			s = ((String) (new RequestPayload(((CharSequence) (s)))));
	//    5    9:new             #369 <Class RequestPayload>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #372 <Method void RequestPayload(CharSequence)>
	//    9   17:astore_1        
		_requestPayload = ((RequestPayload) (s));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #55  <Field RequestPayload _requestPayload>
	//   13   23:return          
	}

	public void setRequestPayloadOnError(byte abyte0[], String s)
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			abyte0 = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            19
			abyte0 = ((byte []) (new RequestPayload(abyte0, s)));
	//    5    9:new             #369 <Class RequestPayload>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #375 <Method void RequestPayload(byte[], String)>
	//   10   18:astore_1        
		_requestPayload = ((RequestPayload) (abyte0));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #55  <Field RequestPayload _requestPayload>
	//   14   24:return          
	}

	public void setSchema(FormatSchema formatschema)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Parser of type ");
	//    4    8:aload_2         
	//    5    9:ldc2            #379 <String "Parser of type ">
	//    6   12:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #73  <Method Class Object.getClass()>
	//   11   21:invokevirtual   #79  <Method String Class.getName()>
	//   12   24:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" does not support schema of type '");
	//   14   28:aload_2         
	//   15   29:ldc2            #381 <String " does not support schema of type '">
	//   16   32:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(formatschema.getSchemaType());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokeinterface #386 <Method String FormatSchema.getSchemaType()>
	//   21   43:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append("'");
	//   23   47:aload_2         
	//   24   48:ldc2            #388 <String "'">
	//   25   51:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   27   55:new             #81  <Class UnsupportedOperationException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #85  <Method void UnsupportedOperationException(String)>
	//   32   66:athrow          
	}

	public abstract JsonParser skipChildren()
		throws IOException;

	public abstract Version version();

	private static final int MAX_BYTE_I = 255;
	private static final int MAX_SHORT_I = 32767;
	private static final int MIN_BYTE_I = -128;
	private static final int MIN_SHORT_I = -32768;
	protected int _features;
	protected transient RequestPayload _requestPayload;
}
