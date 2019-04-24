// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;

import java.io.Serializable;

public final class EnumOrderStatus extends Enum
	implements Serializable
{

	private EnumOrderStatus(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #116 <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #118 <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #120 <Field String desc>
	//   10   17:return          
	}

	public static EnumOrderStatus getOrderStatus4ID(int i)
	{
		EnumOrderStatus aenumorderstatus[] = values();
	//    0    0:invokestatic    #126 <Method EnumOrderStatus[] values()>
	//    1    3:astore_3        
		int k = aenumorderstatus.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumOrderStatus enumorderstatus = aenumorderstatus[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumorderstatus.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #130 <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumorderstatus;
	//   16   26:aload           4
	//   17   28:areturn         
		}

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//   22   33:iload_1         
	//   23   34:iload_2         
	//   24   35:icmplt          12
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static EnumOrderStatus valueOf(String s)
	{
		return (EnumOrderStatus)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumOrderStatus, s);
	//    0    0:ldc1            #2   <Class EnumOrderStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #135 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumOrderStatus>
	//    4    9:areturn         
	}

	public static EnumOrderStatus[] values()
	{
		EnumOrderStatus aenumorderstatus[] = ENUM$VALUES;
	//    0    0:getstatic       #112 <Field EnumOrderStatus[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumorderstatus.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumOrderStatus aenumorderstatus1[] = new EnumOrderStatus[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumOrderStatus[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumorderstatus)), 0, ((Object) (aenumorderstatus1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #141 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumorderstatus1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int id>
	//    2    4:ireturn         
	}

	private static final EnumOrderStatus ENUM$VALUES[];
	public static final EnumOrderStatus apilyForRefund;
	public static final EnumOrderStatus dubious;
	public static final EnumOrderStatus failure;
	public static final EnumOrderStatus hasPaid;
	public static final EnumOrderStatus hasRefunded;
	public static final EnumOrderStatus invalid;
	public static final EnumOrderStatus notExist;
	public static final EnumOrderStatus notPay;
	public static final EnumOrderStatus payFailure;
	public static final EnumOrderStatus recharging;
	public static final EnumOrderStatus refundFailure;
	public static final EnumOrderStatus success;
	public static final EnumOrderStatus unknown;
	public static final EnumOrderStatus unsettled;
	public static final EnumOrderStatus waitForPay;
	private String desc;
	private int id;

	static 
	{
		notExist = new EnumOrderStatus("notExist", 0, 0, "\u8BA2\u5355\u4E0D\u5B58\u5728");
	//    0    0:new             #2   <Class EnumOrderStatus>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "notExist">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #34  <String "\u8BA2\u5355\u4E0D\u5B58\u5728">
	//    6   10:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//    7   13:putstatic       #40  <Field EnumOrderStatus notExist>
		notPay = new EnumOrderStatus("notPay", 1, 1, "\u672A\u652F\u4ED8");
	//    8   16:new             #2   <Class EnumOrderStatus>
	//    9   19:dup             
	//   10   20:ldc1            #41  <String "notPay">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #43  <String "\u672A\u652F\u4ED8">
	//   14   26:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   15   29:putstatic       #45  <Field EnumOrderStatus notPay>
		hasPaid = new EnumOrderStatus("hasPaid", 2, 2, "\u5DF2\u4ED8\u6B3E");
	//   16   32:new             #2   <Class EnumOrderStatus>
	//   17   35:dup             
	//   18   36:ldc1            #46  <String "hasPaid">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #48  <String "\u5DF2\u4ED8\u6B3E">
	//   22   42:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   23   45:putstatic       #50  <Field EnumOrderStatus hasPaid>
		success = new EnumOrderStatus("success", 3, 3, "\u4EA4\u6613\u6210\u529F");
	//   24   48:new             #2   <Class EnumOrderStatus>
	//   25   51:dup             
	//   26   52:ldc1            #51  <String "success">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #53  <String "\u4EA4\u6613\u6210\u529F">
	//   30   58:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   31   61:putstatic       #55  <Field EnumOrderStatus success>
		failure = new EnumOrderStatus("failure", 4, 4, "\u4EA4\u6613\u5931\u8D25");
	//   32   64:new             #2   <Class EnumOrderStatus>
	//   33   67:dup             
	//   34   68:ldc1            #56  <String "failure">
	//   35   70:iconst_4        
	//   36   71:iconst_4        
	//   37   72:ldc1            #58  <String "\u4EA4\u6613\u5931\u8D25">
	//   38   74:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   39   77:putstatic       #60  <Field EnumOrderStatus failure>
		unsettled = new EnumOrderStatus("unsettled", 5, 5, "\u4EA4\u6613\u72B6\u6001\u672A\u77E5");
	//   40   80:new             #2   <Class EnumOrderStatus>
	//   41   83:dup             
	//   42   84:ldc1            #61  <String "unsettled">
	//   43   86:iconst_5        
	//   44   87:iconst_5        
	//   45   88:ldc1            #63  <String "\u4EA4\u6613\u72B6\u6001\u672A\u77E5">
	//   46   90:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   47   93:putstatic       #65  <Field EnumOrderStatus unsettled>
		apilyForRefund = new EnumOrderStatus("apilyForRefund", 6, 6, "\u7533\u8BF7\u9000\u6B3E\u4E2D");
	//   48   96:new             #2   <Class EnumOrderStatus>
	//   49   99:dup             
	//   50  100:ldc1            #66  <String "apilyForRefund">
	//   51  102:bipush          6
	//   52  104:bipush          6
	//   53  106:ldc1            #68  <String "\u7533\u8BF7\u9000\u6B3E\u4E2D">
	//   54  108:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   55  111:putstatic       #70  <Field EnumOrderStatus apilyForRefund>
		hasRefunded = new EnumOrderStatus("hasRefunded", 7, 7, "\u5DF2\u9000\u6B3E");
	//   56  114:new             #2   <Class EnumOrderStatus>
	//   57  117:dup             
	//   58  118:ldc1            #71  <String "hasRefunded">
	//   59  120:bipush          7
	//   60  122:bipush          7
	//   61  124:ldc1            #73  <String "\u5DF2\u9000\u6B3E">
	//   62  126:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   63  129:putstatic       #75  <Field EnumOrderStatus hasRefunded>
		refundFailure = new EnumOrderStatus("refundFailure", 8, 8, "\u9000\u6B3E\u5931\u8D25");
	//   64  132:new             #2   <Class EnumOrderStatus>
	//   65  135:dup             
	//   66  136:ldc1            #76  <String "refundFailure">
	//   67  138:bipush          8
	//   68  140:bipush          8
	//   69  142:ldc1            #78  <String "\u9000\u6B3E\u5931\u8D25">
	//   70  144:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   71  147:putstatic       #80  <Field EnumOrderStatus refundFailure>
		payFailure = new EnumOrderStatus("payFailure", 9, 9, "\u4ED8\u6B3E\u5931\u8D25");
	//   72  150:new             #2   <Class EnumOrderStatus>
	//   73  153:dup             
	//   74  154:ldc1            #81  <String "payFailure">
	//   75  156:bipush          9
	//   76  158:bipush          9
	//   77  160:ldc1            #83  <String "\u4ED8\u6B3E\u5931\u8D25">
	//   78  162:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   79  165:putstatic       #85  <Field EnumOrderStatus payFailure>
		waitForPay = new EnumOrderStatus("waitForPay", 10, 10, "\u5F85\u652F\u4ED8");
	//   80  168:new             #2   <Class EnumOrderStatus>
	//   81  171:dup             
	//   82  172:ldc1            #86  <String "waitForPay">
	//   83  174:bipush          10
	//   84  176:bipush          10
	//   85  178:ldc1            #88  <String "\u5F85\u652F\u4ED8">
	//   86  180:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   87  183:putstatic       #90  <Field EnumOrderStatus waitForPay>
		recharging = new EnumOrderStatus("recharging", 11, 11, "\u4EA4\u901A\u5361\u5145\u503C\u4E2D");
	//   88  186:new             #2   <Class EnumOrderStatus>
	//   89  189:dup             
	//   90  190:ldc1            #91  <String "recharging">
	//   91  192:bipush          11
	//   92  194:bipush          11
	//   93  196:ldc1            #93  <String "\u4EA4\u901A\u5361\u5145\u503C\u4E2D">
	//   94  198:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//   95  201:putstatic       #95  <Field EnumOrderStatus recharging>
		dubious = new EnumOrderStatus("dubious", 12, 12, "\u53EF\u7591\u8D26\u5F85\u5904\u7406");
	//   96  204:new             #2   <Class EnumOrderStatus>
	//   97  207:dup             
	//   98  208:ldc1            #96  <String "dubious">
	//   99  210:bipush          12
	//  100  212:bipush          12
	//  101  214:ldc1            #98  <String "\u53EF\u7591\u8D26\u5F85\u5904\u7406">
	//  102  216:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//  103  219:putstatic       #100 <Field EnumOrderStatus dubious>
		invalid = new EnumOrderStatus("invalid", 13, 13, "\u8BA2\u5355\u5173\u95ED");
	//  104  222:new             #2   <Class EnumOrderStatus>
	//  105  225:dup             
	//  106  226:ldc1            #101 <String "invalid">
	//  107  228:bipush          13
	//  108  230:bipush          13
	//  109  232:ldc1            #103 <String "\u8BA2\u5355\u5173\u95ED">
	//  110  234:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//  111  237:putstatic       #105 <Field EnumOrderStatus invalid>
		unknown = new EnumOrderStatus("unknown", 14, 99, "\u672A\u77E5");
	//  112  240:new             #2   <Class EnumOrderStatus>
	//  113  243:dup             
	//  114  244:ldc1            #106 <String "unknown">
	//  115  246:bipush          14
	//  116  248:bipush          99
	//  117  250:ldc1            #108 <String "\u672A\u77E5">
	//  118  252:invokespecial   #38  <Method void EnumOrderStatus(String, int, int, String)>
	//  119  255:putstatic       #110 <Field EnumOrderStatus unknown>
		ENUM$VALUES = (new EnumOrderStatus[] {
			notExist, notPay, hasPaid, success, failure, unsettled, apilyForRefund, hasRefunded, refundFailure, payFailure, 
			waitForPay, recharging, dubious, invalid, unknown
		});
	//  120  258:bipush          15
	//  121  260:anewarray       EnumOrderStatus[]
	//  122  263:dup             
	//  123  264:iconst_0        
	//  124  265:getstatic       #40  <Field EnumOrderStatus notExist>
	//  125  268:aastore         
	//  126  269:dup             
	//  127  270:iconst_1        
	//  128  271:getstatic       #45  <Field EnumOrderStatus notPay>
	//  129  274:aastore         
	//  130  275:dup             
	//  131  276:iconst_2        
	//  132  277:getstatic       #50  <Field EnumOrderStatus hasPaid>
	//  133  280:aastore         
	//  134  281:dup             
	//  135  282:iconst_3        
	//  136  283:getstatic       #55  <Field EnumOrderStatus success>
	//  137  286:aastore         
	//  138  287:dup             
	//  139  288:iconst_4        
	//  140  289:getstatic       #60  <Field EnumOrderStatus failure>
	//  141  292:aastore         
	//  142  293:dup             
	//  143  294:iconst_5        
	//  144  295:getstatic       #65  <Field EnumOrderStatus unsettled>
	//  145  298:aastore         
	//  146  299:dup             
	//  147  300:bipush          6
	//  148  302:getstatic       #70  <Field EnumOrderStatus apilyForRefund>
	//  149  305:aastore         
	//  150  306:dup             
	//  151  307:bipush          7
	//  152  309:getstatic       #75  <Field EnumOrderStatus hasRefunded>
	//  153  312:aastore         
	//  154  313:dup             
	//  155  314:bipush          8
	//  156  316:getstatic       #80  <Field EnumOrderStatus refundFailure>
	//  157  319:aastore         
	//  158  320:dup             
	//  159  321:bipush          9
	//  160  323:getstatic       #85  <Field EnumOrderStatus payFailure>
	//  161  326:aastore         
	//  162  327:dup             
	//  163  328:bipush          10
	//  164  330:getstatic       #90  <Field EnumOrderStatus waitForPay>
	//  165  333:aastore         
	//  166  334:dup             
	//  167  335:bipush          11
	//  168  337:getstatic       #95  <Field EnumOrderStatus recharging>
	//  169  340:aastore         
	//  170  341:dup             
	//  171  342:bipush          12
	//  172  344:getstatic       #100 <Field EnumOrderStatus dubious>
	//  173  347:aastore         
	//  174  348:dup             
	//  175  349:bipush          13
	//  176  351:getstatic       #105 <Field EnumOrderStatus invalid>
	//  177  354:aastore         
	//  178  355:dup             
	//  179  356:bipush          14
	//  180  358:getstatic       #110 <Field EnumOrderStatus unknown>
	//  181  361:aastore         
	//  182  362:putstatic       #112 <Field EnumOrderStatus[] ENUM$VALUES>
	//* 183  365:return          
	}
}
