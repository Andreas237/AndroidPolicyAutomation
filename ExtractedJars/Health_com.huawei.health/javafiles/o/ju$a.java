// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import org.json.JSONObject;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package o:
//			ju, jt, jz, ke

static class ju$a extends DefaultHandler
{

	public void characters(char ac[], int i, int j)
	{
		e = String.valueOf(ac, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #35  <Method String String.valueOf(char[], int, int)>
	//    5    7:putfield        #24  <Field String e>
	//    6   10:return          
	}

	public void endElement(String s, String s1, String s2)
	{
		if(s1.equals("retype"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #41  <String "retype">
	//*   2    3:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            23
			d.g(e);
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field jt d>
	//    6   13:aload_0         
	//    7   14:getfield        #24  <Field String e>
	//    8   17:invokevirtual   #49  <Method void jt.g(String)>
		else
	//*   9   20:goto            655
		if(s1.equals("adcode"))
	//*  10   23:aload_2         
	//*  11   24:ldc1            #51  <String "adcode">
	//*  12   26:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  13   29:ifeq            46
			d.p(e);
	//   14   32:aload_0         
	//   15   33:getfield        #20  <Field jt d>
	//   16   36:aload_0         
	//   17   37:getfield        #24  <Field String e>
	//   18   40:invokevirtual   #54  <Method void jt.p(String)>
		else
	//*  19   43:goto            655
		if(s1.equals("citycode"))
	//*  20   46:aload_2         
	//*  21   47:ldc1            #56  <String "citycode">
	//*  22   49:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  23   52:ifeq            69
			d.k(e);
	//   24   55:aload_0         
	//   25   56:getfield        #20  <Field jt d>
	//   26   59:aload_0         
	//   27   60:getfield        #24  <Field String e>
	//   28   63:invokevirtual   #59  <Method void jt.k(String)>
		else
	//*  29   66:goto            655
		if(s1.equals("radius"))
	//*  30   69:aload_2         
	//*  31   70:ldc1            #61  <String "radius">
	//*  32   72:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  33   75:ifeq            115
			try
			{
				d.b(Float.valueOf(e).floatValue());
	//   34   78:aload_0         
	//   35   79:getfield        #20  <Field jt d>
	//   36   82:aload_0         
	//   37   83:getfield        #24  <Field String e>
	//   38   86:invokestatic    #66  <Method Float Float.valueOf(String)>
	//   39   89:invokevirtual   #70  <Method float Float.floatValue()>
	//   40   92:invokevirtual   #74  <Method void jt.b(float)>
			}
	//*  41   95:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  42   98:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//   43   99:aload_1         
	//   44  100:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				d.b(3891F);
	//   45  103:aload_0         
	//   46  104:getfield        #20  <Field jt d>
	//   47  107:ldc1            #78  <Float 3891F>
	//   48  109:invokevirtual   #74  <Method void jt.b(float)>
			}
		else
	//*  49  112:goto            655
		if(s1.equals("cenx"))
	//*  50  115:aload_2         
	//*  51  116:ldc1            #80  <String "cenx">
	//*  52  118:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  53  121:ifeq            176
			try
			{
				e = jz.e(((Object) (Double.valueOf(e))), "#.000000");
	//   54  124:aload_0         
	//   55  125:aload_0         
	//   56  126:getfield        #24  <Field String e>
	//   57  129:invokestatic    #85  <Method Double Double.valueOf(String)>
	//   58  132:ldc1            #87  <String "#.000000">
	//   59  134:invokestatic    #92  <Method String jz.e(Object, String)>
	//   60  137:putfield        #24  <Field String e>
				d.d(Double.valueOf(e).doubleValue());
	//   61  140:aload_0         
	//   62  141:getfield        #20  <Field jt d>
	//   63  144:aload_0         
	//   64  145:getfield        #24  <Field String e>
	//   65  148:invokestatic    #85  <Method Double Double.valueOf(String)>
	//   66  151:invokevirtual   #96  <Method double Double.doubleValue()>
	//   67  154:invokevirtual   #99  <Method void jt.d(double)>
			}
	//*  68  157:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  69  160:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//   70  161:aload_1         
	//   71  162:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				d.d(0.0D);
	//   72  165:aload_0         
	//   73  166:getfield        #20  <Field jt d>
	//   74  169:dconst_0        
	//   75  170:invokevirtual   #99  <Method void jt.d(double)>
			}
		else
	//*  76  173:goto            655
		if(s1.equals("ceny"))
	//*  77  176:aload_2         
	//*  78  177:ldc1            #101 <String "ceny">
	//*  79  179:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  80  182:ifeq            237
			try
			{
				e = jz.e(((Object) (Double.valueOf(e))), "#.000000");
	//   81  185:aload_0         
	//   82  186:aload_0         
	//   83  187:getfield        #24  <Field String e>
	//   84  190:invokestatic    #85  <Method Double Double.valueOf(String)>
	//   85  193:ldc1            #87  <String "#.000000">
	//   86  195:invokestatic    #92  <Method String jz.e(Object, String)>
	//   87  198:putfield        #24  <Field String e>
				d.a(Double.valueOf(e).doubleValue());
	//   88  201:aload_0         
	//   89  202:getfield        #20  <Field jt d>
	//   90  205:aload_0         
	//   91  206:getfield        #24  <Field String e>
	//   92  209:invokestatic    #85  <Method Double Double.valueOf(String)>
	//   93  212:invokevirtual   #96  <Method double Double.doubleValue()>
	//   94  215:invokevirtual   #103 <Method void jt.a(double)>
			}
	//*  95  218:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  96  221:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//   97  222:aload_1         
	//   98  223:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				d.a(0.0D);
	//   99  226:aload_0         
	//  100  227:getfield        #20  <Field jt d>
	//  101  230:dconst_0        
	//  102  231:invokevirtual   #103 <Method void jt.a(double)>
			}
		else
	//* 103  234:goto            655
		if(s1.equals("desc"))
	//* 104  237:aload_2         
	//* 105  238:ldc1            #105 <String "desc">
	//* 106  240:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 107  243:ifeq            260
			d.i(e);
	//  108  246:aload_0         
	//  109  247:getfield        #20  <Field jt d>
	//  110  250:aload_0         
	//  111  251:getfield        #24  <Field String e>
	//  112  254:invokevirtual   #108 <Method void jt.i(String)>
		else
	//* 113  257:goto            655
		if(s1.equals("country"))
	//* 114  260:aload_2         
	//* 115  261:ldc1            #110 <String "country">
	//* 116  263:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 117  266:ifeq            283
			d.o(e);
	//  118  269:aload_0         
	//  119  270:getfield        #20  <Field jt d>
	//  120  273:aload_0         
	//  121  274:getfield        #24  <Field String e>
	//  122  277:invokevirtual   #113 <Method void jt.o(String)>
		else
	//* 123  280:goto            655
		if(s1.equals("province"))
	//* 124  283:aload_2         
	//* 125  284:ldc1            #115 <String "province">
	//* 126  286:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 127  289:ifeq            306
			d.m(e);
	//  128  292:aload_0         
	//  129  293:getfield        #20  <Field jt d>
	//  130  296:aload_0         
	//  131  297:getfield        #24  <Field String e>
	//  132  300:invokevirtual   #118 <Method void jt.m(String)>
		else
	//* 133  303:goto            655
		if(s1.equals("city"))
	//* 134  306:aload_2         
	//* 135  307:ldc1            #120 <String "city">
	//* 136  309:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 137  312:ifeq            329
			d.n(e);
	//  138  315:aload_0         
	//  139  316:getfield        #20  <Field jt d>
	//  140  319:aload_0         
	//  141  320:getfield        #24  <Field String e>
	//  142  323:invokevirtual   #123 <Method void jt.n(String)>
		else
	//* 143  326:goto            655
		if(s1.equals("road"))
	//* 144  329:aload_2         
	//* 145  330:ldc1            #125 <String "road">
	//* 146  332:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 147  335:ifeq            352
			d.l(e);
	//  148  338:aload_0         
	//  149  339:getfield        #20  <Field jt d>
	//  150  342:aload_0         
	//  151  343:getfield        #24  <Field String e>
	//  152  346:invokevirtual   #128 <Method void jt.l(String)>
		else
	//* 153  349:goto            655
		if(s1.equals("street"))
	//* 154  352:aload_2         
	//* 155  353:ldc1            #130 <String "street">
	//* 156  355:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 157  358:ifeq            375
			d.u(e);
	//  158  361:aload_0         
	//  159  362:getfield        #20  <Field jt d>
	//  160  365:aload_0         
	//  161  366:getfield        #24  <Field String e>
	//  162  369:invokevirtual   #133 <Method void jt.u(String)>
		else
	//* 163  372:goto            655
		if(s1.equals("poiname"))
	//* 164  375:aload_2         
	//* 165  376:ldc1            #135 <String "poiname">
	//* 166  378:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 167  381:ifeq            398
			d.t(e);
	//  168  384:aload_0         
	//  169  385:getfield        #20  <Field jt d>
	//  170  388:aload_0         
	//  171  389:getfield        #24  <Field String e>
	//  172  392:invokevirtual   #138 <Method void jt.t(String)>
		else
	//* 173  395:goto            655
		if(s1.equals("BIZ"))
	//* 174  398:aload_2         
	//* 175  399:ldc1            #140 <String "BIZ">
	//* 176  401:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 177  404:ifeq            459
		{
			if(d.u() == null)
	//* 178  407:aload_0         
	//* 179  408:getfield        #20  <Field jt d>
	//* 180  411:invokevirtual   #143 <Method JSONObject jt.u()>
	//* 181  414:ifnonnull       431
				d.c(new JSONObject());
	//  182  417:aload_0         
	//  183  418:getfield        #20  <Field jt d>
	//  184  421:new             #145 <Class JSONObject>
	//  185  424:dup             
	//  186  425:invokespecial   #146 <Method void JSONObject()>
	//  187  428:invokevirtual   #150 <Method void jt.c(JSONObject)>
			try
			{
				d.u().put("BIZ", ((Object) (e)));
	//  188  431:aload_0         
	//  189  432:getfield        #20  <Field jt d>
	//  190  435:invokevirtual   #143 <Method JSONObject jt.u()>
	//  191  438:ldc1            #140 <String "BIZ">
	//  192  440:aload_0         
	//  193  441:getfield        #24  <Field String e>
	//  194  444:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//  195  447:pop             
			}
	//* 196  448:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 197  451:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//  198  452:aload_1         
	//  199  453:invokevirtual   #77  <Method void Throwable.printStackTrace()>
			}
		} else
	//* 200  456:goto            655
		if(s1.equals("flr"))
	//* 201  459:aload_2         
	//* 202  460:ldc1            #156 <String "flr">
	//* 203  462:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 204  465:ifeq            482
			d.d(e);
	//  205  468:aload_0         
	//  206  469:getfield        #20  <Field jt d>
	//  207  472:aload_0         
	//  208  473:getfield        #24  <Field String e>
	//  209  476:invokevirtual   #158 <Method void jt.d(String)>
		else
	//* 210  479:goto            655
		if(s1.equals("pid"))
	//* 211  482:aload_2         
	//* 212  483:ldc1            #160 <String "pid">
	//* 213  485:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 214  488:ifeq            505
			d.e(e);
	//  215  491:aload_0         
	//  216  492:getfield        #20  <Field jt d>
	//  217  495:aload_0         
	//  218  496:getfield        #24  <Field String e>
	//  219  499:invokevirtual   #162 <Method void jt.e(String)>
		else
	//* 220  502:goto            655
		if(s1.equals("apiTime"))
	//* 221  505:aload_2         
	//* 222  506:ldc1            #164 <String "apiTime">
	//* 223  508:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 224  511:ifeq            565
			try
			{
				if(!"".equals(((Object) (e))))
	//* 225  514:ldc1            #22  <String "">
	//* 226  516:aload_0         
	//* 227  517:getfield        #24  <Field String e>
	//* 228  520:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 229  523:ifne            544
				{
					long l = Long.parseLong(e);
	//  230  526:aload_0         
	//  231  527:getfield        #24  <Field String e>
	//  232  530:invokestatic    #170 <Method long Long.parseLong(String)>
	//  233  533:lstore          4
					d.b(l);
	//  234  535:aload_0         
	//  235  536:getfield        #20  <Field jt d>
	//  236  539:lload           4
	//  237  541:invokevirtual   #173 <Method void jt.b(long)>
				}
			}
	//* 238  544:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 239  547:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//  240  548:aload_1         
	//  241  549:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				d.b(ke.e());
	//  242  552:aload_0         
	//  243  553:getfield        #20  <Field jt d>
	//  244  556:invokestatic    #178 <Method long ke.e()>
	//  245  559:invokevirtual   #173 <Method void jt.b(long)>
			}
		else
	//* 246  562:goto            655
		if(s1.equals("coord"))
	//* 247  565:aload_2         
	//* 248  566:ldc1            #180 <String "coord">
	//* 249  568:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 250  571:ifeq            596
			try
			{
				d.c(e);
	//  251  574:aload_0         
	//  252  575:getfield        #20  <Field jt d>
	//  253  578:aload_0         
	//  254  579:getfield        #24  <Field String e>
	//  255  582:invokevirtual   #182 <Method void jt.c(String)>
			}
	//* 256  585:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 257  588:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//  258  589:aload_1         
	//  259  590:invokevirtual   #77  <Method void Throwable.printStackTrace()>
			}
		else
	//* 260  593:goto            655
		if(s1.equals("mcell"))
	//* 261  596:aload_2         
	//* 262  597:ldc1            #184 <String "mcell">
	//* 263  599:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 264  602:ifeq            627
			try
			{
				d.b(e);
	//  265  605:aload_0         
	//  266  606:getfield        #20  <Field jt d>
	//  267  609:aload_0         
	//  268  610:getfield        #24  <Field String e>
	//  269  613:invokevirtual   #186 <Method void jt.b(String)>
			}
	//* 270  616:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 271  619:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//  272  620:aload_1         
	//  273  621:invokevirtual   #77  <Method void Throwable.printStackTrace()>
			}
		else
	//* 274  624:goto            655
		if(s1.equals("district"))
	//* 275  627:aload_2         
	//* 276  628:ldc1            #188 <String "district">
	//* 277  630:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 278  633:ifeq            655
			try
			{
				d.a(e);
	//  279  636:aload_0         
	//  280  637:getfield        #20  <Field jt d>
	//  281  640:aload_0         
	//  282  641:getfield        #24  <Field String e>
	//  283  644:invokevirtual   #190 <Method void jt.a(String)>
			}
	//* 284  647:goto            655
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 285  650:astore_1        
			{
				((Throwable) (s)).printStackTrace();
	//  286  651:aload_1         
	//  287  652:invokevirtual   #77  <Method void Throwable.printStackTrace()>
			}
		if(d.u() == null)
	//* 288  655:aload_0         
	//* 289  656:getfield        #20  <Field jt d>
	//* 290  659:invokevirtual   #143 <Method JSONObject jt.u()>
	//* 291  662:ifnonnull       679
			d.c(new JSONObject());
	//  292  665:aload_0         
	//  293  666:getfield        #20  <Field jt d>
	//  294  669:new             #145 <Class JSONObject>
	//  295  672:dup             
	//  296  673:invokespecial   #146 <Method void JSONObject()>
	//  297  676:invokevirtual   #150 <Method void jt.c(JSONObject)>
		try
		{
			if(s1.equals("eab"))
	//* 298  679:aload_2         
	//* 299  680:ldc1            #192 <String "eab">
	//* 300  682:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 301  685:ifeq            707
			{
				d.u().put(s1, ((Object) (e)));
	//  302  688:aload_0         
	//  303  689:getfield        #20  <Field jt d>
	//  304  692:invokevirtual   #143 <Method JSONObject jt.u()>
	//  305  695:aload_2         
	//  306  696:aload_0         
	//  307  697:getfield        #24  <Field String e>
	//  308  700:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//  309  703:pop             
				break MISSING_BLOCK_LABEL_788;
	//  310  704:goto            788
			}
		}
	//* 311  707:aload_2         
	//* 312  708:ldc1            #194 <String "ctl">
	//* 313  710:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 314  713:ifeq            735
	//* 315  716:aload_0         
	//* 316  717:getfield        #20  <Field jt d>
	//* 317  720:invokevirtual   #143 <Method JSONObject jt.u()>
	//* 318  723:aload_2         
	//* 319  724:aload_0         
	//* 320  725:getfield        #24  <Field String e>
	//* 321  728:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//* 322  731:pop             
	//* 323  732:goto            788
	//* 324  735:aload_2         
	//* 325  736:ldc1            #196 <String "suc">
	//* 326  738:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 327  741:ifeq            763
	//* 328  744:aload_0         
	//* 329  745:getfield        #20  <Field jt d>
	//* 330  748:invokevirtual   #143 <Method JSONObject jt.u()>
	//* 331  751:aload_2         
	//* 332  752:aload_0         
	//* 333  753:getfield        #24  <Field String e>
	//* 334  756:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//* 335  759:pop             
	//* 336  760:goto            788
	//* 337  763:aload_2         
	//* 338  764:ldc1            #198 <String "spa">
	//* 339  766:invokevirtual   #45  <Method boolean String.equals(Object)>
	//* 340  769:ifeq            788
	//* 341  772:aload_0         
	//* 342  773:getfield        #20  <Field jt d>
	//* 343  776:invokevirtual   #143 <Method JSONObject jt.u()>
	//* 344  779:aload_2         
	//* 345  780:aload_0         
	//* 346  781:getfield        #24  <Field String e>
	//* 347  784:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//* 348  787:pop             
	//* 349  788:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 350  789:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//  351  790:aload_1         
	//  352  791:invokevirtual   #77  <Method void Throwable.printStackTrace()>
			return;
	//  353  794:return          
		}
		if(s1.equals("ctl"))
		{
			d.u().put(s1, ((Object) (e)));
			break MISSING_BLOCK_LABEL_788;
		}
		if(s1.equals("suc"))
		{
			d.u().put(s1, ((Object) (e)));
			break MISSING_BLOCK_LABEL_788;
		}
		if(s1.equals("spa"))
			d.u().put(s1, ((Object) (e)));
	}

	public void startElement(String s, String s1, String s2, Attributes attributes)
	{
		e = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "">
	//    2    3:putfield        #24  <Field String e>
	//    3    6:return          
	}

	public jt d;
	private String e;

	private ju$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void DefaultHandler()>
		d = new jt();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class jt>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void jt()>
	//    6   12:putfield        #20  <Field jt d>
		e = "";
	//    7   15:aload_0         
	//    8   16:ldc1            #22  <String "">
	//    9   18:putfield        #24  <Field String e>
	//   10   21:return          
	}

	ju$a(ju$1 ju$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ju$a()>
	//    2    4:return          
	}
}
