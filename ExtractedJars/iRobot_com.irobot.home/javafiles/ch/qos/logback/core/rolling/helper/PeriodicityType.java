// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;


public final class PeriodicityType extends Enum
{

	private PeriodicityType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static PeriodicityType valueOf(String s)
	{
		return (PeriodicityType)Enum.valueOf(ch/qos/logback/core/rolling/helper/PeriodicityType, s);
	//    0    0:ldc1            #2   <Class PeriodicityType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PeriodicityType>
	//    4    9:areturn         
	}

	public static PeriodicityType[] values()
	{
		return (PeriodicityType[])((PeriodicityType []) ($VALUES)).clone();
	//    0    0:getstatic       #53  <Field PeriodicityType[] $VALUES>
	//    1    3:invokevirtual   #70  <Method Object _5B_Lch.qos.logback.core.rolling.helper.PeriodicityType_3B_.clone()>
	//    2    6:checkcast       #66  <Class PeriodicityType[]>
	//    3    9:areturn         
	}

	private static final PeriodicityType $VALUES[];
	public static final PeriodicityType ERRONEOUS;
	public static final PeriodicityType HALF_DAY;
	public static final PeriodicityType TOP_OF_DAY;
	public static final PeriodicityType TOP_OF_HOUR;
	public static final PeriodicityType TOP_OF_MILLISECOND;
	public static final PeriodicityType TOP_OF_MINUTE;
	public static final PeriodicityType TOP_OF_MONTH;
	public static final PeriodicityType TOP_OF_SECOND;
	public static final PeriodicityType TOP_OF_WEEK;
	static PeriodicityType VALID_ORDERED_LIST[];

	static 
	{
		ERRONEOUS = new PeriodicityType("ERRONEOUS", 0);
	//    0    0:new             #2   <Class PeriodicityType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "ERRONEOUS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//    5   10:putstatic       #27  <Field PeriodicityType ERRONEOUS>
		TOP_OF_MILLISECOND = new PeriodicityType("TOP_OF_MILLISECOND", 1);
	//    6   13:new             #2   <Class PeriodicityType>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "TOP_OF_MILLISECOND">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   11   23:putstatic       #30  <Field PeriodicityType TOP_OF_MILLISECOND>
		TOP_OF_SECOND = new PeriodicityType("TOP_OF_SECOND", 2);
	//   12   26:new             #2   <Class PeriodicityType>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "TOP_OF_SECOND">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   17   36:putstatic       #33  <Field PeriodicityType TOP_OF_SECOND>
		TOP_OF_MINUTE = new PeriodicityType("TOP_OF_MINUTE", 3);
	//   18   39:new             #2   <Class PeriodicityType>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "TOP_OF_MINUTE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   23   49:putstatic       #36  <Field PeriodicityType TOP_OF_MINUTE>
		TOP_OF_HOUR = new PeriodicityType("TOP_OF_HOUR", 4);
	//   24   52:new             #2   <Class PeriodicityType>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "TOP_OF_HOUR">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   29   62:putstatic       #39  <Field PeriodicityType TOP_OF_HOUR>
		HALF_DAY = new PeriodicityType("HALF_DAY", 5);
	//   30   65:new             #2   <Class PeriodicityType>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "HALF_DAY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   35   75:putstatic       #42  <Field PeriodicityType HALF_DAY>
		TOP_OF_DAY = new PeriodicityType("TOP_OF_DAY", 6);
	//   36   78:new             #2   <Class PeriodicityType>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "TOP_OF_DAY">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   41   89:putstatic       #45  <Field PeriodicityType TOP_OF_DAY>
		TOP_OF_WEEK = new PeriodicityType("TOP_OF_WEEK", 7);
	//   42   92:new             #2   <Class PeriodicityType>
	//   43   95:dup             
	//   44   96:ldc1            #46  <String "TOP_OF_WEEK">
	//   45   98:bipush          7
	//   46  100:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   47  103:putstatic       #48  <Field PeriodicityType TOP_OF_WEEK>
		TOP_OF_MONTH = new PeriodicityType("TOP_OF_MONTH", 8);
	//   48  106:new             #2   <Class PeriodicityType>
	//   49  109:dup             
	//   50  110:ldc1            #49  <String "TOP_OF_MONTH">
	//   51  112:bipush          8
	//   52  114:invokespecial   #25  <Method void PeriodicityType(String, int)>
	//   53  117:putstatic       #51  <Field PeriodicityType TOP_OF_MONTH>
		$VALUES = (new PeriodicityType[] {
			ERRONEOUS, TOP_OF_MILLISECOND, TOP_OF_SECOND, TOP_OF_MINUTE, TOP_OF_HOUR, HALF_DAY, TOP_OF_DAY, TOP_OF_WEEK, TOP_OF_MONTH
		});
	//   54  120:bipush          9
	//   55  122:anewarray       PeriodicityType[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #27  <Field PeriodicityType ERRONEOUS>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #30  <Field PeriodicityType TOP_OF_MILLISECOND>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #33  <Field PeriodicityType TOP_OF_SECOND>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #36  <Field PeriodicityType TOP_OF_MINUTE>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #39  <Field PeriodicityType TOP_OF_HOUR>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #42  <Field PeriodicityType HALF_DAY>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #45  <Field PeriodicityType TOP_OF_DAY>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #48  <Field PeriodicityType TOP_OF_WEEK>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #51  <Field PeriodicityType TOP_OF_MONTH>
	//   91  181:aastore         
	//   92  182:putstatic       #53  <Field PeriodicityType[] $VALUES>
		VALID_ORDERED_LIST = (new PeriodicityType[] {
			TOP_OF_MILLISECOND, TOP_OF_SECOND, TOP_OF_MINUTE, TOP_OF_HOUR, TOP_OF_DAY, TOP_OF_WEEK, TOP_OF_MONTH
		});
	//   93  185:bipush          7
	//   94  187:anewarray       PeriodicityType[]
	//   95  190:dup             
	//   96  191:iconst_0        
	//   97  192:getstatic       #30  <Field PeriodicityType TOP_OF_MILLISECOND>
	//   98  195:aastore         
	//   99  196:dup             
	//  100  197:iconst_1        
	//  101  198:getstatic       #33  <Field PeriodicityType TOP_OF_SECOND>
	//  102  201:aastore         
	//  103  202:dup             
	//  104  203:iconst_2        
	//  105  204:getstatic       #36  <Field PeriodicityType TOP_OF_MINUTE>
	//  106  207:aastore         
	//  107  208:dup             
	//  108  209:iconst_3        
	//  109  210:getstatic       #39  <Field PeriodicityType TOP_OF_HOUR>
	//  110  213:aastore         
	//  111  214:dup             
	//  112  215:iconst_4        
	//  113  216:getstatic       #45  <Field PeriodicityType TOP_OF_DAY>
	//  114  219:aastore         
	//  115  220:dup             
	//  116  221:iconst_5        
	//  117  222:getstatic       #48  <Field PeriodicityType TOP_OF_WEEK>
	//  118  225:aastore         
	//  119  226:dup             
	//  120  227:bipush          6
	//  121  229:getstatic       #51  <Field PeriodicityType TOP_OF_MONTH>
	//  122  232:aastore         
	//  123  233:putstatic       #55  <Field PeriodicityType[] VALID_ORDERED_LIST>
	//* 124  236:return          
	}
}
