// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

static class m$i extends Thread
{

	static boolean a(m$i m$i1, boolean flag)
	{
		m$i1.b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean b>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void j()
	{
		if(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean i>
	//*   2    4:ifeq            19
		{
			i = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #63  <Field boolean i>
			s.e();
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field m$h s>
	//    8   16:invokevirtual   #69  <Method void m$h.e()>
		}
	//    9   19:return          
	}

	private void k()
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean h>
	//*   2    4:ifeq            26
		{
			s.f();
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field m$h s>
	//    5   11:invokevirtual   #73  <Method void m$h.f()>
			h = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #71  <Field boolean h>
			com.amap.api.mapcore.util.m.e().c(this);
	//    9   19:invokestatic    #76  <Method m$j m.e()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #81  <Method void m$j.c(m$i)>
		}
	//   12   26:return          
	}

	private void l()
		throws InterruptedException
	{
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int l2;
		int i3;
		int j3;
		int l3;
		Object obj;
		Object obj1;
		s = new m$h(t);
	//    0    0:aload_0         
	//    1    1:new             #67  <Class m$h>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field WeakReference t>
	//    5    9:invokespecial   #87  <Method void m$h(WeakReference)>
	//    6   12:putfield        #65  <Field m$h s>
		h = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #71  <Field boolean h>
		i = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field boolean i>
		obj1 = null;
	//   13   25:aconst_null     
	//   14   26:astore          22
		l1 = 0;
	//   15   28:iconst_0        
	//   16   29:istore          4
		i1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
		j2 = 0;
	//   19   33:iconst_0        
	//   20   34:istore          6
		k1 = 0;
	//   21   36:iconst_0        
	//   22   37:istore_3        
		i2 = 0;
	//   23   38:iconst_0        
	//   24   39:istore          5
		l3 = 0;
	//   25   41:iconst_0        
	//   26   42:istore          12
		j1 = 0;
	//   27   44:iconst_0        
	//   28   45:istore_2        
		l2 = 0;
	//   29   46:iconst_0        
	//   30   47:istore          8
		j3 = 0;
	//   31   49:iconst_0        
	//   32   50:istore          10
		i3 = 0;
	//   33   52:iconst_0        
	//   34   53:istore          9
		obj = null;
	//   35   55:aconst_null     
	//   36   56:astore          21
_L3:
		Object obj2 = ((Object) (com.amap.api.mapcore.util.m.e()));
	//   37   58:invokestatic    #76  <Method m$j m.e()>
	//   38   61:astore          23
		obj2;
	//   39   63:aload           23
		JVM INSTR monitorenter ;
	//   40   65:monitorenter    
		int i4;
		int j4;
		int k4;
		i4 = j1;
	//   41   66:iload_2         
	//   42   67:istore          13
		j4 = l3;
	//   43   69:iload           12
	//   44   71:istore          14
		j1 = i2;
	//   45   73:iload           5
	//   46   75:istore_2        
		k4 = k1;
	//   47   76:iload_3         
	//   48   77:istore          15
		k1 = j2;
	//   49   79:iload           6
	//   50   81:istore_3        
		i2 = i1;
	//   51   82:iload_1         
	//   52   83:istore          5
		j2 = l1;
	//   53   85:iload           4
	//   54   87:istore          6
_L2:
		boolean flag = a;
	//   55   89:aload_0         
	//   56   90:getfield        #89  <Field boolean a>
	//   57   93:istore          19
		if(!flag)
			break MISSING_BLOCK_LABEL_131;
	//   58   95:iload           19
	//   59   97:ifeq            131
		obj2;
	//   60  100:aload           23
		JVM INSTR monitorexit ;
	//   61  102:monitorexit     
		obj = ((Object) (com.amap.api.mapcore.util.m.e()));
	//   62  103:invokestatic    #76  <Method m$j m.e()>
	//   63  106:astore          21
		obj;
	//   64  108:aload           21
		JVM INSTR monitorenter ;
	//   65  110:monitorenter    
		j();
	//   66  111:aload_0         
	//   67  112:invokespecial   #91  <Method void j()>
		k();
	//   68  115:aload_0         
	//   69  116:invokespecial   #93  <Method void k()>
		obj;
	//   70  119:aload           21
		JVM INSTR monitorexit ;
	//   71  121:monitorexit     
		return;
	//   72  122:return          
		obj1;
	//   73  123:astore          22
	//*  74  125:aload           21
		throw obj1;
	//   75  127:monitorexit     
	//   76  128:aload           22
	//   77  130:athrow          
		if(q.isEmpty())
			break MISSING_BLOCK_LABEL_185;
	//   78  131:aload_0         
	//   79  132:getfield        #43  <Field ArrayList q>
	//   80  135:invokevirtual   #97  <Method boolean ArrayList.isEmpty()>
	//   81  138:ifne            185
		obj = ((Object) ((Runnable)q.remove(0)));
	//   82  141:aload_0         
	//   83  142:getfield        #43  <Field ArrayList q>
	//   84  145:iconst_0        
	//   85  146:invokevirtual   #101 <Method Object ArrayList.remove(int)>
	//   86  149:checkcast       #103 <Class Runnable>
	//   87  152:astore          21
		int k2;
		int k3;
		l1 = j2;
	//   88  154:iload           6
	//   89  156:istore          4
		k2 = i2;
	//   90  158:iload           5
	//   91  160:istore          7
		j2 = k1;
	//   92  162:iload_3         
	//   93  163:istore          6
		k1 = k4;
	//   94  165:iload           15
	//   95  167:istore_3        
		i2 = j1;
	//   96  168:iload_2         
	//   97  169:istore          5
		l3 = j4;
	//   98  171:iload           14
	//   99  173:istore          12
		j1 = i4;
	//  100  175:iload           13
	//  101  177:istore_2        
		k3 = i3;
	//  102  178:iload           9
	//  103  180:istore          11
		break; /* Loop/switch isn't completed */
	//  104  182:goto            745
		flag = false;
	//  105  185:iconst_0        
	//  106  186:istore          19
		if(d != c)
	//* 107  188:aload_0         
	//* 108  189:getfield        #105 <Field boolean d>
	//* 109  192:aload_0         
	//* 110  193:getfield        #107 <Field boolean c>
	//* 111  196:icmpeq          219
		{
			flag = c;
	//  112  199:aload_0         
	//  113  200:getfield        #107 <Field boolean c>
	//  114  203:istore          19
			d = c;
	//  115  205:aload_0         
	//  116  206:aload_0         
	//  117  207:getfield        #107 <Field boolean c>
	//  118  210:putfield        #105 <Field boolean d>
			((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  119  213:invokestatic    #76  <Method m$j m.e()>
	//  120  216:invokevirtual   #112 <Method void Object.notifyAll()>
		}
		if(!k)
			break MISSING_BLOCK_LABEL_242;
	//  121  219:aload_0         
	//  122  220:getfield        #114 <Field boolean k>
	//  123  223:ifeq            242
		j();
	//  124  226:aload_0         
	//  125  227:invokespecial   #91  <Method void j()>
		k();
	//  126  230:aload_0         
	//  127  231:invokespecial   #93  <Method void k()>
		k = false;
	//  128  234:aload_0         
	//  129  235:iconst_0        
	//  130  236:putfield        #114 <Field boolean k>
		l2 = 1;
	//  131  239:iconst_1        
	//  132  240:istore          8
		l3 = k4;
	//  133  242:iload           15
	//  134  244:istore          12
		if(k4 == 0)
			break MISSING_BLOCK_LABEL_262;
	//  135  246:iload           15
	//  136  248:ifeq            262
		j();
	//  137  251:aload_0         
	//  138  252:invokespecial   #91  <Method void j()>
		k();
	//  139  255:aload_0         
	//  140  256:invokespecial   #93  <Method void k()>
		l3 = 0;
	//  141  259:iconst_0        
	//  142  260:istore          12
		if(!flag)
			break MISSING_BLOCK_LABEL_278;
	//  143  262:iload           19
	//  144  264:ifeq            278
		if(i)
	//* 145  267:aload_0         
	//* 146  268:getfield        #63  <Field boolean i>
	//* 147  271:ifeq            278
			j();
	//  148  274:aload_0         
	//  149  275:invokespecial   #91  <Method void j()>
		if(!flag)
			break MISSING_BLOCK_LABEL_338;
	//  150  278:iload           19
	//  151  280:ifeq            338
		m m1;
		if(!h)
			break MISSING_BLOCK_LABEL_338;
	//  152  283:aload_0         
	//  153  284:getfield        #71  <Field boolean h>
	//  154  287:ifeq            338
		m1 = (m)t.get();
	//  155  290:aload_0         
	//  156  291:getfield        #55  <Field WeakReference t>
	//  157  294:invokevirtual   #120 <Method Object WeakReference.get()>
	//  158  297:checkcast       #6   <Class m>
	//  159  300:astore          24
		boolean flag1;
		if(m1 == null)
	//* 160  302:aload           24
	//* 161  304:ifnonnull       313
		{
			flag1 = false;
	//  162  307:iconst_0        
	//  163  308:istore          20
			break MISSING_BLOCK_LABEL_320;
	//  164  310:goto            320
		}
		flag1 = com.amap.api.mapcore.util.m.g(m1);
	//  165  313:aload           24
	//  166  315:invokestatic    #123 <Method boolean m.g(m)>
	//  167  318:istore          20
		if(!flag1)
			break MISSING_BLOCK_LABEL_334;
	//  168  320:iload           20
	//  169  322:ifeq            334
		if(!com.amap.api.mapcore.util.m.e().a())
			break MISSING_BLOCK_LABEL_338;
	//  170  325:invokestatic    #76  <Method m$j m.e()>
	//  171  328:invokevirtual   #125 <Method boolean m$j.a()>
	//  172  331:ifeq            338
		k();
	//  173  334:aload_0         
	//  174  335:invokespecial   #93  <Method void k()>
		if(!flag)
			break MISSING_BLOCK_LABEL_359;
	//  175  338:iload           19
	//  176  340:ifeq            359
		if(com.amap.api.mapcore.util.m.e().b())
	//* 177  343:invokestatic    #76  <Method m$j m.e()>
	//* 178  346:invokevirtual   #127 <Method boolean m$j.b()>
	//* 179  349:ifeq            359
			s.f();
	//  180  352:aload_0         
	//  181  353:getfield        #65  <Field m$h s>
	//  182  356:invokevirtual   #73  <Method void m$h.f()>
		if(!e && !g)
	//* 183  359:aload_0         
	//* 184  360:getfield        #129 <Field boolean e>
	//* 185  363:ifne            400
	//* 186  366:aload_0         
	//* 187  367:getfield        #131 <Field boolean g>
	//* 188  370:ifne            400
		{
			if(i)
	//* 189  373:aload_0         
	//* 190  374:getfield        #63  <Field boolean i>
	//* 191  377:ifeq            384
				j();
	//  192  380:aload_0         
	//  193  381:invokespecial   #91  <Method void j()>
			g = true;
	//  194  384:aload_0         
	//  195  385:iconst_1        
	//  196  386:putfield        #131 <Field boolean g>
			f = false;
	//  197  389:aload_0         
	//  198  390:iconst_0        
	//  199  391:putfield        #133 <Field boolean f>
			((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  200  394:invokestatic    #76  <Method m$j m.e()>
	//  201  397:invokevirtual   #112 <Method void Object.notifyAll()>
		}
		if(e && g)
	//* 202  400:aload_0         
	//* 203  401:getfield        #129 <Field boolean e>
	//* 204  404:ifeq            425
	//* 205  407:aload_0         
	//* 206  408:getfield        #131 <Field boolean g>
	//* 207  411:ifeq            425
		{
			g = false;
	//  208  414:aload_0         
	//  209  415:iconst_0        
	//  210  416:putfield        #131 <Field boolean g>
			((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  211  419:invokestatic    #76  <Method m$j m.e()>
	//  212  422:invokevirtual   #112 <Method void Object.notifyAll()>
		}
		k3 = i4;
	//  213  425:iload           13
	//  214  427:istore          11
		if(i4 == 0)
			break MISSING_BLOCK_LABEL_451;
	//  215  429:iload           13
	//  216  431:ifeq            451
		j4 = 0;
	//  217  434:iconst_0        
	//  218  435:istore          14
		k3 = 0;
	//  219  437:iconst_0        
	//  220  438:istore          11
		p = true;
	//  221  440:aload_0         
	//  222  441:iconst_1        
	//  223  442:putfield        #135 <Field boolean p>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  224  445:invokestatic    #76  <Method m$j m.e()>
	//  225  448:invokevirtual   #112 <Method void Object.notifyAll()>
		int l4;
		int i5;
		int j5;
		k4 = j2;
	//  226  451:iload           6
	//  227  453:istore          15
		i5 = i2;
	//  228  455:iload           5
	//  229  457:istore          17
		j5 = k1;
	//  230  459:iload_3         
	//  231  460:istore          18
		i4 = j1;
	//  232  462:iload_2         
	//  233  463:istore          13
		l4 = l2;
	//  234  465:iload           8
	//  235  467:istore          16
		if(!m())
			break MISSING_BLOCK_LABEL_710;
	//  236  469:aload_0         
	//  237  470:invokespecial   #137 <Method boolean m()>
	//  238  473:ifeq            710
		l1 = j2;
	//  239  476:iload           6
	//  240  478:istore          4
		i1 = l2;
	//  241  480:iload           8
	//  242  482:istore_1        
		if(h)
			break MISSING_BLOCK_LABEL_564;
	//  243  483:aload_0         
	//  244  484:getfield        #71  <Field boolean h>
	//  245  487:ifne            564
		if(l2 != 0)
	//* 246  490:iload           8
	//* 247  492:ifeq            504
		{
			i1 = 0;
	//  248  495:iconst_0        
	//  249  496:istore_1        
			l1 = j2;
	//  250  497:iload           6
	//  251  499:istore          4
			break MISSING_BLOCK_LABEL_564;
	//  252  501:goto            564
		}
		flag = com.amap.api.mapcore.util.m.e().b(this);
	//  253  504:invokestatic    #76  <Method m$j m.e()>
	//  254  507:aload_0         
	//  255  508:invokevirtual   #140 <Method boolean m$j.b(m$i)>
	//  256  511:istore          19
		l1 = j2;
	//  257  513:iload           6
	//  258  515:istore          4
		i1 = l2;
	//  259  517:iload           8
	//  260  519:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_564;
	//  261  520:iload           19
	//  262  522:ifeq            564
		try
		{
			s.a();
	//  263  525:aload_0         
	//  264  526:getfield        #65  <Field m$h s>
	//  265  529:invokevirtual   #142 <Method void m$h.a()>
			break MISSING_BLOCK_LABEL_547;
	//  266  532:goto            547
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  267  535:astore          21
		com.amap.api.mapcore.util.m.e().c(this);
	//  268  537:invokestatic    #76  <Method m$j m.e()>
	//  269  540:aload_0         
	//  270  541:invokevirtual   #81  <Method void m$j.c(m$i)>
		throw obj;
	//  271  544:aload           21
	//  272  546:athrow          
		h = true;
	//  273  547:aload_0         
	//  274  548:iconst_1        
	//  275  549:putfield        #71  <Field boolean h>
		l1 = 1;
	//  276  552:iconst_1        
	//  277  553:istore          4
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  278  555:invokestatic    #76  <Method m$j m.e()>
	//  279  558:invokevirtual   #112 <Method void Object.notifyAll()>
		i1 = l2;
	//  280  561:iload           8
	//  281  563:istore_1        
		l2 = i2;
	//  282  564:iload           5
	//  283  566:istore          8
		j2 = k1;
	//  284  568:iload_3         
	//  285  569:istore          6
		k2 = j1;
	//  286  571:iload_2         
	//  287  572:istore          7
		if(!h)
			break MISSING_BLOCK_LABEL_612;
	//  288  574:aload_0         
	//  289  575:getfield        #71  <Field boolean h>
	//  290  578:ifeq            612
		l2 = i2;
	//  291  581:iload           5
	//  292  583:istore          8
		j2 = k1;
	//  293  585:iload_3         
	//  294  586:istore          6
		k2 = j1;
	//  295  588:iload_2         
	//  296  589:istore          7
		if(i)
			break MISSING_BLOCK_LABEL_612;
	//  297  591:aload_0         
	//  298  592:getfield        #63  <Field boolean i>
	//  299  595:ifne            612
		i = true;
	//  300  598:aload_0         
	//  301  599:iconst_1        
	//  302  600:putfield        #63  <Field boolean i>
		l2 = 1;
	//  303  603:iconst_1        
	//  304  604:istore          8
		j2 = 1;
	//  305  606:iconst_1        
	//  306  607:istore          6
		k2 = 1;
	//  307  609:iconst_1        
	//  308  610:istore          7
		k4 = l1;
	//  309  612:iload           4
	//  310  614:istore          15
		i5 = l2;
	//  311  616:iload           8
	//  312  618:istore          17
		j5 = j2;
	//  313  620:iload           6
	//  314  622:istore          18
		i4 = k2;
	//  315  624:iload           7
	//  316  626:istore          13
		l4 = i1;
	//  317  628:iload_1         
	//  318  629:istore          16
		if(!i)
			break MISSING_BLOCK_LABEL_710;
	//  319  631:aload_0         
	//  320  632:getfield        #63  <Field boolean i>
	//  321  635:ifeq            710
		i2 = k2;
	//  322  638:iload           7
	//  323  640:istore          5
		if(!r)
			break MISSING_BLOCK_LABEL_675;
	//  324  642:aload_0         
	//  325  643:getfield        #45  <Field boolean r>
	//  326  646:ifeq            675
		i2 = 1;
	//  327  649:iconst_1        
	//  328  650:istore          5
		j3 = l;
	//  329  652:aload_0         
	//  330  653:getfield        #47  <Field int l>
	//  331  656:istore          10
		i3 = m;
	//  332  658:aload_0         
	//  333  659:getfield        #49  <Field int m>
	//  334  662:istore          9
		j4 = 1;
	//  335  664:iconst_1        
	//  336  665:istore          14
		l2 = 1;
	//  337  667:iconst_1        
	//  338  668:istore          8
		r = false;
	//  339  670:aload_0         
	//  340  671:iconst_0        
	//  341  672:putfield        #45  <Field boolean r>
		o = false;
	//  342  675:aload_0         
	//  343  676:iconst_0        
	//  344  677:putfield        #51  <Field boolean o>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  345  680:invokestatic    #76  <Method m$j m.e()>
	//  346  683:invokevirtual   #112 <Method void Object.notifyAll()>
		k2 = l2;
	//  347  686:iload           8
	//  348  688:istore          7
		k1 = l3;
	//  349  690:iload           12
	//  350  692:istore_3        
		l3 = j4;
	//  351  693:iload           14
	//  352  695:istore          12
		j1 = k3;
	//  353  697:iload           11
	//  354  699:istore_2        
		l2 = i1;
	//  355  700:iload_1         
	//  356  701:istore          8
		k3 = i3;
	//  357  703:iload           9
	//  358  705:istore          11
		break; /* Loop/switch isn't completed */
	//  359  707:goto            745
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//  360  710:invokestatic    #76  <Method m$j m.e()>
	//  361  713:invokevirtual   #145 <Method void Object.wait()>
		j2 = k4;
	//  362  716:iload           15
	//  363  718:istore          6
		i2 = i5;
	//  364  720:iload           17
	//  365  722:istore          5
		k1 = j5;
	//  366  724:iload           18
	//  367  726:istore_3        
		k4 = l3;
	//  368  727:iload           12
	//  369  729:istore          15
		j1 = i4;
	//  370  731:iload           13
	//  371  733:istore_2        
		i4 = k3;
	//  372  734:iload           11
	//  373  736:istore          13
		l2 = l4;
	//  374  738:iload           16
	//  375  740:istore          8
		if(true) goto _L2; else goto _L1
	//  376  742:goto            89
_L1:
		break MISSING_BLOCK_LABEL_759;
	//* 377  745:aload           23
	//* 378  747:monitorexit     
	//* 379  748:goto            759
		obj;
	//  380  751:astore          21
	//* 381  753:aload           23
		throw obj;
	//  382  755:monitorexit     
	//  383  756:aload           21
	//  384  758:athrow          
		if(obj == null)
			break MISSING_BLOCK_LABEL_784;
	//  385  759:aload           21
	//  386  761:ifnull          784
		((Runnable) (obj)).run();
	//  387  764:aload           21
	//  388  766:invokeinterface #148 <Method void Runnable.run()>
		obj = null;
	//  389  771:aconst_null     
	//  390  772:astore          21
		i1 = k2;
	//  391  774:iload           7
	//  392  776:istore_1        
		i3 = k3;
	//  393  777:iload           11
	//  394  779:istore          9
		  goto _L3
	//* 395  781:goto            58
		i1 = k2;
	//  396  784:iload           7
	//  397  786:istore_1        
		if(k2 == 0) goto _L5; else goto _L4
	//  398  787:iload           7
	//  399  789:ifeq            873
_L4:
		if(!s.b()) goto _L7; else goto _L6
	//  400  792:aload_0         
	//  401  793:getfield        #65  <Field m$h s>
	//  402  796:invokevirtual   #149 <Method boolean m$h.b()>
	//  403  799:ifeq            835
_L6:
		obj2 = ((Object) (com.amap.api.mapcore.util.m.e()));
	//  404  802:invokestatic    #76  <Method m$j m.e()>
	//  405  805:astore          23
		obj2;
	//  406  807:aload           23
		JVM INSTR monitorenter ;
	//  407  809:monitorenter    
		j = true;
	//  408  810:aload_0         
	//  409  811:iconst_1        
	//  410  812:putfield        #151 <Field boolean j>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  411  815:invokestatic    #76  <Method m$j m.e()>
	//  412  818:invokevirtual   #112 <Method void Object.notifyAll()>
		obj2;
	//  413  821:aload           23
		JVM INSTR monitorexit ;
	//  414  823:monitorexit     
		  goto _L8
	//* 415  824:goto            1167
		Exception exception;
		exception;
	//  416  827:astore          21
	//* 417  829:aload           23
		throw exception;
	//  418  831:monitorexit     
	//  419  832:aload           21
	//  420  834:athrow          
_L7:
		obj2 = ((Object) (com.amap.api.mapcore.util.m.e()));
	//  421  835:invokestatic    #76  <Method m$j m.e()>
	//  422  838:astore          23
		obj2;
	//  423  840:aload           23
		JVM INSTR monitorenter ;
	//  424  842:monitorenter    
		j = true;
	//  425  843:aload_0         
	//  426  844:iconst_1        
	//  427  845:putfield        #151 <Field boolean j>
		f = true;
	//  428  848:aload_0         
	//  429  849:iconst_1        
	//  430  850:putfield        #133 <Field boolean f>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  431  853:invokestatic    #76  <Method m$j m.e()>
	//  432  856:invokevirtual   #112 <Method void Object.notifyAll()>
		obj2;
	//  433  859:aload           23
		JVM INSTR monitorexit ;
	//  434  861:monitorexit     
		  goto _L9
	//* 435  862:goto            1170
		exception;
	//  436  865:astore          21
	//* 437  867:aload           23
		throw exception;
	//  438  869:monitorexit     
	//  439  870:aload           21
	//  440  872:athrow          
_L5:
		k2 = j2;
	//  441  873:iload           6
	//  442  875:istore          7
		if(j2 == 0)
			break MISSING_BLOCK_LABEL_905;
	//  443  877:iload           6
	//  444  879:ifeq            905
		obj1 = ((Object) ((GL10)s.c()));
	//  445  882:aload_0         
	//  446  883:getfield        #65  <Field m$h s>
	//  447  886:invokevirtual   #154 <Method javax.microedition.khronos.opengles.GL m$h.c()>
	//  448  889:checkcast       #156 <Class GL10>
	//  449  892:astore          22
		com.amap.api.mapcore.util.m.e().a(((GL10) (obj1)));
	//  450  894:invokestatic    #76  <Method m$j m.e()>
	//  451  897:aload           22
	//  452  899:invokevirtual   #159 <Method void m$j.a(GL10)>
		k2 = 0;
	//  453  902:iconst_0        
	//  454  903:istore          7
		j2 = l1;
	//  455  905:iload           4
	//  456  907:istore          6
		if(l1 == 0) goto _L11; else goto _L10
	//  457  909:iload           4
	//  458  911:ifeq            953
_L10:
		obj2 = ((Object) ((m)t.get()));
	//  459  914:aload_0         
	//  460  915:getfield        #55  <Field WeakReference t>
	//  461  918:invokevirtual   #120 <Method Object WeakReference.get()>
	//  462  921:checkcast       #6   <Class m>
	//  463  924:astore          23
		if(obj2 == null) goto _L13; else goto _L12
	//  464  926:aload           23
	//  465  928:ifnull          1185
_L12:
		com.amap.api.mapcore.util.m.h(((m) (obj2))).onSurfaceCreated(((GL10) (obj1)), s.d);
	//  466  931:aload           23
	//  467  933:invokestatic    #162 <Method android.opengl.GLSurfaceView$Renderer m.h(m)>
	//  468  936:aload           22
	//  469  938:aload_0         
	//  470  939:getfield        #65  <Field m$h s>
	//  471  942:getfield        #165 <Field javax.microedition.khronos.egl.EGLConfig m$h.d>
	//  472  945:invokeinterface #171 <Method void android.opengl.GLSurfaceView$Renderer.onSurfaceCreated(GL10, javax.microedition.khronos.egl.EGLConfig)>
		  goto _L13
	//* 473  950:goto            1185
_L11:
		i3 = i2;
	//  474  953:iload           5
	//  475  955:istore          9
		if(i2 == 0) goto _L15; else goto _L14
	//  476  957:iload           5
	//  477  959:ifeq            998
_L14:
		obj2 = ((Object) ((m)t.get()));
	//  478  962:aload_0         
	//  479  963:getfield        #55  <Field WeakReference t>
	//  480  966:invokevirtual   #120 <Method Object WeakReference.get()>
	//  481  969:checkcast       #6   <Class m>
	//  482  972:astore          23
		if(obj2 == null) goto _L17; else goto _L16
	//  483  974:aload           23
	//  484  976:ifnull          1191
_L16:
		com.amap.api.mapcore.util.m.h(((m) (obj2))).onSurfaceChanged(((GL10) (obj1)), j3, k3);
	//  485  979:aload           23
	//  486  981:invokestatic    #162 <Method android.opengl.GLSurfaceView$Renderer m.h(m)>
	//  487  984:aload           22
	//  488  986:iload           10
	//  489  988:iload           11
	//  490  990:invokeinterface #175 <Method void android.opengl.GLSurfaceView$Renderer.onSurfaceChanged(GL10, int, int)>
		  goto _L17
	//* 491  995:goto            1191
_L15:
		obj2 = ((Object) ((m)t.get()));
	//  492  998:aload_0         
	//  493  999:getfield        #55  <Field WeakReference t>
	//  494 1002:invokevirtual   #120 <Method Object WeakReference.get()>
	//  495 1005:checkcast       #6   <Class m>
	//  496 1008:astore          23
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_1027;
	//  497 1010:aload           23
	//  498 1012:ifnull          1027
		com.amap.api.mapcore.util.m.h(((m) (obj2))).onDrawFrame(((GL10) (obj1)));
	//  499 1015:aload           23
	//  500 1017:invokestatic    #162 <Method android.opengl.GLSurfaceView$Renderer m.h(m)>
	//  501 1020:aload           22
	//  502 1022:invokeinterface #178 <Method void android.opengl.GLSurfaceView$Renderer.onDrawFrame(GL10)>
		l1 = s.d();
	//  503 1027:aload_0         
	//  504 1028:getfield        #65  <Field m$h s>
	//  505 1031:invokevirtual   #181 <Method int m$h.d()>
	//  506 1034:istore          4
		l1;
	//  507 1036:iload           4
		JVM INSTR lookupswitch 2: default 1197
	//	               12288: 1200
	//	               12302: 1203;
	//  508 1038:lookupswitch    2: default 1197
	//	               12288: 1200
	//	               12302: 1203
		   goto _L18 _L19 _L20
_L19:
		break MISSING_BLOCK_LABEL_1106;
_L18:
		m$h.a("GLThread", "eglSwapBuffers", l1);
	//  509 1064:ldc1            #183 <String "GLThread">
	//  510 1066:ldc1            #185 <String "eglSwapBuffers">
	//  511 1068:iload           4
	//  512 1070:invokestatic    #188 <Method void m$h.a(String, String, int)>
		obj2 = ((Object) (com.amap.api.mapcore.util.m.e()));
	//  513 1073:invokestatic    #76  <Method m$j m.e()>
	//  514 1076:astore          23
		obj2;
	//  515 1078:aload           23
		JVM INSTR monitorenter ;
	//  516 1080:monitorenter    
		f = true;
	//  517 1081:aload_0         
	//  518 1082:iconst_1        
	//  519 1083:putfield        #133 <Field boolean f>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//  520 1086:invokestatic    #76  <Method m$j m.e()>
	//  521 1089:invokevirtual   #112 <Method void Object.notifyAll()>
		obj2;
	//  522 1092:aload           23
		JVM INSTR monitorexit ;
	//  523 1094:monitorexit     
		break MISSING_BLOCK_LABEL_1106;
	//  524 1095:goto            1106
		exception;
	//  525 1098:astore          21
	//* 526 1100:aload           23
		throw exception;
	//  527 1102:monitorexit     
	//  528 1103:aload           21
	//  529 1105:athrow          
_L22:
		if(l3 != 0)
	//* 530 1106:iload           12
	//* 531 1108:ifeq            1113
			j1 = 1;
	//  532 1111:iconst_1        
	//  533 1112:istore_2        
		l1 = j2;
	//  534 1113:iload           6
	//  535 1115:istore          4
		j2 = k2;
	//  536 1117:iload           7
	//  537 1119:istore          6
		i2 = i3;
	//  538 1121:iload           9
	//  539 1123:istore          5
		i3 = k3;
	//  540 1125:iload           11
	//  541 1127:istore          9
		  goto _L3
	//* 542 1129:goto            58
		Exception exception1;
		exception1;
	//  543 1132:astore          22
		exception = ((Exception) (com.amap.api.mapcore.util.m.e()));
	//  544 1134:invokestatic    #76  <Method m$j m.e()>
	//  545 1137:astore          21
		exception;
	//  546 1139:aload           21
		JVM INSTR monitorenter ;
	//  547 1141:monitorenter    
		j();
	//  548 1142:aload_0         
	//  549 1143:invokespecial   #91  <Method void j()>
		k();
	//  550 1146:aload_0         
	//  551 1147:invokespecial   #93  <Method void k()>
		exception;
	//  552 1150:aload           21
		JVM INSTR monitorexit ;
	//  553 1152:monitorexit     
		  goto _L21
	//* 554 1153:goto            1164
		exception1;
	//  555 1156:astore          22
	//* 556 1158:aload           21
		throw exception1;
	//  557 1160:monitorexit     
	//  558 1161:aload           22
	//  559 1163:athrow          
_L21:
		throw exception1;
	//  560 1164:aload           22
	//  561 1166:athrow          
	//* 562 1167:goto            1180
_L9:
		i1 = k2;
	//  563 1170:iload           7
	//  564 1172:istore_1        
		i3 = k3;
	//  565 1173:iload           11
	//  566 1175:istore          9
		  goto _L3
	//* 567 1177:goto            58
_L8:
		i1 = 0;
	//  568 1180:iconst_0        
	//  569 1181:istore_1        
		  goto _L5
	//* 570 1182:goto            873
_L13:
		j2 = 0;
	//  571 1185:iconst_0        
	//  572 1186:istore          6
		  goto _L11
	//* 573 1188:goto            953
_L17:
		i3 = 0;
	//  574 1191:iconst_0        
	//  575 1192:istore          9
		  goto _L15
	//* 576 1194:goto            998
	//* 577 1197:goto            1064
	//* 578 1200:goto            1106
_L20:
		k1 = 1;
	//  579 1203:iconst_1        
	//  580 1204:istore_3        
		  goto _L22
	//* 581 1205:goto            1106
	}

	private boolean m()
	{
		return !d && e && !f && l > 0 && m > 0 && (o || n == 1);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean d>
	//    2    4:ifne            52
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field boolean e>
	//    5   11:ifeq            52
	//    6   14:aload_0         
	//    7   15:getfield        #133 <Field boolean f>
	//    8   18:ifne            52
	//    9   21:aload_0         
	//   10   22:getfield        #47  <Field int l>
	//   11   25:ifle            52
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field int m>
	//   14   32:ifle            52
	//   15   35:aload_0         
	//   16   36:getfield        #51  <Field boolean o>
	//   17   39:ifne            50
	//   18   42:aload_0         
	//   19   43:getfield        #53  <Field int n>
	//   20   46:iconst_1        
	//   21   47:icmpne          52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	public void a(int i1)
	{
		if(i1 > 0 || i1 > 1)
	//*   0    0:iload_1         
	//*   1    1:ifgt            9
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmple          19
			throw new IllegalArgumentException("renderMode");
	//    5    9:new             #192 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #194 <String "renderMode">
	//    8   15:invokespecial   #197 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//   10   19:invokestatic    #76  <Method m$j m.e()>
	//   11   22:astore_2        
		m$j1;
	//   12   23:aload_2         
		JVM INSTR monitorenter ;
	//   13   24:monitorenter    
		n = i1;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:putfield        #53  <Field int n>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//   17   30:invokestatic    #76  <Method m$j m.e()>
	//   18   33:invokevirtual   #112 <Method void Object.notifyAll()>
		m$j1;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return;
	//   21   38:return          
		Exception exception;
		exception;
	//   22   39:astore_3        
	//*  23   40:aload_2         
		throw exception;
	//   24   41:monitorexit     
	//   25   42:aload_3         
	//   26   43:athrow          
	}

	public void a(int i1, int j1)
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore          4
		m$j1;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		l = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #47  <Field int l>
		m = j1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #49  <Field int m>
		r = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #45  <Field boolean r>
		o = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #51  <Field boolean o>
		p = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #135 <Field boolean p>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//   19   33:invokestatic    #76  <Method m$j m.e()>
	//   20   36:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag;
		if(b || d || p)
			break MISSING_BLOCK_LABEL_89;
	//   21   39:aload_0         
	//   22   40:getfield        #61  <Field boolean b>
	//   23   43:ifne            89
	//   24   46:aload_0         
	//   25   47:getfield        #105 <Field boolean d>
	//   26   50:ifne            89
	//   27   53:aload_0         
	//   28   54:getfield        #135 <Field boolean p>
	//   29   57:ifne            89
		flag = a();
	//   30   60:aload_0         
	//   31   61:invokevirtual   #199 <Method boolean a()>
	//   32   64:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_89;
	//   33   65:iload_3         
	//   34   66:ifeq            89
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   35   69:invokestatic    #76  <Method m$j m.e()>
	//   36   72:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  37   75:goto            39
		Object obj;
		obj;
	//   38   78:astore          5
		Thread.currentThread().interrupt();
	//   39   80:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   40   83:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  41   86:goto            39
		m$j1;
	//   42   89:aload           4
		JVM INSTR monitorexit ;
	//   43   91:monitorexit     
		return;
	//   44   92:return          
		obj;
	//   45   93:astore          5
	//*  46   95:aload           4
		throw obj;
	//   47   97:monitorexit     
	//   48   98:aload           5
	//   49  100:athrow          
	}

	public void a(Runnable runnable)
	{
		if(runnable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("r must not be null");
	//    2    4:new             #192 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #209 <String "r must not be null">
	//    5   10:invokespecial   #197 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    7   14:invokestatic    #76  <Method m$j m.e()>
	//    8   17:astore_2        
		m$j1;
	//    9   18:aload_2         
		JVM INSTR monitorenter ;
	//   10   19:monitorenter    
		q.add(((Object) (runnable)));
	//   11   20:aload_0         
	//   12   21:getfield        #43  <Field ArrayList q>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
	//   15   28:pop             
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//   16   29:invokestatic    #76  <Method m$j m.e()>
	//   17   32:invokevirtual   #112 <Method void Object.notifyAll()>
		m$j1;
	//   18   35:aload_2         
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return;
	//   20   37:return          
		runnable;
	//   21   38:astore_1        
	//*  22   39:aload_2         
		throw runnable;
	//   23   40:monitorexit     
	//   24   41:aload_1         
	//   25   42:athrow          
	}

	public boolean a()
	{
		return h && i && m();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean h>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field boolean i>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokespecial   #137 <Method boolean m()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int b()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i1 = n;
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field int n>
	//    6   10:istore_1        
		m$j1;
	//    7   11:aload_2         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return i1;
	//    9   13:iload_1         
	//   10   14:ireturn         
		Exception exception;
		exception;
	//   11   15:astore_3        
	//*  12   16:aload_2         
		throw exception;
	//   13   17:monitorexit     
	//   14   18:aload_3         
	//   15   19:athrow          
	}

	public void c()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_1        
		m$j1;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		o = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #51  <Field boolean o>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//    7   11:invokestatic    #76  <Method m$j m.e()>
	//    8   14:invokevirtual   #112 <Method void Object.notifyAll()>
		m$j1;
	//    9   17:aload_1         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		Exception exception;
		exception;
	//   12   20:astore_2        
	//*  13   21:aload_1         
		throw exception;
	//   14   22:monitorexit     
	//   15   23:aload_2         
	//   16   24:athrow          
	}

	public void d()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		e = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #129 <Field boolean e>
		j = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #151 <Field boolean j>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//   10   16:invokestatic    #76  <Method m$j m.e()>
	//   11   19:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag;
		if(!g || j)
			break MISSING_BLOCK_LABEL_64;
	//   12   22:aload_0         
	//   13   23:getfield        #131 <Field boolean g>
	//   14   26:ifeq            64
	//   15   29:aload_0         
	//   16   30:getfield        #151 <Field boolean j>
	//   17   33:ifne            64
		flag = b;
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field boolean b>
	//   20   40:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_64;
	//   21   41:iload_1         
	//   22   42:ifne            64
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   23   45:invokestatic    #76  <Method m$j m.e()>
	//   24   48:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  25   51:goto            22
		Object obj;
		obj;
	//   26   54:astore_3        
		Thread.currentThread().interrupt();
	//   27   55:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   28   58:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  29   61:goto            22
		m$j1;
	//   30   64:aload_2         
		JVM INSTR monitorexit ;
	//   31   65:monitorexit     
		return;
	//   32   66:return          
		obj;
	//   33   67:astore_3        
	//*  34   68:aload_2         
		throw obj;
	//   35   69:monitorexit     
	//   36   70:aload_3         
	//   37   71:athrow          
	}

	public void e()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		e = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #129 <Field boolean e>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//    7   11:invokestatic    #76  <Method m$j m.e()>
	//    8   14:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag;
		if(g)
			break MISSING_BLOCK_LABEL_52;
	//    9   17:aload_0         
	//   10   18:getfield        #131 <Field boolean g>
	//   11   21:ifne            52
		flag = b;
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field boolean b>
	//   14   28:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_52;
	//   15   29:iload_1         
	//   16   30:ifne            52
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   17   33:invokestatic    #76  <Method m$j m.e()>
	//   18   36:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  19   39:goto            17
		Object obj;
		obj;
	//   20   42:astore_3        
		Thread.currentThread().interrupt();
	//   21   43:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   22   46:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  23   49:goto            17
		m$j1;
	//   24   52:aload_2         
		JVM INSTR monitorexit ;
	//   25   53:monitorexit     
		return;
	//   26   54:return          
		obj;
	//   27   55:astore_3        
	//*  28   56:aload_2         
		throw obj;
	//   29   57:monitorexit     
	//   30   58:aload_3         
	//   31   59:athrow          
	}

	public void f()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		c = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #107 <Field boolean c>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//    7   11:invokestatic    #76  <Method m$j m.e()>
	//    8   14:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag;
		if(b)
			break MISSING_BLOCK_LABEL_52;
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field boolean b>
	//   11   21:ifne            52
		flag = d;
	//   12   24:aload_0         
	//   13   25:getfield        #105 <Field boolean d>
	//   14   28:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_52;
	//   15   29:iload_1         
	//   16   30:ifne            52
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   17   33:invokestatic    #76  <Method m$j m.e()>
	//   18   36:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  19   39:goto            17
		Object obj;
		obj;
	//   20   42:astore_3        
		Thread.currentThread().interrupt();
	//   21   43:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   22   46:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  23   49:goto            17
		m$j1;
	//   24   52:aload_2         
		JVM INSTR monitorexit ;
	//   25   53:monitorexit     
		return;
	//   26   54:return          
		obj;
	//   27   55:astore_3        
	//*  28   56:aload_2         
		throw obj;
	//   29   57:monitorexit     
	//   30   58:aload_3         
	//   31   59:athrow          
	}

	public void g()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		c = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #107 <Field boolean c>
		o = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #51  <Field boolean o>
		p = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #135 <Field boolean p>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//   13   21:invokestatic    #76  <Method m$j m.e()>
	//   14   24:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag;
		if(b || !d)
			break MISSING_BLOCK_LABEL_69;
	//   15   27:aload_0         
	//   16   28:getfield        #61  <Field boolean b>
	//   17   31:ifne            69
	//   18   34:aload_0         
	//   19   35:getfield        #105 <Field boolean d>
	//   20   38:ifeq            69
		flag = p;
	//   21   41:aload_0         
	//   22   42:getfield        #135 <Field boolean p>
	//   23   45:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_69;
	//   24   46:iload_1         
	//   25   47:ifne            69
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   26   50:invokestatic    #76  <Method m$j m.e()>
	//   27   53:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  28   56:goto            27
		Object obj;
		obj;
	//   29   59:astore_3        
		Thread.currentThread().interrupt();
	//   30   60:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   31   63:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  32   66:goto            27
		m$j1;
	//   33   69:aload_2         
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return;
	//   35   71:return          
		obj;
	//   36   72:astore_3        
	//*  37   73:aload_2         
		throw obj;
	//   38   74:monitorexit     
	//   39   75:aload_3         
	//   40   76:athrow          
	}

	public void h()
	{
		m$j m$j1 = com.amap.api.mapcore.util.m.e();
	//    0    0:invokestatic    #76  <Method m$j m.e()>
	//    1    3:astore_2        
		m$j1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		a = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #89  <Field boolean a>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//    7   11:invokestatic    #76  <Method m$j m.e()>
	//    8   14:invokevirtual   #112 <Method void Object.notifyAll()>
_L1:
		boolean flag = b;
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field boolean b>
	//   11   21:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_45;
	//   12   22:iload_1         
	//   13   23:ifne            45
		((Object) (com.amap.api.mapcore.util.m.e())).wait();
	//   14   26:invokestatic    #76  <Method m$j m.e()>
	//   15   29:invokevirtual   #145 <Method void Object.wait()>
		  goto _L1
	//*  16   32:goto            17
		Object obj;
		obj;
	//   17   35:astore_3        
		Thread.currentThread().interrupt();
	//   18   36:invokestatic    #203 <Method Thread Thread.currentThread()>
	//   19   39:invokevirtual   #206 <Method void Thread.interrupt()>
		  goto _L1
	//*  20   42:goto            17
		m$j1;
	//   21   45:aload_2         
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		obj;
	//   24   48:astore_3        
	//*  25   49:aload_2         
		throw obj;
	//   26   50:monitorexit     
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void i()
	{
		k = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #114 <Field boolean k>
		((Object) (com.amap.api.mapcore.util.m.e())).notifyAll();
	//    3    5:invokestatic    #76  <Method m$j m.e()>
	//    4    8:invokevirtual   #112 <Method void Object.notifyAll()>
	//    5   11:return          
	}

	public void run()
	{
		setName((new StringBuilder()).append("GLThread ").append(getId()).toString());
	//    0    0:aload_0         
	//    1    1:new             #215 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #216 <Method void StringBuilder()>
	//    4    8:ldc1            #218 <String "GLThread ">
	//    5   10:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #226 <Method long getId()>
	//    8   17:invokevirtual   #229 <Method StringBuilder StringBuilder.append(long)>
	//    9   20:invokevirtual   #233 <Method String StringBuilder.toString()>
	//   10   23:invokevirtual   #236 <Method void setName(String)>
		try
		{
			l();
	//   11   26:aload_0         
	//   12   27:invokespecial   #238 <Method void l()>
		}
	//*  13   30:invokestatic    #76  <Method m$j m.e()>
	//*  14   33:aload_0         
	//*  15   34:invokevirtual   #240 <Method void m$j.a(m$i)>
	//*  16   37:return          
		catch(InterruptedException interruptedexception)
	//*  17   38:astore_1        
		{
			com.amap.api.mapcore.util.m.e().a(this);
	//   18   39:invokestatic    #76  <Method m$j m.e()>
	//   19   42:aload_0         
	//   20   43:invokevirtual   #240 <Method void m$j.a(m$i)>
			return;
	//   21   46:return          
		}
		com.amap.api.mapcore.util.m.e().a(this);
		return;
		Exception exception;
		exception;
	//   22   47:astore_1        
		com.amap.api.mapcore.util.m.e().a(this);
	//   23   48:invokestatic    #76  <Method m$j m.e()>
	//   24   51:aload_0         
	//   25   52:invokevirtual   #240 <Method void m$j.a(m$i)>
		throw exception;
	//   26   55:aload_1         
	//   27   56:athrow          
	}

	private boolean a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private int l;
	private int m;
	private int n;
	private boolean o;
	private boolean p;
	private ArrayList q;
	private boolean r;
	private m$h s;
	private WeakReference t;

	m$i(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Thread()>
		q = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #40  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void ArrayList()>
	//    6   12:putfield        #43  <Field ArrayList q>
		r = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #45  <Field boolean r>
		l = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #47  <Field int l>
		m = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #49  <Field int m>
		o = true;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #51  <Field boolean o>
		n = 1;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #53  <Field int n>
		t = weakreference;
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #55  <Field WeakReference t>
	//   25   45:return          
	}
}
