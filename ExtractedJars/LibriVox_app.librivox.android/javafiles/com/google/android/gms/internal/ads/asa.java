// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asc, asw, asb

public final class asa extends Enum
{

	private asa(String s1, int i1, int j1, asc asc1, asw asw1)
	{
		super(s1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #329 <Method void Enum(String, int)>
		aa = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #325 <Field int aa>
		ab = asc1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #331 <Field asc ab>
		Z = asw1;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #333 <Field asw Z>
		switch(asb.a[asc1.ordinal()])
	//*  13   23:getstatic       #338 <Field int[] asb.a>
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #342 <Method int asc.ordinal()>
	//*  16   31:iaload          
		{
	//*  17   32:tableswitch     1 2: default 56
	//	               1 76
	//	               2 64
		default:
			ac = null;
	//   18   56:aload_0         
	//   19   57:aconst_null     
	//   20   58:putfield        #344 <Field Class ac>
			break;

	//*  21   61:goto            85
		case 2: // '\002'
			ac = asw1.a();
	//   22   64:aload_0         
	//   23   65:aload           5
	//   24   67:invokevirtual   #347 <Method Class asw.a()>
	//   25   70:putfield        #344 <Field Class ac>
			break;

	//*  26   73:goto            85
		case 1: // '\001'
			ac = asw1.a();
	//   27   76:aload_0         
	//   28   77:aload           5
	//   29   79:invokevirtual   #347 <Method Class asw.a()>
	//   30   82:putfield        #344 <Field Class ac>
			break;
		}
		boolean flag1 = false;
	//   31   85:iconst_0        
	//   32   86:istore          7
		boolean flag = flag1;
	//   33   88:iload           7
	//   34   90:istore          6
		if(asc1 == asc.a)
	//*  35   92:aload           4
	//*  36   94:getstatic       #77  <Field asc asc.a>
	//*  37   97:if_acmpne       143
		{
			flag = flag1;
	//   38  100:iload           7
	//   39  102:istore          6
			switch(asb.b[asw1.ordinal()])
	//*  40  104:getstatic       #349 <Field int[] asb.b>
	//*  41  107:aload           5
	//*  42  109:invokevirtual   #350 <Method int asw.ordinal()>
	//*  43  112:iaload          
			{
	//*  44  113:tableswitch     1 3: default 140
	//	               1 143
	//	               2 143
	//	               3 143
			default:
				flag = true;
	//   45  140:iconst_1        
	//   46  141:istore          6
				break;

			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
				break;
			}
		}
		ad = flag;
	//   47  143:aload_0         
	//   48  144:iload           6
	//   49  146:putfield        #352 <Field boolean ad>
	//   50  149:return          
	}

	public static asa[] values()
	{
		return (asa[])((asa []) (ag)).clone();
	//    0    0:getstatic       #313 <Field asa[] ag>
	//    1    3:invokevirtual   #357 <Method Object _5B_Lcom.google.android.gms.internal.ads.asa_3B_.clone()>
	//    2    6:checkcast       #353 <Class asa[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return aa;
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field int aa>
	//    2    4:ireturn         
	}

	private static final asa A;
	private static final asa B;
	private static final asa C;
	private static final asa D;
	private static final asa E;
	private static final asa F;
	private static final asa G;
	private static final asa H;
	private static final asa I;
	private static final asa J;
	private static final asa K;
	private static final asa L;
	private static final asa M;
	private static final asa N;
	private static final asa O;
	private static final asa P;
	private static final asa Q;
	private static final asa R;
	private static final asa S;
	private static final asa T;
	private static final asa U;
	private static final asa V;
	private static final asa W;
	private static final asa X;
	private static final asa Y;
	public static final asa a;
	private static final asa ae[];
	private static final Type af[] = new Type[0];
	private static final asa ag[];
	public static final asa b;
	public static final asa c;
	public static final asa d;
	public static final asa e;
	public static final asa f;
	public static final asa g;
	public static final asa h;
	public static final asa i;
	public static final asa j;
	private static final asa k;
	private static final asa l;
	private static final asa m;
	private static final asa n;
	private static final asa o;
	private static final asa p;
	private static final asa q;
	private static final asa r;
	private static final asa s;
	private static final asa t;
	private static final asa u;
	private static final asa v;
	private static final asa w;
	private static final asa x;
	private static final asa y;
	private static final asa z;
	private final asw Z;
	private final int aa;
	private final asc ab;
	private final Class ac;
	private final boolean ad;

	static 
	{
		k = new asa("DOUBLE", 0, 0, asc.a, asw.e);
	//    0    0:new             #2   <Class asa>
	//    1    3:dup             
	//    2    4:ldc1            #73  <String "DOUBLE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:getstatic       #77  <Field asc asc.a>
	//    6   11:getstatic       #81  <Field asw asw.e>
	//    7   14:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//    8   17:putstatic       #87  <Field asa k>
		l = new asa("FLOAT", 1, 1, asc.a, asw.d);
	//    9   20:new             #2   <Class asa>
	//   10   23:dup             
	//   11   24:ldc1            #89  <String "FLOAT">
	//   12   26:iconst_1        
	//   13   27:iconst_1        
	//   14   28:getstatic       #77  <Field asc asc.a>
	//   15   31:getstatic       #91  <Field asw asw.d>
	//   16   34:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   17   37:putstatic       #93  <Field asa l>
		m = new asa("INT64", 2, 2, asc.a, asw.c);
	//   18   40:new             #2   <Class asa>
	//   19   43:dup             
	//   20   44:ldc1            #95  <String "INT64">
	//   21   46:iconst_2        
	//   22   47:iconst_2        
	//   23   48:getstatic       #77  <Field asc asc.a>
	//   24   51:getstatic       #97  <Field asw asw.c>
	//   25   54:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   26   57:putstatic       #99  <Field asa m>
		n = new asa("UINT64", 3, 3, asc.a, asw.c);
	//   27   60:new             #2   <Class asa>
	//   28   63:dup             
	//   29   64:ldc1            #101 <String "UINT64">
	//   30   66:iconst_3        
	//   31   67:iconst_3        
	//   32   68:getstatic       #77  <Field asc asc.a>
	//   33   71:getstatic       #97  <Field asw asw.c>
	//   34   74:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   35   77:putstatic       #103 <Field asa n>
		o = new asa("INT32", 4, 4, asc.a, asw.b);
	//   36   80:new             #2   <Class asa>
	//   37   83:dup             
	//   38   84:ldc1            #105 <String "INT32">
	//   39   86:iconst_4        
	//   40   87:iconst_4        
	//   41   88:getstatic       #77  <Field asc asc.a>
	//   42   91:getstatic       #107 <Field asw asw.b>
	//   43   94:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   44   97:putstatic       #109 <Field asa o>
		p = new asa("FIXED64", 5, 5, asc.a, asw.c);
	//   45  100:new             #2   <Class asa>
	//   46  103:dup             
	//   47  104:ldc1            #111 <String "FIXED64">
	//   48  106:iconst_5        
	//   49  107:iconst_5        
	//   50  108:getstatic       #77  <Field asc asc.a>
	//   51  111:getstatic       #97  <Field asw asw.c>
	//   52  114:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   53  117:putstatic       #113 <Field asa p>
		q = new asa("FIXED32", 6, 6, asc.a, asw.b);
	//   54  120:new             #2   <Class asa>
	//   55  123:dup             
	//   56  124:ldc1            #115 <String "FIXED32">
	//   57  126:bipush          6
	//   58  128:bipush          6
	//   59  130:getstatic       #77  <Field asc asc.a>
	//   60  133:getstatic       #107 <Field asw asw.b>
	//   61  136:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   62  139:putstatic       #117 <Field asa q>
		r = new asa("BOOL", 7, 7, asc.a, asw.f);
	//   63  142:new             #2   <Class asa>
	//   64  145:dup             
	//   65  146:ldc1            #119 <String "BOOL">
	//   66  148:bipush          7
	//   67  150:bipush          7
	//   68  152:getstatic       #77  <Field asc asc.a>
	//   69  155:getstatic       #121 <Field asw asw.f>
	//   70  158:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   71  161:putstatic       #123 <Field asa r>
		s = new asa("STRING", 8, 8, asc.a, asw.g);
	//   72  164:new             #2   <Class asa>
	//   73  167:dup             
	//   74  168:ldc1            #125 <String "STRING">
	//   75  170:bipush          8
	//   76  172:bipush          8
	//   77  174:getstatic       #77  <Field asc asc.a>
	//   78  177:getstatic       #127 <Field asw asw.g>
	//   79  180:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   80  183:putstatic       #129 <Field asa s>
		a = new asa("MESSAGE", 9, 9, asc.a, asw.j);
	//   81  186:new             #2   <Class asa>
	//   82  189:dup             
	//   83  190:ldc1            #131 <String "MESSAGE">
	//   84  192:bipush          9
	//   85  194:bipush          9
	//   86  196:getstatic       #77  <Field asc asc.a>
	//   87  199:getstatic       #133 <Field asw asw.j>
	//   88  202:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   89  205:putstatic       #135 <Field asa a>
		t = new asa("BYTES", 10, 10, asc.a, asw.h);
	//   90  208:new             #2   <Class asa>
	//   91  211:dup             
	//   92  212:ldc1            #137 <String "BYTES">
	//   93  214:bipush          10
	//   94  216:bipush          10
	//   95  218:getstatic       #77  <Field asc asc.a>
	//   96  221:getstatic       #139 <Field asw asw.h>
	//   97  224:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//   98  227:putstatic       #141 <Field asa t>
		u = new asa("UINT32", 11, 11, asc.a, asw.b);
	//   99  230:new             #2   <Class asa>
	//  100  233:dup             
	//  101  234:ldc1            #143 <String "UINT32">
	//  102  236:bipush          11
	//  103  238:bipush          11
	//  104  240:getstatic       #77  <Field asc asc.a>
	//  105  243:getstatic       #107 <Field asw asw.b>
	//  106  246:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  107  249:putstatic       #145 <Field asa u>
		b = new asa("ENUM", 12, 12, asc.a, asw.i);
	//  108  252:new             #2   <Class asa>
	//  109  255:dup             
	//  110  256:ldc1            #147 <String "ENUM">
	//  111  258:bipush          12
	//  112  260:bipush          12
	//  113  262:getstatic       #77  <Field asc asc.a>
	//  114  265:getstatic       #149 <Field asw asw.i>
	//  115  268:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  116  271:putstatic       #151 <Field asa b>
		v = new asa("SFIXED32", 13, 13, asc.a, asw.b);
	//  117  274:new             #2   <Class asa>
	//  118  277:dup             
	//  119  278:ldc1            #153 <String "SFIXED32">
	//  120  280:bipush          13
	//  121  282:bipush          13
	//  122  284:getstatic       #77  <Field asc asc.a>
	//  123  287:getstatic       #107 <Field asw asw.b>
	//  124  290:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  125  293:putstatic       #155 <Field asa v>
		w = new asa("SFIXED64", 14, 14, asc.a, asw.c);
	//  126  296:new             #2   <Class asa>
	//  127  299:dup             
	//  128  300:ldc1            #157 <String "SFIXED64">
	//  129  302:bipush          14
	//  130  304:bipush          14
	//  131  306:getstatic       #77  <Field asc asc.a>
	//  132  309:getstatic       #97  <Field asw asw.c>
	//  133  312:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  134  315:putstatic       #159 <Field asa w>
		x = new asa("SINT32", 15, 15, asc.a, asw.b);
	//  135  318:new             #2   <Class asa>
	//  136  321:dup             
	//  137  322:ldc1            #161 <String "SINT32">
	//  138  324:bipush          15
	//  139  326:bipush          15
	//  140  328:getstatic       #77  <Field asc asc.a>
	//  141  331:getstatic       #107 <Field asw asw.b>
	//  142  334:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  143  337:putstatic       #163 <Field asa x>
		y = new asa("SINT64", 16, 16, asc.a, asw.c);
	//  144  340:new             #2   <Class asa>
	//  145  343:dup             
	//  146  344:ldc1            #165 <String "SINT64">
	//  147  346:bipush          16
	//  148  348:bipush          16
	//  149  350:getstatic       #77  <Field asc asc.a>
	//  150  353:getstatic       #97  <Field asw asw.c>
	//  151  356:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  152  359:putstatic       #167 <Field asa y>
		c = new asa("GROUP", 17, 17, asc.a, asw.j);
	//  153  362:new             #2   <Class asa>
	//  154  365:dup             
	//  155  366:ldc1            #169 <String "GROUP">
	//  156  368:bipush          17
	//  157  370:bipush          17
	//  158  372:getstatic       #77  <Field asc asc.a>
	//  159  375:getstatic       #133 <Field asw asw.j>
	//  160  378:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  161  381:putstatic       #171 <Field asa c>
		z = new asa("DOUBLE_LIST", 18, 18, asc.b, asw.e);
	//  162  384:new             #2   <Class asa>
	//  163  387:dup             
	//  164  388:ldc1            #173 <String "DOUBLE_LIST">
	//  165  390:bipush          18
	//  166  392:bipush          18
	//  167  394:getstatic       #175 <Field asc asc.b>
	//  168  397:getstatic       #81  <Field asw asw.e>
	//  169  400:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  170  403:putstatic       #177 <Field asa z>
		A = new asa("FLOAT_LIST", 19, 19, asc.b, asw.d);
	//  171  406:new             #2   <Class asa>
	//  172  409:dup             
	//  173  410:ldc1            #179 <String "FLOAT_LIST">
	//  174  412:bipush          19
	//  175  414:bipush          19
	//  176  416:getstatic       #175 <Field asc asc.b>
	//  177  419:getstatic       #91  <Field asw asw.d>
	//  178  422:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  179  425:putstatic       #181 <Field asa A>
		B = new asa("INT64_LIST", 20, 20, asc.b, asw.c);
	//  180  428:new             #2   <Class asa>
	//  181  431:dup             
	//  182  432:ldc1            #183 <String "INT64_LIST">
	//  183  434:bipush          20
	//  184  436:bipush          20
	//  185  438:getstatic       #175 <Field asc asc.b>
	//  186  441:getstatic       #97  <Field asw asw.c>
	//  187  444:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  188  447:putstatic       #185 <Field asa B>
		C = new asa("UINT64_LIST", 21, 21, asc.b, asw.c);
	//  189  450:new             #2   <Class asa>
	//  190  453:dup             
	//  191  454:ldc1            #187 <String "UINT64_LIST">
	//  192  456:bipush          21
	//  193  458:bipush          21
	//  194  460:getstatic       #175 <Field asc asc.b>
	//  195  463:getstatic       #97  <Field asw asw.c>
	//  196  466:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  197  469:putstatic       #189 <Field asa C>
		D = new asa("INT32_LIST", 22, 22, asc.b, asw.b);
	//  198  472:new             #2   <Class asa>
	//  199  475:dup             
	//  200  476:ldc1            #191 <String "INT32_LIST">
	//  201  478:bipush          22
	//  202  480:bipush          22
	//  203  482:getstatic       #175 <Field asc asc.b>
	//  204  485:getstatic       #107 <Field asw asw.b>
	//  205  488:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  206  491:putstatic       #193 <Field asa D>
		E = new asa("FIXED64_LIST", 23, 23, asc.b, asw.c);
	//  207  494:new             #2   <Class asa>
	//  208  497:dup             
	//  209  498:ldc1            #195 <String "FIXED64_LIST">
	//  210  500:bipush          23
	//  211  502:bipush          23
	//  212  504:getstatic       #175 <Field asc asc.b>
	//  213  507:getstatic       #97  <Field asw asw.c>
	//  214  510:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  215  513:putstatic       #197 <Field asa E>
		F = new asa("FIXED32_LIST", 24, 24, asc.b, asw.b);
	//  216  516:new             #2   <Class asa>
	//  217  519:dup             
	//  218  520:ldc1            #199 <String "FIXED32_LIST">
	//  219  522:bipush          24
	//  220  524:bipush          24
	//  221  526:getstatic       #175 <Field asc asc.b>
	//  222  529:getstatic       #107 <Field asw asw.b>
	//  223  532:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  224  535:putstatic       #201 <Field asa F>
		G = new asa("BOOL_LIST", 25, 25, asc.b, asw.f);
	//  225  538:new             #2   <Class asa>
	//  226  541:dup             
	//  227  542:ldc1            #203 <String "BOOL_LIST">
	//  228  544:bipush          25
	//  229  546:bipush          25
	//  230  548:getstatic       #175 <Field asc asc.b>
	//  231  551:getstatic       #121 <Field asw asw.f>
	//  232  554:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  233  557:putstatic       #205 <Field asa G>
		H = new asa("STRING_LIST", 26, 26, asc.b, asw.g);
	//  234  560:new             #2   <Class asa>
	//  235  563:dup             
	//  236  564:ldc1            #207 <String "STRING_LIST">
	//  237  566:bipush          26
	//  238  568:bipush          26
	//  239  570:getstatic       #175 <Field asc asc.b>
	//  240  573:getstatic       #127 <Field asw asw.g>
	//  241  576:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  242  579:putstatic       #209 <Field asa H>
		d = new asa("MESSAGE_LIST", 27, 27, asc.b, asw.j);
	//  243  582:new             #2   <Class asa>
	//  244  585:dup             
	//  245  586:ldc1            #211 <String "MESSAGE_LIST">
	//  246  588:bipush          27
	//  247  590:bipush          27
	//  248  592:getstatic       #175 <Field asc asc.b>
	//  249  595:getstatic       #133 <Field asw asw.j>
	//  250  598:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  251  601:putstatic       #213 <Field asa d>
		I = new asa("BYTES_LIST", 28, 28, asc.b, asw.h);
	//  252  604:new             #2   <Class asa>
	//  253  607:dup             
	//  254  608:ldc1            #215 <String "BYTES_LIST">
	//  255  610:bipush          28
	//  256  612:bipush          28
	//  257  614:getstatic       #175 <Field asc asc.b>
	//  258  617:getstatic       #139 <Field asw asw.h>
	//  259  620:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  260  623:putstatic       #217 <Field asa I>
		J = new asa("UINT32_LIST", 29, 29, asc.b, asw.b);
	//  261  626:new             #2   <Class asa>
	//  262  629:dup             
	//  263  630:ldc1            #219 <String "UINT32_LIST">
	//  264  632:bipush          29
	//  265  634:bipush          29
	//  266  636:getstatic       #175 <Field asc asc.b>
	//  267  639:getstatic       #107 <Field asw asw.b>
	//  268  642:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  269  645:putstatic       #221 <Field asa J>
		e = new asa("ENUM_LIST", 30, 30, asc.b, asw.i);
	//  270  648:new             #2   <Class asa>
	//  271  651:dup             
	//  272  652:ldc1            #223 <String "ENUM_LIST">
	//  273  654:bipush          30
	//  274  656:bipush          30
	//  275  658:getstatic       #175 <Field asc asc.b>
	//  276  661:getstatic       #149 <Field asw asw.i>
	//  277  664:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  278  667:putstatic       #225 <Field asa e>
		K = new asa("SFIXED32_LIST", 31, 31, asc.b, asw.b);
	//  279  670:new             #2   <Class asa>
	//  280  673:dup             
	//  281  674:ldc1            #227 <String "SFIXED32_LIST">
	//  282  676:bipush          31
	//  283  678:bipush          31
	//  284  680:getstatic       #175 <Field asc asc.b>
	//  285  683:getstatic       #107 <Field asw asw.b>
	//  286  686:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  287  689:putstatic       #229 <Field asa K>
		L = new asa("SFIXED64_LIST", 32, 32, asc.b, asw.c);
	//  288  692:new             #2   <Class asa>
	//  289  695:dup             
	//  290  696:ldc1            #231 <String "SFIXED64_LIST">
	//  291  698:bipush          32
	//  292  700:bipush          32
	//  293  702:getstatic       #175 <Field asc asc.b>
	//  294  705:getstatic       #97  <Field asw asw.c>
	//  295  708:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  296  711:putstatic       #233 <Field asa L>
		M = new asa("SINT32_LIST", 33, 33, asc.b, asw.b);
	//  297  714:new             #2   <Class asa>
	//  298  717:dup             
	//  299  718:ldc1            #235 <String "SINT32_LIST">
	//  300  720:bipush          33
	//  301  722:bipush          33
	//  302  724:getstatic       #175 <Field asc asc.b>
	//  303  727:getstatic       #107 <Field asw asw.b>
	//  304  730:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  305  733:putstatic       #237 <Field asa M>
		N = new asa("SINT64_LIST", 34, 34, asc.b, asw.c);
	//  306  736:new             #2   <Class asa>
	//  307  739:dup             
	//  308  740:ldc1            #239 <String "SINT64_LIST">
	//  309  742:bipush          34
	//  310  744:bipush          34
	//  311  746:getstatic       #175 <Field asc asc.b>
	//  312  749:getstatic       #97  <Field asw asw.c>
	//  313  752:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  314  755:putstatic       #241 <Field asa N>
		f = new asa("DOUBLE_LIST_PACKED", 35, 35, asc.c, asw.e);
	//  315  758:new             #2   <Class asa>
	//  316  761:dup             
	//  317  762:ldc1            #243 <String "DOUBLE_LIST_PACKED">
	//  318  764:bipush          35
	//  319  766:bipush          35
	//  320  768:getstatic       #245 <Field asc asc.c>
	//  321  771:getstatic       #81  <Field asw asw.e>
	//  322  774:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  323  777:putstatic       #247 <Field asa f>
		O = new asa("FLOAT_LIST_PACKED", 36, 36, asc.c, asw.d);
	//  324  780:new             #2   <Class asa>
	//  325  783:dup             
	//  326  784:ldc1            #249 <String "FLOAT_LIST_PACKED">
	//  327  786:bipush          36
	//  328  788:bipush          36
	//  329  790:getstatic       #245 <Field asc asc.c>
	//  330  793:getstatic       #91  <Field asw asw.d>
	//  331  796:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  332  799:putstatic       #251 <Field asa O>
		P = new asa("INT64_LIST_PACKED", 37, 37, asc.c, asw.c);
	//  333  802:new             #2   <Class asa>
	//  334  805:dup             
	//  335  806:ldc1            #253 <String "INT64_LIST_PACKED">
	//  336  808:bipush          37
	//  337  810:bipush          37
	//  338  812:getstatic       #245 <Field asc asc.c>
	//  339  815:getstatic       #97  <Field asw asw.c>
	//  340  818:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  341  821:putstatic       #255 <Field asa P>
		Q = new asa("UINT64_LIST_PACKED", 38, 38, asc.c, asw.c);
	//  342  824:new             #2   <Class asa>
	//  343  827:dup             
	//  344  828:ldc2            #257 <String "UINT64_LIST_PACKED">
	//  345  831:bipush          38
	//  346  833:bipush          38
	//  347  835:getstatic       #245 <Field asc asc.c>
	//  348  838:getstatic       #97  <Field asw asw.c>
	//  349  841:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  350  844:putstatic       #259 <Field asa Q>
		R = new asa("INT32_LIST_PACKED", 39, 39, asc.c, asw.b);
	//  351  847:new             #2   <Class asa>
	//  352  850:dup             
	//  353  851:ldc2            #261 <String "INT32_LIST_PACKED">
	//  354  854:bipush          39
	//  355  856:bipush          39
	//  356  858:getstatic       #245 <Field asc asc.c>
	//  357  861:getstatic       #107 <Field asw asw.b>
	//  358  864:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  359  867:putstatic       #263 <Field asa R>
		S = new asa("FIXED64_LIST_PACKED", 40, 40, asc.c, asw.c);
	//  360  870:new             #2   <Class asa>
	//  361  873:dup             
	//  362  874:ldc2            #265 <String "FIXED64_LIST_PACKED">
	//  363  877:bipush          40
	//  364  879:bipush          40
	//  365  881:getstatic       #245 <Field asc asc.c>
	//  366  884:getstatic       #97  <Field asw asw.c>
	//  367  887:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  368  890:putstatic       #267 <Field asa S>
		T = new asa("FIXED32_LIST_PACKED", 41, 41, asc.c, asw.b);
	//  369  893:new             #2   <Class asa>
	//  370  896:dup             
	//  371  897:ldc2            #269 <String "FIXED32_LIST_PACKED">
	//  372  900:bipush          41
	//  373  902:bipush          41
	//  374  904:getstatic       #245 <Field asc asc.c>
	//  375  907:getstatic       #107 <Field asw asw.b>
	//  376  910:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  377  913:putstatic       #271 <Field asa T>
		U = new asa("BOOL_LIST_PACKED", 42, 42, asc.c, asw.f);
	//  378  916:new             #2   <Class asa>
	//  379  919:dup             
	//  380  920:ldc2            #273 <String "BOOL_LIST_PACKED">
	//  381  923:bipush          42
	//  382  925:bipush          42
	//  383  927:getstatic       #245 <Field asc asc.c>
	//  384  930:getstatic       #121 <Field asw asw.f>
	//  385  933:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  386  936:putstatic       #275 <Field asa U>
		V = new asa("UINT32_LIST_PACKED", 43, 43, asc.c, asw.b);
	//  387  939:new             #2   <Class asa>
	//  388  942:dup             
	//  389  943:ldc2            #277 <String "UINT32_LIST_PACKED">
	//  390  946:bipush          43
	//  391  948:bipush          43
	//  392  950:getstatic       #245 <Field asc asc.c>
	//  393  953:getstatic       #107 <Field asw asw.b>
	//  394  956:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  395  959:putstatic       #279 <Field asa V>
		g = new asa("ENUM_LIST_PACKED", 44, 44, asc.c, asw.i);
	//  396  962:new             #2   <Class asa>
	//  397  965:dup             
	//  398  966:ldc2            #281 <String "ENUM_LIST_PACKED">
	//  399  969:bipush          44
	//  400  971:bipush          44
	//  401  973:getstatic       #245 <Field asc asc.c>
	//  402  976:getstatic       #149 <Field asw asw.i>
	//  403  979:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  404  982:putstatic       #283 <Field asa g>
		W = new asa("SFIXED32_LIST_PACKED", 45, 45, asc.c, asw.b);
	//  405  985:new             #2   <Class asa>
	//  406  988:dup             
	//  407  989:ldc2            #285 <String "SFIXED32_LIST_PACKED">
	//  408  992:bipush          45
	//  409  994:bipush          45
	//  410  996:getstatic       #245 <Field asc asc.c>
	//  411  999:getstatic       #107 <Field asw asw.b>
	//  412 1002:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  413 1005:putstatic       #287 <Field asa W>
		X = new asa("SFIXED64_LIST_PACKED", 46, 46, asc.c, asw.c);
	//  414 1008:new             #2   <Class asa>
	//  415 1011:dup             
	//  416 1012:ldc2            #289 <String "SFIXED64_LIST_PACKED">
	//  417 1015:bipush          46
	//  418 1017:bipush          46
	//  419 1019:getstatic       #245 <Field asc asc.c>
	//  420 1022:getstatic       #97  <Field asw asw.c>
	//  421 1025:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  422 1028:putstatic       #291 <Field asa X>
		Y = new asa("SINT32_LIST_PACKED", 47, 47, asc.c, asw.b);
	//  423 1031:new             #2   <Class asa>
	//  424 1034:dup             
	//  425 1035:ldc2            #293 <String "SINT32_LIST_PACKED">
	//  426 1038:bipush          47
	//  427 1040:bipush          47
	//  428 1042:getstatic       #245 <Field asc asc.c>
	//  429 1045:getstatic       #107 <Field asw asw.b>
	//  430 1048:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  431 1051:putstatic       #295 <Field asa Y>
		h = new asa("SINT64_LIST_PACKED", 48, 48, asc.c, asw.c);
	//  432 1054:new             #2   <Class asa>
	//  433 1057:dup             
	//  434 1058:ldc2            #297 <String "SINT64_LIST_PACKED">
	//  435 1061:bipush          48
	//  436 1063:bipush          48
	//  437 1065:getstatic       #245 <Field asc asc.c>
	//  438 1068:getstatic       #97  <Field asw asw.c>
	//  439 1071:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  440 1074:putstatic       #299 <Field asa h>
		i = new asa("GROUP_LIST", 49, 49, asc.b, asw.j);
	//  441 1077:new             #2   <Class asa>
	//  442 1080:dup             
	//  443 1081:ldc2            #301 <String "GROUP_LIST">
	//  444 1084:bipush          49
	//  445 1086:bipush          49
	//  446 1088:getstatic       #175 <Field asc asc.b>
	//  447 1091:getstatic       #133 <Field asw asw.j>
	//  448 1094:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  449 1097:putstatic       #303 <Field asa i>
		j = new asa("MAP", 50, 50, asc.d, asw.a);
	//  450 1100:new             #2   <Class asa>
	//  451 1103:dup             
	//  452 1104:ldc2            #305 <String "MAP">
	//  453 1107:bipush          50
	//  454 1109:bipush          50
	//  455 1111:getstatic       #307 <Field asc asc.d>
	//  456 1114:getstatic       #309 <Field asw asw.a>
	//  457 1117:invokespecial   #85  <Method void asa(String, int, int, asc, asw)>
	//  458 1120:putstatic       #311 <Field asa j>
		asa asa1 = k;
	//  459 1123:getstatic       #87  <Field asa k>
	//  460 1126:astore_2        
		int i1 = 0;
	//  461 1127:iconst_0        
	//  462 1128:istore_0        
		ag = (new asa[] {
			asa1, l, m, n, o, p, q, r, s, a, 
			t, u, b, v, w, x, y, c, z, A, 
			B, C, D, E, F, G, H, d, I, J, 
			e, K, L, M, N, f, O, P, Q, R, 
			S, T, U, V, g, W, X, Y, h, i, 
			j
		});
	//  463 1129:bipush          51
	//  464 1131:anewarray       asa[]
	//  465 1134:dup             
	//  466 1135:iconst_0        
	//  467 1136:aload_2         
	//  468 1137:aastore         
	//  469 1138:dup             
	//  470 1139:iconst_1        
	//  471 1140:getstatic       #93  <Field asa l>
	//  472 1143:aastore         
	//  473 1144:dup             
	//  474 1145:iconst_2        
	//  475 1146:getstatic       #99  <Field asa m>
	//  476 1149:aastore         
	//  477 1150:dup             
	//  478 1151:iconst_3        
	//  479 1152:getstatic       #103 <Field asa n>
	//  480 1155:aastore         
	//  481 1156:dup             
	//  482 1157:iconst_4        
	//  483 1158:getstatic       #109 <Field asa o>
	//  484 1161:aastore         
	//  485 1162:dup             
	//  486 1163:iconst_5        
	//  487 1164:getstatic       #113 <Field asa p>
	//  488 1167:aastore         
	//  489 1168:dup             
	//  490 1169:bipush          6
	//  491 1171:getstatic       #117 <Field asa q>
	//  492 1174:aastore         
	//  493 1175:dup             
	//  494 1176:bipush          7
	//  495 1178:getstatic       #123 <Field asa r>
	//  496 1181:aastore         
	//  497 1182:dup             
	//  498 1183:bipush          8
	//  499 1185:getstatic       #129 <Field asa s>
	//  500 1188:aastore         
	//  501 1189:dup             
	//  502 1190:bipush          9
	//  503 1192:getstatic       #135 <Field asa a>
	//  504 1195:aastore         
	//  505 1196:dup             
	//  506 1197:bipush          10
	//  507 1199:getstatic       #141 <Field asa t>
	//  508 1202:aastore         
	//  509 1203:dup             
	//  510 1204:bipush          11
	//  511 1206:getstatic       #145 <Field asa u>
	//  512 1209:aastore         
	//  513 1210:dup             
	//  514 1211:bipush          12
	//  515 1213:getstatic       #151 <Field asa b>
	//  516 1216:aastore         
	//  517 1217:dup             
	//  518 1218:bipush          13
	//  519 1220:getstatic       #155 <Field asa v>
	//  520 1223:aastore         
	//  521 1224:dup             
	//  522 1225:bipush          14
	//  523 1227:getstatic       #159 <Field asa w>
	//  524 1230:aastore         
	//  525 1231:dup             
	//  526 1232:bipush          15
	//  527 1234:getstatic       #163 <Field asa x>
	//  528 1237:aastore         
	//  529 1238:dup             
	//  530 1239:bipush          16
	//  531 1241:getstatic       #167 <Field asa y>
	//  532 1244:aastore         
	//  533 1245:dup             
	//  534 1246:bipush          17
	//  535 1248:getstatic       #171 <Field asa c>
	//  536 1251:aastore         
	//  537 1252:dup             
	//  538 1253:bipush          18
	//  539 1255:getstatic       #177 <Field asa z>
	//  540 1258:aastore         
	//  541 1259:dup             
	//  542 1260:bipush          19
	//  543 1262:getstatic       #181 <Field asa A>
	//  544 1265:aastore         
	//  545 1266:dup             
	//  546 1267:bipush          20
	//  547 1269:getstatic       #185 <Field asa B>
	//  548 1272:aastore         
	//  549 1273:dup             
	//  550 1274:bipush          21
	//  551 1276:getstatic       #189 <Field asa C>
	//  552 1279:aastore         
	//  553 1280:dup             
	//  554 1281:bipush          22
	//  555 1283:getstatic       #193 <Field asa D>
	//  556 1286:aastore         
	//  557 1287:dup             
	//  558 1288:bipush          23
	//  559 1290:getstatic       #197 <Field asa E>
	//  560 1293:aastore         
	//  561 1294:dup             
	//  562 1295:bipush          24
	//  563 1297:getstatic       #201 <Field asa F>
	//  564 1300:aastore         
	//  565 1301:dup             
	//  566 1302:bipush          25
	//  567 1304:getstatic       #205 <Field asa G>
	//  568 1307:aastore         
	//  569 1308:dup             
	//  570 1309:bipush          26
	//  571 1311:getstatic       #209 <Field asa H>
	//  572 1314:aastore         
	//  573 1315:dup             
	//  574 1316:bipush          27
	//  575 1318:getstatic       #213 <Field asa d>
	//  576 1321:aastore         
	//  577 1322:dup             
	//  578 1323:bipush          28
	//  579 1325:getstatic       #217 <Field asa I>
	//  580 1328:aastore         
	//  581 1329:dup             
	//  582 1330:bipush          29
	//  583 1332:getstatic       #221 <Field asa J>
	//  584 1335:aastore         
	//  585 1336:dup             
	//  586 1337:bipush          30
	//  587 1339:getstatic       #225 <Field asa e>
	//  588 1342:aastore         
	//  589 1343:dup             
	//  590 1344:bipush          31
	//  591 1346:getstatic       #229 <Field asa K>
	//  592 1349:aastore         
	//  593 1350:dup             
	//  594 1351:bipush          32
	//  595 1353:getstatic       #233 <Field asa L>
	//  596 1356:aastore         
	//  597 1357:dup             
	//  598 1358:bipush          33
	//  599 1360:getstatic       #237 <Field asa M>
	//  600 1363:aastore         
	//  601 1364:dup             
	//  602 1365:bipush          34
	//  603 1367:getstatic       #241 <Field asa N>
	//  604 1370:aastore         
	//  605 1371:dup             
	//  606 1372:bipush          35
	//  607 1374:getstatic       #247 <Field asa f>
	//  608 1377:aastore         
	//  609 1378:dup             
	//  610 1379:bipush          36
	//  611 1381:getstatic       #251 <Field asa O>
	//  612 1384:aastore         
	//  613 1385:dup             
	//  614 1386:bipush          37
	//  615 1388:getstatic       #255 <Field asa P>
	//  616 1391:aastore         
	//  617 1392:dup             
	//  618 1393:bipush          38
	//  619 1395:getstatic       #259 <Field asa Q>
	//  620 1398:aastore         
	//  621 1399:dup             
	//  622 1400:bipush          39
	//  623 1402:getstatic       #263 <Field asa R>
	//  624 1405:aastore         
	//  625 1406:dup             
	//  626 1407:bipush          40
	//  627 1409:getstatic       #267 <Field asa S>
	//  628 1412:aastore         
	//  629 1413:dup             
	//  630 1414:bipush          41
	//  631 1416:getstatic       #271 <Field asa T>
	//  632 1419:aastore         
	//  633 1420:dup             
	//  634 1421:bipush          42
	//  635 1423:getstatic       #275 <Field asa U>
	//  636 1426:aastore         
	//  637 1427:dup             
	//  638 1428:bipush          43
	//  639 1430:getstatic       #279 <Field asa V>
	//  640 1433:aastore         
	//  641 1434:dup             
	//  642 1435:bipush          44
	//  643 1437:getstatic       #283 <Field asa g>
	//  644 1440:aastore         
	//  645 1441:dup             
	//  646 1442:bipush          45
	//  647 1444:getstatic       #287 <Field asa W>
	//  648 1447:aastore         
	//  649 1448:dup             
	//  650 1449:bipush          46
	//  651 1451:getstatic       #291 <Field asa X>
	//  652 1454:aastore         
	//  653 1455:dup             
	//  654 1456:bipush          47
	//  655 1458:getstatic       #295 <Field asa Y>
	//  656 1461:aastore         
	//  657 1462:dup             
	//  658 1463:bipush          48
	//  659 1465:getstatic       #299 <Field asa h>
	//  660 1468:aastore         
	//  661 1469:dup             
	//  662 1470:bipush          49
	//  663 1472:getstatic       #303 <Field asa i>
	//  664 1475:aastore         
	//  665 1476:dup             
	//  666 1477:bipush          50
	//  667 1479:getstatic       #311 <Field asa j>
	//  668 1482:aastore         
	//  669 1483:putstatic       #313 <Field asa[] ag>
	//  670 1486:iconst_0        
	//  671 1487:anewarray       Type[]
	//  672 1490:putstatic       #317 <Field Type[] af>
		asa aasa[] = values();
	//  673 1493:invokestatic    #321 <Method asa[] values()>
	//  674 1496:astore_2        
		ae = new asa[aasa.length];
	//  675 1497:aload_2         
	//  676 1498:arraylength     
	//  677 1499:anewarray       asa[]
	//  678 1502:putstatic       #323 <Field asa[] ae>
		for(int j1 = aasa.length; i1 < j1; i1++)
	//* 679 1505:aload_2         
	//* 680 1506:arraylength     
	//* 681 1507:istore_1        
	//* 682 1508:iload_0         
	//* 683 1509:iload_1         
	//* 684 1510:icmpge          1533
		{
			asa asa2 = aasa[i1];
	//  685 1513:aload_2         
	//  686 1514:iload_0         
	//  687 1515:aaload          
	//  688 1516:astore_3        
			ae[asa2.aa] = asa2;
	//  689 1517:getstatic       #323 <Field asa[] ae>
	//  690 1520:aload_3         
	//  691 1521:getfield        #325 <Field int aa>
	//  692 1524:aload_3         
	//  693 1525:aastore         
		}

	//  694 1526:iload_0         
	//  695 1527:iconst_1        
	//  696 1528:iadd            
	//  697 1529:istore_0        
	//* 698 1530:goto            1508
	//* 699 1533:return          
	}
}
