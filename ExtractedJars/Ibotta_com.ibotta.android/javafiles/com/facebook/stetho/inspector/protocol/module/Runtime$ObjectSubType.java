// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

public static final class Runtime$ObjectSubType extends Enum
{

	public static Runtime$ObjectSubType valueOf(String s)
	{
		return (Runtime$ObjectSubType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Runtime$ObjectSubType, s);
	//    0    0:ldc1            #2   <Class Runtime$ObjectSubType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #94  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Runtime$ObjectSubType>
	//    4    9:areturn         
	}

	public static Runtime$ObjectSubType[] values()
	{
		return (Runtime$ObjectSubType[])((Runtime$ObjectSubType []) ($VALUES)).clone();
	//    0    0:getstatic       #81  <Field Runtime$ObjectSubType[] $VALUES>
	//    1    3:invokevirtual   #101 <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Runtime$ObjectSubType_3B_.clone()>
	//    2    6:checkcast       #97  <Class Runtime$ObjectSubType[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Runtime$ObjectSubType $VALUES[];
	public static final Runtime$ObjectSubType ARRAY;
	public static final Runtime$ObjectSubType DATE;
	public static final Runtime$ObjectSubType ERROR;
	public static final Runtime$ObjectSubType GENERATOR;
	public static final Runtime$ObjectSubType ITERATOR;
	public static final Runtime$ObjectSubType MAP;
	public static final Runtime$ObjectSubType NODE;
	public static final Runtime$ObjectSubType NULL;
	public static final Runtime$ObjectSubType REGEXP;
	public static final Runtime$ObjectSubType SET;
	private final String mProtocolValue;

	static 
	{
		ARRAY = new Runtime$ObjectSubType("ARRAY", 0, "array");
	//    0    0:new             #2   <Class Runtime$ObjectSubType>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "ARRAY">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <String "array">
	//    5    9:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//    6   12:putstatic       #34  <Field Runtime$ObjectSubType ARRAY>
		NULL = new Runtime$ObjectSubType("NULL", 1, "null");
	//    7   15:new             #2   <Class Runtime$ObjectSubType>
	//    8   18:dup             
	//    9   19:ldc1            #35  <String "NULL">
	//   10   21:iconst_1        
	//   11   22:ldc1            #37  <String "null">
	//   12   24:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   13   27:putstatic       #39  <Field Runtime$ObjectSubType NULL>
		NODE = new Runtime$ObjectSubType("NODE", 2, "node");
	//   14   30:new             #2   <Class Runtime$ObjectSubType>
	//   15   33:dup             
	//   16   34:ldc1            #40  <String "NODE">
	//   17   36:iconst_2        
	//   18   37:ldc1            #42  <String "node">
	//   19   39:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   20   42:putstatic       #44  <Field Runtime$ObjectSubType NODE>
		REGEXP = new Runtime$ObjectSubType("REGEXP", 3, "regexp");
	//   21   45:new             #2   <Class Runtime$ObjectSubType>
	//   22   48:dup             
	//   23   49:ldc1            #45  <String "REGEXP">
	//   24   51:iconst_3        
	//   25   52:ldc1            #47  <String "regexp">
	//   26   54:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   27   57:putstatic       #49  <Field Runtime$ObjectSubType REGEXP>
		DATE = new Runtime$ObjectSubType("DATE", 4, "date");
	//   28   60:new             #2   <Class Runtime$ObjectSubType>
	//   29   63:dup             
	//   30   64:ldc1            #50  <String "DATE">
	//   31   66:iconst_4        
	//   32   67:ldc1            #52  <String "date">
	//   33   69:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   34   72:putstatic       #54  <Field Runtime$ObjectSubType DATE>
		MAP = new Runtime$ObjectSubType("MAP", 5, "map");
	//   35   75:new             #2   <Class Runtime$ObjectSubType>
	//   36   78:dup             
	//   37   79:ldc1            #55  <String "MAP">
	//   38   81:iconst_5        
	//   39   82:ldc1            #57  <String "map">
	//   40   84:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   41   87:putstatic       #59  <Field Runtime$ObjectSubType MAP>
		SET = new Runtime$ObjectSubType("SET", 6, "set");
	//   42   90:new             #2   <Class Runtime$ObjectSubType>
	//   43   93:dup             
	//   44   94:ldc1            #60  <String "SET">
	//   45   96:bipush          6
	//   46   98:ldc1            #62  <String "set">
	//   47  100:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   48  103:putstatic       #64  <Field Runtime$ObjectSubType SET>
		ITERATOR = new Runtime$ObjectSubType("ITERATOR", 7, "iterator");
	//   49  106:new             #2   <Class Runtime$ObjectSubType>
	//   50  109:dup             
	//   51  110:ldc1            #65  <String "ITERATOR">
	//   52  112:bipush          7
	//   53  114:ldc1            #67  <String "iterator">
	//   54  116:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   55  119:putstatic       #69  <Field Runtime$ObjectSubType ITERATOR>
		GENERATOR = new Runtime$ObjectSubType("GENERATOR", 8, "generator");
	//   56  122:new             #2   <Class Runtime$ObjectSubType>
	//   57  125:dup             
	//   58  126:ldc1            #70  <String "GENERATOR">
	//   59  128:bipush          8
	//   60  130:ldc1            #72  <String "generator">
	//   61  132:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   62  135:putstatic       #74  <Field Runtime$ObjectSubType GENERATOR>
		ERROR = new Runtime$ObjectSubType("ERROR", 9, "error");
	//   63  138:new             #2   <Class Runtime$ObjectSubType>
	//   64  141:dup             
	//   65  142:ldc1            #75  <String "ERROR">
	//   66  144:bipush          9
	//   67  146:ldc1            #77  <String "error">
	//   68  148:invokespecial   #32  <Method void Runtime$ObjectSubType(String, int, String)>
	//   69  151:putstatic       #79  <Field Runtime$ObjectSubType ERROR>
		$VALUES = (new Runtime$ObjectSubType[] {
			ARRAY, NULL, NODE, REGEXP, DATE, MAP, SET, ITERATOR, GENERATOR, ERROR
		});
	//   70  154:bipush          10
	//   71  156:anewarray       Runtime$ObjectSubType[]
	//   72  159:dup             
	//   73  160:iconst_0        
	//   74  161:getstatic       #34  <Field Runtime$ObjectSubType ARRAY>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_1        
	//   78  167:getstatic       #39  <Field Runtime$ObjectSubType NULL>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_2        
	//   82  173:getstatic       #44  <Field Runtime$ObjectSubType NODE>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_3        
	//   86  179:getstatic       #49  <Field Runtime$ObjectSubType REGEXP>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_4        
	//   90  185:getstatic       #54  <Field Runtime$ObjectSubType DATE>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:iconst_5        
	//   94  191:getstatic       #59  <Field Runtime$ObjectSubType MAP>
	//   95  194:aastore         
	//   96  195:dup             
	//   97  196:bipush          6
	//   98  198:getstatic       #64  <Field Runtime$ObjectSubType SET>
	//   99  201:aastore         
	//  100  202:dup             
	//  101  203:bipush          7
	//  102  205:getstatic       #69  <Field Runtime$ObjectSubType ITERATOR>
	//  103  208:aastore         
	//  104  209:dup             
	//  105  210:bipush          8
	//  106  212:getstatic       #74  <Field Runtime$ObjectSubType GENERATOR>
	//  107  215:aastore         
	//  108  216:dup             
	//  109  217:bipush          9
	//  110  219:getstatic       #79  <Field Runtime$ObjectSubType ERROR>
	//  111  222:aastore         
	//  112  223:putstatic       #81  <Field Runtime$ObjectSubType[] $VALUES>
	//* 113  226:return          
	}

	private Runtime$ObjectSubType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #87  <Field String mProtocolValue>
	//    7   11:return          
	}
}
