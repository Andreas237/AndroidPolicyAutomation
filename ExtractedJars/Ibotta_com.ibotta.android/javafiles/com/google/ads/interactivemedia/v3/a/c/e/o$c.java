// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.e;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.ads.interactivemedia.v3.a.c.d;
import com.google.ads.interactivemedia.v3.a.c.g;
import com.google.ads.interactivemedia.v3.a.f.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.e:
//			o, i, a, j, 
//			f, d, h, n, 
//			g, c

private class o$c extends o$d
{

	private int a(m m1, int k)
	{
		int j1 = m1.d() + k;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method int m.d()>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore          4
		int i1 = -1;
	//    5    8:iconst_m1       
	//    6    9:istore_3        
		do
		{
			k = i1;
	//    7   10:iload_3         
	//    8   11:istore_2        
			if(m1.d() >= j1)
				break;
	//    9   12:aload_1         
	//   10   13:invokevirtual   #45  <Method int m.d()>
	//   11   16:iload           4
	//   12   18:icmpge          146
			int l1 = m1.f();
	//   13   21:aload_1         
	//   14   22:invokevirtual   #47  <Method int m.f()>
	//   15   25:istore          6
			int k1 = m1.f();
	//   16   27:aload_1         
	//   17   28:invokevirtual   #47  <Method int m.f()>
	//   18   31:istore          5
			if(l1 == 5)
	//*  19   33:iload           6
	//*  20   35:iconst_5        
	//*  21   36:icmpne          94
			{
				long l2 = m1.k();
	//   22   39:aload_1         
	//   23   40:invokevirtual   #51  <Method long m.k()>
	//   24   43:lstore          7
				if(l2 == o.a())
	//*  25   45:lload           7
	//*  26   47:invokestatic    #53  <Method long o.a()>
	//*  27   50:lcmp            
	//*  28   51:ifne            61
					k = 129;
	//   29   54:sipush          129
	//   30   57:istore_2        
				else
	//*  31   58:goto            146
				if(l2 == com.google.ads.interactivemedia.v3.a.c.e.o.d())
	//*  32   61:lload           7
	//*  33   63:invokestatic    #55  <Method long com.google.ads.interactivemedia.v3.a.c.e.o.d()>
	//*  34   66:lcmp            
	//*  35   67:ifne            77
				{
					k = 135;
	//   36   70:sipush          135
	//   37   73:istore_2        
				} else
	//*  38   74:goto            146
				{
					k = i1;
	//   39   77:iload_3         
	//   40   78:istore_2        
					if(l2 == o.e())
	//*  41   79:lload           7
	//*  42   81:invokestatic    #57  <Method long o.e()>
	//*  43   84:lcmp            
	//*  44   85:ifne            146
						k = 36;
	//   45   88:bipush          36
	//   46   90:istore_2        
				}
				break;
	//   47   91:goto            146
			}
			if(l1 == 106)
	//*  48   94:iload           6
	//*  49   96:bipush          106
	//*  50   98:icmpne          108
				k = 129;
	//   51  101:sipush          129
	//   52  104:istore_2        
			else
	//*  53  105:goto            135
			if(l1 == 122)
	//*  54  108:iload           6
	//*  55  110:bipush          122
	//*  56  112:icmpne          122
			{
				k = 135;
	//   57  115:sipush          135
	//   58  118:istore_2        
			} else
	//*  59  119:goto            135
			{
				k = i1;
	//   60  122:iload_3         
	//   61  123:istore_2        
				if(l1 == 123)
	//*  62  124:iload           6
	//*  63  126:bipush          123
	//*  64  128:icmpne          135
					k = 138;
	//   65  131:sipush          138
	//   66  134:istore_2        
			}
			m1.d(k1);
	//   67  135:aload_1         
	//   68  136:iload           5
	//   69  138:invokevirtual   #60  <Method void m.d(int)>
			i1 = k;
	//   70  141:iload_2         
	//   71  142:istore_3        
		} while(true);
	//   72  143:goto            10
		m1.c(j1);
	//   73  146:aload_1         
	//   74  147:iload           4
	//   75  149:invokevirtual   #62  <Method void m.c(int)>
		return k;
	//   76  152:iload_2         
	//   77  153:ireturn         
	}

	public void a()
	{
	//    0    0:return          
	}

	public void a(m m1, boolean flag, g g1)
	{
		int j1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            76
		{
			m1.d(m1.f());
	//    2    4:aload_1         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method int m.f()>
	//    5    9:invokevirtual   #60  <Method void m.d(int)>
			m1.a(b, 3);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field l b>
	//    9   17:iconst_3        
	//   10   18:invokevirtual   #66  <Method void m.a(l, int)>
			b.b(12);
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field l b>
	//   13   25:bipush          12
	//   14   27:invokevirtual   #68  <Method void l.b(int)>
			e = b.c(12);
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:getfield        #31  <Field l b>
	//   18   35:bipush          12
	//   19   37:invokevirtual   #71  <Method int l.c(int)>
	//   20   40:putfield        #73  <Field int e>
			f = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #75  <Field int f>
			g = q.a(b.a, 0, 3, -1);
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #31  <Field l b>
	//   27   53:getfield        #78  <Field byte[] l.a>
	//   28   56:iconst_0        
	//   29   57:iconst_3        
	//   30   58:iconst_m1       
	//   31   59:invokestatic    #83  <Method int q.a(byte[], int, int, int)>
	//   32   62:putfield        #85  <Field int g>
			c.a(e);
	//   33   65:aload_0         
	//   34   66:getfield        #38  <Field m c>
	//   35   69:aload_0         
	//   36   70:getfield        #73  <Field int e>
	//   37   73:invokevirtual   #87  <Method void m.a(int)>
		}
		int k = Math.min(m1.b(), e - f);
	//   38   76:aload_1         
	//   39   77:invokevirtual   #89  <Method int m.b()>
	//   40   80:aload_0         
	//   41   81:getfield        #73  <Field int e>
	//   42   84:aload_0         
	//   43   85:getfield        #75  <Field int f>
	//   44   88:isub            
	//   45   89:invokestatic    #95  <Method int Math.min(int, int)>
	//   46   92:istore          4
		m1.a(c.a, f, k);
	//   47   94:aload_1         
	//   48   95:aload_0         
	//   49   96:getfield        #38  <Field m c>
	//   50   99:getfield        #96  <Field byte[] m.a>
	//   51  102:aload_0         
	//   52  103:getfield        #75  <Field int f>
	//   53  106:iload           4
	//   54  108:invokevirtual   #99  <Method void m.a(byte[], int, int)>
		f = f + k;
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:getfield        #75  <Field int f>
	//   58  116:iload           4
	//   59  118:iadd            
	//   60  119:putfield        #75  <Field int f>
		if(f < e)
	//*  61  122:aload_0         
	//*  62  123:getfield        #75  <Field int f>
	//*  63  126:aload_0         
	//*  64  127:getfield        #73  <Field int e>
	//*  65  130:icmpge          134
			return;
	//   66  133:return          
		if(q.a(c.a, 0, e, g) != 0)
	//*  67  134:aload_0         
	//*  68  135:getfield        #38  <Field m c>
	//*  69  138:getfield        #96  <Field byte[] m.a>
	//*  70  141:iconst_0        
	//*  71  142:aload_0         
	//*  72  143:getfield        #73  <Field int e>
	//*  73  146:aload_0         
	//*  74  147:getfield        #85  <Field int g>
	//*  75  150:invokestatic    #83  <Method int q.a(byte[], int, int, int)>
	//*  76  153:ifeq            157
			return;
	//   77  156:return          
		c.d(7);
	//   78  157:aload_0         
	//   79  158:getfield        #38  <Field m c>
	//   80  161:bipush          7
	//   81  163:invokevirtual   #60  <Method void m.d(int)>
		c.a(b, 2);
	//   82  166:aload_0         
	//   83  167:getfield        #38  <Field m c>
	//   84  170:aload_0         
	//   85  171:getfield        #31  <Field l b>
	//   86  174:iconst_2        
	//   87  175:invokevirtual   #66  <Method void m.a(l, int)>
		b.b(4);
	//   88  178:aload_0         
	//   89  179:getfield        #31  <Field l b>
	//   90  182:iconst_4        
	//   91  183:invokevirtual   #68  <Method void l.b(int)>
		k = b.c(12);
	//   92  186:aload_0         
	//   93  187:getfield        #31  <Field l b>
	//   94  190:bipush          12
	//   95  192:invokevirtual   #71  <Method int l.c(int)>
	//   96  195:istore          4
		c.d(k);
	//   97  197:aload_0         
	//   98  198:getfield        #38  <Field m c>
	//   99  201:iload           4
	//  100  203:invokevirtual   #60  <Method void m.d(int)>
		if((o.a(a) & 0x10) != 0 && a.c == null)
	//* 101  206:aload_0         
	//* 102  207:getfield        #21  <Field o a>
	//* 103  210:invokestatic    #102 <Method int o.a(o)>
	//* 104  213:bipush          16
	//* 105  215:iand            
	//* 106  216:ifeq            251
	//* 107  219:aload_0         
	//* 108  220:getfield        #21  <Field o a>
	//* 109  223:getfield        #105 <Field i o.c>
	//* 110  226:ifnonnull       251
			a.c = new i(g1.d(21));
	//  111  229:aload_0         
	//  112  230:getfield        #21  <Field o a>
	//  113  233:new             #107 <Class i>
	//  114  236:dup             
	//  115  237:aload_3         
	//  116  238:bipush          21
	//  117  240:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  118  245:invokespecial   #115 <Method void i(com.google.ads.interactivemedia.v3.a.c.m)>
	//  119  248:putfield        #105 <Field i o.c>
		j1 = e - 9 - k - 4;
	//  120  251:aload_0         
	//  121  252:getfield        #73  <Field int e>
	//  122  255:bipush          9
	//  123  257:isub            
	//  124  258:iload           4
	//  125  260:isub            
	//  126  261:iconst_4        
	//  127  262:isub            
	//  128  263:istore          5
_L19:
		if(j1 <= 0) goto _L2; else goto _L1
	//  129  265:iload           5
	//  130  267:ifle            911
_L1:
		int i1;
		int k1;
		int l1;
		c.a(b, 5);
	//  131  270:aload_0         
	//  132  271:getfield        #38  <Field m c>
	//  133  274:aload_0         
	//  134  275:getfield        #31  <Field l b>
	//  135  278:iconst_5        
	//  136  279:invokevirtual   #66  <Method void m.a(l, int)>
		i1 = b.c(8);
	//  137  282:aload_0         
	//  138  283:getfield        #31  <Field l b>
	//  139  286:bipush          8
	//  140  288:invokevirtual   #71  <Method int l.c(int)>
	//  141  291:istore          4
		b.b(3);
	//  142  293:aload_0         
	//  143  294:getfield        #31  <Field l b>
	//  144  297:iconst_3        
	//  145  298:invokevirtual   #68  <Method void l.b(int)>
		k1 = b.c(13);
	//  146  301:aload_0         
	//  147  302:getfield        #31  <Field l b>
	//  148  305:bipush          13
	//  149  307:invokevirtual   #71  <Method int l.c(int)>
	//  150  310:istore          6
		b.b(4);
	//  151  312:aload_0         
	//  152  313:getfield        #31  <Field l b>
	//  153  316:iconst_4        
	//  154  317:invokevirtual   #68  <Method void l.b(int)>
		l1 = b.c(12);
	//  155  320:aload_0         
	//  156  321:getfield        #31  <Field l b>
	//  157  324:bipush          12
	//  158  326:invokevirtual   #71  <Method int l.c(int)>
	//  159  329:istore          7
		if(i1 == 6)
	//* 160  331:iload           4
	//* 161  333:bipush          6
	//* 162  335:icmpne          353
			i1 = a(c, l1);
	//  163  338:aload_0         
	//  164  339:aload_0         
	//  165  340:getfield        #38  <Field m c>
	//  166  343:iload           7
	//  167  345:invokespecial   #117 <Method int a(m, int)>
	//  168  348:istore          4
		else
	//* 169  350:goto            362
			c.d(l1);
	//  170  353:aload_0         
	//  171  354:getfield        #38  <Field m c>
	//  172  357:iload           7
	//  173  359:invokevirtual   #60  <Method void m.d(int)>
		l1 = j1 - (l1 + 5);
	//  174  362:iload           5
	//  175  364:iload           7
	//  176  366:iconst_5        
	//  177  367:iadd            
	//  178  368:isub            
	//  179  369:istore          7
		if((o.a(a) & 0x10) != 0)
	//* 180  371:aload_0         
	//* 181  372:getfield        #21  <Field o a>
	//* 182  375:invokestatic    #102 <Method int o.a(o)>
	//* 183  378:bipush          16
	//* 184  380:iand            
	//* 185  381:ifeq            391
			j1 = i1;
	//  186  384:iload           4
	//  187  386:istore          5
		else
	//* 188  388:goto            395
			j1 = k1;
	//  189  391:iload           6
	//  190  393:istore          5
		if(a.b.get(j1))
	//* 191  395:aload_0         
	//* 192  396:getfield        #21  <Field o a>
	//* 193  399:getfield        #120 <Field SparseBooleanArray o.b>
	//* 194  402:iload           5
	//* 195  404:invokevirtual   #126 <Method boolean SparseBooleanArray.get(int)>
	//* 196  407:ifeq            413
			continue; /* Loop/switch isn't completed */
	//  197  410:goto            904
		m1 = null;
	//  198  413:aconst_null     
	//  199  414:astore_1        
		if(i1 == 15) goto _L4; else goto _L3
	//  200  415:iload           4
	//  201  417:bipush          15
	//  202  419:icmpeq          822
_L3:
		if(i1 == 21) goto _L6; else goto _L5
	//  203  422:iload           4
	//  204  424:bipush          21
	//  205  426:icmpeq          774
_L5:
		if(i1 == 27) goto _L8; else goto _L7
	//  206  429:iload           4
	//  207  431:bipush          27
	//  208  433:icmpeq          670
_L7:
		if(i1 == 36) goto _L10; else goto _L9
	//  209  436:iload           4
	//  210  438:bipush          36
	//  211  440:icmpeq          631
_L9:
		if(i1 == 135) goto _L12; else goto _L11
	//  212  443:iload           4
	//  213  445:sipush          135
	//  214  448:icmpeq          611
_L11:
		if(i1 == 138) goto _L14; else goto _L13
	//  215  451:iload           4
	//  216  453:sipush          138
	//  217  456:icmpeq          592
_L13:
		i1;
	//  218  459:iload           4
		JVM INSTR tableswitch 2 4: default 488
	//	               2 573
	//	               3 554
	//	               4 535;
	//  219  461:tableswitch     2 4: default 488
	//	               2 573
	//	               3 554
	//	               4 535
		   goto _L15 _L16 _L17 _L18
_L15:
		switch(i1)
	//* 220  488:iload           4
		{
	//* 221  490:tableswitch     129 130: default 512
	//	               129 515
	//	               130 592
		default:
			break; /* Loop/switch isn't completed */
	//  222  512:goto            860

		case 129: 
			m1 = ((m) (new a(g1.d(j1), false)));
	//  223  515:new             #128 <Class a>
	//  224  518:dup             
	//  225  519:aload_3         
	//  226  520:iload           5
	//  227  522:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  228  527:iconst_0        
	//  229  528:invokespecial   #131 <Method void a(com.google.ads.interactivemedia.v3.a.c.m, boolean)>
	//  230  531:astore_1        
			break; /* Loop/switch isn't completed */
	//  231  532:goto            860

		case 130: 
			break;
		}
		  goto _L14
_L18:
		m1 = ((m) (new j(g1.d(j1))));
	//  232  535:new             #133 <Class j>
	//  233  538:dup             
	//  234  539:aload_3         
	//  235  540:iload           5
	//  236  542:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  237  547:invokespecial   #134 <Method void j(com.google.ads.interactivemedia.v3.a.c.m)>
	//  238  550:astore_1        
		break; /* Loop/switch isn't completed */
	//  239  551:goto            860
_L17:
		m1 = ((m) (new j(g1.d(j1))));
	//  240  554:new             #133 <Class j>
	//  241  557:dup             
	//  242  558:aload_3         
	//  243  559:iload           5
	//  244  561:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  245  566:invokespecial   #134 <Method void j(com.google.ads.interactivemedia.v3.a.c.m)>
	//  246  569:astore_1        
		break; /* Loop/switch isn't completed */
	//  247  570:goto            860
_L16:
		m1 = ((m) (new f(g1.d(j1))));
	//  248  573:new             #136 <Class f>
	//  249  576:dup             
	//  250  577:aload_3         
	//  251  578:iload           5
	//  252  580:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  253  585:invokespecial   #137 <Method void f(com.google.ads.interactivemedia.v3.a.c.m)>
	//  254  588:astore_1        
		break; /* Loop/switch isn't completed */
	//  255  589:goto            860
_L14:
		m1 = ((m) (new com.google.ads.interactivemedia.v3.a.c.e.d(g1.d(j1))));
	//  256  592:new             #139 <Class com.google.ads.interactivemedia.v3.a.c.e.d>
	//  257  595:dup             
	//  258  596:aload_3         
	//  259  597:iload           5
	//  260  599:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  261  604:invokespecial   #140 <Method void com.google.ads.interactivemedia.v3.a.c.e.d(com.google.ads.interactivemedia.v3.a.c.m)>
	//  262  607:astore_1        
		break; /* Loop/switch isn't completed */
	//  263  608:goto            860
_L12:
		m1 = ((m) (new a(g1.d(j1), true)));
	//  264  611:new             #128 <Class a>
	//  265  614:dup             
	//  266  615:aload_3         
	//  267  616:iload           5
	//  268  618:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  269  623:iconst_1        
	//  270  624:invokespecial   #131 <Method void a(com.google.ads.interactivemedia.v3.a.c.m, boolean)>
	//  271  627:astore_1        
		break; /* Loop/switch isn't completed */
	//  272  628:goto            860
_L10:
		m1 = ((m) (new h(g1.d(j1), new n(g1.d(o.b(a))))));
	//  273  631:new             #142 <Class h>
	//  274  634:dup             
	//  275  635:aload_3         
	//  276  636:iload           5
	//  277  638:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  278  643:new             #144 <Class n>
	//  279  646:dup             
	//  280  647:aload_3         
	//  281  648:aload_0         
	//  282  649:getfield        #21  <Field o a>
	//  283  652:invokestatic    #146 <Method int o.b(o)>
	//  284  655:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  285  660:invokespecial   #147 <Method void n(com.google.ads.interactivemedia.v3.a.c.m)>
	//  286  663:invokespecial   #150 <Method void h(com.google.ads.interactivemedia.v3.a.c.m, n)>
	//  287  666:astore_1        
		break; /* Loop/switch isn't completed */
	//  288  667:goto            860
_L8:
		if((o.a(a) & 4) == 0)
	//* 289  670:aload_0         
	//* 290  671:getfield        #21  <Field o a>
	//* 291  674:invokestatic    #102 <Method int o.a(o)>
	//* 292  677:iconst_4        
	//* 293  678:iand            
	//* 294  679:ifeq            685
	//* 295  682:goto            860
		{
			m1 = ((m) (g1.d(j1)));
	//  296  685:aload_3         
	//  297  686:iload           5
	//  298  688:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  299  693:astore_1        
			n n1 = new n(g1.d(o.b(a)));
	//  300  694:new             #144 <Class n>
	//  301  697:dup             
	//  302  698:aload_3         
	//  303  699:aload_0         
	//  304  700:getfield        #21  <Field o a>
	//  305  703:invokestatic    #146 <Method int o.b(o)>
	//  306  706:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  307  711:invokespecial   #147 <Method void n(com.google.ads.interactivemedia.v3.a.c.m)>
	//  308  714:astore          9
			if((o.a(a) & 1) != 0)
	//* 309  716:aload_0         
	//* 310  717:getfield        #21  <Field o a>
	//* 311  720:invokestatic    #102 <Method int o.a(o)>
	//* 312  723:iconst_1        
	//* 313  724:iand            
	//* 314  725:ifeq            733
				flag = true;
	//  315  728:iconst_1        
	//  316  729:istore_2        
			else
	//* 317  730:goto            735
				flag = false;
	//  318  733:iconst_0        
	//  319  734:istore_2        
			boolean flag1;
			if((o.a(a) & 8) != 0)
	//* 320  735:aload_0         
	//* 321  736:getfield        #21  <Field o a>
	//* 322  739:invokestatic    #102 <Method int o.a(o)>
	//* 323  742:bipush          8
	//* 324  744:iand            
	//* 325  745:ifeq            754
				flag1 = true;
	//  326  748:iconst_1        
	//  327  749:istore          8
			else
	//* 328  751:goto            757
				flag1 = false;
	//  329  754:iconst_0        
	//  330  755:istore          8
			m1 = ((m) (new com.google.ads.interactivemedia.v3.a.c.e.g(((com.google.ads.interactivemedia.v3.a.c.m) (m1)), n1, flag, flag1)));
	//  331  757:new             #152 <Class com.google.ads.interactivemedia.v3.a.c.e.g>
	//  332  760:dup             
	//  333  761:aload_1         
	//  334  762:aload           9
	//  335  764:iload_2         
	//  336  765:iload           8
	//  337  767:invokespecial   #155 <Method void com.google.ads.interactivemedia.v3.a.c.e.g(com.google.ads.interactivemedia.v3.a.c.m, n, boolean, boolean)>
	//  338  770:astore_1        
		}
		break; /* Loop/switch isn't completed */
	//  339  771:goto            860
_L6:
		if((o.a(a) & 0x10) != 0)
	//* 340  774:aload_0         
	//* 341  775:getfield        #21  <Field o a>
	//* 342  778:invokestatic    #102 <Method int o.a(o)>
	//* 343  781:bipush          16
	//* 344  783:iand            
	//* 345  784:ifeq            798
			m1 = ((m) (a.c));
	//  346  787:aload_0         
	//  347  788:getfield        #21  <Field o a>
	//  348  791:getfield        #105 <Field i o.c>
	//  349  794:astore_1        
		else
	//* 350  795:goto            860
			m1 = ((m) (new i(g1.d(o.b(a)))));
	//  351  798:new             #107 <Class i>
	//  352  801:dup             
	//  353  802:aload_3         
	//  354  803:aload_0         
	//  355  804:getfield        #21  <Field o a>
	//  356  807:invokestatic    #146 <Method int o.b(o)>
	//  357  810:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  358  815:invokespecial   #115 <Method void i(com.google.ads.interactivemedia.v3.a.c.m)>
	//  359  818:astore_1        
		break; /* Loop/switch isn't completed */
	//  360  819:goto            860
_L4:
		if((o.a(a) & 2) == 0)
	//* 361  822:aload_0         
	//* 362  823:getfield        #21  <Field o a>
	//* 363  826:invokestatic    #102 <Method int o.a(o)>
	//* 364  829:iconst_2        
	//* 365  830:iand            
	//* 366  831:ifeq            837
	//* 367  834:goto            860
			m1 = ((m) (new c(g1.d(j1), ((com.google.ads.interactivemedia.v3.a.c.m) (new d())))));
	//  368  837:new             #157 <Class c>
	//  369  840:dup             
	//  370  841:aload_3         
	//  371  842:iload           5
	//  372  844:invokeinterface #112 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
	//  373  849:new             #159 <Class d>
	//  374  852:dup             
	//  375  853:invokespecial   #160 <Method void d()>
	//  376  856:invokespecial   #163 <Method void c(com.google.ads.interactivemedia.v3.a.c.m, com.google.ads.interactivemedia.v3.a.c.m)>
	//  377  859:astore_1        
		if(m1 != null)
	//* 378  860:aload_1         
	//* 379  861:ifnull          904
		{
			a.b.put(j1, true);
	//  380  864:aload_0         
	//  381  865:getfield        #21  <Field o a>
	//  382  868:getfield        #120 <Field SparseBooleanArray o.b>
	//  383  871:iload           5
	//  384  873:iconst_1        
	//  385  874:invokevirtual   #167 <Method void SparseBooleanArray.put(int, boolean)>
			a.a.put(k1, ((Object) (new o$b(((e) (m1)), o.c(a)))));
	//  386  877:aload_0         
	//  387  878:getfield        #21  <Field o a>
	//  388  881:getfield        #170 <Field SparseArray o.a>
	//  389  884:iload           6
	//  390  886:new             #172 <Class o$b>
	//  391  889:dup             
	//  392  890:aload_1         
	//  393  891:aload_0         
	//  394  892:getfield        #21  <Field o a>
	//  395  895:invokestatic    #175 <Method com.google.ads.interactivemedia.v3.a.c.e.m o.c(o)>
	//  396  898:invokespecial   #178 <Method void o$b(e, com.google.ads.interactivemedia.v3.a.c.e.m)>
	//  397  901:invokevirtual   #183 <Method void SparseArray.put(int, Object)>
		}
		j1 = l1;
	//  398  904:iload           7
	//  399  906:istore          5
		  goto _L19
	//* 400  908:goto            265
_L2:
		if((o.a(a) & 0x10) != 0)
	//* 401  911:aload_0         
	//* 402  912:getfield        #21  <Field o a>
	//* 403  915:invokestatic    #102 <Method int o.a(o)>
	//* 404  918:bipush          16
	//* 405  920:iand            
	//* 406  921:ifeq            943
		{
			if(!com.google.ads.interactivemedia.v3.a.c.e.o.d(a))
	//* 407  924:aload_0         
	//* 408  925:getfield        #21  <Field o a>
	//* 409  928:invokestatic    #186 <Method boolean com.google.ads.interactivemedia.v3.a.c.e.o.d(o)>
	//* 410  931:ifne            974
				g1.f();
	//  411  934:aload_3         
	//  412  935:invokeinterface #188 <Method void g.f()>
		} else
	//* 413  940:goto            974
		{
			a.a.remove(0);
	//  414  943:aload_0         
	//  415  944:getfield        #21  <Field o a>
	//  416  947:getfield        #170 <Field SparseArray o.a>
	//  417  950:iconst_0        
	//  418  951:invokevirtual   #191 <Method void SparseArray.remove(int)>
			a.a.remove(d);
	//  419  954:aload_0         
	//  420  955:getfield        #21  <Field o a>
	//  421  958:getfield        #170 <Field SparseArray o.a>
	//  422  961:aload_0         
	//  423  962:getfield        #40  <Field int d>
	//  424  965:invokevirtual   #191 <Method void SparseArray.remove(int)>
			g1.f();
	//  425  968:aload_3         
	//  426  969:invokeinterface #188 <Method void g.f()>
		}
		o.a(a, true);
	//  427  974:aload_0         
	//  428  975:getfield        #21  <Field o a>
	//  429  978:iconst_1        
	//  430  979:invokestatic    #194 <Method boolean o.a(o, boolean)>
	//  431  982:pop             
		return;
	//  432  983:return          
	}

	final o a;
	private final l b = new l(new byte[5]);
	private final m c = new m();
	private final int d;
	private int e;
	private int f;
	private int g;

	public o$c(o o1, int k)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field o a>
		super(((o$1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #24  <Method void o$d(o$1)>
	//    6   10:aload_0         
	//    7   11:new             #26  <Class l>
	//    8   14:dup             
	//    9   15:iconst_5        
	//   10   16:newarray        byte[]
	//   11   18:invokespecial   #29  <Method void l(byte[])>
	//   12   21:putfield        #31  <Field l b>
	//   13   24:aload_0         
	//   14   25:new             #33  <Class m>
	//   15   28:dup             
	//   16   29:invokespecial   #36  <Method void m()>
	//   17   32:putfield        #38  <Field m c>
		d = k;
	//   18   35:aload_0         
	//   19   36:iload_2         
	//   20   37:putfield        #40  <Field int d>
	//   21   40:return          
	}
}
