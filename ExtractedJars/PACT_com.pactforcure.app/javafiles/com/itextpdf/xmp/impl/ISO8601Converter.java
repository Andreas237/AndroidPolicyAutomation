// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPDateTime;
import com.itextpdf.xmp.XMPException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPDateTimeImpl, ParseState

public final class ISO8601Converter
{

	private ISO8601Converter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static XMPDateTime parse(String s)
		throws XMPException
	{
		return parse(s, ((XMPDateTime) (new XMPDateTimeImpl())));
	//    0    0:aload_0         
	//    1    1:new             #15  <Class XMPDateTimeImpl>
	//    2    4:dup             
	//    3    5:invokespecial   #16  <Method void XMPDateTimeImpl()>
	//    4    8:invokestatic    #19  <Method XMPDateTime parse(String, XMPDateTime)>
	//    5   11:areturn         
	}

	public static XMPDateTime parse(String s, XMPDateTime xmpdatetime)
		throws XMPException
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new XMPException("Parameter must not be null", 4);
	//    2    4:new             #13  <Class XMPException>
	//    3    7:dup             
	//    4    8:ldc1            #22  <String "Parameter must not be null">
	//    5   10:iconst_4        
	//    6   11:invokespecial   #25  <Method void XMPException(String, int)>
	//    7   14:athrow          
		if(s.length() != 0) goto _L2; else goto _L1
	//    8   15:aload_0         
	//    9   16:invokevirtual   #31  <Method int String.length()>
	//   10   19:ifne            24
_L1:
		return xmpdatetime;
	//   11   22:aload_1         
	//   12   23:areturn         
_L2:
		int i1;
		int k1;
		int i2;
		boolean flag;
		s = ((String) (new ParseState(s)));
	//   13   24:new             #33  <Class ParseState>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokespecial   #36  <Method void ParseState(String)>
	//   17   32:astore_0        
		if(((ParseState) (s)).ch(0) == '-')
	//*  18   33:aload_0         
	//*  19   34:iconst_0        
	//*  20   35:invokevirtual   #40  <Method char ParseState.ch(int)>
	//*  21   38:bipush          45
	//*  22   40:icmpne          47
			((ParseState) (s)).skip();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #43  <Method void ParseState.skip()>
		i1 = ((ParseState) (s)).gatherInt("Invalid year in date string", 9999);
	//   25   47:aload_0         
	//   26   48:ldc1            #45  <String "Invalid year in date string">
	//   27   50:sipush          9999
	//   28   53:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//   29   56:istore_3        
		if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != '-')
	//*  30   57:aload_0         
	//*  31   58:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//*  32   61:ifeq            84
	//*  33   64:aload_0         
	//*  34   65:invokevirtual   #56  <Method char ParseState.ch()>
	//*  35   68:bipush          45
	//*  36   70:icmpeq          84
			throw new XMPException("Invalid date string, after year", 5);
	//   37   73:new             #13  <Class XMPException>
	//   38   76:dup             
	//   39   77:ldc1            #58  <String "Invalid date string, after year">
	//   40   79:iconst_5        
	//   41   80:invokespecial   #25  <Method void XMPException(String, int)>
	//   42   83:athrow          
		int i = i1;
	//   43   84:iload_3         
	//   44   85:istore_2        
		if(((ParseState) (s)).ch(0) == '-')
	//*  45   86:aload_0         
	//*  46   87:iconst_0        
	//*  47   88:invokevirtual   #40  <Method char ParseState.ch(int)>
	//*  48   91:bipush          45
	//*  49   93:icmpne          99
			i = -i1;
	//   50   96:iload_3         
	//   51   97:ineg            
	//   52   98:istore_2        
		xmpdatetime.setYear(i);
	//   53   99:aload_1         
	//   54  100:iload_2         
	//   55  101:invokeinterface #64  <Method void XMPDateTime.setYear(int)>
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
	//   56  106:aload_0         
	//   57  107:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//   58  110:ifeq            22
		((ParseState) (s)).skip();
	//   59  113:aload_0         
	//   60  114:invokevirtual   #43  <Method void ParseState.skip()>
		i = ((ParseState) (s)).gatherInt("Invalid month in date string", 12);
	//   61  117:aload_0         
	//   62  118:ldc1            #66  <String "Invalid month in date string">
	//   63  120:bipush          12
	//   64  122:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//   65  125:istore_2        
		if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != '-')
	//*  66  126:aload_0         
	//*  67  127:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//*  68  130:ifeq            153
	//*  69  133:aload_0         
	//*  70  134:invokevirtual   #56  <Method char ParseState.ch()>
	//*  71  137:bipush          45
	//*  72  139:icmpeq          153
			throw new XMPException("Invalid date string, after month", 5);
	//   73  142:new             #13  <Class XMPException>
	//   74  145:dup             
	//   75  146:ldc1            #68  <String "Invalid date string, after month">
	//   76  148:iconst_5        
	//   77  149:invokespecial   #25  <Method void XMPException(String, int)>
	//   78  152:athrow          
		xmpdatetime.setMonth(i);
	//   79  153:aload_1         
	//   80  154:iload_2         
	//   81  155:invokeinterface #71  <Method void XMPDateTime.setMonth(int)>
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
	//   82  160:aload_0         
	//   83  161:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//   84  164:ifeq            22
		((ParseState) (s)).skip();
	//   85  167:aload_0         
	//   86  168:invokevirtual   #43  <Method void ParseState.skip()>
		i = ((ParseState) (s)).gatherInt("Invalid day in date string", 31);
	//   87  171:aload_0         
	//   88  172:ldc1            #73  <String "Invalid day in date string">
	//   89  174:bipush          31
	//   90  176:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//   91  179:istore_2        
		if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != 'T')
	//*  92  180:aload_0         
	//*  93  181:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//*  94  184:ifeq            207
	//*  95  187:aload_0         
	//*  96  188:invokevirtual   #56  <Method char ParseState.ch()>
	//*  97  191:bipush          84
	//*  98  193:icmpeq          207
			throw new XMPException("Invalid date string, after day", 5);
	//   99  196:new             #13  <Class XMPException>
	//  100  199:dup             
	//  101  200:ldc1            #75  <String "Invalid date string, after day">
	//  102  202:iconst_5        
	//  103  203:invokespecial   #25  <Method void XMPException(String, int)>
	//  104  206:athrow          
		xmpdatetime.setDay(i);
	//  105  207:aload_1         
	//  106  208:iload_2         
	//  107  209:invokeinterface #78  <Method void XMPDateTime.setDay(int)>
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
	//  108  214:aload_0         
	//  109  215:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//  110  218:ifeq            22
		((ParseState) (s)).skip();
	//  111  221:aload_0         
	//  112  222:invokevirtual   #43  <Method void ParseState.skip()>
		xmpdatetime.setHour(((ParseState) (s)).gatherInt("Invalid hour in date string", 23));
	//  113  225:aload_1         
	//  114  226:aload_0         
	//  115  227:ldc1            #80  <String "Invalid hour in date string">
	//  116  229:bipush          23
	//  117  231:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//  118  234:invokeinterface #83  <Method void XMPDateTime.setHour(int)>
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
	//  119  239:aload_0         
	//  120  240:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//  121  243:ifeq            22
		if(((ParseState) (s)).ch() == ':')
	//* 122  246:aload_0         
	//* 123  247:invokevirtual   #56  <Method char ParseState.ch()>
	//* 124  250:bipush          58
	//* 125  252:icmpne          329
		{
			((ParseState) (s)).skip();
	//  126  255:aload_0         
	//  127  256:invokevirtual   #43  <Method void ParseState.skip()>
			int j = ((ParseState) (s)).gatherInt("Invalid minute in date string", 59);
	//  128  259:aload_0         
	//  129  260:ldc1            #85  <String "Invalid minute in date string">
	//  130  262:bipush          59
	//  131  264:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//  132  267:istore_2        
			if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != ':' && ((ParseState) (s)).ch() != 'Z' && ((ParseState) (s)).ch() != '+' && ((ParseState) (s)).ch() != '-')
	//* 133  268:aload_0         
	//* 134  269:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 135  272:ifeq            322
	//* 136  275:aload_0         
	//* 137  276:invokevirtual   #56  <Method char ParseState.ch()>
	//* 138  279:bipush          58
	//* 139  281:icmpeq          322
	//* 140  284:aload_0         
	//* 141  285:invokevirtual   #56  <Method char ParseState.ch()>
	//* 142  288:bipush          90
	//* 143  290:icmpeq          322
	//* 144  293:aload_0         
	//* 145  294:invokevirtual   #56  <Method char ParseState.ch()>
	//* 146  297:bipush          43
	//* 147  299:icmpeq          322
	//* 148  302:aload_0         
	//* 149  303:invokevirtual   #56  <Method char ParseState.ch()>
	//* 150  306:bipush          45
	//* 151  308:icmpeq          322
				throw new XMPException("Invalid date string, after minute", 5);
	//  152  311:new             #13  <Class XMPException>
	//  153  314:dup             
	//  154  315:ldc1            #87  <String "Invalid date string, after minute">
	//  155  317:iconst_5        
	//  156  318:invokespecial   #25  <Method void XMPException(String, int)>
	//  157  321:athrow          
			xmpdatetime.setMinute(j);
	//  158  322:aload_1         
	//  159  323:iload_2         
	//  160  324:invokeinterface #90  <Method void XMPDateTime.setMinute(int)>
		}
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
	//  161  329:aload_0         
	//  162  330:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//  163  333:ifeq            22
		if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() == ':')
	//* 164  336:aload_0         
	//* 165  337:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 166  340:ifeq            647
	//* 167  343:aload_0         
	//* 168  344:invokevirtual   #56  <Method char ParseState.ch()>
	//* 169  347:bipush          58
	//* 170  349:icmpne          647
		{
			((ParseState) (s)).skip();
	//  171  352:aload_0         
	//  172  353:invokevirtual   #43  <Method void ParseState.skip()>
			int k = ((ParseState) (s)).gatherInt("Invalid whole seconds in date string", 59);
	//  173  356:aload_0         
	//  174  357:ldc1            #92  <String "Invalid whole seconds in date string">
	//  175  359:bipush          59
	//  176  361:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//  177  364:istore_2        
			if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != '.' && ((ParseState) (s)).ch() != 'Z' && ((ParseState) (s)).ch() != '+' && ((ParseState) (s)).ch() != '-')
	//* 178  365:aload_0         
	//* 179  366:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 180  369:ifeq            419
	//* 181  372:aload_0         
	//* 182  373:invokevirtual   #56  <Method char ParseState.ch()>
	//* 183  376:bipush          46
	//* 184  378:icmpeq          419
	//* 185  381:aload_0         
	//* 186  382:invokevirtual   #56  <Method char ParseState.ch()>
	//* 187  385:bipush          90
	//* 188  387:icmpeq          419
	//* 189  390:aload_0         
	//* 190  391:invokevirtual   #56  <Method char ParseState.ch()>
	//* 191  394:bipush          43
	//* 192  396:icmpeq          419
	//* 193  399:aload_0         
	//* 194  400:invokevirtual   #56  <Method char ParseState.ch()>
	//* 195  403:bipush          45
	//* 196  405:icmpeq          419
				throw new XMPException("Invalid date string, after whole seconds", 5);
	//  197  408:new             #13  <Class XMPException>
	//  198  411:dup             
	//  199  412:ldc1            #94  <String "Invalid date string, after whole seconds">
	//  200  414:iconst_5        
	//  201  415:invokespecial   #25  <Method void XMPException(String, int)>
	//  202  418:athrow          
			xmpdatetime.setSecond(k);
	//  203  419:aload_1         
	//  204  420:iload_2         
	//  205  421:invokeinterface #97  <Method void XMPDateTime.setSecond(int)>
			if(((ParseState) (s)).ch() == '.')
	//* 206  426:aload_0         
	//* 207  427:invokevirtual   #56  <Method char ParseState.ch()>
	//* 208  430:bipush          46
	//* 209  432:icmpne          560
			{
				((ParseState) (s)).skip();
	//  210  435:aload_0         
	//  211  436:invokevirtual   #43  <Method void ParseState.skip()>
				int l = ((ParseState) (s)).pos();
	//  212  439:aload_0         
	//  213  440:invokevirtual   #100 <Method int ParseState.pos()>
	//  214  443:istore_2        
				i1 = ((ParseState) (s)).gatherInt("Invalid fractional seconds in date string", 0x3b9ac9ff);
	//  215  444:aload_0         
	//  216  445:ldc1            #102 <String "Invalid fractional seconds in date string">
	//  217  447:ldc1            #103 <Int 0x3b9ac9ff>
	//  218  449:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//  219  452:istore_3        
				if(((ParseState) (s)).hasNext() && ((ParseState) (s)).ch() != 'Z' && ((ParseState) (s)).ch() != '+' && ((ParseState) (s)).ch() != '-')
	//* 220  453:aload_0         
	//* 221  454:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 222  457:ifeq            498
	//* 223  460:aload_0         
	//* 224  461:invokevirtual   #56  <Method char ParseState.ch()>
	//* 225  464:bipush          90
	//* 226  466:icmpeq          498
	//* 227  469:aload_0         
	//* 228  470:invokevirtual   #56  <Method char ParseState.ch()>
	//* 229  473:bipush          43
	//* 230  475:icmpeq          498
	//* 231  478:aload_0         
	//* 232  479:invokevirtual   #56  <Method char ParseState.ch()>
	//* 233  482:bipush          45
	//* 234  484:icmpeq          498
					throw new XMPException("Invalid date string, after fractional second", 5);
	//  235  487:new             #13  <Class XMPException>
	//  236  490:dup             
	//  237  491:ldc1            #105 <String "Invalid date string, after fractional second">
	//  238  493:iconst_5        
	//  239  494:invokespecial   #25  <Method void XMPException(String, int)>
	//  240  497:athrow          
				l = ((ParseState) (s)).pos() - l;
	//  241  498:aload_0         
	//  242  499:invokevirtual   #100 <Method int ParseState.pos()>
	//  243  502:iload_2         
	//  244  503:isub            
	//  245  504:istore_2        
				int j1;
				int l1;
				do
				{
					j1 = l;
	//  246  505:iload_2         
	//  247  506:istore          4
					l1 = i1;
	//  248  508:iload_3         
	//  249  509:istore          5
					if(l <= 9)
						break;
	//  250  511:iload_2         
	//  251  512:bipush          9
	//  252  514:icmple          529
					i1 /= 10;
	//  253  517:iload_3         
	//  254  518:bipush          10
	//  255  520:idiv            
	//  256  521:istore_3        
					l--;
	//  257  522:iload_2         
	//  258  523:iconst_1        
	//  259  524:isub            
	//  260  525:istore_2        
				} while(true);
	//  261  526:goto            505
				for(; j1 < 9; j1++)
	//* 262  529:iload           4
	//* 263  531:bipush          9
	//* 264  533:icmpge          552
					l1 *= 10;
	//  265  536:iload           5
	//  266  538:bipush          10
	//  267  540:imul            
	//  268  541:istore          5

	//  269  543:iload           4
	//  270  545:iconst_1        
	//  271  546:iadd            
	//  272  547:istore          4
	//* 273  549:goto            529
				xmpdatetime.setNanoSecond(l1);
	//  274  552:aload_1         
	//  275  553:iload           5
	//  276  555:invokeinterface #108 <Method void XMPDateTime.setNanoSecond(int)>
			}
		} else
	//* 277  560:iconst_0        
	//* 278  561:istore          5
	//* 279  563:iconst_0        
	//* 280  564:istore_3        
	//* 281  565:iconst_0        
	//* 282  566:istore          6
	//* 283  568:aload_0         
	//* 284  569:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 285  572:ifeq            22
	//* 286  575:aload_0         
	//* 287  576:invokevirtual   #56  <Method char ParseState.ch()>
	//* 288  579:bipush          90
	//* 289  581:icmpne          685
	//* 290  584:aload_0         
	//* 291  585:invokevirtual   #43  <Method void ParseState.skip()>
	//* 292  588:iload           6
	//* 293  590:istore          4
	//* 294  592:aload_1         
	//* 295  593:new             #110 <Class SimpleTimeZone>
	//* 296  596:dup             
	//* 297  597:iload_3         
	//* 298  598:sipush          3600
	//* 299  601:imul            
	//* 300  602:sipush          1000
	//* 301  605:imul            
	//* 302  606:iload           4
	//* 303  608:bipush          60
	//* 304  610:imul            
	//* 305  611:sipush          1000
	//* 306  614:imul            
	//* 307  615:iadd            
	//* 308  616:iload           5
	//* 309  618:imul            
	//* 310  619:ldc1            #112 <String "">
	//* 311  621:invokespecial   #115 <Method void SimpleTimeZone(int, String)>
	//* 312  624:invokeinterface #119 <Method void XMPDateTime.setTimeZone(TimeZone)>
	//* 313  629:aload_0         
	//* 314  630:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 315  633:ifeq            22
	//* 316  636:new             #13  <Class XMPException>
	//* 317  639:dup             
	//* 318  640:ldc1            #121 <String "Invalid date string, extra chars at end">
	//* 319  642:iconst_5        
	//* 320  643:invokespecial   #25  <Method void XMPException(String, int)>
	//* 321  646:athrow          
		if(((ParseState) (s)).ch() != 'Z' && ((ParseState) (s)).ch() != '+' && ((ParseState) (s)).ch() != '-')
	//* 322  647:aload_0         
	//* 323  648:invokevirtual   #56  <Method char ParseState.ch()>
	//* 324  651:bipush          90
	//* 325  653:icmpeq          560
	//* 326  656:aload_0         
	//* 327  657:invokevirtual   #56  <Method char ParseState.ch()>
	//* 328  660:bipush          43
	//* 329  662:icmpeq          560
	//* 330  665:aload_0         
	//* 331  666:invokevirtual   #56  <Method char ParseState.ch()>
	//* 332  669:bipush          45
	//* 333  671:icmpeq          560
			throw new XMPException("Invalid date string, after time", 5);
	//  334  674:new             #13  <Class XMPException>
	//  335  677:dup             
	//  336  678:ldc1            #123 <String "Invalid date string, after time">
	//  337  680:iconst_5        
	//  338  681:invokespecial   #25  <Method void XMPException(String, int)>
	//  339  684:athrow          
		i2 = 0;
		i1 = 0;
		flag = false;
		if(!((ParseState) (s)).hasNext())
			continue; /* Loop/switch isn't completed */
		if(((ParseState) (s)).ch() != 'Z')
			break; /* Loop/switch isn't completed */
		((ParseState) (s)).skip();
		k1 = ((int) (flag));
_L4:
		xmpdatetime.setTimeZone(((TimeZone) (new SimpleTimeZone((i1 * 3600 * 1000 + k1 * 60 * 1000) * i2, ""))));
		if(((ParseState) (s)).hasNext())
			throw new XMPException("Invalid date string, extra chars at end", 5);
		if(true) goto _L1; else goto _L3
_L3:
		k1 = ((int) (flag));
	//  340  685:iload           6
	//  341  687:istore          4
		if(((ParseState) (s)).hasNext())
	//* 342  689:aload_0         
	//* 343  690:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 344  693:ifeq            592
		{
			byte byte0;
			int j2;
			if(((ParseState) (s)).ch() == '+')
	//* 345  696:aload_0         
	//* 346  697:invokevirtual   #56  <Method char ParseState.ch()>
	//* 347  700:bipush          43
	//* 348  702:icmpne          770
			{
				byte0 = 1;
	//  349  705:iconst_1        
	//  350  706:istore_2        
			} else
	//* 351  707:aload_0         
	//* 352  708:invokevirtual   #43  <Method void ParseState.skip()>
	//* 353  711:aload_0         
	//* 354  712:ldc1            #125 <String "Invalid time zone hour in date string">
	//* 355  714:bipush          23
	//* 356  716:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//* 357  719:istore          7
	//* 358  721:iload           7
	//* 359  723:istore_3        
	//* 360  724:iload           6
	//* 361  726:istore          4
	//* 362  728:iload_2         
	//* 363  729:istore          5
	//* 364  731:aload_0         
	//* 365  732:invokevirtual   #53  <Method boolean ParseState.hasNext()>
	//* 366  735:ifeq            592
	//* 367  738:aload_0         
	//* 368  739:invokevirtual   #56  <Method char ParseState.ch()>
	//* 369  742:bipush          58
	//* 370  744:icmpne          795
	//* 371  747:aload_0         
	//* 372  748:invokevirtual   #43  <Method void ParseState.skip()>
	//* 373  751:aload_0         
	//* 374  752:ldc1            #127 <String "Invalid time zone minute in date string">
	//* 375  754:bipush          59
	//* 376  756:invokevirtual   #49  <Method int ParseState.gatherInt(String, int)>
	//* 377  759:istore          4
	//* 378  761:iload           7
	//* 379  763:istore_3        
	//* 380  764:iload_2         
	//* 381  765:istore          5
	//* 382  767:goto            592
			{
label0:
				{
					if(((ParseState) (s)).ch() != '-')
						break label0;
	//  383  770:aload_0         
	//  384  771:invokevirtual   #56  <Method char ParseState.ch()>
	//  385  774:bipush          45
	//  386  776:icmpne          784
					byte0 = -1;
	//  387  779:iconst_m1       
	//  388  780:istore_2        
				}
			}
			((ParseState) (s)).skip();
			j2 = ((ParseState) (s)).gatherInt("Invalid time zone hour in date string", 23);
			i1 = j2;
			k1 = ((int) (flag));
			i2 = ((int) (byte0));
			if(((ParseState) (s)).hasNext())
				if(((ParseState) (s)).ch() == ':')
				{
					((ParseState) (s)).skip();
					k1 = ((ParseState) (s)).gatherInt("Invalid time zone minute in date string", 59);
					i1 = j2;
					i2 = ((int) (byte0));
				} else
	//* 389  781:goto            707
	//* 390  784:new             #13  <Class XMPException>
	//* 391  787:dup             
	//* 392  788:ldc1            #129 <String "Time zone must begin with 'Z', '+', or '-'">
	//* 393  790:iconst_5        
	//* 394  791:invokespecial   #25  <Method void XMPException(String, int)>
	//* 395  794:athrow          
				{
					throw new XMPException("Invalid date string, after time zone hour", 5);
	//  396  795:new             #13  <Class XMPException>
	//  397  798:dup             
	//  398  799:ldc1            #131 <String "Invalid date string, after time zone hour">
	//  399  801:iconst_5        
	//  400  802:invokespecial   #25  <Method void XMPException(String, int)>
	//  401  805:athrow          
				}
		}
		  goto _L4
		throw new XMPException("Time zone must begin with 'Z', '+', or '-'", 5);
		  goto _L4
	}

	public static String render(XMPDateTime xmpdatetime)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #135 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void StringBuffer()>
	//    3    7:astore          9
		if(xmpdatetime.hasDate())
	//*   4    9:aload_0         
	//*   5   10:invokeinterface #139 <Method boolean XMPDateTime.hasDate()>
	//*   6   15:ifeq            303
		{
			DecimalFormat decimalformat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
	//    7   18:new             #141 <Class DecimalFormat>
	//    8   21:dup             
	//    9   22:ldc1            #143 <String "0000">
	//   10   24:new             #145 <Class DecimalFormatSymbols>
	//   11   27:dup             
	//   12   28:getstatic       #151 <Field Locale Locale.ENGLISH>
	//   13   31:invokespecial   #154 <Method void DecimalFormatSymbols(Locale)>
	//   14   34:invokespecial   #157 <Method void DecimalFormat(String, DecimalFormatSymbols)>
	//   15   37:astore          10
			stringbuffer.append(decimalformat.format(xmpdatetime.getYear()));
	//   16   39:aload           9
	//   17   41:aload           10
	//   18   43:aload_0         
	//   19   44:invokeinterface #160 <Method int XMPDateTime.getYear()>
	//   20   49:i2l             
	//   21   50:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//   22   53:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//   23   56:pop             
			if(xmpdatetime.getMonth() == 0)
	//*  24   57:aload_0         
	//*  25   58:invokeinterface #171 <Method int XMPDateTime.getMonth()>
	//*  26   63:ifne            72
				return stringbuffer.toString();
	//   27   66:aload           9
	//   28   68:invokevirtual   #175 <Method String StringBuffer.toString()>
	//   29   71:areturn         
			decimalformat.applyPattern("'-'00");
	//   30   72:aload           10
	//   31   74:ldc1            #177 <String "'-'00">
	//   32   76:invokevirtual   #180 <Method void DecimalFormat.applyPattern(String)>
			stringbuffer.append(decimalformat.format(xmpdatetime.getMonth()));
	//   33   79:aload           9
	//   34   81:aload           10
	//   35   83:aload_0         
	//   36   84:invokeinterface #171 <Method int XMPDateTime.getMonth()>
	//   37   89:i2l             
	//   38   90:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//   39   93:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//   40   96:pop             
			if(xmpdatetime.getDay() == 0)
	//*  41   97:aload_0         
	//*  42   98:invokeinterface #183 <Method int XMPDateTime.getDay()>
	//*  43  103:ifne            112
				return stringbuffer.toString();
	//   44  106:aload           9
	//   45  108:invokevirtual   #175 <Method String StringBuffer.toString()>
	//   46  111:areturn         
			stringbuffer.append(decimalformat.format(xmpdatetime.getDay()));
	//   47  112:aload           9
	//   48  114:aload           10
	//   49  116:aload_0         
	//   50  117:invokeinterface #183 <Method int XMPDateTime.getDay()>
	//   51  122:i2l             
	//   52  123:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//   53  126:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//   54  129:pop             
			if(xmpdatetime.hasTime())
	//*  55  130:aload_0         
	//*  56  131:invokeinterface #186 <Method boolean XMPDateTime.hasTime()>
	//*  57  136:ifeq            303
			{
				stringbuffer.append('T');
	//   58  139:aload           9
	//   59  141:bipush          84
	//   60  143:invokevirtual   #189 <Method StringBuffer StringBuffer.append(char)>
	//   61  146:pop             
				decimalformat.applyPattern("00");
	//   62  147:aload           10
	//   63  149:ldc1            #191 <String "00">
	//   64  151:invokevirtual   #180 <Method void DecimalFormat.applyPattern(String)>
				stringbuffer.append(decimalformat.format(xmpdatetime.getHour()));
	//   65  154:aload           9
	//   66  156:aload           10
	//   67  158:aload_0         
	//   68  159:invokeinterface #194 <Method int XMPDateTime.getHour()>
	//   69  164:i2l             
	//   70  165:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//   71  168:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//   72  171:pop             
				stringbuffer.append(':');
	//   73  172:aload           9
	//   74  174:bipush          58
	//   75  176:invokevirtual   #189 <Method StringBuffer StringBuffer.append(char)>
	//   76  179:pop             
				stringbuffer.append(decimalformat.format(xmpdatetime.getMinute()));
	//   77  180:aload           9
	//   78  182:aload           10
	//   79  184:aload_0         
	//   80  185:invokeinterface #197 <Method int XMPDateTime.getMinute()>
	//   81  190:i2l             
	//   82  191:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//   83  194:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//   84  197:pop             
				if(xmpdatetime.getSecond() != 0 || xmpdatetime.getNanoSecond() != 0)
	//*  85  198:aload_0         
	//*  86  199:invokeinterface #200 <Method int XMPDateTime.getSecond()>
	//*  87  204:ifne            216
	//*  88  207:aload_0         
	//*  89  208:invokeinterface #203 <Method int XMPDateTime.getNanoSecond()>
	//*  90  213:ifeq            257
				{
					double d = xmpdatetime.getSecond();
	//   91  216:aload_0         
	//   92  217:invokeinterface #200 <Method int XMPDateTime.getSecond()>
	//   93  222:i2d             
	//   94  223:dstore_1        
					double d1 = (double)xmpdatetime.getNanoSecond() / 1000000000D;
	//   95  224:aload_0         
	//   96  225:invokeinterface #203 <Method int XMPDateTime.getNanoSecond()>
	//   97  230:i2d             
	//   98  231:ldc2w           #204 <Double 1000000000D>
	//   99  234:ddiv            
	//  100  235:dstore_3        
					decimalformat.applyPattern(":00.#########");
	//  101  236:aload           10
	//  102  238:ldc1            #207 <String ":00.#########">
	//  103  240:invokevirtual   #180 <Method void DecimalFormat.applyPattern(String)>
					stringbuffer.append(decimalformat.format(d + d1));
	//  104  243:aload           9
	//  105  245:aload           10
	//  106  247:dload_1         
	//  107  248:dload_3         
	//  108  249:dadd            
	//  109  250:invokevirtual   #210 <Method String DecimalFormat.format(double)>
	//  110  253:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//  111  256:pop             
				}
				if(xmpdatetime.hasTimeZone())
	//* 112  257:aload_0         
	//* 113  258:invokeinterface #213 <Method boolean XMPDateTime.hasTimeZone()>
	//* 114  263:ifeq            303
				{
					long l = xmpdatetime.getCalendar().getTimeInMillis();
	//  115  266:aload_0         
	//  116  267:invokeinterface #217 <Method Calendar XMPDateTime.getCalendar()>
	//  117  272:invokevirtual   #223 <Method long Calendar.getTimeInMillis()>
	//  118  275:lstore          7
					int j = xmpdatetime.getTimeZone().getOffset(l);
	//  119  277:aload_0         
	//  120  278:invokeinterface #227 <Method TimeZone XMPDateTime.getTimeZone()>
	//  121  283:lload           7
	//  122  285:invokevirtual   #233 <Method int TimeZone.getOffset(long)>
	//  123  288:istore          6
					if(j == 0)
	//* 124  290:iload           6
	//* 125  292:ifne            309
					{
						stringbuffer.append('Z');
	//  126  295:aload           9
	//  127  297:bipush          90
	//  128  299:invokevirtual   #189 <Method StringBuffer StringBuffer.append(char)>
	//  129  302:pop             
					} else
	//* 130  303:aload           9
	//* 131  305:invokevirtual   #175 <Method String StringBuffer.toString()>
	//* 132  308:areturn         
					{
						int i = j / 0x36ee80;
	//  133  309:iload           6
	//  134  311:ldc1            #234 <Int 0x36ee80>
	//  135  313:idiv            
	//  136  314:istore          5
						j = Math.abs((j % 0x36ee80) / 60000);
	//  137  316:iload           6
	//  138  318:ldc1            #234 <Int 0x36ee80>
	//  139  320:irem            
	//  140  321:ldc1            #235 <Int 60000>
	//  141  323:idiv            
	//  142  324:invokestatic    #241 <Method int Math.abs(int)>
	//  143  327:istore          6
						decimalformat.applyPattern("+00;-00");
	//  144  329:aload           10
	//  145  331:ldc1            #243 <String "+00;-00">
	//  146  333:invokevirtual   #180 <Method void DecimalFormat.applyPattern(String)>
						stringbuffer.append(decimalformat.format(i));
	//  147  336:aload           9
	//  148  338:aload           10
	//  149  340:iload           5
	//  150  342:i2l             
	//  151  343:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//  152  346:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//  153  349:pop             
						decimalformat.applyPattern(":00");
	//  154  350:aload           10
	//  155  352:ldc1            #245 <String ":00">
	//  156  354:invokevirtual   #180 <Method void DecimalFormat.applyPattern(String)>
						stringbuffer.append(decimalformat.format(j));
	//  157  357:aload           9
	//  158  359:aload           10
	//  159  361:iload           6
	//  160  363:i2l             
	//  161  364:invokevirtual   #164 <Method String DecimalFormat.format(long)>
	//  162  367:invokevirtual   #168 <Method StringBuffer StringBuffer.append(String)>
	//  163  370:pop             
					}
				}
			}
		}
		return stringbuffer.toString();
	//* 164  371:goto            303
	}
}
