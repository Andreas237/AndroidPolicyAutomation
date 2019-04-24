// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonParser

public static final class JsonParser$Feature extends Enum
{

	public static int collectDefaults()
	{
		JsonParser$Feature ajsonparser$feature[] = values();
	//    0    0:invokestatic    #90  <Method JsonParser$Feature[] values()>
	//    1    3:astore          4
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore_0        
		int l = ajsonparser$feature.length;
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
			JsonParser$Feature jsonparser$feature = ajsonparser$feature[i];
	//   12   18:aload           4
	//   13   20:iload_0         
	//   14   21:aaload          
	//   15   22:astore          5
			k = j;
	//   16   24:iload_1         
	//   17   25:istore_2        
			if(jsonparser$feature.enabledByDefault())
	//*  18   26:aload           5
	//*  19   28:invokevirtual   #94  <Method boolean enabledByDefault()>
	//*  20   31:ifeq            42
				k = j | jsonparser$feature.getMask();
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

	public static JsonParser$Feature valueOf(String s)
	{
		return (JsonParser$Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$Feature, s);
	//    0    0:ldc1            #2   <Class JsonParser$Feature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #102 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonParser$Feature>
	//    4    9:areturn         
	}

	public static JsonParser$Feature[] values()
	{
		return (JsonParser$Feature[])((JsonParser$Feature []) ($VALUES)).clone();
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

	private static final JsonParser$Feature $VALUES[];
	public static final JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
	public static final JsonParser$Feature ALLOW_COMMENTS;
	public static final JsonParser$Feature ALLOW_MISSING_VALUES;
	public static final JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS;
	public static final JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS;
	public static final JsonParser$Feature ALLOW_SINGLE_QUOTES;
	public static final JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS;
	public static final JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES;
	public static final JsonParser$Feature ALLOW_YAML_COMMENTS;
	public static final JsonParser$Feature AUTO_CLOSE_SOURCE;
	public static final JsonParser$Feature IGNORE_UNDEFINED;
	public static final JsonParser$Feature STRICT_DUPLICATE_DETECTION;
	private final boolean _defaultState;
	private final int _mask = 1 << ordinal();

	static 
	{
		AUTO_CLOSE_SOURCE = new JsonParser$Feature("AUTO_CLOSE_SOURCE", 0, true);
	//    0    0:new             #2   <Class JsonParser$Feature>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "AUTO_CLOSE_SOURCE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//    6   11:putstatic       #36  <Field JsonParser$Feature AUTO_CLOSE_SOURCE>
		ALLOW_COMMENTS = new JsonParser$Feature("ALLOW_COMMENTS", 1, false);
	//    7   14:new             #2   <Class JsonParser$Feature>
	//    8   17:dup             
	//    9   18:ldc1            #37  <String "ALLOW_COMMENTS">
	//   10   20:iconst_1        
	//   11   21:iconst_0        
	//   12   22:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   13   25:putstatic       #39  <Field JsonParser$Feature ALLOW_COMMENTS>
		ALLOW_YAML_COMMENTS = new JsonParser$Feature("ALLOW_YAML_COMMENTS", 2, false);
	//   14   28:new             #2   <Class JsonParser$Feature>
	//   15   31:dup             
	//   16   32:ldc1            #40  <String "ALLOW_YAML_COMMENTS">
	//   17   34:iconst_2        
	//   18   35:iconst_0        
	//   19   36:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   20   39:putstatic       #42  <Field JsonParser$Feature ALLOW_YAML_COMMENTS>
		ALLOW_UNQUOTED_FIELD_NAMES = new JsonParser$Feature("ALLOW_UNQUOTED_FIELD_NAMES", 3, false);
	//   21   42:new             #2   <Class JsonParser$Feature>
	//   22   45:dup             
	//   23   46:ldc1            #43  <String "ALLOW_UNQUOTED_FIELD_NAMES">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   27   53:putstatic       #45  <Field JsonParser$Feature ALLOW_UNQUOTED_FIELD_NAMES>
		ALLOW_SINGLE_QUOTES = new JsonParser$Feature("ALLOW_SINGLE_QUOTES", 4, false);
	//   28   56:new             #2   <Class JsonParser$Feature>
	//   29   59:dup             
	//   30   60:ldc1            #46  <String "ALLOW_SINGLE_QUOTES">
	//   31   62:iconst_4        
	//   32   63:iconst_0        
	//   33   64:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   34   67:putstatic       #48  <Field JsonParser$Feature ALLOW_SINGLE_QUOTES>
		ALLOW_UNQUOTED_CONTROL_CHARS = new JsonParser$Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 5, false);
	//   35   70:new             #2   <Class JsonParser$Feature>
	//   36   73:dup             
	//   37   74:ldc1            #49  <String "ALLOW_UNQUOTED_CONTROL_CHARS">
	//   38   76:iconst_5        
	//   39   77:iconst_0        
	//   40   78:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   41   81:putstatic       #51  <Field JsonParser$Feature ALLOW_UNQUOTED_CONTROL_CHARS>
		ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER = new JsonParser$Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 6, false);
	//   42   84:new             #2   <Class JsonParser$Feature>
	//   43   87:dup             
	//   44   88:ldc1            #52  <String "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER">
	//   45   90:bipush          6
	//   46   92:iconst_0        
	//   47   93:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   48   96:putstatic       #54  <Field JsonParser$Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
		ALLOW_NUMERIC_LEADING_ZEROS = new JsonParser$Feature("ALLOW_NUMERIC_LEADING_ZEROS", 7, false);
	//   49   99:new             #2   <Class JsonParser$Feature>
	//   50  102:dup             
	//   51  103:ldc1            #55  <String "ALLOW_NUMERIC_LEADING_ZEROS">
	//   52  105:bipush          7
	//   53  107:iconst_0        
	//   54  108:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   55  111:putstatic       #57  <Field JsonParser$Feature ALLOW_NUMERIC_LEADING_ZEROS>
		ALLOW_NON_NUMERIC_NUMBERS = new JsonParser$Feature("ALLOW_NON_NUMERIC_NUMBERS", 8, false);
	//   56  114:new             #2   <Class JsonParser$Feature>
	//   57  117:dup             
	//   58  118:ldc1            #58  <String "ALLOW_NON_NUMERIC_NUMBERS">
	//   59  120:bipush          8
	//   60  122:iconst_0        
	//   61  123:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   62  126:putstatic       #60  <Field JsonParser$Feature ALLOW_NON_NUMERIC_NUMBERS>
		STRICT_DUPLICATE_DETECTION = new JsonParser$Feature("STRICT_DUPLICATE_DETECTION", 9, false);
	//   63  129:new             #2   <Class JsonParser$Feature>
	//   64  132:dup             
	//   65  133:ldc1            #61  <String "STRICT_DUPLICATE_DETECTION">
	//   66  135:bipush          9
	//   67  137:iconst_0        
	//   68  138:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   69  141:putstatic       #63  <Field JsonParser$Feature STRICT_DUPLICATE_DETECTION>
		IGNORE_UNDEFINED = new JsonParser$Feature("IGNORE_UNDEFINED", 10, false);
	//   70  144:new             #2   <Class JsonParser$Feature>
	//   71  147:dup             
	//   72  148:ldc1            #64  <String "IGNORE_UNDEFINED">
	//   73  150:bipush          10
	//   74  152:iconst_0        
	//   75  153:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   76  156:putstatic       #66  <Field JsonParser$Feature IGNORE_UNDEFINED>
		ALLOW_MISSING_VALUES = new JsonParser$Feature("ALLOW_MISSING_VALUES", 11, false);
	//   77  159:new             #2   <Class JsonParser$Feature>
	//   78  162:dup             
	//   79  163:ldc1            #67  <String "ALLOW_MISSING_VALUES">
	//   80  165:bipush          11
	//   81  167:iconst_0        
	//   82  168:invokespecial   #34  <Method void JsonParser$Feature(String, int, boolean)>
	//   83  171:putstatic       #69  <Field JsonParser$Feature ALLOW_MISSING_VALUES>
		$VALUES = (new JsonParser$Feature[] {
			AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_NON_NUMERIC_NUMBERS, STRICT_DUPLICATE_DETECTION, 
			IGNORE_UNDEFINED, ALLOW_MISSING_VALUES
		});
	//   84  174:bipush          12
	//   85  176:anewarray       JsonParser$Feature[]
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

	private JsonParser$Feature(String s, int i, boolean flag)
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
