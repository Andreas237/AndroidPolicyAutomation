// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonGenerator

public static final class JsonGenerator$Feature extends Enum
{

	public static int collectDefaults()
	{
		JsonGenerator$Feature ajsongenerator$feature[] = values();
	//    0    0:invokestatic    #82  <Method JsonGenerator$Feature[] values()>
	//    1    3:astore          4
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore_0        
		int l = ajsongenerator$feature.length;
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
			JsonGenerator$Feature jsongenerator$feature = ajsongenerator$feature[i];
	//   12   18:aload           4
	//   13   20:iload_0         
	//   14   21:aaload          
	//   15   22:astore          5
			k = j;
	//   16   24:iload_1         
	//   17   25:istore_2        
			if(jsongenerator$feature.enabledByDefault())
	//*  18   26:aload           5
	//*  19   28:invokevirtual   #86  <Method boolean enabledByDefault()>
	//*  20   31:ifeq            42
				k = j | jsongenerator$feature.getMask();
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

	public static JsonGenerator$Feature valueOf(String s)
	{
		return (JsonGenerator$Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
	//    0    0:ldc1            #2   <Class JsonGenerator$Feature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonGenerator$Feature>
	//    4    9:areturn         
	}

	public static JsonGenerator$Feature[] values()
	{
		return (JsonGenerator$Feature[])((JsonGenerator$Feature []) ($VALUES)).clone();
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

	private static final JsonGenerator$Feature $VALUES[];
	public static final JsonGenerator$Feature AUTO_CLOSE_JSON_CONTENT;
	public static final JsonGenerator$Feature AUTO_CLOSE_TARGET;
	public static final JsonGenerator$Feature ESCAPE_NON_ASCII;
	public static final JsonGenerator$Feature FLUSH_PASSED_TO_STREAM;
	public static final JsonGenerator$Feature IGNORE_UNKNOWN;
	public static final JsonGenerator$Feature QUOTE_FIELD_NAMES;
	public static final JsonGenerator$Feature QUOTE_NON_NUMERIC_NUMBERS;
	public static final JsonGenerator$Feature STRICT_DUPLICATE_DETECTION;
	public static final JsonGenerator$Feature WRITE_BIGDECIMAL_AS_PLAIN;
	public static final JsonGenerator$Feature WRITE_NUMBERS_AS_STRINGS;
	private final boolean _defaultState;
	private final int _mask = 1 << ordinal();

	static 
	{
		AUTO_CLOSE_TARGET = new JsonGenerator$Feature("AUTO_CLOSE_TARGET", 0, true);
	//    0    0:new             #2   <Class JsonGenerator$Feature>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "AUTO_CLOSE_TARGET">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//    6   11:putstatic       #34  <Field JsonGenerator$Feature AUTO_CLOSE_TARGET>
		AUTO_CLOSE_JSON_CONTENT = new JsonGenerator$Feature("AUTO_CLOSE_JSON_CONTENT", 1, true);
	//    7   14:new             #2   <Class JsonGenerator$Feature>
	//    8   17:dup             
	//    9   18:ldc1            #35  <String "AUTO_CLOSE_JSON_CONTENT">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   13   25:putstatic       #37  <Field JsonGenerator$Feature AUTO_CLOSE_JSON_CONTENT>
		FLUSH_PASSED_TO_STREAM = new JsonGenerator$Feature("FLUSH_PASSED_TO_STREAM", 2, true);
	//   14   28:new             #2   <Class JsonGenerator$Feature>
	//   15   31:dup             
	//   16   32:ldc1            #38  <String "FLUSH_PASSED_TO_STREAM">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   20   39:putstatic       #40  <Field JsonGenerator$Feature FLUSH_PASSED_TO_STREAM>
		QUOTE_FIELD_NAMES = new JsonGenerator$Feature("QUOTE_FIELD_NAMES", 3, true);
	//   21   42:new             #2   <Class JsonGenerator$Feature>
	//   22   45:dup             
	//   23   46:ldc1            #41  <String "QUOTE_FIELD_NAMES">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   27   53:putstatic       #43  <Field JsonGenerator$Feature QUOTE_FIELD_NAMES>
		QUOTE_NON_NUMERIC_NUMBERS = new JsonGenerator$Feature("QUOTE_NON_NUMERIC_NUMBERS", 4, true);
	//   28   56:new             #2   <Class JsonGenerator$Feature>
	//   29   59:dup             
	//   30   60:ldc1            #44  <String "QUOTE_NON_NUMERIC_NUMBERS">
	//   31   62:iconst_4        
	//   32   63:iconst_1        
	//   33   64:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   34   67:putstatic       #46  <Field JsonGenerator$Feature QUOTE_NON_NUMERIC_NUMBERS>
		WRITE_NUMBERS_AS_STRINGS = new JsonGenerator$Feature("WRITE_NUMBERS_AS_STRINGS", 5, false);
	//   35   70:new             #2   <Class JsonGenerator$Feature>
	//   36   73:dup             
	//   37   74:ldc1            #47  <String "WRITE_NUMBERS_AS_STRINGS">
	//   38   76:iconst_5        
	//   39   77:iconst_0        
	//   40   78:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   41   81:putstatic       #49  <Field JsonGenerator$Feature WRITE_NUMBERS_AS_STRINGS>
		WRITE_BIGDECIMAL_AS_PLAIN = new JsonGenerator$Feature("WRITE_BIGDECIMAL_AS_PLAIN", 6, false);
	//   42   84:new             #2   <Class JsonGenerator$Feature>
	//   43   87:dup             
	//   44   88:ldc1            #50  <String "WRITE_BIGDECIMAL_AS_PLAIN">
	//   45   90:bipush          6
	//   46   92:iconst_0        
	//   47   93:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   48   96:putstatic       #52  <Field JsonGenerator$Feature WRITE_BIGDECIMAL_AS_PLAIN>
		ESCAPE_NON_ASCII = new JsonGenerator$Feature("ESCAPE_NON_ASCII", 7, false);
	//   49   99:new             #2   <Class JsonGenerator$Feature>
	//   50  102:dup             
	//   51  103:ldc1            #53  <String "ESCAPE_NON_ASCII">
	//   52  105:bipush          7
	//   53  107:iconst_0        
	//   54  108:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   55  111:putstatic       #55  <Field JsonGenerator$Feature ESCAPE_NON_ASCII>
		STRICT_DUPLICATE_DETECTION = new JsonGenerator$Feature("STRICT_DUPLICATE_DETECTION", 8, false);
	//   56  114:new             #2   <Class JsonGenerator$Feature>
	//   57  117:dup             
	//   58  118:ldc1            #56  <String "STRICT_DUPLICATE_DETECTION">
	//   59  120:bipush          8
	//   60  122:iconst_0        
	//   61  123:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   62  126:putstatic       #58  <Field JsonGenerator$Feature STRICT_DUPLICATE_DETECTION>
		IGNORE_UNKNOWN = new JsonGenerator$Feature("IGNORE_UNKNOWN", 9, false);
	//   63  129:new             #2   <Class JsonGenerator$Feature>
	//   64  132:dup             
	//   65  133:ldc1            #59  <String "IGNORE_UNKNOWN">
	//   66  135:bipush          9
	//   67  137:iconst_0        
	//   68  138:invokespecial   #32  <Method void JsonGenerator$Feature(String, int, boolean)>
	//   69  141:putstatic       #61  <Field JsonGenerator$Feature IGNORE_UNKNOWN>
		$VALUES = (new JsonGenerator$Feature[] {
			AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, FLUSH_PASSED_TO_STREAM, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, WRITE_NUMBERS_AS_STRINGS, WRITE_BIGDECIMAL_AS_PLAIN, ESCAPE_NON_ASCII, STRICT_DUPLICATE_DETECTION, IGNORE_UNKNOWN
		});
	//   70  144:bipush          10
	//   71  146:anewarray       JsonGenerator$Feature[]
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

	private JsonGenerator$Feature(String s, int i, boolean flag)
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
