// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.view.MotionEvent;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.amap.mapcore.message.RotateGestureMapMessage;
import com.autonavi.amap.mapcore.message.ScaleGestureMapMessage;

// Referenced classes of package com.amap.api.mapcore.util:
//			o, as, s, v, 
//			hm

class o$d extends 
{

	public boolean a(as as1)
	{
		float f1;
		float f2;
		float f3;
		float f4;
		int k;
		int l;
		int i1;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		j.mGestureState = 2;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    2    4:iconst_2        
	//    3    5:putfield        #64  <Field int EAMapPlatformGestureInfo.mGestureState>
		j.mGestureType = 4;
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    6   12:iconst_4        
	//    7   13:putfield        #67  <Field int EAMapPlatformGestureInfo.mGestureType>
		j.mLocation = (new float[] {
			as1.a().getX(), as1.a().getY()
		});
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   10   20:iconst_2        
	//   11   21:newarray        float[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #72  <Method MotionEvent as.a()>
	//   16   29:invokevirtual   #78  <Method float MotionEvent.getX()>
	//   17   32:fastore         
	//   18   33:dup             
	//   19   34:iconst_1        
	//   20   35:aload_1         
	//   21   36:invokevirtual   #72  <Method MotionEvent as.a()>
	//   22   39:invokevirtual   #81  <Method float MotionEvent.getY()>
	//   23   42:fastore         
	//   24   43:putfield        #84  <Field float[] EAMapPlatformGestureInfo.mLocation>
		k = a.a.a(j);
	//   25   46:aload_0         
	//   26   47:getfield        #26  <Field o a>
	//   27   50:getfield        #87  <Field s o.a>
	//   28   53:aload_0         
	//   29   54:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   30   57:invokeinterface #92  <Method int s.a(EAMapPlatformGestureInfo)>
	//   31   62:istore          8
		flag4 = false;
	//   32   64:iconst_0        
	//   33   65:istore          14
		flag3 = false;
	//   34   67:iconst_0        
	//   35   68:istore          13
		f4 = as1.j();
	//   36   70:aload_1         
	//   37   71:invokevirtual   #94  <Method float as.j()>
	//   38   74:fstore          5
		f1 = as1.k();
	//   39   76:aload_1         
	//   40   77:invokevirtual   #98  <Method long as.k()>
	//   41   80:l2f             
	//   42   81:fstore_2        
		l = (int)as1.b();
	//   43   82:aload_1         
	//   44   83:invokevirtual   #100 <Method float as.b()>
	//   45   86:f2i             
	//   46   87:istore          9
		i1 = (int)as1.c();
	//   47   89:aload_1         
	//   48   90:invokevirtual   #102 <Method float as.c()>
	//   49   93:f2i             
	//   50   94:istore          10
		f2 = Math.abs(l - e.x);
	//   51   96:iload           9
	//   52   98:aload_0         
	//   53   99:getfield        #40  <Field Point e>
	//   54  102:getfield        #105 <Field int Point.x>
	//   55  105:isub            
	//   56  106:invokestatic    #111 <Method int Math.abs(int)>
	//   57  109:i2f             
	//   58  110:fstore_3        
		f3 = Math.abs(i1 - e.y);
	//   59  111:iload           10
	//   60  113:aload_0         
	//   61  114:getfield        #40  <Field Point e>
	//   62  117:getfield        #114 <Field int Point.y>
	//   63  120:isub            
	//   64  121:invokestatic    #111 <Method int Math.abs(int)>
	//   65  124:i2f             
	//   66  125:fstore          4
		e.x = l;
	//   67  127:aload_0         
	//   68  128:getfield        #40  <Field Point e>
	//   69  131:iload           9
	//   70  133:putfield        #105 <Field int Point.x>
		e.y = i1;
	//   71  136:aload_0         
	//   72  137:getfield        #40  <Field Point e>
	//   73  140:iload           10
	//   74  142:putfield        #114 <Field int Point.y>
		f4 = (float)Math.log(f4);
	//   75  145:fload           5
	//   76  147:f2d             
	//   77  148:invokestatic    #118 <Method double Math.log(double)>
	//   78  151:d2f             
	//   79  152:fstore          5
		if(o.b(a) <= 0 && Math.abs(f4) > 0.2F)
	//*  80  154:aload_0         
	//*  81  155:getfield        #26  <Field o a>
	//*  82  158:invokestatic    #121 <Method int o.b(o)>
	//*  83  161:ifgt            180
	//*  84  164:fload           5
	//*  85  166:invokestatic    #124 <Method float Math.abs(float)>
	//*  86  169:ldc1            #125 <Float 0.2F>
	//*  87  171:fcmpl           
	//*  88  172:ifle            180
			d = true;
	//   89  175:aload_0         
	//   90  176:iconst_1        
	//   91  177:putfield        #35  <Field boolean d>
		flag1 = flag3;
	//   92  180:iload           13
	//   93  182:istore          11
		flag2 = flag4;
	//   94  184:iload           14
	//   95  186:istore          12
		if(!a.a.h().isZoomGesturesEnabled()) goto _L2; else goto _L1
	//   96  188:aload_0         
	//   97  189:getfield        #26  <Field o a>
	//   98  192:getfield        #87  <Field s o.a>
	//   99  195:invokeinterface #128 <Method v s.h()>
	//  100  200:invokeinterface #134 <Method boolean v.isZoomGesturesEnabled()>
	//  101  205:ifeq            470
_L1:
		flag2 = flag4;
	//  102  208:iload           14
	//  103  210:istore          12
		if(b)
			break MISSING_BLOCK_LABEL_243;
	//  104  212:aload_0         
	//  105  213:getfield        #31  <Field boolean b>
	//  106  216:ifne            243
		flag2 = flag4;
	//  107  219:iload           14
	//  108  221:istore          12
		if(0.06F >= Math.abs(f4))
			break MISSING_BLOCK_LABEL_243;
	//  109  223:ldc1            #135 <Float 0.06F>
	//  110  225:fload           5
	//  111  227:invokestatic    #124 <Method float Math.abs(float)>
	//  112  230:fcmpg           
	//  113  231:ifge            243
		flag2 = flag4;
	//  114  234:iload           14
	//  115  236:istore          12
		b = true;
	//  116  238:aload_0         
	//  117  239:iconst_1        
	//  118  240:putfield        #31  <Field boolean b>
		flag1 = flag3;
	//  119  243:iload           13
	//  120  245:istore          11
		flag2 = flag4;
	//  121  247:iload           14
	//  122  249:istore          12
		if(!b) goto _L2; else goto _L3
	//  123  251:aload_0         
	//  124  252:getfield        #31  <Field boolean b>
	//  125  255:ifeq            470
_L3:
		flag1 = flag3;
	//  126  258:iload           13
	//  127  260:istore          11
		flag2 = flag4;
	//  128  262:iload           14
	//  129  264:istore          12
		if(0.01F >= Math.abs(f4)) goto _L2; else goto _L4
	//  130  266:ldc1            #136 <Float 0.01F>
	//  131  268:fload           5
	//  132  270:invokestatic    #124 <Method float Math.abs(float)>
	//  133  273:fcmpg           
	//  134  274:ifge            470
_L4:
		flag4 = true;
	//  135  277:iconst_1        
	//  136  278:istore          14
		flag3 = true;
	//  137  280:iconst_1        
	//  138  281:istore          13
		if(f2 <= 2.0F && f3 <= 2.0F) goto _L6; else goto _L5
	//  139  283:fload_3         
	//  140  284:fconst_2        
	//  141  285:fcmpl           
	//  142  286:ifgt            296
	//  143  289:fload           4
	//  144  291:fconst_2        
	//  145  292:fcmpl           
	//  146  293:ifle            800
_L5:
		flag2 = flag4;
	//  147  296:iload           14
	//  148  298:istore          12
		if(Math.abs(f4) >= 0.02F) goto _L6; else goto _L7
	//  149  300:fload           5
	//  150  302:invokestatic    #124 <Method float Math.abs(float)>
	//  151  305:ldc1            #137 <Float 0.02F>
	//  152  307:fcmpg           
	//  153  308:ifge            800
_L7:
		boolean flag = true;
	//  154  311:iconst_1        
	//  155  312:istore          7
		  goto _L8
	//* 156  314:goto            803
_L23:
		flag1 = flag3;
	//  157  317:iload           13
	//  158  319:istore          11
		if(f1 <= 0.0F) goto _L2; else goto _L9
	//  159  321:fload_2         
	//  160  322:fconst_0        
	//  161  323:fcmpl           
	//  162  324:ifle            470
_L9:
		flag2 = flag4;
	//  163  327:iload           14
	//  164  329:istore          12
		g = f4 / f1;
	//  165  331:aload_0         
	//  166  332:fload           5
	//  167  334:fload_2         
	//  168  335:fdiv            
	//  169  336:putfield        #44  <Field float g>
		flag2 = flag4;
	//  170  339:iload           14
	//  171  341:istore          12
		float f6 = Math.abs(g);
	//  172  343:aload_0         
	//  173  344:getfield        #44  <Field float g>
	//  174  347:invokestatic    #124 <Method float Math.abs(float)>
	//  175  350:fstore          6
		flag2 = flag4;
	//  176  352:iload           14
	//  177  354:istore          12
		f[o.b(a) % 10] = f6;
	//  178  356:aload_0         
	//  179  357:getfield        #42  <Field float[] f>
	//  180  360:aload_0         
	//  181  361:getfield        #26  <Field o a>
	//  182  364:invokestatic    #121 <Method int o.b(o)>
	//  183  367:bipush          10
	//  184  369:irem            
	//  185  370:fload           6
	//  186  372:fastore         
		flag2 = flag4;
	//  187  373:iload           14
	//  188  375:istore          12
		o.g(a);
	//  189  377:aload_0         
	//  190  378:getfield        #26  <Field o a>
	//  191  381:invokestatic    #139 <Method int o.g(o)>
	//  192  384:pop             
		flag2 = flag4;
	//  193  385:iload           14
	//  194  387:istore          12
		a.a.a(k, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (ScaleGestureMapMessage.obtain(101, f4, l, i1))));
	//  195  389:aload_0         
	//  196  390:getfield        #26  <Field o a>
	//  197  393:getfield        #87  <Field s o.a>
	//  198  396:iload           8
	//  199  398:bipush          101
	//  200  400:fload           5
	//  201  402:iload           9
	//  202  404:iload           10
	//  203  406:invokestatic    #145 <Method ScaleGestureMapMessage ScaleGestureMapMessage.obtain(int, float, int, int)>
	//  204  409:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
		if(f4 <= 0.0F) goto _L11; else goto _L10
	//  205  414:fload           5
	//  206  416:fconst_0        
	//  207  417:fcmpl           
	//  208  418:ifle            447
_L10:
		flag2 = flag4;
	//  209  421:iload           14
	//  210  423:istore          12
		a.a.a(k, 1);
	//  211  425:aload_0         
	//  212  426:getfield        #26  <Field o a>
	//  213  429:getfield        #87  <Field s o.a>
	//  214  432:iload           8
	//  215  434:iconst_1        
	//  216  435:invokeinterface #151 <Method void s.a(int, int)>
		flag1 = flag3;
	//  217  440:iload           13
	//  218  442:istore          11
		  goto _L2
	//* 219  444:goto            470
_L11:
		flag2 = flag4;
	//  220  447:iload           14
	//  221  449:istore          12
		a.a.a(k, 2);
	//  222  451:aload_0         
	//  223  452:getfield        #26  <Field o a>
	//  224  455:getfield        #87  <Field s o.a>
	//  225  458:iload           8
	//  226  460:iconst_2        
	//  227  461:invokeinterface #151 <Method void s.a(int, int)>
		flag1 = flag3;
	//  228  466:iload           13
	//  229  468:istore          11
		  goto _L2
	//* 230  470:goto            493
		Throwable throwable;
		throwable;
	//  231  473:astore          15
		hm.c(throwable, "GLMapGestrureDetector", "onScaleRotate");
	//  232  475:aload           15
	//  233  477:ldc1            #153 <String "GLMapGestrureDetector">
	//  234  479:ldc1            #155 <String "onScaleRotate">
	//  235  481:invokestatic    #160 <Method void hm.c(Throwable, String, String)>
		throwable.printStackTrace();
	//  236  484:aload           15
	//  237  486:invokevirtual   #163 <Method void Throwable.printStackTrace()>
		flag1 = flag2;
	//  238  489:iload           12
	//  239  491:istore          11
_L2:
		flag3 = flag1;
	//  240  493:iload           11
	//  241  495:istore          13
		flag2 = flag1;
	//  242  497:iload           11
	//  243  499:istore          12
		if(!a.a.h().isRotateGesturesEnabled()) goto _L13; else goto _L12
	//  244  501:aload_0         
	//  245  502:getfield        #26  <Field o a>
	//  246  505:getfield        #87  <Field s o.a>
	//  247  508:invokeinterface #128 <Method v s.h()>
	//  248  513:invokeinterface #166 <Method boolean v.isRotateGesturesEnabled()>
	//  249  518:ifeq            781
_L12:
		flag3 = flag1;
	//  250  521:iload           11
	//  251  523:istore          13
		flag2 = flag1;
	//  252  525:iload           11
	//  253  527:istore          12
		if(a.a.e(k)) goto _L13; else goto _L14
	//  254  529:aload_0         
	//  255  530:getfield        #26  <Field o a>
	//  256  533:getfield        #87  <Field s o.a>
	//  257  536:iload           8
	//  258  538:invokeinterface #169 <Method boolean s.e(int)>
	//  259  543:ifne            781
_L14:
		flag3 = flag1;
	//  260  546:iload           11
	//  261  548:istore          13
		flag2 = flag1;
	//  262  550:iload           11
	//  263  552:istore          12
		if(d) goto _L13; else goto _L15
	//  264  554:aload_0         
	//  265  555:getfield        #35  <Field boolean d>
	//  266  558:ifne            781
_L15:
		flag2 = flag1;
	//  267  561:iload           11
	//  268  563:istore          12
		float f5;
		try
		{
			f5 = as1.l();
	//  269  565:aload_1         
	//  270  566:invokevirtual   #172 <Method float as.l()>
	//  271  569:fstore          5
		}
	//* 272  571:iload           11
	//* 273  573:istore          12
	//* 274  575:aload_0         
	//* 275  576:getfield        #33  <Field boolean c>
	//* 276  579:ifne            606
	//* 277  582:iload           11
	//* 278  584:istore          12
	//* 279  586:fload           5
	//* 280  588:invokestatic    #124 <Method float Math.abs(float)>
	//* 281  591:ldc1            #173 <Float 4F>
	//* 282  593:fcmpl           
	//* 283  594:iflt            606
	//* 284  597:iload           11
	//* 285  599:istore          12
	//* 286  601:aload_0         
	//* 287  602:iconst_1        
	//* 288  603:putfield        #33  <Field boolean c>
	//* 289  606:iload           11
	//* 290  608:istore          13
	//* 291  610:iload           11
	//* 292  612:istore          12
	//* 293  614:aload_0         
	//* 294  615:getfield        #33  <Field boolean c>
	//* 295  618:ifeq            781
	//* 296  621:iload           11
	//* 297  623:istore          13
	//* 298  625:iload           11
	//* 299  627:istore          12
	//* 300  629:fconst_1        
	//* 301  630:fload           5
	//* 302  632:invokestatic    #124 <Method float Math.abs(float)>
	//* 303  635:fcmpg           
	//* 304  636:ifge            781
	//* 305  639:fload_3         
	//* 306  640:ldc1            #173 <Float 4F>
	//* 307  642:fcmpl           
	//* 308  643:ifgt            654
	//* 309  646:fload           4
	//* 310  648:ldc1            #173 <Float 4F>
	//* 311  650:fcmpl           
	//* 312  651:ifle            815
	//* 313  654:iload           11
	//* 314  656:istore          12
	//* 315  658:fload           5
	//* 316  660:invokestatic    #124 <Method float Math.abs(float)>
	//* 317  663:fconst_2        
	//* 318  664:fcmpg           
	//* 319  665:ifge            815
	//* 320  668:iconst_1        
	//* 321  669:istore          7
	//* 322  671:goto            818
	//* 323  674:iload           11
	//* 324  676:istore          12
	//* 325  678:aload_0         
	//* 326  679:fload           5
	//* 327  681:fload_2         
	//* 328  682:fdiv            
	//* 329  683:putfield        #48  <Field float i>
	//* 330  686:iload           11
	//* 331  688:istore          12
	//* 332  690:aload_0         
	//* 333  691:getfield        #48  <Field float i>
	//* 334  694:invokestatic    #124 <Method float Math.abs(float)>
	//* 335  697:fstore_2        
	//* 336  698:iload           11
	//* 337  700:istore          12
	//* 338  702:aload_0         
	//* 339  703:getfield        #46  <Field float[] h>
	//* 340  706:aload_0         
	//* 341  707:getfield        #26  <Field o a>
	//* 342  710:invokestatic    #175 <Method int o.c(o)>
	//* 343  713:bipush          10
	//* 344  715:irem            
	//* 345  716:fload_2         
	//* 346  717:fastore         
	//* 347  718:iload           11
	//* 348  720:istore          12
	//* 349  722:aload_0         
	//* 350  723:getfield        #26  <Field o a>
	//* 351  726:invokestatic    #177 <Method int o.h(o)>
	//* 352  729:pop             
	//* 353  730:iload           11
	//* 354  732:istore          12
	//* 355  734:aload_0         
	//* 356  735:getfield        #26  <Field o a>
	//* 357  738:getfield        #87  <Field s o.a>
	//* 358  741:iload           8
	//* 359  743:bipush          101
	//* 360  745:fload           5
	//* 361  747:iload           9
	//* 362  749:iload           10
	//* 363  751:invokestatic    #182 <Method RotateGestureMapMessage RotateGestureMapMessage.obtain(int, float, int, int)>
	//* 364  754:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
	//* 365  759:iconst_1        
	//* 366  760:istore          12
	//* 367  762:iconst_1        
	//* 368  763:istore          13
	//* 369  765:aload_0         
	//* 370  766:getfield        #26  <Field o a>
	//* 371  769:getfield        #87  <Field s o.a>
	//* 372  772:iload           8
	//* 373  774:bipush          6
	//* 374  776:invokeinterface #151 <Method void s.a(int, int)>
	//* 375  781:iload           13
	//* 376  783:ireturn         
		// Misplaced declaration of an exception variable
		catch(as as1)
	//* 377  784:astore_1        
		{
			hm.c(((Throwable) (as1)), "GLMapGestrureDetector", "onScaleRotate");
	//  378  785:aload_1         
	//  379  786:ldc1            #153 <String "GLMapGestrureDetector">
	//  380  788:ldc1            #155 <String "onScaleRotate">
	//  381  790:invokestatic    #160 <Method void hm.c(Throwable, String, String)>
			((Throwable) (as1)).printStackTrace();
	//  382  793:aload_1         
	//  383  794:invokevirtual   #163 <Method void Throwable.printStackTrace()>
			return flag2;
	//  384  797:iload           12
	//  385  799:ireturn         
		}
		flag2 = flag1;
		if(c)
			break MISSING_BLOCK_LABEL_606;
		flag2 = flag1;
		if(Math.abs(f5) < 4F)
			break MISSING_BLOCK_LABEL_606;
		flag2 = flag1;
		c = true;
		flag3 = flag1;
		flag2 = flag1;
		if(!c) goto _L13; else goto _L16
_L16:
		flag3 = flag1;
		flag2 = flag1;
		if(1.0F >= Math.abs(f5)) goto _L13; else goto _L17
_L17:
		if(f2 <= 4F && f3 <= 4F) goto _L19; else goto _L18
_L18:
		flag2 = flag1;
		if(Math.abs(f5) >= 2.0F) goto _L19; else goto _L20
_L20:
		flag = true;
		  goto _L21
_L25:
		flag2 = flag1;
		i = f5 / f1;
		flag2 = flag1;
		f1 = Math.abs(i);
		flag2 = flag1;
		h[o.c(a) % 10] = f1;
		flag2 = flag1;
		o.h(a);
		flag2 = flag1;
		a.a.a(k, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (RotateGestureMapMessage.obtain(101, f5, l, i1))));
		flag2 = true;
		flag3 = true;
		a.a.a(k, 6);
_L13:
		return flag3;
_L6:
		flag = false;
	//  386  800:iconst_0        
	//  387  801:istore          7
_L8:
		if(!flag) goto _L23; else goto _L22
	//  388  803:iload           7
	//  389  805:ifeq            317
_L22:
		flag1 = flag3;
	//  390  808:iload           13
	//  391  810:istore          11
		  goto _L2
	//* 392  812:goto            470
_L19:
		flag = false;
	//  393  815:iconst_0        
	//  394  816:istore          7
_L21:
		if(!flag) goto _L25; else goto _L24
	//  395  818:iload           7
	//  396  820:ifeq            674
_L24:
		return flag1;
	//  397  823:iload           11
	//  398  825:ireturn         
		  goto _L2
	}

	public boolean b(as as1)
	{
		j.mGestureState = 1;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    2    4:iconst_1        
	//    3    5:putfield        #64  <Field int EAMapPlatformGestureInfo.mGestureState>
		j.mGestureType = 4;
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    6   12:iconst_4        
	//    7   13:putfield        #67  <Field int EAMapPlatformGestureInfo.mGestureType>
		j.mLocation = (new float[] {
			as1.a().getX(), as1.a().getY()
		});
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   10   20:iconst_2        
	//   11   21:newarray        float[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #72  <Method MotionEvent as.a()>
	//   16   29:invokevirtual   #78  <Method float MotionEvent.getX()>
	//   17   32:fastore         
	//   18   33:dup             
	//   19   34:iconst_1        
	//   20   35:aload_1         
	//   21   36:invokevirtual   #72  <Method MotionEvent as.a()>
	//   22   39:invokevirtual   #81  <Method float MotionEvent.getY()>
	//   23   42:fastore         
	//   24   43:putfield        #84  <Field float[] EAMapPlatformGestureInfo.mLocation>
		int k = a.a.a(j);
	//   25   46:aload_0         
	//   26   47:getfield        #26  <Field o a>
	//   27   50:getfield        #87  <Field s o.a>
	//   28   53:aload_0         
	//   29   54:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   30   57:invokeinterface #92  <Method int s.a(EAMapPlatformGestureInfo)>
	//   31   62:istore_2        
		int l = (int)as1.b();
	//   32   63:aload_1         
	//   33   64:invokevirtual   #100 <Method float as.b()>
	//   34   67:f2i             
	//   35   68:istore_3        
		int i1 = (int)as1.c();
	//   36   69:aload_1         
	//   37   70:invokevirtual   #102 <Method float as.c()>
	//   38   73:f2i             
	//   39   74:istore          4
		d = false;
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:putfield        #35  <Field boolean d>
		e.x = l;
	//   43   81:aload_0         
	//   44   82:getfield        #40  <Field Point e>
	//   45   85:iload_3         
	//   46   86:putfield        #105 <Field int Point.x>
		e.y = i1;
	//   47   89:aload_0         
	//   48   90:getfield        #40  <Field Point e>
	//   49   93:iload           4
	//   50   95:putfield        #114 <Field int Point.y>
		b = false;
	//   51   98:aload_0         
	//   52   99:iconst_0        
	//   53  100:putfield        #31  <Field boolean b>
		c = false;
	//   54  103:aload_0         
	//   55  104:iconst_0        
	//   56  105:putfield        #33  <Field boolean c>
		a.a.a(k, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (ScaleGestureMapMessage.obtain(100, 1.0F, l, i1))));
	//   57  108:aload_0         
	//   58  109:getfield        #26  <Field o a>
	//   59  112:getfield        #87  <Field s o.a>
	//   60  115:iload_2         
	//   61  116:bipush          100
	//   62  118:fconst_1        
	//   63  119:iload_3         
	//   64  120:iload           4
	//   65  122:invokestatic    #145 <Method ScaleGestureMapMessage ScaleGestureMapMessage.obtain(int, float, int, int)>
	//   66  125:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
		try
		{
			if(a.a.h().isRotateGesturesEnabled() && !a.a.e(k))
	//*  67  130:aload_0         
	//*  68  131:getfield        #26  <Field o a>
	//*  69  134:getfield        #87  <Field s o.a>
	//*  70  137:invokeinterface #128 <Method v s.h()>
	//*  71  142:invokeinterface #166 <Method boolean v.isRotateGesturesEnabled()>
	//*  72  147:ifeq            200
	//*  73  150:aload_0         
	//*  74  151:getfield        #26  <Field o a>
	//*  75  154:getfield        #87  <Field s o.a>
	//*  76  157:iload_2         
	//*  77  158:invokeinterface #169 <Method boolean s.e(int)>
	//*  78  163:ifne            200
				a.a.a(k, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (RotateGestureMapMessage.obtain(100, a.a.n(k), l, i1))));
	//   79  166:aload_0         
	//   80  167:getfield        #26  <Field o a>
	//   81  170:getfield        #87  <Field s o.a>
	//   82  173:iload_2         
	//   83  174:bipush          100
	//   84  176:aload_0         
	//   85  177:getfield        #26  <Field o a>
	//   86  180:getfield        #87  <Field s o.a>
	//   87  183:iload_2         
	//   88  184:invokeinterface #186 <Method float s.n(int)>
	//   89  189:iload_3         
	//   90  190:iload           4
	//   91  192:invokestatic    #182 <Method RotateGestureMapMessage RotateGestureMapMessage.obtain(int, float, int, int)>
	//   92  195:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
		}
	//*  93  200:goto            216
		// Misplaced declaration of an exception variable
		catch(as as1)
	//*  94  203:astore_1        
		{
			hm.c(((Throwable) (as1)), "GLMapGestrureDetector", "onScaleRotateBegin");
	//   95  204:aload_1         
	//   96  205:ldc1            #153 <String "GLMapGestrureDetector">
	//   97  207:ldc1            #188 <String "onScaleRotateBegin">
	//   98  209:invokestatic    #160 <Method void hm.c(Throwable, String, String)>
			((Throwable) (as1)).printStackTrace();
	//   99  212:aload_1         
	//  100  213:invokevirtual   #163 <Method void Throwable.printStackTrace()>
		}
		return true;
	//  101  216:iconst_1        
	//  102  217:ireturn         
	}

	public void c(as as1)
	{
		j.mGestureState = 3;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    2    4:iconst_3        
	//    3    5:putfield        #64  <Field int EAMapPlatformGestureInfo.mGestureState>
		j.mGestureType = 4;
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//    6   12:iconst_4        
	//    7   13:putfield        #67  <Field int EAMapPlatformGestureInfo.mGestureType>
		j.mLocation = (new float[] {
			as1.a().getX(), as1.a().getY()
		});
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   10   20:iconst_2        
	//   11   21:newarray        float[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #72  <Method MotionEvent as.a()>
	//   16   29:invokevirtual   #78  <Method float MotionEvent.getX()>
	//   17   32:fastore         
	//   18   33:dup             
	//   19   34:iconst_1        
	//   20   35:aload_1         
	//   21   36:invokevirtual   #72  <Method MotionEvent as.a()>
	//   22   39:invokevirtual   #81  <Method float MotionEvent.getY()>
	//   23   42:fastore         
	//   24   43:putfield        #84  <Field float[] EAMapPlatformGestureInfo.mLocation>
		int l1 = a.a.a(j);
	//   25   46:aload_0         
	//   26   47:getfield        #26  <Field o a>
	//   27   50:getfield        #87  <Field s o.a>
	//   28   53:aload_0         
	//   29   54:getfield        #53  <Field EAMapPlatformGestureInfo j>
	//   30   57:invokeinterface #92  <Method int s.a(EAMapPlatformGestureInfo)>
	//   31   62:istore          8
		d = false;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #35  <Field boolean d>
		a.a.a(l1, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (ScaleGestureMapMessage.obtain(102, 1.0F, 0, 0))));
	//   35   69:aload_0         
	//   36   70:getfield        #26  <Field o a>
	//   37   73:getfield        #87  <Field s o.a>
	//   38   76:iload           8
	//   39   78:bipush          102
	//   40   80:fconst_1        
	//   41   81:iconst_0        
	//   42   82:iconst_0        
	//   43   83:invokestatic    #145 <Method ScaleGestureMapMessage ScaleGestureMapMessage.obtain(int, float, int, int)>
	//   44   86:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
		float f1 = -9999F;
	//   45   91:ldc1            #190 <Float -9999F>
	//   46   93:fstore_2        
		float f2 = -9999F;
	//   47   94:ldc1            #190 <Float -9999F>
	//   48   96:fstore_3        
		float f4 = f1;
	//   49   97:fload_2         
	//   50   98:fstore          4
		if(o.b(a) > 0)
	//*  51  100:aload_0         
	//*  52  101:getfield        #26  <Field o a>
	//*  53  104:invokestatic    #121 <Method int o.b(o)>
	//*  54  107:ifle            259
		{
			f4 = 0.0F;
	//   55  110:fconst_0        
	//   56  111:fstore          4
			int k;
			if(o.b(a) > 10)
	//*  57  113:aload_0         
	//*  58  114:getfield        #26  <Field o a>
	//*  59  117:invokestatic    #121 <Method int o.b(o)>
	//*  60  120:bipush          10
	//*  61  122:icmple          132
				k = 10;
	//   62  125:bipush          10
	//   63  127:istore          6
			else
	//*  64  129:goto            141
				k = o.b(a);
	//   65  132:aload_0         
	//   66  133:getfield        #26  <Field o a>
	//   67  136:invokestatic    #121 <Method int o.b(o)>
	//   68  139:istore          6
			for(int j1 = 0; j1 < 10; j1++)
	//*  69  141:iconst_0        
	//*  70  142:istore          7
	//*  71  144:iload           7
	//*  72  146:bipush          10
	//*  73  148:icmpge          180
			{
				f4 += f[j1];
	//   74  151:fload           4
	//   75  153:aload_0         
	//   76  154:getfield        #42  <Field float[] f>
	//   77  157:iload           7
	//   78  159:faload          
	//   79  160:fadd            
	//   80  161:fstore          4
				f[j1] = 0.0F;
	//   81  163:aload_0         
	//   82  164:getfield        #42  <Field float[] f>
	//   83  167:iload           7
	//   84  169:fconst_0        
	//   85  170:fastore         
			}

	//   86  171:iload           7
	//   87  173:iconst_1        
	//   88  174:iadd            
	//   89  175:istore          7
	//*  90  177:goto            144
			f4 /= k;
	//   91  180:fload           4
	//   92  182:iload           6
	//   93  184:i2f             
	//   94  185:fdiv            
	//   95  186:fstore          4
			if(0.004F <= f4)
	//*  96  188:ldc1            #191 <Float 0.004F>
	//*  97  190:fload           4
	//*  98  192:fcmpg           
	//*  99  193:ifgt            251
			{
				f4 *= 300F;
	//  100  196:fload           4
	//  101  198:ldc1            #192 <Float 300F>
	//  102  200:fmul            
	//  103  201:fstore          4
				f1 = f4;
	//  104  203:fload           4
	//  105  205:fstore_2        
				if(f4 >= 1.5F)
	//* 106  206:fload           4
	//* 107  208:ldc1            #193 <Float 1.5F>
	//* 108  210:fcmpl           
	//* 109  211:iflt            217
					f1 = 1.5F;
	//  110  214:ldc1            #193 <Float 1.5F>
	//  111  216:fstore_2        
				f4 = f1;
	//  112  217:fload_2         
	//  113  218:fstore          4
				if(g < 0.0F)
	//* 114  220:aload_0         
	//* 115  221:getfield        #44  <Field float g>
	//* 116  224:fconst_0        
	//* 117  225:fcmpg           
	//* 118  226:ifge            233
					f4 = -f1;
	//  119  229:fload_2         
	//  120  230:fneg            
	//  121  231:fstore          4
				f1 = a.a.a(l1) + f4;
	//  122  233:aload_0         
	//  123  234:getfield        #26  <Field o a>
	//  124  237:getfield        #87  <Field s o.a>
	//  125  240:iload           8
	//  126  242:invokeinterface #195 <Method float s.a(int)>
	//  127  247:fload           4
	//  128  249:fadd            
	//  129  250:fstore_2        
			}
			g = 0.0F;
	//  130  251:aload_0         
	//  131  252:fconst_0        
	//  132  253:putfield        #44  <Field float g>
			f4 = f1;
	//  133  256:fload_2         
	//  134  257:fstore          4
		}
		f1 = f2;
	//  135  259:fload_3         
	//  136  260:fstore_2        
		if(!a.a.e(l1))
	//* 137  261:aload_0         
	//* 138  262:getfield        #26  <Field o a>
	//* 139  265:getfield        #87  <Field s o.a>
	//* 140  268:iload           8
	//* 141  270:invokeinterface #169 <Method boolean s.e(int)>
	//* 142  275:ifne            531
		{
			try
			{
				if(a.a.h().isRotateGesturesEnabled())
	//* 143  278:aload_0         
	//* 144  279:getfield        #26  <Field o a>
	//* 145  282:getfield        #87  <Field s o.a>
	//* 146  285:invokeinterface #128 <Method v s.h()>
	//* 147  290:invokeinterface #166 <Method boolean v.isRotateGesturesEnabled()>
	//* 148  295:ifeq            333
					a.a.a(l1, ((com.autonavi.amap.mapcore.message.AbstractGestureMapMessage) (RotateGestureMapMessage.obtain(102, a.a.n(l1), 0, 0))));
	//  149  298:aload_0         
	//  150  299:getfield        #26  <Field o a>
	//  151  302:getfield        #87  <Field s o.a>
	//  152  305:iload           8
	//  153  307:bipush          102
	//  154  309:aload_0         
	//  155  310:getfield        #26  <Field o a>
	//  156  313:getfield        #87  <Field s o.a>
	//  157  316:iload           8
	//  158  318:invokeinterface #186 <Method float s.n(int)>
	//  159  323:iconst_0        
	//  160  324:iconst_0        
	//  161  325:invokestatic    #182 <Method RotateGestureMapMessage RotateGestureMapMessage.obtain(int, float, int, int)>
	//  162  328:invokeinterface #148 <Method void s.a(int, com.autonavi.amap.mapcore.message.AbstractGestureMapMessage)>
			}
	//* 163  333:goto            349
			// Misplaced declaration of an exception variable
			catch(as as1)
	//* 164  336:astore_1        
			{
				hm.c(((Throwable) (as1)), "GLMapGestrureDetector", "onScaleRotateEnd");
	//  165  337:aload_1         
	//  166  338:ldc1            #153 <String "GLMapGestrureDetector">
	//  167  340:ldc1            #197 <String "onScaleRotateEnd">
	//  168  342:invokestatic    #160 <Method void hm.c(Throwable, String, String)>
				((Throwable) (as1)).printStackTrace();
	//  169  345:aload_1         
	//  170  346:invokevirtual   #163 <Method void Throwable.printStackTrace()>
			}
			f1 = f2;
	//  171  349:fload_3         
	//  172  350:fstore_2        
			if(o.c(a) > 0)
	//* 173  351:aload_0         
	//* 174  352:getfield        #26  <Field o a>
	//* 175  355:invokestatic    #175 <Method int o.c(o)>
	//* 176  358:ifle            526
			{
				a.a.a(l1, 6);
	//  177  361:aload_0         
	//  178  362:getfield        #26  <Field o a>
	//  179  365:getfield        #87  <Field s o.a>
	//  180  368:iload           8
	//  181  370:bipush          6
	//  182  372:invokeinterface #151 <Method void s.a(int, int)>
				f1 = 0.0F;
	//  183  377:fconst_0        
	//  184  378:fstore_2        
				int l;
				if(o.c(a) > 10)
	//* 185  379:aload_0         
	//* 186  380:getfield        #26  <Field o a>
	//* 187  383:invokestatic    #175 <Method int o.c(o)>
	//* 188  386:bipush          10
	//* 189  388:icmple          398
					l = 10;
	//  190  391:bipush          10
	//  191  393:istore          6
				else
	//* 192  395:goto            407
					l = o.c(a);
	//  193  398:aload_0         
	//  194  399:getfield        #26  <Field o a>
	//  195  402:invokestatic    #175 <Method int o.c(o)>
	//  196  405:istore          6
				for(int k1 = 0; k1 < 10; k1++)
	//* 197  407:iconst_0        
	//* 198  408:istore          7
	//* 199  410:iload           7
	//* 200  412:bipush          10
	//* 201  414:icmpge          444
				{
					f1 += h[k1];
	//  202  417:fload_2         
	//  203  418:aload_0         
	//  204  419:getfield        #46  <Field float[] h>
	//  205  422:iload           7
	//  206  424:faload          
	//  207  425:fadd            
	//  208  426:fstore_2        
					h[k1] = 0.0F;
	//  209  427:aload_0         
	//  210  428:getfield        #46  <Field float[] h>
	//  211  431:iload           7
	//  212  433:fconst_0        
	//  213  434:fastore         
				}

	//  214  435:iload           7
	//  215  437:iconst_1        
	//  216  438:iadd            
	//  217  439:istore          7
	//* 218  441:goto            410
				float f5 = f1 / (float)l;
	//  219  444:fload_2         
	//  220  445:iload           6
	//  221  447:i2f             
	//  222  448:fdiv            
	//  223  449:fstore          5
				f1 = f2;
	//  224  451:fload_3         
	//  225  452:fstore_2        
				if(0.1F <= f5)
	//* 226  453:ldc1            #198 <Float 0.1F>
	//* 227  455:fload           5
	//* 228  457:fcmpg           
	//* 229  458:ifgt            526
				{
					float f3 = f5 * 200F;
	//  230  461:fload           5
	//  231  463:ldc1            #199 <Float 200F>
	//  232  465:fmul            
	//  233  466:fstore_3        
					int i1 = (int)a.a.n(l1);
	//  234  467:aload_0         
	//  235  468:getfield        #26  <Field o a>
	//  236  471:getfield        #87  <Field s o.a>
	//  237  474:iload           8
	//  238  476:invokeinterface #186 <Method float s.n(int)>
	//  239  481:f2i             
	//  240  482:istore          6
					f1 = f3;
	//  241  484:fload_3         
	//  242  485:fstore_2        
					if(f3 >= 60F)
	//* 243  486:fload_3         
	//* 244  487:ldc1            #200 <Float 60F>
	//* 245  489:fcmpl           
	//* 246  490:iflt            496
						f1 = 60F;
	//  247  493:ldc1            #200 <Float 60F>
	//  248  495:fstore_2        
					f3 = f1;
	//  249  496:fload_2         
	//  250  497:fstore_3        
					if(i < 0.0F)
	//* 251  498:aload_0         
	//* 252  499:getfield        #48  <Field float i>
	//* 253  502:fconst_0        
	//* 254  503:fcmpg           
	//* 255  504:ifge            510
						f3 = -f1;
	//  256  507:fload_2         
	//  257  508:fneg            
	//  258  509:fstore_3        
					f1 = (int)((float)(i1 % 360) + f3) % 360;
	//  259  510:iload           6
	//  260  512:sipush          360
	//  261  515:irem            
	//  262  516:i2f             
	//  263  517:fload_3         
	//  264  518:fadd            
	//  265  519:f2i             
	//  266  520:sipush          360
	//  267  523:irem            
	//  268  524:i2f             
	//  269  525:fstore_2        
				}
			}
			g = 0.0F;
	//  270  526:aload_0         
	//  271  527:fconst_0        
	//  272  528:putfield        #44  <Field float g>
		}
		boolean flag;
		if(f4 != -9999F || f1 != -9999F)
	//* 273  531:fload           4
	//* 274  533:ldc1            #190 <Float -9999F>
	//* 275  535:fcmpl           
	//* 276  536:ifne            546
	//* 277  539:fload_2         
	//* 278  540:ldc1            #190 <Float -9999F>
	//* 279  542:fcmpl           
	//* 280  543:ifeq            552
			flag = true;
	//  281  546:iconst_1        
	//  282  547:istore          6
		else
	//* 283  549:goto            555
			flag = false;
	//  284  552:iconst_0        
	//  285  553:istore          6
		if(flag)
	//* 286  555:iload           6
	//* 287  557:ifeq            588
			a.a.a().startPivotZoomRotateAnim(l1, e, f4, (int)f1, 500);
	//  288  560:aload_0         
	//  289  561:getfield        #26  <Field o a>
	//  290  564:getfield        #87  <Field s o.a>
	//  291  567:invokeinterface #203 <Method GLMapEngine s.a()>
	//  292  572:iload           8
	//  293  574:aload_0         
	//  294  575:getfield        #40  <Field Point e>
	//  295  578:fload           4
	//  296  580:fload_2         
	//  297  581:f2i             
	//  298  582:sipush          500
	//  299  585:invokevirtual   #209 <Method void GLMapEngine.startPivotZoomRotateAnim(int, Point, float, int, int)>
	//  300  588:return          
	}

	final o a;
	private boolean b;
	private boolean c;
	private boolean d;
	private Point e;
	private float f[];
	private float g;
	private float h[];
	private float i;
	private EAMapPlatformGestureInfo j;

	private o$d(o o1)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field o a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void as$a()>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #31  <Field boolean b>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #33  <Field boolean c>
		d = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #35  <Field boolean d>
		e = new Point();
	//   14   24:aload_0         
	//   15   25:new             #37  <Class Point>
	//   16   28:dup             
	//   17   29:invokespecial   #38  <Method void Point()>
	//   18   32:putfield        #40  <Field Point e>
		f = new float[10];
	//   19   35:aload_0         
	//   20   36:bipush          10
	//   21   38:newarray        float[]
	//   22   40:putfield        #42  <Field float[] f>
		g = 0.0F;
	//   23   43:aload_0         
	//   24   44:fconst_0        
	//   25   45:putfield        #44  <Field float g>
		h = new float[10];
	//   26   48:aload_0         
	//   27   49:bipush          10
	//   28   51:newarray        float[]
	//   29   53:putfield        #46  <Field float[] h>
		i = 0.0F;
	//   30   56:aload_0         
	//   31   57:fconst_0        
	//   32   58:putfield        #48  <Field float i>
		j = new EAMapPlatformGestureInfo();
	//   33   61:aload_0         
	//   34   62:new             #50  <Class EAMapPlatformGestureInfo>
	//   35   65:dup             
	//   36   66:invokespecial   #51  <Method void EAMapPlatformGestureInfo()>
	//   37   69:putfield        #53  <Field EAMapPlatformGestureInfo j>
	//   38   72:return          
	}

	o$d(o o1, o$1 o$1)
	{
		this(o1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void o$d(o)>
	//    3    5:return          
	}
}
