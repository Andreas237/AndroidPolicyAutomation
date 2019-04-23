// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			cb, iz, cc

public final class ib extends Enum
	implements cb
{

	private ib(String s1, int i1, int j1)
	{
		super(s1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #126 <Method void Enum(String, int)>
		u = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #128 <Field int u>
	//    7   11:return          
	}

	public static ib a(int i1)
	{
		switch(i1)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -1 17: default 92
	//	               -1 166
	//	               0 162
	//	               1 158
	//	               2 154
	//	               3 150
	//	               4 146
	//	               5 142
	//	               6 138
	//	               7 134
	//	               8 130
	//	               9 126
	//	               10 122
	//	               11 118
	//	               12 114
	//	               13 110
	//	               14 106
	//	               15 102
	//	               16 98
	//	               17 94
		default:
			return null;
	//    2   92:aconst_null     
	//    3   93:areturn         

		case 17: // '\021'
			return s;
	//    4   94:getstatic       #114 <Field ib s>
	//    5   97:areturn         

		case 16: // '\020'
			return r;
	//    6   98:getstatic       #110 <Field ib r>
	//    7  101:areturn         

		case 15: // '\017'
			return q;
	//    8  102:getstatic       #106 <Field ib q>
	//    9  105:areturn         

		case 14: // '\016'
			return p;
	//   10  106:getstatic       #102 <Field ib p>
	//   11  109:areturn         

		case 13: // '\r'
			return o;
	//   12  110:getstatic       #98  <Field ib o>
	//   13  113:areturn         

		case 12: // '\f'
			return n;
	//   14  114:getstatic       #94  <Field ib n>
	//   15  117:areturn         

		case 11: // '\013'
			return m;
	//   16  118:getstatic       #90  <Field ib m>
	//   17  121:areturn         

		case 10: // '\n'
			return l;
	//   18  122:getstatic       #86  <Field ib l>
	//   19  125:areturn         

		case 9: // '\t'
			return k;
	//   20  126:getstatic       #82  <Field ib k>
	//   21  129:areturn         

		case 8: // '\b'
			return j;
	//   22  130:getstatic       #78  <Field ib j>
	//   23  133:areturn         

		case 7: // '\007'
			return i;
	//   24  134:getstatic       #74  <Field ib i>
	//   25  137:areturn         

		case 6: // '\006'
			return h;
	//   26  138:getstatic       #70  <Field ib h>
	//   27  141:areturn         

		case 5: // '\005'
			return g;
	//   28  142:getstatic       #66  <Field ib g>
	//   29  145:areturn         

		case 4: // '\004'
			return f;
	//   30  146:getstatic       #62  <Field ib f>
	//   31  149:areturn         

		case 3: // '\003'
			return e;
	//   32  150:getstatic       #58  <Field ib e>
	//   33  153:areturn         

		case 2: // '\002'
			return d;
	//   34  154:getstatic       #54  <Field ib d>
	//   35  157:areturn         

		case 1: // '\001'
			return c;
	//   36  158:getstatic       #50  <Field ib c>
	//   37  161:areturn         

		case 0: // '\0'
			return b;
	//   38  162:getstatic       #46  <Field ib b>
	//   39  165:areturn         

		case -1: 
			return a;
	//   40  166:getstatic       #42  <Field ib a>
	//   41  169:areturn         
		}
	}

	public static cc b()
	{
		return t;
	//    0    0:getstatic       #122 <Field cc t>
	//    1    3:areturn         
	}

	public static ib[] values()
	{
		return (ib[])((ib []) (v)).clone();
	//    0    0:getstatic       #116 <Field ib[] v>
	//    1    3:invokevirtual   #137 <Method Object _5B_Lcom.google.android.gms.internal.clearcut.ib_3B_.clone()>
	//    2    6:checkcast       #133 <Class ib[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int u>
	//    2    4:ireturn         
	}

	private static final ib a;
	private static final ib b;
	private static final ib c;
	private static final ib d;
	private static final ib e;
	private static final ib f;
	private static final ib g;
	private static final ib h;
	private static final ib i;
	private static final ib j;
	private static final ib k;
	private static final ib l;
	private static final ib m;
	private static final ib n;
	private static final ib o;
	private static final ib p;
	private static final ib q;
	private static final ib r;
	private static final ib s;
	private static final cc t = new iz();
	private static final ib v[];
	private final int u;

	static 
	{
		a = new ib("NONE", 0, -1);
	//    0    0:new             #2   <Class ib>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:iconst_m1       
	//    5    8:invokespecial   #40  <Method void ib(String, int, int)>
	//    6   11:putstatic       #42  <Field ib a>
		b = new ib("MOBILE", 1, 0);
	//    7   14:new             #2   <Class ib>
	//    8   17:dup             
	//    9   18:ldc1            #44  <String "MOBILE">
	//   10   20:iconst_1        
	//   11   21:iconst_0        
	//   12   22:invokespecial   #40  <Method void ib(String, int, int)>
	//   13   25:putstatic       #46  <Field ib b>
		c = new ib("WIFI", 2, 1);
	//   14   28:new             #2   <Class ib>
	//   15   31:dup             
	//   16   32:ldc1            #48  <String "WIFI">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #40  <Method void ib(String, int, int)>
	//   20   39:putstatic       #50  <Field ib c>
		d = new ib("MOBILE_MMS", 3, 2);
	//   21   42:new             #2   <Class ib>
	//   22   45:dup             
	//   23   46:ldc1            #52  <String "MOBILE_MMS">
	//   24   48:iconst_3        
	//   25   49:iconst_2        
	//   26   50:invokespecial   #40  <Method void ib(String, int, int)>
	//   27   53:putstatic       #54  <Field ib d>
		e = new ib("MOBILE_SUPL", 4, 3);
	//   28   56:new             #2   <Class ib>
	//   29   59:dup             
	//   30   60:ldc1            #56  <String "MOBILE_SUPL">
	//   31   62:iconst_4        
	//   32   63:iconst_3        
	//   33   64:invokespecial   #40  <Method void ib(String, int, int)>
	//   34   67:putstatic       #58  <Field ib e>
		f = new ib("MOBILE_DUN", 5, 4);
	//   35   70:new             #2   <Class ib>
	//   36   73:dup             
	//   37   74:ldc1            #60  <String "MOBILE_DUN">
	//   38   76:iconst_5        
	//   39   77:iconst_4        
	//   40   78:invokespecial   #40  <Method void ib(String, int, int)>
	//   41   81:putstatic       #62  <Field ib f>
		g = new ib("MOBILE_HIPRI", 6, 5);
	//   42   84:new             #2   <Class ib>
	//   43   87:dup             
	//   44   88:ldc1            #64  <String "MOBILE_HIPRI">
	//   45   90:bipush          6
	//   46   92:iconst_5        
	//   47   93:invokespecial   #40  <Method void ib(String, int, int)>
	//   48   96:putstatic       #66  <Field ib g>
		h = new ib("WIMAX", 7, 6);
	//   49   99:new             #2   <Class ib>
	//   50  102:dup             
	//   51  103:ldc1            #68  <String "WIMAX">
	//   52  105:bipush          7
	//   53  107:bipush          6
	//   54  109:invokespecial   #40  <Method void ib(String, int, int)>
	//   55  112:putstatic       #70  <Field ib h>
		i = new ib("BLUETOOTH", 8, 7);
	//   56  115:new             #2   <Class ib>
	//   57  118:dup             
	//   58  119:ldc1            #72  <String "BLUETOOTH">
	//   59  121:bipush          8
	//   60  123:bipush          7
	//   61  125:invokespecial   #40  <Method void ib(String, int, int)>
	//   62  128:putstatic       #74  <Field ib i>
		j = new ib("DUMMY", 9, 8);
	//   63  131:new             #2   <Class ib>
	//   64  134:dup             
	//   65  135:ldc1            #76  <String "DUMMY">
	//   66  137:bipush          9
	//   67  139:bipush          8
	//   68  141:invokespecial   #40  <Method void ib(String, int, int)>
	//   69  144:putstatic       #78  <Field ib j>
		k = new ib("ETHERNET", 10, 9);
	//   70  147:new             #2   <Class ib>
	//   71  150:dup             
	//   72  151:ldc1            #80  <String "ETHERNET">
	//   73  153:bipush          10
	//   74  155:bipush          9
	//   75  157:invokespecial   #40  <Method void ib(String, int, int)>
	//   76  160:putstatic       #82  <Field ib k>
		l = new ib("MOBILE_FOTA", 11, 10);
	//   77  163:new             #2   <Class ib>
	//   78  166:dup             
	//   79  167:ldc1            #84  <String "MOBILE_FOTA">
	//   80  169:bipush          11
	//   81  171:bipush          10
	//   82  173:invokespecial   #40  <Method void ib(String, int, int)>
	//   83  176:putstatic       #86  <Field ib l>
		m = new ib("MOBILE_IMS", 12, 11);
	//   84  179:new             #2   <Class ib>
	//   85  182:dup             
	//   86  183:ldc1            #88  <String "MOBILE_IMS">
	//   87  185:bipush          12
	//   88  187:bipush          11
	//   89  189:invokespecial   #40  <Method void ib(String, int, int)>
	//   90  192:putstatic       #90  <Field ib m>
		n = new ib("MOBILE_CBS", 13, 12);
	//   91  195:new             #2   <Class ib>
	//   92  198:dup             
	//   93  199:ldc1            #92  <String "MOBILE_CBS">
	//   94  201:bipush          13
	//   95  203:bipush          12
	//   96  205:invokespecial   #40  <Method void ib(String, int, int)>
	//   97  208:putstatic       #94  <Field ib n>
		o = new ib("WIFI_P2P", 14, 13);
	//   98  211:new             #2   <Class ib>
	//   99  214:dup             
	//  100  215:ldc1            #96  <String "WIFI_P2P">
	//  101  217:bipush          14
	//  102  219:bipush          13
	//  103  221:invokespecial   #40  <Method void ib(String, int, int)>
	//  104  224:putstatic       #98  <Field ib o>
		p = new ib("MOBILE_IA", 15, 14);
	//  105  227:new             #2   <Class ib>
	//  106  230:dup             
	//  107  231:ldc1            #100 <String "MOBILE_IA">
	//  108  233:bipush          15
	//  109  235:bipush          14
	//  110  237:invokespecial   #40  <Method void ib(String, int, int)>
	//  111  240:putstatic       #102 <Field ib p>
		q = new ib("MOBILE_EMERGENCY", 16, 15);
	//  112  243:new             #2   <Class ib>
	//  113  246:dup             
	//  114  247:ldc1            #104 <String "MOBILE_EMERGENCY">
	//  115  249:bipush          16
	//  116  251:bipush          15
	//  117  253:invokespecial   #40  <Method void ib(String, int, int)>
	//  118  256:putstatic       #106 <Field ib q>
		r = new ib("PROXY", 17, 16);
	//  119  259:new             #2   <Class ib>
	//  120  262:dup             
	//  121  263:ldc1            #108 <String "PROXY">
	//  122  265:bipush          17
	//  123  267:bipush          16
	//  124  269:invokespecial   #40  <Method void ib(String, int, int)>
	//  125  272:putstatic       #110 <Field ib r>
		s = new ib("VPN", 18, 17);
	//  126  275:new             #2   <Class ib>
	//  127  278:dup             
	//  128  279:ldc1            #112 <String "VPN">
	//  129  281:bipush          18
	//  130  283:bipush          17
	//  131  285:invokespecial   #40  <Method void ib(String, int, int)>
	//  132  288:putstatic       #114 <Field ib s>
		v = (new ib[] {
			a, b, c, d, e, f, g, h, i, j, 
			k, l, m, n, o, p, q, r, s
		});
	//  133  291:bipush          19
	//  134  293:anewarray       ib[]
	//  135  296:dup             
	//  136  297:iconst_0        
	//  137  298:getstatic       #42  <Field ib a>
	//  138  301:aastore         
	//  139  302:dup             
	//  140  303:iconst_1        
	//  141  304:getstatic       #46  <Field ib b>
	//  142  307:aastore         
	//  143  308:dup             
	//  144  309:iconst_2        
	//  145  310:getstatic       #50  <Field ib c>
	//  146  313:aastore         
	//  147  314:dup             
	//  148  315:iconst_3        
	//  149  316:getstatic       #54  <Field ib d>
	//  150  319:aastore         
	//  151  320:dup             
	//  152  321:iconst_4        
	//  153  322:getstatic       #58  <Field ib e>
	//  154  325:aastore         
	//  155  326:dup             
	//  156  327:iconst_5        
	//  157  328:getstatic       #62  <Field ib f>
	//  158  331:aastore         
	//  159  332:dup             
	//  160  333:bipush          6
	//  161  335:getstatic       #66  <Field ib g>
	//  162  338:aastore         
	//  163  339:dup             
	//  164  340:bipush          7
	//  165  342:getstatic       #70  <Field ib h>
	//  166  345:aastore         
	//  167  346:dup             
	//  168  347:bipush          8
	//  169  349:getstatic       #74  <Field ib i>
	//  170  352:aastore         
	//  171  353:dup             
	//  172  354:bipush          9
	//  173  356:getstatic       #78  <Field ib j>
	//  174  359:aastore         
	//  175  360:dup             
	//  176  361:bipush          10
	//  177  363:getstatic       #82  <Field ib k>
	//  178  366:aastore         
	//  179  367:dup             
	//  180  368:bipush          11
	//  181  370:getstatic       #86  <Field ib l>
	//  182  373:aastore         
	//  183  374:dup             
	//  184  375:bipush          12
	//  185  377:getstatic       #90  <Field ib m>
	//  186  380:aastore         
	//  187  381:dup             
	//  188  382:bipush          13
	//  189  384:getstatic       #94  <Field ib n>
	//  190  387:aastore         
	//  191  388:dup             
	//  192  389:bipush          14
	//  193  391:getstatic       #98  <Field ib o>
	//  194  394:aastore         
	//  195  395:dup             
	//  196  396:bipush          15
	//  197  398:getstatic       #102 <Field ib p>
	//  198  401:aastore         
	//  199  402:dup             
	//  200  403:bipush          16
	//  201  405:getstatic       #106 <Field ib q>
	//  202  408:aastore         
	//  203  409:dup             
	//  204  410:bipush          17
	//  205  412:getstatic       #110 <Field ib r>
	//  206  415:aastore         
	//  207  416:dup             
	//  208  417:bipush          18
	//  209  419:getstatic       #114 <Field ib s>
	//  210  422:aastore         
	//  211  423:putstatic       #116 <Field ib[] v>
	//  212  426:new             #118 <Class iz>
	//  213  429:dup             
	//  214  430:invokespecial   #120 <Method void iz()>
	//  215  433:putstatic       #122 <Field cc t>
	//* 216  436:return          
	}
}
