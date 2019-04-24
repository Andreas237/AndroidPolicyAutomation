// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumRechargeMode extends Enum
{

	private EnumRechargeMode(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #108 <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #110 <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #112 <Field String desc>
	//   10   17:return          
	}

	public static EnumRechargeMode instance(int i)
	{
		EnumRechargeMode aenumrechargemode[] = values();
	//    0    0:invokestatic    #118 <Method EnumRechargeMode[] values()>
	//    1    3:astore_3        
		int k = aenumrechargemode.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumRechargeMode enumrechargemode = aenumrechargemode[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumrechargemode.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #122 <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumrechargemode;
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

	public static EnumRechargeMode valueOf(String s)
	{
		return (EnumRechargeMode)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumRechargeMode, s);
	//    0    0:ldc1            #2   <Class EnumRechargeMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #127 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumRechargeMode>
	//    4    9:areturn         
	}

	public static EnumRechargeMode[] values()
	{
		EnumRechargeMode aenumrechargemode[] = ENUM$VALUES;
	//    0    0:getstatic       #104 <Field EnumRechargeMode[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumrechargemode.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumRechargeMode aenumrechargemode1[] = new EnumRechargeMode[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumRechargeMode[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumrechargemode)), 0, ((Object) (aenumrechargemode1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumrechargemode1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumRechargeMode ALIPAY_ONE_KEY;
	public static final EnumRechargeMode ALIPAY_SECURE;
	public static final EnumRechargeMode CARD_SHIFT_CAPITAL;
	public static final EnumRechargeMode COMPANY_GIVE;
	private static final EnumRechargeMode ENUM$VALUES[];
	public static final EnumRechargeMode HW_PAY;
	public static final EnumRechargeMode LKL_PAY;
	public static final EnumRechargeMode MIPAY_MI;
	public static final EnumRechargeMode MOBILE_PROMOTION;
	public static final EnumRechargeMode SAMSUNG_PAY;
	public static final EnumRechargeMode UNIONPAY;
	public static final EnumRechargeMode UNIONPAY_CARD;
	public static final EnumRechargeMode UNIONPAY_CARD_FM;
	public static final EnumRechargeMode UNIONPAY_CARD_PT;
	public static final EnumRechargeMode UNIONPAY_FM;
	private String desc;
	private int id;

	static 
	{
		COMPANY_GIVE = new EnumRechargeMode("COMPANY_GIVE", 0, 0, "\u5546\u6237\u4F18\u60E0");
	//    0    0:new             #2   <Class EnumRechargeMode>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "COMPANY_GIVE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #31  <String "\u5546\u6237\u4F18\u60E0">
	//    6   10:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//    7   13:putstatic       #37  <Field EnumRechargeMode COMPANY_GIVE>
		ALIPAY_ONE_KEY = new EnumRechargeMode("ALIPAY_ONE_KEY", 1, 1, "\u652F\u4ED8\u5B9D\u4E00\u952E\u652F\u4ED8");
	//    8   16:new             #2   <Class EnumRechargeMode>
	//    9   19:dup             
	//   10   20:ldc1            #38  <String "ALIPAY_ONE_KEY">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #40  <String "\u652F\u4ED8\u5B9D\u4E00\u952E\u652F\u4ED8">
	//   14   26:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   15   29:putstatic       #42  <Field EnumRechargeMode ALIPAY_ONE_KEY>
		ALIPAY_SECURE = new EnumRechargeMode("ALIPAY_SECURE", 2, 2, "\u652F\u4ED8\u5B9D\u5B89\u5168\u652F\u4ED8");
	//   16   32:new             #2   <Class EnumRechargeMode>
	//   17   35:dup             
	//   18   36:ldc1            #43  <String "ALIPAY_SECURE">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #45  <String "\u652F\u4ED8\u5B9D\u5B89\u5168\u652F\u4ED8">
	//   22   42:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   23   45:putstatic       #47  <Field EnumRechargeMode ALIPAY_SECURE>
		UNIONPAY = new EnumRechargeMode("UNIONPAY", 3, 3, "\u94F6\u8054\u65E0\u5361-\u5361\u516C\u53F8\u5149\u5927 ");
	//   24   48:new             #2   <Class EnumRechargeMode>
	//   25   51:dup             
	//   26   52:ldc1            #48  <String "UNIONPAY">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #50  <String "\u94F6\u8054\u65E0\u5361-\u5361\u516C\u53F8\u5149\u5927 ">
	//   30   58:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   31   61:putstatic       #52  <Field EnumRechargeMode UNIONPAY>
		UNIONPAY_CARD = new EnumRechargeMode("UNIONPAY_CARD", 4, 49, "\u94F6\u8054\u6709\u5361-\u5361\u516C\u53F8\u5149\u5927");
	//   32   64:new             #2   <Class EnumRechargeMode>
	//   33   67:dup             
	//   34   68:ldc1            #53  <String "UNIONPAY_CARD">
	//   35   70:iconst_4        
	//   36   71:bipush          49
	//   37   73:ldc1            #55  <String "\u94F6\u8054\u6709\u5361-\u5361\u516C\u53F8\u5149\u5927">
	//   38   75:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   39   78:putstatic       #57  <Field EnumRechargeMode UNIONPAY_CARD>
		UNIONPAY_FM = new EnumRechargeMode("UNIONPAY_FM", 5, 4, "\u94F6\u8054-\u590D\u65E6\u5FAE");
	//   40   81:new             #2   <Class EnumRechargeMode>
	//   41   84:dup             
	//   42   85:ldc1            #58  <String "UNIONPAY_FM">
	//   43   87:iconst_5        
	//   44   88:iconst_4        
	//   45   89:ldc1            #60  <String "\u94F6\u8054-\u590D\u65E6\u5FAE">
	//   46   91:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   47   94:putstatic       #62  <Field EnumRechargeMode UNIONPAY_FM>
		UNIONPAY_CARD_FM = new EnumRechargeMode("UNIONPAY_CARD_FM", 6, 65, "\u94F6\u8054\u6709\u5361-\u590D\u65E6\u5FAE\u8D26\u53F7 ");
	//   48   97:new             #2   <Class EnumRechargeMode>
	//   49  100:dup             
	//   50  101:ldc1            #63  <String "UNIONPAY_CARD_FM">
	//   51  103:bipush          6
	//   52  105:bipush          65
	//   53  107:ldc1            #65  <String "\u94F6\u8054\u6709\u5361-\u590D\u65E6\u5FAE\u8D26\u53F7 ">
	//   54  109:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   55  112:putstatic       #67  <Field EnumRechargeMode UNIONPAY_CARD_FM>
		CARD_SHIFT_CAPITAL = new EnumRechargeMode("CARD_SHIFT_CAPITAL", 7, 58, "\u4EA4\u901A\u5361\u8865\u5145\u503C(\u4E0D\u53EF\u9886\u53D1\u7968)");
	//   56  115:new             #2   <Class EnumRechargeMode>
	//   57  118:dup             
	//   58  119:ldc1            #68  <String "CARD_SHIFT_CAPITAL">
	//   59  121:bipush          7
	//   60  123:bipush          58
	//   61  125:ldc1            #70  <String "\u4EA4\u901A\u5361\u8865\u5145\u503C(\u4E0D\u53EF\u9886\u53D1\u7968)">
	//   62  127:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   63  130:putstatic       #72  <Field EnumRechargeMode CARD_SHIFT_CAPITAL>
		MIPAY_MI = new EnumRechargeMode("MIPAY_MI", 8, 81, "\u5C0F\u7C73\u652F\u4ED8");
	//   64  133:new             #2   <Class EnumRechargeMode>
	//   65  136:dup             
	//   66  137:ldc1            #73  <String "MIPAY_MI">
	//   67  139:bipush          8
	//   68  141:bipush          81
	//   69  143:ldc1            #75  <String "\u5C0F\u7C73\u652F\u4ED8">
	//   70  145:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   71  148:putstatic       #77  <Field EnumRechargeMode MIPAY_MI>
		SAMSUNG_PAY = new EnumRechargeMode("SAMSUNG_PAY", 9, 86, "\u4E09\u661F\u652F\u4ED8");
	//   72  151:new             #2   <Class EnumRechargeMode>
	//   73  154:dup             
	//   74  155:ldc1            #78  <String "SAMSUNG_PAY">
	//   75  157:bipush          9
	//   76  159:bipush          86
	//   77  161:ldc1            #80  <String "\u4E09\u661F\u652F\u4ED8">
	//   78  163:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   79  166:putstatic       #82  <Field EnumRechargeMode SAMSUNG_PAY>
		UNIONPAY_CARD_PT = new EnumRechargeMode("UNIONPAY_CARD_PT", 10, 87, "\u94F6\u8054\u6709\u5361-\u9E4F\u6CF0\u4E09\u661F");
	//   80  169:new             #2   <Class EnumRechargeMode>
	//   81  172:dup             
	//   82  173:ldc1            #83  <String "UNIONPAY_CARD_PT">
	//   83  175:bipush          10
	//   84  177:bipush          87
	//   85  179:ldc1            #85  <String "\u94F6\u8054\u6709\u5361-\u9E4F\u6CF0\u4E09\u661F">
	//   86  181:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   87  184:putstatic       #87  <Field EnumRechargeMode UNIONPAY_CARD_PT>
		MOBILE_PROMOTION = new EnumRechargeMode("MOBILE_PROMOTION", 11, 60, "\u79FB\u52A8\u4FC3\u9500(\u4E0D\u53EF\u9886\u53D1\u7968");
	//   88  187:new             #2   <Class EnumRechargeMode>
	//   89  190:dup             
	//   90  191:ldc1            #88  <String "MOBILE_PROMOTION">
	//   91  193:bipush          11
	//   92  195:bipush          60
	//   93  197:ldc1            #90  <String "\u79FB\u52A8\u4FC3\u9500(\u4E0D\u53EF\u9886\u53D1\u7968">
	//   94  199:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//   95  202:putstatic       #92  <Field EnumRechargeMode MOBILE_PROMOTION>
		HW_PAY = new EnumRechargeMode("HW_PAY", 12, 69, "\u534E\u4E3A\u652F\u4ED8");
	//   96  205:new             #2   <Class EnumRechargeMode>
	//   97  208:dup             
	//   98  209:ldc1            #93  <String "HW_PAY">
	//   99  211:bipush          12
	//  100  213:bipush          69
	//  101  215:ldc1            #95  <String "\u534E\u4E3A\u652F\u4ED8">
	//  102  217:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//  103  220:putstatic       #97  <Field EnumRechargeMode HW_PAY>
		LKL_PAY = new EnumRechargeMode("LKL_PAY", 13, 80, "\u62C9\u5361\u62C9\u652F\u4ED8");
	//  104  223:new             #2   <Class EnumRechargeMode>
	//  105  226:dup             
	//  106  227:ldc1            #98  <String "LKL_PAY">
	//  107  229:bipush          13
	//  108  231:bipush          80
	//  109  233:ldc1            #100 <String "\u62C9\u5361\u62C9\u652F\u4ED8">
	//  110  235:invokespecial   #35  <Method void EnumRechargeMode(String, int, int, String)>
	//  111  238:putstatic       #102 <Field EnumRechargeMode LKL_PAY>
		ENUM$VALUES = (new EnumRechargeMode[] {
			COMPANY_GIVE, ALIPAY_ONE_KEY, ALIPAY_SECURE, UNIONPAY, UNIONPAY_CARD, UNIONPAY_FM, UNIONPAY_CARD_FM, CARD_SHIFT_CAPITAL, MIPAY_MI, SAMSUNG_PAY, 
			UNIONPAY_CARD_PT, MOBILE_PROMOTION, HW_PAY, LKL_PAY
		});
	//  112  241:bipush          14
	//  113  243:anewarray       EnumRechargeMode[]
	//  114  246:dup             
	//  115  247:iconst_0        
	//  116  248:getstatic       #37  <Field EnumRechargeMode COMPANY_GIVE>
	//  117  251:aastore         
	//  118  252:dup             
	//  119  253:iconst_1        
	//  120  254:getstatic       #42  <Field EnumRechargeMode ALIPAY_ONE_KEY>
	//  121  257:aastore         
	//  122  258:dup             
	//  123  259:iconst_2        
	//  124  260:getstatic       #47  <Field EnumRechargeMode ALIPAY_SECURE>
	//  125  263:aastore         
	//  126  264:dup             
	//  127  265:iconst_3        
	//  128  266:getstatic       #52  <Field EnumRechargeMode UNIONPAY>
	//  129  269:aastore         
	//  130  270:dup             
	//  131  271:iconst_4        
	//  132  272:getstatic       #57  <Field EnumRechargeMode UNIONPAY_CARD>
	//  133  275:aastore         
	//  134  276:dup             
	//  135  277:iconst_5        
	//  136  278:getstatic       #62  <Field EnumRechargeMode UNIONPAY_FM>
	//  137  281:aastore         
	//  138  282:dup             
	//  139  283:bipush          6
	//  140  285:getstatic       #67  <Field EnumRechargeMode UNIONPAY_CARD_FM>
	//  141  288:aastore         
	//  142  289:dup             
	//  143  290:bipush          7
	//  144  292:getstatic       #72  <Field EnumRechargeMode CARD_SHIFT_CAPITAL>
	//  145  295:aastore         
	//  146  296:dup             
	//  147  297:bipush          8
	//  148  299:getstatic       #77  <Field EnumRechargeMode MIPAY_MI>
	//  149  302:aastore         
	//  150  303:dup             
	//  151  304:bipush          9
	//  152  306:getstatic       #82  <Field EnumRechargeMode SAMSUNG_PAY>
	//  153  309:aastore         
	//  154  310:dup             
	//  155  311:bipush          10
	//  156  313:getstatic       #87  <Field EnumRechargeMode UNIONPAY_CARD_PT>
	//  157  316:aastore         
	//  158  317:dup             
	//  159  318:bipush          11
	//  160  320:getstatic       #92  <Field EnumRechargeMode MOBILE_PROMOTION>
	//  161  323:aastore         
	//  162  324:dup             
	//  163  325:bipush          12
	//  164  327:getstatic       #97  <Field EnumRechargeMode HW_PAY>
	//  165  330:aastore         
	//  166  331:dup             
	//  167  332:bipush          13
	//  168  334:getstatic       #102 <Field EnumRechargeMode LKL_PAY>
	//  169  337:aastore         
	//  170  338:putstatic       #104 <Field EnumRechargeMode[] ENUM$VALUES>
	//* 171  341:return          
	}
}
