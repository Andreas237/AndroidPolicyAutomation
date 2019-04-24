// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;

import java.io.Serializable;

public final class EnumTradeType extends Enum
	implements Serializable
{

	private EnumTradeType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #122 <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #124 <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #126 <Field String desc>
	//   10   17:return          
	}

	public static EnumTradeType valueOf(String s)
	{
		return (EnumTradeType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumTradeType, s);
	//    0    0:ldc1            #2   <Class EnumTradeType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #131 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumTradeType>
	//    4    9:areturn         
	}

	public static EnumTradeType[] values()
	{
		EnumTradeType aenumtradetype[] = ENUM$VALUES;
	//    0    0:getstatic       #118 <Field EnumTradeType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumtradetype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumTradeType aenumtradetype1[] = new EnumTradeType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumTradeType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumtradetype)), 0, ((Object) (aenumtradetype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #139 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumtradetype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumTradeType CompositeConsumption;
	public static final EnumTradeType Consumption;
	private static final EnumTradeType ENUM$VALUES[];
	public static final EnumTradeType bus;
	public static final EnumTradeType elseTrade;
	public static final EnumTradeType expressway;
	public static final EnumTradeType ferry;
	public static final EnumTradeType gasStation;
	public static final EnumTradeType maglev;
	public static final EnumTradeType onlineConsumption;
	public static final EnumTradeType onlineRecharge;
	public static final EnumTradeType park;
	public static final EnumTradeType privilege;
	public static final EnumTradeType recharge;
	public static final EnumTradeType subwayConsumption;
	public static final EnumTradeType subwayUpdate;
	public static final EnumTradeType taxi;
	private String desc;
	private int id;

	static 
	{
		bus = new EnumTradeType("bus", 0, 1, "\u516C\u4EA4");
	//    0    0:new             #2   <Class EnumTradeType>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "bus">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #35  <String "\u516C\u4EA4">
	//    6   10:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//    7   13:putstatic       #41  <Field EnumTradeType bus>
		privilege = new EnumTradeType("privilege", 1, 2, "\u4F18\u60E0\u4EA4\u6613");
	//    8   16:new             #2   <Class EnumTradeType>
	//    9   19:dup             
	//   10   20:ldc1            #42  <String "privilege">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #44  <String "\u4F18\u60E0\u4EA4\u6613">
	//   14   26:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   15   29:putstatic       #46  <Field EnumTradeType privilege>
		subwayConsumption = new EnumTradeType("subwayConsumption", 2, 3, "\u8F68\u9053\u4EA4\u901A\u6D88\u8D39");
	//   16   32:new             #2   <Class EnumTradeType>
	//   17   35:dup             
	//   18   36:ldc1            #47  <String "subwayConsumption">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #49  <String "\u8F68\u9053\u4EA4\u901A\u6D88\u8D39">
	//   22   42:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   23   45:putstatic       #51  <Field EnumTradeType subwayConsumption>
		subwayUpdate = new EnumTradeType("subwayUpdate", 3, 4, "\u8F68\u9053\u4EA4\u901A\u66F4\u65B0");
	//   24   48:new             #2   <Class EnumTradeType>
	//   25   51:dup             
	//   26   52:ldc1            #52  <String "subwayUpdate">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #54  <String "\u8F68\u9053\u4EA4\u901A\u66F4\u65B0">
	//   30   58:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   31   61:putstatic       #56  <Field EnumTradeType subwayUpdate>
		maglev = new EnumTradeType("maglev", 4, 5, "\u78C1\u60AC\u6D6E");
	//   32   64:new             #2   <Class EnumTradeType>
	//   33   67:dup             
	//   34   68:ldc1            #57  <String "maglev">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #59  <String "\u78C1\u60AC\u6D6E">
	//   38   74:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   39   77:putstatic       #61  <Field EnumTradeType maglev>
		recharge = new EnumTradeType("recharge", 5, 6, "\u5145\u8D44");
	//   40   80:new             #2   <Class EnumTradeType>
	//   41   83:dup             
	//   42   84:ldc1            #62  <String "recharge">
	//   43   86:iconst_5        
	//   44   87:bipush          6
	//   45   89:ldc1            #64  <String "\u5145\u8D44">
	//   46   91:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   47   94:putstatic       #66  <Field EnumTradeType recharge>
		ferry = new EnumTradeType("ferry", 6, 7, "\u8F6E\u6E21");
	//   48   97:new             #2   <Class EnumTradeType>
	//   49  100:dup             
	//   50  101:ldc1            #67  <String "ferry">
	//   51  103:bipush          6
	//   52  105:bipush          7
	//   53  107:ldc1            #69  <String "\u8F6E\u6E21">
	//   54  109:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   55  112:putstatic       #71  <Field EnumTradeType ferry>
		taxi = new EnumTradeType("taxi", 7, 8, "\u51FA\u79DF");
	//   56  115:new             #2   <Class EnumTradeType>
	//   57  118:dup             
	//   58  119:ldc1            #72  <String "taxi">
	//   59  121:bipush          7
	//   60  123:bipush          8
	//   61  125:ldc1            #74  <String "\u51FA\u79DF">
	//   62  127:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   63  130:putstatic       #76  <Field EnumTradeType taxi>
		expressway = new EnumTradeType("expressway", 8, 9, "\u9AD8\u901F\u516C\u8DEF");
	//   64  133:new             #2   <Class EnumTradeType>
	//   65  136:dup             
	//   66  137:ldc1            #77  <String "expressway">
	//   67  139:bipush          8
	//   68  141:bipush          9
	//   69  143:ldc1            #79  <String "\u9AD8\u901F\u516C\u8DEF">
	//   70  145:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   71  148:putstatic       #81  <Field EnumTradeType expressway>
		park = new EnumTradeType("park", 9, 10, "\u505C\u8F66\u573A");
	//   72  151:new             #2   <Class EnumTradeType>
	//   73  154:dup             
	//   74  155:ldc1            #82  <String "park">
	//   75  157:bipush          9
	//   76  159:bipush          10
	//   77  161:ldc1            #84  <String "\u505C\u8F66\u573A">
	//   78  163:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   79  166:putstatic       #86  <Field EnumTradeType park>
		gasStation = new EnumTradeType("gasStation", 10, 11, "\u52A0\u6CB9\u7AD9");
	//   80  169:new             #2   <Class EnumTradeType>
	//   81  172:dup             
	//   82  173:ldc1            #87  <String "gasStation">
	//   83  175:bipush          10
	//   84  177:bipush          11
	//   85  179:ldc1            #89  <String "\u52A0\u6CB9\u7AD9">
	//   86  181:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   87  184:putstatic       #91  <Field EnumTradeType gasStation>
		onlineRecharge = new EnumTradeType("onlineRecharge", 11, 12, "\u7F51\u4E0A\u5145\u8D44");
	//   88  187:new             #2   <Class EnumTradeType>
	//   89  190:dup             
	//   90  191:ldc1            #92  <String "onlineRecharge">
	//   91  193:bipush          11
	//   92  195:bipush          12
	//   93  197:ldc1            #94  <String "\u7F51\u4E0A\u5145\u8D44">
	//   94  199:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//   95  202:putstatic       #96  <Field EnumTradeType onlineRecharge>
		onlineConsumption = new EnumTradeType("onlineConsumption", 12, 13, "\u7F51\u4E0A\u6D88\u8D39");
	//   96  205:new             #2   <Class EnumTradeType>
	//   97  208:dup             
	//   98  209:ldc1            #97  <String "onlineConsumption">
	//   99  211:bipush          12
	//  100  213:bipush          13
	//  101  215:ldc1            #99  <String "\u7F51\u4E0A\u6D88\u8D39">
	//  102  217:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//  103  220:putstatic       #101 <Field EnumTradeType onlineConsumption>
		elseTrade = new EnumTradeType("elseTrade", 13, 14, "\u5176\u4ED6\u4EA4\u6613");
	//  104  223:new             #2   <Class EnumTradeType>
	//  105  226:dup             
	//  106  227:ldc1            #102 <String "elseTrade">
	//  107  229:bipush          13
	//  108  231:bipush          14
	//  109  233:ldc1            #104 <String "\u5176\u4ED6\u4EA4\u6613">
	//  110  235:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//  111  238:putstatic       #106 <Field EnumTradeType elseTrade>
		Consumption = new EnumTradeType("Consumption", 14, 15, "\u6D88\u8D39");
	//  112  241:new             #2   <Class EnumTradeType>
	//  113  244:dup             
	//  114  245:ldc1            #107 <String "Consumption">
	//  115  247:bipush          14
	//  116  249:bipush          15
	//  117  251:ldc1            #109 <String "\u6D88\u8D39">
	//  118  253:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//  119  256:putstatic       #111 <Field EnumTradeType Consumption>
		CompositeConsumption = new EnumTradeType("CompositeConsumption", 15, 16, "\u590D\u5408\u6D88\u8D39");
	//  120  259:new             #2   <Class EnumTradeType>
	//  121  262:dup             
	//  122  263:ldc1            #112 <String "CompositeConsumption">
	//  123  265:bipush          15
	//  124  267:bipush          16
	//  125  269:ldc1            #114 <String "\u590D\u5408\u6D88\u8D39">
	//  126  271:invokespecial   #39  <Method void EnumTradeType(String, int, int, String)>
	//  127  274:putstatic       #116 <Field EnumTradeType CompositeConsumption>
		ENUM$VALUES = (new EnumTradeType[] {
			bus, privilege, subwayConsumption, subwayUpdate, maglev, recharge, ferry, taxi, expressway, park, 
			gasStation, onlineRecharge, onlineConsumption, elseTrade, Consumption, CompositeConsumption
		});
	//  128  277:bipush          16
	//  129  279:anewarray       EnumTradeType[]
	//  130  282:dup             
	//  131  283:iconst_0        
	//  132  284:getstatic       #41  <Field EnumTradeType bus>
	//  133  287:aastore         
	//  134  288:dup             
	//  135  289:iconst_1        
	//  136  290:getstatic       #46  <Field EnumTradeType privilege>
	//  137  293:aastore         
	//  138  294:dup             
	//  139  295:iconst_2        
	//  140  296:getstatic       #51  <Field EnumTradeType subwayConsumption>
	//  141  299:aastore         
	//  142  300:dup             
	//  143  301:iconst_3        
	//  144  302:getstatic       #56  <Field EnumTradeType subwayUpdate>
	//  145  305:aastore         
	//  146  306:dup             
	//  147  307:iconst_4        
	//  148  308:getstatic       #61  <Field EnumTradeType maglev>
	//  149  311:aastore         
	//  150  312:dup             
	//  151  313:iconst_5        
	//  152  314:getstatic       #66  <Field EnumTradeType recharge>
	//  153  317:aastore         
	//  154  318:dup             
	//  155  319:bipush          6
	//  156  321:getstatic       #71  <Field EnumTradeType ferry>
	//  157  324:aastore         
	//  158  325:dup             
	//  159  326:bipush          7
	//  160  328:getstatic       #76  <Field EnumTradeType taxi>
	//  161  331:aastore         
	//  162  332:dup             
	//  163  333:bipush          8
	//  164  335:getstatic       #81  <Field EnumTradeType expressway>
	//  165  338:aastore         
	//  166  339:dup             
	//  167  340:bipush          9
	//  168  342:getstatic       #86  <Field EnumTradeType park>
	//  169  345:aastore         
	//  170  346:dup             
	//  171  347:bipush          10
	//  172  349:getstatic       #91  <Field EnumTradeType gasStation>
	//  173  352:aastore         
	//  174  353:dup             
	//  175  354:bipush          11
	//  176  356:getstatic       #96  <Field EnumTradeType onlineRecharge>
	//  177  359:aastore         
	//  178  360:dup             
	//  179  361:bipush          12
	//  180  363:getstatic       #101 <Field EnumTradeType onlineConsumption>
	//  181  366:aastore         
	//  182  367:dup             
	//  183  368:bipush          13
	//  184  370:getstatic       #106 <Field EnumTradeType elseTrade>
	//  185  373:aastore         
	//  186  374:dup             
	//  187  375:bipush          14
	//  188  377:getstatic       #111 <Field EnumTradeType Consumption>
	//  189  380:aastore         
	//  190  381:dup             
	//  191  382:bipush          15
	//  192  384:getstatic       #116 <Field EnumTradeType CompositeConsumption>
	//  193  387:aastore         
	//  194  388:putstatic       #118 <Field EnumTradeType[] ENUM$VALUES>
	//* 195  391:return          
	}
}
