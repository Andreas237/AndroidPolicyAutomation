// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awe, awa, awb, awc, 
//			awd, avy

public class avz extends Enum
{

	private avz(String s1, int i1, awe awe1, int j1)
	{
		super(s1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #145 <Method void Enum(String, int)>
		s = awe1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #147 <Field awe s>
		t = j1;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #149 <Field int t>
	//   10   17:return          
	}

	avz(String s1, int i1, awe awe1, int j1, avy avy)
	{
		this(s1, i1, awe1, j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//    6    9:return          
	}

	public static avz[] values()
	{
		return (avz[])((avz []) (u)).clone();
	//    0    0:getstatic       #141 <Field avz[] u>
	//    1    3:invokevirtual   #157 <Method Object _5B_Lcom.google.android.gms.internal.ads.avz_3B_.clone()>
	//    2    6:checkcast       #153 <Class avz[]>
	//    3    9:areturn         
	}

	public final awe a()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field awe s>
	//    2    4:areturn         
	}

	public final int b()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int t>
	//    2    4:ireturn         
	}

	public static final avz a;
	public static final avz b;
	public static final avz c;
	public static final avz d;
	public static final avz e;
	public static final avz f;
	public static final avz g;
	public static final avz h;
	public static final avz i;
	public static final avz j;
	public static final avz k;
	public static final avz l;
	public static final avz m;
	public static final avz n;
	public static final avz o;
	public static final avz p;
	public static final avz q;
	public static final avz r;
	private static final avz u[];
	private final awe s;
	private final int t;

	static 
	{
		a = new avz("DOUBLE", 0, awe.d, 1);
	//    0    0:new             #2   <Class avz>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:getstatic       #37  <Field awe awe.d>
	//    5   10:iconst_1        
	//    6   11:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//    7   14:putstatic       #43  <Field avz a>
		b = new avz("FLOAT", 1, awe.c, 5);
	//    8   17:new             #2   <Class avz>
	//    9   20:dup             
	//   10   21:ldc1            #45  <String "FLOAT">
	//   11   23:iconst_1        
	//   12   24:getstatic       #47  <Field awe awe.c>
	//   13   27:iconst_5        
	//   14   28:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   15   31:putstatic       #49  <Field avz b>
		c = new avz("INT64", 2, awe.b, 0);
	//   16   34:new             #2   <Class avz>
	//   17   37:dup             
	//   18   38:ldc1            #51  <String "INT64">
	//   19   40:iconst_2        
	//   20   41:getstatic       #53  <Field awe awe.b>
	//   21   44:iconst_0        
	//   22   45:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   23   48:putstatic       #55  <Field avz c>
		d = new avz("UINT64", 3, awe.b, 0);
	//   24   51:new             #2   <Class avz>
	//   25   54:dup             
	//   26   55:ldc1            #57  <String "UINT64">
	//   27   57:iconst_3        
	//   28   58:getstatic       #53  <Field awe awe.b>
	//   29   61:iconst_0        
	//   30   62:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   31   65:putstatic       #59  <Field avz d>
		e = new avz("INT32", 4, awe.a, 0);
	//   32   68:new             #2   <Class avz>
	//   33   71:dup             
	//   34   72:ldc1            #61  <String "INT32">
	//   35   74:iconst_4        
	//   36   75:getstatic       #63  <Field awe awe.a>
	//   37   78:iconst_0        
	//   38   79:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   39   82:putstatic       #65  <Field avz e>
		f = new avz("FIXED64", 5, awe.b, 1);
	//   40   85:new             #2   <Class avz>
	//   41   88:dup             
	//   42   89:ldc1            #67  <String "FIXED64">
	//   43   91:iconst_5        
	//   44   92:getstatic       #53  <Field awe awe.b>
	//   45   95:iconst_1        
	//   46   96:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   47   99:putstatic       #69  <Field avz f>
		g = new avz("FIXED32", 6, awe.a, 5);
	//   48  102:new             #2   <Class avz>
	//   49  105:dup             
	//   50  106:ldc1            #71  <String "FIXED32">
	//   51  108:bipush          6
	//   52  110:getstatic       #63  <Field awe awe.a>
	//   53  113:iconst_5        
	//   54  114:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   55  117:putstatic       #73  <Field avz g>
		h = new avz("BOOL", 7, awe.e, 0);
	//   56  120:new             #2   <Class avz>
	//   57  123:dup             
	//   58  124:ldc1            #75  <String "BOOL">
	//   59  126:bipush          7
	//   60  128:getstatic       #77  <Field awe awe.e>
	//   61  131:iconst_0        
	//   62  132:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//   63  135:putstatic       #79  <Field avz h>
		i = ((avz) (new awa("STRING", 8, awe.f, 2)));
	//   64  138:new             #81  <Class awa>
	//   65  141:dup             
	//   66  142:ldc1            #83  <String "STRING">
	//   67  144:bipush          8
	//   68  146:getstatic       #85  <Field awe awe.f>
	//   69  149:iconst_2        
	//   70  150:invokespecial   #86  <Method void awa(String, int, awe, int)>
	//   71  153:putstatic       #88  <Field avz i>
		j = ((avz) (new awb("GROUP", 9, awe.i, 3)));
	//   72  156:new             #90  <Class awb>
	//   73  159:dup             
	//   74  160:ldc1            #92  <String "GROUP">
	//   75  162:bipush          9
	//   76  164:getstatic       #94  <Field awe awe.i>
	//   77  167:iconst_3        
	//   78  168:invokespecial   #95  <Method void awb(String, int, awe, int)>
	//   79  171:putstatic       #97  <Field avz j>
		k = ((avz) (new awc("MESSAGE", 10, awe.i, 2)));
	//   80  174:new             #99  <Class awc>
	//   81  177:dup             
	//   82  178:ldc1            #101 <String "MESSAGE">
	//   83  180:bipush          10
	//   84  182:getstatic       #94  <Field awe awe.i>
	//   85  185:iconst_2        
	//   86  186:invokespecial   #102 <Method void awc(String, int, awe, int)>
	//   87  189:putstatic       #104 <Field avz k>
		l = ((avz) (new awd("BYTES", 11, awe.g, 2)));
	//   88  192:new             #106 <Class awd>
	//   89  195:dup             
	//   90  196:ldc1            #108 <String "BYTES">
	//   91  198:bipush          11
	//   92  200:getstatic       #110 <Field awe awe.g>
	//   93  203:iconst_2        
	//   94  204:invokespecial   #111 <Method void awd(String, int, awe, int)>
	//   95  207:putstatic       #113 <Field avz l>
		m = new avz("UINT32", 12, awe.a, 0);
	//   96  210:new             #2   <Class avz>
	//   97  213:dup             
	//   98  214:ldc1            #115 <String "UINT32">
	//   99  216:bipush          12
	//  100  218:getstatic       #63  <Field awe awe.a>
	//  101  221:iconst_0        
	//  102  222:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  103  225:putstatic       #117 <Field avz m>
		n = new avz("ENUM", 13, awe.h, 0);
	//  104  228:new             #2   <Class avz>
	//  105  231:dup             
	//  106  232:ldc1            #119 <String "ENUM">
	//  107  234:bipush          13
	//  108  236:getstatic       #121 <Field awe awe.h>
	//  109  239:iconst_0        
	//  110  240:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  111  243:putstatic       #123 <Field avz n>
		o = new avz("SFIXED32", 14, awe.a, 5);
	//  112  246:new             #2   <Class avz>
	//  113  249:dup             
	//  114  250:ldc1            #125 <String "SFIXED32">
	//  115  252:bipush          14
	//  116  254:getstatic       #63  <Field awe awe.a>
	//  117  257:iconst_5        
	//  118  258:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  119  261:putstatic       #127 <Field avz o>
		p = new avz("SFIXED64", 15, awe.b, 1);
	//  120  264:new             #2   <Class avz>
	//  121  267:dup             
	//  122  268:ldc1            #129 <String "SFIXED64">
	//  123  270:bipush          15
	//  124  272:getstatic       #53  <Field awe awe.b>
	//  125  275:iconst_1        
	//  126  276:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  127  279:putstatic       #131 <Field avz p>
		q = new avz("SINT32", 16, awe.a, 0);
	//  128  282:new             #2   <Class avz>
	//  129  285:dup             
	//  130  286:ldc1            #133 <String "SINT32">
	//  131  288:bipush          16
	//  132  290:getstatic       #63  <Field awe awe.a>
	//  133  293:iconst_0        
	//  134  294:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  135  297:putstatic       #135 <Field avz q>
		r = new avz("SINT64", 17, awe.b, 0);
	//  136  300:new             #2   <Class avz>
	//  137  303:dup             
	//  138  304:ldc1            #137 <String "SINT64">
	//  139  306:bipush          17
	//  140  308:getstatic       #53  <Field awe awe.b>
	//  141  311:iconst_0        
	//  142  312:invokespecial   #41  <Method void avz(String, int, awe, int)>
	//  143  315:putstatic       #139 <Field avz r>
		u = (new avz[] {
			a, b, c, d, e, f, g, h, i, j, 
			k, l, m, n, o, p, q, r
		});
	//  144  318:bipush          18
	//  145  320:anewarray       avz[]
	//  146  323:dup             
	//  147  324:iconst_0        
	//  148  325:getstatic       #43  <Field avz a>
	//  149  328:aastore         
	//  150  329:dup             
	//  151  330:iconst_1        
	//  152  331:getstatic       #49  <Field avz b>
	//  153  334:aastore         
	//  154  335:dup             
	//  155  336:iconst_2        
	//  156  337:getstatic       #55  <Field avz c>
	//  157  340:aastore         
	//  158  341:dup             
	//  159  342:iconst_3        
	//  160  343:getstatic       #59  <Field avz d>
	//  161  346:aastore         
	//  162  347:dup             
	//  163  348:iconst_4        
	//  164  349:getstatic       #65  <Field avz e>
	//  165  352:aastore         
	//  166  353:dup             
	//  167  354:iconst_5        
	//  168  355:getstatic       #69  <Field avz f>
	//  169  358:aastore         
	//  170  359:dup             
	//  171  360:bipush          6
	//  172  362:getstatic       #73  <Field avz g>
	//  173  365:aastore         
	//  174  366:dup             
	//  175  367:bipush          7
	//  176  369:getstatic       #79  <Field avz h>
	//  177  372:aastore         
	//  178  373:dup             
	//  179  374:bipush          8
	//  180  376:getstatic       #88  <Field avz i>
	//  181  379:aastore         
	//  182  380:dup             
	//  183  381:bipush          9
	//  184  383:getstatic       #97  <Field avz j>
	//  185  386:aastore         
	//  186  387:dup             
	//  187  388:bipush          10
	//  188  390:getstatic       #104 <Field avz k>
	//  189  393:aastore         
	//  190  394:dup             
	//  191  395:bipush          11
	//  192  397:getstatic       #113 <Field avz l>
	//  193  400:aastore         
	//  194  401:dup             
	//  195  402:bipush          12
	//  196  404:getstatic       #117 <Field avz m>
	//  197  407:aastore         
	//  198  408:dup             
	//  199  409:bipush          13
	//  200  411:getstatic       #123 <Field avz n>
	//  201  414:aastore         
	//  202  415:dup             
	//  203  416:bipush          14
	//  204  418:getstatic       #127 <Field avz o>
	//  205  421:aastore         
	//  206  422:dup             
	//  207  423:bipush          15
	//  208  425:getstatic       #131 <Field avz p>
	//  209  428:aastore         
	//  210  429:dup             
	//  211  430:bipush          16
	//  212  432:getstatic       #135 <Field avz q>
	//  213  435:aastore         
	//  214  436:dup             
	//  215  437:bipush          17
	//  216  439:getstatic       #139 <Field avz r>
	//  217  442:aastore         
	//  218  443:putstatic       #141 <Field avz[] u>
	//* 219  446:return          
	}
}
