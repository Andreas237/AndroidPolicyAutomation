// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser;

import java.util.HashMap;
import java.util.Map;

public class IanaEncodings
{

	public IanaEncodings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void Object()>
	//    2    4:return          
	}

	public static String getJavaEncoding(String s)
	{
		String s1 = s.toUpperCase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method String String.toUpperCase()>
	//    2    4:astore_1        
		String s2 = (String)MAP.get(((Object) (s1)));
	//    3    5:getstatic       #16  <Field Map MAP>
	//    4    8:aload_1         
	//    5    9:invokeinterface #454 <Method Object Map.get(Object)>
	//    6   14:checkcast       #446 <Class String>
	//    7   17:astore_2        
		s1 = s2;
	//    8   18:aload_2         
	//    9   19:astore_1        
		if(s2 == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       26
			s1 = s;
	//   12   24:aload_0         
	//   13   25:astore_1        
		return s1;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	private static final Map MAP;

	static 
	{
		MAP = ((Map) (new HashMap()));
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field Map MAP>
		MAP.put("BIG5", "Big5");
	//    4   10:getstatic       #16  <Field Map MAP>
	//    5   13:ldc1            #18  <String "BIG5">
	//    6   15:ldc1            #20  <String "Big5">
	//    7   17:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//    8   22:pop             
		MAP.put("CSBIG5", "Big5");
	//    9   23:getstatic       #16  <Field Map MAP>
	//   10   26:ldc1            #28  <String "CSBIG5">
	//   11   28:ldc1            #20  <String "Big5">
	//   12   30:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   13   35:pop             
		MAP.put("CP037", "CP037");
	//   14   36:getstatic       #16  <Field Map MAP>
	//   15   39:ldc1            #30  <String "CP037">
	//   16   41:ldc1            #30  <String "CP037">
	//   17   43:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   18   48:pop             
		MAP.put("IBM037", "CP037");
	//   19   49:getstatic       #16  <Field Map MAP>
	//   20   52:ldc1            #32  <String "IBM037">
	//   21   54:ldc1            #30  <String "CP037">
	//   22   56:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   23   61:pop             
		MAP.put("CSIBM037", "CP037");
	//   24   62:getstatic       #16  <Field Map MAP>
	//   25   65:ldc1            #34  <String "CSIBM037">
	//   26   67:ldc1            #30  <String "CP037">
	//   27   69:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   28   74:pop             
		MAP.put("EBCDIC-CP-US", "CP037");
	//   29   75:getstatic       #16  <Field Map MAP>
	//   30   78:ldc1            #36  <String "EBCDIC-CP-US">
	//   31   80:ldc1            #30  <String "CP037">
	//   32   82:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   33   87:pop             
		MAP.put("EBCDIC-CP-CA", "CP037");
	//   34   88:getstatic       #16  <Field Map MAP>
	//   35   91:ldc1            #38  <String "EBCDIC-CP-CA">
	//   36   93:ldc1            #30  <String "CP037">
	//   37   95:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   38  100:pop             
		MAP.put("EBCDIC-CP-NL", "CP037");
	//   39  101:getstatic       #16  <Field Map MAP>
	//   40  104:ldc1            #40  <String "EBCDIC-CP-NL">
	//   41  106:ldc1            #30  <String "CP037">
	//   42  108:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   43  113:pop             
		MAP.put("EBCDIC-CP-WT", "CP037");
	//   44  114:getstatic       #16  <Field Map MAP>
	//   45  117:ldc1            #42  <String "EBCDIC-CP-WT">
	//   46  119:ldc1            #30  <String "CP037">
	//   47  121:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   48  126:pop             
		MAP.put("IBM277", "CP277");
	//   49  127:getstatic       #16  <Field Map MAP>
	//   50  130:ldc1            #44  <String "IBM277">
	//   51  132:ldc1            #46  <String "CP277">
	//   52  134:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   53  139:pop             
		MAP.put("CP277", "CP277");
	//   54  140:getstatic       #16  <Field Map MAP>
	//   55  143:ldc1            #46  <String "CP277">
	//   56  145:ldc1            #46  <String "CP277">
	//   57  147:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   58  152:pop             
		MAP.put("CSIBM277", "CP277");
	//   59  153:getstatic       #16  <Field Map MAP>
	//   60  156:ldc1            #48  <String "CSIBM277">
	//   61  158:ldc1            #46  <String "CP277">
	//   62  160:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   63  165:pop             
		MAP.put("EBCDIC-CP-DK", "CP277");
	//   64  166:getstatic       #16  <Field Map MAP>
	//   65  169:ldc1            #50  <String "EBCDIC-CP-DK">
	//   66  171:ldc1            #46  <String "CP277">
	//   67  173:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   68  178:pop             
		MAP.put("EBCDIC-CP-NO", "CP277");
	//   69  179:getstatic       #16  <Field Map MAP>
	//   70  182:ldc1            #52  <String "EBCDIC-CP-NO">
	//   71  184:ldc1            #46  <String "CP277">
	//   72  186:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   73  191:pop             
		MAP.put("IBM278", "CP278");
	//   74  192:getstatic       #16  <Field Map MAP>
	//   75  195:ldc1            #54  <String "IBM278">
	//   76  197:ldc1            #56  <String "CP278">
	//   77  199:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   78  204:pop             
		MAP.put("CP278", "CP278");
	//   79  205:getstatic       #16  <Field Map MAP>
	//   80  208:ldc1            #56  <String "CP278">
	//   81  210:ldc1            #56  <String "CP278">
	//   82  212:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   83  217:pop             
		MAP.put("CSIBM278", "CP278");
	//   84  218:getstatic       #16  <Field Map MAP>
	//   85  221:ldc1            #58  <String "CSIBM278">
	//   86  223:ldc1            #56  <String "CP278">
	//   87  225:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   88  230:pop             
		MAP.put("EBCDIC-CP-FI", "CP278");
	//   89  231:getstatic       #16  <Field Map MAP>
	//   90  234:ldc1            #60  <String "EBCDIC-CP-FI">
	//   91  236:ldc1            #56  <String "CP278">
	//   92  238:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   93  243:pop             
		MAP.put("EBCDIC-CP-SE", "CP278");
	//   94  244:getstatic       #16  <Field Map MAP>
	//   95  247:ldc1            #62  <String "EBCDIC-CP-SE">
	//   96  249:ldc1            #56  <String "CP278">
	//   97  251:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//   98  256:pop             
		MAP.put("IBM280", "CP280");
	//   99  257:getstatic       #16  <Field Map MAP>
	//  100  260:ldc1            #64  <String "IBM280">
	//  101  262:ldc1            #66  <String "CP280">
	//  102  264:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  103  269:pop             
		MAP.put("CP280", "CP280");
	//  104  270:getstatic       #16  <Field Map MAP>
	//  105  273:ldc1            #66  <String "CP280">
	//  106  275:ldc1            #66  <String "CP280">
	//  107  277:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  108  282:pop             
		MAP.put("CSIBM280", "CP280");
	//  109  283:getstatic       #16  <Field Map MAP>
	//  110  286:ldc1            #68  <String "CSIBM280">
	//  111  288:ldc1            #66  <String "CP280">
	//  112  290:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  113  295:pop             
		MAP.put("EBCDIC-CP-IT", "CP280");
	//  114  296:getstatic       #16  <Field Map MAP>
	//  115  299:ldc1            #70  <String "EBCDIC-CP-IT">
	//  116  301:ldc1            #66  <String "CP280">
	//  117  303:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  118  308:pop             
		MAP.put("IBM284", "CP284");
	//  119  309:getstatic       #16  <Field Map MAP>
	//  120  312:ldc1            #72  <String "IBM284">
	//  121  314:ldc1            #74  <String "CP284">
	//  122  316:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  123  321:pop             
		MAP.put("CP284", "CP284");
	//  124  322:getstatic       #16  <Field Map MAP>
	//  125  325:ldc1            #74  <String "CP284">
	//  126  327:ldc1            #74  <String "CP284">
	//  127  329:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  128  334:pop             
		MAP.put("CSIBM284", "CP284");
	//  129  335:getstatic       #16  <Field Map MAP>
	//  130  338:ldc1            #76  <String "CSIBM284">
	//  131  340:ldc1            #74  <String "CP284">
	//  132  342:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  133  347:pop             
		MAP.put("EBCDIC-CP-ES", "CP284");
	//  134  348:getstatic       #16  <Field Map MAP>
	//  135  351:ldc1            #78  <String "EBCDIC-CP-ES">
	//  136  353:ldc1            #74  <String "CP284">
	//  137  355:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  138  360:pop             
		MAP.put("EBCDIC-CP-GB", "CP285");
	//  139  361:getstatic       #16  <Field Map MAP>
	//  140  364:ldc1            #80  <String "EBCDIC-CP-GB">
	//  141  366:ldc1            #82  <String "CP285">
	//  142  368:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  143  373:pop             
		MAP.put("IBM285", "CP285");
	//  144  374:getstatic       #16  <Field Map MAP>
	//  145  377:ldc1            #84  <String "IBM285">
	//  146  379:ldc1            #82  <String "CP285">
	//  147  381:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  148  386:pop             
		MAP.put("CP285", "CP285");
	//  149  387:getstatic       #16  <Field Map MAP>
	//  150  390:ldc1            #82  <String "CP285">
	//  151  392:ldc1            #82  <String "CP285">
	//  152  394:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  153  399:pop             
		MAP.put("CSIBM285", "CP285");
	//  154  400:getstatic       #16  <Field Map MAP>
	//  155  403:ldc1            #86  <String "CSIBM285">
	//  156  405:ldc1            #82  <String "CP285">
	//  157  407:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  158  412:pop             
		MAP.put("EBCDIC-CP-FR", "CP297");
	//  159  413:getstatic       #16  <Field Map MAP>
	//  160  416:ldc1            #88  <String "EBCDIC-CP-FR">
	//  161  418:ldc1            #90  <String "CP297">
	//  162  420:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  163  425:pop             
		MAP.put("IBM297", "CP297");
	//  164  426:getstatic       #16  <Field Map MAP>
	//  165  429:ldc1            #92  <String "IBM297">
	//  166  431:ldc1            #90  <String "CP297">
	//  167  433:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  168  438:pop             
		MAP.put("CP297", "CP297");
	//  169  439:getstatic       #16  <Field Map MAP>
	//  170  442:ldc1            #90  <String "CP297">
	//  171  444:ldc1            #90  <String "CP297">
	//  172  446:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  173  451:pop             
		MAP.put("CSIBM297", "CP297");
	//  174  452:getstatic       #16  <Field Map MAP>
	//  175  455:ldc1            #94  <String "CSIBM297">
	//  176  457:ldc1            #90  <String "CP297">
	//  177  459:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  178  464:pop             
		MAP.put("EBCDIC-CP-AR1", "CP420");
	//  179  465:getstatic       #16  <Field Map MAP>
	//  180  468:ldc1            #96  <String "EBCDIC-CP-AR1">
	//  181  470:ldc1            #98  <String "CP420">
	//  182  472:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  183  477:pop             
		MAP.put("IBM420", "CP420");
	//  184  478:getstatic       #16  <Field Map MAP>
	//  185  481:ldc1            #100 <String "IBM420">
	//  186  483:ldc1            #98  <String "CP420">
	//  187  485:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  188  490:pop             
		MAP.put("CP420", "CP420");
	//  189  491:getstatic       #16  <Field Map MAP>
	//  190  494:ldc1            #98  <String "CP420">
	//  191  496:ldc1            #98  <String "CP420">
	//  192  498:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  193  503:pop             
		MAP.put("CSIBM420", "CP420");
	//  194  504:getstatic       #16  <Field Map MAP>
	//  195  507:ldc1            #102 <String "CSIBM420">
	//  196  509:ldc1            #98  <String "CP420">
	//  197  511:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  198  516:pop             
		MAP.put("EBCDIC-CP-HE", "CP424");
	//  199  517:getstatic       #16  <Field Map MAP>
	//  200  520:ldc1            #104 <String "EBCDIC-CP-HE">
	//  201  522:ldc1            #106 <String "CP424">
	//  202  524:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  203  529:pop             
		MAP.put("IBM424", "CP424");
	//  204  530:getstatic       #16  <Field Map MAP>
	//  205  533:ldc1            #108 <String "IBM424">
	//  206  535:ldc1            #106 <String "CP424">
	//  207  537:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  208  542:pop             
		MAP.put("CP424", "CP424");
	//  209  543:getstatic       #16  <Field Map MAP>
	//  210  546:ldc1            #106 <String "CP424">
	//  211  548:ldc1            #106 <String "CP424">
	//  212  550:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  213  555:pop             
		MAP.put("CSIBM424", "CP424");
	//  214  556:getstatic       #16  <Field Map MAP>
	//  215  559:ldc1            #110 <String "CSIBM424">
	//  216  561:ldc1            #106 <String "CP424">
	//  217  563:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  218  568:pop             
		MAP.put("EBCDIC-CP-CH", "CP500");
	//  219  569:getstatic       #16  <Field Map MAP>
	//  220  572:ldc1            #112 <String "EBCDIC-CP-CH">
	//  221  574:ldc1            #114 <String "CP500">
	//  222  576:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  223  581:pop             
		MAP.put("IBM500", "CP500");
	//  224  582:getstatic       #16  <Field Map MAP>
	//  225  585:ldc1            #116 <String "IBM500">
	//  226  587:ldc1            #114 <String "CP500">
	//  227  589:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  228  594:pop             
		MAP.put("CP500", "CP500");
	//  229  595:getstatic       #16  <Field Map MAP>
	//  230  598:ldc1            #114 <String "CP500">
	//  231  600:ldc1            #114 <String "CP500">
	//  232  602:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  233  607:pop             
		MAP.put("CSIBM500", "CP500");
	//  234  608:getstatic       #16  <Field Map MAP>
	//  235  611:ldc1            #118 <String "CSIBM500">
	//  236  613:ldc1            #114 <String "CP500">
	//  237  615:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  238  620:pop             
		MAP.put("EBCDIC-CP-CH", "CP500");
	//  239  621:getstatic       #16  <Field Map MAP>
	//  240  624:ldc1            #112 <String "EBCDIC-CP-CH">
	//  241  626:ldc1            #114 <String "CP500">
	//  242  628:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  243  633:pop             
		MAP.put("EBCDIC-CP-BE", "CP500");
	//  244  634:getstatic       #16  <Field Map MAP>
	//  245  637:ldc1            #120 <String "EBCDIC-CP-BE">
	//  246  639:ldc1            #114 <String "CP500">
	//  247  641:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  248  646:pop             
		MAP.put("IBM868", "CP868");
	//  249  647:getstatic       #16  <Field Map MAP>
	//  250  650:ldc1            #122 <String "IBM868">
	//  251  652:ldc1            #124 <String "CP868">
	//  252  654:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  253  659:pop             
		MAP.put("CP868", "CP868");
	//  254  660:getstatic       #16  <Field Map MAP>
	//  255  663:ldc1            #124 <String "CP868">
	//  256  665:ldc1            #124 <String "CP868">
	//  257  667:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  258  672:pop             
		MAP.put("CSIBM868", "CP868");
	//  259  673:getstatic       #16  <Field Map MAP>
	//  260  676:ldc1            #126 <String "CSIBM868">
	//  261  678:ldc1            #124 <String "CP868">
	//  262  680:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  263  685:pop             
		MAP.put("CP-AR", "CP868");
	//  264  686:getstatic       #16  <Field Map MAP>
	//  265  689:ldc1            #128 <String "CP-AR">
	//  266  691:ldc1            #124 <String "CP868">
	//  267  693:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  268  698:pop             
		MAP.put("IBM869", "CP869");
	//  269  699:getstatic       #16  <Field Map MAP>
	//  270  702:ldc1            #130 <String "IBM869">
	//  271  704:ldc1            #132 <String "CP869">
	//  272  706:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  273  711:pop             
		MAP.put("CP869", "CP869");
	//  274  712:getstatic       #16  <Field Map MAP>
	//  275  715:ldc1            #132 <String "CP869">
	//  276  717:ldc1            #132 <String "CP869">
	//  277  719:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  278  724:pop             
		MAP.put("CSIBM869", "CP869");
	//  279  725:getstatic       #16  <Field Map MAP>
	//  280  728:ldc1            #134 <String "CSIBM869">
	//  281  730:ldc1            #132 <String "CP869">
	//  282  732:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  283  737:pop             
		MAP.put("CP-GR", "CP869");
	//  284  738:getstatic       #16  <Field Map MAP>
	//  285  741:ldc1            #136 <String "CP-GR">
	//  286  743:ldc1            #132 <String "CP869">
	//  287  745:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  288  750:pop             
		MAP.put("IBM870", "CP870");
	//  289  751:getstatic       #16  <Field Map MAP>
	//  290  754:ldc1            #138 <String "IBM870">
	//  291  756:ldc1            #140 <String "CP870">
	//  292  758:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  293  763:pop             
		MAP.put("CP870", "CP870");
	//  294  764:getstatic       #16  <Field Map MAP>
	//  295  767:ldc1            #140 <String "CP870">
	//  296  769:ldc1            #140 <String "CP870">
	//  297  771:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  298  776:pop             
		MAP.put("CSIBM870", "CP870");
	//  299  777:getstatic       #16  <Field Map MAP>
	//  300  780:ldc1            #142 <String "CSIBM870">
	//  301  782:ldc1            #140 <String "CP870">
	//  302  784:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  303  789:pop             
		MAP.put("EBCDIC-CP-ROECE", "CP870");
	//  304  790:getstatic       #16  <Field Map MAP>
	//  305  793:ldc1            #144 <String "EBCDIC-CP-ROECE">
	//  306  795:ldc1            #140 <String "CP870">
	//  307  797:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  308  802:pop             
		MAP.put("EBCDIC-CP-YU", "CP870");
	//  309  803:getstatic       #16  <Field Map MAP>
	//  310  806:ldc1            #146 <String "EBCDIC-CP-YU">
	//  311  808:ldc1            #140 <String "CP870">
	//  312  810:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  313  815:pop             
		MAP.put("IBM871", "CP871");
	//  314  816:getstatic       #16  <Field Map MAP>
	//  315  819:ldc1            #148 <String "IBM871">
	//  316  821:ldc1            #150 <String "CP871">
	//  317  823:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  318  828:pop             
		MAP.put("CP871", "CP871");
	//  319  829:getstatic       #16  <Field Map MAP>
	//  320  832:ldc1            #150 <String "CP871">
	//  321  834:ldc1            #150 <String "CP871">
	//  322  836:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  323  841:pop             
		MAP.put("CSIBM871", "CP871");
	//  324  842:getstatic       #16  <Field Map MAP>
	//  325  845:ldc1            #152 <String "CSIBM871">
	//  326  847:ldc1            #150 <String "CP871">
	//  327  849:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  328  854:pop             
		MAP.put("EBCDIC-CP-IS", "CP871");
	//  329  855:getstatic       #16  <Field Map MAP>
	//  330  858:ldc1            #154 <String "EBCDIC-CP-IS">
	//  331  860:ldc1            #150 <String "CP871">
	//  332  862:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  333  867:pop             
		MAP.put("IBM918", "CP918");
	//  334  868:getstatic       #16  <Field Map MAP>
	//  335  871:ldc1            #156 <String "IBM918">
	//  336  873:ldc1            #158 <String "CP918">
	//  337  875:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  338  880:pop             
		MAP.put("CP918", "CP918");
	//  339  881:getstatic       #16  <Field Map MAP>
	//  340  884:ldc1            #158 <String "CP918">
	//  341  886:ldc1            #158 <String "CP918">
	//  342  888:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  343  893:pop             
		MAP.put("CSIBM918", "CP918");
	//  344  894:getstatic       #16  <Field Map MAP>
	//  345  897:ldc1            #160 <String "CSIBM918">
	//  346  899:ldc1            #158 <String "CP918">
	//  347  901:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  348  906:pop             
		MAP.put("EBCDIC-CP-AR2", "CP918");
	//  349  907:getstatic       #16  <Field Map MAP>
	//  350  910:ldc1            #162 <String "EBCDIC-CP-AR2">
	//  351  912:ldc1            #158 <String "CP918">
	//  352  914:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  353  919:pop             
		MAP.put("EUC-JP", "EUCJIS");
	//  354  920:getstatic       #16  <Field Map MAP>
	//  355  923:ldc1            #164 <String "EUC-JP">
	//  356  925:ldc1            #166 <String "EUCJIS">
	//  357  927:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  358  932:pop             
		MAP.put("CSEUCPkdFmtJapanese", "EUCJIS");
	//  359  933:getstatic       #16  <Field Map MAP>
	//  360  936:ldc1            #168 <String "CSEUCPkdFmtJapanese">
	//  361  938:ldc1            #166 <String "EUCJIS">
	//  362  940:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  363  945:pop             
		MAP.put("EUC-KR", "KSC5601");
	//  364  946:getstatic       #16  <Field Map MAP>
	//  365  949:ldc1            #170 <String "EUC-KR">
	//  366  951:ldc1            #172 <String "KSC5601">
	//  367  953:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  368  958:pop             
		MAP.put("GB2312", "GB2312");
	//  369  959:getstatic       #16  <Field Map MAP>
	//  370  962:ldc1            #174 <String "GB2312">
	//  371  964:ldc1            #174 <String "GB2312">
	//  372  966:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  373  971:pop             
		MAP.put("CSGB2312", "GB2312");
	//  374  972:getstatic       #16  <Field Map MAP>
	//  375  975:ldc1            #176 <String "CSGB2312">
	//  376  977:ldc1            #174 <String "GB2312">
	//  377  979:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  378  984:pop             
		MAP.put("ISO-2022-JP", "JIS");
	//  379  985:getstatic       #16  <Field Map MAP>
	//  380  988:ldc1            #178 <String "ISO-2022-JP">
	//  381  990:ldc1            #180 <String "JIS">
	//  382  992:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  383  997:pop             
		MAP.put("CSISO2022JP", "JIS");
	//  384  998:getstatic       #16  <Field Map MAP>
	//  385 1001:ldc1            #182 <String "CSISO2022JP">
	//  386 1003:ldc1            #180 <String "JIS">
	//  387 1005:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  388 1010:pop             
		MAP.put("ISO-2022-KR", "ISO2022KR");
	//  389 1011:getstatic       #16  <Field Map MAP>
	//  390 1014:ldc1            #184 <String "ISO-2022-KR">
	//  391 1016:ldc1            #186 <String "ISO2022KR">
	//  392 1018:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  393 1023:pop             
		MAP.put("CSISO2022KR", "ISO2022KR");
	//  394 1024:getstatic       #16  <Field Map MAP>
	//  395 1027:ldc1            #188 <String "CSISO2022KR">
	//  396 1029:ldc1            #186 <String "ISO2022KR">
	//  397 1031:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  398 1036:pop             
		MAP.put("ISO-2022-CN", "ISO2022CN");
	//  399 1037:getstatic       #16  <Field Map MAP>
	//  400 1040:ldc1            #190 <String "ISO-2022-CN">
	//  401 1042:ldc1            #192 <String "ISO2022CN">
	//  402 1044:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  403 1049:pop             
		MAP.put("X0201", "JIS0201");
	//  404 1050:getstatic       #16  <Field Map MAP>
	//  405 1053:ldc1            #194 <String "X0201">
	//  406 1055:ldc1            #196 <String "JIS0201">
	//  407 1057:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  408 1062:pop             
		MAP.put("CSISO13JISC6220JP", "JIS0201");
	//  409 1063:getstatic       #16  <Field Map MAP>
	//  410 1066:ldc1            #198 <String "CSISO13JISC6220JP">
	//  411 1068:ldc1            #196 <String "JIS0201">
	//  412 1070:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  413 1075:pop             
		MAP.put("X0208", "JIS0208");
	//  414 1076:getstatic       #16  <Field Map MAP>
	//  415 1079:ldc1            #200 <String "X0208">
	//  416 1081:ldc1            #202 <String "JIS0208">
	//  417 1083:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  418 1088:pop             
		MAP.put("ISO-IR-87", "JIS0208");
	//  419 1089:getstatic       #16  <Field Map MAP>
	//  420 1092:ldc1            #204 <String "ISO-IR-87">
	//  421 1094:ldc1            #202 <String "JIS0208">
	//  422 1096:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  423 1101:pop             
		MAP.put("X0208dbiJIS_X0208-1983", "JIS0208");
	//  424 1102:getstatic       #16  <Field Map MAP>
	//  425 1105:ldc1            #206 <String "X0208dbiJIS_X0208-1983">
	//  426 1107:ldc1            #202 <String "JIS0208">
	//  427 1109:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  428 1114:pop             
		MAP.put("CSISO87JISX0208", "JIS0208");
	//  429 1115:getstatic       #16  <Field Map MAP>
	//  430 1118:ldc1            #208 <String "CSISO87JISX0208">
	//  431 1120:ldc1            #202 <String "JIS0208">
	//  432 1122:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  433 1127:pop             
		MAP.put("X0212", "JIS0212");
	//  434 1128:getstatic       #16  <Field Map MAP>
	//  435 1131:ldc1            #210 <String "X0212">
	//  436 1133:ldc1            #212 <String "JIS0212">
	//  437 1135:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  438 1140:pop             
		MAP.put("ISO-IR-159", "JIS0212");
	//  439 1141:getstatic       #16  <Field Map MAP>
	//  440 1144:ldc1            #214 <String "ISO-IR-159">
	//  441 1146:ldc1            #212 <String "JIS0212">
	//  442 1148:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  443 1153:pop             
		MAP.put("CSISO159JISX02121990", "JIS0212");
	//  444 1154:getstatic       #16  <Field Map MAP>
	//  445 1157:ldc1            #216 <String "CSISO159JISX02121990">
	//  446 1159:ldc1            #212 <String "JIS0212">
	//  447 1161:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  448 1166:pop             
		MAP.put("SHIFT_JIS", "SJIS");
	//  449 1167:getstatic       #16  <Field Map MAP>
	//  450 1170:ldc1            #218 <String "SHIFT_JIS">
	//  451 1172:ldc1            #220 <String "SJIS">
	//  452 1174:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  453 1179:pop             
		MAP.put("CSSHIFT_JIS", "SJIS");
	//  454 1180:getstatic       #16  <Field Map MAP>
	//  455 1183:ldc1            #222 <String "CSSHIFT_JIS">
	//  456 1185:ldc1            #220 <String "SJIS">
	//  457 1187:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  458 1192:pop             
		MAP.put("MS_Kanji", "SJIS");
	//  459 1193:getstatic       #16  <Field Map MAP>
	//  460 1196:ldc1            #224 <String "MS_Kanji">
	//  461 1198:ldc1            #220 <String "SJIS">
	//  462 1200:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  463 1205:pop             
		MAP.put("WINDOWS-1250", "Cp1250");
	//  464 1206:getstatic       #16  <Field Map MAP>
	//  465 1209:ldc1            #226 <String "WINDOWS-1250">
	//  466 1211:ldc1            #228 <String "Cp1250">
	//  467 1213:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  468 1218:pop             
		MAP.put("WINDOWS-1251", "Cp1251");
	//  469 1219:getstatic       #16  <Field Map MAP>
	//  470 1222:ldc1            #230 <String "WINDOWS-1251">
	//  471 1224:ldc1            #232 <String "Cp1251">
	//  472 1226:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  473 1231:pop             
		MAP.put("WINDOWS-1252", "Cp1252");
	//  474 1232:getstatic       #16  <Field Map MAP>
	//  475 1235:ldc1            #234 <String "WINDOWS-1252">
	//  476 1237:ldc1            #236 <String "Cp1252">
	//  477 1239:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  478 1244:pop             
		MAP.put("WINDOWS-1253", "Cp1253");
	//  479 1245:getstatic       #16  <Field Map MAP>
	//  480 1248:ldc1            #238 <String "WINDOWS-1253">
	//  481 1250:ldc1            #240 <String "Cp1253">
	//  482 1252:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  483 1257:pop             
		MAP.put("WINDOWS-1254", "Cp1254");
	//  484 1258:getstatic       #16  <Field Map MAP>
	//  485 1261:ldc1            #242 <String "WINDOWS-1254">
	//  486 1263:ldc1            #244 <String "Cp1254">
	//  487 1265:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  488 1270:pop             
		MAP.put("WINDOWS-1255", "Cp1255");
	//  489 1271:getstatic       #16  <Field Map MAP>
	//  490 1274:ldc1            #246 <String "WINDOWS-1255">
	//  491 1276:ldc1            #248 <String "Cp1255">
	//  492 1278:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  493 1283:pop             
		MAP.put("WINDOWS-1256", "Cp1256");
	//  494 1284:getstatic       #16  <Field Map MAP>
	//  495 1287:ldc1            #250 <String "WINDOWS-1256">
	//  496 1289:ldc1            #252 <String "Cp1256">
	//  497 1291:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  498 1296:pop             
		MAP.put("WINDOWS-1257", "Cp1257");
	//  499 1297:getstatic       #16  <Field Map MAP>
	//  500 1300:ldc1            #254 <String "WINDOWS-1257">
	//  501 1302:ldc2            #256 <String "Cp1257">
	//  502 1305:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  503 1310:pop             
		MAP.put("WINDOWS-1258", "Cp1258");
	//  504 1311:getstatic       #16  <Field Map MAP>
	//  505 1314:ldc2            #258 <String "WINDOWS-1258">
	//  506 1317:ldc2            #260 <String "Cp1258">
	//  507 1320:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  508 1325:pop             
		MAP.put("TIS-620", "TIS620");
	//  509 1326:getstatic       #16  <Field Map MAP>
	//  510 1329:ldc2            #262 <String "TIS-620">
	//  511 1332:ldc2            #264 <String "TIS620">
	//  512 1335:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  513 1340:pop             
		MAP.put("ISO-8859-1", "ISO8859_1");
	//  514 1341:getstatic       #16  <Field Map MAP>
	//  515 1344:ldc2            #266 <String "ISO-8859-1">
	//  516 1347:ldc2            #268 <String "ISO8859_1">
	//  517 1350:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  518 1355:pop             
		MAP.put("ISO-IR-100", "ISO8859_1");
	//  519 1356:getstatic       #16  <Field Map MAP>
	//  520 1359:ldc2            #270 <String "ISO-IR-100">
	//  521 1362:ldc2            #268 <String "ISO8859_1">
	//  522 1365:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  523 1370:pop             
		MAP.put("ISO_8859-1", "ISO8859_1");
	//  524 1371:getstatic       #16  <Field Map MAP>
	//  525 1374:ldc2            #272 <String "ISO_8859-1">
	//  526 1377:ldc2            #268 <String "ISO8859_1">
	//  527 1380:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  528 1385:pop             
		MAP.put("LATIN1", "ISO8859_1");
	//  529 1386:getstatic       #16  <Field Map MAP>
	//  530 1389:ldc2            #274 <String "LATIN1">
	//  531 1392:ldc2            #268 <String "ISO8859_1">
	//  532 1395:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  533 1400:pop             
		MAP.put("CSISOLATIN1", "ISO8859_1");
	//  534 1401:getstatic       #16  <Field Map MAP>
	//  535 1404:ldc2            #276 <String "CSISOLATIN1">
	//  536 1407:ldc2            #268 <String "ISO8859_1">
	//  537 1410:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  538 1415:pop             
		MAP.put("L1", "ISO8859_1");
	//  539 1416:getstatic       #16  <Field Map MAP>
	//  540 1419:ldc2            #278 <String "L1">
	//  541 1422:ldc2            #268 <String "ISO8859_1">
	//  542 1425:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  543 1430:pop             
		MAP.put("IBM819", "ISO8859_1");
	//  544 1431:getstatic       #16  <Field Map MAP>
	//  545 1434:ldc2            #280 <String "IBM819">
	//  546 1437:ldc2            #268 <String "ISO8859_1">
	//  547 1440:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  548 1445:pop             
		MAP.put("CP819", "ISO8859_1");
	//  549 1446:getstatic       #16  <Field Map MAP>
	//  550 1449:ldc2            #282 <String "CP819">
	//  551 1452:ldc2            #268 <String "ISO8859_1">
	//  552 1455:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  553 1460:pop             
		MAP.put("ISO-8859-2", "ISO8859_2");
	//  554 1461:getstatic       #16  <Field Map MAP>
	//  555 1464:ldc2            #284 <String "ISO-8859-2">
	//  556 1467:ldc2            #286 <String "ISO8859_2">
	//  557 1470:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  558 1475:pop             
		MAP.put("ISO-IR-101", "ISO8859_2");
	//  559 1476:getstatic       #16  <Field Map MAP>
	//  560 1479:ldc2            #288 <String "ISO-IR-101">
	//  561 1482:ldc2            #286 <String "ISO8859_2">
	//  562 1485:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  563 1490:pop             
		MAP.put("ISO_8859-2", "ISO8859_2");
	//  564 1491:getstatic       #16  <Field Map MAP>
	//  565 1494:ldc2            #290 <String "ISO_8859-2">
	//  566 1497:ldc2            #286 <String "ISO8859_2">
	//  567 1500:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  568 1505:pop             
		MAP.put("LATIN2", "ISO8859_2");
	//  569 1506:getstatic       #16  <Field Map MAP>
	//  570 1509:ldc2            #292 <String "LATIN2">
	//  571 1512:ldc2            #286 <String "ISO8859_2">
	//  572 1515:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  573 1520:pop             
		MAP.put("CSISOLATIN2", "ISO8859_2");
	//  574 1521:getstatic       #16  <Field Map MAP>
	//  575 1524:ldc2            #294 <String "CSISOLATIN2">
	//  576 1527:ldc2            #286 <String "ISO8859_2">
	//  577 1530:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  578 1535:pop             
		MAP.put("L2", "ISO8859_2");
	//  579 1536:getstatic       #16  <Field Map MAP>
	//  580 1539:ldc2            #296 <String "L2">
	//  581 1542:ldc2            #286 <String "ISO8859_2">
	//  582 1545:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  583 1550:pop             
		MAP.put("ISO-8859-3", "ISO8859_3");
	//  584 1551:getstatic       #16  <Field Map MAP>
	//  585 1554:ldc2            #298 <String "ISO-8859-3">
	//  586 1557:ldc2            #300 <String "ISO8859_3">
	//  587 1560:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  588 1565:pop             
		MAP.put("ISO-IR-109", "ISO8859_3");
	//  589 1566:getstatic       #16  <Field Map MAP>
	//  590 1569:ldc2            #302 <String "ISO-IR-109">
	//  591 1572:ldc2            #300 <String "ISO8859_3">
	//  592 1575:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  593 1580:pop             
		MAP.put("ISO_8859-3", "ISO8859_3");
	//  594 1581:getstatic       #16  <Field Map MAP>
	//  595 1584:ldc2            #304 <String "ISO_8859-3">
	//  596 1587:ldc2            #300 <String "ISO8859_3">
	//  597 1590:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  598 1595:pop             
		MAP.put("LATIN3", "ISO8859_3");
	//  599 1596:getstatic       #16  <Field Map MAP>
	//  600 1599:ldc2            #306 <String "LATIN3">
	//  601 1602:ldc2            #300 <String "ISO8859_3">
	//  602 1605:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  603 1610:pop             
		MAP.put("CSISOLATIN3", "ISO8859_3");
	//  604 1611:getstatic       #16  <Field Map MAP>
	//  605 1614:ldc2            #308 <String "CSISOLATIN3">
	//  606 1617:ldc2            #300 <String "ISO8859_3">
	//  607 1620:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  608 1625:pop             
		MAP.put("L3", "ISO8859_3");
	//  609 1626:getstatic       #16  <Field Map MAP>
	//  610 1629:ldc2            #310 <String "L3">
	//  611 1632:ldc2            #300 <String "ISO8859_3">
	//  612 1635:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  613 1640:pop             
		MAP.put("ISO-8859-4", "ISO8859_4");
	//  614 1641:getstatic       #16  <Field Map MAP>
	//  615 1644:ldc2            #312 <String "ISO-8859-4">
	//  616 1647:ldc2            #314 <String "ISO8859_4">
	//  617 1650:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  618 1655:pop             
		MAP.put("ISO-IR-110", "ISO8859_4");
	//  619 1656:getstatic       #16  <Field Map MAP>
	//  620 1659:ldc2            #316 <String "ISO-IR-110">
	//  621 1662:ldc2            #314 <String "ISO8859_4">
	//  622 1665:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  623 1670:pop             
		MAP.put("ISO_8859-4", "ISO8859_4");
	//  624 1671:getstatic       #16  <Field Map MAP>
	//  625 1674:ldc2            #318 <String "ISO_8859-4">
	//  626 1677:ldc2            #314 <String "ISO8859_4">
	//  627 1680:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  628 1685:pop             
		MAP.put("LATIN4", "ISO8859_4");
	//  629 1686:getstatic       #16  <Field Map MAP>
	//  630 1689:ldc2            #320 <String "LATIN4">
	//  631 1692:ldc2            #314 <String "ISO8859_4">
	//  632 1695:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  633 1700:pop             
		MAP.put("CSISOLATIN4", "ISO8859_4");
	//  634 1701:getstatic       #16  <Field Map MAP>
	//  635 1704:ldc2            #322 <String "CSISOLATIN4">
	//  636 1707:ldc2            #314 <String "ISO8859_4">
	//  637 1710:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  638 1715:pop             
		MAP.put("L4", "ISO8859_4");
	//  639 1716:getstatic       #16  <Field Map MAP>
	//  640 1719:ldc2            #324 <String "L4">
	//  641 1722:ldc2            #314 <String "ISO8859_4">
	//  642 1725:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  643 1730:pop             
		MAP.put("ISO-8859-5", "ISO8859_5");
	//  644 1731:getstatic       #16  <Field Map MAP>
	//  645 1734:ldc2            #326 <String "ISO-8859-5">
	//  646 1737:ldc2            #328 <String "ISO8859_5">
	//  647 1740:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  648 1745:pop             
		MAP.put("ISO-IR-144", "ISO8859_5");
	//  649 1746:getstatic       #16  <Field Map MAP>
	//  650 1749:ldc2            #330 <String "ISO-IR-144">
	//  651 1752:ldc2            #328 <String "ISO8859_5">
	//  652 1755:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  653 1760:pop             
		MAP.put("ISO_8859-5", "ISO8859_5");
	//  654 1761:getstatic       #16  <Field Map MAP>
	//  655 1764:ldc2            #332 <String "ISO_8859-5">
	//  656 1767:ldc2            #328 <String "ISO8859_5">
	//  657 1770:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  658 1775:pop             
		MAP.put("CYRILLIC", "ISO8859_5");
	//  659 1776:getstatic       #16  <Field Map MAP>
	//  660 1779:ldc2            #334 <String "CYRILLIC">
	//  661 1782:ldc2            #328 <String "ISO8859_5">
	//  662 1785:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  663 1790:pop             
		MAP.put("CSISOLATINCYRILLIC", "ISO8859_5");
	//  664 1791:getstatic       #16  <Field Map MAP>
	//  665 1794:ldc2            #336 <String "CSISOLATINCYRILLIC">
	//  666 1797:ldc2            #328 <String "ISO8859_5">
	//  667 1800:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  668 1805:pop             
		MAP.put("ISO-8859-6", "ISO8859_6");
	//  669 1806:getstatic       #16  <Field Map MAP>
	//  670 1809:ldc2            #338 <String "ISO-8859-6">
	//  671 1812:ldc2            #340 <String "ISO8859_6">
	//  672 1815:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  673 1820:pop             
		MAP.put("ISO-IR-127", "ISO8859_6");
	//  674 1821:getstatic       #16  <Field Map MAP>
	//  675 1824:ldc2            #342 <String "ISO-IR-127">
	//  676 1827:ldc2            #340 <String "ISO8859_6">
	//  677 1830:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  678 1835:pop             
		MAP.put("ISO_8859-6", "ISO8859_6");
	//  679 1836:getstatic       #16  <Field Map MAP>
	//  680 1839:ldc2            #344 <String "ISO_8859-6">
	//  681 1842:ldc2            #340 <String "ISO8859_6">
	//  682 1845:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  683 1850:pop             
		MAP.put("ECMA-114", "ISO8859_6");
	//  684 1851:getstatic       #16  <Field Map MAP>
	//  685 1854:ldc2            #346 <String "ECMA-114">
	//  686 1857:ldc2            #340 <String "ISO8859_6">
	//  687 1860:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  688 1865:pop             
		MAP.put("ASMO-708", "ISO8859_6");
	//  689 1866:getstatic       #16  <Field Map MAP>
	//  690 1869:ldc2            #348 <String "ASMO-708">
	//  691 1872:ldc2            #340 <String "ISO8859_6">
	//  692 1875:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  693 1880:pop             
		MAP.put("ARABIC", "ISO8859_6");
	//  694 1881:getstatic       #16  <Field Map MAP>
	//  695 1884:ldc2            #350 <String "ARABIC">
	//  696 1887:ldc2            #340 <String "ISO8859_6">
	//  697 1890:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  698 1895:pop             
		MAP.put("CSISOLATINARABIC", "ISO8859_6");
	//  699 1896:getstatic       #16  <Field Map MAP>
	//  700 1899:ldc2            #352 <String "CSISOLATINARABIC">
	//  701 1902:ldc2            #340 <String "ISO8859_6">
	//  702 1905:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  703 1910:pop             
		MAP.put("ISO-8859-7", "ISO8859_7");
	//  704 1911:getstatic       #16  <Field Map MAP>
	//  705 1914:ldc2            #354 <String "ISO-8859-7">
	//  706 1917:ldc2            #356 <String "ISO8859_7">
	//  707 1920:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  708 1925:pop             
		MAP.put("ISO-IR-126", "ISO8859_7");
	//  709 1926:getstatic       #16  <Field Map MAP>
	//  710 1929:ldc2            #358 <String "ISO-IR-126">
	//  711 1932:ldc2            #356 <String "ISO8859_7">
	//  712 1935:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  713 1940:pop             
		MAP.put("ISO_8859-7", "ISO8859_7");
	//  714 1941:getstatic       #16  <Field Map MAP>
	//  715 1944:ldc2            #360 <String "ISO_8859-7">
	//  716 1947:ldc2            #356 <String "ISO8859_7">
	//  717 1950:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  718 1955:pop             
		MAP.put("ELOT_928", "ISO8859_7");
	//  719 1956:getstatic       #16  <Field Map MAP>
	//  720 1959:ldc2            #362 <String "ELOT_928">
	//  721 1962:ldc2            #356 <String "ISO8859_7">
	//  722 1965:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  723 1970:pop             
		MAP.put("ECMA-118", "ISO8859_7");
	//  724 1971:getstatic       #16  <Field Map MAP>
	//  725 1974:ldc2            #364 <String "ECMA-118">
	//  726 1977:ldc2            #356 <String "ISO8859_7">
	//  727 1980:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  728 1985:pop             
		MAP.put("GREEK", "ISO8859_7");
	//  729 1986:getstatic       #16  <Field Map MAP>
	//  730 1989:ldc2            #366 <String "GREEK">
	//  731 1992:ldc2            #356 <String "ISO8859_7">
	//  732 1995:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  733 2000:pop             
		MAP.put("CSISOLATINGREEK", "ISO8859_7");
	//  734 2001:getstatic       #16  <Field Map MAP>
	//  735 2004:ldc2            #368 <String "CSISOLATINGREEK">
	//  736 2007:ldc2            #356 <String "ISO8859_7">
	//  737 2010:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  738 2015:pop             
		MAP.put("GREEK8", "ISO8859_7");
	//  739 2016:getstatic       #16  <Field Map MAP>
	//  740 2019:ldc2            #370 <String "GREEK8">
	//  741 2022:ldc2            #356 <String "ISO8859_7">
	//  742 2025:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  743 2030:pop             
		MAP.put("ISO-8859-8", "ISO8859_8");
	//  744 2031:getstatic       #16  <Field Map MAP>
	//  745 2034:ldc2            #372 <String "ISO-8859-8">
	//  746 2037:ldc2            #374 <String "ISO8859_8">
	//  747 2040:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  748 2045:pop             
		MAP.put("ISO-8859-8-I", "ISO8859_8");
	//  749 2046:getstatic       #16  <Field Map MAP>
	//  750 2049:ldc2            #376 <String "ISO-8859-8-I">
	//  751 2052:ldc2            #374 <String "ISO8859_8">
	//  752 2055:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  753 2060:pop             
		MAP.put("ISO-IR-138", "ISO8859_8");
	//  754 2061:getstatic       #16  <Field Map MAP>
	//  755 2064:ldc2            #378 <String "ISO-IR-138">
	//  756 2067:ldc2            #374 <String "ISO8859_8">
	//  757 2070:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  758 2075:pop             
		MAP.put("ISO_8859-8", "ISO8859_8");
	//  759 2076:getstatic       #16  <Field Map MAP>
	//  760 2079:ldc2            #380 <String "ISO_8859-8">
	//  761 2082:ldc2            #374 <String "ISO8859_8">
	//  762 2085:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  763 2090:pop             
		MAP.put("HEBREW", "ISO8859_8");
	//  764 2091:getstatic       #16  <Field Map MAP>
	//  765 2094:ldc2            #382 <String "HEBREW">
	//  766 2097:ldc2            #374 <String "ISO8859_8">
	//  767 2100:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  768 2105:pop             
		MAP.put("CSISOLATINHEBREW", "ISO8859_8");
	//  769 2106:getstatic       #16  <Field Map MAP>
	//  770 2109:ldc2            #384 <String "CSISOLATINHEBREW">
	//  771 2112:ldc2            #374 <String "ISO8859_8">
	//  772 2115:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  773 2120:pop             
		MAP.put("ISO-8859-9", "ISO8859_9");
	//  774 2121:getstatic       #16  <Field Map MAP>
	//  775 2124:ldc2            #386 <String "ISO-8859-9">
	//  776 2127:ldc2            #388 <String "ISO8859_9">
	//  777 2130:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  778 2135:pop             
		MAP.put("ISO-IR-148", "ISO8859_9");
	//  779 2136:getstatic       #16  <Field Map MAP>
	//  780 2139:ldc2            #390 <String "ISO-IR-148">
	//  781 2142:ldc2            #388 <String "ISO8859_9">
	//  782 2145:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  783 2150:pop             
		MAP.put("ISO_8859-9", "ISO8859_9");
	//  784 2151:getstatic       #16  <Field Map MAP>
	//  785 2154:ldc2            #392 <String "ISO_8859-9">
	//  786 2157:ldc2            #388 <String "ISO8859_9">
	//  787 2160:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  788 2165:pop             
		MAP.put("LATIN5", "ISO8859_9");
	//  789 2166:getstatic       #16  <Field Map MAP>
	//  790 2169:ldc2            #394 <String "LATIN5">
	//  791 2172:ldc2            #388 <String "ISO8859_9">
	//  792 2175:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  793 2180:pop             
		MAP.put("CSISOLATIN5", "ISO8859_9");
	//  794 2181:getstatic       #16  <Field Map MAP>
	//  795 2184:ldc2            #396 <String "CSISOLATIN5">
	//  796 2187:ldc2            #388 <String "ISO8859_9">
	//  797 2190:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  798 2195:pop             
		MAP.put("L5", "ISO8859_9");
	//  799 2196:getstatic       #16  <Field Map MAP>
	//  800 2199:ldc2            #398 <String "L5">
	//  801 2202:ldc2            #388 <String "ISO8859_9">
	//  802 2205:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  803 2210:pop             
		MAP.put("KOI8-R", "KOI8_R");
	//  804 2211:getstatic       #16  <Field Map MAP>
	//  805 2214:ldc2            #400 <String "KOI8-R">
	//  806 2217:ldc2            #402 <String "KOI8_R">
	//  807 2220:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  808 2225:pop             
		MAP.put("CSKOI8-R", "KOI8_R");
	//  809 2226:getstatic       #16  <Field Map MAP>
	//  810 2229:ldc2            #404 <String "CSKOI8-R">
	//  811 2232:ldc2            #402 <String "KOI8_R">
	//  812 2235:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  813 2240:pop             
		MAP.put("US-ASCII", "ASCII");
	//  814 2241:getstatic       #16  <Field Map MAP>
	//  815 2244:ldc2            #406 <String "US-ASCII">
	//  816 2247:ldc2            #408 <String "ASCII">
	//  817 2250:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  818 2255:pop             
		MAP.put("ISO-IR-6", "ASCII");
	//  819 2256:getstatic       #16  <Field Map MAP>
	//  820 2259:ldc2            #410 <String "ISO-IR-6">
	//  821 2262:ldc2            #408 <String "ASCII">
	//  822 2265:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  823 2270:pop             
		MAP.put("ANSI_X3.4-1986", "ASCII");
	//  824 2271:getstatic       #16  <Field Map MAP>
	//  825 2274:ldc2            #412 <String "ANSI_X3.4-1986">
	//  826 2277:ldc2            #408 <String "ASCII">
	//  827 2280:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  828 2285:pop             
		MAP.put("ISO_646.IRV:1991", "ASCII");
	//  829 2286:getstatic       #16  <Field Map MAP>
	//  830 2289:ldc2            #414 <String "ISO_646.IRV:1991">
	//  831 2292:ldc2            #408 <String "ASCII">
	//  832 2295:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  833 2300:pop             
		MAP.put("ASCII", "ASCII");
	//  834 2301:getstatic       #16  <Field Map MAP>
	//  835 2304:ldc2            #408 <String "ASCII">
	//  836 2307:ldc2            #408 <String "ASCII">
	//  837 2310:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  838 2315:pop             
		MAP.put("CSASCII", "ASCII");
	//  839 2316:getstatic       #16  <Field Map MAP>
	//  840 2319:ldc2            #416 <String "CSASCII">
	//  841 2322:ldc2            #408 <String "ASCII">
	//  842 2325:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  843 2330:pop             
		MAP.put("ISO646-US", "ASCII");
	//  844 2331:getstatic       #16  <Field Map MAP>
	//  845 2334:ldc2            #418 <String "ISO646-US">
	//  846 2337:ldc2            #408 <String "ASCII">
	//  847 2340:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  848 2345:pop             
		MAP.put("US", "ASCII");
	//  849 2346:getstatic       #16  <Field Map MAP>
	//  850 2349:ldc2            #420 <String "US">
	//  851 2352:ldc2            #408 <String "ASCII">
	//  852 2355:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  853 2360:pop             
		MAP.put("IBM367", "ASCII");
	//  854 2361:getstatic       #16  <Field Map MAP>
	//  855 2364:ldc2            #422 <String "IBM367">
	//  856 2367:ldc2            #408 <String "ASCII">
	//  857 2370:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  858 2375:pop             
		MAP.put("CP367", "ASCII");
	//  859 2376:getstatic       #16  <Field Map MAP>
	//  860 2379:ldc2            #424 <String "CP367">
	//  861 2382:ldc2            #408 <String "ASCII">
	//  862 2385:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  863 2390:pop             
		MAP.put("UTF-8", "UTF8");
	//  864 2391:getstatic       #16  <Field Map MAP>
	//  865 2394:ldc2            #426 <String "UTF-8">
	//  866 2397:ldc2            #428 <String "UTF8">
	//  867 2400:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  868 2405:pop             
		MAP.put("UTF-16", "Unicode");
	//  869 2406:getstatic       #16  <Field Map MAP>
	//  870 2409:ldc2            #430 <String "UTF-16">
	//  871 2412:ldc2            #432 <String "Unicode">
	//  872 2415:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  873 2420:pop             
		MAP.put("UTF-16BE", "UnicodeBig");
	//  874 2421:getstatic       #16  <Field Map MAP>
	//  875 2424:ldc2            #434 <String "UTF-16BE">
	//  876 2427:ldc2            #436 <String "UnicodeBig">
	//  877 2430:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  878 2435:pop             
		MAP.put("UTF-16LE", "UnicodeLittle");
	//  879 2436:getstatic       #16  <Field Map MAP>
	//  880 2439:ldc2            #438 <String "UTF-16LE">
	//  881 2442:ldc2            #440 <String "UnicodeLittle">
	//  882 2445:invokeinterface #26  <Method Object Map.put(Object, Object)>
	//  883 2450:pop             
	//* 884 2451:return          
	}
}
