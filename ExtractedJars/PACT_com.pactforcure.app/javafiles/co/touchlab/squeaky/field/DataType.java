// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import co.touchlab.squeaky.field.types.BigDecimalStringType;
import co.touchlab.squeaky.field.types.BigIntegerType;
import co.touchlab.squeaky.field.types.BooleanCharType;
import co.touchlab.squeaky.field.types.BooleanIntegerType;
import co.touchlab.squeaky.field.types.BooleanObjectType;
import co.touchlab.squeaky.field.types.BooleanType;
import co.touchlab.squeaky.field.types.ByteArrayType;
import co.touchlab.squeaky.field.types.ByteObjectType;
import co.touchlab.squeaky.field.types.ByteType;
import co.touchlab.squeaky.field.types.CharType;
import co.touchlab.squeaky.field.types.CharacterObjectType;
import co.touchlab.squeaky.field.types.DateLongType;
import co.touchlab.squeaky.field.types.DateStringType;
import co.touchlab.squeaky.field.types.DateTimeType;
import co.touchlab.squeaky.field.types.DateType;
import co.touchlab.squeaky.field.types.DoubleObjectType;
import co.touchlab.squeaky.field.types.DoubleType;
import co.touchlab.squeaky.field.types.EnumIntegerType;
import co.touchlab.squeaky.field.types.EnumStringType;
import co.touchlab.squeaky.field.types.FloatObjectType;
import co.touchlab.squeaky.field.types.FloatType;
import co.touchlab.squeaky.field.types.IntType;
import co.touchlab.squeaky.field.types.IntegerObjectType;
import co.touchlab.squeaky.field.types.LongObjectType;
import co.touchlab.squeaky.field.types.LongStringType;
import co.touchlab.squeaky.field.types.LongType;
import co.touchlab.squeaky.field.types.SerializableType;
import co.touchlab.squeaky.field.types.ShortObjectType;
import co.touchlab.squeaky.field.types.ShortType;
import co.touchlab.squeaky.field.types.StringBytesType;
import co.touchlab.squeaky.field.types.StringType;
import co.touchlab.squeaky.field.types.TimeStampType;

// Referenced classes of package co.touchlab.squeaky.field:
//			DataPersister

public final class DataType extends Enum
{

	private DataType(String s, int i, DataPersister datapersister)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #315 <Method void Enum(String, int)>
		dataPersister = datapersister;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #317 <Field DataPersister dataPersister>
	//    7   11:return          
	}

	public static DataType valueOf(String s)
	{
		return (DataType)Enum.valueOf(co/touchlab/squeaky/field/DataType, s);
	//    0    0:ldc1            #2   <Class DataType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #324 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DataType>
	//    4    9:areturn         
	}

	public static DataType[] values()
	{
		return (DataType[])((DataType []) ($VALUES)).clone();
	//    0    0:getstatic       #311 <Field DataType[] $VALUES>
	//    1    3:invokevirtual   #331 <Method Object _5B_Lco.touchlab.squeaky.field.DataType_3B_.clone()>
	//    2    6:checkcast       #327 <Class DataType[]>
	//    3    9:areturn         
	}

	public DataPersister getDataPersister()
	{
		return dataPersister;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field DataPersister dataPersister>
	//    2    4:areturn         
	}

	private static final DataType $VALUES[];
	public static final DataType BIG_DECIMAL;
	public static final DataType BIG_INTEGER;
	public static final DataType BOOLEAN;
	public static final DataType BOOLEAN_CHAR;
	public static final DataType BOOLEAN_INTEGER;
	public static final DataType BOOLEAN_OBJ;
	public static final DataType BYTE;
	public static final DataType BYTE_ARRAY;
	public static final DataType BYTE_OBJ;
	public static final DataType CHAR;
	public static final DataType CHAR_OBJ;
	public static final DataType DATE;
	public static final DataType DATE_LONG;
	public static final DataType DATE_STRING;
	public static final DataType DATE_TIME;
	public static final DataType DOUBLE;
	public static final DataType DOUBLE_OBJ;
	public static final DataType ENUM_INTEGER;
	public static final DataType ENUM_STRING;
	public static final DataType FLOAT;
	public static final DataType FLOAT_OBJ;
	public static final DataType INTEGER;
	public static final DataType INTEGER_OBJ;
	public static final DataType LONG;
	public static final DataType LONG_OBJ;
	public static final DataType LONG_STRING;
	public static final DataType SERIALIZABLE;
	public static final DataType SHORT;
	public static final DataType SHORT_OBJ;
	public static final DataType STRING;
	public static final DataType STRING_BYTES;
	public static final DataType TIME_STAMP;
	public static final DataType UNKNOWN;
	private final DataPersister dataPersister;

	static 
	{
		STRING = new DataType("STRING", 0, ((DataPersister) (StringType.getSingleton())));
	//    0    0:new             #2   <Class DataType>
	//    1    3:dup             
	//    2    4:ldc1            #46  <String "STRING">
	//    3    6:iconst_0        
	//    4    7:invokestatic    #52  <Method StringType StringType.getSingleton()>
	//    5   10:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//    6   13:putstatic       #58  <Field DataType STRING>
		LONG_STRING = new DataType("LONG_STRING", 1, ((DataPersister) (LongStringType.getSingleton())));
	//    7   16:new             #2   <Class DataType>
	//    8   19:dup             
	//    9   20:ldc1            #59  <String "LONG_STRING">
	//   10   22:iconst_1        
	//   11   23:invokestatic    #64  <Method LongStringType LongStringType.getSingleton()>
	//   12   26:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   13   29:putstatic       #66  <Field DataType LONG_STRING>
		STRING_BYTES = new DataType("STRING_BYTES", 2, ((DataPersister) (StringBytesType.getSingleton())));
	//   14   32:new             #2   <Class DataType>
	//   15   35:dup             
	//   16   36:ldc1            #67  <String "STRING_BYTES">
	//   17   38:iconst_2        
	//   18   39:invokestatic    #72  <Method StringBytesType StringBytesType.getSingleton()>
	//   19   42:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   20   45:putstatic       #74  <Field DataType STRING_BYTES>
		BOOLEAN = new DataType("BOOLEAN", 3, ((DataPersister) (BooleanType.getSingleton())));
	//   21   48:new             #2   <Class DataType>
	//   22   51:dup             
	//   23   52:ldc1            #75  <String "BOOLEAN">
	//   24   54:iconst_3        
	//   25   55:invokestatic    #80  <Method BooleanType BooleanType.getSingleton()>
	//   26   58:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   27   61:putstatic       #82  <Field DataType BOOLEAN>
		BOOLEAN_OBJ = new DataType("BOOLEAN_OBJ", 4, ((DataPersister) (BooleanObjectType.getSingleton())));
	//   28   64:new             #2   <Class DataType>
	//   29   67:dup             
	//   30   68:ldc1            #83  <String "BOOLEAN_OBJ">
	//   31   70:iconst_4        
	//   32   71:invokestatic    #88  <Method BooleanObjectType BooleanObjectType.getSingleton()>
	//   33   74:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   34   77:putstatic       #90  <Field DataType BOOLEAN_OBJ>
		BOOLEAN_CHAR = new DataType("BOOLEAN_CHAR", 5, ((DataPersister) (BooleanCharType.getSingleton())));
	//   35   80:new             #2   <Class DataType>
	//   36   83:dup             
	//   37   84:ldc1            #91  <String "BOOLEAN_CHAR">
	//   38   86:iconst_5        
	//   39   87:invokestatic    #96  <Method BooleanCharType BooleanCharType.getSingleton()>
	//   40   90:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   41   93:putstatic       #98  <Field DataType BOOLEAN_CHAR>
		BOOLEAN_INTEGER = new DataType("BOOLEAN_INTEGER", 6, ((DataPersister) (BooleanIntegerType.getSingleton())));
	//   42   96:new             #2   <Class DataType>
	//   43   99:dup             
	//   44  100:ldc1            #99  <String "BOOLEAN_INTEGER">
	//   45  102:bipush          6
	//   46  104:invokestatic    #104 <Method BooleanIntegerType BooleanIntegerType.getSingleton()>
	//   47  107:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   48  110:putstatic       #106 <Field DataType BOOLEAN_INTEGER>
		DATE = new DataType("DATE", 7, ((DataPersister) (DateType.getSingleton())));
	//   49  113:new             #2   <Class DataType>
	//   50  116:dup             
	//   51  117:ldc1            #107 <String "DATE">
	//   52  119:bipush          7
	//   53  121:invokestatic    #112 <Method DateType DateType.getSingleton()>
	//   54  124:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   55  127:putstatic       #114 <Field DataType DATE>
		DATE_LONG = new DataType("DATE_LONG", 8, ((DataPersister) (DateLongType.getSingleton())));
	//   56  130:new             #2   <Class DataType>
	//   57  133:dup             
	//   58  134:ldc1            #115 <String "DATE_LONG">
	//   59  136:bipush          8
	//   60  138:invokestatic    #120 <Method DateLongType DateLongType.getSingleton()>
	//   61  141:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   62  144:putstatic       #122 <Field DataType DATE_LONG>
		DATE_STRING = new DataType("DATE_STRING", 9, ((DataPersister) (DateStringType.getSingleton())));
	//   63  147:new             #2   <Class DataType>
	//   64  150:dup             
	//   65  151:ldc1            #123 <String "DATE_STRING">
	//   66  153:bipush          9
	//   67  155:invokestatic    #128 <Method DateStringType DateStringType.getSingleton()>
	//   68  158:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   69  161:putstatic       #130 <Field DataType DATE_STRING>
		CHAR = new DataType("CHAR", 10, ((DataPersister) (CharType.getSingleton())));
	//   70  164:new             #2   <Class DataType>
	//   71  167:dup             
	//   72  168:ldc1            #131 <String "CHAR">
	//   73  170:bipush          10
	//   74  172:invokestatic    #136 <Method CharType CharType.getSingleton()>
	//   75  175:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   76  178:putstatic       #138 <Field DataType CHAR>
		CHAR_OBJ = new DataType("CHAR_OBJ", 11, ((DataPersister) (CharacterObjectType.getSingleton())));
	//   77  181:new             #2   <Class DataType>
	//   78  184:dup             
	//   79  185:ldc1            #139 <String "CHAR_OBJ">
	//   80  187:bipush          11
	//   81  189:invokestatic    #144 <Method CharacterObjectType CharacterObjectType.getSingleton()>
	//   82  192:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   83  195:putstatic       #146 <Field DataType CHAR_OBJ>
		BYTE = new DataType("BYTE", 12, ((DataPersister) (ByteType.getSingleton())));
	//   84  198:new             #2   <Class DataType>
	//   85  201:dup             
	//   86  202:ldc1            #147 <String "BYTE">
	//   87  204:bipush          12
	//   88  206:invokestatic    #152 <Method ByteType ByteType.getSingleton()>
	//   89  209:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   90  212:putstatic       #154 <Field DataType BYTE>
		BYTE_ARRAY = new DataType("BYTE_ARRAY", 13, ((DataPersister) (ByteArrayType.getSingleton())));
	//   91  215:new             #2   <Class DataType>
	//   92  218:dup             
	//   93  219:ldc1            #155 <String "BYTE_ARRAY">
	//   94  221:bipush          13
	//   95  223:invokestatic    #160 <Method ByteArrayType ByteArrayType.getSingleton()>
	//   96  226:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//   97  229:putstatic       #162 <Field DataType BYTE_ARRAY>
		BYTE_OBJ = new DataType("BYTE_OBJ", 14, ((DataPersister) (ByteObjectType.getSingleton())));
	//   98  232:new             #2   <Class DataType>
	//   99  235:dup             
	//  100  236:ldc1            #163 <String "BYTE_OBJ">
	//  101  238:bipush          14
	//  102  240:invokestatic    #168 <Method ByteObjectType ByteObjectType.getSingleton()>
	//  103  243:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  104  246:putstatic       #170 <Field DataType BYTE_OBJ>
		SHORT = new DataType("SHORT", 15, ((DataPersister) (ShortType.getSingleton())));
	//  105  249:new             #2   <Class DataType>
	//  106  252:dup             
	//  107  253:ldc1            #171 <String "SHORT">
	//  108  255:bipush          15
	//  109  257:invokestatic    #176 <Method ShortType ShortType.getSingleton()>
	//  110  260:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  111  263:putstatic       #178 <Field DataType SHORT>
		SHORT_OBJ = new DataType("SHORT_OBJ", 16, ((DataPersister) (ShortObjectType.getSingleton())));
	//  112  266:new             #2   <Class DataType>
	//  113  269:dup             
	//  114  270:ldc1            #179 <String "SHORT_OBJ">
	//  115  272:bipush          16
	//  116  274:invokestatic    #184 <Method ShortObjectType ShortObjectType.getSingleton()>
	//  117  277:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  118  280:putstatic       #186 <Field DataType SHORT_OBJ>
		INTEGER = new DataType("INTEGER", 17, ((DataPersister) (IntType.getSingleton())));
	//  119  283:new             #2   <Class DataType>
	//  120  286:dup             
	//  121  287:ldc1            #187 <String "INTEGER">
	//  122  289:bipush          17
	//  123  291:invokestatic    #192 <Method IntType IntType.getSingleton()>
	//  124  294:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  125  297:putstatic       #194 <Field DataType INTEGER>
		INTEGER_OBJ = new DataType("INTEGER_OBJ", 18, ((DataPersister) (IntegerObjectType.getSingleton())));
	//  126  300:new             #2   <Class DataType>
	//  127  303:dup             
	//  128  304:ldc1            #195 <String "INTEGER_OBJ">
	//  129  306:bipush          18
	//  130  308:invokestatic    #200 <Method IntegerObjectType IntegerObjectType.getSingleton()>
	//  131  311:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  132  314:putstatic       #202 <Field DataType INTEGER_OBJ>
		LONG = new DataType("LONG", 19, ((DataPersister) (LongType.getSingleton())));
	//  133  317:new             #2   <Class DataType>
	//  134  320:dup             
	//  135  321:ldc1            #203 <String "LONG">
	//  136  323:bipush          19
	//  137  325:invokestatic    #208 <Method LongType LongType.getSingleton()>
	//  138  328:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  139  331:putstatic       #210 <Field DataType LONG>
		LONG_OBJ = new DataType("LONG_OBJ", 20, ((DataPersister) (LongObjectType.getSingleton())));
	//  140  334:new             #2   <Class DataType>
	//  141  337:dup             
	//  142  338:ldc1            #211 <String "LONG_OBJ">
	//  143  340:bipush          20
	//  144  342:invokestatic    #216 <Method LongObjectType LongObjectType.getSingleton()>
	//  145  345:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  146  348:putstatic       #218 <Field DataType LONG_OBJ>
		FLOAT = new DataType("FLOAT", 21, ((DataPersister) (FloatType.getSingleton())));
	//  147  351:new             #2   <Class DataType>
	//  148  354:dup             
	//  149  355:ldc1            #219 <String "FLOAT">
	//  150  357:bipush          21
	//  151  359:invokestatic    #224 <Method FloatType FloatType.getSingleton()>
	//  152  362:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  153  365:putstatic       #226 <Field DataType FLOAT>
		FLOAT_OBJ = new DataType("FLOAT_OBJ", 22, ((DataPersister) (FloatObjectType.getSingleton())));
	//  154  368:new             #2   <Class DataType>
	//  155  371:dup             
	//  156  372:ldc1            #227 <String "FLOAT_OBJ">
	//  157  374:bipush          22
	//  158  376:invokestatic    #232 <Method FloatObjectType FloatObjectType.getSingleton()>
	//  159  379:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  160  382:putstatic       #234 <Field DataType FLOAT_OBJ>
		DOUBLE = new DataType("DOUBLE", 23, ((DataPersister) (DoubleType.getSingleton())));
	//  161  385:new             #2   <Class DataType>
	//  162  388:dup             
	//  163  389:ldc1            #235 <String "DOUBLE">
	//  164  391:bipush          23
	//  165  393:invokestatic    #240 <Method DoubleType DoubleType.getSingleton()>
	//  166  396:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  167  399:putstatic       #242 <Field DataType DOUBLE>
		DOUBLE_OBJ = new DataType("DOUBLE_OBJ", 24, ((DataPersister) (DoubleObjectType.getSingleton())));
	//  168  402:new             #2   <Class DataType>
	//  169  405:dup             
	//  170  406:ldc1            #243 <String "DOUBLE_OBJ">
	//  171  408:bipush          24
	//  172  410:invokestatic    #248 <Method DoubleObjectType DoubleObjectType.getSingleton()>
	//  173  413:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  174  416:putstatic       #250 <Field DataType DOUBLE_OBJ>
		SERIALIZABLE = new DataType("SERIALIZABLE", 25, ((DataPersister) (SerializableType.getSingleton())));
	//  175  419:new             #2   <Class DataType>
	//  176  422:dup             
	//  177  423:ldc1            #251 <String "SERIALIZABLE">
	//  178  425:bipush          25
	//  179  427:invokestatic    #256 <Method SerializableType SerializableType.getSingleton()>
	//  180  430:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  181  433:putstatic       #258 <Field DataType SERIALIZABLE>
		ENUM_STRING = new DataType("ENUM_STRING", 26, ((DataPersister) (EnumStringType.getSingleton())));
	//  182  436:new             #2   <Class DataType>
	//  183  439:dup             
	//  184  440:ldc2            #259 <String "ENUM_STRING">
	//  185  443:bipush          26
	//  186  445:invokestatic    #264 <Method EnumStringType EnumStringType.getSingleton()>
	//  187  448:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  188  451:putstatic       #266 <Field DataType ENUM_STRING>
		ENUM_INTEGER = new DataType("ENUM_INTEGER", 27, ((DataPersister) (EnumIntegerType.getSingleton())));
	//  189  454:new             #2   <Class DataType>
	//  190  457:dup             
	//  191  458:ldc2            #267 <String "ENUM_INTEGER">
	//  192  461:bipush          27
	//  193  463:invokestatic    #272 <Method EnumIntegerType EnumIntegerType.getSingleton()>
	//  194  466:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  195  469:putstatic       #274 <Field DataType ENUM_INTEGER>
		BIG_INTEGER = new DataType("BIG_INTEGER", 28, ((DataPersister) (BigIntegerType.getSingleton())));
	//  196  472:new             #2   <Class DataType>
	//  197  475:dup             
	//  198  476:ldc2            #275 <String "BIG_INTEGER">
	//  199  479:bipush          28
	//  200  481:invokestatic    #280 <Method BigIntegerType BigIntegerType.getSingleton()>
	//  201  484:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  202  487:putstatic       #282 <Field DataType BIG_INTEGER>
		BIG_DECIMAL = new DataType("BIG_DECIMAL", 29, ((DataPersister) (BigDecimalStringType.getSingleton())));
	//  203  490:new             #2   <Class DataType>
	//  204  493:dup             
	//  205  494:ldc2            #283 <String "BIG_DECIMAL">
	//  206  497:bipush          29
	//  207  499:invokestatic    #288 <Method BigDecimalStringType BigDecimalStringType.getSingleton()>
	//  208  502:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  209  505:putstatic       #290 <Field DataType BIG_DECIMAL>
		DATE_TIME = new DataType("DATE_TIME", 30, ((DataPersister) (DateTimeType.getSingleton())));
	//  210  508:new             #2   <Class DataType>
	//  211  511:dup             
	//  212  512:ldc2            #291 <String "DATE_TIME">
	//  213  515:bipush          30
	//  214  517:invokestatic    #296 <Method DateTimeType DateTimeType.getSingleton()>
	//  215  520:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  216  523:putstatic       #298 <Field DataType DATE_TIME>
		TIME_STAMP = new DataType("TIME_STAMP", 31, ((DataPersister) (TimeStampType.getSingleton())));
	//  217  526:new             #2   <Class DataType>
	//  218  529:dup             
	//  219  530:ldc2            #299 <String "TIME_STAMP">
	//  220  533:bipush          31
	//  221  535:invokestatic    #304 <Method TimeStampType TimeStampType.getSingleton()>
	//  222  538:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  223  541:putstatic       #306 <Field DataType TIME_STAMP>
		UNKNOWN = new DataType("UNKNOWN", 32, ((DataPersister) (null)));
	//  224  544:new             #2   <Class DataType>
	//  225  547:dup             
	//  226  548:ldc2            #307 <String "UNKNOWN">
	//  227  551:bipush          32
	//  228  553:aconst_null     
	//  229  554:invokespecial   #56  <Method void DataType(String, int, DataPersister)>
	//  230  557:putstatic       #309 <Field DataType UNKNOWN>
		$VALUES = (new DataType[] {
			STRING, LONG_STRING, STRING_BYTES, BOOLEAN, BOOLEAN_OBJ, BOOLEAN_CHAR, BOOLEAN_INTEGER, DATE, DATE_LONG, DATE_STRING, 
			CHAR, CHAR_OBJ, BYTE, BYTE_ARRAY, BYTE_OBJ, SHORT, SHORT_OBJ, INTEGER, INTEGER_OBJ, LONG, 
			LONG_OBJ, FLOAT, FLOAT_OBJ, DOUBLE, DOUBLE_OBJ, SERIALIZABLE, ENUM_STRING, ENUM_INTEGER, BIG_INTEGER, BIG_DECIMAL, 
			DATE_TIME, TIME_STAMP, UNKNOWN
		});
	//  231  560:bipush          33
	//  232  562:anewarray       DataType[]
	//  233  565:dup             
	//  234  566:iconst_0        
	//  235  567:getstatic       #58  <Field DataType STRING>
	//  236  570:aastore         
	//  237  571:dup             
	//  238  572:iconst_1        
	//  239  573:getstatic       #66  <Field DataType LONG_STRING>
	//  240  576:aastore         
	//  241  577:dup             
	//  242  578:iconst_2        
	//  243  579:getstatic       #74  <Field DataType STRING_BYTES>
	//  244  582:aastore         
	//  245  583:dup             
	//  246  584:iconst_3        
	//  247  585:getstatic       #82  <Field DataType BOOLEAN>
	//  248  588:aastore         
	//  249  589:dup             
	//  250  590:iconst_4        
	//  251  591:getstatic       #90  <Field DataType BOOLEAN_OBJ>
	//  252  594:aastore         
	//  253  595:dup             
	//  254  596:iconst_5        
	//  255  597:getstatic       #98  <Field DataType BOOLEAN_CHAR>
	//  256  600:aastore         
	//  257  601:dup             
	//  258  602:bipush          6
	//  259  604:getstatic       #106 <Field DataType BOOLEAN_INTEGER>
	//  260  607:aastore         
	//  261  608:dup             
	//  262  609:bipush          7
	//  263  611:getstatic       #114 <Field DataType DATE>
	//  264  614:aastore         
	//  265  615:dup             
	//  266  616:bipush          8
	//  267  618:getstatic       #122 <Field DataType DATE_LONG>
	//  268  621:aastore         
	//  269  622:dup             
	//  270  623:bipush          9
	//  271  625:getstatic       #130 <Field DataType DATE_STRING>
	//  272  628:aastore         
	//  273  629:dup             
	//  274  630:bipush          10
	//  275  632:getstatic       #138 <Field DataType CHAR>
	//  276  635:aastore         
	//  277  636:dup             
	//  278  637:bipush          11
	//  279  639:getstatic       #146 <Field DataType CHAR_OBJ>
	//  280  642:aastore         
	//  281  643:dup             
	//  282  644:bipush          12
	//  283  646:getstatic       #154 <Field DataType BYTE>
	//  284  649:aastore         
	//  285  650:dup             
	//  286  651:bipush          13
	//  287  653:getstatic       #162 <Field DataType BYTE_ARRAY>
	//  288  656:aastore         
	//  289  657:dup             
	//  290  658:bipush          14
	//  291  660:getstatic       #170 <Field DataType BYTE_OBJ>
	//  292  663:aastore         
	//  293  664:dup             
	//  294  665:bipush          15
	//  295  667:getstatic       #178 <Field DataType SHORT>
	//  296  670:aastore         
	//  297  671:dup             
	//  298  672:bipush          16
	//  299  674:getstatic       #186 <Field DataType SHORT_OBJ>
	//  300  677:aastore         
	//  301  678:dup             
	//  302  679:bipush          17
	//  303  681:getstatic       #194 <Field DataType INTEGER>
	//  304  684:aastore         
	//  305  685:dup             
	//  306  686:bipush          18
	//  307  688:getstatic       #202 <Field DataType INTEGER_OBJ>
	//  308  691:aastore         
	//  309  692:dup             
	//  310  693:bipush          19
	//  311  695:getstatic       #210 <Field DataType LONG>
	//  312  698:aastore         
	//  313  699:dup             
	//  314  700:bipush          20
	//  315  702:getstatic       #218 <Field DataType LONG_OBJ>
	//  316  705:aastore         
	//  317  706:dup             
	//  318  707:bipush          21
	//  319  709:getstatic       #226 <Field DataType FLOAT>
	//  320  712:aastore         
	//  321  713:dup             
	//  322  714:bipush          22
	//  323  716:getstatic       #234 <Field DataType FLOAT_OBJ>
	//  324  719:aastore         
	//  325  720:dup             
	//  326  721:bipush          23
	//  327  723:getstatic       #242 <Field DataType DOUBLE>
	//  328  726:aastore         
	//  329  727:dup             
	//  330  728:bipush          24
	//  331  730:getstatic       #250 <Field DataType DOUBLE_OBJ>
	//  332  733:aastore         
	//  333  734:dup             
	//  334  735:bipush          25
	//  335  737:getstatic       #258 <Field DataType SERIALIZABLE>
	//  336  740:aastore         
	//  337  741:dup             
	//  338  742:bipush          26
	//  339  744:getstatic       #266 <Field DataType ENUM_STRING>
	//  340  747:aastore         
	//  341  748:dup             
	//  342  749:bipush          27
	//  343  751:getstatic       #274 <Field DataType ENUM_INTEGER>
	//  344  754:aastore         
	//  345  755:dup             
	//  346  756:bipush          28
	//  347  758:getstatic       #282 <Field DataType BIG_INTEGER>
	//  348  761:aastore         
	//  349  762:dup             
	//  350  763:bipush          29
	//  351  765:getstatic       #290 <Field DataType BIG_DECIMAL>
	//  352  768:aastore         
	//  353  769:dup             
	//  354  770:bipush          30
	//  355  772:getstatic       #298 <Field DataType DATE_TIME>
	//  356  775:aastore         
	//  357  776:dup             
	//  358  777:bipush          31
	//  359  779:getstatic       #306 <Field DataType TIME_STAMP>
	//  360  782:aastore         
	//  361  783:dup             
	//  362  784:bipush          32
	//  363  786:getstatic       #309 <Field DataType UNKNOWN>
	//  364  789:aastore         
	//  365  790:putstatic       #311 <Field DataType[] $VALUES>
	//* 366  793:return          
	}
}
