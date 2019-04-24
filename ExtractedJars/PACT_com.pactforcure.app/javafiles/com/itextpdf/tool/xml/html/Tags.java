// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;


// Referenced classes of package com.itextpdf.tool.xml.html:
//			DefaultTagProcessorFactory, TagProcessorFactory

public class Tags
{

	public Tags()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static final TagProcessorFactory getHtmlTagProcessorFactory()
	{
		DefaultTagProcessorFactory defaulttagprocessorfactory = new DefaultTagProcessorFactory();
	//    0    0:new             #56  <Class DefaultTagProcessorFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void DefaultTagProcessorFactory()>
	//    3    7:astore_0        
		defaulttagprocessorfactory.addProcessor("xml", dummyTagProcessor);
	//    4    8:aload_0         
	//    5    9:ldc1            #59  <String "xml">
	//    6   11:getstatic       #34  <Field String dummyTagProcessor>
	//    7   14:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("!doctype", dummyTagProcessor);
	//    8   17:aload_0         
	//    9   18:ldc1            #65  <String "!doctype">
	//   10   20:getstatic       #34  <Field String dummyTagProcessor>
	//   11   23:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("html", dummyTagProcessor);
	//   12   26:aload_0         
	//   13   27:ldc1            #67  <String "html">
	//   14   29:getstatic       #34  <Field String dummyTagProcessor>
	//   15   32:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("head", dummyTagProcessor);
	//   16   35:aload_0         
	//   17   36:ldc1            #69  <String "head">
	//   18   38:getstatic       #34  <Field String dummyTagProcessor>
	//   19   41:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("meta", dummyTagProcessor);
	//   20   44:aload_0         
	//   21   45:ldc1            #71  <String "meta">
	//   22   47:getstatic       #34  <Field String dummyTagProcessor>
	//   23   50:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("object", dummyTagProcessor);
	//   24   53:aload_0         
	//   25   54:ldc1            #73  <String "object">
	//   26   56:getstatic       #34  <Field String dummyTagProcessor>
	//   27   59:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("title", (new StringBuilder()).append(defaultpackage).append("head.Title").toString());
	//   28   62:aload_0         
	//   29   63:ldc1            #75  <String "title">
	//   30   65:new             #19  <Class StringBuilder>
	//   31   68:dup             
	//   32   69:invokespecial   #22  <Method void StringBuilder()>
	//   33   72:getstatic       #17  <Field String defaultpackage>
	//   34   75:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   35   78:ldc1            #77  <String "head.Title">
	//   36   80:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   38   86:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("link", (new StringBuilder()).append(defaultpackage).append("head.Link").toString());
	//   39   89:aload_0         
	//   40   90:ldc1            #79  <String "link">
	//   41   92:new             #19  <Class StringBuilder>
	//   42   95:dup             
	//   43   96:invokespecial   #22  <Method void StringBuilder()>
	//   44   99:getstatic       #17  <Field String defaultpackage>
	//   45  102:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   46  105:ldc1            #81  <String "head.Link">
	//   47  107:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   48  110:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   49  113:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("style", (new StringBuilder()).append(defaultpackage).append("head.Style").toString());
	//   50  116:aload_0         
	//   51  117:ldc1            #83  <String "style">
	//   52  119:new             #19  <Class StringBuilder>
	//   53  122:dup             
	//   54  123:invokespecial   #22  <Method void StringBuilder()>
	//   55  126:getstatic       #17  <Field String defaultpackage>
	//   56  129:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   57  132:ldc1            #85  <String "head.Style">
	//   58  134:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   59  137:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   60  140:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("body", (new StringBuilder()).append(defaultpackage).append("Body").toString());
	//   61  143:aload_0         
	//   62  144:ldc1            #87  <String "body">
	//   63  146:new             #19  <Class StringBuilder>
	//   64  149:dup             
	//   65  150:invokespecial   #22  <Method void StringBuilder()>
	//   66  153:getstatic       #17  <Field String defaultpackage>
	//   67  156:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   68  159:ldc1            #89  <String "Body">
	//   69  161:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   70  164:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   71  167:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("div", (new StringBuilder()).append(defaultpackage).append("Div").toString());
	//   72  170:aload_0         
	//   73  171:ldc1            #91  <String "div">
	//   74  173:new             #19  <Class StringBuilder>
	//   75  176:dup             
	//   76  177:invokespecial   #22  <Method void StringBuilder()>
	//   77  180:getstatic       #17  <Field String defaultpackage>
	//   78  183:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   79  186:ldc1            #93  <String "Div">
	//   80  188:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   81  191:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   82  194:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("a", (new StringBuilder()).append(defaultpackage).append("Anchor").toString());
	//   83  197:aload_0         
	//   84  198:ldc1            #95  <String "a">
	//   85  200:new             #19  <Class StringBuilder>
	//   86  203:dup             
	//   87  204:invokespecial   #22  <Method void StringBuilder()>
	//   88  207:getstatic       #17  <Field String defaultpackage>
	//   89  210:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   90  213:ldc1            #97  <String "Anchor">
	//   91  215:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   92  218:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   93  221:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("table", (new StringBuilder()).append(defaultpackage).append("table.Table").toString());
	//   94  224:aload_0         
	//   95  225:ldc1            #99  <String "table">
	//   96  227:new             #19  <Class StringBuilder>
	//   97  230:dup             
	//   98  231:invokespecial   #22  <Method void StringBuilder()>
	//   99  234:getstatic       #17  <Field String defaultpackage>
	//  100  237:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  101  240:ldc1            #101 <String "table.Table">
	//  102  242:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  103  245:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  104  248:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("tr", (new StringBuilder()).append(defaultpackage).append("table.TableRow").toString());
	//  105  251:aload_0         
	//  106  252:ldc1            #103 <String "tr">
	//  107  254:new             #19  <Class StringBuilder>
	//  108  257:dup             
	//  109  258:invokespecial   #22  <Method void StringBuilder()>
	//  110  261:getstatic       #17  <Field String defaultpackage>
	//  111  264:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  112  267:ldc1            #105 <String "table.TableRow">
	//  113  269:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  114  272:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  115  275:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("td", (new StringBuilder()).append(defaultpackage).append("table.TableData").toString());
	//  116  278:aload_0         
	//  117  279:ldc1            #107 <String "td">
	//  118  281:new             #19  <Class StringBuilder>
	//  119  284:dup             
	//  120  285:invokespecial   #22  <Method void StringBuilder()>
	//  121  288:getstatic       #17  <Field String defaultpackage>
	//  122  291:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  123  294:ldc1            #109 <String "table.TableData">
	//  124  296:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  125  299:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  126  302:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("th", (new StringBuilder()).append(defaultpackage).append("table.TableData").toString());
	//  127  305:aload_0         
	//  128  306:ldc1            #111 <String "th">
	//  129  308:new             #19  <Class StringBuilder>
	//  130  311:dup             
	//  131  312:invokespecial   #22  <Method void StringBuilder()>
	//  132  315:getstatic       #17  <Field String defaultpackage>
	//  133  318:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  134  321:ldc1            #109 <String "table.TableData">
	//  135  323:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  136  326:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  137  329:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("caption", paragraph);
	//  138  332:aload_0         
	//  139  333:ldc1            #113 <String "caption">
	//  140  335:getstatic       #50  <Field String paragraph>
	//  141  338:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("p", paragraph);
	//  142  341:aload_0         
	//  143  342:ldc1            #115 <String "p">
	//  144  344:getstatic       #50  <Field String paragraph>
	//  145  347:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("dt", paragraph);
	//  146  350:aload_0         
	//  147  351:ldc1            #117 <String "dt">
	//  148  353:getstatic       #50  <Field String paragraph>
	//  149  356:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("dd", paragraph);
	//  150  359:aload_0         
	//  151  360:ldc1            #119 <String "dd">
	//  152  362:getstatic       #50  <Field String paragraph>
	//  153  365:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("blockquote", paragraph);
	//  154  368:aload_0         
	//  155  369:ldc1            #121 <String "blockquote">
	//  156  371:getstatic       #50  <Field String paragraph>
	//  157  374:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("br", (new StringBuilder()).append(defaultpackage).append("Break").toString());
	//  158  377:aload_0         
	//  159  378:ldc1            #123 <String "br">
	//  160  380:new             #19  <Class StringBuilder>
	//  161  383:dup             
	//  162  384:invokespecial   #22  <Method void StringBuilder()>
	//  163  387:getstatic       #17  <Field String defaultpackage>
	//  164  390:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  165  393:ldc1            #125 <String "Break">
	//  166  395:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  167  398:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  168  401:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("span", span);
	//  169  404:aload_0         
	//  170  405:ldc1            #126 <String "span">
	//  171  407:getstatic       #42  <Field String span>
	//  172  410:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("small", span);
	//  173  413:aload_0         
	//  174  414:ldc1            #128 <String "small">
	//  175  416:getstatic       #42  <Field String span>
	//  176  419:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("big", span);
	//  177  422:aload_0         
	//  178  423:ldc1            #130 <String "big">
	//  179  425:getstatic       #42  <Field String span>
	//  180  428:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("s", span);
	//  181  431:aload_0         
	//  182  432:ldc1            #132 <String "s">
	//  183  434:getstatic       #42  <Field String span>
	//  184  437:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("strike", span);
	//  185  440:aload_0         
	//  186  441:ldc1            #134 <String "strike">
	//  187  443:getstatic       #42  <Field String span>
	//  188  446:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("del", span);
	//  189  449:aload_0         
	//  190  450:ldc1            #136 <String "del">
	//  191  452:getstatic       #42  <Field String span>
	//  192  455:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("sub", span);
	//  193  458:aload_0         
	//  194  459:ldc1            #138 <String "sub">
	//  195  461:getstatic       #42  <Field String span>
	//  196  464:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("sup", span);
	//  197  467:aload_0         
	//  198  468:ldc1            #140 <String "sup">
	//  199  470:getstatic       #42  <Field String span>
	//  200  473:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("b", span);
	//  201  476:aload_0         
	//  202  477:ldc1            #142 <String "b">
	//  203  479:getstatic       #42  <Field String span>
	//  204  482:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("strong", span);
	//  205  485:aload_0         
	//  206  486:ldc1            #144 <String "strong">
	//  207  488:getstatic       #42  <Field String span>
	//  208  491:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("font", span);
	//  209  494:aload_0         
	//  210  495:ldc1            #146 <String "font">
	//  211  497:getstatic       #42  <Field String span>
	//  212  500:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("i", span);
	//  213  503:aload_0         
	//  214  504:ldc1            #148 <String "i">
	//  215  506:getstatic       #42  <Field String span>
	//  216  509:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("cite", span);
	//  217  512:aload_0         
	//  218  513:ldc1            #150 <String "cite">
	//  219  515:getstatic       #42  <Field String span>
	//  220  518:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("em", span);
	//  221  521:aload_0         
	//  222  522:ldc1            #152 <String "em">
	//  223  524:getstatic       #42  <Field String span>
	//  224  527:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("address", span);
	//  225  530:aload_0         
	//  226  531:ldc1            #154 <String "address">
	//  227  533:getstatic       #42  <Field String span>
	//  228  536:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("dfn", span);
	//  229  539:aload_0         
	//  230  540:ldc1            #156 <String "dfn">
	//  231  542:getstatic       #42  <Field String span>
	//  232  545:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("var", span);
	//  233  548:aload_0         
	//  234  549:ldc1            #158 <String "var">
	//  235  551:getstatic       #42  <Field String span>
	//  236  554:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("pre", nonSanitized);
	//  237  557:aload_0         
	//  238  558:ldc1            #160 <String "pre">
	//  239  560:getstatic       #46  <Field String nonSanitized>
	//  240  563:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("tt", nonSanitized);
	//  241  566:aload_0         
	//  242  567:ldc1            #162 <String "tt">
	//  243  569:getstatic       #46  <Field String nonSanitized>
	//  244  572:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("code", nonSanitized);
	//  245  575:aload_0         
	//  246  576:ldc1            #164 <String "code">
	//  247  578:getstatic       #46  <Field String nonSanitized>
	//  248  581:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("kbd", nonSanitized);
	//  249  584:aload_0         
	//  250  585:ldc1            #166 <String "kbd">
	//  251  587:getstatic       #46  <Field String nonSanitized>
	//  252  590:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("samp", nonSanitized);
	//  253  593:aload_0         
	//  254  594:ldc1            #168 <String "samp">
	//  255  596:getstatic       #46  <Field String nonSanitized>
	//  256  599:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("u", span);
	//  257  602:aload_0         
	//  258  603:ldc1            #170 <String "u">
	//  259  605:getstatic       #42  <Field String span>
	//  260  608:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("ins", span);
	//  261  611:aload_0         
	//  262  612:ldc1            #172 <String "ins">
	//  263  614:getstatic       #42  <Field String span>
	//  264  617:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("img", (new StringBuilder()).append(defaultpackage).append("Image").toString());
	//  265  620:aload_0         
	//  266  621:ldc1            #174 <String "img">
	//  267  623:new             #19  <Class StringBuilder>
	//  268  626:dup             
	//  269  627:invokespecial   #22  <Method void StringBuilder()>
	//  270  630:getstatic       #17  <Field String defaultpackage>
	//  271  633:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  272  636:ldc1            #176 <String "Image">
	//  273  638:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  274  641:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  275  644:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("ul", (new StringBuilder()).append(defaultpackage).append("OrderedUnorderedList").toString());
	//  276  647:aload_0         
	//  277  648:ldc1            #178 <String "ul">
	//  278  650:new             #19  <Class StringBuilder>
	//  279  653:dup             
	//  280  654:invokespecial   #22  <Method void StringBuilder()>
	//  281  657:getstatic       #17  <Field String defaultpackage>
	//  282  660:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  283  663:ldc1            #180 <String "OrderedUnorderedList">
	//  284  665:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  285  668:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  286  671:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("ol", (new StringBuilder()).append(defaultpackage).append("OrderedUnorderedList").toString());
	//  287  674:aload_0         
	//  288  675:ldc1            #182 <String "ol">
	//  289  677:new             #19  <Class StringBuilder>
	//  290  680:dup             
	//  291  681:invokespecial   #22  <Method void StringBuilder()>
	//  292  684:getstatic       #17  <Field String defaultpackage>
	//  293  687:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  294  690:ldc1            #180 <String "OrderedUnorderedList">
	//  295  692:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  296  695:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  297  698:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("li", (new StringBuilder()).append(defaultpackage).append("OrderedUnorderedListItem").toString());
	//  298  701:aload_0         
	//  299  702:ldc1            #184 <String "li">
	//  300  704:new             #19  <Class StringBuilder>
	//  301  707:dup             
	//  302  708:invokespecial   #22  <Method void StringBuilder()>
	//  303  711:getstatic       #17  <Field String defaultpackage>
	//  304  714:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  305  717:ldc1            #186 <String "OrderedUnorderedListItem">
	//  306  719:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  307  722:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  308  725:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h1", headers);
	//  309  728:aload_0         
	//  310  729:ldc1            #188 <String "h1">
	//  311  731:getstatic       #38  <Field String headers>
	//  312  734:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h2", headers);
	//  313  737:aload_0         
	//  314  738:ldc1            #190 <String "h2">
	//  315  740:getstatic       #38  <Field String headers>
	//  316  743:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h3", headers);
	//  317  746:aload_0         
	//  318  747:ldc1            #192 <String "h3">
	//  319  749:getstatic       #38  <Field String headers>
	//  320  752:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h4", headers);
	//  321  755:aload_0         
	//  322  756:ldc1            #194 <String "h4">
	//  323  758:getstatic       #38  <Field String headers>
	//  324  761:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h5", headers);
	//  325  764:aload_0         
	//  326  765:ldc1            #196 <String "h5">
	//  327  767:getstatic       #38  <Field String headers>
	//  328  770:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("h6", headers);
	//  329  773:aload_0         
	//  330  774:ldc1            #198 <String "h6">
	//  331  776:getstatic       #38  <Field String headers>
	//  332  779:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("hr", (new StringBuilder()).append(defaultpackage).append("HorizontalRule").toString());
	//  333  782:aload_0         
	//  334  783:ldc1            #200 <String "hr">
	//  335  785:new             #19  <Class StringBuilder>
	//  336  788:dup             
	//  337  789:invokespecial   #22  <Method void StringBuilder()>
	//  338  792:getstatic       #17  <Field String defaultpackage>
	//  339  795:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  340  798:ldc1            #202 <String "HorizontalRule">
	//  341  800:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//  342  803:invokevirtual   #32  <Method String StringBuilder.toString()>
	//  343  806:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		defaulttagprocessorfactory.addProcessor("label", span);
	//  344  809:aload_0         
	//  345  810:ldc1            #204 <String "label">
	//  346  812:getstatic       #42  <Field String span>
	//  347  815:invokevirtual   #63  <Method void DefaultTagProcessorFactory.addProcessor(String, String)>
		return ((TagProcessorFactory) (defaulttagprocessorfactory));
	//  348  818:aload_0         
	//  349  819:areturn         
	}

	private static String defaultpackage;
	private static String dummyTagProcessor;
	private static String headers;
	private static String nonSanitized;
	private static String paragraph;
	private static String span;

	static 
	{
		defaultpackage = "com.itextpdf.tool.xml.html.";
	//    0    0:ldc1            #15  <String "com.itextpdf.tool.xml.html.">
	//    1    2:putstatic       #17  <Field String defaultpackage>
		dummyTagProcessor = (new StringBuilder()).append(defaultpackage).append("DummyTagProcessor").toString();
	//    2    5:new             #19  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #22  <Method void StringBuilder()>
	//    5   12:getstatic       #17  <Field String defaultpackage>
	//    6   15:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    7   18:ldc1            #28  <String "DummyTagProcessor">
	//    8   20:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   10   26:putstatic       #34  <Field String dummyTagProcessor>
		headers = (new StringBuilder()).append(defaultpackage).append("Header").toString();
	//   11   29:new             #19  <Class StringBuilder>
	//   12   32:dup             
	//   13   33:invokespecial   #22  <Method void StringBuilder()>
	//   14   36:getstatic       #17  <Field String defaultpackage>
	//   15   39:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   16   42:ldc1            #36  <String "Header">
	//   17   44:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   18   47:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   19   50:putstatic       #38  <Field String headers>
		span = (new StringBuilder()).append(defaultpackage).append("Span").toString();
	//   20   53:new             #19  <Class StringBuilder>
	//   21   56:dup             
	//   22   57:invokespecial   #22  <Method void StringBuilder()>
	//   23   60:getstatic       #17  <Field String defaultpackage>
	//   24   63:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   25   66:ldc1            #40  <String "Span">
	//   26   68:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   27   71:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   28   74:putstatic       #42  <Field String span>
		nonSanitized = (new StringBuilder()).append(defaultpackage).append("NonSanitizedTag").toString();
	//   29   77:new             #19  <Class StringBuilder>
	//   30   80:dup             
	//   31   81:invokespecial   #22  <Method void StringBuilder()>
	//   32   84:getstatic       #17  <Field String defaultpackage>
	//   33   87:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   34   90:ldc1            #44  <String "NonSanitizedTag">
	//   35   92:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   36   95:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   37   98:putstatic       #46  <Field String nonSanitized>
		paragraph = (new StringBuilder()).append(defaultpackage).append("ParaGraph").toString();
	//   38  101:new             #19  <Class StringBuilder>
	//   39  104:dup             
	//   40  105:invokespecial   #22  <Method void StringBuilder()>
	//   41  108:getstatic       #17  <Field String defaultpackage>
	//   42  111:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   43  114:ldc1            #48  <String "ParaGraph">
	//   44  116:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   45  119:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   46  122:putstatic       #50  <Field String paragraph>
	//*  47  125:return          
	}
}
