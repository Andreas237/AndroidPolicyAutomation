// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors

public static final class Descriptors$FieldDescriptor$Type extends Enum
{

	public static Descriptors$FieldDescriptor$Type valueOf(roto.Type type)
	{
		return values()[type.getNumber() - 1];
	//    0    0:invokestatic    #134 <Method Descriptors$FieldDescriptor$Type[] values()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #140 <Method int DescriptorProtos$FieldDescriptorProto$Type.getNumber()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:aaload          
	//    6   10:areturn         
	}

	public static Descriptors$FieldDescriptor$Type valueOf(String s)
	{
		return (Descriptors$FieldDescriptor$Type)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$Type, s);
	//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #144 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$Type>
	//    4    9:areturn         
	}

	public static Descriptors$FieldDescriptor$Type[] values()
	{
		return (Descriptors$FieldDescriptor$Type[])((Descriptors$FieldDescriptor$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
	//    1    3:invokevirtual   #149 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$Type_3B_.clone()>
	//    2    6:checkcast       #145 <Class Descriptors$FieldDescriptor$Type[]>
	//    3    9:areturn         
	}

	public ype getJavaType()
	{
		return javaType;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
	//    2    4:areturn         
	}

	public roto.Type toProto()
	{
		return roto.Type.forNumber(ordinal() + 1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method int ordinal()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:invokestatic    #160 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.forNumber(int)>
	//    5    9:areturn         
	}

	private static final Descriptors$FieldDescriptor$Type $VALUES[];
	public static final Descriptors$FieldDescriptor$Type BOOL;
	public static final Descriptors$FieldDescriptor$Type BYTES;
	public static final Descriptors$FieldDescriptor$Type DOUBLE;
	public static final Descriptors$FieldDescriptor$Type ENUM;
	public static final Descriptors$FieldDescriptor$Type FIXED32;
	public static final Descriptors$FieldDescriptor$Type FIXED64;
	public static final Descriptors$FieldDescriptor$Type FLOAT;
	public static final Descriptors$FieldDescriptor$Type GROUP;
	public static final Descriptors$FieldDescriptor$Type INT32;
	public static final Descriptors$FieldDescriptor$Type INT64;
	public static final Descriptors$FieldDescriptor$Type MESSAGE;
	public static final Descriptors$FieldDescriptor$Type SFIXED32;
	public static final Descriptors$FieldDescriptor$Type SFIXED64;
	public static final Descriptors$FieldDescriptor$Type SINT32;
	public static final Descriptors$FieldDescriptor$Type SINT64;
	public static final Descriptors$FieldDescriptor$Type STRING;
	public static final Descriptors$FieldDescriptor$Type UINT32;
	public static final Descriptors$FieldDescriptor$Type UINT64;
	private ype javaType;

	static 
	{
		DOUBLE = new Descriptors$FieldDescriptor$Type("DOUBLE", 0, ype.DOUBLE);
	//    0    0:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:getstatic       #41  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.DOUBLE>
	//    5   10:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//    6   13:putstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
		FLOAT = new Descriptors$FieldDescriptor$Type("FLOAT", 1, ype.FLOAT);
	//    7   16:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//    8   19:dup             
	//    9   20:ldc1            #48  <String "FLOAT">
	//   10   22:iconst_1        
	//   11   23:getstatic       #50  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.FLOAT>
	//   12   26:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   13   29:putstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
		INT64 = new Descriptors$FieldDescriptor$Type("INT64", 2, ype.LONG);
	//   14   32:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   15   35:dup             
	//   16   36:ldc1            #53  <String "INT64">
	//   17   38:iconst_2        
	//   18   39:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
	//   19   42:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   20   45:putstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
		UINT64 = new Descriptors$FieldDescriptor$Type("UINT64", 3, ype.LONG);
	//   21   48:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   22   51:dup             
	//   23   52:ldc1            #59  <String "UINT64">
	//   24   54:iconst_3        
	//   25   55:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
	//   26   58:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   27   61:putstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
		INT32 = new Descriptors$FieldDescriptor$Type("INT32", 4, ype.INT);
	//   28   64:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   29   67:dup             
	//   30   68:ldc1            #62  <String "INT32">
	//   31   70:iconst_4        
	//   32   71:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
	//   33   74:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   34   77:putstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
		FIXED64 = new Descriptors$FieldDescriptor$Type("FIXED64", 5, ype.LONG);
	//   35   80:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   36   83:dup             
	//   37   84:ldc1            #68  <String "FIXED64">
	//   38   86:iconst_5        
	//   39   87:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
	//   40   90:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   41   93:putstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
		FIXED32 = new Descriptors$FieldDescriptor$Type("FIXED32", 6, ype.INT);
	//   42   96:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   43   99:dup             
	//   44  100:ldc1            #71  <String "FIXED32">
	//   45  102:bipush          6
	//   46  104:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
	//   47  107:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   48  110:putstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
		BOOL = new Descriptors$FieldDescriptor$Type("BOOL", 7, ype.BOOLEAN);
	//   49  113:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   50  116:dup             
	//   51  117:ldc1            #74  <String "BOOL">
	//   52  119:bipush          7
	//   53  121:getstatic       #77  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BOOLEAN>
	//   54  124:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   55  127:putstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
		STRING = new Descriptors$FieldDescriptor$Type("STRING", 8, ype.STRING);
	//   56  130:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   57  133:dup             
	//   58  134:ldc1            #80  <String "STRING">
	//   59  136:bipush          8
	//   60  138:getstatic       #82  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.STRING>
	//   61  141:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   62  144:putstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
		GROUP = new Descriptors$FieldDescriptor$Type("GROUP", 9, ype.MESSAGE);
	//   63  147:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   64  150:dup             
	//   65  151:ldc1            #85  <String "GROUP">
	//   66  153:bipush          9
	//   67  155:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//   68  158:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   69  161:putstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
		MESSAGE = new Descriptors$FieldDescriptor$Type("MESSAGE", 10, ype.MESSAGE);
	//   70  164:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   71  167:dup             
	//   72  168:ldc1            #90  <String "MESSAGE">
	//   73  170:bipush          10
	//   74  172:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//   75  175:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   76  178:putstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
		BYTES = new Descriptors$FieldDescriptor$Type("BYTES", 11, ype.BYTE_STRING);
	//   77  181:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   78  184:dup             
	//   79  185:ldc1            #93  <String "BYTES">
	//   80  187:bipush          11
	//   81  189:getstatic       #96  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BYTE_STRING>
	//   82  192:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   83  195:putstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
		UINT32 = new Descriptors$FieldDescriptor$Type("UINT32", 12, ype.INT);
	//   84  198:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   85  201:dup             
	//   86  202:ldc1            #99  <String "UINT32">
	//   87  204:bipush          12
	//   88  206:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
	//   89  209:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   90  212:putstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
		ENUM = new Descriptors$FieldDescriptor$Type("ENUM", 13, ype.ENUM);
	//   91  215:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   92  218:dup             
	//   93  219:ldc1            #102 <String "ENUM">
	//   94  221:bipush          13
	//   95  223:getstatic       #104 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
	//   96  226:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//   97  229:putstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
		SFIXED32 = new Descriptors$FieldDescriptor$Type("SFIXED32", 14, ype.INT);
	//   98  232:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//   99  235:dup             
	//  100  236:ldc1            #107 <String "SFIXED32">
	//  101  238:bipush          14
	//  102  240:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
	//  103  243:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//  104  246:putstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
		SFIXED64 = new Descriptors$FieldDescriptor$Type("SFIXED64", 15, ype.LONG);
	//  105  249:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//  106  252:dup             
	//  107  253:ldc1            #110 <String "SFIXED64">
	//  108  255:bipush          15
	//  109  257:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
	//  110  260:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//  111  263:putstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
		SINT32 = new Descriptors$FieldDescriptor$Type("SINT32", 16, ype.INT);
	//  112  266:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//  113  269:dup             
	//  114  270:ldc1            #113 <String "SINT32">
	//  115  272:bipush          16
	//  116  274:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
	//  117  277:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//  118  280:putstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
		SINT64 = new Descriptors$FieldDescriptor$Type("SINT64", 17, ype.LONG);
	//  119  283:new             #2   <Class Descriptors$FieldDescriptor$Type>
	//  120  286:dup             
	//  121  287:ldc1            #116 <String "SINT64">
	//  122  289:bipush          17
	//  123  291:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
	//  124  294:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
	//  125  297:putstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
		$VALUES = (new Descriptors$FieldDescriptor$Type[] {
			DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
			MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
		});
	//  126  300:bipush          18
	//  127  302:anewarray       Descriptors$FieldDescriptor$Type[]
	//  128  305:dup             
	//  129  306:iconst_0        
	//  130  307:getstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
	//  131  310:aastore         
	//  132  311:dup             
	//  133  312:iconst_1        
	//  134  313:getstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
	//  135  316:aastore         
	//  136  317:dup             
	//  137  318:iconst_2        
	//  138  319:getstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
	//  139  322:aastore         
	//  140  323:dup             
	//  141  324:iconst_3        
	//  142  325:getstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
	//  143  328:aastore         
	//  144  329:dup             
	//  145  330:iconst_4        
	//  146  331:getstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
	//  147  334:aastore         
	//  148  335:dup             
	//  149  336:iconst_5        
	//  150  337:getstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
	//  151  340:aastore         
	//  152  341:dup             
	//  153  342:bipush          6
	//  154  344:getstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
	//  155  347:aastore         
	//  156  348:dup             
	//  157  349:bipush          7
	//  158  351:getstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
	//  159  354:aastore         
	//  160  355:dup             
	//  161  356:bipush          8
	//  162  358:getstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
	//  163  361:aastore         
	//  164  362:dup             
	//  165  363:bipush          9
	//  166  365:getstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
	//  167  368:aastore         
	//  168  369:dup             
	//  169  370:bipush          10
	//  170  372:getstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
	//  171  375:aastore         
	//  172  376:dup             
	//  173  377:bipush          11
	//  174  379:getstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
	//  175  382:aastore         
	//  176  383:dup             
	//  177  384:bipush          12
	//  178  386:getstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
	//  179  389:aastore         
	//  180  390:dup             
	//  181  391:bipush          13
	//  182  393:getstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
	//  183  396:aastore         
	//  184  397:dup             
	//  185  398:bipush          14
	//  186  400:getstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
	//  187  403:aastore         
	//  188  404:dup             
	//  189  405:bipush          15
	//  190  407:getstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
	//  191  410:aastore         
	//  192  411:dup             
	//  193  412:bipush          16
	//  194  414:getstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
	//  195  417:aastore         
	//  196  418:dup             
	//  197  419:bipush          17
	//  198  421:getstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
	//  199  424:aastore         
	//  200  425:putstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
	//* 201  428:return          
	}

	private Descriptors$FieldDescriptor$Type(String s, int i, ype ype)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #124 <Method void Enum(String, int)>
		javaType = ype;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
	//    7   11:return          
	}
}
