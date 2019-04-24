// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			HTML

public static final class HTML$Category
{

	public static final Set BLOCK_LEVEL = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"address", "article", "aside", "audio", "blockquote", "canvas", "dd", "div", "fieldset", "figcaption", 
		"figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", 
		"hgroup", "hr", "noscript", "ol", "output", "p", "pre", "section", "table", "ul", 
		"video"
	}))))));
	public static final Set EMBEDDED_CONTENT = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"audio", "canvas", "embed", "iframe", "img", "math", "object", "svg", "video"
	}))))));
	public static final Set FLOW_CONTENT = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"a", "abbr", "address", "article", "aside", "audio", "b", "bdo", "blockquote", "br", 
		"button", "canvas", "cite", "code", "command", "datalist", "del", "details", "dfn", "div", 
		"dl", "em", "embed", "fieldset", "figure", "footer", "form", "h1", "h2", "h3", 
		"h4", "h5", "h6", "header", "hgroup", "hr", "i", "iframe", "img", "input", 
		"ins", "kbd", "keygen", "label", "map", "mark", "math", "menu", "meter", "nav", 
		"noscript", "object", "ol", "output", "p", "pre", "progress", "q", "ruby", "samp", 
		"script", "section", "select", "small", "span", "font", "strong", "sub", "sup", "svg", 
		"table", "textarea", "time", "ul", "var", "video", "wbr"
	}))))));
	public static final Set HEADING_CONTENT = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"h1", "h2", "h3", "h4", "h5", "h6", "hgroup"
	}))))));
	public static final Set METADATA = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"base", "command", "link", "meta", "noscript", "style", "title"
	}))))));
	public static final Set NOT_VISIBLE = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"html", "head", "meta", "script", "link", "style", "title"
	}))))));
	public static final Set PHRASING_CONTENT = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"abbr", "audio", "b", "bdo", "br", "button", "canvas", "cite", "code", "command", 
		"datalist", "dfn", "em", "embed", "i", "iframe", "img", "input", "kbd", "keygen", 
		"label", "mark", "math", "meter", "noscript", "object", "output", "progress", "q", "ruby", 
		"samp", "script", "select", "small", "span", "font", "strong", "sub", "sup", "svg", 
		"textarea", "time", "var", "video", "wbr"
	}))))));
	public static final Set SECTIONING_CONTENT = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"article", "aside", "nav", "section"
	}))))));

	static 
	{
	//    0    0:new             #21  <Class HashSet>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:anewarray       String[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #25  <String "html">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #27  <String "head">
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #29  <String "meta">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #31  <String "script">
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:ldc1            #33  <String "link">
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_5        
	//   26   36:ldc1            #35  <String "style">
	//   27   38:aastore         
	//   28   39:dup             
	//   29   40:bipush          6
	//   30   42:ldc1            #37  <String "title">
	//   31   44:aastore         
	//   32   45:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//   33   48:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//   34   51:putstatic       #49  <Field Set NOT_VISIBLE>
	//   35   54:new             #21  <Class HashSet>
	//   36   57:dup             
	//   37   58:bipush          31
	//   38   60:anewarray       String[]
	//   39   63:dup             
	//   40   64:iconst_0        
	//   41   65:ldc1            #51  <String "address">
	//   42   67:aastore         
	//   43   68:dup             
	//   44   69:iconst_1        
	//   45   70:ldc1            #53  <String "article">
	//   46   72:aastore         
	//   47   73:dup             
	//   48   74:iconst_2        
	//   49   75:ldc1            #55  <String "aside">
	//   50   77:aastore         
	//   51   78:dup             
	//   52   79:iconst_3        
	//   53   80:ldc1            #57  <String "audio">
	//   54   82:aastore         
	//   55   83:dup             
	//   56   84:iconst_4        
	//   57   85:ldc1            #59  <String "blockquote">
	//   58   87:aastore         
	//   59   88:dup             
	//   60   89:iconst_5        
	//   61   90:ldc1            #61  <String "canvas">
	//   62   92:aastore         
	//   63   93:dup             
	//   64   94:bipush          6
	//   65   96:ldc1            #63  <String "dd">
	//   66   98:aastore         
	//   67   99:dup             
	//   68  100:bipush          7
	//   69  102:ldc1            #65  <String "div">
	//   70  104:aastore         
	//   71  105:dup             
	//   72  106:bipush          8
	//   73  108:ldc1            #67  <String "fieldset">
	//   74  110:aastore         
	//   75  111:dup             
	//   76  112:bipush          9
	//   77  114:ldc1            #69  <String "figcaption">
	//   78  116:aastore         
	//   79  117:dup             
	//   80  118:bipush          10
	//   81  120:ldc1            #71  <String "figure">
	//   82  122:aastore         
	//   83  123:dup             
	//   84  124:bipush          11
	//   85  126:ldc1            #73  <String "footer">
	//   86  128:aastore         
	//   87  129:dup             
	//   88  130:bipush          12
	//   89  132:ldc1            #75  <String "form">
	//   90  134:aastore         
	//   91  135:dup             
	//   92  136:bipush          13
	//   93  138:ldc1            #77  <String "h1">
	//   94  140:aastore         
	//   95  141:dup             
	//   96  142:bipush          14
	//   97  144:ldc1            #79  <String "h2">
	//   98  146:aastore         
	//   99  147:dup             
	//  100  148:bipush          15
	//  101  150:ldc1            #81  <String "h3">
	//  102  152:aastore         
	//  103  153:dup             
	//  104  154:bipush          16
	//  105  156:ldc1            #83  <String "h4">
	//  106  158:aastore         
	//  107  159:dup             
	//  108  160:bipush          17
	//  109  162:ldc1            #85  <String "h5">
	//  110  164:aastore         
	//  111  165:dup             
	//  112  166:bipush          18
	//  113  168:ldc1            #87  <String "h6">
	//  114  170:aastore         
	//  115  171:dup             
	//  116  172:bipush          19
	//  117  174:ldc1            #89  <String "header">
	//  118  176:aastore         
	//  119  177:dup             
	//  120  178:bipush          20
	//  121  180:ldc1            #91  <String "hgroup">
	//  122  182:aastore         
	//  123  183:dup             
	//  124  184:bipush          21
	//  125  186:ldc1            #93  <String "hr">
	//  126  188:aastore         
	//  127  189:dup             
	//  128  190:bipush          22
	//  129  192:ldc1            #95  <String "noscript">
	//  130  194:aastore         
	//  131  195:dup             
	//  132  196:bipush          23
	//  133  198:ldc1            #97  <String "ol">
	//  134  200:aastore         
	//  135  201:dup             
	//  136  202:bipush          24
	//  137  204:ldc1            #99  <String "output">
	//  138  206:aastore         
	//  139  207:dup             
	//  140  208:bipush          25
	//  141  210:ldc1            #101 <String "p">
	//  142  212:aastore         
	//  143  213:dup             
	//  144  214:bipush          26
	//  145  216:ldc1            #103 <String "pre">
	//  146  218:aastore         
	//  147  219:dup             
	//  148  220:bipush          27
	//  149  222:ldc1            #105 <String "section">
	//  150  224:aastore         
	//  151  225:dup             
	//  152  226:bipush          28
	//  153  228:ldc1            #107 <String "table">
	//  154  230:aastore         
	//  155  231:dup             
	//  156  232:bipush          29
	//  157  234:ldc1            #109 <String "ul">
	//  158  236:aastore         
	//  159  237:dup             
	//  160  238:bipush          30
	//  161  240:ldc1            #111 <String "video">
	//  162  242:aastore         
	//  163  243:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  164  246:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  165  249:putstatic       #113 <Field Set BLOCK_LEVEL>
	//  166  252:new             #21  <Class HashSet>
	//  167  255:dup             
	//  168  256:bipush          7
	//  169  258:anewarray       String[]
	//  170  261:dup             
	//  171  262:iconst_0        
	//  172  263:ldc1            #115 <String "base">
	//  173  265:aastore         
	//  174  266:dup             
	//  175  267:iconst_1        
	//  176  268:ldc1            #117 <String "command">
	//  177  270:aastore         
	//  178  271:dup             
	//  179  272:iconst_2        
	//  180  273:ldc1            #33  <String "link">
	//  181  275:aastore         
	//  182  276:dup             
	//  183  277:iconst_3        
	//  184  278:ldc1            #29  <String "meta">
	//  185  280:aastore         
	//  186  281:dup             
	//  187  282:iconst_4        
	//  188  283:ldc1            #95  <String "noscript">
	//  189  285:aastore         
	//  190  286:dup             
	//  191  287:iconst_5        
	//  192  288:ldc1            #35  <String "style">
	//  193  290:aastore         
	//  194  291:dup             
	//  195  292:bipush          6
	//  196  294:ldc1            #37  <String "title">
	//  197  296:aastore         
	//  198  297:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  199  300:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  200  303:putstatic       #119 <Field Set METADATA>
	//  201  306:new             #21  <Class HashSet>
	//  202  309:dup             
	//  203  310:bipush          77
	//  204  312:anewarray       String[]
	//  205  315:dup             
	//  206  316:iconst_0        
	//  207  317:ldc1            #121 <String "a">
	//  208  319:aastore         
	//  209  320:dup             
	//  210  321:iconst_1        
	//  211  322:ldc1            #123 <String "abbr">
	//  212  324:aastore         
	//  213  325:dup             
	//  214  326:iconst_2        
	//  215  327:ldc1            #51  <String "address">
	//  216  329:aastore         
	//  217  330:dup             
	//  218  331:iconst_3        
	//  219  332:ldc1            #53  <String "article">
	//  220  334:aastore         
	//  221  335:dup             
	//  222  336:iconst_4        
	//  223  337:ldc1            #55  <String "aside">
	//  224  339:aastore         
	//  225  340:dup             
	//  226  341:iconst_5        
	//  227  342:ldc1            #57  <String "audio">
	//  228  344:aastore         
	//  229  345:dup             
	//  230  346:bipush          6
	//  231  348:ldc1            #125 <String "b">
	//  232  350:aastore         
	//  233  351:dup             
	//  234  352:bipush          7
	//  235  354:ldc1            #127 <String "bdo">
	//  236  356:aastore         
	//  237  357:dup             
	//  238  358:bipush          8
	//  239  360:ldc1            #59  <String "blockquote">
	//  240  362:aastore         
	//  241  363:dup             
	//  242  364:bipush          9
	//  243  366:ldc1            #129 <String "br">
	//  244  368:aastore         
	//  245  369:dup             
	//  246  370:bipush          10
	//  247  372:ldc1            #131 <String "button">
	//  248  374:aastore         
	//  249  375:dup             
	//  250  376:bipush          11
	//  251  378:ldc1            #61  <String "canvas">
	//  252  380:aastore         
	//  253  381:dup             
	//  254  382:bipush          12
	//  255  384:ldc1            #133 <String "cite">
	//  256  386:aastore         
	//  257  387:dup             
	//  258  388:bipush          13
	//  259  390:ldc1            #135 <String "code">
	//  260  392:aastore         
	//  261  393:dup             
	//  262  394:bipush          14
	//  263  396:ldc1            #117 <String "command">
	//  264  398:aastore         
	//  265  399:dup             
	//  266  400:bipush          15
	//  267  402:ldc1            #137 <String "datalist">
	//  268  404:aastore         
	//  269  405:dup             
	//  270  406:bipush          16
	//  271  408:ldc1            #139 <String "del">
	//  272  410:aastore         
	//  273  411:dup             
	//  274  412:bipush          17
	//  275  414:ldc1            #141 <String "details">
	//  276  416:aastore         
	//  277  417:dup             
	//  278  418:bipush          18
	//  279  420:ldc1            #143 <String "dfn">
	//  280  422:aastore         
	//  281  423:dup             
	//  282  424:bipush          19
	//  283  426:ldc1            #65  <String "div">
	//  284  428:aastore         
	//  285  429:dup             
	//  286  430:bipush          20
	//  287  432:ldc1            #145 <String "dl">
	//  288  434:aastore         
	//  289  435:dup             
	//  290  436:bipush          21
	//  291  438:ldc1            #147 <String "em">
	//  292  440:aastore         
	//  293  441:dup             
	//  294  442:bipush          22
	//  295  444:ldc1            #149 <String "embed">
	//  296  446:aastore         
	//  297  447:dup             
	//  298  448:bipush          23
	//  299  450:ldc1            #67  <String "fieldset">
	//  300  452:aastore         
	//  301  453:dup             
	//  302  454:bipush          24
	//  303  456:ldc1            #71  <String "figure">
	//  304  458:aastore         
	//  305  459:dup             
	//  306  460:bipush          25
	//  307  462:ldc1            #73  <String "footer">
	//  308  464:aastore         
	//  309  465:dup             
	//  310  466:bipush          26
	//  311  468:ldc1            #75  <String "form">
	//  312  470:aastore         
	//  313  471:dup             
	//  314  472:bipush          27
	//  315  474:ldc1            #77  <String "h1">
	//  316  476:aastore         
	//  317  477:dup             
	//  318  478:bipush          28
	//  319  480:ldc1            #79  <String "h2">
	//  320  482:aastore         
	//  321  483:dup             
	//  322  484:bipush          29
	//  323  486:ldc1            #81  <String "h3">
	//  324  488:aastore         
	//  325  489:dup             
	//  326  490:bipush          30
	//  327  492:ldc1            #83  <String "h4">
	//  328  494:aastore         
	//  329  495:dup             
	//  330  496:bipush          31
	//  331  498:ldc1            #85  <String "h5">
	//  332  500:aastore         
	//  333  501:dup             
	//  334  502:bipush          32
	//  335  504:ldc1            #87  <String "h6">
	//  336  506:aastore         
	//  337  507:dup             
	//  338  508:bipush          33
	//  339  510:ldc1            #89  <String "header">
	//  340  512:aastore         
	//  341  513:dup             
	//  342  514:bipush          34
	//  343  516:ldc1            #91  <String "hgroup">
	//  344  518:aastore         
	//  345  519:dup             
	//  346  520:bipush          35
	//  347  522:ldc1            #93  <String "hr">
	//  348  524:aastore         
	//  349  525:dup             
	//  350  526:bipush          36
	//  351  528:ldc1            #151 <String "i">
	//  352  530:aastore         
	//  353  531:dup             
	//  354  532:bipush          37
	//  355  534:ldc1            #153 <String "iframe">
	//  356  536:aastore         
	//  357  537:dup             
	//  358  538:bipush          38
	//  359  540:ldc1            #155 <String "img">
	//  360  542:aastore         
	//  361  543:dup             
	//  362  544:bipush          39
	//  363  546:ldc1            #157 <String "input">
	//  364  548:aastore         
	//  365  549:dup             
	//  366  550:bipush          40
	//  367  552:ldc1            #159 <String "ins">
	//  368  554:aastore         
	//  369  555:dup             
	//  370  556:bipush          41
	//  371  558:ldc1            #161 <String "kbd">
	//  372  560:aastore         
	//  373  561:dup             
	//  374  562:bipush          42
	//  375  564:ldc1            #163 <String "keygen">
	//  376  566:aastore         
	//  377  567:dup             
	//  378  568:bipush          43
	//  379  570:ldc1            #165 <String "label">
	//  380  572:aastore         
	//  381  573:dup             
	//  382  574:bipush          44
	//  383  576:ldc1            #167 <String "map">
	//  384  578:aastore         
	//  385  579:dup             
	//  386  580:bipush          45
	//  387  582:ldc1            #169 <String "mark">
	//  388  584:aastore         
	//  389  585:dup             
	//  390  586:bipush          46
	//  391  588:ldc1            #171 <String "math">
	//  392  590:aastore         
	//  393  591:dup             
	//  394  592:bipush          47
	//  395  594:ldc1            #173 <String "menu">
	//  396  596:aastore         
	//  397  597:dup             
	//  398  598:bipush          48
	//  399  600:ldc1            #175 <String "meter">
	//  400  602:aastore         
	//  401  603:dup             
	//  402  604:bipush          49
	//  403  606:ldc1            #177 <String "nav">
	//  404  608:aastore         
	//  405  609:dup             
	//  406  610:bipush          50
	//  407  612:ldc1            #95  <String "noscript">
	//  408  614:aastore         
	//  409  615:dup             
	//  410  616:bipush          51
	//  411  618:ldc1            #179 <String "object">
	//  412  620:aastore         
	//  413  621:dup             
	//  414  622:bipush          52
	//  415  624:ldc1            #97  <String "ol">
	//  416  626:aastore         
	//  417  627:dup             
	//  418  628:bipush          53
	//  419  630:ldc1            #99  <String "output">
	//  420  632:aastore         
	//  421  633:dup             
	//  422  634:bipush          54
	//  423  636:ldc1            #101 <String "p">
	//  424  638:aastore         
	//  425  639:dup             
	//  426  640:bipush          55
	//  427  642:ldc1            #103 <String "pre">
	//  428  644:aastore         
	//  429  645:dup             
	//  430  646:bipush          56
	//  431  648:ldc1            #181 <String "progress">
	//  432  650:aastore         
	//  433  651:dup             
	//  434  652:bipush          57
	//  435  654:ldc1            #183 <String "q">
	//  436  656:aastore         
	//  437  657:dup             
	//  438  658:bipush          58
	//  439  660:ldc1            #185 <String "ruby">
	//  440  662:aastore         
	//  441  663:dup             
	//  442  664:bipush          59
	//  443  666:ldc1            #187 <String "samp">
	//  444  668:aastore         
	//  445  669:dup             
	//  446  670:bipush          60
	//  447  672:ldc1            #31  <String "script">
	//  448  674:aastore         
	//  449  675:dup             
	//  450  676:bipush          61
	//  451  678:ldc1            #105 <String "section">
	//  452  680:aastore         
	//  453  681:dup             
	//  454  682:bipush          62
	//  455  684:ldc1            #189 <String "select">
	//  456  686:aastore         
	//  457  687:dup             
	//  458  688:bipush          63
	//  459  690:ldc1            #191 <String "small">
	//  460  692:aastore         
	//  461  693:dup             
	//  462  694:bipush          64
	//  463  696:ldc1            #193 <String "span">
	//  464  698:aastore         
	//  465  699:dup             
	//  466  700:bipush          65
	//  467  702:ldc1            #195 <String "font">
	//  468  704:aastore         
	//  469  705:dup             
	//  470  706:bipush          66
	//  471  708:ldc1            #197 <String "strong">
	//  472  710:aastore         
	//  473  711:dup             
	//  474  712:bipush          67
	//  475  714:ldc1            #199 <String "sub">
	//  476  716:aastore         
	//  477  717:dup             
	//  478  718:bipush          68
	//  479  720:ldc1            #201 <String "sup">
	//  480  722:aastore         
	//  481  723:dup             
	//  482  724:bipush          69
	//  483  726:ldc1            #203 <String "svg">
	//  484  728:aastore         
	//  485  729:dup             
	//  486  730:bipush          70
	//  487  732:ldc1            #107 <String "table">
	//  488  734:aastore         
	//  489  735:dup             
	//  490  736:bipush          71
	//  491  738:ldc1            #205 <String "textarea">
	//  492  740:aastore         
	//  493  741:dup             
	//  494  742:bipush          72
	//  495  744:ldc1            #207 <String "time">
	//  496  746:aastore         
	//  497  747:dup             
	//  498  748:bipush          73
	//  499  750:ldc1            #109 <String "ul">
	//  500  752:aastore         
	//  501  753:dup             
	//  502  754:bipush          74
	//  503  756:ldc1            #209 <String "var">
	//  504  758:aastore         
	//  505  759:dup             
	//  506  760:bipush          75
	//  507  762:ldc1            #111 <String "video">
	//  508  764:aastore         
	//  509  765:dup             
	//  510  766:bipush          76
	//  511  768:ldc1            #211 <String "wbr">
	//  512  770:aastore         
	//  513  771:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  514  774:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  515  777:putstatic       #213 <Field Set FLOW_CONTENT>
	//  516  780:new             #21  <Class HashSet>
	//  517  783:dup             
	//  518  784:iconst_4        
	//  519  785:anewarray       String[]
	//  520  788:dup             
	//  521  789:iconst_0        
	//  522  790:ldc1            #53  <String "article">
	//  523  792:aastore         
	//  524  793:dup             
	//  525  794:iconst_1        
	//  526  795:ldc1            #55  <String "aside">
	//  527  797:aastore         
	//  528  798:dup             
	//  529  799:iconst_2        
	//  530  800:ldc1            #177 <String "nav">
	//  531  802:aastore         
	//  532  803:dup             
	//  533  804:iconst_3        
	//  534  805:ldc1            #105 <String "section">
	//  535  807:aastore         
	//  536  808:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  537  811:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  538  814:putstatic       #215 <Field Set SECTIONING_CONTENT>
	//  539  817:new             #21  <Class HashSet>
	//  540  820:dup             
	//  541  821:bipush          7
	//  542  823:anewarray       String[]
	//  543  826:dup             
	//  544  827:iconst_0        
	//  545  828:ldc1            #77  <String "h1">
	//  546  830:aastore         
	//  547  831:dup             
	//  548  832:iconst_1        
	//  549  833:ldc1            #79  <String "h2">
	//  550  835:aastore         
	//  551  836:dup             
	//  552  837:iconst_2        
	//  553  838:ldc1            #81  <String "h3">
	//  554  840:aastore         
	//  555  841:dup             
	//  556  842:iconst_3        
	//  557  843:ldc1            #83  <String "h4">
	//  558  845:aastore         
	//  559  846:dup             
	//  560  847:iconst_4        
	//  561  848:ldc1            #85  <String "h5">
	//  562  850:aastore         
	//  563  851:dup             
	//  564  852:iconst_5        
	//  565  853:ldc1            #87  <String "h6">
	//  566  855:aastore         
	//  567  856:dup             
	//  568  857:bipush          6
	//  569  859:ldc1            #91  <String "hgroup">
	//  570  861:aastore         
	//  571  862:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  572  865:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  573  868:putstatic       #217 <Field Set HEADING_CONTENT>
	//  574  871:new             #21  <Class HashSet>
	//  575  874:dup             
	//  576  875:bipush          45
	//  577  877:anewarray       String[]
	//  578  880:dup             
	//  579  881:iconst_0        
	//  580  882:ldc1            #123 <String "abbr">
	//  581  884:aastore         
	//  582  885:dup             
	//  583  886:iconst_1        
	//  584  887:ldc1            #57  <String "audio">
	//  585  889:aastore         
	//  586  890:dup             
	//  587  891:iconst_2        
	//  588  892:ldc1            #125 <String "b">
	//  589  894:aastore         
	//  590  895:dup             
	//  591  896:iconst_3        
	//  592  897:ldc1            #127 <String "bdo">
	//  593  899:aastore         
	//  594  900:dup             
	//  595  901:iconst_4        
	//  596  902:ldc1            #129 <String "br">
	//  597  904:aastore         
	//  598  905:dup             
	//  599  906:iconst_5        
	//  600  907:ldc1            #131 <String "button">
	//  601  909:aastore         
	//  602  910:dup             
	//  603  911:bipush          6
	//  604  913:ldc1            #61  <String "canvas">
	//  605  915:aastore         
	//  606  916:dup             
	//  607  917:bipush          7
	//  608  919:ldc1            #133 <String "cite">
	//  609  921:aastore         
	//  610  922:dup             
	//  611  923:bipush          8
	//  612  925:ldc1            #135 <String "code">
	//  613  927:aastore         
	//  614  928:dup             
	//  615  929:bipush          9
	//  616  931:ldc1            #117 <String "command">
	//  617  933:aastore         
	//  618  934:dup             
	//  619  935:bipush          10
	//  620  937:ldc1            #137 <String "datalist">
	//  621  939:aastore         
	//  622  940:dup             
	//  623  941:bipush          11
	//  624  943:ldc1            #143 <String "dfn">
	//  625  945:aastore         
	//  626  946:dup             
	//  627  947:bipush          12
	//  628  949:ldc1            #147 <String "em">
	//  629  951:aastore         
	//  630  952:dup             
	//  631  953:bipush          13
	//  632  955:ldc1            #149 <String "embed">
	//  633  957:aastore         
	//  634  958:dup             
	//  635  959:bipush          14
	//  636  961:ldc1            #151 <String "i">
	//  637  963:aastore         
	//  638  964:dup             
	//  639  965:bipush          15
	//  640  967:ldc1            #153 <String "iframe">
	//  641  969:aastore         
	//  642  970:dup             
	//  643  971:bipush          16
	//  644  973:ldc1            #155 <String "img">
	//  645  975:aastore         
	//  646  976:dup             
	//  647  977:bipush          17
	//  648  979:ldc1            #157 <String "input">
	//  649  981:aastore         
	//  650  982:dup             
	//  651  983:bipush          18
	//  652  985:ldc1            #161 <String "kbd">
	//  653  987:aastore         
	//  654  988:dup             
	//  655  989:bipush          19
	//  656  991:ldc1            #163 <String "keygen">
	//  657  993:aastore         
	//  658  994:dup             
	//  659  995:bipush          20
	//  660  997:ldc1            #165 <String "label">
	//  661  999:aastore         
	//  662 1000:dup             
	//  663 1001:bipush          21
	//  664 1003:ldc1            #169 <String "mark">
	//  665 1005:aastore         
	//  666 1006:dup             
	//  667 1007:bipush          22
	//  668 1009:ldc1            #171 <String "math">
	//  669 1011:aastore         
	//  670 1012:dup             
	//  671 1013:bipush          23
	//  672 1015:ldc1            #175 <String "meter">
	//  673 1017:aastore         
	//  674 1018:dup             
	//  675 1019:bipush          24
	//  676 1021:ldc1            #95  <String "noscript">
	//  677 1023:aastore         
	//  678 1024:dup             
	//  679 1025:bipush          25
	//  680 1027:ldc1            #179 <String "object">
	//  681 1029:aastore         
	//  682 1030:dup             
	//  683 1031:bipush          26
	//  684 1033:ldc1            #99  <String "output">
	//  685 1035:aastore         
	//  686 1036:dup             
	//  687 1037:bipush          27
	//  688 1039:ldc1            #181 <String "progress">
	//  689 1041:aastore         
	//  690 1042:dup             
	//  691 1043:bipush          28
	//  692 1045:ldc1            #183 <String "q">
	//  693 1047:aastore         
	//  694 1048:dup             
	//  695 1049:bipush          29
	//  696 1051:ldc1            #185 <String "ruby">
	//  697 1053:aastore         
	//  698 1054:dup             
	//  699 1055:bipush          30
	//  700 1057:ldc1            #187 <String "samp">
	//  701 1059:aastore         
	//  702 1060:dup             
	//  703 1061:bipush          31
	//  704 1063:ldc1            #31  <String "script">
	//  705 1065:aastore         
	//  706 1066:dup             
	//  707 1067:bipush          32
	//  708 1069:ldc1            #189 <String "select">
	//  709 1071:aastore         
	//  710 1072:dup             
	//  711 1073:bipush          33
	//  712 1075:ldc1            #191 <String "small">
	//  713 1077:aastore         
	//  714 1078:dup             
	//  715 1079:bipush          34
	//  716 1081:ldc1            #193 <String "span">
	//  717 1083:aastore         
	//  718 1084:dup             
	//  719 1085:bipush          35
	//  720 1087:ldc1            #195 <String "font">
	//  721 1089:aastore         
	//  722 1090:dup             
	//  723 1091:bipush          36
	//  724 1093:ldc1            #197 <String "strong">
	//  725 1095:aastore         
	//  726 1096:dup             
	//  727 1097:bipush          37
	//  728 1099:ldc1            #199 <String "sub">
	//  729 1101:aastore         
	//  730 1102:dup             
	//  731 1103:bipush          38
	//  732 1105:ldc1            #201 <String "sup">
	//  733 1107:aastore         
	//  734 1108:dup             
	//  735 1109:bipush          39
	//  736 1111:ldc1            #203 <String "svg">
	//  737 1113:aastore         
	//  738 1114:dup             
	//  739 1115:bipush          40
	//  740 1117:ldc1            #205 <String "textarea">
	//  741 1119:aastore         
	//  742 1120:dup             
	//  743 1121:bipush          41
	//  744 1123:ldc1            #207 <String "time">
	//  745 1125:aastore         
	//  746 1126:dup             
	//  747 1127:bipush          42
	//  748 1129:ldc1            #209 <String "var">
	//  749 1131:aastore         
	//  750 1132:dup             
	//  751 1133:bipush          43
	//  752 1135:ldc1            #111 <String "video">
	//  753 1137:aastore         
	//  754 1138:dup             
	//  755 1139:bipush          44
	//  756 1141:ldc1            #211 <String "wbr">
	//  757 1143:aastore         
	//  758 1144:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  759 1147:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  760 1150:putstatic       #219 <Field Set PHRASING_CONTENT>
	//  761 1153:new             #21  <Class HashSet>
	//  762 1156:dup             
	//  763 1157:bipush          9
	//  764 1159:anewarray       String[]
	//  765 1162:dup             
	//  766 1163:iconst_0        
	//  767 1164:ldc1            #57  <String "audio">
	//  768 1166:aastore         
	//  769 1167:dup             
	//  770 1168:iconst_1        
	//  771 1169:ldc1            #61  <String "canvas">
	//  772 1171:aastore         
	//  773 1172:dup             
	//  774 1173:iconst_2        
	//  775 1174:ldc1            #149 <String "embed">
	//  776 1176:aastore         
	//  777 1177:dup             
	//  778 1178:iconst_3        
	//  779 1179:ldc1            #153 <String "iframe">
	//  780 1181:aastore         
	//  781 1182:dup             
	//  782 1183:iconst_4        
	//  783 1184:ldc1            #155 <String "img">
	//  784 1186:aastore         
	//  785 1187:dup             
	//  786 1188:iconst_5        
	//  787 1189:ldc1            #171 <String "math">
	//  788 1191:aastore         
	//  789 1192:dup             
	//  790 1193:bipush          6
	//  791 1195:ldc1            #179 <String "object">
	//  792 1197:aastore         
	//  793 1198:dup             
	//  794 1199:bipush          7
	//  795 1201:ldc1            #203 <String "svg">
	//  796 1203:aastore         
	//  797 1204:dup             
	//  798 1205:bipush          8
	//  799 1207:ldc1            #111 <String "video">
	//  800 1209:aastore         
	//  801 1210:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//  802 1213:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//  803 1216:putstatic       #221 <Field Set EMBEDDED_CONTENT>
	//* 804 1219:return          
	}

	private HTML$Category()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #224 <Method void Object()>
	//    2    4:return          
	}
}
