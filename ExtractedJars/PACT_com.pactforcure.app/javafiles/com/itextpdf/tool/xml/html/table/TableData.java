// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.pdfelement.HtmlCell;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TableData extends AbstractTagProcessor
{

	public TableData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return textContent(workercontext, tag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #14  <Method List textContent(WorkerContext, Tag, String)>
	//    5    7:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		int i;
		int j;
		HtmlCell htmlcell;
		ArrayList arraylist;
		ArrayList arraylist1;
		ArrayList arraylist2;
		Element element;
		htmlcell = new HtmlCell();
	//    0    0:new             #22  <Class HtmlCell>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HtmlCell()>
	//    3    7:astore          6
		i = getRunDirection(tag);
	//    4    9:aload_0         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #27  <Method int getRunDirection(Tag)>
	//    7   14:istore          4
		if(i != 1)
	//*   8   16:iload           4
	//*   9   18:iconst_1        
	//*  10   19:icmpeq          29
			htmlcell.setRunDirection(i);
	//   11   22:aload           6
	//   12   24:iload           4
	//   13   26:invokevirtual   #31  <Method void HtmlCell.setRunDirection(int)>
		if("th".equalsIgnoreCase(tag.getName()))
	//*  14   29:ldc1            #33  <String "th">
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #39  <Method String Tag.getName()>
	//*  17   35:invokevirtual   #45  <Method boolean String.equalsIgnoreCase(String)>
	//*  18   38:ifeq            49
			htmlcell.setRole(PdfName.TH);
	//   19   41:aload           6
	//   20   43:getstatic       #51  <Field PdfName PdfName.TH>
	//   21   46:invokevirtual   #55  <Method void HtmlCell.setRole(PdfName)>
		Iterator iterator;
		Element element1;
		try
		{
			com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext htmlpipelinecontext = getHtmlPipelineContext(workercontext);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokevirtual   #59  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   25   54:astore          7
			htmlcell = (HtmlCell)getCssAppliers().apply(((Element) (htmlcell)), tag, htmlpipelinecontext);
	//   26   56:aload_0         
	//   27   57:invokevirtual   #63  <Method CssAppliers getCssAppliers()>
	//   28   60:aload           6
	//   29   62:aload_2         
	//   30   63:aload           7
	//   31   65:invokeinterface #69  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   32   70:checkcast       #22  <Class HtmlCell>
	//   33   73:astore          6
		}
	//*  34   75:new             #71  <Class ArrayList>
	//*  35   78:dup             
	//*  36   79:iconst_1        
	//*  37   80:invokespecial   #73  <Method void ArrayList(int)>
	//*  38   83:astore          7
	//*  39   85:new             #71  <Class ArrayList>
	//*  40   88:dup             
	//*  41   89:invokespecial   #74  <Method void ArrayList()>
	//*  42   92:astore          8
	//*  43   94:new             #71  <Class ArrayList>
	//*  44   97:dup             
	//*  45   98:invokespecial   #74  <Method void ArrayList()>
	//*  46  101:astore          9
	//*  47  103:iconst_m1       
	//*  48  104:istore          4
	//*  49  106:aload_3         
	//*  50  107:invokeinterface #80  <Method Iterator List.iterator()>
	//*  51  112:astore          10
	//*  52  114:aload           10
	//*  53  116:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  54  121:ifeq            511
	//*  55  124:aload           10
	//*  56  126:invokeinterface #90  <Method Object Iterator.next()>
	//*  57  131:checkcast       #92  <Class Element>
	//*  58  134:astore          11
	//*  59  136:iload           4
	//*  60  138:iconst_1        
	//*  61  139:iadd            
	//*  62  140:istore          5
	//*  63  142:aload           11
	//*  64  144:instanceof      #94  <Class Chunk>
	//*  65  147:ifne            166
	//*  66  150:aload           11
	//*  67  152:instanceof      #96  <Class NoNewLineParagraph>
	//*  68  155:ifne            166
	//*  69  158:aload           11
	//*  70  160:instanceof      #98  <Class LineSeparator>
	//*  71  163:ifeq            380
	//*  72  166:aload           9
	//*  73  168:invokeinterface #101 <Method boolean List.isEmpty()>
	//*  74  173:ifne            186
	//*  75  176:aload_0         
	//*  76  177:aload_1         
	//*  77  178:aload_2         
	//*  78  179:aload           9
	//*  79  181:aload           6
	//*  80  183:invokevirtual   #105 <Method void processListItems(WorkerContext, Tag, List, HtmlCell)>
	//*  81  186:aload           11
	//*  82  188:instanceof      #94  <Class Chunk>
	//*  83  191:ifeq            311
	//*  84  194:getstatic       #109 <Field Chunk Chunk.NEWLINE>
	//*  85  197:invokevirtual   #112 <Method String Chunk.getContent()>
	//*  86  200:aload           11
	//*  87  202:checkcast       #94  <Class Chunk>
	//*  88  205:invokevirtual   #112 <Method String Chunk.getContent()>
	//*  89  208:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  90  211:ifeq            311
	//*  91  214:iload           5
	//*  92  216:istore          4
	//*  93  218:iload           5
	//*  94  220:aload_3         
	//*  95  221:invokeinterface #120 <Method int List.size()>
	//*  96  226:iconst_1        
	//*  97  227:isub            
	//*  98  228:icmpeq          114
	//*  99  231:aload_3         
	//* 100  232:iload           5
	//* 101  234:iconst_1        
	//* 102  235:iadd            
	//* 103  236:invokeinterface #124 <Method Object List.get(int)>
	//* 104  241:checkcast       #92  <Class Element>
	//* 105  244:astore          12
	//* 106  246:aload           8
	//* 107  248:invokeinterface #101 <Method boolean List.isEmpty()>
	//* 108  253:ifne            276
	//* 109  256:aload           12
	//* 110  258:instanceof      #94  <Class Chunk>
	//* 111  261:ifne            276
	//* 112  264:iload           5
	//* 113  266:istore          4
	//* 114  268:aload           12
	//* 115  270:instanceof      #96  <Class NoNewLineParagraph>
	//* 116  273:ifeq            114
	//* 117  276:aload           8
	//* 118  278:aload           11
	//* 119  280:invokeinterface #127 <Method boolean List.add(Object)>
	//* 120  285:pop             
	//* 121  286:iload           5
	//* 122  288:istore          4
	//* 123  290:goto            114
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//* 124  293:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//  125  294:new             #129 <Class RuntimeWorkerException>
	//  126  297:dup             
	//  127  298:invokestatic    #135 <Method LocaleMessages LocaleMessages.getInstance()>
	//  128  301:ldc1            #137 <String "customcontext.404">
	//  129  303:invokevirtual   #141 <Method String LocaleMessages.getMessage(String)>
	//  130  306:aload_1         
	//  131  307:invokespecial   #144 <Method void RuntimeWorkerException(String, Throwable)>
	//  132  310:athrow          
		}
		arraylist = new ArrayList(1);
		arraylist1 = new ArrayList();
		arraylist2 = new ArrayList();
		i = -1;
		iterator = list.iterator();
_L7:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
		element = (Element)iterator.next();
		j = i + 1;
		if(!(element instanceof Chunk) && !(element instanceof NoNewLineParagraph) && !(element instanceof LineSeparator)) goto _L2; else goto _L1
_L1:
		if(!((List) (arraylist2)).isEmpty())
			processListItems(workercontext, tag, ((List) (arraylist2)), htmlcell);
		if(!(element instanceof Chunk) || !Chunk.NEWLINE.getContent().equals(((Object) (((Chunk)element).getContent())))) goto _L4; else goto _L3
_L3:
		i = j;
		if(j == list.size() - 1)
			continue; /* Loop/switch isn't completed */
		element1 = (Element)list.get(j + 1);
		if(!((List) (arraylist1)).isEmpty() && !(element1 instanceof Chunk))
		{
			i = j;
			if(!(element1 instanceof NoNewLineParagraph))
				continue; /* Loop/switch isn't completed */
		}
_L5:
		((List) (arraylist1)).add(((Object) (element)));
		i = j;
		continue; /* Loop/switch isn't completed */
_L4:
		if(element instanceof LineSeparator)
	//* 133  311:aload           11
	//* 134  313:instanceof      #98  <Class LineSeparator>
	//* 135  316:ifeq            276
			try
			{
				com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext htmlpipelinecontext1 = getHtmlPipelineContext(workercontext);
	//  136  319:aload_0         
	//  137  320:aload_1         
	//  138  321:invokevirtual   #59  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//  139  324:astore          12
				((List) (arraylist1)).add(((Object) ((Chunk)getCssAppliers().apply(((Element) (new Chunk(Chunk.NEWLINE))), tag, htmlpipelinecontext1))));
	//  140  326:aload           8
	//  141  328:aload_0         
	//  142  329:invokevirtual   #63  <Method CssAppliers getCssAppliers()>
	//  143  332:new             #94  <Class Chunk>
	//  144  335:dup             
	//  145  336:getstatic       #109 <Field Chunk Chunk.NEWLINE>
	//  146  339:invokespecial   #147 <Method void Chunk(Chunk)>
	//  147  342:aload_2         
	//  148  343:aload           12
	//  149  345:invokeinterface #69  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//  150  350:checkcast       #94  <Class Chunk>
	//  151  353:invokeinterface #127 <Method boolean List.add(Object)>
	//  152  358:pop             
			}
	//* 153  359:goto            276
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//* 154  362:astore_1        
			{
				throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//  155  363:new             #129 <Class RuntimeWorkerException>
	//  156  366:dup             
	//  157  367:invokestatic    #135 <Method LocaleMessages LocaleMessages.getInstance()>
	//  158  370:ldc1            #137 <String "customcontext.404">
	//  159  372:invokevirtual   #141 <Method String LocaleMessages.getMessage(String)>
	//  160  375:aload_1         
	//  161  376:invokespecial   #144 <Method void RuntimeWorkerException(String, Throwable)>
	//  162  379:athrow          
			}
		if(true) goto _L5; else goto _L2
_L2:
		if(element instanceof ListItem)
	//* 163  380:aload           11
	//* 164  382:instanceof      #149 <Class ListItem>
	//* 165  385:ifeq            426
		{
			if(!((List) (arraylist1)).isEmpty())
	//* 166  388:aload           8
	//* 167  390:invokeinterface #101 <Method boolean List.isEmpty()>
	//* 168  395:ifne            406
				processChunkItems(((List) (arraylist1)), htmlcell);
	//  169  398:aload_0         
	//  170  399:aload           8
	//  171  401:aload           6
	//  172  403:invokevirtual   #153 <Method void processChunkItems(List, HtmlCell)>
			((List) (arraylist2)).add(((Object) ((ListItem)element)));
	//  173  406:aload           9
	//  174  408:aload           11
	//  175  410:checkcast       #149 <Class ListItem>
	//  176  413:invokeinterface #127 <Method boolean List.add(Object)>
	//  177  418:pop             
			i = j;
	//  178  419:iload           5
	//  179  421:istore          4
		} else
	//* 180  423:goto            114
		{
			if(!((List) (arraylist1)).isEmpty())
	//* 181  426:aload           8
	//* 182  428:invokeinterface #101 <Method boolean List.isEmpty()>
	//* 183  433:ifne            444
				processChunkItems(((List) (arraylist1)), htmlcell);
	//  184  436:aload_0         
	//  185  437:aload           8
	//  186  439:aload           6
	//  187  441:invokevirtual   #153 <Method void processChunkItems(List, HtmlCell)>
			if(!((List) (arraylist2)).isEmpty())
	//* 188  444:aload           9
	//* 189  446:invokeinterface #101 <Method boolean List.isEmpty()>
	//* 190  451:ifne            464
				processListItems(workercontext, tag, ((List) (arraylist2)), htmlcell);
	//  191  454:aload_0         
	//  192  455:aload_1         
	//  193  456:aload_2         
	//  194  457:aload           9
	//  195  459:aload           6
	//  196  461:invokevirtual   #105 <Method void processListItems(WorkerContext, Tag, List, HtmlCell)>
			if((element instanceof Paragraph) && ((Paragraph)element).getAlignment() == -1)
	//* 197  464:aload           11
	//* 198  466:instanceof      #155 <Class Paragraph>
	//* 199  469:ifeq            497
	//* 200  472:aload           11
	//* 201  474:checkcast       #155 <Class Paragraph>
	//* 202  477:invokevirtual   #158 <Method int Paragraph.getAlignment()>
	//* 203  480:iconst_m1       
	//* 204  481:icmpne          497
				((Paragraph)element).setAlignment(htmlcell.getHorizontalAlignment());
	//  205  484:aload           11
	//  206  486:checkcast       #155 <Class Paragraph>
	//  207  489:aload           6
	//  208  491:invokevirtual   #161 <Method int HtmlCell.getHorizontalAlignment()>
	//  209  494:invokevirtual   #164 <Method void Paragraph.setAlignment(int)>
			htmlcell.addElement(element);
	//  210  497:aload           6
	//  211  499:aload           11
	//  212  501:invokevirtual   #168 <Method void HtmlCell.addElement(Element)>
			i = j;
	//  213  504:iload           5
	//  214  506:istore          4
		}
		if(true) goto _L7; else goto _L6
	//  215  508:goto            114
_L6:
		if(!((List) (arraylist1)).isEmpty())
	//* 216  511:aload           8
	//* 217  513:invokeinterface #101 <Method boolean List.isEmpty()>
	//* 218  518:ifne            529
			processChunkItems(((List) (arraylist1)), htmlcell);
	//  219  521:aload_0         
	//  220  522:aload           8
	//  221  524:aload           6
	//  222  526:invokevirtual   #153 <Method void processChunkItems(List, HtmlCell)>
		((List) (arraylist)).add(((Object) (htmlcell)));
	//  223  529:aload           7
	//  224  531:aload           6
	//  225  533:invokeinterface #127 <Method boolean List.add(Object)>
	//  226  538:pop             
		return ((List) (arraylist));
	//  227  539:aload           7
	//  228  541:areturn         
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void processChunkItems(List list, HtmlCell htmlcell)
	{
		Paragraph paragraph = new Paragraph();
	//    0    0:new             #155 <Class Paragraph>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void Paragraph()>
	//    3    7:astore_3        
		paragraph.setMultipliedLeading(1.2F);
	//    4    8:aload_3         
	//    5    9:ldc1            #172 <Float 1.2F>
	//    6   11:invokevirtual   #176 <Method void Paragraph.setMultipliedLeading(float)>
		paragraph.addAll(((java.util.Collection) (list)));
	//    7   14:aload_3         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #180 <Method boolean Paragraph.addAll(java.util.Collection)>
	//   10   19:pop             
		paragraph.setAlignment(htmlcell.getHorizontalAlignment());
	//   11   20:aload_3         
	//   12   21:aload_2         
	//   13   22:invokevirtual   #161 <Method int HtmlCell.getHorizontalAlignment()>
	//   14   25:invokevirtual   #164 <Method void Paragraph.setAlignment(int)>
		if(paragraph.trim())
	//*  15   28:aload_3         
	//*  16   29:invokevirtual   #183 <Method boolean Paragraph.trim()>
	//*  17   32:ifeq            40
			htmlcell.addElement(((Element) (paragraph)));
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:invokevirtual   #168 <Method void HtmlCell.addElement(Element)>
		list.clear();
	//   21   40:aload_1         
	//   22   41:invokeinterface #186 <Method void List.clear()>
	//   23   46:return          
	}

	protected void processListItems(WorkerContext workercontext, Tag tag, List list, HtmlCell htmlcell)
	{
		com.itextpdf.text.List list1;
		try
		{
			list1 = new com.itextpdf.text.List();
	//    0    0:new             #189 <Class com.itextpdf.text.List>
	//    1    3:dup             
	//    2    4:invokespecial   #190 <Method void com.itextpdf.text.List()>
	//    3    7:astore          5
			list1.setAutoindent(false);
	//    4    9:aload           5
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #194 <Method void com.itextpdf.text.List.setAutoindent(boolean)>
			list1 = (com.itextpdf.text.List)getCssAppliers().apply(((Element) (list1)), tag, getHtmlPipelineContext(workercontext));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #63  <Method CssAppliers getCssAppliers()>
	//    9   19:aload           5
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #59  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   14   27:invokeinterface #69  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   15   32:checkcast       #189 <Class com.itextpdf.text.List>
	//   16   35:astore          5
			list1.setIndentationLeft(0.0F);
	//   17   37:aload           5
	//   18   39:fconst_0        
	//   19   40:invokevirtual   #197 <Method void com.itextpdf.text.List.setIndentationLeft(float)>
			ListItem listitem;
			for(Iterator iterator = list.iterator(); iterator.hasNext(); list1.add(((Element) (listitem))))
	//*  20   43:aload_3         
	//*  21   44:invokeinterface #80  <Method Iterator List.iterator()>
	//*  22   49:astore          6
	//*  23   51:aload           6
	//*  24   53:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  25   58:ifeq            143
			{
				listitem = (ListItem)iterator.next();
	//   26   61:aload           6
	//   27   63:invokeinterface #90  <Method Object Iterator.next()>
	//   28   68:checkcast       #149 <Class ListItem>
	//   29   71:astore          7
				listitem = (ListItem)getCssAppliers().apply(((Element) (listitem)), tag, getHtmlPipelineContext(workercontext));
	//   30   73:aload_0         
	//   31   74:invokevirtual   #63  <Method CssAppliers getCssAppliers()>
	//   32   77:aload           7
	//   33   79:aload_2         
	//   34   80:aload_0         
	//   35   81:aload_1         
	//   36   82:invokevirtual   #59  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   37   85:invokeinterface #69  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   38   90:checkcast       #149 <Class ListItem>
	//   39   93:astore          7
				listitem.setSpacingAfter(0.0F);
	//   40   95:aload           7
	//   41   97:fconst_0        
	//   42   98:invokevirtual   #200 <Method void ListItem.setSpacingAfter(float)>
				listitem.setSpacingBefore(0.0F);
	//   43  101:aload           7
	//   44  103:fconst_0        
	//   45  104:invokevirtual   #203 <Method void ListItem.setSpacingBefore(float)>
				listitem.setMultipliedLeading(1.2F);
	//   46  107:aload           7
	//   47  109:ldc1            #172 <Float 1.2F>
	//   48  111:invokevirtual   #204 <Method void ListItem.setMultipliedLeading(float)>
			}

	//   49  114:aload           5
	//   50  116:aload           7
	//   51  118:invokevirtual   #207 <Method boolean com.itextpdf.text.List.add(Element)>
	//   52  121:pop             
		}
	//*  53  122:goto            51
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  54  125:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   55  126:new             #129 <Class RuntimeWorkerException>
	//   56  129:dup             
	//   57  130:invokestatic    #135 <Method LocaleMessages LocaleMessages.getInstance()>
	//   58  133:ldc1            #137 <String "customcontext.404">
	//   59  135:invokevirtual   #141 <Method String LocaleMessages.getMessage(String)>
	//   60  138:aload_1         
	//   61  139:invokespecial   #144 <Method void RuntimeWorkerException(String, Throwable)>
	//   62  142:athrow          
		}
		htmlcell.addElement(((Element) (list1)));
	//   63  143:aload           4
	//   64  145:aload           5
	//   65  147:invokevirtual   #168 <Method void HtmlCell.addElement(Element)>
		list.clear();
	//   66  150:aload_3         
	//   67  151:invokeinterface #186 <Method void List.clear()>
		return;
	//   68  156:return          
	}
}
