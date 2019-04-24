// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


public final class JsonToken extends Enum
{

	private JsonToken(String s, int i, String s1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #100 <Method void Enum(String, int)>
		boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          7
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       31
		{
			_serialized = null;
	//    8   13:aload_0         
	//    9   14:aconst_null     
	//   10   15:putfield        #102 <Field String _serialized>
			_serializedChars = null;
	//   11   18:aload_0         
	//   12   19:aconst_null     
	//   13   20:putfield        #104 <Field char[] _serializedChars>
			_serializedBytes = null;
	//   14   23:aload_0         
	//   15   24:aconst_null     
	//   16   25:putfield        #106 <Field byte[] _serializedBytes>
		} else
	//*  17   28:goto            87
		{
			_serialized = s1;
	//   18   31:aload_0         
	//   19   32:aload_3         
	//   20   33:putfield        #102 <Field String _serialized>
			_serializedChars = s1.toCharArray();
	//   21   36:aload_0         
	//   22   37:aload_3         
	//   23   38:invokevirtual   #112 <Method char[] String.toCharArray()>
	//   24   41:putfield        #104 <Field char[] _serializedChars>
			int k = _serializedChars.length;
	//   25   44:aload_0         
	//   26   45:getfield        #104 <Field char[] _serializedChars>
	//   27   48:arraylength     
	//   28   49:istore          5
			_serializedBytes = new byte[k];
	//   29   51:aload_0         
	//   30   52:iload           5
	//   31   54:newarray        byte[]
	//   32   56:putfield        #106 <Field byte[] _serializedBytes>
			for(i = 0; i < k; i++)
	//*  33   59:iconst_0        
	//*  34   60:istore_2        
	//*  35   61:iload_2         
	//*  36   62:iload           5
	//*  37   64:icmpge          87
				_serializedBytes[i] = (byte)_serializedChars[i];
	//   38   67:aload_0         
	//   39   68:getfield        #106 <Field byte[] _serializedBytes>
	//   40   71:iload_2         
	//   41   72:aload_0         
	//   42   73:getfield        #104 <Field char[] _serializedChars>
	//   43   76:iload_2         
	//   44   77:caload          
	//   45   78:int2byte        
	//   46   79:bastore         

	//   47   80:iload_2         
	//   48   81:iconst_1        
	//   49   82:iadd            
	//   50   83:istore_2        
		}
	//*  51   84:goto            61
		_id = j;
	//   52   87:aload_0         
	//   53   88:iload           4
	//   54   90:putfield        #114 <Field int _id>
		boolean flag;
		if(j != 10 && j != 9)
	//*  55   93:iload           4
	//*  56   95:bipush          10
	//*  57   97:icmpeq          116
	//*  58  100:iload           4
	//*  59  102:bipush          9
	//*  60  104:icmpne          110
	//*  61  107:goto            116
			flag = false;
	//   62  110:iconst_0        
	//   63  111:istore          6
		else
	//*  64  113:goto            119
			flag = true;
	//   65  116:iconst_1        
	//   66  117:istore          6
		_isBoolean = flag;
	//   67  119:aload_0         
	//   68  120:iload           6
	//   69  122:putfield        #116 <Field boolean _isBoolean>
		if(j != 7 && j != 8)
	//*  70  125:iload           4
	//*  71  127:bipush          7
	//*  72  129:icmpeq          148
	//*  73  132:iload           4
	//*  74  134:bipush          8
	//*  75  136:icmpne          142
	//*  76  139:goto            148
			flag = false;
	//   77  142:iconst_0        
	//   78  143:istore          6
		else
	//*  79  145:goto            151
			flag = true;
	//   80  148:iconst_1        
	//   81  149:istore          6
		_isNumber = flag;
	//   82  151:aload_0         
	//   83  152:iload           6
	//   84  154:putfield        #118 <Field boolean _isNumber>
		if(j != 1 && j != 3)
	//*  85  157:iload           4
	//*  86  159:iconst_1        
	//*  87  160:icmpeq          178
	//*  88  163:iload           4
	//*  89  165:iconst_3        
	//*  90  166:icmpne          172
	//*  91  169:goto            178
			flag = false;
	//   92  172:iconst_0        
	//   93  173:istore          6
		else
	//*  94  175:goto            181
			flag = true;
	//   95  178:iconst_1        
	//   96  179:istore          6
		_isStructStart = flag;
	//   97  181:aload_0         
	//   98  182:iload           6
	//   99  184:putfield        #120 <Field boolean _isStructStart>
		if(j != 2 && j != 4)
	//* 100  187:iload           4
	//* 101  189:iconst_2        
	//* 102  190:icmpeq          208
	//* 103  193:iload           4
	//* 104  195:iconst_4        
	//* 105  196:icmpne          202
	//* 106  199:goto            208
			flag = false;
	//  107  202:iconst_0        
	//  108  203:istore          6
		else
	//* 109  205:goto            211
			flag = true;
	//  110  208:iconst_1        
	//  111  209:istore          6
		_isStructEnd = flag;
	//  112  211:aload_0         
	//  113  212:iload           6
	//  114  214:putfield        #122 <Field boolean _isStructEnd>
		flag = flag1;
	//  115  217:iload           7
	//  116  219:istore          6
		if(!_isStructStart)
	//* 117  221:aload_0         
	//* 118  222:getfield        #120 <Field boolean _isStructStart>
	//* 119  225:ifne            262
		{
			flag = flag1;
	//  120  228:iload           7
	//  121  230:istore          6
			if(!_isStructEnd)
	//* 122  232:aload_0         
	//* 123  233:getfield        #122 <Field boolean _isStructEnd>
	//* 124  236:ifne            262
			{
				flag = flag1;
	//  125  239:iload           7
	//  126  241:istore          6
				if(j != 5)
	//* 127  243:iload           4
	//* 128  245:iconst_5        
	//* 129  246:icmpeq          262
				{
					flag = flag1;
	//  130  249:iload           7
	//  131  251:istore          6
					if(j != -1)
	//* 132  253:iload           4
	//* 133  255:iconst_m1       
	//* 134  256:icmpeq          262
						flag = true;
	//  135  259:iconst_1        
	//  136  260:istore          6
				}
			}
		}
		_isScalar = flag;
	//  137  262:aload_0         
	//  138  263:iload           6
	//  139  265:putfield        #124 <Field boolean _isScalar>
	//  140  268:return          
	}

	public static JsonToken valueOf(String s)
	{
		return (JsonToken)Enum.valueOf(com/fasterxml/jackson/core/JsonToken, s);
	//    0    0:ldc1            #2   <Class JsonToken>
	//    1    2:aload_0         
	//    2    3:invokestatic    #130 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonToken>
	//    4    9:areturn         
	}

	public static JsonToken[] values()
	{
		return (JsonToken[])((JsonToken []) ($VALUES)).clone();
	//    0    0:getstatic       #96  <Field JsonToken[] $VALUES>
	//    1    3:invokevirtual   #137 <Method Object _5B_Lcom.fasterxml.jackson.core.JsonToken_3B_.clone()>
	//    2    6:checkcast       #133 <Class JsonToken[]>
	//    3    9:areturn         
	}

	public final byte[] asByteArray()
	{
		return _serializedBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field byte[] _serializedBytes>
	//    2    4:areturn         
	}

	public final char[] asCharArray()
	{
		return _serializedChars;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field char[] _serializedChars>
	//    2    4:areturn         
	}

	public final String asString()
	{
		return _serialized;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String _serialized>
	//    2    4:areturn         
	}

	public final int id()
	{
		return _id;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int _id>
	//    2    4:ireturn         
	}

	public final boolean isBoolean()
	{
		return _isBoolean;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean _isBoolean>
	//    2    4:ireturn         
	}

	public final boolean isNumeric()
	{
		return _isNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean _isNumber>
	//    2    4:ireturn         
	}

	public final boolean isScalarValue()
	{
		return _isScalar;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean _isScalar>
	//    2    4:ireturn         
	}

	public final boolean isStructEnd()
	{
		return _isStructEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field boolean _isStructEnd>
	//    2    4:ireturn         
	}

	public final boolean isStructStart()
	{
		return _isStructStart;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean _isStructStart>
	//    2    4:ireturn         
	}

	private static final JsonToken $VALUES[];
	public static final JsonToken END_ARRAY;
	public static final JsonToken END_OBJECT;
	public static final JsonToken FIELD_NAME;
	public static final JsonToken NOT_AVAILABLE;
	public static final JsonToken START_ARRAY;
	public static final JsonToken START_OBJECT;
	public static final JsonToken VALUE_EMBEDDED_OBJECT;
	public static final JsonToken VALUE_FALSE;
	public static final JsonToken VALUE_NULL;
	public static final JsonToken VALUE_NUMBER_FLOAT;
	public static final JsonToken VALUE_NUMBER_INT;
	public static final JsonToken VALUE_STRING;
	public static final JsonToken VALUE_TRUE;
	final int _id;
	final boolean _isBoolean;
	final boolean _isNumber;
	final boolean _isScalar;
	final boolean _isStructEnd;
	final boolean _isStructStart;
	final String _serialized;
	final byte _serializedBytes[];
	final char _serializedChars[];

	static 
	{
		NOT_AVAILABLE = new JsonToken("NOT_AVAILABLE", 0, ((String) (null)), -1);
	//    0    0:new             #2   <Class JsonToken>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "NOT_AVAILABLE">
	//    3    6:iconst_0        
	//    4    7:aconst_null     
	//    5    8:iconst_m1       
	//    6    9:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//    7   12:putstatic       #44  <Field JsonToken NOT_AVAILABLE>
		START_OBJECT = new JsonToken("START_OBJECT", 1, "{", 1);
	//    8   15:new             #2   <Class JsonToken>
	//    9   18:dup             
	//   10   19:ldc1            #45  <String "START_OBJECT">
	//   11   21:iconst_1        
	//   12   22:ldc1            #47  <String "{">
	//   13   24:iconst_1        
	//   14   25:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   15   28:putstatic       #49  <Field JsonToken START_OBJECT>
		END_OBJECT = new JsonToken("END_OBJECT", 2, "}", 2);
	//   16   31:new             #2   <Class JsonToken>
	//   17   34:dup             
	//   18   35:ldc1            #50  <String "END_OBJECT">
	//   19   37:iconst_2        
	//   20   38:ldc1            #52  <String "}">
	//   21   40:iconst_2        
	//   22   41:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   23   44:putstatic       #54  <Field JsonToken END_OBJECT>
		START_ARRAY = new JsonToken("START_ARRAY", 3, "[", 3);
	//   24   47:new             #2   <Class JsonToken>
	//   25   50:dup             
	//   26   51:ldc1            #55  <String "START_ARRAY">
	//   27   53:iconst_3        
	//   28   54:ldc1            #57  <String "[">
	//   29   56:iconst_3        
	//   30   57:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   31   60:putstatic       #59  <Field JsonToken START_ARRAY>
		END_ARRAY = new JsonToken("END_ARRAY", 4, "]", 4);
	//   32   63:new             #2   <Class JsonToken>
	//   33   66:dup             
	//   34   67:ldc1            #60  <String "END_ARRAY">
	//   35   69:iconst_4        
	//   36   70:ldc1            #62  <String "]">
	//   37   72:iconst_4        
	//   38   73:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   39   76:putstatic       #64  <Field JsonToken END_ARRAY>
		FIELD_NAME = new JsonToken("FIELD_NAME", 5, ((String) (null)), 5);
	//   40   79:new             #2   <Class JsonToken>
	//   41   82:dup             
	//   42   83:ldc1            #65  <String "FIELD_NAME">
	//   43   85:iconst_5        
	//   44   86:aconst_null     
	//   45   87:iconst_5        
	//   46   88:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   47   91:putstatic       #67  <Field JsonToken FIELD_NAME>
		VALUE_EMBEDDED_OBJECT = new JsonToken("VALUE_EMBEDDED_OBJECT", 6, ((String) (null)), 12);
	//   48   94:new             #2   <Class JsonToken>
	//   49   97:dup             
	//   50   98:ldc1            #68  <String "VALUE_EMBEDDED_OBJECT">
	//   51  100:bipush          6
	//   52  102:aconst_null     
	//   53  103:bipush          12
	//   54  105:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   55  108:putstatic       #70  <Field JsonToken VALUE_EMBEDDED_OBJECT>
		VALUE_STRING = new JsonToken("VALUE_STRING", 7, ((String) (null)), 6);
	//   56  111:new             #2   <Class JsonToken>
	//   57  114:dup             
	//   58  115:ldc1            #71  <String "VALUE_STRING">
	//   59  117:bipush          7
	//   60  119:aconst_null     
	//   61  120:bipush          6
	//   62  122:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   63  125:putstatic       #73  <Field JsonToken VALUE_STRING>
		VALUE_NUMBER_INT = new JsonToken("VALUE_NUMBER_INT", 8, ((String) (null)), 7);
	//   64  128:new             #2   <Class JsonToken>
	//   65  131:dup             
	//   66  132:ldc1            #74  <String "VALUE_NUMBER_INT">
	//   67  134:bipush          8
	//   68  136:aconst_null     
	//   69  137:bipush          7
	//   70  139:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   71  142:putstatic       #76  <Field JsonToken VALUE_NUMBER_INT>
		VALUE_NUMBER_FLOAT = new JsonToken("VALUE_NUMBER_FLOAT", 9, ((String) (null)), 8);
	//   72  145:new             #2   <Class JsonToken>
	//   73  148:dup             
	//   74  149:ldc1            #77  <String "VALUE_NUMBER_FLOAT">
	//   75  151:bipush          9
	//   76  153:aconst_null     
	//   77  154:bipush          8
	//   78  156:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   79  159:putstatic       #79  <Field JsonToken VALUE_NUMBER_FLOAT>
		VALUE_TRUE = new JsonToken("VALUE_TRUE", 10, "true", 9);
	//   80  162:new             #2   <Class JsonToken>
	//   81  165:dup             
	//   82  166:ldc1            #80  <String "VALUE_TRUE">
	//   83  168:bipush          10
	//   84  170:ldc1            #82  <String "true">
	//   85  172:bipush          9
	//   86  174:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   87  177:putstatic       #84  <Field JsonToken VALUE_TRUE>
		VALUE_FALSE = new JsonToken("VALUE_FALSE", 11, "false", 10);
	//   88  180:new             #2   <Class JsonToken>
	//   89  183:dup             
	//   90  184:ldc1            #85  <String "VALUE_FALSE">
	//   91  186:bipush          11
	//   92  188:ldc1            #87  <String "false">
	//   93  190:bipush          10
	//   94  192:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//   95  195:putstatic       #89  <Field JsonToken VALUE_FALSE>
		VALUE_NULL = new JsonToken("VALUE_NULL", 12, "null", 11);
	//   96  198:new             #2   <Class JsonToken>
	//   97  201:dup             
	//   98  202:ldc1            #90  <String "VALUE_NULL">
	//   99  204:bipush          12
	//  100  206:ldc1            #92  <String "null">
	//  101  208:bipush          11
	//  102  210:invokespecial   #42  <Method void JsonToken(String, int, String, int)>
	//  103  213:putstatic       #94  <Field JsonToken VALUE_NULL>
		$VALUES = (new JsonToken[] {
			NOT_AVAILABLE, START_OBJECT, END_OBJECT, START_ARRAY, END_ARRAY, FIELD_NAME, VALUE_EMBEDDED_OBJECT, VALUE_STRING, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, 
			VALUE_TRUE, VALUE_FALSE, VALUE_NULL
		});
	//  104  216:bipush          13
	//  105  218:anewarray       JsonToken[]
	//  106  221:dup             
	//  107  222:iconst_0        
	//  108  223:getstatic       #44  <Field JsonToken NOT_AVAILABLE>
	//  109  226:aastore         
	//  110  227:dup             
	//  111  228:iconst_1        
	//  112  229:getstatic       #49  <Field JsonToken START_OBJECT>
	//  113  232:aastore         
	//  114  233:dup             
	//  115  234:iconst_2        
	//  116  235:getstatic       #54  <Field JsonToken END_OBJECT>
	//  117  238:aastore         
	//  118  239:dup             
	//  119  240:iconst_3        
	//  120  241:getstatic       #59  <Field JsonToken START_ARRAY>
	//  121  244:aastore         
	//  122  245:dup             
	//  123  246:iconst_4        
	//  124  247:getstatic       #64  <Field JsonToken END_ARRAY>
	//  125  250:aastore         
	//  126  251:dup             
	//  127  252:iconst_5        
	//  128  253:getstatic       #67  <Field JsonToken FIELD_NAME>
	//  129  256:aastore         
	//  130  257:dup             
	//  131  258:bipush          6
	//  132  260:getstatic       #70  <Field JsonToken VALUE_EMBEDDED_OBJECT>
	//  133  263:aastore         
	//  134  264:dup             
	//  135  265:bipush          7
	//  136  267:getstatic       #73  <Field JsonToken VALUE_STRING>
	//  137  270:aastore         
	//  138  271:dup             
	//  139  272:bipush          8
	//  140  274:getstatic       #76  <Field JsonToken VALUE_NUMBER_INT>
	//  141  277:aastore         
	//  142  278:dup             
	//  143  279:bipush          9
	//  144  281:getstatic       #79  <Field JsonToken VALUE_NUMBER_FLOAT>
	//  145  284:aastore         
	//  146  285:dup             
	//  147  286:bipush          10
	//  148  288:getstatic       #84  <Field JsonToken VALUE_TRUE>
	//  149  291:aastore         
	//  150  292:dup             
	//  151  293:bipush          11
	//  152  295:getstatic       #89  <Field JsonToken VALUE_FALSE>
	//  153  298:aastore         
	//  154  299:dup             
	//  155  300:bipush          12
	//  156  302:getstatic       #94  <Field JsonToken VALUE_NULL>
	//  157  305:aastore         
	//  158  306:putstatic       #96  <Field JsonToken[] $VALUES>
	//* 159  309:return          
	}
}
