// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.text.*;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.log.*;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.css.FontSizeTranslator;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.html.CssApplier;
import com.itextpdf.tool.xml.net.ImageRetrieve;
import com.itextpdf.tool.xml.net.exc.NoImageException;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.apply:
//			MarginMemory, PageSizeContainable

public class ListStyleTypeCssApplier
	implements CssApplier
{

	public ListStyleTypeCssApplier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method CssUtils CssUtils.getInstance()>
	//    4    8:putfield        #33  <Field CssUtils utils>
	//    5   11:return          
	}

	private void shrinkSymbol(List list, float f, BaseColor basecolor)
	{
		list.setSymbolIndent(12F);
	//    0    0:aload_1         
	//    1    1:ldc1            #36  <Float 12F>
	//    2    3:invokevirtual   #42  <Method void List.setSymbolIndent(float)>
		list = ((List) (list.getSymbol().getFont()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #46  <Method Chunk List.getSymbol()>
	//    5   10:invokevirtual   #52  <Method Font Chunk.getFont()>
	//    6   13:astore_1        
		((Font) (list)).setSize(f);
	//    7   14:aload_1         
	//    8   15:fload_2         
	//    9   16:invokevirtual   #57  <Method void Font.setSize(float)>
		((Font) (list)).setColor(basecolor);
	//   10   19:aload_1         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #61  <Method void Font.setColor(BaseColor)>
	//   13   24:return          
	}

	private void synchronizeSymbol(float f, List list, BaseColor basecolor)
	{
		Font font = list.getSymbol().getFont();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #46  <Method Chunk List.getSymbol()>
	//    2    4:invokevirtual   #52  <Method Font Chunk.getFont()>
	//    3    7:astore          4
		font.setSize(f);
	//    4    9:aload           4
	//    5   11:fload_1         
	//    6   12:invokevirtual   #57  <Method void Font.setSize(float)>
		font.setColor(basecolor);
	//    7   15:aload           4
	//    8   17:aload_3         
	//    9   18:invokevirtual   #61  <Method void Font.setColor(BaseColor)>
		list.setSymbolIndent(f);
	//   10   21:aload_2         
	//   11   22:fload_1         
	//   12   23:invokevirtual   #42  <Method void List.setSymbolIndent(float)>
	//   13   26:return          
	}

	public volatile Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		return ((Element) (apply((List)element, tag, marginmemory, pagesizecontainable, htmlpipelinecontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #68  <Method List apply(List, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    8   14:areturn         
	}

	public Element apply(List list, Tag tag)
	{
		return ((Element) (apply(list, tag, ((MarginMemory) (null)), ((PageSizeContainable) (null)), ((HtmlPipelineContext) (null)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #68  <Method List apply(List, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	public List apply(List list, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext)
	{
		float f2;
		f2 = FontSizeTranslator.getInstance().getFontSize(tag);
	//    0    0:invokestatic    #78  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #82  <Method float FontSizeTranslator.getFontSize(Tag)>
	//    3    7:fstore          8
		Map map = tag.getCSS();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #88  <Method Map Tag.getCSS()>
	//    6   13:astore          9
		String s = (String)map.get("list-style-type");
	//    7   15:aload           9
	//    8   17:ldc1            #90  <String "list-style-type">
	//    9   19:invokeinterface #96  <Method Object Map.get(Object)>
	//   10   24:checkcast       #98  <Class String>
	//   11   27:astore          10
		pagesizecontainable = ((PageSizeContainable) (HtmlUtilities.decodeColor((String)map.get("color"))));
	//   12   29:aload           9
	//   13   31:ldc1            #100 <String "color">
	//   14   33:invokeinterface #96  <Method Object Map.get(Object)>
	//   15   38:checkcast       #98  <Class String>
	//   16   41:invokestatic    #106 <Method BaseColor HtmlUtilities.decodeColor(String)>
	//   17   44:astore          4
		marginmemory = ((MarginMemory) (pagesizecontainable));
	//   18   46:aload           4
	//   19   48:astore_3        
		if(pagesizecontainable == null)
	//*  20   49:aload           4
	//*  21   51:ifnonnull       58
			marginmemory = ((MarginMemory) (BaseColor.BLACK));
	//   22   54:getstatic       #112 <Field BaseColor BaseColor.BLACK>
	//   23   57:astore_3        
		if(s != null)
	//*  24   58:aload           10
	//*  25   60:ifnull          838
		{
			if(s.equalsIgnoreCase("none"))
	//*  26   63:aload           10
	//*  27   65:ldc1            #114 <String "none">
	//*  28   67:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   70:ifeq            407
			{
				list.setLettered(false);
	//   30   73:aload_1         
	//   31   74:iconst_0        
	//   32   75:invokevirtual   #122 <Method void List.setLettered(boolean)>
				list.setNumbered(false);
	//   33   78:aload_1         
	//   34   79:iconst_0        
	//   35   80:invokevirtual   #125 <Method void List.setNumbered(boolean)>
				list.setListSymbol("");
	//   36   83:aload_1         
	//   37   84:ldc1            #127 <String "">
	//   38   86:invokevirtual   #131 <Method void List.setListSymbol(String)>
			} else
	//*  39   89:aload_1         
	//*  40   90:astore_3        
	//*  41   91:aload           9
	//*  42   93:ldc1            #133 <String "list-style-image">
	//*  43   95:invokeinterface #96  <Method Object Map.get(Object)>
	//*  44  100:ifnull          253
	//*  45  103:aload_1         
	//*  46  104:astore_3        
	//*  47  105:aload           9
	//*  48  107:ldc1            #133 <String "list-style-image">
	//*  49  109:invokeinterface #96  <Method Object Map.get(Object)>
	//*  50  114:checkcast       #98  <Class String>
	//*  51  117:ldc1            #114 <String "none">
	//*  52  119:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//*  53  122:ifne            253
	//*  54  125:new             #38  <Class List>
	//*  55  128:dup             
	//*  56  129:invokespecial   #134 <Method void List()>
	//*  57  132:astore_3        
	//*  58  133:aload_0         
	//*  59  134:getfield        #33  <Field CssUtils utils>
	//*  60  137:aload           9
	//*  61  139:ldc1            #133 <String "list-style-image">
	//*  62  141:invokeinterface #96  <Method Object Map.get(Object)>
	//*  63  146:checkcast       #98  <Class String>
	//*  64  149:invokevirtual   #138 <Method String CssUtils.extractUrl(String)>
	//*  65  152:astore          4
	//*  66  154:new             #140 <Class ImageRetrieve>
	//*  67  157:dup             
	//*  68  158:aload           5
	//*  69  160:invokevirtual   #146 <Method String HtmlPipelineContext.getResourcesRootPath()>
	//*  70  163:aload           5
	//*  71  165:invokevirtual   #150 <Method com.itextpdf.tool.xml.pipeline.html.ImageProvider HtmlPipelineContext.getImageProvider()>
	//*  72  168:invokespecial   #153 <Method void ImageRetrieve(String, com.itextpdf.tool.xml.pipeline.html.ImageProvider)>
	//*  73  171:aload           4
	//*  74  173:invokevirtual   #157 <Method Image ImageRetrieve.retrieveImage(String)>
	//*  75  176:astore_1        
	//*  76  177:aload_3         
	//*  77  178:new             #48  <Class Chunk>
	//*  78  181:dup             
	//*  79  182:aload_1         
	//*  80  183:fconst_0        
	//*  81  184:fconst_0        
	//*  82  185:iconst_0        
	//*  83  186:invokespecial   #160 <Method void Chunk(Image, float, float, boolean)>
	//*  84  189:invokevirtual   #163 <Method void List.setListSymbol(Chunk)>
	//*  85  192:aload_3         
	//*  86  193:aload_1         
	//*  87  194:invokevirtual   #169 <Method float Image.getWidth()>
	//*  88  197:invokevirtual   #42  <Method void List.setSymbolIndent(float)>
	//*  89  200:aload_3         
	//*  90  201:astore_1        
	//*  91  202:getstatic       #21  <Field Logger LOG>
	//*  92  205:getstatic       #175 <Field Level Level.TRACE>
	//*  93  208:invokeinterface #181 <Method boolean Logger.isLogging(Level)>
	//*  94  213:ifeq            246
	//*  95  216:getstatic       #21  <Field Logger LOG>
	//*  96  219:invokestatic    #186 <Method LocaleMessages LocaleMessages.getInstance()>
	//*  97  222:ldc1            #188 <String "html.tag.list">
	//*  98  224:invokevirtual   #191 <Method String LocaleMessages.getMessage(String)>
	//*  99  227:iconst_1        
	//* 100  228:anewarray       Object[]
	//* 101  231:dup             
	//* 102  232:iconst_0        
	//* 103  233:aload           4
	//* 104  235:aastore         
	//* 105  236:invokestatic    #195 <Method String String.format(String, Object[])>
	//* 106  239:invokeinterface #198 <Method void Logger.trace(String)>
	//* 107  244:aload_3         
	//* 108  245:astore_1        
	//* 109  246:aload_1         
	//* 110  247:iconst_0        
	//* 111  248:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
	//* 112  251:aload_1         
	//* 113  252:astore_3        
	//* 114  253:aload_3         
	//* 115  254:iconst_0        
	//* 116  255:invokevirtual   #204 <Method void List.setAlignindent(boolean)>
	//* 117  258:aload           9
	//* 118  260:ldc1            #206 <String "list-style-position">
	//* 119  262:invokeinterface #96  <Method Object Map.get(Object)>
	//* 120  267:ifnull          1028
	//* 121  270:aload           9
	//* 122  272:ldc1            #206 <String "list-style-position">
	//* 123  274:invokeinterface #96  <Method Object Map.get(Object)>
	//* 124  279:checkcast       #98  <Class String>
	//* 125  282:ldc1            #208 <String "inside">
	//* 126  284:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 127  287:ifeq            1028
	//* 128  290:fconst_0        
	//* 129  291:ldc1            #209 <Float 30F>
	//* 130  293:fadd            
	//* 131  294:fstore          6
	//* 132  296:aload           9
	//* 133  298:ldc1            #211 <String "margin-left">
	//* 134  300:invokeinterface #96  <Method Object Map.get(Object)>
	//* 135  305:ifnull          1038
	//* 136  308:aload_0         
	//* 137  309:getfield        #33  <Field CssUtils utils>
	//* 138  312:aload           9
	//* 139  314:ldc1            #211 <String "margin-left">
	//* 140  316:invokeinterface #96  <Method Object Map.get(Object)>
	//* 141  321:checkcast       #98  <Class String>
	//* 142  324:fload           8
	//* 143  326:invokevirtual   #215 <Method float CssUtils.parseValueToPt(String, float)>
	//* 144  329:fstore          7
	//* 145  331:aload           9
	//* 146  333:ldc1            #217 <String "padding-left">
	//* 147  335:invokeinterface #96  <Method Object Map.get(Object)>
	//* 148  340:ifnull          1044
	//* 149  343:aload_0         
	//* 150  344:getfield        #33  <Field CssUtils utils>
	//* 151  347:aload           9
	//* 152  349:ldc1            #217 <String "padding-left">
	//* 153  351:invokeinterface #96  <Method Object Map.get(Object)>
	//* 154  356:checkcast       #98  <Class String>
	//* 155  359:fload           8
	//* 156  361:invokevirtual   #215 <Method float CssUtils.parseValueToPt(String, float)>
	//* 157  364:fstore          8
	//* 158  366:aload_3         
	//* 159  367:fload           6
	//* 160  369:fload           7
	//* 161  371:fadd            
	//* 162  372:fload           8
	//* 163  374:fadd            
	//* 164  375:invokevirtual   #220 <Method void List.setIndentationLeft(float)>
	//* 165  378:aload_2         
	//* 166  379:invokevirtual   #223 <Method Map Tag.getAttributes()>
	//* 167  382:ldc1            #225 <String "start">
	//* 168  384:invokeinterface #96  <Method Object Map.get(Object)>
	//* 169  389:checkcast       #98  <Class String>
	//* 170  392:astore_1        
	//* 171  393:aload_1         
	//* 172  394:ifnull          405
	//* 173  397:aload_3         
	//* 174  398:aload_1         
	//* 175  399:invokestatic    #231 <Method int Integer.parseInt(String)>
	//* 176  402:invokevirtual   #235 <Method void List.setFirst(int)>
	//* 177  405:aload_3         
	//* 178  406:areturn         
			if("decimal".equalsIgnoreCase(s))
	//* 179  407:ldc1            #237 <String "decimal">
	//* 180  409:aload           10
	//* 181  411:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 182  414:ifeq            429
				list = new List(true);
	//  183  417:new             #38  <Class List>
	//  184  420:dup             
	//  185  421:iconst_1        
	//  186  422:invokespecial   #239 <Method void List(boolean)>
	//  187  425:astore_1        
			else
	//* 188  426:goto            89
			if("disc".equalsIgnoreCase(s))
	//* 189  429:ldc1            #241 <String "disc">
	//* 190  431:aload           10
	//* 191  433:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 192  436:ifeq            497
			{
				list = ((List) (new ZapfDingbatsList(108)));
	//  193  439:new             #243 <Class ZapfDingbatsList>
	//  194  442:dup             
	//  195  443:bipush          108
	//  196  445:invokespecial   #245 <Method void ZapfDingbatsList(int)>
	//  197  448:astore_1        
				list.setAutoindent(false);
	//  198  449:aload_1         
	//  199  450:iconst_0        
	//  200  451:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
				list.setSymbolIndent(7.75F);
	//  201  454:aload_1         
	//  202  455:ldc1            #246 <Float 7.75F>
	//  203  457:invokevirtual   #42  <Method void List.setSymbolIndent(float)>
				pagesizecontainable = ((PageSizeContainable) (list.getSymbol()));
	//  204  460:aload_1         
	//  205  461:invokevirtual   #46  <Method Chunk List.getSymbol()>
	//  206  464:astore          4
				((Chunk) (pagesizecontainable)).setTextRise(1.5F);
	//  207  466:aload           4
	//  208  468:ldc1            #247 <Float 1.5F>
	//  209  470:invokevirtual   #251 <Method Chunk Chunk.setTextRise(float)>
	//  210  473:pop             
				pagesizecontainable = ((PageSizeContainable) (((Chunk) (pagesizecontainable)).getFont()));
	//  211  474:aload           4
	//  212  476:invokevirtual   #52  <Method Font Chunk.getFont()>
	//  213  479:astore          4
				((Font) (pagesizecontainable)).setSize(4.5F);
	//  214  481:aload           4
	//  215  483:ldc1            #252 <Float 4.5F>
	//  216  485:invokevirtual   #57  <Method void Font.setSize(float)>
				((Font) (pagesizecontainable)).setColor(((BaseColor) (marginmemory)));
	//  217  488:aload           4
	//  218  490:aload_3         
	//  219  491:invokevirtual   #61  <Method void Font.setColor(BaseColor)>
			} else
	//* 220  494:goto            89
			if("square".equalsIgnoreCase(s))
	//* 221  497:ldc1            #254 <String "square">
	//* 222  499:aload           10
	//* 223  501:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 224  504:ifeq            528
			{
				list = ((List) (new ZapfDingbatsList(110)));
	//  225  507:new             #243 <Class ZapfDingbatsList>
	//  226  510:dup             
	//  227  511:bipush          110
	//  228  513:invokespecial   #245 <Method void ZapfDingbatsList(int)>
	//  229  516:astore_1        
				shrinkSymbol(list, f2, ((BaseColor) (marginmemory)));
	//  230  517:aload_0         
	//  231  518:aload_1         
	//  232  519:fload           8
	//  233  521:aload_3         
	//  234  522:invokespecial   #256 <Method void shrinkSymbol(List, float, BaseColor)>
			} else
	//* 235  525:goto            89
			if("circle".equalsIgnoreCase(s))
	//* 236  528:ldc2            #258 <String "circle">
	//* 237  531:aload           10
	//* 238  533:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 239  536:ifeq            584
			{
				list = ((List) (new ZapfDingbatsList(109)));
	//  240  539:new             #243 <Class ZapfDingbatsList>
	//  241  542:dup             
	//  242  543:bipush          109
	//  243  545:invokespecial   #245 <Method void ZapfDingbatsList(int)>
	//  244  548:astore_1        
				list.setAutoindent(false);
	//  245  549:aload_1         
	//  246  550:iconst_0        
	//  247  551:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
				list.setSymbolIndent(7.75F);
	//  248  554:aload_1         
	//  249  555:ldc1            #246 <Float 7.75F>
	//  250  557:invokevirtual   #42  <Method void List.setSymbolIndent(float)>
				marginmemory = ((MarginMemory) (list.getSymbol()));
	//  251  560:aload_1         
	//  252  561:invokevirtual   #46  <Method Chunk List.getSymbol()>
	//  253  564:astore_3        
				((Chunk) (marginmemory)).setTextRise(1.5F);
	//  254  565:aload_3         
	//  255  566:ldc1            #247 <Float 1.5F>
	//  256  568:invokevirtual   #251 <Method Chunk Chunk.setTextRise(float)>
	//  257  571:pop             
				((Chunk) (marginmemory)).getFont().setSize(4.5F);
	//  258  572:aload_3         
	//  259  573:invokevirtual   #52  <Method Font Chunk.getFont()>
	//  260  576:ldc1            #252 <Float 4.5F>
	//  261  578:invokevirtual   #57  <Method void Font.setSize(float)>
			} else
	//* 262  581:goto            89
			if("lower-roman".equals(((Object) (s))))
	//* 263  584:ldc2            #260 <String "lower-roman">
	//* 264  587:aload           10
	//* 265  589:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 266  592:ifeq            621
			{
				list = ((List) (new RomanList(true, 0)));
	//  267  595:new             #266 <Class RomanList>
	//  268  598:dup             
	//  269  599:iconst_1        
	//  270  600:iconst_0        
	//  271  601:invokespecial   #269 <Method void RomanList(boolean, int)>
	//  272  604:astore_1        
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  273  605:aload_0         
	//  274  606:fload           8
	//  275  608:aload_1         
	//  276  609:aload_3         
	//  277  610:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
				list.setAutoindent(true);
	//  278  613:aload_1         
	//  279  614:iconst_1        
	//  280  615:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
			} else
	//* 281  618:goto            89
			if("upper-roman".equals(((Object) (s))))
	//* 282  621:ldc2            #273 <String "upper-roman">
	//* 283  624:aload           10
	//* 284  626:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 285  629:ifeq            658
			{
				list = ((List) (new RomanList(false, 0)));
	//  286  632:new             #266 <Class RomanList>
	//  287  635:dup             
	//  288  636:iconst_0        
	//  289  637:iconst_0        
	//  290  638:invokespecial   #269 <Method void RomanList(boolean, int)>
	//  291  641:astore_1        
				list.setAutoindent(true);
	//  292  642:aload_1         
	//  293  643:iconst_1        
	//  294  644:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  295  647:aload_0         
	//  296  648:fload           8
	//  297  650:aload_1         
	//  298  651:aload_3         
	//  299  652:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
			} else
	//* 300  655:goto            89
			if("lower-greek".equals(((Object) (s))))
	//* 301  658:ldc2            #275 <String "lower-greek">
	//* 302  661:aload           10
	//* 303  663:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 304  666:ifeq            695
			{
				list = ((List) (new GreekList(true, 0)));
	//  305  669:new             #277 <Class GreekList>
	//  306  672:dup             
	//  307  673:iconst_1        
	//  308  674:iconst_0        
	//  309  675:invokespecial   #278 <Method void GreekList(boolean, int)>
	//  310  678:astore_1        
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  311  679:aload_0         
	//  312  680:fload           8
	//  313  682:aload_1         
	//  314  683:aload_3         
	//  315  684:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
				list.setAutoindent(true);
	//  316  687:aload_1         
	//  317  688:iconst_1        
	//  318  689:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
			} else
	//* 319  692:goto            89
			if("upper-greek".equals(((Object) (s))))
	//* 320  695:ldc2            #280 <String "upper-greek">
	//* 321  698:aload           10
	//* 322  700:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 323  703:ifeq            732
			{
				list = ((List) (new GreekList(false, 0)));
	//  324  706:new             #277 <Class GreekList>
	//  325  709:dup             
	//  326  710:iconst_0        
	//  327  711:iconst_0        
	//  328  712:invokespecial   #278 <Method void GreekList(boolean, int)>
	//  329  715:astore_1        
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  330  716:aload_0         
	//  331  717:fload           8
	//  332  719:aload_1         
	//  333  720:aload_3         
	//  334  721:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
				list.setAutoindent(true);
	//  335  724:aload_1         
	//  336  725:iconst_1        
	//  337  726:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
			} else
	//* 338  729:goto            89
			if("lower-alpha".equals(((Object) (s))) || "lower-latin".equals(((Object) (s))))
	//* 339  732:ldc2            #282 <String "lower-alpha">
	//* 340  735:aload           10
	//* 341  737:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 342  740:ifne            754
	//* 343  743:ldc2            #284 <String "lower-latin">
	//* 344  746:aload           10
	//* 345  748:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 346  751:ifeq            785
			{
				list = new List(true, true);
	//  347  754:new             #38  <Class List>
	//  348  757:dup             
	//  349  758:iconst_1        
	//  350  759:iconst_1        
	//  351  760:invokespecial   #287 <Method void List(boolean, boolean)>
	//  352  763:astore_1        
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  353  764:aload_0         
	//  354  765:fload           8
	//  355  767:aload_1         
	//  356  768:aload_3         
	//  357  769:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
				list.setLowercase(true);
	//  358  772:aload_1         
	//  359  773:iconst_1        
	//  360  774:invokevirtual   #290 <Method void List.setLowercase(boolean)>
				list.setAutoindent(true);
	//  361  777:aload_1         
	//  362  778:iconst_1        
	//  363  779:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
			} else
	//* 364  782:goto            89
			if("upper-alpha".equals(((Object) (s))) || "upper-latin".equals(((Object) (s))))
	//* 365  785:ldc2            #292 <String "upper-alpha">
	//* 366  788:aload           10
	//* 367  790:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 368  793:ifne            807
	//* 369  796:ldc2            #294 <String "upper-latin">
	//* 370  799:aload           10
	//* 371  801:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 372  804:ifeq            89
			{
				list = new List(true, true);
	//  373  807:new             #38  <Class List>
	//  374  810:dup             
	//  375  811:iconst_1        
	//  376  812:iconst_1        
	//  377  813:invokespecial   #287 <Method void List(boolean, boolean)>
	//  378  816:astore_1        
				synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
	//  379  817:aload_0         
	//  380  818:fload           8
	//  381  820:aload_1         
	//  382  821:aload_3         
	//  383  822:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
				list.setLowercase(false);
	//  384  825:aload_1         
	//  385  826:iconst_0        
	//  386  827:invokevirtual   #290 <Method void List.setLowercase(boolean)>
				list.setAutoindent(true);
	//  387  830:aload_1         
	//  388  831:iconst_1        
	//  389  832:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
			}
		} else
	//* 390  835:goto            89
		if(tag.getName().equalsIgnoreCase("ol"))
	//* 391  838:aload_2         
	//* 392  839:invokevirtual   #297 <Method String Tag.getName()>
	//* 393  842:ldc2            #299 <String "ol">
	//* 394  845:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 395  848:ifeq            938
		{
			list = new List(true);
	//  396  851:new             #38  <Class List>
	//  397  854:dup             
	//  398  855:iconst_1        
	//  399  856:invokespecial   #239 <Method void List(boolean)>
	//  400  859:astore_1        
			pagesizecontainable = ((PageSizeContainable) ((String)tag.getAttributes().get("type")));
	//  401  860:aload_2         
	//  402  861:invokevirtual   #223 <Method Map Tag.getAttributes()>
	//  403  864:ldc2            #301 <String "type">
	//  404  867:invokeinterface #96  <Method Object Map.get(Object)>
	//  405  872:checkcast       #98  <Class String>
	//  406  875:astore          4
			if(pagesizecontainable != null)
	//* 407  877:aload           4
	//* 408  879:ifnull          898
				if(((String) (pagesizecontainable)).equals("A"))
	//* 409  882:aload           4
	//* 410  884:ldc2            #303 <String "A">
	//* 411  887:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 412  890:ifeq            914
					list.setLettered(true);
	//  413  893:aload_1         
	//  414  894:iconst_1        
	//  415  895:invokevirtual   #122 <Method void List.setLettered(boolean)>
				else
	//* 416  898:aload_0         
	//* 417  899:fload           8
	//* 418  901:aload_1         
	//* 419  902:aload_3         
	//* 420  903:invokespecial   #271 <Method void synchronizeSymbol(float, List, BaseColor)>
	//* 421  906:aload_1         
	//* 422  907:iconst_1        
	//* 423  908:invokevirtual   #201 <Method void List.setAutoindent(boolean)>
	//* 424  911:goto            89
				if(((String) (pagesizecontainable)).equals("a"))
	//* 425  914:aload           4
	//* 426  916:ldc2            #305 <String "a">
	//* 427  919:invokevirtual   #264 <Method boolean String.equals(Object)>
	//* 428  922:ifeq            898
				{
					list.setLettered(true);
	//  429  925:aload_1         
	//  430  926:iconst_1        
	//  431  927:invokevirtual   #122 <Method void List.setLettered(boolean)>
					list.setLowercase(true);
	//  432  930:aload_1         
	//  433  931:iconst_1        
	//  434  932:invokevirtual   #290 <Method void List.setLowercase(boolean)>
				}
			synchronizeSymbol(f2, list, ((BaseColor) (marginmemory)));
			list.setAutoindent(true);
		} else
	//* 435  935:goto            898
		if(tag.getName().equalsIgnoreCase("ul"))
	//* 436  938:aload_2         
	//* 437  939:invokevirtual   #297 <Method String Tag.getName()>
	//* 438  942:ldc2            #307 <String "ul">
	//* 439  945:invokevirtual   #118 <Method boolean String.equalsIgnoreCase(String)>
	//* 440  948:ifeq            89
		{
			list = new List(false);
	//  441  951:new             #38  <Class List>
	//  442  954:dup             
	//  443  955:iconst_0        
	//  444  956:invokespecial   #239 <Method void List(boolean)>
	//  445  959:astore_1        
			shrinkSymbol(list, f2, ((BaseColor) (marginmemory)));
	//  446  960:aload_0         
	//  447  961:aload_1         
	//  448  962:fload           8
	//  449  964:aload_3         
	//  450  965:invokespecial   #256 <Method void shrinkSymbol(List, float, BaseColor)>
		}
		marginmemory = ((MarginMemory) (list));
		if(map.get("list-style-image") == null) goto _L2; else goto _L1
_L1:
		marginmemory = ((MarginMemory) (list));
		if(((String)map.get("list-style-image")).equalsIgnoreCase("none")) goto _L2; else goto _L3
_L3:
		marginmemory = ((MarginMemory) (new List()));
		pagesizecontainable = ((PageSizeContainable) (utils.extractUrl((String)map.get("list-style-image"))));
		list = ((List) ((new ImageRetrieve(htmlpipelinecontext.getResourcesRootPath(), htmlpipelinecontext.getImageProvider())).retrieveImage(((String) (pagesizecontainable)))));
		((List) (marginmemory)).setListSymbol(new Chunk(((Image) (list)), 0.0F, 0.0F, false));
		((List) (marginmemory)).setSymbolIndent(((Image) (list)).getWidth());
		list = ((List) (marginmemory));
		if(!LOG.isLogging(Level.TRACE))
			break MISSING_BLOCK_LABEL_246;
		LOG.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.list"), new Object[] {
			pagesizecontainable
		}));
		list = ((List) (marginmemory));
_L5:
		list.setAutoindent(false);
		marginmemory = ((MarginMemory) (list));
_L2:
		((List) (marginmemory)).setAlignindent(false);
		float f;
		float f1;
		if(map.get("list-style-position") != null && ((String)map.get("list-style-position")).equalsIgnoreCase("inside"))
			f = 0.0F + 30F;
		else
	//* 451  968:goto            89
	//* 452  971:astore_1        
	//* 453  972:getstatic       #21  <Field Logger LOG>
	//* 454  975:getstatic       #310 <Field Level Level.ERROR>
	//* 455  978:invokeinterface #181 <Method boolean Logger.isLogging(Level)>
	//* 456  983:ifeq            1016
	//* 457  986:getstatic       #21  <Field Logger LOG>
	//* 458  989:invokestatic    #186 <Method LocaleMessages LocaleMessages.getInstance()>
	//* 459  992:ldc2            #312 <String "html.tag.img.failed">
	//* 460  995:invokevirtual   #191 <Method String LocaleMessages.getMessage(String)>
	//* 461  998:iconst_1        
	//* 462  999:anewarray       Object[]
	//* 463 1002:dup             
	//* 464 1003:iconst_0        
	//* 465 1004:aload           4
	//* 466 1006:aastore         
	//* 467 1007:invokestatic    #195 <Method String String.format(String, Object[])>
	//* 468 1010:aload_1         
	//* 469 1011:invokeinterface #316 <Method void Logger.error(String, Exception)>
	//* 470 1016:new             #38  <Class List>
	//* 471 1019:dup             
	//* 472 1020:iconst_0        
	//* 473 1021:invokespecial   #239 <Method void List(boolean)>
	//* 474 1024:astore_1        
	//* 475 1025:goto            246
			f = 0.0F + 15F;
	//  476 1028:fconst_0        
	//  477 1029:ldc2            #317 <Float 15F>
	//  478 1032:fadd            
	//  479 1033:fstore          6
		if(map.get("margin-left") != null)
			f1 = utils.parseValueToPt((String)map.get("margin-left"), f2);
		else
	//* 480 1035:goto            296
			f1 = 0.0F;
	//  481 1038:fconst_0        
	//  482 1039:fstore          7
		if(map.get("padding-left") != null)
			f2 = utils.parseValueToPt((String)map.get("padding-left"), f2);
		else
	//* 483 1041:goto            331
			f2 = 0.0F;
	//  484 1044:fconst_0        
	//  485 1045:fstore          8
		((List) (marginmemory)).setIndentationLeft(f + f1 + f2);
		list = ((List) ((String)tag.getAttributes().get("start")));
		if(list != null)
			try
			{
				((List) (marginmemory)).setFirst(Integer.parseInt(((String) (list))));
			}
	//* 486 1047:goto            366
			// Misplaced declaration of an exception variable
			catch(List list)
	//* 487 1050:astore_1        
			{
				return ((List) (marginmemory));
	//  488 1051:aload_3         
	//  489 1052:areturn         
			}
		return ((List) (marginmemory));
		list;
		if(LOG.isLogging(Level.ERROR))
			LOG.error(String.format(LocaleMessages.getInstance().getMessage("html.tag.img.failed"), new Object[] {
				pagesizecontainable
			}), ((Exception) (list)));
		list = new List(false);
		if(true) goto _L5; else goto _L4
_L4:
	}

	public List apply(List list, Tag tag, HtmlPipelineContext htmlpipelinecontext)
	{
		return apply(list, tag, ((MarginMemory) (null)), ((PageSizeContainable) (null)), htmlpipelinecontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aload_3         
	//    6    6:invokevirtual   #68  <Method List apply(List, Tag, MarginMemory, PageSizeContainable, HtmlPipelineContext)>
	//    7    9:areturn         
	}

	private static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/tool/xml/css/apply/ListStyleTypeCssApplier);
	private final CssUtils utils = CssUtils.getInstance();

	static 
	{
	//    0    0:ldc1            #2   <Class ListStyleTypeCssApplier>
	//    1    2:invokestatic    #19  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #21  <Field Logger LOG>
	//*   3    8:return          
	}
}
