// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.HashMap;
import java.util.Map;

public final class t extends Enum
	implements IPutIntoJson
{

	private t(String s1, int i1, String s2)
	{
		super(s1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #213 <Method void Enum(String, int)>
		y = s2;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #198 <Field String y>
	//    7   11:return          
	}

	public static t a(String s1)
	{
		if(z.containsKey(((Object) (s1))))
	//*   0    0:getstatic       #209 <Field Map z>
	//*   1    3:aload_0         
	//*   2    4:invokeinterface #220 <Method boolean Map.containsKey(Object)>
	//*   3    9:ifeq            25
		{
			return (t)z.get(((Object) (s1)));
	//    4   12:getstatic       #209 <Field Map z>
	//    5   15:aload_0         
	//    6   16:invokeinterface #224 <Method Object Map.get(Object)>
	//    7   21:checkcast       #2   <Class t>
	//    8   24:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   25:new             #226 <Class StringBuilder>
	//   10   28:dup             
	//   11   29:invokespecial   #227 <Method void StringBuilder()>
	//   12   32:astore_1        
			stringbuilder.append("Unknown String Value: ");
	//   13   33:aload_1         
	//   14   34:ldc1            #229 <String "Unknown String Value: ">
	//   15   36:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:pop             
			stringbuilder.append(s1);
	//   17   40:aload_1         
	//   18   41:aload_0         
	//   19   42:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   46:new             #235 <Class IllegalArgumentException>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokevirtual   #239 <Method String StringBuilder.toString()>
	//   25   54:invokespecial   #241 <Method void IllegalArgumentException(String)>
	//   26   57:athrow          
		}
	}

	public static boolean a(t t1)
	{
		return b(t1) || t1.equals(((Object) (f))) || t1.equals(((Object) (d)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #244 <Method boolean b(t)>
	//    2    4:ifne            32
	//    3    7:aload_0         
	//    4    8:getstatic       #80  <Field t f>
	//    5   11:invokevirtual   #247 <Method boolean equals(Object)>
	//    6   14:ifne            32
	//    7   17:aload_0         
	//    8   18:getstatic       #68  <Field t d>
	//    9   21:invokevirtual   #247 <Method boolean equals(Object)>
	//   10   24:ifeq            30
	//   11   27:goto            32
	//   12   30:iconst_0        
	//   13   31:ireturn         
	//   14   32:iconst_1        
	//   15   33:ireturn         
	}

	public static boolean b(t t1)
	{
		return t1.equals(((Object) (e)));
	//    0    0:aload_0         
	//    1    1:getstatic       #74  <Field t e>
	//    2    4:invokevirtual   #247 <Method boolean equals(Object)>
	//    3    7:ireturn         
	}

	public static t valueOf(String s1)
	{
		return (t)Enum.valueOf(bo/app/t, s1);
	//    0    0:ldc1            #2   <Class t>
	//    1    2:aload_0         
	//    2    3:invokestatic    #251 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class t>
	//    4    9:areturn         
	}

	public static t[] values()
	{
		return (t[])((t []) (A)).clone();
	//    0    0:getstatic       #188 <Field t[] A>
	//    1    3:invokevirtual   #256 <Method Object _5B_Lbo.app.t_3B_.clone()>
	//    2    6:checkcast       #252 <Class t[]>
	//    3    9:areturn         
	}

	public String a()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field String y>
	//    2    4:areturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method String a()>
	//    2    4:areturn         
	}

	private static final t A[];
	public static final t a;
	public static final t b;
	public static final t c;
	public static final t d;
	public static final t e;
	public static final t f;
	public static final t g;
	public static final t h;
	public static final t i;
	public static final t j;
	public static final t k;
	public static final t l;
	public static final t m;
	public static final t n;
	public static final t o;
	public static final t p;
	public static final t q;
	public static final t r;
	public static final t s;
	public static final t t;
	public static final t u;
	public static final t v;
	public static final t w;
	public static final t x;
	private static final Map z;
	private final String y;

	static 
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_0        
		a = new t("LOCATION_RECORDED", 0, "lr");
	//    2    2:new             #2   <Class t>
	//    3    5:dup             
	//    4    6:ldc1            #43  <String "LOCATION_RECORDED">
	//    5    8:iconst_0        
	//    6    9:ldc1            #45  <String "lr">
	//    7   11:invokespecial   #49  <Method void t(String, int, String)>
	//    8   14:putstatic       #51  <Field t a>
		b = new t("CUSTOM_EVENT", 1, "ce");
	//    9   17:new             #2   <Class t>
	//   10   20:dup             
	//   11   21:ldc1            #53  <String "CUSTOM_EVENT">
	//   12   23:iconst_1        
	//   13   24:ldc1            #55  <String "ce">
	//   14   26:invokespecial   #49  <Method void t(String, int, String)>
	//   15   29:putstatic       #57  <Field t b>
		c = new t("PURCHASE", 2, "p");
	//   16   32:new             #2   <Class t>
	//   17   35:dup             
	//   18   36:ldc1            #59  <String "PURCHASE">
	//   19   38:iconst_2        
	//   20   39:ldc1            #60  <String "p">
	//   21   41:invokespecial   #49  <Method void t(String, int, String)>
	//   22   44:putstatic       #62  <Field t c>
		d = new t("PUSH_STORY_PAGE_CLICK", 3, "cic");
	//   23   47:new             #2   <Class t>
	//   24   50:dup             
	//   25   51:ldc1            #64  <String "PUSH_STORY_PAGE_CLICK">
	//   26   53:iconst_3        
	//   27   54:ldc1            #66  <String "cic">
	//   28   56:invokespecial   #49  <Method void t(String, int, String)>
	//   29   59:putstatic       #68  <Field t d>
		e = new t("PUSH_NOTIFICATION_TRACKING", 4, "pc");
	//   30   62:new             #2   <Class t>
	//   31   65:dup             
	//   32   66:ldc1            #70  <String "PUSH_NOTIFICATION_TRACKING">
	//   33   68:iconst_4        
	//   34   69:ldc1            #72  <String "pc">
	//   35   71:invokespecial   #49  <Method void t(String, int, String)>
	//   36   74:putstatic       #74  <Field t e>
		f = new t("PUSH_NOTIFICATION_ACTION_TRACKING", 5, "ca");
	//   37   77:new             #2   <Class t>
	//   38   80:dup             
	//   39   81:ldc1            #76  <String "PUSH_NOTIFICATION_ACTION_TRACKING">
	//   40   83:iconst_5        
	//   41   84:ldc1            #78  <String "ca">
	//   42   86:invokespecial   #49  <Method void t(String, int, String)>
	//   43   89:putstatic       #80  <Field t f>
		g = new t("INTERNAL", 6, "i");
	//   44   92:new             #2   <Class t>
	//   45   95:dup             
	//   46   96:ldc1            #82  <String "INTERNAL">
	//   47   98:bipush          6
	//   48  100:ldc1            #83  <String "i">
	//   49  102:invokespecial   #49  <Method void t(String, int, String)>
	//   50  105:putstatic       #85  <Field t g>
		h = new t("INTERNAL_ERROR", 7, "ie");
	//   51  108:new             #2   <Class t>
	//   52  111:dup             
	//   53  112:ldc1            #87  <String "INTERNAL_ERROR">
	//   54  114:bipush          7
	//   55  116:ldc1            #89  <String "ie">
	//   56  118:invokespecial   #49  <Method void t(String, int, String)>
	//   57  121:putstatic       #91  <Field t h>
		i = new t("CARD_IMPRESSION", 8, "ci");
	//   58  124:new             #2   <Class t>
	//   59  127:dup             
	//   60  128:ldc1            #93  <String "CARD_IMPRESSION">
	//   61  130:bipush          8
	//   62  132:ldc1            #95  <String "ci">
	//   63  134:invokespecial   #49  <Method void t(String, int, String)>
	//   64  137:putstatic       #97  <Field t i>
		j = new t("CARD_CLICK", 9, "cc");
	//   65  140:new             #2   <Class t>
	//   66  143:dup             
	//   67  144:ldc1            #99  <String "CARD_CLICK">
	//   68  146:bipush          9
	//   69  148:ldc1            #101 <String "cc">
	//   70  150:invokespecial   #49  <Method void t(String, int, String)>
	//   71  153:putstatic       #103 <Field t j>
		k = new t("GEOFENCE", 10, "g");
	//   72  156:new             #2   <Class t>
	//   73  159:dup             
	//   74  160:ldc1            #105 <String "GEOFENCE">
	//   75  162:bipush          10
	//   76  164:ldc1            #106 <String "g">
	//   77  166:invokespecial   #49  <Method void t(String, int, String)>
	//   78  169:putstatic       #108 <Field t k>
		l = new t("INCREMENT", 11, "inc");
	//   79  172:new             #2   <Class t>
	//   80  175:dup             
	//   81  176:ldc1            #110 <String "INCREMENT">
	//   82  178:bipush          11
	//   83  180:ldc1            #112 <String "inc">
	//   84  182:invokespecial   #49  <Method void t(String, int, String)>
	//   85  185:putstatic       #114 <Field t l>
		m = new t("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 12, "add");
	//   86  188:new             #2   <Class t>
	//   87  191:dup             
	//   88  192:ldc1            #116 <String "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY">
	//   89  194:bipush          12
	//   90  196:ldc1            #118 <String "add">
	//   91  198:invokespecial   #49  <Method void t(String, int, String)>
	//   92  201:putstatic       #120 <Field t m>
		n = new t("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 13, "rem");
	//   93  204:new             #2   <Class t>
	//   94  207:dup             
	//   95  208:ldc1            #122 <String "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY">
	//   96  210:bipush          13
	//   97  212:ldc1            #124 <String "rem">
	//   98  214:invokespecial   #49  <Method void t(String, int, String)>
	//   99  217:putstatic       #126 <Field t n>
		o = new t("SET_CUSTOM_ATTRIBUTE_ARRAY", 14, "set");
	//  100  220:new             #2   <Class t>
	//  101  223:dup             
	//  102  224:ldc1            #128 <String "SET_CUSTOM_ATTRIBUTE_ARRAY">
	//  103  226:bipush          14
	//  104  228:ldc1            #130 <String "set">
	//  105  230:invokespecial   #49  <Method void t(String, int, String)>
	//  106  233:putstatic       #132 <Field t o>
		p = new t("INAPP_MESSAGE_IMPRESSION", 15, "si");
	//  107  236:new             #2   <Class t>
	//  108  239:dup             
	//  109  240:ldc1            #134 <String "INAPP_MESSAGE_IMPRESSION">
	//  110  242:bipush          15
	//  111  244:ldc1            #136 <String "si">
	//  112  246:invokespecial   #49  <Method void t(String, int, String)>
	//  113  249:putstatic       #138 <Field t p>
		q = new t("INAPP_MESSAGE_CONTROL_IMPRESSION", 16, "iec");
	//  114  252:new             #2   <Class t>
	//  115  255:dup             
	//  116  256:ldc1            #140 <String "INAPP_MESSAGE_CONTROL_IMPRESSION">
	//  117  258:bipush          16
	//  118  260:ldc1            #142 <String "iec">
	//  119  262:invokespecial   #49  <Method void t(String, int, String)>
	//  120  265:putstatic       #144 <Field t q>
		r = new t("INAPP_MESSAGE_CLICK", 17, "sc");
	//  121  268:new             #2   <Class t>
	//  122  271:dup             
	//  123  272:ldc1            #146 <String "INAPP_MESSAGE_CLICK">
	//  124  274:bipush          17
	//  125  276:ldc1            #148 <String "sc">
	//  126  278:invokespecial   #49  <Method void t(String, int, String)>
	//  127  281:putstatic       #150 <Field t r>
		s = new t("INAPP_MESSAGE_BUTTON_CLICK", 18, "sbc");
	//  128  284:new             #2   <Class t>
	//  129  287:dup             
	//  130  288:ldc1            #152 <String "INAPP_MESSAGE_BUTTON_CLICK">
	//  131  290:bipush          18
	//  132  292:ldc1            #154 <String "sbc">
	//  133  294:invokespecial   #49  <Method void t(String, int, String)>
	//  134  297:putstatic       #156 <Field t s>
		t = new t("INAPP_MESSAGE_DISPLAY_FAILURE", 19, "sfe");
	//  135  300:new             #2   <Class t>
	//  136  303:dup             
	//  137  304:ldc1            #158 <String "INAPP_MESSAGE_DISPLAY_FAILURE">
	//  138  306:bipush          19
	//  139  308:ldc1            #160 <String "sfe">
	//  140  310:invokespecial   #49  <Method void t(String, int, String)>
	//  141  313:putstatic       #162 <Field t t>
		u = new t("USER_ALIAS", 20, "uae");
	//  142  316:new             #2   <Class t>
	//  143  319:dup             
	//  144  320:ldc1            #164 <String "USER_ALIAS">
	//  145  322:bipush          20
	//  146  324:ldc1            #166 <String "uae">
	//  147  326:invokespecial   #49  <Method void t(String, int, String)>
	//  148  329:putstatic       #168 <Field t u>
		v = new t("SESSION_START", 21, "ss");
	//  149  332:new             #2   <Class t>
	//  150  335:dup             
	//  151  336:ldc1            #170 <String "SESSION_START">
	//  152  338:bipush          21
	//  153  340:ldc1            #172 <String "ss">
	//  154  342:invokespecial   #49  <Method void t(String, int, String)>
	//  155  345:putstatic       #174 <Field t v>
		w = new t("SESSION_END", 22, "se");
	//  156  348:new             #2   <Class t>
	//  157  351:dup             
	//  158  352:ldc1            #176 <String "SESSION_END">
	//  159  354:bipush          22
	//  160  356:ldc1            #178 <String "se">
	//  161  358:invokespecial   #49  <Method void t(String, int, String)>
	//  162  361:putstatic       #180 <Field t w>
		x = new t("PUSH_DELIVERY", 23, "pd");
	//  163  364:new             #2   <Class t>
	//  164  367:dup             
	//  165  368:ldc1            #182 <String "PUSH_DELIVERY">
	//  166  370:bipush          23
	//  167  372:ldc1            #184 <String "pd">
	//  168  374:invokespecial   #49  <Method void t(String, int, String)>
	//  169  377:putstatic       #186 <Field t x>
		A = (new t[] {
			a, b, c, d, e, f, g, h, i, j, 
			k, l, m, n, o, p, q, r, s, t, 
			u, v, w, x
		});
	//  170  380:bipush          24
	//  171  382:anewarray       t[]
	//  172  385:dup             
	//  173  386:iconst_0        
	//  174  387:getstatic       #51  <Field t a>
	//  175  390:aastore         
	//  176  391:dup             
	//  177  392:iconst_1        
	//  178  393:getstatic       #57  <Field t b>
	//  179  396:aastore         
	//  180  397:dup             
	//  181  398:iconst_2        
	//  182  399:getstatic       #62  <Field t c>
	//  183  402:aastore         
	//  184  403:dup             
	//  185  404:iconst_3        
	//  186  405:getstatic       #68  <Field t d>
	//  187  408:aastore         
	//  188  409:dup             
	//  189  410:iconst_4        
	//  190  411:getstatic       #74  <Field t e>
	//  191  414:aastore         
	//  192  415:dup             
	//  193  416:iconst_5        
	//  194  417:getstatic       #80  <Field t f>
	//  195  420:aastore         
	//  196  421:dup             
	//  197  422:bipush          6
	//  198  424:getstatic       #85  <Field t g>
	//  199  427:aastore         
	//  200  428:dup             
	//  201  429:bipush          7
	//  202  431:getstatic       #91  <Field t h>
	//  203  434:aastore         
	//  204  435:dup             
	//  205  436:bipush          8
	//  206  438:getstatic       #97  <Field t i>
	//  207  441:aastore         
	//  208  442:dup             
	//  209  443:bipush          9
	//  210  445:getstatic       #103 <Field t j>
	//  211  448:aastore         
	//  212  449:dup             
	//  213  450:bipush          10
	//  214  452:getstatic       #108 <Field t k>
	//  215  455:aastore         
	//  216  456:dup             
	//  217  457:bipush          11
	//  218  459:getstatic       #114 <Field t l>
	//  219  462:aastore         
	//  220  463:dup             
	//  221  464:bipush          12
	//  222  466:getstatic       #120 <Field t m>
	//  223  469:aastore         
	//  224  470:dup             
	//  225  471:bipush          13
	//  226  473:getstatic       #126 <Field t n>
	//  227  476:aastore         
	//  228  477:dup             
	//  229  478:bipush          14
	//  230  480:getstatic       #132 <Field t o>
	//  231  483:aastore         
	//  232  484:dup             
	//  233  485:bipush          15
	//  234  487:getstatic       #138 <Field t p>
	//  235  490:aastore         
	//  236  491:dup             
	//  237  492:bipush          16
	//  238  494:getstatic       #144 <Field t q>
	//  239  497:aastore         
	//  240  498:dup             
	//  241  499:bipush          17
	//  242  501:getstatic       #150 <Field t r>
	//  243  504:aastore         
	//  244  505:dup             
	//  245  506:bipush          18
	//  246  508:getstatic       #156 <Field t s>
	//  247  511:aastore         
	//  248  512:dup             
	//  249  513:bipush          19
	//  250  515:getstatic       #162 <Field t t>
	//  251  518:aastore         
	//  252  519:dup             
	//  253  520:bipush          20
	//  254  522:getstatic       #168 <Field t u>
	//  255  525:aastore         
	//  256  526:dup             
	//  257  527:bipush          21
	//  258  529:getstatic       #174 <Field t v>
	//  259  532:aastore         
	//  260  533:dup             
	//  261  534:bipush          22
	//  262  536:getstatic       #180 <Field t w>
	//  263  539:aastore         
	//  264  540:dup             
	//  265  541:bipush          23
	//  266  543:getstatic       #186 <Field t x>
	//  267  546:aastore         
	//  268  547:putstatic       #188 <Field t[] A>
		HashMap hashmap = new HashMap();
	//  269  550:new             #190 <Class HashMap>
	//  270  553:dup             
	//  271  554:invokespecial   #192 <Method void HashMap()>
	//  272  557:astore_2        
		t at[] = values();
	//  273  558:invokestatic    #196 <Method t[] values()>
	//  274  561:astore_3        
		for(int j1 = at.length; i1 < j1; i1++)
	//* 275  562:aload_3         
	//* 276  563:arraylength     
	//* 277  564:istore_1        
	//* 278  565:iload_0         
	//* 279  566:iload_1         
	//* 280  567:icmpge          596
		{
			t t1 = at[i1];
	//  281  570:aload_3         
	//  282  571:iload_0         
	//  283  572:aaload          
	//  284  573:astore          4
			((Map) (hashmap)).put(((Object) (t1.y)), ((Object) (t1)));
	//  285  575:aload_2         
	//  286  576:aload           4
	//  287  578:getfield        #198 <Field String y>
	//  288  581:aload           4
	//  289  583:invokeinterface #204 <Method Object Map.put(Object, Object)>
	//  290  588:pop             
		}

	//  291  589:iload_0         
	//  292  590:iconst_1        
	//  293  591:iadd            
	//  294  592:istore_0        
	//* 295  593:goto            565
		z = ((Map) (new HashMap(((Map) (hashmap)))));
	//  296  596:new             #190 <Class HashMap>
	//  297  599:dup             
	//  298  600:aload_2         
	//  299  601:invokespecial   #207 <Method void HashMap(Map)>
	//  300  604:putstatic       #209 <Field Map z>
	//* 301  607:return          
	}
}
