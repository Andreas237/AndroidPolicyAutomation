// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Element;
import com.itextpdf.text.ListItem;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.css.FontSizeTranslator;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class OrderedUnorderedList extends AbstractTagProcessor
{

	public OrderedUnorderedList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	private float calculateTopOrBottomSpacing(boolean flag, boolean flag1, Tag tag, Tag tag1, WorkerContext workercontext)
	{
		float f;
		float f1;
		float f2;
		String s;
		HtmlPipelineContext htmlpipelinecontext;
		String s1;
		try
		{
			htmlpipelinecontext = getHtmlPipelineContext(workercontext);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:invokevirtual   #37  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//    3    6:astore          10
		}
	//*   4    8:iload_1         
	//*   5    9:ifeq            439
	//*   6   12:ldc1            #39  <String "-top">
	//*   7   14:astore          9
	//*   8   16:getstatic       #18  <Field FontSizeTranslator fst>
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #43  <Method float FontSizeTranslator.getFontSize(Tag)>
	//*  11   23:fstore          6
	//*  12   25:fload           6
	//*  13   27:fstore          7
	//*  14   29:fload           6
	//*  15   31:ldc1            #44  <Float -1F>
	//*  16   33:fcmpl           
	//*  17   34:ifne            40
	//*  18   37:fconst_0        
	//*  19   38:fstore          7
	//*  20   40:fconst_0        
	//*  21   41:fstore          8
	//*  22   43:aload_3         
	//*  23   44:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  24   47:new             #52  <Class StringBuilder>
	//*  25   50:dup             
	//*  26   51:invokespecial   #53  <Method void StringBuilder()>
	//*  27   54:ldc1            #55  <String "margin">
	//*  28   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  29   59:aload           9
	//*  30   61:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  31   64:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  32   67:invokeinterface #69  <Method Object Map.get(Object)>
	//*  33   72:checkcast       #71  <Class String>
	//*  34   75:astore          11
	//*  35   77:aload           11
	//*  36   79:ifnonnull       317
	//*  37   82:fload           8
	//*  38   84:fstore          6
	//*  39   86:aload_3         
	//*  40   87:invokevirtual   #75  <Method Tag Tag.getParent()>
	//*  41   90:ifnull          125
	//*  42   93:fload           8
	//*  43   95:fstore          6
	//*  44   97:aload_0         
	//*  45   98:aload           5
	//*  46  100:invokevirtual   #37  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//*  47  103:invokevirtual   #81  <Method List HtmlPipelineContext.getRootTags()>
	//*  48  106:aload_3         
	//*  49  107:invokevirtual   #75  <Method Tag Tag.getParent()>
	//*  50  110:invokevirtual   #84  <Method String Tag.getName()>
	//*  51  113:invokeinterface #90  <Method boolean List.contains(Object)>
	//*  52  118:ifeq            125
	//*  53  121:fload           7
	//*  54  123:fstore          6
	//*  55  125:aload_3         
	//*  56  126:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  57  129:new             #52  <Class StringBuilder>
	//*  58  132:dup             
	//*  59  133:invokespecial   #53  <Method void StringBuilder()>
	//*  60  136:ldc1            #92  <String "padding">
	//*  61  138:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  62  141:aload           9
	//*  63  143:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  64  146:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  65  149:invokeinterface #69  <Method Object Map.get(Object)>
	//*  66  154:ifnull          446
	//*  67  157:getstatic       #25  <Field CssUtils utils>
	//*  68  160:aload_3         
	//*  69  161:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  70  164:new             #52  <Class StringBuilder>
	//*  71  167:dup             
	//*  72  168:invokespecial   #53  <Method void StringBuilder()>
	//*  73  171:ldc1            #92  <String "padding">
	//*  74  173:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  75  176:aload           9
	//*  76  178:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  77  181:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  78  184:invokeinterface #69  <Method Object Map.get(Object)>
	//*  79  189:checkcast       #71  <Class String>
	//*  80  192:fload           7
	//*  81  194:invokevirtual   #96  <Method float CssUtils.parseValueToPt(String, float)>
	//*  82  197:fstore          8
	//*  83  199:getstatic       #18  <Field FontSizeTranslator fst>
	//*  84  202:aload           4
	//*  85  204:invokevirtual   #43  <Method float FontSizeTranslator.getFontSize(Tag)>
	//*  86  207:fstore          7
	//*  87  209:aload           4
	//*  88  211:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  89  214:new             #52  <Class StringBuilder>
	//*  90  217:dup             
	//*  91  218:invokespecial   #53  <Method void StringBuilder()>
	//*  92  221:ldc1            #55  <String "margin">
	//*  93  223:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  94  226:aload           9
	//*  95  228:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  96  231:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  97  234:invokeinterface #69  <Method Object Map.get(Object)>
	//*  98  239:ifnull          452
	//*  99  242:getstatic       #25  <Field CssUtils utils>
	//* 100  245:aload           4
	//* 101  247:invokevirtual   #50  <Method Map Tag.getCSS()>
	//* 102  250:new             #52  <Class StringBuilder>
	//* 103  253:dup             
	//* 104  254:invokespecial   #53  <Method void StringBuilder()>
	//* 105  257:ldc1            #55  <String "margin">
	//* 106  259:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 107  262:aload           9
	//* 108  264:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 109  267:invokevirtual   #63  <Method String StringBuilder.toString()>
	//* 110  270:invokeinterface #69  <Method Object Map.get(Object)>
	//* 111  275:checkcast       #71  <Class String>
	//* 112  278:fload           7
	//* 113  280:invokevirtual   #96  <Method float CssUtils.parseValueToPt(String, float)>
	//* 114  283:fstore          7
	//* 115  285:goto            397
	//* 116  288:iload_1         
	//* 117  289:ifne            432
	//* 118  292:iload_2         
	//* 119  293:ifeq            432
	//* 120  296:aload           10
	//* 121  298:invokevirtual   #99  <Method Map HtmlPipelineContext.getMemory()>
	//* 122  301:ldc1            #101 <String "lastMarginBottom">
	//* 123  303:fload           6
	//* 124  305:invokestatic    #107 <Method Float Float.valueOf(float)>
	//* 125  308:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//* 126  313:pop             
	//* 127  314:goto            432
	//* 128  317:getstatic       #25  <Field CssUtils utils>
	//* 129  320:aload           11
	//* 130  322:fload           7
	//* 131  324:invokevirtual   #96  <Method float CssUtils.parseValueToPt(String, float)>
	//* 132  327:fstore          6
	//* 133  329:goto            125
	//* 134  332:fload           6
	//* 135  334:fload           8
	//* 136  336:fadd            
	//* 137  337:fload           7
	//* 138  339:fadd            
	//* 139  340:fstore          8
	//* 140  342:fload           8
	//* 141  344:fstore          7
	//* 142  346:iload_1         
	//* 143  347:ifne            436
	//* 144  350:fload           8
	//* 145  352:fstore          7
	//* 146  354:iload_2         
	//* 147  355:ifeq            436
	//* 148  358:aload           10
	//* 149  360:invokevirtual   #99  <Method Map HtmlPipelineContext.getMemory()>
	//* 150  363:ldc1            #101 <String "lastMarginBottom">
	//* 151  365:fload           6
	//* 152  367:invokestatic    #107 <Method Float Float.valueOf(float)>
	//* 153  370:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//* 154  375:pop             
	//* 155  376:fload           8
	//* 156  378:freturn         
		// Misplaced declaration of an exception variable
		catch(Tag tag)
	//* 157  379:astore_3        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (tag)));
	//  158  380:new             #113 <Class RuntimeWorkerException>
	//  159  383:dup             
	//  160  384:invokestatic    #118 <Method LocaleMessages LocaleMessages.getInstance()>
	//  161  387:ldc1            #120 <String "customcontext.404">
	//  162  389:invokevirtual   #124 <Method String LocaleMessages.getMessage(String)>
	//  163  392:aload_3         
	//  164  393:invokespecial   #127 <Method void RuntimeWorkerException(String, Throwable)>
	//  165  396:athrow          
		}
		if(flag)
			s = "-top";
		else
	//* 166  397:fload           8
	//* 167  399:fconst_0        
	//* 168  400:fcmpl           
	//* 169  401:ifne            332
	//* 170  404:fconst_0        
	//* 171  405:fstore          8
	//* 172  407:fload           6
	//* 173  409:fconst_0        
	//* 174  410:fcmpl           
	//* 175  411:ifeq            465
	//* 176  414:fload           7
	//* 177  416:fconst_0        
	//* 178  417:fcmpl           
	//* 179  418:ifeq            465
	//* 180  421:fload           6
	//* 181  423:fload           7
	//* 182  425:fcmpl           
	//* 183  426:iflt            458
	//* 184  429:goto            288
	//* 185  432:fload           6
	//* 186  434:fstore          7
	//* 187  436:fload           7
	//* 188  438:freturn         
			s = "-bottom";
	//  189  439:ldc1            #129 <String "-bottom">
	//  190  441:astore          9
		f = fst.getFontSize(tag);
		f1 = f;
		if(f == -1F)
			f1 = 0.0F;
		f2 = 0.0F;
		s1 = (String)tag.getCSS().get(((Object) ((new StringBuilder()).append("margin").append(s).toString())));
		if(s1 != null) goto _L2; else goto _L1
_L1:
		f = f2;
		if(tag.getParent() == null)
			break MISSING_BLOCK_LABEL_125;
		f = f2;
		if(getHtmlPipelineContext(workercontext).getRootTags().contains(((Object) (tag.getParent().getName()))))
			f = f1;
_L10:
		if(tag.getCSS().get(((Object) ((new StringBuilder()).append("padding").append(s).toString()))) == null) goto _L4; else goto _L3
_L3:
		f2 = utils.parseValueToPt((String)tag.getCSS().get(((Object) ((new StringBuilder()).append("padding").append(s).toString()))), f1);
_L18:
		f1 = fst.getFontSize(tag1);
		if(tag1.getCSS().get(((Object) ((new StringBuilder()).append("margin").append(s).toString()))) == null) goto _L6; else goto _L5
_L5:
		f1 = utils.parseValueToPt((String)tag1.getCSS().get(((Object) ((new StringBuilder()).append("margin").append(s).toString()))), f1);
		  goto _L7
_L16:
		if(flag || !flag1) goto _L9; else goto _L8
_L8:
		htmlpipelinecontext.getMemory().put("lastMarginBottom", ((Object) (Float.valueOf(f))));
		  goto _L9
_L2:
		f = utils.parseValueToPt(s1, f1);
		  goto _L10
_L15:
		f2 = f + f2 + f1;
		f1 = f2;
		if(flag) goto _L12; else goto _L11
_L11:
		f1 = f2;
		if(!flag1) goto _L12; else goto _L13
_L13:
		htmlpipelinecontext.getMemory().put("lastMarginBottom", ((Object) (Float.valueOf(f))));
		return f2;
_L7:
		if(f2 != 0.0F) goto _L15; else goto _L14
_L14:
		f2 = 0.0F;
		if(f == 0.0F || f1 == 0.0F)
			break MISSING_BLOCK_LABEL_465;
		if(f < f1) goto _L17; else goto _L16
_L9:
		f1 = f;
_L12:
		return f1;
	//* 191  443:goto            16
_L4:
		f2 = 0.0F;
	//  192  446:fconst_0        
	//  193  447:fstore          8
		  goto _L18
	//* 194  449:goto            199
_L6:
		f1 = 0.0F;
	//  195  452:fconst_0        
	//  196  453:fstore          7
		  goto _L7
	//* 197  455:goto            397
_L17:
		f = f1;
	//  198  458:fload           7
	//  199  460:fstore          6
		  goto _L16
	//* 200  462:goto            288
		if(f == 0.0F)
	//* 201  465:fload           6
	//* 202  467:fconst_0        
	//* 203  468:fcmpl           
	//* 204  469:ifeq            475
	//* 205  472:goto            288
		{
			f = f2;
	//  206  475:fload           8
	//  207  477:fstore          6
			if(f1 != 0.0F)
	//* 208  479:fload           7
	//* 209  481:fconst_0        
	//* 210  482:fcmpl           
	//* 211  483:ifeq            288
				f = f1;
	//  212  486:fload           7
	//  213  488:fstore          6
		}
		  goto _L16
	//* 214  490:goto            288
	}

	private List populateList(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #138 <Method Iterator List.iterator()>
	//*   6   14:astore_1        
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            87
		{
			Element element = (Element)((Iterator) (list)).next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #148 <Method Object Iterator.next()>
	//   12   30:checkcast       #150 <Class Element>
	//   13   33:astore_3        
			if((element instanceof ListItem) || (element instanceof com.itextpdf.text.List))
	//*  14   34:aload_3         
	//*  15   35:instanceof      #152 <Class ListItem>
	//*  16   38:ifne            48
	//*  17   41:aload_3         
	//*  18   42:instanceof      #154 <Class com.itextpdf.text.List>
	//*  19   45:ifeq            59
			{
				((List) (arraylist)).add(((Object) (element)));
	//   20   48:aload_2         
	//   21   49:aload_3         
	//   22   50:invokeinterface #157 <Method boolean List.add(Object)>
	//   23   55:pop             
			} else
	//*  24   56:goto            15
			{
				ListItem listitem = new ListItem();
	//   25   59:new             #152 <Class ListItem>
	//   26   62:dup             
	//   27   63:invokespecial   #158 <Method void ListItem()>
	//   28   66:astore          4
				listitem.add(element);
	//   29   68:aload           4
	//   30   70:aload_3         
	//   31   71:invokevirtual   #161 <Method boolean ListItem.add(Element)>
	//   32   74:pop             
				((List) (arraylist)).add(((Object) (listitem)));
	//   33   75:aload_2         
	//   34   76:aload           4
	//   35   78:invokeinterface #157 <Method boolean List.add(Object)>
	//   36   83:pop             
			}
		}

	//*  37   84:goto            15
		return ((List) (arraylist));
	//   38   87:aload_2         
	//   39   88:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		int j;
		ArrayList arraylist;
		Object obj;
		obj = ((Object) (populateList(list)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #167 <Method List populateList(List)>
	//    3    5:astore          8
		j = ((List) (obj)).size();
	//    4    7:aload           8
	//    5    9:invokeinterface #171 <Method int List.size()>
	//    6   14:istore          6
		arraylist = new ArrayList();
	//    7   16:new             #133 <Class ArrayList>
	//    8   19:dup             
	//    9   20:invokespecial   #134 <Method void ArrayList()>
	//   10   23:astore          7
		if(j <= 0) goto _L2; else goto _L1
	//   11   25:iload           6
	//   12   27:ifle            406
_L1:
		int i;
		float f;
		try
		{
			list = ((List) (getHtmlPipelineContext(workercontext)));
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokevirtual   #37  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   16   35:astore_3        
			list = ((List) ((com.itextpdf.text.List)getCssAppliers().apply(((Element) (new com.itextpdf.text.List())), tag, ((HtmlPipelineContext) (list)))));
	//   17   36:aload_0         
	//   18   37:invokevirtual   #175 <Method CssAppliers getCssAppliers()>
	//   19   40:new             #154 <Class com.itextpdf.text.List>
	//   20   43:dup             
	//   21   44:invokespecial   #176 <Method void com.itextpdf.text.List()>
	//   22   47:aload_2         
	//   23   48:aload_3         
	//   24   49:invokeinterface #182 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//   25   54:checkcast       #154 <Class com.itextpdf.text.List>
	//   26   57:astore_3        
		}
	//*  27   58:iconst_0        
	//*  28   59:istore          5
	//*  29   61:aload           8
	//*  30   63:invokeinterface #138 <Method Iterator List.iterator()>
	//*  31   68:astore          8
	//*  32   70:aload           8
	//*  33   72:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*  34   77:ifeq            397
	//*  35   80:aload           8
	//*  36   82:invokeinterface #148 <Method Object Iterator.next()>
	//*  37   87:checkcast       #150 <Class Element>
	//*  38   90:astore          9
	//*  39   92:aload           9
	//*  40   94:instanceof      #152 <Class ListItem>
	//*  41   97:ifeq            387
	//*  42  100:aload_2         
	//*  43  101:invokevirtual   #185 <Method List Tag.getChildren()>
	//*  44  104:iload           5
	//*  45  106:invokeinterface #188 <Method Object List.get(int)>
	//*  46  111:checkcast       #46  <Class Tag>
	//*  47  114:astore          10
	//*  48  116:iload           6
	//*  49  118:iconst_1        
	//*  50  119:icmpne          266
	//*  51  122:aload           10
	//*  52  124:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  53  127:ldc1            #190 <String "margin-top">
	//*  54  129:new             #52  <Class StringBuilder>
	//*  55  132:dup             
	//*  56  133:invokespecial   #53  <Method void StringBuilder()>
	//*  57  136:aload_0         
	//*  58  137:iconst_1        
	//*  59  138:iconst_0        
	//*  60  139:aload_2         
	//*  61  140:aload           10
	//*  62  142:aload_1         
	//*  63  143:invokespecial   #192 <Method float calculateTopOrBottomSpacing(boolean, boolean, Tag, Tag, WorkerContext)>
	//*  64  146:invokevirtual   #195 <Method StringBuilder StringBuilder.append(float)>
	//*  65  149:ldc1            #197 <String "pt">
	//*  66  151:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  67  154:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  68  157:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//*  69  162:pop             
	//*  70  163:aload_0         
	//*  71  164:iconst_0        
	//*  72  165:iconst_0        
	//*  73  166:aload_2         
	//*  74  167:aload           10
	//*  75  169:aload_1         
	//*  76  170:invokespecial   #192 <Method float calculateTopOrBottomSpacing(boolean, boolean, Tag, Tag, WorkerContext)>
	//*  77  173:fstore          4
	//*  78  175:aload           10
	//*  79  177:invokevirtual   #50  <Method Map Tag.getCSS()>
	//*  80  180:ldc1            #199 <String "margin-bottom">
	//*  81  182:new             #52  <Class StringBuilder>
	//*  82  185:dup             
	//*  83  186:invokespecial   #53  <Method void StringBuilder()>
	//*  84  189:fload           4
	//*  85  191:invokevirtual   #195 <Method StringBuilder StringBuilder.append(float)>
	//*  86  194:ldc1            #197 <String "pt">
	//*  87  196:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  88  199:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  89  202:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//*  90  207:pop             
	//*  91  208:aload_3         
	//*  92  209:aload_0         
	//*  93  210:invokevirtual   #175 <Method CssAppliers getCssAppliers()>
	//*  94  213:aload           9
	//*  95  215:aload           10
	//*  96  217:aload_0         
	//*  97  218:aload_1         
	//*  98  219:invokevirtual   #37  <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//*  99  222:invokeinterface #182 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//* 100  227:invokevirtual   #200 <Method boolean com.itextpdf.text.List.add(Element)>
	//* 101  230:pop             
	//* 102  231:iload           5
	//* 103  233:iconst_1        
	//* 104  234:iadd            
	//* 105  235:istore          5
	//* 106  237:goto            70
		// Misplaced declaration of an exception variable
		catch(List list)
	//* 107  240:astore_3        
		{
			list = ((List) ((com.itextpdf.text.List)getCssAppliers().apply(((Element) (new com.itextpdf.text.List())), tag, ((HtmlPipelineContext) (null)))));
	//  108  241:aload_0         
	//  109  242:invokevirtual   #175 <Method CssAppliers getCssAppliers()>
	//  110  245:new             #154 <Class com.itextpdf.text.List>
	//  111  248:dup             
	//  112  249:invokespecial   #176 <Method void com.itextpdf.text.List()>
	//  113  252:aload_2         
	//  114  253:aconst_null     
	//  115  254:invokeinterface #182 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//  116  259:checkcast       #154 <Class com.itextpdf.text.List>
	//  117  262:astore_3        
		}
		i = 0;
		obj = ((Object) (((List) (obj)).iterator()));
_L4:
		if(((Iterator) (obj)).hasNext())
		{
			Element element = (Element)((Iterator) (obj)).next();
			if(element instanceof ListItem)
			{
				Tag tag1 = (Tag)tag.getChildren().get(i);
				if(j == 1)
				{
					tag1.getCSS().put("margin-top", ((Object) ((new StringBuilder()).append(calculateTopOrBottomSpacing(true, false, tag, tag1, workercontext)).append("pt").toString())));
					f = calculateTopOrBottomSpacing(false, false, tag, tag1, workercontext);
					tag1.getCSS().put("margin-bottom", ((Object) ((new StringBuilder()).append(f).append("pt").toString())));
				} else
	//* 118  263:goto            58
				{
					if(i == 0)
	//* 119  266:iload           5
	//* 120  268:ifne            312
						tag1.getCSS().put("margin-top", ((Object) ((new StringBuilder()).append(calculateTopOrBottomSpacing(true, false, tag, tag1, workercontext)).append("pt").toString())));
	//  121  271:aload           10
	//  122  273:invokevirtual   #50  <Method Map Tag.getCSS()>
	//  123  276:ldc1            #190 <String "margin-top">
	//  124  278:new             #52  <Class StringBuilder>
	//  125  281:dup             
	//  126  282:invokespecial   #53  <Method void StringBuilder()>
	//  127  285:aload_0         
	//  128  286:iconst_1        
	//  129  287:iconst_0        
	//  130  288:aload_2         
	//  131  289:aload           10
	//  132  291:aload_1         
	//  133  292:invokespecial   #192 <Method float calculateTopOrBottomSpacing(boolean, boolean, Tag, Tag, WorkerContext)>
	//  134  295:invokevirtual   #195 <Method StringBuilder StringBuilder.append(float)>
	//  135  298:ldc1            #197 <String "pt">
	//  136  300:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  137  303:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  138  306:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//  139  311:pop             
					if(i == j - 1)
	//* 140  312:iload           5
	//* 141  314:iload           6
	//* 142  316:iconst_1        
	//* 143  317:isub            
	//* 144  318:icmpne          208
					{
						float f1 = calculateTopOrBottomSpacing(false, true, tag, tag1, workercontext);
	//  145  321:aload_0         
	//  146  322:iconst_0        
	//  147  323:iconst_1        
	//  148  324:aload_2         
	//  149  325:aload           10
	//  150  327:aload_1         
	//  151  328:invokespecial   #192 <Method float calculateTopOrBottomSpacing(boolean, boolean, Tag, Tag, WorkerContext)>
	//  152  331:fstore          4
						tag1.getCSS().put("margin-bottom", ((Object) ((new StringBuilder()).append(f1).append("pt").toString())));
	//  153  333:aload           10
	//  154  335:invokevirtual   #50  <Method Map Tag.getCSS()>
	//  155  338:ldc1            #199 <String "margin-bottom">
	//  156  340:new             #52  <Class StringBuilder>
	//  157  343:dup             
	//  158  344:invokespecial   #53  <Method void StringBuilder()>
	//  159  347:fload           4
	//  160  349:invokevirtual   #195 <Method StringBuilder StringBuilder.append(float)>
	//  161  352:ldc1            #197 <String "pt">
	//  162  354:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  163  357:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  164  360:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//  165  365:pop             
					}
				}
				try
				{
					((com.itextpdf.text.List) (list)).add(getCssAppliers().apply(element, tag1, getHtmlPipelineContext(workercontext)));
				}
	//* 166  366:goto            208
				// Misplaced declaration of an exception variable
				catch(WorkerContext workercontext)
	//* 167  369:astore_1        
				{
					throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//  168  370:new             #113 <Class RuntimeWorkerException>
	//  169  373:dup             
	//  170  374:invokestatic    #118 <Method LocaleMessages LocaleMessages.getInstance()>
	//  171  377:ldc1            #120 <String "customcontext.404">
	//  172  379:invokevirtual   #124 <Method String LocaleMessages.getMessage(String)>
	//  173  382:aload_1         
	//  174  383:invokespecial   #127 <Method void RuntimeWorkerException(String, Throwable)>
	//  175  386:athrow          
				}
			} else
			{
				((com.itextpdf.text.List) (list)).add(element);
	//  176  387:aload_3         
	//  177  388:aload           9
	//  178  390:invokevirtual   #200 <Method boolean com.itextpdf.text.List.add(Element)>
	//  179  393:pop             
			}
			i++;
			continue; /* Loop/switch isn't completed */
		}
	//* 180  394:goto            231
		((List) (arraylist)).add(((Object) (list)));
	//  181  397:aload           7
	//  182  399:aload_3         
	//  183  400:invokeinterface #157 <Method boolean List.add(Object)>
	//  184  405:pop             
_L2:
		return ((List) (arraylist));
	//  185  406:aload           7
	//  186  408:areturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final FontSizeTranslator fst = FontSizeTranslator.getInstance();
	private static final CssUtils utils = CssUtils.getInstance();

	static 
	{
	//    0    0:invokestatic    #16  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//    1    3:putstatic       #18  <Field FontSizeTranslator fst>
	//    2    6:invokestatic    #23  <Method CssUtils CssUtils.getInstance()>
	//    3    9:putstatic       #25  <Field CssUtils utils>
	//*   4   12:return          
	}
}
