// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			ByteString

final class WireFormat
{
	static class FieldType extends Enum
	{

		public static FieldType valueOf(String s)
		{
			return (FieldType)Enum.valueOf(com/crashlytics/android/core/WireFormat$FieldType, s);
		//    0    0:ldc1            #2   <Class WireFormat$FieldType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #147 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class WireFormat$FieldType>
		//    4    9:areturn         
		}

		public static FieldType[] values()
		{
			return (FieldType[])((FieldType []) ($VALUES)).clone();
		//    0    0:getstatic       #131 <Field WireFormat$FieldType[] $VALUES>
		//    1    3:invokevirtual   #154 <Method Object _5B_Lcom.crashlytics.android.core.WireFormat$FieldType_3B_.clone()>
		//    2    6:checkcast       #150 <Class WireFormat$FieldType[]>
		//    3    9:areturn         
		}

		public JavaType getJavaType()
		{
			return javaType;
		//    0    0:aload_0         
		//    1    1:getfield        #137 <Field WireFormat$JavaType javaType>
		//    2    4:areturn         
		}

		public int getWireType()
		{
			return wireType;
		//    0    0:aload_0         
		//    1    1:getfield        #139 <Field int wireType>
		//    2    4:ireturn         
		}

		public boolean isPackable()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private static final FieldType $VALUES[];
		public static final FieldType BOOL;
		public static final FieldType BYTES;
		public static final FieldType DOUBLE;
		public static final FieldType ENUM;
		public static final FieldType FIXED32;
		public static final FieldType FIXED64;
		public static final FieldType FLOAT;
		public static final FieldType GROUP;
		public static final FieldType INT32;
		public static final FieldType INT64;
		public static final FieldType MESSAGE;
		public static final FieldType SFIXED32;
		public static final FieldType SFIXED64;
		public static final FieldType SINT32;
		public static final FieldType SINT64;
		public static final FieldType STRING;
		public static final FieldType UINT32;
		public static final FieldType UINT64;
		private final JavaType javaType;
		private final int wireType;

		static 
		{
			DOUBLE = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
		//    0    0:new             #2   <Class WireFormat$FieldType>
		//    1    3:dup             
		//    2    4:ldc1            #44  <String "DOUBLE">
		//    3    6:iconst_0        
		//    4    7:getstatic       #48  <Field WireFormat$JavaType WireFormat$JavaType.DOUBLE>
		//    5   10:iconst_1        
		//    6   11:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//    7   14:putstatic       #54  <Field WireFormat$FieldType DOUBLE>
			FLOAT = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
		//    8   17:new             #2   <Class WireFormat$FieldType>
		//    9   20:dup             
		//   10   21:ldc1            #55  <String "FLOAT">
		//   11   23:iconst_1        
		//   12   24:getstatic       #57  <Field WireFormat$JavaType WireFormat$JavaType.FLOAT>
		//   13   27:iconst_5        
		//   14   28:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   15   31:putstatic       #59  <Field WireFormat$FieldType FLOAT>
			INT64 = new FieldType("INT64", 2, JavaType.LONG, 0);
		//   16   34:new             #2   <Class WireFormat$FieldType>
		//   17   37:dup             
		//   18   38:ldc1            #60  <String "INT64">
		//   19   40:iconst_2        
		//   20   41:getstatic       #63  <Field WireFormat$JavaType WireFormat$JavaType.LONG>
		//   21   44:iconst_0        
		//   22   45:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   23   48:putstatic       #65  <Field WireFormat$FieldType INT64>
			UINT64 = new FieldType("UINT64", 3, JavaType.LONG, 0);
		//   24   51:new             #2   <Class WireFormat$FieldType>
		//   25   54:dup             
		//   26   55:ldc1            #66  <String "UINT64">
		//   27   57:iconst_3        
		//   28   58:getstatic       #63  <Field WireFormat$JavaType WireFormat$JavaType.LONG>
		//   29   61:iconst_0        
		//   30   62:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   31   65:putstatic       #68  <Field WireFormat$FieldType UINT64>
			INT32 = new FieldType("INT32", 4, JavaType.INT, 0);
		//   32   68:new             #2   <Class WireFormat$FieldType>
		//   33   71:dup             
		//   34   72:ldc1            #69  <String "INT32">
		//   35   74:iconst_4        
		//   36   75:getstatic       #72  <Field WireFormat$JavaType WireFormat$JavaType.INT>
		//   37   78:iconst_0        
		//   38   79:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   39   82:putstatic       #74  <Field WireFormat$FieldType INT32>
			FIXED64 = new FieldType("FIXED64", 5, JavaType.LONG, 1);
		//   40   85:new             #2   <Class WireFormat$FieldType>
		//   41   88:dup             
		//   42   89:ldc1            #75  <String "FIXED64">
		//   43   91:iconst_5        
		//   44   92:getstatic       #63  <Field WireFormat$JavaType WireFormat$JavaType.LONG>
		//   45   95:iconst_1        
		//   46   96:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   47   99:putstatic       #77  <Field WireFormat$FieldType FIXED64>
			FIXED32 = new FieldType("FIXED32", 6, JavaType.INT, 5);
		//   48  102:new             #2   <Class WireFormat$FieldType>
		//   49  105:dup             
		//   50  106:ldc1            #78  <String "FIXED32">
		//   51  108:bipush          6
		//   52  110:getstatic       #72  <Field WireFormat$JavaType WireFormat$JavaType.INT>
		//   53  113:iconst_5        
		//   54  114:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   55  117:putstatic       #80  <Field WireFormat$FieldType FIXED32>
			BOOL = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
		//   56  120:new             #2   <Class WireFormat$FieldType>
		//   57  123:dup             
		//   58  124:ldc1            #81  <String "BOOL">
		//   59  126:bipush          7
		//   60  128:getstatic       #84  <Field WireFormat$JavaType WireFormat$JavaType.BOOLEAN>
		//   61  131:iconst_0        
		//   62  132:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//   63  135:putstatic       #86  <Field WireFormat$FieldType BOOL>
			STRING = ((FieldType) (new FieldType("STRING", 8, JavaType.STRING, 2) {

				public boolean isPackable()
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aload_3         
			//    4    4:iload           4
			//    5    6:aconst_null     
			//    6    7:invokespecial   #12  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int, WireFormat$1)>
			//    7   10:return          
			}
			}
));
		//   64  138:new             #10  <Class WireFormat$FieldType$1>
		//   65  141:dup             
		//   66  142:ldc1            #87  <String "STRING">
		//   67  144:bipush          8
		//   68  146:getstatic       #89  <Field WireFormat$JavaType WireFormat$JavaType.STRING>
		//   69  149:iconst_2        
		//   70  150:invokespecial   #90  <Method void WireFormat$FieldType$1(String, int, WireFormat$JavaType, int)>
		//   71  153:putstatic       #92  <Field WireFormat$FieldType STRING>
			GROUP = ((FieldType) (new FieldType("GROUP", 9, JavaType.MESSAGE, 3) {

				public boolean isPackable()
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aload_3         
			//    4    4:iload           4
			//    5    6:aconst_null     
			//    6    7:invokespecial   #12  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int, WireFormat$1)>
			//    7   10:return          
			}
			}
));
		//   72  156:new             #12  <Class WireFormat$FieldType$2>
		//   73  159:dup             
		//   74  160:ldc1            #93  <String "GROUP">
		//   75  162:bipush          9
		//   76  164:getstatic       #95  <Field WireFormat$JavaType WireFormat$JavaType.MESSAGE>
		//   77  167:iconst_3        
		//   78  168:invokespecial   #96  <Method void WireFormat$FieldType$2(String, int, WireFormat$JavaType, int)>
		//   79  171:putstatic       #98  <Field WireFormat$FieldType GROUP>
			MESSAGE = ((FieldType) (new FieldType("MESSAGE", 10, JavaType.MESSAGE, 2) {

				public boolean isPackable()
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aload_3         
			//    4    4:iload           4
			//    5    6:aconst_null     
			//    6    7:invokespecial   #12  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int, WireFormat$1)>
			//    7   10:return          
			}
			}
));
		//   80  174:new             #14  <Class WireFormat$FieldType$3>
		//   81  177:dup             
		//   82  178:ldc1            #99  <String "MESSAGE">
		//   83  180:bipush          10
		//   84  182:getstatic       #95  <Field WireFormat$JavaType WireFormat$JavaType.MESSAGE>
		//   85  185:iconst_2        
		//   86  186:invokespecial   #100 <Method void WireFormat$FieldType$3(String, int, WireFormat$JavaType, int)>
		//   87  189:putstatic       #102 <Field WireFormat$FieldType MESSAGE>
			BYTES = ((FieldType) (new FieldType("BYTES", 11, JavaType.BYTE_STRING, 2) {

				public boolean isPackable()
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aload_3         
			//    4    4:iload           4
			//    5    6:aconst_null     
			//    6    7:invokespecial   #12  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int, WireFormat$1)>
			//    7   10:return          
			}
			}
));
		//   88  192:new             #16  <Class WireFormat$FieldType$4>
		//   89  195:dup             
		//   90  196:ldc1            #103 <String "BYTES">
		//   91  198:bipush          11
		//   92  200:getstatic       #106 <Field WireFormat$JavaType WireFormat$JavaType.BYTE_STRING>
		//   93  203:iconst_2        
		//   94  204:invokespecial   #107 <Method void WireFormat$FieldType$4(String, int, WireFormat$JavaType, int)>
		//   95  207:putstatic       #109 <Field WireFormat$FieldType BYTES>
			UINT32 = new FieldType("UINT32", 12, JavaType.INT, 0);
		//   96  210:new             #2   <Class WireFormat$FieldType>
		//   97  213:dup             
		//   98  214:ldc1            #110 <String "UINT32">
		//   99  216:bipush          12
		//  100  218:getstatic       #72  <Field WireFormat$JavaType WireFormat$JavaType.INT>
		//  101  221:iconst_0        
		//  102  222:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  103  225:putstatic       #112 <Field WireFormat$FieldType UINT32>
			ENUM = new FieldType("ENUM", 13, JavaType.ENUM, 0);
		//  104  228:new             #2   <Class WireFormat$FieldType>
		//  105  231:dup             
		//  106  232:ldc1            #113 <String "ENUM">
		//  107  234:bipush          13
		//  108  236:getstatic       #115 <Field WireFormat$JavaType WireFormat$JavaType.ENUM>
		//  109  239:iconst_0        
		//  110  240:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  111  243:putstatic       #117 <Field WireFormat$FieldType ENUM>
			SFIXED32 = new FieldType("SFIXED32", 14, JavaType.INT, 5);
		//  112  246:new             #2   <Class WireFormat$FieldType>
		//  113  249:dup             
		//  114  250:ldc1            #118 <String "SFIXED32">
		//  115  252:bipush          14
		//  116  254:getstatic       #72  <Field WireFormat$JavaType WireFormat$JavaType.INT>
		//  117  257:iconst_5        
		//  118  258:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  119  261:putstatic       #120 <Field WireFormat$FieldType SFIXED32>
			SFIXED64 = new FieldType("SFIXED64", 15, JavaType.LONG, 1);
		//  120  264:new             #2   <Class WireFormat$FieldType>
		//  121  267:dup             
		//  122  268:ldc1            #121 <String "SFIXED64">
		//  123  270:bipush          15
		//  124  272:getstatic       #63  <Field WireFormat$JavaType WireFormat$JavaType.LONG>
		//  125  275:iconst_1        
		//  126  276:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  127  279:putstatic       #123 <Field WireFormat$FieldType SFIXED64>
			SINT32 = new FieldType("SINT32", 16, JavaType.INT, 0);
		//  128  282:new             #2   <Class WireFormat$FieldType>
		//  129  285:dup             
		//  130  286:ldc1            #124 <String "SINT32">
		//  131  288:bipush          16
		//  132  290:getstatic       #72  <Field WireFormat$JavaType WireFormat$JavaType.INT>
		//  133  293:iconst_0        
		//  134  294:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  135  297:putstatic       #126 <Field WireFormat$FieldType SINT32>
			SINT64 = new FieldType("SINT64", 17, JavaType.LONG, 0);
		//  136  300:new             #2   <Class WireFormat$FieldType>
		//  137  303:dup             
		//  138  304:ldc1            #127 <String "SINT64">
		//  139  306:bipush          17
		//  140  308:getstatic       #63  <Field WireFormat$JavaType WireFormat$JavaType.LONG>
		//  141  311:iconst_0        
		//  142  312:invokespecial   #52  <Method void WireFormat$FieldType(String, int, WireFormat$JavaType, int)>
		//  143  315:putstatic       #129 <Field WireFormat$FieldType SINT64>
			$VALUES = (new FieldType[] {
				DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
				MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
			});
		//  144  318:bipush          18
		//  145  320:anewarray       FieldType[]
		//  146  323:dup             
		//  147  324:iconst_0        
		//  148  325:getstatic       #54  <Field WireFormat$FieldType DOUBLE>
		//  149  328:aastore         
		//  150  329:dup             
		//  151  330:iconst_1        
		//  152  331:getstatic       #59  <Field WireFormat$FieldType FLOAT>
		//  153  334:aastore         
		//  154  335:dup             
		//  155  336:iconst_2        
		//  156  337:getstatic       #65  <Field WireFormat$FieldType INT64>
		//  157  340:aastore         
		//  158  341:dup             
		//  159  342:iconst_3        
		//  160  343:getstatic       #68  <Field WireFormat$FieldType UINT64>
		//  161  346:aastore         
		//  162  347:dup             
		//  163  348:iconst_4        
		//  164  349:getstatic       #74  <Field WireFormat$FieldType INT32>
		//  165  352:aastore         
		//  166  353:dup             
		//  167  354:iconst_5        
		//  168  355:getstatic       #77  <Field WireFormat$FieldType FIXED64>
		//  169  358:aastore         
		//  170  359:dup             
		//  171  360:bipush          6
		//  172  362:getstatic       #80  <Field WireFormat$FieldType FIXED32>
		//  173  365:aastore         
		//  174  366:dup             
		//  175  367:bipush          7
		//  176  369:getstatic       #86  <Field WireFormat$FieldType BOOL>
		//  177  372:aastore         
		//  178  373:dup             
		//  179  374:bipush          8
		//  180  376:getstatic       #92  <Field WireFormat$FieldType STRING>
		//  181  379:aastore         
		//  182  380:dup             
		//  183  381:bipush          9
		//  184  383:getstatic       #98  <Field WireFormat$FieldType GROUP>
		//  185  386:aastore         
		//  186  387:dup             
		//  187  388:bipush          10
		//  188  390:getstatic       #102 <Field WireFormat$FieldType MESSAGE>
		//  189  393:aastore         
		//  190  394:dup             
		//  191  395:bipush          11
		//  192  397:getstatic       #109 <Field WireFormat$FieldType BYTES>
		//  193  400:aastore         
		//  194  401:dup             
		//  195  402:bipush          12
		//  196  404:getstatic       #112 <Field WireFormat$FieldType UINT32>
		//  197  407:aastore         
		//  198  408:dup             
		//  199  409:bipush          13
		//  200  411:getstatic       #117 <Field WireFormat$FieldType ENUM>
		//  201  414:aastore         
		//  202  415:dup             
		//  203  416:bipush          14
		//  204  418:getstatic       #120 <Field WireFormat$FieldType SFIXED32>
		//  205  421:aastore         
		//  206  422:dup             
		//  207  423:bipush          15
		//  208  425:getstatic       #123 <Field WireFormat$FieldType SFIXED64>
		//  209  428:aastore         
		//  210  429:dup             
		//  211  430:bipush          16
		//  212  432:getstatic       #126 <Field WireFormat$FieldType SINT32>
		//  213  435:aastore         
		//  214  436:dup             
		//  215  437:bipush          17
		//  216  439:getstatic       #129 <Field WireFormat$FieldType SINT64>
		//  217  442:aastore         
		//  218  443:putstatic       #131 <Field WireFormat$FieldType[] $VALUES>
		//* 219  446:return          
		}

		private FieldType(String s, int i, JavaType javatype, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #135 <Method void Enum(String, int)>
			javaType = javatype;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #137 <Field WireFormat$JavaType javaType>
			wireType = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #139 <Field int wireType>
		//   10   17:return          
		}

	}

	static final class JavaType extends Enum
	{

		public static JavaType valueOf(String s)
		{
			return (JavaType)Enum.valueOf(com/crashlytics/android/core/WireFormat$JavaType, s);
		//    0    0:ldc1            #2   <Class WireFormat$JavaType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #103 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class WireFormat$JavaType>
		//    4    9:areturn         
		}

		public static JavaType[] values()
		{
			return (JavaType[])((JavaType []) ($VALUES)).clone();
		//    0    0:getstatic       #91  <Field WireFormat$JavaType[] $VALUES>
		//    1    3:invokevirtual   #110 <Method Object _5B_Lcom.crashlytics.android.core.WireFormat$JavaType_3B_.clone()>
		//    2    6:checkcast       #106 <Class WireFormat$JavaType[]>
		//    3    9:areturn         
		}

		Object getDefaultDefault()
		{
			return defaultDefault;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field Object defaultDefault>
		//    2    4:areturn         
		}

		private static final JavaType $VALUES[];
		public static final JavaType BOOLEAN;
		public static final JavaType BYTE_STRING;
		public static final JavaType DOUBLE;
		public static final JavaType ENUM;
		public static final JavaType FLOAT;
		public static final JavaType INT;
		public static final JavaType LONG;
		public static final JavaType MESSAGE;
		public static final JavaType STRING;
		private final Object defaultDefault;

		static 
		{
			INT = new JavaType("INT", 0, ((Object) (Integer.valueOf(0))));
		//    0    0:new             #2   <Class WireFormat$JavaType>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "INT">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokestatic    #31  <Method Integer Integer.valueOf(int)>
		//    6   11:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//    7   14:putstatic       #37  <Field WireFormat$JavaType INT>
			LONG = new JavaType("LONG", 1, ((Object) (Long.valueOf(0L))));
		//    8   17:new             #2   <Class WireFormat$JavaType>
		//    9   20:dup             
		//   10   21:ldc1            #38  <String "LONG">
		//   11   23:iconst_1        
		//   12   24:lconst_0        
		//   13   25:invokestatic    #43  <Method Long Long.valueOf(long)>
		//   14   28:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   15   31:putstatic       #45  <Field WireFormat$JavaType LONG>
			FLOAT = new JavaType("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
		//   16   34:new             #2   <Class WireFormat$JavaType>
		//   17   37:dup             
		//   18   38:ldc1            #46  <String "FLOAT">
		//   19   40:iconst_2        
		//   20   41:fconst_0        
		//   21   42:invokestatic    #51  <Method Float Float.valueOf(float)>
		//   22   45:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   23   48:putstatic       #53  <Field WireFormat$JavaType FLOAT>
			DOUBLE = new JavaType("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
		//   24   51:new             #2   <Class WireFormat$JavaType>
		//   25   54:dup             
		//   26   55:ldc1            #54  <String "DOUBLE">
		//   27   57:iconst_3        
		//   28   58:dconst_0        
		//   29   59:invokestatic    #59  <Method Double Double.valueOf(double)>
		//   30   62:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   31   65:putstatic       #61  <Field WireFormat$JavaType DOUBLE>
			BOOLEAN = new JavaType("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
		//   32   68:new             #2   <Class WireFormat$JavaType>
		//   33   71:dup             
		//   34   72:ldc1            #62  <String "BOOLEAN">
		//   35   74:iconst_4        
		//   36   75:iconst_0        
		//   37   76:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
		//   38   79:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   39   82:putstatic       #69  <Field WireFormat$JavaType BOOLEAN>
			STRING = new JavaType("STRING", 5, "");
		//   40   85:new             #2   <Class WireFormat$JavaType>
		//   41   88:dup             
		//   42   89:ldc1            #70  <String "STRING">
		//   43   91:iconst_5        
		//   44   92:ldc1            #72  <String "">
		//   45   94:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   46   97:putstatic       #74  <Field WireFormat$JavaType STRING>
			BYTE_STRING = new JavaType("BYTE_STRING", 6, ((Object) (ByteString.EMPTY)));
		//   47  100:new             #2   <Class WireFormat$JavaType>
		//   48  103:dup             
		//   49  104:ldc1            #75  <String "BYTE_STRING">
		//   50  106:bipush          6
		//   51  108:getstatic       #81  <Field ByteString ByteString.EMPTY>
		//   52  111:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   53  114:putstatic       #83  <Field WireFormat$JavaType BYTE_STRING>
			ENUM = new JavaType("ENUM", 7, ((Object) (null)));
		//   54  117:new             #2   <Class WireFormat$JavaType>
		//   55  120:dup             
		//   56  121:ldc1            #84  <String "ENUM">
		//   57  123:bipush          7
		//   58  125:aconst_null     
		//   59  126:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   60  129:putstatic       #86  <Field WireFormat$JavaType ENUM>
			MESSAGE = new JavaType("MESSAGE", 8, ((Object) (null)));
		//   61  132:new             #2   <Class WireFormat$JavaType>
		//   62  135:dup             
		//   63  136:ldc1            #87  <String "MESSAGE">
		//   64  138:bipush          8
		//   65  140:aconst_null     
		//   66  141:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
		//   67  144:putstatic       #89  <Field WireFormat$JavaType MESSAGE>
			$VALUES = (new JavaType[] {
				INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
			});
		//   68  147:bipush          9
		//   69  149:anewarray       JavaType[]
		//   70  152:dup             
		//   71  153:iconst_0        
		//   72  154:getstatic       #37  <Field WireFormat$JavaType INT>
		//   73  157:aastore         
		//   74  158:dup             
		//   75  159:iconst_1        
		//   76  160:getstatic       #45  <Field WireFormat$JavaType LONG>
		//   77  163:aastore         
		//   78  164:dup             
		//   79  165:iconst_2        
		//   80  166:getstatic       #53  <Field WireFormat$JavaType FLOAT>
		//   81  169:aastore         
		//   82  170:dup             
		//   83  171:iconst_3        
		//   84  172:getstatic       #61  <Field WireFormat$JavaType DOUBLE>
		//   85  175:aastore         
		//   86  176:dup             
		//   87  177:iconst_4        
		//   88  178:getstatic       #69  <Field WireFormat$JavaType BOOLEAN>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:iconst_5        
		//   92  184:getstatic       #74  <Field WireFormat$JavaType STRING>
		//   93  187:aastore         
		//   94  188:dup             
		//   95  189:bipush          6
		//   96  191:getstatic       #83  <Field WireFormat$JavaType BYTE_STRING>
		//   97  194:aastore         
		//   98  195:dup             
		//   99  196:bipush          7
		//  100  198:getstatic       #86  <Field WireFormat$JavaType ENUM>
		//  101  201:aastore         
		//  102  202:dup             
		//  103  203:bipush          8
		//  104  205:getstatic       #89  <Field WireFormat$JavaType MESSAGE>
		//  105  208:aastore         
		//  106  209:putstatic       #91  <Field WireFormat$JavaType[] $VALUES>
		//* 107  212:return          
		}

		private JavaType(String s, int i, Object obj)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #95  <Method void Enum(String, int)>
			defaultDefault = obj;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #97  <Field Object defaultDefault>
		//    7   11:return          
		}
	}


	private WireFormat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
	//    2    4:return          
	}

	public static int getTagFieldNumber(int i)
	{
		return i >>> 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:ireturn         
	}

	static int getTagWireType(int i)
	{
		return i & 7;
	//    0    0:iload_0         
	//    1    1:bipush          7
	//    2    3:iand            
	//    3    4:ireturn         
	}

	static int makeTag(int i, int j)
	{
		return i << 3 | j;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:iload_1         
	//    4    4:ior             
	//    5    5:ireturn         
	}

	static final int MESSAGE_SET_ITEM = 1;
	static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
	static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
	static final int MESSAGE_SET_MESSAGE = 3;
	static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
	static final int MESSAGE_SET_TYPE_ID = 2;
	static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
	static final int TAG_TYPE_BITS = 3;
	static final int TAG_TYPE_MASK = 7;
	public static final int WIRETYPE_END_GROUP = 4;
	public static final int WIRETYPE_FIXED32 = 5;
	public static final int WIRETYPE_FIXED64 = 1;
	public static final int WIRETYPE_LENGTH_DELIMITED = 2;
	public static final int WIRETYPE_START_GROUP = 3;
	public static final int WIRETYPE_VARINT = 0;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:iconst_3        
	//    2    2:invokestatic    #49  <Method int makeTag(int, int)>
	//    3    5:putstatic       #51  <Field int MESSAGE_SET_ITEM_TAG>
	//    4    8:iconst_1        
	//    5    9:iconst_4        
	//    6   10:invokestatic    #49  <Method int makeTag(int, int)>
	//    7   13:putstatic       #53  <Field int MESSAGE_SET_ITEM_END_TAG>
	//    8   16:iconst_2        
	//    9   17:iconst_0        
	//   10   18:invokestatic    #49  <Method int makeTag(int, int)>
	//   11   21:putstatic       #55  <Field int MESSAGE_SET_TYPE_ID_TAG>
	//   12   24:iconst_3        
	//   13   25:iconst_2        
	//   14   26:invokestatic    #49  <Method int makeTag(int, int)>
	//   15   29:putstatic       #57  <Field int MESSAGE_SET_MESSAGE_TAG>
	//*  16   32:return          
	}
}
