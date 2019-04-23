// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmf, bjo, bjm, bdn, 
//			bmb, bma, bdo, bmh, 
//			bme, bmc

public abstract class blz extends bmf
{

	public blz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void bmf()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void SparseArray()>
	//    6   12:putfield        #21  <Field SparseArray a>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class SparseBooleanArray>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void SparseBooleanArray()>
	//   11   23:putfield        #26  <Field SparseBooleanArray b>
		c = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #28  <Field int c>
	//   15   31:return          
	}

	public final bmh a(bdn abdn[], bjo bjo1)
	{
		int ai1[][][];
		Object aobj[];
		Object aobj1[];
		bjo bjo2;
		bjo abjo[];
		int ai2[];
label0:
		{
			aobj1 = ((Object []) (new int[abdn.length + 1]));
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:newarray        int[]
	//    5    6:astore          13
			bjm abjm[][] = new bjm[abdn.length + 1][];
	//    6    8:aload_1         
	//    7    9:arraylength     
	//    8   10:iconst_1        
	//    9   11:iadd            
	//   10   12:anewarray       bjm[][]
	//   11   15:astore          14
			ai1 = new int[abdn.length + 1][][];
	//   12   17:aload_1         
	//   13   18:arraylength     
	//   14   19:iconst_1        
	//   15   20:iadd            
	//   16   21:anewarray       int[][][]
	//   17   24:astore          11
			for(int i = 0; i < abjm.length; i++)
	//*  18   26:iconst_0        
	//*  19   27:istore_3        
	//*  20   28:iload_3         
	//*  21   29:aload           14
	//*  22   31:arraylength     
	//*  23   32:icmpge          64
			{
				abjm[i] = new bjm[bjo1.b];
	//   24   35:aload           14
	//   25   37:iload_3         
	//   26   38:aload_2         
	//   27   39:getfield        #38  <Field int bjo.b>
	//   28   42:anewarray       bjm[]
	//   29   45:aastore         
				ai1[i] = new int[bjo1.b][];
	//   30   46:aload           11
	//   31   48:iload_3         
	//   32   49:aload_2         
	//   33   50:getfield        #38  <Field int bjo.b>
	//   34   53:anewarray       int[][]
	//   35   56:aastore         
			}

	//   36   57:iload_3         
	//   37   58:iconst_1        
	//   38   59:iadd            
	//   39   60:istore_3        
	//*  40   61:goto            28
			aobj = ((Object []) (new int[abdn.length]));
	//   41   64:aload_1         
	//   42   65:arraylength     
	//   43   66:newarray        int[]
	//   44   68:astore          12
			for(int j = 0; j < aobj.length; j++)
	//*  45   70:iconst_0        
	//*  46   71:istore_3        
	//*  47   72:iload_3         
	//*  48   73:aload           12
	//*  49   75:arraylength     
	//*  50   76:icmpge          98
				aobj[j] = abdn[j].m();
	//   51   79:aload           12
	//   52   81:iload_3         
	//   53   82:aload_1         
	//   54   83:iload_3         
	//   55   84:aaload          
	//   56   85:invokeinterface #48  <Method int bdn.m()>
	//   57   90:iastore         

	//   58   91:iload_3         
	//   59   92:iconst_1        
	//   60   93:iadd            
	//   61   94:istore_3        
	//*  62   95:goto            72
			for(int k2 = 0; k2 < bjo1.b; k2++)
	//*  63   98:iconst_0        
	//*  64   99:istore          6
	//*  65  101:iload           6
	//*  66  103:aload_2         
	//*  67  104:getfield        #38  <Field int bjo.b>
	//*  68  107:icmpge          330
			{
				bjm bjm1 = bjo1.a(k2);
	//   69  110:aload_2         
	//   70  111:iload           6
	//   71  113:invokevirtual   #51  <Method bjm bjo.a(int)>
	//   72  116:astore          15
				int k1 = abdn.length;
	//   73  118:aload_1         
	//   74  119:arraylength     
	//   75  120:istore          4
				int k = 0;
	//   76  122:iconst_0        
	//   77  123:istore_3        
				int j2 = 0;
	//   78  124:iconst_0        
	//   79  125:istore          5
label1:
				do
				{
					if(k >= abdn.length)
						break;
	//   80  127:iload_3         
	//   81  128:aload_1         
	//   82  129:arraylength     
	//   83  130:icmpge          216
					bdn bdn1 = abdn[k];
	//   84  133:aload_1         
	//   85  134:iload_3         
	//   86  135:aaload          
	//   87  136:astore          10
					for(int l2 = 0; l2 < bjm1.a;)
	//*  88  138:iconst_0        
	//*  89  139:istore          7
	//*  90  141:iload           7
	//*  91  143:aload           15
	//*  92  145:getfield        #53  <Field int bjm.a>
	//*  93  148:icmpge          209
					{
						int j3 = bdn1.a(bjm1.a(l2)) & 3;
	//   94  151:aload           10
	//   95  153:aload           15
	//   96  155:iload           7
	//   97  157:invokevirtual   #56  <Method zzfs bjm.a(int)>
	//   98  160:invokeinterface #59  <Method int bdn.a(zzfs)>
	//   99  165:iconst_3        
	//  100  166:iand            
	//  101  167:istore          9
						int i3 = j2;
	//  102  169:iload           5
	//  103  171:istore          8
						if(j3 > j2)
	//* 104  173:iload           9
	//* 105  175:iload           5
	//* 106  177:icmple          196
						{
							k1 = k;
	//  107  180:iload_3         
	//  108  181:istore          4
							if(j3 == 3)
								break label1;
	//  109  183:iload           9
	//  110  185:iconst_3        
	//  111  186:icmpeq          216
							k1 = k;
	//  112  189:iload_3         
	//  113  190:istore          4
							i3 = j3;
	//  114  192:iload           9
	//  115  194:istore          8
						}
						l2++;
	//  116  196:iload           7
	//  117  198:iconst_1        
	//  118  199:iadd            
	//  119  200:istore          7
						j2 = i3;
	//  120  202:iload           8
	//  121  204:istore          5
					}

	//* 122  206:goto            141
					k++;
	//  123  209:iload_3         
	//  124  210:iconst_1        
	//  125  211:iadd            
	//  126  212:istore_3        
				} while(true);
	//  127  213:goto            127
				int ai[];
				if(k1 == abdn.length)
	//* 128  216:iload           4
	//* 129  218:aload_1         
	//* 130  219:arraylength     
	//* 131  220:icmpne          235
				{
					ai = new int[bjm1.a];
	//  132  223:aload           15
	//  133  225:getfield        #53  <Field int bjm.a>
	//  134  228:newarray        int[]
	//  135  230:astore          10
				} else
	//* 136  232:goto            285
				{
					bdn bdn2 = abdn[k1];
	//  137  235:aload_1         
	//  138  236:iload           4
	//  139  238:aaload          
	//  140  239:astore          16
					ai = new int[bjm1.a];
	//  141  241:aload           15
	//  142  243:getfield        #53  <Field int bjm.a>
	//  143  246:newarray        int[]
	//  144  248:astore          10
					for(k = 0; k < bjm1.a; k++)
	//* 145  250:iconst_0        
	//* 146  251:istore_3        
	//* 147  252:iload_3         
	//* 148  253:aload           15
	//* 149  255:getfield        #53  <Field int bjm.a>
	//* 150  258:icmpge          285
						ai[k] = bdn2.a(bjm1.a(k));
	//  151  261:aload           10
	//  152  263:iload_3         
	//  153  264:aload           16
	//  154  266:aload           15
	//  155  268:iload_3         
	//  156  269:invokevirtual   #56  <Method zzfs bjm.a(int)>
	//  157  272:invokeinterface #59  <Method int bdn.a(zzfs)>
	//  158  277:iastore         

	//  159  278:iload_3         
	//  160  279:iconst_1        
	//  161  280:iadd            
	//  162  281:istore_3        
				}
	//* 163  282:goto            252
				k = aobj1[k1];
	//  164  285:aload           13
	//  165  287:iload           4
	//  166  289:iaload          
	//  167  290:istore_3        
				abjm[k1][k] = bjm1;
	//  168  291:aload           14
	//  169  293:iload           4
	//  170  295:aaload          
	//  171  296:iload_3         
	//  172  297:aload           15
	//  173  299:aastore         
				ai1[k1][k] = ai;
	//  174  300:aload           11
	//  175  302:iload           4
	//  176  304:aaload          
	//  177  305:iload_3         
	//  178  306:aload           10
	//  179  308:aastore         
				aobj1[k1] = aobj1[k1] + 1;
	//  180  309:aload           13
	//  181  311:iload           4
	//  182  313:aload           13
	//  183  315:iload           4
	//  184  317:iaload          
	//  185  318:iconst_1        
	//  186  319:iadd            
	//  187  320:iastore         
			}

	//  188  321:iload           6
	//  189  323:iconst_1        
	//  190  324:iadd            
	//  191  325:istore          6
	//* 192  327:goto            101
			abjo = new bjo[abdn.length];
	//  193  330:aload_1         
	//  194  331:arraylength     
	//  195  332:anewarray       bjo[]
	//  196  335:astore          15
			ai2 = new int[abdn.length];
	//  197  337:aload_1         
	//  198  338:arraylength     
	//  199  339:newarray        int[]
	//  200  341:astore          16
			for(int l = 0; l < abdn.length; l++)
	//* 201  343:iconst_0        
	//* 202  344:istore_3        
	//* 203  345:iload_3         
	//* 204  346:aload_1         
	//* 205  347:arraylength     
	//* 206  348:icmpge          415
			{
				int l1 = aobj1[l];
	//  207  351:aload           13
	//  208  353:iload_3         
	//  209  354:iaload          
	//  210  355:istore          4
				abjo[l] = new bjo((bjm[])Arrays.copyOf(((Object []) (abjm[l])), l1));
	//  211  357:aload           15
	//  212  359:iload_3         
	//  213  360:new             #36  <Class bjo>
	//  214  363:dup             
	//  215  364:aload           14
	//  216  366:iload_3         
	//  217  367:aaload          
	//  218  368:iload           4
	//  219  370:invokestatic    #65  <Method Object[] Arrays.copyOf(Object[], int)>
	//  220  373:checkcast       #32  <Class bjm[]>
	//  221  376:invokespecial   #68  <Method void bjo(bjm[])>
	//  222  379:aastore         
				ai1[l] = (int[][])Arrays.copyOf(((Object []) (ai1[l])), l1);
	//  223  380:aload           11
	//  224  382:iload_3         
	//  225  383:aload           11
	//  226  385:iload_3         
	//  227  386:aaload          
	//  228  387:iload           4
	//  229  389:invokestatic    #65  <Method Object[] Arrays.copyOf(Object[], int)>
	//  230  392:checkcast       #34  <Class int[][]>
	//  231  395:aastore         
				ai2[l] = abdn[l].a();
	//  232  396:aload           16
	//  233  398:iload_3         
	//  234  399:aload_1         
	//  235  400:iload_3         
	//  236  401:aaload          
	//  237  402:invokeinterface #70  <Method int bdn.a()>
	//  238  407:iastore         
			}

	//  239  408:iload_3         
	//  240  409:iconst_1        
	//  241  410:iadd            
	//  242  411:istore_3        
	//* 243  412:goto            345
			int i1 = aobj1[abdn.length];
	//  244  415:aload           13
	//  245  417:aload_1         
	//  246  418:arraylength     
	//  247  419:iaload          
	//  248  420:istore_3        
			bjo2 = new bjo((bjm[])Arrays.copyOf(((Object []) (abjm[abdn.length])), i1));
	//  249  421:new             #36  <Class bjo>
	//  250  424:dup             
	//  251  425:aload           14
	//  252  427:aload_1         
	//  253  428:arraylength     
	//  254  429:aaload          
	//  255  430:iload_3         
	//  256  431:invokestatic    #65  <Method Object[] Arrays.copyOf(Object[], int)>
	//  257  434:checkcast       #32  <Class bjm[]>
	//  258  437:invokespecial   #68  <Method void bjo(bjm[])>
	//  259  440:astore          14
			aobj1 = ((Object []) (a(abdn, abjo, ai1)));
	//  260  442:aload_0         
	//  261  443:aload_1         
	//  262  444:aload           15
	//  263  446:aload           11
	//  264  448:invokevirtual   #73  <Method bmc[] a(bdn[], bjo[], int[][][])>
	//  265  451:astore          13
			i1 = 0;
	//  266  453:iconst_0        
	//  267  454:istore_3        
			do
			{
				int i2 = abdn.length;
	//  268  455:aload_1         
	//  269  456:arraylength     
	//  270  457:istore          4
				bmb bmb1 = null;
	//  271  459:aconst_null     
	//  272  460:astore          10
				if(i1 >= i2)
					break label0;
	//  273  462:iload_3         
	//  274  463:iload           4
	//  275  465:icmpge          548
				if(b.get(i1))
	//* 276  468:aload_0         
	//* 277  469:getfield        #26  <Field SparseBooleanArray b>
	//* 278  472:iload_3         
	//* 279  473:invokevirtual   #77  <Method boolean SparseBooleanArray.get(int)>
	//* 280  476:ifeq            487
				{
					aobj1[i1] = null;
	//  281  479:aload           13
	//  282  481:iload_3         
	//  283  482:aconst_null     
	//  284  483:aastore         
				} else
	//* 285  484:goto            533
				{
					bjo bjo3 = abjo[i1];
	//  286  487:aload           15
	//  287  489:iload_3         
	//  288  490:aaload          
	//  289  491:astore          17
					Map map = (Map)a.get(i1);
	//  290  493:aload_0         
	//  291  494:getfield        #21  <Field SparseArray a>
	//  292  497:iload_3         
	//  293  498:invokevirtual   #80  <Method Object SparseArray.get(int)>
	//  294  501:checkcast       #82  <Class Map>
	//  295  504:astore          18
					if(map != null)
	//* 296  506:aload           18
	//* 297  508:ifnonnull       514
	//* 298  511:goto            528
						bmb1 = (bmb)map.get(((Object) (bjo3)));
	//  299  514:aload           18
	//  300  516:aload           17
	//  301  518:invokeinterface #85  <Method Object Map.get(Object)>
	//  302  523:checkcast       #87  <Class bmb>
	//  303  526:astore          10
					if(bmb1 != null)
						break;
	//  304  528:aload           10
	//  305  530:ifnonnull       540
				}
				i1++;
	//  306  533:iload_3         
	//  307  534:iconst_1        
	//  308  535:iadd            
	//  309  536:istore_3        
			} while(true);
	//  310  537:goto            455
			throw new NoSuchMethodError();
	//  311  540:new             #89  <Class NoSuchMethodError>
	//  312  543:dup             
	//  313  544:invokespecial   #90  <Method void NoSuchMethodError()>
	//  314  547:athrow          
		}
		bma bma1 = new bma(ai2, abjo, ((int []) (aobj)), ai1, bjo2);
	//  315  548:new             #92  <Class bma>
	//  316  551:dup             
	//  317  552:aload           16
	//  318  554:aload           15
	//  319  556:aload           12
	//  320  558:aload           11
	//  321  560:aload           14
	//  322  562:invokespecial   #95  <Method void bma(int[], bjo[], int[], int[][][], bjo)>
	//  323  565:astore          11
		aobj = ((Object []) (new bdo[abdn.length]));
	//  324  567:aload_1         
	//  325  568:arraylength     
	//  326  569:anewarray       bdo[]
	//  327  572:astore          12
		for(int j1 = 0; j1 < abdn.length; j1++)
	//* 328  574:iconst_0        
	//* 329  575:istore_3        
	//* 330  576:iload_3         
	//* 331  577:aload_1         
	//* 332  578:arraylength     
	//* 333  579:icmpge          613
		{
			bdo bdo1;
			if(aobj1[j1] != null)
	//* 334  582:aload           13
	//* 335  584:iload_3         
	//* 336  585:aaload          
	//* 337  586:ifnull          597
				bdo1 = bdo.a;
	//  338  589:getstatic       #100 <Field bdo bdo.a>
	//  339  592:astore          10
			else
	//* 340  594:goto            600
				bdo1 = null;
	//  341  597:aconst_null     
	//  342  598:astore          10
			aobj[j1] = bdo1;
	//  343  600:aload           12
	//  344  602:iload_3         
	//  345  603:aload           10
	//  346  605:aastore         
		}

	//  347  606:iload_3         
	//  348  607:iconst_1        
	//  349  608:iadd            
	//  350  609:istore_3        
	//* 351  610:goto            576
		return new bmh(bjo1, new bme(((bmc []) (aobj1))), ((Object) (bma1)), ((bdo []) (aobj)));
	//  352  613:new             #102 <Class bmh>
	//  353  616:dup             
	//  354  617:aload_2         
	//  355  618:new             #104 <Class bme>
	//  356  621:dup             
	//  357  622:aload           13
	//  358  624:invokespecial   #107 <Method void bme(bmc[])>
	//  359  627:aload           11
	//  360  629:aload           12
	//  361  631:invokespecial   #110 <Method void bmh(bjo, bme, Object, bdo[])>
	//  362  634:areturn         
	}

	public final void a(int i, boolean flag)
	{
		if(b.get(i) == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field SparseBooleanArray b>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #77  <Method boolean SparseBooleanArray.get(int)>
	//*   4    8:iload_2         
	//*   5    9:icmpne          13
		{
			return;
	//    6   12:return          
		} else
		{
			b.put(i, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field SparseBooleanArray b>
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #114 <Method void SparseBooleanArray.put(int, boolean)>
			((bmf)this).a();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #116 <Method void bmf.a()>
			return;
	//   14   26:return          
		}
	}

	public final void a(Object obj)
	{
		d = (bma)obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #92  <Class bma>
	//    3    5:putfield        #119 <Field bma d>
	//    4    8:return          
	}

	protected abstract bmc[] a(bdn abdn[], bjo abjo[], int ai[][][]);

	private final SparseArray a = new SparseArray();
	private final SparseBooleanArray b = new SparseBooleanArray();
	private int c;
	private bma d;
}
