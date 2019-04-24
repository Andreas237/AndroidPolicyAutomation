// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfNumber

public class PdfTransition
{

	public PdfTransition()
	{
		this(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokespecial   #44  <Method void PdfTransition(int)>
	//    3    6:return          
	}

	public PdfTransition(int i)
	{
		this(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #48  <Method void PdfTransition(int, int)>
	//    4    6:return          
	}

	public PdfTransition(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		duration = j;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #52  <Field int duration>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #54  <Field int type>
	//    8   14:return          
	}

	public int getDuration()
	{
		return duration;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int duration>
	//    2    4:ireturn         
	}

	public PdfDictionary getTransitionDictionary()
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.TRANS);
	//    0    0:new             #60  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #66  <Field PdfName PdfName.TRANS>
	//    3    7:invokespecial   #69  <Method void PdfDictionary(PdfName)>
	//    4   10:astore_1        
		switch(type)
	//*   5   11:aload_0         
	//*   6   12:getfield        #54  <Field int type>
		{
	//*   7   15:tableswitch     1 16: default 92
	//	               1 94
	//	               2 144
	//	               3 194
	//	               4 244
	//	               5 294
	//	               6 334
	//	               7 374
	//	               8 414
	//	               9 454
	//	               10 499
	//	               11 546
	//	               12 592
	//	               13 639
	//	               14 669
	//	               15 714
	//	               16 761
		default:
			return pdfdictionary;
	//    8   92:aload_1         
	//    9   93:areturn         

		case 1: // '\001'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.SPLIT)));
	//   10   94:aload_1         
	//   11   95:getstatic       #72  <Field PdfName PdfName.S>
	//   12   98:getstatic       #75  <Field PdfName PdfName.SPLIT>
	//   13  101:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//   14  104:aload_1         
	//   15  105:getstatic       #82  <Field PdfName PdfName.D>
	//   16  108:new             #84  <Class PdfNumber>
	//   17  111:dup             
	//   18  112:aload_0         
	//   19  113:getfield        #52  <Field int duration>
	//   20  116:invokespecial   #85  <Method void PdfNumber(int)>
	//   21  119:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.V)));
	//   22  122:aload_1         
	//   23  123:getstatic       #88  <Field PdfName PdfName.DM>
	//   24  126:getstatic       #91  <Field PdfName PdfName.V>
	//   25  129:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.O)));
	//   26  132:aload_1         
	//   27  133:getstatic       #94  <Field PdfName PdfName.M>
	//   28  136:getstatic       #97  <Field PdfName PdfName.O>
	//   29  139:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//   30  142:aload_1         
	//   31  143:areturn         

		case 2: // '\002'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.SPLIT)));
	//   32  144:aload_1         
	//   33  145:getstatic       #72  <Field PdfName PdfName.S>
	//   34  148:getstatic       #75  <Field PdfName PdfName.SPLIT>
	//   35  151:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//   36  154:aload_1         
	//   37  155:getstatic       #82  <Field PdfName PdfName.D>
	//   38  158:new             #84  <Class PdfNumber>
	//   39  161:dup             
	//   40  162:aload_0         
	//   41  163:getfield        #52  <Field int duration>
	//   42  166:invokespecial   #85  <Method void PdfNumber(int)>
	//   43  169:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.H)));
	//   44  172:aload_1         
	//   45  173:getstatic       #88  <Field PdfName PdfName.DM>
	//   46  176:getstatic       #100 <Field PdfName PdfName.H>
	//   47  179:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.O)));
	//   48  182:aload_1         
	//   49  183:getstatic       #94  <Field PdfName PdfName.M>
	//   50  186:getstatic       #97  <Field PdfName PdfName.O>
	//   51  189:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//   52  192:aload_1         
	//   53  193:areturn         

		case 3: // '\003'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.SPLIT)));
	//   54  194:aload_1         
	//   55  195:getstatic       #72  <Field PdfName PdfName.S>
	//   56  198:getstatic       #75  <Field PdfName PdfName.SPLIT>
	//   57  201:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//   58  204:aload_1         
	//   59  205:getstatic       #82  <Field PdfName PdfName.D>
	//   60  208:new             #84  <Class PdfNumber>
	//   61  211:dup             
	//   62  212:aload_0         
	//   63  213:getfield        #52  <Field int duration>
	//   64  216:invokespecial   #85  <Method void PdfNumber(int)>
	//   65  219:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.V)));
	//   66  222:aload_1         
	//   67  223:getstatic       #88  <Field PdfName PdfName.DM>
	//   68  226:getstatic       #91  <Field PdfName PdfName.V>
	//   69  229:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.I)));
	//   70  232:aload_1         
	//   71  233:getstatic       #94  <Field PdfName PdfName.M>
	//   72  236:getstatic       #102 <Field PdfName PdfName.I>
	//   73  239:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//   74  242:aload_1         
	//   75  243:areturn         

		case 4: // '\004'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.SPLIT)));
	//   76  244:aload_1         
	//   77  245:getstatic       #72  <Field PdfName PdfName.S>
	//   78  248:getstatic       #75  <Field PdfName PdfName.SPLIT>
	//   79  251:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//   80  254:aload_1         
	//   81  255:getstatic       #82  <Field PdfName PdfName.D>
	//   82  258:new             #84  <Class PdfNumber>
	//   83  261:dup             
	//   84  262:aload_0         
	//   85  263:getfield        #52  <Field int duration>
	//   86  266:invokespecial   #85  <Method void PdfNumber(int)>
	//   87  269:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.H)));
	//   88  272:aload_1         
	//   89  273:getstatic       #88  <Field PdfName PdfName.DM>
	//   90  276:getstatic       #100 <Field PdfName PdfName.H>
	//   91  279:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.I)));
	//   92  282:aload_1         
	//   93  283:getstatic       #94  <Field PdfName PdfName.M>
	//   94  286:getstatic       #102 <Field PdfName PdfName.I>
	//   95  289:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//   96  292:aload_1         
	//   97  293:areturn         

		case 5: // '\005'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.BLINDS)));
	//   98  294:aload_1         
	//   99  295:getstatic       #72  <Field PdfName PdfName.S>
	//  100  298:getstatic       #105 <Field PdfName PdfName.BLINDS>
	//  101  301:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  102  304:aload_1         
	//  103  305:getstatic       #82  <Field PdfName PdfName.D>
	//  104  308:new             #84  <Class PdfNumber>
	//  105  311:dup             
	//  106  312:aload_0         
	//  107  313:getfield        #52  <Field int duration>
	//  108  316:invokespecial   #85  <Method void PdfNumber(int)>
	//  109  319:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.V)));
	//  110  322:aload_1         
	//  111  323:getstatic       #88  <Field PdfName PdfName.DM>
	//  112  326:getstatic       #91  <Field PdfName PdfName.V>
	//  113  329:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  114  332:aload_1         
	//  115  333:areturn         

		case 6: // '\006'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.BLINDS)));
	//  116  334:aload_1         
	//  117  335:getstatic       #72  <Field PdfName PdfName.S>
	//  118  338:getstatic       #105 <Field PdfName PdfName.BLINDS>
	//  119  341:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  120  344:aload_1         
	//  121  345:getstatic       #82  <Field PdfName PdfName.D>
	//  122  348:new             #84  <Class PdfNumber>
	//  123  351:dup             
	//  124  352:aload_0         
	//  125  353:getfield        #52  <Field int duration>
	//  126  356:invokespecial   #85  <Method void PdfNumber(int)>
	//  127  359:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DM, ((PdfObject) (PdfName.H)));
	//  128  362:aload_1         
	//  129  363:getstatic       #88  <Field PdfName PdfName.DM>
	//  130  366:getstatic       #100 <Field PdfName PdfName.H>
	//  131  369:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  132  372:aload_1         
	//  133  373:areturn         

		case 7: // '\007'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.BOX)));
	//  134  374:aload_1         
	//  135  375:getstatic       #72  <Field PdfName PdfName.S>
	//  136  378:getstatic       #108 <Field PdfName PdfName.BOX>
	//  137  381:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  138  384:aload_1         
	//  139  385:getstatic       #82  <Field PdfName PdfName.D>
	//  140  388:new             #84  <Class PdfNumber>
	//  141  391:dup             
	//  142  392:aload_0         
	//  143  393:getfield        #52  <Field int duration>
	//  144  396:invokespecial   #85  <Method void PdfNumber(int)>
	//  145  399:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.I)));
	//  146  402:aload_1         
	//  147  403:getstatic       #94  <Field PdfName PdfName.M>
	//  148  406:getstatic       #102 <Field PdfName PdfName.I>
	//  149  409:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  150  412:aload_1         
	//  151  413:areturn         

		case 8: // '\b'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.BOX)));
	//  152  414:aload_1         
	//  153  415:getstatic       #72  <Field PdfName PdfName.S>
	//  154  418:getstatic       #108 <Field PdfName PdfName.BOX>
	//  155  421:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  156  424:aload_1         
	//  157  425:getstatic       #82  <Field PdfName PdfName.D>
	//  158  428:new             #84  <Class PdfNumber>
	//  159  431:dup             
	//  160  432:aload_0         
	//  161  433:getfield        #52  <Field int duration>
	//  162  436:invokespecial   #85  <Method void PdfNumber(int)>
	//  163  439:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.M, ((PdfObject) (PdfName.O)));
	//  164  442:aload_1         
	//  165  443:getstatic       #94  <Field PdfName PdfName.M>
	//  166  446:getstatic       #97  <Field PdfName PdfName.O>
	//  167  449:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  168  452:aload_1         
	//  169  453:areturn         

		case 9: // '\t'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.WIPE)));
	//  170  454:aload_1         
	//  171  455:getstatic       #72  <Field PdfName PdfName.S>
	//  172  458:getstatic       #111 <Field PdfName PdfName.WIPE>
	//  173  461:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  174  464:aload_1         
	//  175  465:getstatic       #82  <Field PdfName PdfName.D>
	//  176  468:new             #84  <Class PdfNumber>
	//  177  471:dup             
	//  178  472:aload_0         
	//  179  473:getfield        #52  <Field int duration>
	//  180  476:invokespecial   #85  <Method void PdfNumber(int)>
	//  181  479:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(0))));
	//  182  482:aload_1         
	//  183  483:getstatic       #114 <Field PdfName PdfName.DI>
	//  184  486:new             #84  <Class PdfNumber>
	//  185  489:dup             
	//  186  490:iconst_0        
	//  187  491:invokespecial   #85  <Method void PdfNumber(int)>
	//  188  494:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  189  497:aload_1         
	//  190  498:areturn         

		case 10: // '\n'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.WIPE)));
	//  191  499:aload_1         
	//  192  500:getstatic       #72  <Field PdfName PdfName.S>
	//  193  503:getstatic       #111 <Field PdfName PdfName.WIPE>
	//  194  506:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  195  509:aload_1         
	//  196  510:getstatic       #82  <Field PdfName PdfName.D>
	//  197  513:new             #84  <Class PdfNumber>
	//  198  516:dup             
	//  199  517:aload_0         
	//  200  518:getfield        #52  <Field int duration>
	//  201  521:invokespecial   #85  <Method void PdfNumber(int)>
	//  202  524:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(180))));
	//  203  527:aload_1         
	//  204  528:getstatic       #114 <Field PdfName PdfName.DI>
	//  205  531:new             #84  <Class PdfNumber>
	//  206  534:dup             
	//  207  535:sipush          180
	//  208  538:invokespecial   #85  <Method void PdfNumber(int)>
	//  209  541:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  210  544:aload_1         
	//  211  545:areturn         

		case 11: // '\013'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.WIPE)));
	//  212  546:aload_1         
	//  213  547:getstatic       #72  <Field PdfName PdfName.S>
	//  214  550:getstatic       #111 <Field PdfName PdfName.WIPE>
	//  215  553:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  216  556:aload_1         
	//  217  557:getstatic       #82  <Field PdfName PdfName.D>
	//  218  560:new             #84  <Class PdfNumber>
	//  219  563:dup             
	//  220  564:aload_0         
	//  221  565:getfield        #52  <Field int duration>
	//  222  568:invokespecial   #85  <Method void PdfNumber(int)>
	//  223  571:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(90))));
	//  224  574:aload_1         
	//  225  575:getstatic       #114 <Field PdfName PdfName.DI>
	//  226  578:new             #84  <Class PdfNumber>
	//  227  581:dup             
	//  228  582:bipush          90
	//  229  584:invokespecial   #85  <Method void PdfNumber(int)>
	//  230  587:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  231  590:aload_1         
	//  232  591:areturn         

		case 12: // '\f'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.WIPE)));
	//  233  592:aload_1         
	//  234  593:getstatic       #72  <Field PdfName PdfName.S>
	//  235  596:getstatic       #111 <Field PdfName PdfName.WIPE>
	//  236  599:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  237  602:aload_1         
	//  238  603:getstatic       #82  <Field PdfName PdfName.D>
	//  239  606:new             #84  <Class PdfNumber>
	//  240  609:dup             
	//  241  610:aload_0         
	//  242  611:getfield        #52  <Field int duration>
	//  243  614:invokespecial   #85  <Method void PdfNumber(int)>
	//  244  617:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(270))));
	//  245  620:aload_1         
	//  246  621:getstatic       #114 <Field PdfName PdfName.DI>
	//  247  624:new             #84  <Class PdfNumber>
	//  248  627:dup             
	//  249  628:sipush          270
	//  250  631:invokespecial   #85  <Method void PdfNumber(int)>
	//  251  634:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  252  637:aload_1         
	//  253  638:areturn         

		case 13: // '\r'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.DISSOLVE)));
	//  254  639:aload_1         
	//  255  640:getstatic       #72  <Field PdfName PdfName.S>
	//  256  643:getstatic       #116 <Field PdfName PdfName.DISSOLVE>
	//  257  646:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  258  649:aload_1         
	//  259  650:getstatic       #82  <Field PdfName PdfName.D>
	//  260  653:new             #84  <Class PdfNumber>
	//  261  656:dup             
	//  262  657:aload_0         
	//  263  658:getfield        #52  <Field int duration>
	//  264  661:invokespecial   #85  <Method void PdfNumber(int)>
	//  265  664:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  266  667:aload_1         
	//  267  668:areturn         

		case 14: // '\016'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.GLITTER)));
	//  268  669:aload_1         
	//  269  670:getstatic       #72  <Field PdfName PdfName.S>
	//  270  673:getstatic       #119 <Field PdfName PdfName.GLITTER>
	//  271  676:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  272  679:aload_1         
	//  273  680:getstatic       #82  <Field PdfName PdfName.D>
	//  274  683:new             #84  <Class PdfNumber>
	//  275  686:dup             
	//  276  687:aload_0         
	//  277  688:getfield        #52  <Field int duration>
	//  278  691:invokespecial   #85  <Method void PdfNumber(int)>
	//  279  694:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(0))));
	//  280  697:aload_1         
	//  281  698:getstatic       #114 <Field PdfName PdfName.DI>
	//  282  701:new             #84  <Class PdfNumber>
	//  283  704:dup             
	//  284  705:iconst_0        
	//  285  706:invokespecial   #85  <Method void PdfNumber(int)>
	//  286  709:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  287  712:aload_1         
	//  288  713:areturn         

		case 15: // '\017'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.GLITTER)));
	//  289  714:aload_1         
	//  290  715:getstatic       #72  <Field PdfName PdfName.S>
	//  291  718:getstatic       #119 <Field PdfName PdfName.GLITTER>
	//  292  721:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  293  724:aload_1         
	//  294  725:getstatic       #82  <Field PdfName PdfName.D>
	//  295  728:new             #84  <Class PdfNumber>
	//  296  731:dup             
	//  297  732:aload_0         
	//  298  733:getfield        #52  <Field int duration>
	//  299  736:invokespecial   #85  <Method void PdfNumber(int)>
	//  300  739:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(270))));
	//  301  742:aload_1         
	//  302  743:getstatic       #114 <Field PdfName PdfName.DI>
	//  303  746:new             #84  <Class PdfNumber>
	//  304  749:dup             
	//  305  750:sipush          270
	//  306  753:invokespecial   #85  <Method void PdfNumber(int)>
	//  307  756:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary;
	//  308  759:aload_1         
	//  309  760:areturn         

		case 16: // '\020'
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.GLITTER)));
	//  310  761:aload_1         
	//  311  762:getstatic       #72  <Field PdfName PdfName.S>
	//  312  765:getstatic       #119 <Field PdfName PdfName.GLITTER>
	//  313  768:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
			break;
		}
		pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfNumber(duration))));
	//  314  771:aload_1         
	//  315  772:getstatic       #82  <Field PdfName PdfName.D>
	//  316  775:new             #84  <Class PdfNumber>
	//  317  778:dup             
	//  318  779:aload_0         
	//  319  780:getfield        #52  <Field int duration>
	//  320  783:invokespecial   #85  <Method void PdfNumber(int)>
	//  321  786:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.DI, ((PdfObject) (new PdfNumber(315))));
	//  322  789:aload_1         
	//  323  790:getstatic       #114 <Field PdfName PdfName.DI>
	//  324  793:new             #84  <Class PdfNumber>
	//  325  796:dup             
	//  326  797:sipush          315
	//  327  800:invokespecial   #85  <Method void PdfNumber(int)>
	//  328  803:invokevirtual   #79  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//  329  806:aload_1         
	//  330  807:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int type>
	//    2    4:ireturn         
	}

	public static final int BLINDH = 6;
	public static final int BLINDV = 5;
	public static final int BTWIPE = 11;
	public static final int DGLITTER = 16;
	public static final int DISSOLVE = 13;
	public static final int INBOX = 7;
	public static final int LRGLITTER = 14;
	public static final int LRWIPE = 9;
	public static final int OUTBOX = 8;
	public static final int RLWIPE = 10;
	public static final int SPLITHIN = 4;
	public static final int SPLITHOUT = 2;
	public static final int SPLITVIN = 3;
	public static final int SPLITVOUT = 1;
	public static final int TBGLITTER = 15;
	public static final int TBWIPE = 12;
	protected int duration;
	protected int type;
}
