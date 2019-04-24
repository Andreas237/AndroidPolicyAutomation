// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzaqw, zzakk, zzakb, 
//			zzkb, zzamu, zzasi, zzaac, 
//			zzaam

public final class zzaab extends zzaal
{

	public zzaab(zzaqw zzaqw1, zzaam zzaam1)
	{
		super(zzaqw1, "resize");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #70  <String "resize">
	//    3    4:invokespecial   #73  <Method void zzaal(zzaqw, String)>
		zzbvz = "top-right";
	//    4    7:aload_0         
	//    5    8:ldc1            #47  <String "top-right">
	//    6   10:putfield        #75  <Field String zzbvz>
		zzbwa = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #77  <Field boolean zzbwa>
		zzbwb = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #79  <Field int zzbwb>
		zzbwc = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #81  <Field int zzbwc>
		zzur = -1;
	//   16   28:aload_0         
	//   17   29:iconst_m1       
	//   18   30:putfield        #83  <Field int zzur>
		zzbwd = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #85  <Field int zzbwd>
		zzbwe = 0;
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:putfield        #87  <Field int zzbwe>
		zzuq = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #89  <Field int zzuq>
	//   28   48:aload_0         
	//   29   49:new             #91  <Class Object>
	//   30   52:dup             
	//   31   53:invokespecial   #93  <Method void Object()>
	//   32   56:putfield        #95  <Field Object mLock>
		zzbnd = zzaqw1;
	//   33   59:aload_0         
	//   34   60:aload_1         
	//   35   61:putfield        #97  <Field zzaqw zzbnd>
		zzbvp = zzaqw1.zzto();
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:invokeinterface #103 <Method Activity zzaqw.zzto()>
	//   39   71:putfield        #105 <Field Activity zzbvp>
		zzbmy = zzaam1;
	//   40   74:aload_0         
	//   41   75:aload_2         
	//   42   76:putfield        #107 <Field zzaam zzbmy>
	//   43   79:return          
	}

	private final void zza(int i, int j)
	{
		((zzaal)this).zzb(i, j - zzbv.zzek().zzh(zzbvp)[0], zzuq, zzur);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//    4    6:aload_0         
	//    5    7:getfield        #105 <Field Activity zzbvp>
	//    6   10:invokevirtual   #121 <Method int[] zzakk.zzh(Activity)>
	//    7   13:iconst_0        
	//    8   14:iaload          
	//    9   15:isub            
	//   10   16:aload_0         
	//   11   17:getfield        #89  <Field int zzuq>
	//   12   20:aload_0         
	//   13   21:getfield        #83  <Field int zzur>
	//   14   24:invokevirtual   #125 <Method void zzaal.zzb(int, int, int, int)>
	//   15   27:return          
	}

	private final int[] zzne()
	{
		int i;
		int i1;
		Object obj;
		int ai1[] = zzbv.zzek().zzg(zzbvp);
	//    0    0:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//    1    3:aload_0         
	//    2    4:getfield        #105 <Field Activity zzbvp>
	//    3    7:invokevirtual   #130 <Method int[] zzakk.zzg(Activity)>
	//    4   10:astore          5
		obj = ((Object) (zzbv.zzek().zzh(zzbvp)));
	//    5   12:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//    6   15:aload_0         
	//    7   16:getfield        #105 <Field Activity zzbvp>
	//    8   19:invokevirtual   #121 <Method int[] zzakk.zzh(Activity)>
	//    9   22:astore          4
		i1 = ai1[0];
	//   10   24:aload           5
	//   11   26:iconst_0        
	//   12   27:iaload          
	//   13   28:istore_3        
		i = ai1[1];
	//   14   29:aload           5
	//   15   31:iconst_1        
	//   16   32:iaload          
	//   17   33:istore_1        
		if(zzuq < 50 || zzuq > i1)
	//*  18   34:aload_0         
	//*  19   35:getfield        #89  <Field int zzuq>
	//*  20   38:bipush          50
	//*  21   40:icmplt          539
	//*  22   43:aload_0         
	//*  23   44:getfield        #89  <Field int zzuq>
	//*  24   47:iload_3         
	//*  25   48:icmple          54
			break MISSING_BLOCK_LABEL_539;
	//   26   51:goto            539
		if(zzur < 50 || zzur > i)
	//*  27   54:aload_0         
	//*  28   55:getfield        #83  <Field int zzur>
	//*  29   58:bipush          50
	//*  30   60:icmplt          532
	//*  31   63:aload_0         
	//*  32   64:getfield        #83  <Field int zzur>
	//*  33   67:iload_1         
	//*  34   68:icmple          74
			break MISSING_BLOCK_LABEL_532;
	//   35   71:goto            532
		if(zzur == i && zzuq == i1)
	//*  36   74:aload_0         
	//*  37   75:getfield        #83  <Field int zzur>
	//*  38   78:iload_1         
	//*  39   79:icmpne          97
	//*  40   82:aload_0         
	//*  41   83:getfield        #89  <Field int zzuq>
	//*  42   86:iload_3         
	//*  43   87:icmpne          97
		{
			obj = "Cannot resize to a full-screen ad.";
	//   44   90:ldc1            #132 <String "Cannot resize to a full-screen ad.">
	//   45   92:astore          4
			break MISSING_BLOCK_LABEL_543;
	//   46   94:goto            543
		}
		if(!zzbwa)
			break MISSING_BLOCK_LABEL_527;
	//   47   97:aload_0         
	//   48   98:getfield        #77  <Field boolean zzbwa>
	//   49  101:ifeq            527
label0:
		{
			String s = zzbvz;
	//   50  104:aload_0         
	//   51  105:getfield        #75  <Field String zzbvz>
	//   52  108:astore          5
			switch(s.hashCode())
	//*  53  110:aload           5
	//*  54  112:invokevirtual   #136 <Method int String.hashCode()>
			{
			default:
				break;

	//*  55  115:lookupswitch    6: default 172
	//	               -1364013995: 250
	//	               -1012429441: 235
	//	               -655373719: 220
	//	               1163912186: 205
	//	               1288627767: 190
	//	               1755462605: 175
	//*  56  172:goto            265
			case 1755462605: 
				if(s.equals("top-center"))
	//*  57  175:aload           5
	//*  58  177:ldc1            #49  <String "top-center">
	//*  59  179:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  60  182:ifeq            265
				{
					i = 1;
	//   61  185:iconst_1        
	//   62  186:istore_1        
					break label0;
	//   63  187:goto            267
				}
				break;

			case 1288627767: 
				if(!s.equals("bottom-center"))
					break;
	//   64  190:aload           5
	//   65  192:ldc1            #57  <String "bottom-center">
	//   66  194:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   67  197:ifeq            265
				i = 4;
	//   68  200:iconst_4        
	//   69  201:istore_1        
				break label0;
	//   70  202:goto            267

			case 1163912186: 
				if(!s.equals("bottom-right"))
					break;
	//   71  205:aload           5
	//   72  207:ldc1            #55  <String "bottom-right">
	//   73  209:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   74  212:ifeq            265
				i = 5;
	//   75  215:iconst_5        
	//   76  216:istore_1        
				break label0;
	//   77  217:goto            267

			case -655373719: 
				if(!s.equals("bottom-left"))
					break;
	//   78  220:aload           5
	//   79  222:ldc1            #53  <String "bottom-left">
	//   80  224:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   81  227:ifeq            265
				i = 3;
	//   82  230:iconst_3        
	//   83  231:istore_1        
				break label0;
	//   84  232:goto            267

			case -1012429441: 
				if(!s.equals("top-left"))
					break;
	//   85  235:aload           5
	//   86  237:ldc1            #45  <String "top-left">
	//   87  239:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   88  242:ifeq            265
				i = 0;
	//   89  245:iconst_0        
	//   90  246:istore_1        
				break label0;
	//   91  247:goto            267

			case -1364013995: 
				if(!s.equals("center"))
					break;
	//   92  250:aload           5
	//   93  252:ldc1            #51  <String "center">
	//   94  254:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   95  257:ifeq            265
				i = 2;
	//   96  260:iconst_2        
	//   97  261:istore_1        
				break label0;
	//   98  262:goto            267
			}
			i = -1;
	//   99  265:iconst_m1       
	//  100  266:istore_1        
		}
		i;
	//  101  267:iload_1         
		JVM INSTR tableswitch 0 5: default 308
	//	               0 480
	//	               1 457
	//	               2 414
	//	               3 383
	//	               4 360
	//	               5 339;
	//  102  268:tableswitch     0 5: default 308
	//	               0 480
	//	               1 457
	//	               2 414
	//	               3 383
	//	               4 360
	//	               5 339
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		i = (zzbwb + zzbwd + zzuq) - 50;
	//  103  308:aload_0         
	//  104  309:getfield        #79  <Field int zzbwb>
	//  105  312:aload_0         
	//  106  313:getfield        #85  <Field int zzbwd>
	//  107  316:iadd            
	//  108  317:aload_0         
	//  109  318:getfield        #89  <Field int zzuq>
	//  110  321:iadd            
	//  111  322:bipush          50
	//  112  324:isub            
	//  113  325:istore_1        
_L9:
		int k;
		k = zzbwc + zzbwe;
	//  114  326:aload_0         
	//  115  327:getfield        #81  <Field int zzbwc>
	//  116  330:aload_0         
	//  117  331:getfield        #87  <Field int zzbwe>
	//  118  334:iadd            
	//  119  335:istore_2        
		break; /* Loop/switch isn't completed */
	//  120  336:goto            493
_L7:
		i = (zzbwb + zzbwd + zzuq) - 50;
	//  121  339:aload_0         
	//  122  340:getfield        #79  <Field int zzbwb>
	//  123  343:aload_0         
	//  124  344:getfield        #85  <Field int zzbwd>
	//  125  347:iadd            
	//  126  348:aload_0         
	//  127  349:getfield        #89  <Field int zzuq>
	//  128  352:iadd            
	//  129  353:bipush          50
	//  130  355:isub            
	//  131  356:istore_1        
		break; /* Loop/switch isn't completed */
	//  132  357:goto            393
_L6:
		i = (zzbwb + zzbwd + zzuq / 2) - 25;
	//  133  360:aload_0         
	//  134  361:getfield        #79  <Field int zzbwb>
	//  135  364:aload_0         
	//  136  365:getfield        #85  <Field int zzbwd>
	//  137  368:iadd            
	//  138  369:aload_0         
	//  139  370:getfield        #89  <Field int zzuq>
	//  140  373:iconst_2        
	//  141  374:idiv            
	//  142  375:iadd            
	//  143  376:bipush          25
	//  144  378:isub            
	//  145  379:istore_1        
		break; /* Loop/switch isn't completed */
	//  146  380:goto            393
_L5:
		i = zzbwb + zzbwd;
	//  147  383:aload_0         
	//  148  384:getfield        #79  <Field int zzbwb>
	//  149  387:aload_0         
	//  150  388:getfield        #85  <Field int zzbwd>
	//  151  391:iadd            
	//  152  392:istore_1        
		k = (zzbwc + zzbwe + zzur) - 50;
	//  153  393:aload_0         
	//  154  394:getfield        #81  <Field int zzbwc>
	//  155  397:aload_0         
	//  156  398:getfield        #87  <Field int zzbwe>
	//  157  401:iadd            
	//  158  402:aload_0         
	//  159  403:getfield        #83  <Field int zzur>
	//  160  406:iadd            
	//  161  407:bipush          50
	//  162  409:isub            
	//  163  410:istore_2        
		break; /* Loop/switch isn't completed */
	//  164  411:goto            493
_L4:
		i = (zzbwb + zzbwd + zzuq / 2) - 25;
	//  165  414:aload_0         
	//  166  415:getfield        #79  <Field int zzbwb>
	//  167  418:aload_0         
	//  168  419:getfield        #85  <Field int zzbwd>
	//  169  422:iadd            
	//  170  423:aload_0         
	//  171  424:getfield        #89  <Field int zzuq>
	//  172  427:iconst_2        
	//  173  428:idiv            
	//  174  429:iadd            
	//  175  430:bipush          25
	//  176  432:isub            
	//  177  433:istore_1        
		k = (zzbwc + zzbwe + zzur / 2) - 25;
	//  178  434:aload_0         
	//  179  435:getfield        #81  <Field int zzbwc>
	//  180  438:aload_0         
	//  181  439:getfield        #87  <Field int zzbwe>
	//  182  442:iadd            
	//  183  443:aload_0         
	//  184  444:getfield        #83  <Field int zzur>
	//  185  447:iconst_2        
	//  186  448:idiv            
	//  187  449:iadd            
	//  188  450:bipush          25
	//  189  452:isub            
	//  190  453:istore_2        
		break; /* Loop/switch isn't completed */
	//  191  454:goto            493
_L3:
		i = (zzbwb + zzbwd + zzuq / 2) - 25;
	//  192  457:aload_0         
	//  193  458:getfield        #79  <Field int zzbwb>
	//  194  461:aload_0         
	//  195  462:getfield        #85  <Field int zzbwd>
	//  196  465:iadd            
	//  197  466:aload_0         
	//  198  467:getfield        #89  <Field int zzuq>
	//  199  470:iconst_2        
	//  200  471:idiv            
	//  201  472:iadd            
	//  202  473:bipush          25
	//  203  475:isub            
	//  204  476:istore_1        
		continue; /* Loop/switch isn't completed */
	//  205  477:goto            326
_L2:
		i = zzbwb + zzbwd;
	//  206  480:aload_0         
	//  207  481:getfield        #79  <Field int zzbwb>
	//  208  484:aload_0         
	//  209  485:getfield        #85  <Field int zzbwd>
	//  210  488:iadd            
	//  211  489:istore_1        
		if(true) goto _L9; else goto _L8
	//  212  490:goto            326
_L8:
		if(i < 0 || i + 50 > i1 || k < obj[0] || k + 50 > obj[1])
	//* 213  493:iload_1         
	//* 214  494:iflt            548
	//* 215  497:iload_1         
	//* 216  498:bipush          50
	//* 217  500:iadd            
	//* 218  501:iload_3         
	//* 219  502:icmpgt          548
	//* 220  505:iload_2         
	//* 221  506:aload           4
	//* 222  508:iconst_0        
	//* 223  509:iaload          
	//* 224  510:icmplt          548
	//* 225  513:iload_2         
	//* 226  514:bipush          50
	//* 227  516:iadd            
	//* 228  517:aload           4
	//* 229  519:iconst_1        
	//* 230  520:iaload          
	//* 231  521:icmple          527
			break MISSING_BLOCK_LABEL_548;
	//  232  524:goto            548
		boolean flag;
		flag = true;
	//  233  527:iconst_1        
	//  234  528:istore_1        
		break MISSING_BLOCK_LABEL_550;
	//  235  529:goto            550
		obj = "Height is too small or too large.";
	//  236  532:ldc1            #142 <String "Height is too small or too large.">
	//  237  534:astore          4
		break MISSING_BLOCK_LABEL_543;
	//  238  536:goto            543
		obj = "Width is too small or too large.";
	//  239  539:ldc1            #144 <String "Width is too small or too large.">
	//  240  541:astore          4
		zzakb.zzdk(((String) (obj)));
	//  241  543:aload           4
	//  242  545:invokestatic    #150 <Method void zzakb.zzdk(String)>
		flag = false;
	//  243  548:iconst_0        
	//  244  549:istore_1        
		if(!flag)
	//* 245  550:iload_1         
	//* 246  551:ifne            556
			return null;
	//  247  554:aconst_null     
	//  248  555:areturn         
		if(zzbwa)
	//* 249  556:aload_0         
	//* 250  557:getfield        #77  <Field boolean zzbwa>
	//* 251  560:ifeq            591
			return (new int[] {
				zzbwb + zzbwd, zzbwc + zzbwe
			});
	//  252  563:iconst_2        
	//  253  564:newarray        int[]
	//  254  566:dup             
	//  255  567:iconst_0        
	//  256  568:aload_0         
	//  257  569:getfield        #79  <Field int zzbwb>
	//  258  572:aload_0         
	//  259  573:getfield        #85  <Field int zzbwd>
	//  260  576:iadd            
	//  261  577:iastore         
	//  262  578:dup             
	//  263  579:iconst_1        
	//  264  580:aload_0         
	//  265  581:getfield        #81  <Field int zzbwc>
	//  266  584:aload_0         
	//  267  585:getfield        #87  <Field int zzbwe>
	//  268  588:iadd            
	//  269  589:iastore         
	//  270  590:areturn         
		int ai[] = zzbv.zzek().zzg(zzbvp);
	//  271  591:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//  272  594:aload_0         
	//  273  595:getfield        #105 <Field Activity zzbvp>
	//  274  598:invokevirtual   #130 <Method int[] zzakk.zzg(Activity)>
	//  275  601:astore          4
		int ai2[] = zzbv.zzek().zzh(zzbvp);
	//  276  603:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//  277  606:aload_0         
	//  278  607:getfield        #105 <Field Activity zzbvp>
	//  279  610:invokevirtual   #121 <Method int[] zzakk.zzh(Activity)>
	//  280  613:astore          5
		int l = ai[0];
	//  281  615:aload           4
	//  282  617:iconst_0        
	//  283  618:iaload          
	//  284  619:istore_2        
		int j = zzbwb + zzbwd;
	//  285  620:aload_0         
	//  286  621:getfield        #79  <Field int zzbwb>
	//  287  624:aload_0         
	//  288  625:getfield        #85  <Field int zzbwd>
	//  289  628:iadd            
	//  290  629:istore_1        
		int j1 = zzbwc + zzbwe;
	//  291  630:aload_0         
	//  292  631:getfield        #81  <Field int zzbwc>
	//  293  634:aload_0         
	//  294  635:getfield        #87  <Field int zzbwe>
	//  295  638:iadd            
	//  296  639:istore_3        
		if(j < 0)
	//* 297  640:iload_1         
	//* 298  641:ifge            649
			j = 0;
	//  299  644:iconst_0        
	//  300  645:istore_1        
		else
	//* 301  646:goto            669
		if(zzuq + j > l)
	//* 302  649:aload_0         
	//* 303  650:getfield        #89  <Field int zzuq>
	//* 304  653:iload_1         
	//* 305  654:iadd            
	//* 306  655:iload_2         
	//* 307  656:icmple          669
			j = l - zzuq;
	//  308  659:iload_2         
	//  309  660:aload_0         
	//  310  661:getfield        #89  <Field int zzuq>
	//  311  664:isub            
	//  312  665:istore_1        
	//* 313  666:goto            669
		if(j1 < ai2[0])
	//* 314  669:iload_3         
	//* 315  670:aload           5
	//* 316  672:iconst_0        
	//* 317  673:iaload          
	//* 318  674:icmpge          685
		{
			l = ai2[0];
	//  319  677:aload           5
	//  320  679:iconst_0        
	//  321  680:iaload          
	//  322  681:istore_2        
		} else
	//* 323  682:goto            710
		{
			l = j1;
	//  324  685:iload_3         
	//  325  686:istore_2        
			if(zzur + j1 > ai2[1])
	//* 326  687:aload_0         
	//* 327  688:getfield        #83  <Field int zzur>
	//* 328  691:iload_3         
	//* 329  692:iadd            
	//* 330  693:aload           5
	//* 331  695:iconst_1        
	//* 332  696:iaload          
	//* 333  697:icmple          710
				l = ai2[1] - zzur;
	//  334  700:aload           5
	//  335  702:iconst_1        
	//  336  703:iaload          
	//  337  704:aload_0         
	//  338  705:getfield        #83  <Field int zzur>
	//  339  708:isub            
	//  340  709:istore_2        
		}
		return (new int[] {
			j, l
		});
	//  341  710:iconst_2        
	//  342  711:newarray        int[]
	//  343  713:dup             
	//  344  714:iconst_0        
	//  345  715:iload_1         
	//  346  716:iastore         
	//  347  717:dup             
	//  348  718:iconst_1        
	//  349  719:iload_2         
	//  350  720:iastore         
	//  351  721:areturn         
	}

	public final void zza(int i, int j, boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Object mLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzbwb = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #79  <Field int zzbwb>
		zzbwc = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #81  <Field int zzbwc>
		if(zzbwi == null || !flag)
			break MISSING_BLOCK_LABEL_118;
	//   11   19:aload_0         
	//   12   20:getfield        #153 <Field PopupWindow zzbwi>
	//   13   23:ifnull          118
	//   14   26:iload_3         
	//   15   27:ifeq            118
		int ai[] = zzne();
	//   16   30:aload_0         
	//   17   31:invokespecial   #155 <Method int[] zzne()>
	//   18   34:astore          5
		if(ai == null)
			break MISSING_BLOCK_LABEL_113;
	//   19   36:aload           5
	//   20   38:ifnull          113
		PopupWindow popupwindow = zzbwi;
	//   21   41:aload_0         
	//   22   42:getfield        #153 <Field PopupWindow zzbwi>
	//   23   45:astore          6
		zzkb.zzif();
	//   24   47:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//   25   50:pop             
		i = zzamu.zza(((android.content.Context) (zzbvp)), ai[0]);
	//   26   51:aload_0         
	//   27   52:getfield        #105 <Field Activity zzbvp>
	//   28   55:aload           5
	//   29   57:iconst_0        
	//   30   58:iaload          
	//   31   59:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//   32   62:istore_1        
		zzkb.zzif();
	//   33   63:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//   34   66:pop             
		popupwindow.update(i, zzamu.zza(((android.content.Context) (zzbvp)), ai[1]), zzbwi.getWidth(), zzbwi.getHeight());
	//   35   67:aload           6
	//   36   69:iload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #105 <Field Activity zzbvp>
	//   39   74:aload           5
	//   40   76:iconst_1        
	//   41   77:iaload          
	//   42   78:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//   43   81:aload_0         
	//   44   82:getfield        #153 <Field PopupWindow zzbwi>
	//   45   85:invokevirtual   #171 <Method int PopupWindow.getWidth()>
	//   46   88:aload_0         
	//   47   89:getfield        #153 <Field PopupWindow zzbwi>
	//   48   92:invokevirtual   #174 <Method int PopupWindow.getHeight()>
	//   49   95:invokevirtual   #177 <Method void PopupWindow.update(int, int, int, int)>
		zza(ai[0], ai[1]);
	//   50   98:aload_0         
	//   51   99:aload           5
	//   52  101:iconst_0        
	//   53  102:iaload          
	//   54  103:aload           5
	//   55  105:iconst_1        
	//   56  106:iaload          
	//   57  107:invokespecial   #179 <Method void zza(int, int)>
		break MISSING_BLOCK_LABEL_118;
	//   58  110:goto            118
		zzm(true);
	//   59  113:aload_0         
	//   60  114:iconst_1        
	//   61  115:invokevirtual   #183 <Method void zzm(boolean)>
		obj;
	//   62  118:aload           4
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		return;
	//   64  121:return          
		Exception exception;
		exception;
	//   65  122:astore          5
		obj;
	//   66  124:aload           4
		JVM INSTR monitorexit ;
	//   67  126:monitorexit     
		throw exception;
	//   68  127:aload           5
	//   69  129:athrow          
	}

	public final void zzb(int i, int j)
	{
		zzbwb = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int zzbwb>
		zzbwc = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #81  <Field int zzbwc>
	//    6   10:return          
	}

	public final void zzk(Map map)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field Object mLock>
	//*   2    4:astore          6
	//*   3    6:aload           6
	//*   4    8:monitorenter    
			{
				if(zzbvp != null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field Activity zzbvp>
	//    7   13:ifnonnull       26
				((zzaal)this).zzbw("Not an activity context. Cannot resize.");
	//    8   16:aload_0         
	//    9   17:ldc1            #189 <String "Not an activity context. Cannot resize.">
	//   10   19:invokevirtual   #192 <Method void zzaal.zzbw(String)>
			}
	//   11   22:aload           6
	//   12   24:monitorexit     
			return;
	//   13   25:return          
		}
		if(zzbnd.zzud() != null)
			break MISSING_BLOCK_LABEL_48;
	//   14   26:aload_0         
	//   15   27:getfield        #97  <Field zzaqw zzbnd>
	//   16   30:invokeinterface #196 <Method zzasi zzaqw.zzud()>
	//   17   35:ifnonnull       48
		((zzaal)this).zzbw("Webview is not yet available, size is not set.");
	//   18   38:aload_0         
	//   19   39:ldc1            #198 <String "Webview is not yet available, size is not set.">
	//   20   41:invokevirtual   #192 <Method void zzaal.zzbw(String)>
		obj;
	//   21   44:aload           6
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		if(!zzbnd.zzud().zzvs())
			break MISSING_BLOCK_LABEL_73;
	//   24   48:aload_0         
	//   25   49:getfield        #97  <Field zzaqw zzbnd>
	//   26   52:invokeinterface #196 <Method zzasi zzaqw.zzud()>
	//   27   57:invokevirtual   #204 <Method boolean zzasi.zzvs()>
	//   28   60:ifeq            73
		((zzaal)this).zzbw("Is interstitial. Cannot resize an interstitial.");
	//   29   63:aload_0         
	//   30   64:ldc1            #206 <String "Is interstitial. Cannot resize an interstitial.">
	//   31   66:invokevirtual   #192 <Method void zzaal.zzbw(String)>
		obj;
	//   32   69:aload           6
		JVM INSTR monitorexit ;
	//   33   71:monitorexit     
		return;
	//   34   72:return          
		if(!zzbnd.zzuj())
			break MISSING_BLOCK_LABEL_95;
	//   35   73:aload_0         
	//   36   74:getfield        #97  <Field zzaqw zzbnd>
	//   37   77:invokeinterface #209 <Method boolean zzaqw.zzuj()>
	//   38   82:ifeq            95
		((zzaal)this).zzbw("Cannot resize an expanded banner.");
	//   39   85:aload_0         
	//   40   86:ldc1            #211 <String "Cannot resize an expanded banner.">
	//   41   88:invokevirtual   #192 <Method void zzaal.zzbw(String)>
		obj;
	//   42   91:aload           6
		JVM INSTR monitorexit ;
	//   43   93:monitorexit     
		return;
	//   44   94:return          
		if(!TextUtils.isEmpty((CharSequence)map.get("width")))
	//*  45   95:aload_1         
	//*  46   96:ldc1            #213 <String "width">
	//*  47   98:invokeinterface #219 <Method Object Map.get(Object)>
	//*  48  103:checkcast       #221 <Class CharSequence>
	//*  49  106:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  50  109:ifne            134
		{
			zzbv.zzek();
	//   51  112:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//   52  115:pop             
			zzuq = zzakk.zzcv((String)map.get("width"));
	//   53  116:aload_0         
	//   54  117:aload_1         
	//   55  118:ldc1            #213 <String "width">
	//   56  120:invokeinterface #219 <Method Object Map.get(Object)>
	//   57  125:checkcast       #43  <Class String>
	//   58  128:invokestatic    #231 <Method int zzakk.zzcv(String)>
	//   59  131:putfield        #89  <Field int zzuq>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("height")))
	//*  60  134:aload_1         
	//*  61  135:ldc1            #233 <String "height">
	//*  62  137:invokeinterface #219 <Method Object Map.get(Object)>
	//*  63  142:checkcast       #221 <Class CharSequence>
	//*  64  145:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  65  148:ifne            173
		{
			zzbv.zzek();
	//   66  151:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//   67  154:pop             
			zzur = zzakk.zzcv((String)map.get("height"));
	//   68  155:aload_0         
	//   69  156:aload_1         
	//   70  157:ldc1            #233 <String "height">
	//   71  159:invokeinterface #219 <Method Object Map.get(Object)>
	//   72  164:checkcast       #43  <Class String>
	//   73  167:invokestatic    #231 <Method int zzakk.zzcv(String)>
	//   74  170:putfield        #83  <Field int zzur>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
	//*  75  173:aload_1         
	//*  76  174:ldc1            #235 <String "offsetX">
	//*  77  176:invokeinterface #219 <Method Object Map.get(Object)>
	//*  78  181:checkcast       #221 <Class CharSequence>
	//*  79  184:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  80  187:ifne            212
		{
			zzbv.zzek();
	//   81  190:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//   82  193:pop             
			zzbwd = zzakk.zzcv((String)map.get("offsetX"));
	//   83  194:aload_0         
	//   84  195:aload_1         
	//   85  196:ldc1            #235 <String "offsetX">
	//   86  198:invokeinterface #219 <Method Object Map.get(Object)>
	//   87  203:checkcast       #43  <Class String>
	//   88  206:invokestatic    #231 <Method int zzakk.zzcv(String)>
	//   89  209:putfield        #85  <Field int zzbwd>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
	//*  90  212:aload_1         
	//*  91  213:ldc1            #237 <String "offsetY">
	//*  92  215:invokeinterface #219 <Method Object Map.get(Object)>
	//*  93  220:checkcast       #221 <Class CharSequence>
	//*  94  223:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  95  226:ifne            251
		{
			zzbv.zzek();
	//   96  229:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//   97  232:pop             
			zzbwe = zzakk.zzcv((String)map.get("offsetY"));
	//   98  233:aload_0         
	//   99  234:aload_1         
	//  100  235:ldc1            #237 <String "offsetY">
	//  101  237:invokeinterface #219 <Method Object Map.get(Object)>
	//  102  242:checkcast       #43  <Class String>
	//  103  245:invokestatic    #231 <Method int zzakk.zzcv(String)>
	//  104  248:putfield        #87  <Field int zzbwe>
		}
		if(!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
	//* 105  251:aload_1         
	//* 106  252:ldc1            #239 <String "allowOffscreen">
	//* 107  254:invokeinterface #219 <Method Object Map.get(Object)>
	//* 108  259:checkcast       #221 <Class CharSequence>
	//* 109  262:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 110  265:ifne            286
			zzbwa = Boolean.parseBoolean((String)map.get("allowOffscreen"));
	//  111  268:aload_0         
	//  112  269:aload_1         
	//  113  270:ldc1            #239 <String "allowOffscreen">
	//  114  272:invokeinterface #219 <Method Object Map.get(Object)>
	//  115  277:checkcast       #43  <Class String>
	//  116  280:invokestatic    #245 <Method boolean Boolean.parseBoolean(String)>
	//  117  283:putfield        #77  <Field boolean zzbwa>
		map = ((Map) ((String)map.get("customClosePosition")));
	//  118  286:aload_1         
	//  119  287:ldc1            #247 <String "customClosePosition">
	//  120  289:invokeinterface #219 <Method Object Map.get(Object)>
	//  121  294:checkcast       #43  <Class String>
	//  122  297:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (map))))
	//* 123  298:aload_1         
	//* 124  299:invokestatic    #227 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 125  302:ifne            310
			zzbvz = ((String) (map));
	//  126  305:aload_0         
	//  127  306:aload_1         
	//  128  307:putfield        #75  <Field String zzbvz>
		int i;
		int j;
		int k;
		int l;
		Object obj1;
		Object obj2;
		String s;
		if(zzuq >= 0 && zzur >= 0)
	//* 129  310:aload_0         
	//* 130  311:getfield        #89  <Field int zzuq>
	//* 131  314:iflt            1264
	//* 132  317:aload_0         
	//* 133  318:getfield        #83  <Field int zzur>
	//* 134  321:iflt            1264
			i = 1;
	//  135  324:iconst_1        
	//  136  325:istore_2        
		else
	//* 137  326:goto            329
	//* 138  329:iload_2         
	//* 139  330:ifne            343
	//* 140  333:aload_0         
	//* 141  334:ldc1            #249 <String "Invalid width and height options. Cannot resize.">
	//* 142  336:invokevirtual   #192 <Method void zzaal.zzbw(String)>
	//* 143  339:aload           6
	//* 144  341:monitorexit     
	//* 145  342:return          
	//* 146  343:aload_0         
	//* 147  344:getfield        #105 <Field Activity zzbvp>
	//* 148  347:invokevirtual   #255 <Method Window Activity.getWindow()>
	//* 149  350:astore          7
	//* 150  352:aload           7
	//* 151  354:ifnull          1247
	//* 152  357:aload           7
	//* 153  359:invokevirtual   #261 <Method View Window.getDecorView()>
	//* 154  362:ifnonnull       368
	//* 155  365:goto            1247
	//* 156  368:aload_0         
	//* 157  369:invokespecial   #155 <Method int[] zzne()>
	//* 158  372:astore_1        
	//* 159  373:aload_1         
	//* 160  374:ifnonnull       388
	//* 161  377:aload_0         
	//* 162  378:ldc2            #263 <String "Resize location out of screen or close button is not visible.">
	//* 163  381:invokevirtual   #192 <Method void zzaal.zzbw(String)>
	//* 164  384:aload           6
	//* 165  386:monitorexit     
	//* 166  387:return          
	//* 167  388:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 168  391:pop             
	//* 169  392:aload_0         
	//* 170  393:getfield        #105 <Field Activity zzbvp>
	//* 171  396:aload_0         
	//* 172  397:getfield        #89  <Field int zzuq>
	//* 173  400:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 174  403:istore_3        
	//* 175  404:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 176  407:pop             
	//* 177  408:aload_0         
	//* 178  409:getfield        #105 <Field Activity zzbvp>
	//* 179  412:aload_0         
	//* 180  413:getfield        #83  <Field int zzur>
	//* 181  416:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 182  419:istore          4
	//* 183  421:aload_0         
	//* 184  422:getfield        #97  <Field zzaqw zzbnd>
	//* 185  425:invokeinterface #266 <Method View zzaqw.getView()>
	//* 186  430:invokevirtual   #272 <Method android.view.ViewParent View.getParent()>
	//* 187  433:astore          8
	//* 188  435:aload           8
	//* 189  437:ifnull          1236
	//* 190  440:aload           8
	//* 191  442:instanceof      #274 <Class ViewGroup>
	//* 192  445:ifeq            1236
	//* 193  448:aload           8
	//* 194  450:checkcast       #274 <Class ViewGroup>
	//* 195  453:aload_0         
	//* 196  454:getfield        #97  <Field zzaqw zzbnd>
	//* 197  457:invokeinterface #266 <Method View zzaqw.getView()>
	//* 198  462:invokevirtual   #278 <Method void ViewGroup.removeView(View)>
	//* 199  465:aload_0         
	//* 200  466:getfield        #153 <Field PopupWindow zzbwi>
	//* 201  469:ifnonnull       550
	//* 202  472:aload_0         
	//* 203  473:aload           8
	//* 204  475:checkcast       #274 <Class ViewGroup>
	//* 205  478:putfield        #280 <Field ViewGroup zzbwk>
	//* 206  481:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//* 207  484:pop             
	//* 208  485:aload_0         
	//* 209  486:getfield        #97  <Field zzaqw zzbnd>
	//* 210  489:invokeinterface #266 <Method View zzaqw.getView()>
	//* 211  494:invokestatic    #284 <Method android.graphics.Bitmap zzakk.zzs(View)>
	//* 212  497:astore          8
	//* 213  499:aload_0         
	//* 214  500:new             #286 <Class ImageView>
	//* 215  503:dup             
	//* 216  504:aload_0         
	//* 217  505:getfield        #105 <Field Activity zzbvp>
	//* 218  508:invokespecial   #289 <Method void ImageView(android.content.Context)>
	//* 219  511:putfield        #291 <Field ImageView zzbwg>
	//* 220  514:aload_0         
	//* 221  515:getfield        #291 <Field ImageView zzbwg>
	//* 222  518:aload           8
	//* 223  520:invokevirtual   #295 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
	//* 224  523:aload_0         
	//* 225  524:aload_0         
	//* 226  525:getfield        #97  <Field zzaqw zzbnd>
	//* 227  528:invokeinterface #196 <Method zzasi zzaqw.zzud()>
	//* 228  533:putfield        #297 <Field zzasi zzbwf>
	//* 229  536:aload_0         
	//* 230  537:getfield        #280 <Field ViewGroup zzbwk>
	//* 231  540:aload_0         
	//* 232  541:getfield        #291 <Field ImageView zzbwg>
	//* 233  544:invokevirtual   #300 <Method void ViewGroup.addView(View)>
	//* 234  547:goto            557
	//* 235  550:aload_0         
	//* 236  551:getfield        #153 <Field PopupWindow zzbwi>
	//* 237  554:invokevirtual   #303 <Method void PopupWindow.dismiss()>
	//* 238  557:aload_0         
	//* 239  558:new             #305 <Class RelativeLayout>
	//* 240  561:dup             
	//* 241  562:aload_0         
	//* 242  563:getfield        #105 <Field Activity zzbvp>
	//* 243  566:invokespecial   #306 <Method void RelativeLayout(android.content.Context)>
	//* 244  569:putfield        #308 <Field RelativeLayout zzbwj>
	//* 245  572:aload_0         
	//* 246  573:getfield        #308 <Field RelativeLayout zzbwj>
	//* 247  576:iconst_0        
	//* 248  577:invokevirtual   #312 <Method void RelativeLayout.setBackgroundColor(int)>
	//* 249  580:aload_0         
	//* 250  581:getfield        #308 <Field RelativeLayout zzbwj>
	//* 251  584:new             #314 <Class android.view.ViewGroup$LayoutParams>
	//* 252  587:dup             
	//* 253  588:iload_3         
	//* 254  589:iload           4
	//* 255  591:invokespecial   #316 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//* 256  594:invokevirtual   #320 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 257  597:invokestatic    #115 <Method zzakk zzbv.zzek()>
	//* 258  600:pop             
	//* 259  601:aload_0         
	//* 260  602:aload_0         
	//* 261  603:getfield        #308 <Field RelativeLayout zzbwj>
	//* 262  606:iload_3         
	//* 263  607:iload           4
	//* 264  609:iconst_0        
	//* 265  610:invokestatic    #323 <Method PopupWindow zzakk.zza(View, int, int, boolean)>
	//* 266  613:putfield        #153 <Field PopupWindow zzbwi>
	//* 267  616:aload_0         
	//* 268  617:getfield        #153 <Field PopupWindow zzbwi>
	//* 269  620:iconst_1        
	//* 270  621:invokevirtual   #326 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//* 271  624:aload_0         
	//* 272  625:getfield        #153 <Field PopupWindow zzbwi>
	//* 273  628:iconst_1        
	//* 274  629:invokevirtual   #329 <Method void PopupWindow.setTouchable(boolean)>
	//* 275  632:aload_0         
	//* 276  633:getfield        #153 <Field PopupWindow zzbwi>
	//* 277  636:aload_0         
	//* 278  637:getfield        #77  <Field boolean zzbwa>
	//* 279  640:iconst_1        
	//* 280  641:ixor            
	//* 281  642:invokevirtual   #332 <Method void PopupWindow.setClippingEnabled(boolean)>
	//* 282  645:aload_0         
	//* 283  646:getfield        #308 <Field RelativeLayout zzbwj>
	//* 284  649:aload_0         
	//* 285  650:getfield        #97  <Field zzaqw zzbnd>
	//* 286  653:invokeinterface #266 <Method View zzaqw.getView()>
	//* 287  658:iconst_m1       
	//* 288  659:iconst_m1       
	//* 289  660:invokevirtual   #335 <Method void RelativeLayout.addView(View, int, int)>
	//* 290  663:aload_0         
	//* 291  664:new             #337 <Class LinearLayout>
	//* 292  667:dup             
	//* 293  668:aload_0         
	//* 294  669:getfield        #105 <Field Activity zzbvp>
	//* 295  672:invokespecial   #338 <Method void LinearLayout(android.content.Context)>
	//* 296  675:putfield        #340 <Field LinearLayout zzbwh>
	//* 297  678:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 298  681:pop             
	//* 299  682:aload_0         
	//* 300  683:getfield        #105 <Field Activity zzbvp>
	//* 301  686:bipush          50
	//* 302  688:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 303  691:istore_2        
	//* 304  692:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 305  695:pop             
	//* 306  696:new             #342 <Class android.widget.RelativeLayout$LayoutParams>
	//* 307  699:dup             
	//* 308  700:iload_2         
	//* 309  701:aload_0         
	//* 310  702:getfield        #105 <Field Activity zzbvp>
	//* 311  705:bipush          50
	//* 312  707:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 313  710:invokespecial   #343 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 314  713:astore          8
	//* 315  715:aload_0         
	//* 316  716:getfield        #75  <Field String zzbvz>
	//* 317  719:astore          9
	//* 318  721:aload           9
	//* 319  723:invokevirtual   #136 <Method int String.hashCode()>
	//* 320  726:lookupswitch    6: default 1269
	//	               -1364013995: 859
	//	               -1012429441: 844
	//	               -655373719: 829
	//	               1163912186: 814
	//	               1288627767: 799
	//	               1755462605: 784
	//* 321  784:aload           9
	//* 322  786:ldc1            #49  <String "top-center">
	//* 323  788:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 324  791:ifeq            1269
	//* 325  794:iconst_1        
	//* 326  795:istore_2        
	//* 327  796:goto            1271
	//* 328  799:aload           9
	//* 329  801:ldc1            #57  <String "bottom-center">
	//* 330  803:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 331  806:ifeq            1269
	//* 332  809:iconst_4        
	//* 333  810:istore_2        
	//* 334  811:goto            1271
	//* 335  814:aload           9
	//* 336  816:ldc1            #55  <String "bottom-right">
	//* 337  818:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 338  821:ifeq            1269
	//* 339  824:iconst_5        
	//* 340  825:istore_2        
	//* 341  826:goto            1271
	//* 342  829:aload           9
	//* 343  831:ldc1            #53  <String "bottom-left">
	//* 344  833:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 345  836:ifeq            1269
	//* 346  839:iconst_3        
	//* 347  840:istore_2        
	//* 348  841:goto            1271
	//* 349  844:aload           9
	//* 350  846:ldc1            #45  <String "top-left">
	//* 351  848:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 352  851:ifeq            1269
	//* 353  854:iconst_0        
	//* 354  855:istore_2        
	//* 355  856:goto            1271
	//* 356  859:aload           9
	//* 357  861:ldc1            #51  <String "center">
	//* 358  863:invokevirtual   #140 <Method boolean String.equals(Object)>
	//* 359  866:ifeq            1269
	//* 360  869:iconst_2        
	//* 361  870:istore_2        
	//* 362  871:goto            1271
	//* 363  874:aload           8
	//* 364  876:bipush          10
	//* 365  878:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 366  881:goto            891
	//* 367  884:aload           8
	//* 368  886:bipush          12
	//* 369  888:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 370  891:aload           8
	//* 371  893:bipush          11
	//* 372  895:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 373  898:goto            965
	//* 374  901:aload           8
	//* 375  903:bipush          12
	//* 376  905:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 377  908:aload           8
	//* 378  910:bipush          14
	//* 379  912:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 380  915:goto            965
	//* 381  918:aload           8
	//* 382  920:bipush          12
	//* 383  922:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 384  925:aload           8
	//* 385  927:bipush          9
	//* 386  929:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 387  932:goto            965
	//* 388  935:aload           8
	//* 389  937:bipush          13
	//* 390  939:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 391  942:goto            965
	//* 392  945:aload           8
	//* 393  947:bipush          10
	//* 394  949:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 395  952:goto            908
	//* 396  955:aload           8
	//* 397  957:bipush          10
	//* 398  959:invokevirtual   #346 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 399  962:goto            925
	//* 400  965:aload_0         
	//* 401  966:getfield        #340 <Field LinearLayout zzbwh>
	//* 402  969:new             #348 <Class zzaac>
	//* 403  972:dup             
	//* 404  973:aload_0         
	//* 405  974:invokespecial   #351 <Method void zzaac(zzaab)>
	//* 406  977:invokevirtual   #355 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
	//* 407  980:aload_0         
	//* 408  981:getfield        #340 <Field LinearLayout zzbwh>
	//* 409  984:ldc2            #357 <String "Close button">
	//* 410  987:invokevirtual   #361 <Method void LinearLayout.setContentDescription(CharSequence)>
	//* 411  990:aload_0         
	//* 412  991:getfield        #308 <Field RelativeLayout zzbwj>
	//* 413  994:aload_0         
	//* 414  995:getfield        #340 <Field LinearLayout zzbwh>
	//* 415  998:aload           8
	//* 416 1000:invokevirtual   #364 <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 417 1003:aload_0         
	//* 418 1004:getfield        #153 <Field PopupWindow zzbwi>
	//* 419 1007:astore          8
	//* 420 1009:aload           7
	//* 421 1011:invokevirtual   #261 <Method View Window.getDecorView()>
	//* 422 1014:astore          7
	//* 423 1016:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 424 1019:pop             
	//* 425 1020:aload_0         
	//* 426 1021:getfield        #105 <Field Activity zzbvp>
	//* 427 1024:aload_1         
	//* 428 1025:iconst_0        
	//* 429 1026:iaload          
	//* 430 1027:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 431 1030:istore_2        
	//* 432 1031:invokestatic    #161 <Method zzamu zzkb.zzif()>
	//* 433 1034:pop             
	//* 434 1035:aload           8
	//* 435 1037:aload           7
	//* 436 1039:iconst_0        
	//* 437 1040:iload_2         
	//* 438 1041:aload_0         
	//* 439 1042:getfield        #105 <Field Activity zzbvp>
	//* 440 1045:aload_1         
	//* 441 1046:iconst_1        
	//* 442 1047:iaload          
	//* 443 1048:invokestatic    #166 <Method int zzamu.zza(android.content.Context, int)>
	//* 444 1051:invokevirtual   #368 <Method void PopupWindow.showAtLocation(View, int, int, int)>
	//* 445 1054:aload_1         
	//* 446 1055:iconst_0        
	//* 447 1056:iaload          
	//* 448 1057:istore_2        
	//* 449 1058:aload_1         
	//* 450 1059:iconst_1        
	//* 451 1060:iaload          
	//* 452 1061:istore          5
	//* 453 1063:aload_0         
	//* 454 1064:getfield        #107 <Field zzaam zzbmy>
	//* 455 1067:ifnull          1090
	//* 456 1070:aload_0         
	//* 457 1071:getfield        #107 <Field zzaam zzbmy>
	//* 458 1074:iload_2         
	//* 459 1075:iload           5
	//* 460 1077:aload_0         
	//* 461 1078:getfield        #89  <Field int zzuq>
	//* 462 1081:aload_0         
	//* 463 1082:getfield        #83  <Field int zzur>
	//* 464 1085:invokeinterface #372 <Method void zzaam.zza(int, int, int, int)>
	//* 465 1090:aload_0         
	//* 466 1091:getfield        #97  <Field zzaqw zzbnd>
	//* 467 1094:iload_3         
	//* 468 1095:iload           4
	//* 469 1097:invokestatic    #376 <Method zzasi zzasi.zzi(int, int)>
	//* 470 1100:invokeinterface #379 <Method void zzaqw.zza(zzasi)>
	//* 471 1105:aload_0         
	//* 472 1106:aload_1         
	//* 473 1107:iconst_0        
	//* 474 1108:iaload          
	//* 475 1109:aload_1         
	//* 476 1110:iconst_1        
	//* 477 1111:iaload          
	//* 478 1112:invokespecial   #179 <Method void zza(int, int)>
	//* 479 1115:aload_0         
	//* 480 1116:ldc2            #381 <String "resized">
	//* 481 1119:invokevirtual   #384 <Method void zzaal.zzby(String)>
	//* 482 1122:aload           6
	//* 483 1124:monitorexit     
	//* 484 1125:return          
	//* 485 1126:astore_1        
	//* 486 1127:aload_1         
	//* 487 1128:invokevirtual   #388 <Method String RuntimeException.getMessage()>
	//* 488 1131:invokestatic    #392 <Method String String.valueOf(Object)>
	//* 489 1134:astore_1        
	//* 490 1135:aload_1         
	//* 491 1136:invokevirtual   #395 <Method int String.length()>
	//* 492 1139:ifeq            1153
	//* 493 1142:ldc2            #397 <String "Cannot show popup window: ">
	//* 494 1145:aload_1         
	//* 495 1146:invokevirtual   #401 <Method String String.concat(String)>
	//* 496 1149:astore_1        
	//* 497 1150:goto            1164
	//* 498 1153:new             #43  <Class String>
	//* 499 1156:dup             
	//* 500 1157:ldc2            #397 <String "Cannot show popup window: ">
	//* 501 1160:invokespecial   #403 <Method void String(String)>
	//* 502 1163:astore_1        
	//* 503 1164:aload_0         
	//* 504 1165:aload_1         
	//* 505 1166:invokevirtual   #192 <Method void zzaal.zzbw(String)>
	//* 506 1169:aload_0         
	//* 507 1170:getfield        #308 <Field RelativeLayout zzbwj>
	//* 508 1173:aload_0         
	//* 509 1174:getfield        #97  <Field zzaqw zzbnd>
	//* 510 1177:invokeinterface #266 <Method View zzaqw.getView()>
	//* 511 1182:invokevirtual   #404 <Method void RelativeLayout.removeView(View)>
	//* 512 1185:aload_0         
	//* 513 1186:getfield        #280 <Field ViewGroup zzbwk>
	//* 514 1189:ifnull          1232
	//* 515 1192:aload_0         
	//* 516 1193:getfield        #280 <Field ViewGroup zzbwk>
	//* 517 1196:aload_0         
	//* 518 1197:getfield        #291 <Field ImageView zzbwg>
	//* 519 1200:invokevirtual   #278 <Method void ViewGroup.removeView(View)>
	//* 520 1203:aload_0         
	//* 521 1204:getfield        #280 <Field ViewGroup zzbwk>
	//* 522 1207:aload_0         
	//* 523 1208:getfield        #97  <Field zzaqw zzbnd>
	//* 524 1211:invokeinterface #266 <Method View zzaqw.getView()>
	//* 525 1216:invokevirtual   #300 <Method void ViewGroup.addView(View)>
	//* 526 1219:aload_0         
	//* 527 1220:getfield        #97  <Field zzaqw zzbnd>
	//* 528 1223:aload_0         
	//* 529 1224:getfield        #297 <Field zzasi zzbwf>
	//* 530 1227:invokeinterface #379 <Method void zzaqw.zza(zzasi)>
	//* 531 1232:aload           6
	//* 532 1234:monitorexit     
	//* 533 1235:return          
	//* 534 1236:aload_0         
	//* 535 1237:ldc2            #406 <String "Webview is detached, probably in the middle of a resize or expand.">
	//* 536 1240:invokevirtual   #192 <Method void zzaal.zzbw(String)>
	//* 537 1243:aload           6
	//* 538 1245:monitorexit     
	//* 539 1246:return          
	//* 540 1247:aload_0         
	//* 541 1248:ldc2            #408 <String "Activity context is not ready, cannot get window or decor view.">
	//* 542 1251:invokevirtual   #192 <Method void zzaal.zzbw(String)>
	//* 543 1254:aload           6
	//* 544 1256:monitorexit     
	//* 545 1257:return          
	//* 546 1258:astore_1        
	//* 547 1259:aload           6
	//* 548 1261:monitorexit     
	//* 549 1262:aload_1         
	//* 550 1263:athrow          
			i = 0;
	//  551 1264:iconst_0        
	//  552 1265:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_343;
		((zzaal)this).zzbw("Invalid width and height options. Cannot resize.");
		obj;
		JVM INSTR monitorexit ;
		return;
		obj1 = ((Object) (zzbvp.getWindow()));
		if(obj1 == null) goto _L2; else goto _L1
_L1:
		if(((Window) (obj1)).getDecorView() != null) goto _L3; else goto _L2
_L3:
		map = ((Map) (zzne()));
		if(map != null)
			break MISSING_BLOCK_LABEL_388;
		((zzaal)this).zzbw("Resize location out of screen or close button is not visible.");
		obj;
		JVM INSTR monitorexit ;
		return;
		zzkb.zzif();
		j = zzamu.zza(((android.content.Context) (zzbvp)), zzuq);
		zzkb.zzif();
		k = zzamu.zza(((android.content.Context) (zzbvp)), zzur);
		obj2 = ((Object) (zzbnd.getView().getParent()));
		if(obj2 == null) goto _L5; else goto _L4
_L4:
		if(!(obj2 instanceof ViewGroup)) goto _L5; else goto _L6
_L6:
		((ViewGroup)obj2).removeView(zzbnd.getView());
		if(zzbwi == null)
		{
			zzbwk = (ViewGroup)obj2;
			zzbv.zzek();
			obj2 = ((Object) (zzakk.zzs(zzbnd.getView())));
			zzbwg = new ImageView(((android.content.Context) (zzbvp)));
			zzbwg.setImageBitmap(((android.graphics.Bitmap) (obj2)));
			zzbwf = zzbnd.zzud();
			zzbwk.addView(((View) (zzbwg)));
			break MISSING_BLOCK_LABEL_557;
		}
		zzbwi.dismiss();
		zzbwj = new RelativeLayout(((android.content.Context) (zzbvp)));
		zzbwj.setBackgroundColor(0);
		zzbwj.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, k));
		zzbv.zzek();
		zzbwi = zzakk.zza(((View) (zzbwj)), j, k, false);
		zzbwi.setOutsideTouchable(true);
		zzbwi.setTouchable(true);
		zzbwi.setClippingEnabled(zzbwa ^ true);
		zzbwj.addView(zzbnd.getView(), -1, -1);
		zzbwh = new LinearLayout(((android.content.Context) (zzbvp)));
		zzkb.zzif();
		i = zzamu.zza(((android.content.Context) (zzbvp)), 50);
		zzkb.zzif();
		obj2 = ((Object) (new android.widget.RelativeLayout.LayoutParams(i, zzamu.zza(((android.content.Context) (zzbvp)), 50))));
		s = zzbvz;
		s.hashCode();
		JVM INSTR lookupswitch 6: default 1269
	//	               -1364013995: 859
	//	               -1012429441: 844
	//	               -655373719: 829
	//	               1163912186: 814
	//	               1288627767: 799
	//	               1755462605: 784;
		   goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L13:
		if(!s.equals("top-center")) goto _L7; else goto _L14
_L14:
		i = 1;
		  goto _L15
_L12:
		if(!s.equals("bottom-center")) goto _L7; else goto _L16
_L16:
		i = 4;
		  goto _L15
_L11:
		if(!s.equals("bottom-right")) goto _L7; else goto _L17
_L17:
		i = 5;
		  goto _L15
_L10:
		if(!s.equals("bottom-left")) goto _L7; else goto _L18
_L18:
		i = 3;
		  goto _L15
_L9:
		if(!s.equals("top-left")) goto _L7; else goto _L19
_L19:
		i = 0;
		  goto _L15
_L8:
		if(!s.equals("center")) goto _L7; else goto _L20
_L20:
		i = 2;
		  goto _L15
_L28:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		  goto _L21
_L34:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
_L21:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
		  goto _L22
_L33:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
_L23:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
		  goto _L22
_L32:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
_L24:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
		  goto _L22
_L31:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
		  goto _L22
_L30:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		  goto _L23
_L29:
		((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
		  goto _L24
_L22:
		zzbwh.setOnClickListener(((android.view.View.OnClickListener) (new zzaac(this))));
		zzbwh.setContentDescription("Close button");
		zzbwj.addView(((View) (zzbwh)), ((android.view.ViewGroup.LayoutParams) (obj2)));
		obj2 = ((Object) (zzbwi));
		obj1 = ((Object) (((Window) (obj1)).getDecorView()));
		zzkb.zzif();
		i = zzamu.zza(((android.content.Context) (zzbvp)), map[0]);
		zzkb.zzif();
		((PopupWindow) (obj2)).showAtLocation(((View) (obj1)), 0, i, zzamu.zza(((android.content.Context) (zzbvp)), map[1]));
		i = map[0];
		l = map[1];
		if(zzbmy != null)
			zzbmy.zza(i, l, zzuq, zzur);
		zzbnd.zza(zzasi.zzi(j, k));
		zza(map[0], map[1]);
		((zzaal)this).zzby("resized");
		obj;
		JVM INSTR monitorexit ;
		return;
		map;
		map = ((Map) (String.valueOf(((Object) (((RuntimeException) (map)).getMessage())))));
		if(((String) (map)).length() == 0) goto _L26; else goto _L25
_L25:
		map = ((Map) ("Cannot show popup window: ".concat(((String) (map)))));
		  goto _L27
_L26:
		map = ((Map) (new String("Cannot show popup window: ")));
_L27:
		((zzaal)this).zzbw(((String) (map)));
		zzbwj.removeView(zzbnd.getView());
		if(zzbwk != null)
		{
			zzbwk.removeView(((View) (zzbwg)));
			zzbwk.addView(zzbnd.getView());
			zzbnd.zza(zzbwf);
		}
		obj;
		JVM INSTR monitorexit ;
		return;
_L5:
		((zzaal)this).zzbw("Webview is detached, probably in the middle of a resize or expand.");
		obj;
		JVM INSTR monitorexit ;
		return;
_L2:
		((zzaal)this).zzbw("Activity context is not ready, cannot get window or decor view.");
		obj;
		JVM INSTR monitorexit ;
		return;
		map;
		obj;
		JVM INSTR monitorexit ;
		throw map;
	//* 553 1266:goto            329
_L7:
		i = -1;
	//  554 1269:iconst_m1       
	//  555 1270:istore_2        
_L15:
		i;
	//  556 1271:iload_2         
		JVM INSTR tableswitch 0 5: default 1312
	//	               0 955
	//	               1 945
	//	               2 935
	//	               3 918
	//	               4 901
	//	               5 884;
	//  557 1272:tableswitch     0 5: default 1312
	//	               0 955
	//	               1 945
	//	               2 935
	//	               3 918
	//	               4 901
	//	               5 884
		   goto _L28 _L29 _L30 _L31 _L32 _L33 _L34
	//* 558 1312:goto            874
	}

	public final void zzm(boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbwi == null)
			break MISSING_BLOCK_LABEL_131;
	//    5    7:aload_0         
	//    6    8:getfield        #153 <Field PopupWindow zzbwi>
	//    7   11:ifnull          131
		zzbwi.dismiss();
	//    8   14:aload_0         
	//    9   15:getfield        #153 <Field PopupWindow zzbwi>
	//   10   18:invokevirtual   #303 <Method void PopupWindow.dismiss()>
		zzbwj.removeView(zzbnd.getView());
	//   11   21:aload_0         
	//   12   22:getfield        #308 <Field RelativeLayout zzbwj>
	//   13   25:aload_0         
	//   14   26:getfield        #97  <Field zzaqw zzbnd>
	//   15   29:invokeinterface #266 <Method View zzaqw.getView()>
	//   16   34:invokevirtual   #404 <Method void RelativeLayout.removeView(View)>
		if(zzbwk != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #280 <Field ViewGroup zzbwk>
	//*  19   41:ifnull          84
		{
			zzbwk.removeView(((View) (zzbwg)));
	//   20   44:aload_0         
	//   21   45:getfield        #280 <Field ViewGroup zzbwk>
	//   22   48:aload_0         
	//   23   49:getfield        #291 <Field ImageView zzbwg>
	//   24   52:invokevirtual   #278 <Method void ViewGroup.removeView(View)>
			zzbwk.addView(zzbnd.getView());
	//   25   55:aload_0         
	//   26   56:getfield        #280 <Field ViewGroup zzbwk>
	//   27   59:aload_0         
	//   28   60:getfield        #97  <Field zzaqw zzbnd>
	//   29   63:invokeinterface #266 <Method View zzaqw.getView()>
	//   30   68:invokevirtual   #300 <Method void ViewGroup.addView(View)>
			zzbnd.zza(zzbwf);
	//   31   71:aload_0         
	//   32   72:getfield        #97  <Field zzaqw zzbnd>
	//   33   75:aload_0         
	//   34   76:getfield        #297 <Field zzasi zzbwf>
	//   35   79:invokeinterface #379 <Method void zzaqw.zza(zzasi)>
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_111;
	//   36   84:iload_1         
	//   37   85:ifeq            111
		((zzaal)this).zzby("default");
	//   38   88:aload_0         
	//   39   89:ldc2            #412 <String "default">
	//   40   92:invokevirtual   #384 <Method void zzaal.zzby(String)>
		if(zzbmy != null)
	//*  41   95:aload_0         
	//*  42   96:getfield        #107 <Field zzaam zzbmy>
	//*  43   99:ifnull          111
			zzbmy.zzcq();
	//   44  102:aload_0         
	//   45  103:getfield        #107 <Field zzaam zzbmy>
	//   46  106:invokeinterface #415 <Method void zzaam.zzcq()>
		zzbwi = null;
	//   47  111:aload_0         
	//   48  112:aconst_null     
	//   49  113:putfield        #153 <Field PopupWindow zzbwi>
		zzbwj = null;
	//   50  116:aload_0         
	//   51  117:aconst_null     
	//   52  118:putfield        #308 <Field RelativeLayout zzbwj>
		zzbwk = null;
	//   53  121:aload_0         
	//   54  122:aconst_null     
	//   55  123:putfield        #280 <Field ViewGroup zzbwk>
		zzbwh = null;
	//   56  126:aload_0         
	//   57  127:aconst_null     
	//   58  128:putfield        #340 <Field LinearLayout zzbwh>
		obj;
	//   59  131:aload_2         
		JVM INSTR monitorexit ;
	//   60  132:monitorexit     
		return;
	//   61  133:return          
		Exception exception;
		exception;
	//   62  134:astore_3        
		obj;
	//   63  135:aload_2         
		JVM INSTR monitorexit ;
	//   64  136:monitorexit     
		throw exception;
	//   65  137:aload_3         
	//   66  138:athrow          
	}

	public final boolean zznf()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzbwi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #153 <Field PopupWindow zzbwi>
	//*   7   11:ifnull          28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	private static final Set zzbvy = CollectionUtils.setOf(((Object []) (new String[] {
		"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
	})));
	private final Object mLock = new Object();
	private zzaam zzbmy;
	private final zzaqw zzbnd;
	private final Activity zzbvp;
	private String zzbvz;
	private boolean zzbwa;
	private int zzbwb;
	private int zzbwc;
	private int zzbwd;
	private int zzbwe;
	private zzasi zzbwf;
	private ImageView zzbwg;
	private LinearLayout zzbwh;
	private PopupWindow zzbwi;
	private RelativeLayout zzbwj;
	private ViewGroup zzbwk;
	private int zzuq;
	private int zzur;

	static 
	{
	//    0    0:bipush          7
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #45  <String "top-left">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #47  <String "top-right">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #49  <String "top-center">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #51  <String "center">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #53  <String "bottom-left">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #55  <String "bottom-right">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #57  <String "bottom-center">
	//   29   40:aastore         
	//   30   41:invokestatic    #63  <Method Set CollectionUtils.setOf(Object[])>
	//   31   44:putstatic       #65  <Field Set zzbvy>
	//*  32   47:return          
	}
}
