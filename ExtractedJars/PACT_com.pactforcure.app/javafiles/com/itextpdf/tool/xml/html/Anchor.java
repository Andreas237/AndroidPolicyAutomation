// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.log.*;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import com.itextpdf.tool.xml.pipeline.html.LinkProvider;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class Anchor extends AbstractTagProcessor
{

	public Anchor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return textContent(workercontext, tag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #27  <Method List textContent(WorkerContext, Tag, String)>
	//    5    7:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		Object obj;
		final String name;
		ArrayList arraylist;
		NoNewLineParagraph nonewlineparagraph;
		Iterator iterator;
		name = (String)tag.getAttributes().get("name");
	//    0    0:aload_2         
	//    1    1:invokevirtual   #39  <Method Map Tag.getAttributes()>
	//    2    4:ldc1            #41  <String "name">
	//    3    6:invokeinterface #47  <Method Object Map.get(Object)>
	//    4   11:checkcast       #49  <Class String>
	//    5   14:astore          6
		arraylist = new ArrayList(0);
	//    6   16:new             #51  <Class ArrayList>
	//    7   19:dup             
	//    8   20:iconst_0        
	//    9   21:invokespecial   #54  <Method void ArrayList(int)>
	//   10   24:astore          7
		if(list.size() <= 0)
			break MISSING_BLOCK_LABEL_468;
	//   11   26:aload_3         
	//   12   27:invokeinterface #60  <Method int List.size()>
	//   13   32:ifle            468
		nonewlineparagraph = new NoNewLineParagraph();
	//   14   35:new             #62  <Class NoNewLineParagraph>
	//   15   38:dup             
	//   16   39:invokespecial   #63  <Method void NoNewLineParagraph()>
	//   17   42:astore          8
		obj = ((Object) ((String)tag.getAttributes().get("href")));
	//   18   44:aload_2         
	//   19   45:invokevirtual   #39  <Method Map Tag.getAttributes()>
	//   20   48:ldc1            #65  <String "href">
	//   21   50:invokeinterface #47  <Method Object Map.get(Object)>
	//   22   55:checkcast       #49  <Class String>
	//   23   58:astore          4
		iterator = list.iterator();
	//   24   60:aload_3         
	//   25   61:invokeinterface #69  <Method Iterator List.iterator()>
	//   26   66:astore          9
		list = ((List) (obj));
	//   27   68:aload           4
	//   28   70:astore_3        
_L7:
		Element element;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_440;
	//   29   71:aload           9
	//   30   73:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//   31   78:ifeq            440
		element = (Element)iterator.next();
	//   32   81:aload           9
	//   33   83:invokeinterface #79  <Method Object Iterator.next()>
	//   34   88:checkcast       #81  <Class Element>
	//   35   91:astore          10
		obj = ((Object) (list));
	//   36   93:aload_3         
	//   37   94:astore          4
		if(!(element instanceof Chunk)) goto _L2; else goto _L1
	//   38   96:aload           10
	//   39   98:instanceof      #83  <Class Chunk>
	//   40  101:ifeq            178
_L1:
		if(list == null) goto _L4; else goto _L3
	//   41  104:aload_3         
	//   42  105:ifnull          370
_L3:
		if(!((String) (list)).startsWith("#")) goto _L6; else goto _L5
	//   43  108:aload_3         
	//   44  109:ldc1            #85  <String "#">
	//   45  111:invokevirtual   #89  <Method boolean String.startsWith(String)>
	//   46  114:ifeq            210
_L5:
		if(LOGGER.isLogging(Level.TRACE))
	//*  47  117:getstatic       #18  <Field Logger LOGGER>
	//*  48  120:getstatic       #95  <Field Level Level.TRACE>
	//*  49  123:invokeinterface #101 <Method boolean Logger.isLogging(Level)>
	//*  50  128:ifeq            158
			LOGGER.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.a.local"), new Object[] {
				list
			}));
	//   51  131:getstatic       #18  <Field Logger LOGGER>
	//   52  134:invokestatic    #107 <Method LocaleMessages LocaleMessages.getInstance()>
	//   53  137:ldc1            #109 <String "html.tag.a.local">
	//   54  139:invokevirtual   #113 <Method String LocaleMessages.getMessage(String)>
	//   55  142:iconst_1        
	//   56  143:anewarray       Object[]
	//   57  146:dup             
	//   58  147:iconst_0        
	//   59  148:aload_3         
	//   60  149:aastore         
	//   61  150:invokestatic    #119 <Method String String.format(String, Object[])>
	//   62  153:invokeinterface #123 <Method void Logger.trace(String)>
		((Chunk)element).setLocalGoto(((String) (list)).replaceFirst("#", ""));
	//   63  158:aload           10
	//   64  160:checkcast       #83  <Class Chunk>
	//   65  163:aload_3         
	//   66  164:ldc1            #85  <String "#">
	//   67  166:ldc1            #125 <String "">
	//   68  168:invokevirtual   #129 <Method String String.replaceFirst(String, String)>
	//   69  171:invokevirtual   #133 <Method Chunk Chunk.setLocalGoto(String)>
	//   70  174:pop             
		obj = ((Object) (list));
	//   71  175:aload_3         
	//   72  176:astore          4
_L2:
		try
		{
			nonewlineparagraph.add(element);
	//   73  178:aload           8
	//   74  180:aload           10
	//   75  182:invokevirtual   #137 <Method boolean NoNewLineParagraph.add(Element)>
	//   76  185:pop             
		}
	//*  77  186:aload           4
	//*  78  188:astore_3        
	//*  79  189:goto            71
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  80  192:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   81  193:new             #139 <Class RuntimeWorkerException>
	//   82  196:dup             
	//   83  197:invokestatic    #107 <Method LocaleMessages LocaleMessages.getInstance()>
	//   84  200:ldc1            #141 <String "customcontext.404">
	//   85  202:invokevirtual   #113 <Method String LocaleMessages.getMessage(String)>
	//   86  205:aload_1         
	//   87  206:invokespecial   #144 <Method void RuntimeWorkerException(String, Throwable)>
	//   88  209:athrow          
		}
		list = ((List) (obj));
		  goto _L7
_L6:
		obj = ((Object) (list));
	//   89  210:aload_3         
	//   90  211:astore          4
		if(getHtmlPipelineContext(workercontext).getLinkProvider() == null)
			break MISSING_BLOCK_LABEL_314;
	//   91  213:aload_0         
	//   92  214:aload_1         
	//   93  215:invokevirtual   #148 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   94  218:invokevirtual   #154 <Method LinkProvider HtmlPipelineContext.getLinkProvider()>
	//   95  221:ifnull          314
		obj = ((Object) (list));
	//   96  224:aload_3         
	//   97  225:astore          4
		String s;
		if(((String) (list)).startsWith("http"))
			break MISSING_BLOCK_LABEL_314;
	//   98  227:aload_3         
	//   99  228:ldc1            #156 <String "http">
	//  100  230:invokevirtual   #89  <Method boolean String.startsWith(String)>
	//  101  233:ifne            314
		s = getHtmlPipelineContext(workercontext).getLinkProvider().getLinkRoot();
	//  102  236:aload_0         
	//  103  237:aload_1         
	//  104  238:invokevirtual   #148 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//  105  241:invokevirtual   #154 <Method LinkProvider HtmlPipelineContext.getLinkProvider()>
	//  106  244:invokeinterface #162 <Method String LinkProvider.getLinkRoot()>
	//  107  249:astore          5
		obj = ((Object) (s));
	//  108  251:aload           5
	//  109  253:astore          4
		if(!s.endsWith("/"))
			break MISSING_BLOCK_LABEL_293;
	//  110  255:aload           5
	//  111  257:ldc1            #164 <String "/">
	//  112  259:invokevirtual   #167 <Method boolean String.endsWith(String)>
	//  113  262:ifeq            293
		obj = ((Object) (s));
	//  114  265:aload           5
	//  115  267:astore          4
		if(((String) (list)).startsWith("/"))
	//* 116  269:aload_3         
	//* 117  270:ldc1            #164 <String "/">
	//* 118  272:invokevirtual   #89  <Method boolean String.startsWith(String)>
	//* 119  275:ifeq            293
			obj = ((Object) (s.substring(0, s.length() - 1)));
	//  120  278:aload           5
	//  121  280:iconst_0        
	//  122  281:aload           5
	//  123  283:invokevirtual   #170 <Method int String.length()>
	//  124  286:iconst_1        
	//  125  287:isub            
	//  126  288:invokevirtual   #174 <Method String String.substring(int, int)>
	//  127  291:astore          4
		obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(((String) (list))).toString()));
	//  128  293:new             #176 <Class StringBuilder>
	//  129  296:dup             
	//  130  297:invokespecial   #177 <Method void StringBuilder()>
	//  131  300:aload           4
	//  132  302:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//  133  305:aload_3         
	//  134  306:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//  135  309:invokevirtual   #184 <Method String StringBuilder.toString()>
	//  136  312:astore          4
		if(LOGGER.isLogging(Level.TRACE))
	//* 137  314:getstatic       #18  <Field Logger LOGGER>
	//* 138  317:getstatic       #95  <Field Level Level.TRACE>
	//* 139  320:invokeinterface #101 <Method boolean Logger.isLogging(Level)>
	//* 140  325:ifeq            356
			LOGGER.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.a.external"), new Object[] {
				obj
			}));
	//  141  328:getstatic       #18  <Field Logger LOGGER>
	//  142  331:invokestatic    #107 <Method LocaleMessages LocaleMessages.getInstance()>
	//  143  334:ldc1            #186 <String "html.tag.a.external">
	//  144  336:invokevirtual   #113 <Method String LocaleMessages.getMessage(String)>
	//  145  339:iconst_1        
	//  146  340:anewarray       Object[]
	//  147  343:dup             
	//  148  344:iconst_0        
	//  149  345:aload           4
	//  150  347:aastore         
	//  151  348:invokestatic    #119 <Method String String.format(String, Object[])>
	//  152  351:invokeinterface #123 <Method void Logger.trace(String)>
		((Chunk)element).setAnchor(((String) (obj)));
	//  153  356:aload           10
	//  154  358:checkcast       #83  <Class Chunk>
	//  155  361:aload           4
	//  156  363:invokevirtual   #189 <Method Chunk Chunk.setAnchor(String)>
	//  157  366:pop             
		  goto _L2
	//* 158  367:goto            178
_L4:
		obj = ((Object) (list));
	//  159  370:aload_3         
	//  160  371:astore          4
		if(name == null) goto _L2; else goto _L8
	//  161  373:aload           6
	//  162  375:ifnull          178
_L8:
		((Chunk)element).setLocalDestination(name);
	//  163  378:aload           10
	//  164  380:checkcast       #83  <Class Chunk>
	//  165  383:aload           6
	//  166  385:invokevirtual   #192 <Method Chunk Chunk.setLocalDestination(String)>
	//  167  388:pop             
		obj = ((Object) (list));
	//  168  389:aload_3         
	//  169  390:astore          4
		if(!LOGGER.isLogging(Level.TRACE)) goto _L2; else goto _L9
	//  170  392:getstatic       #18  <Field Logger LOGGER>
	//  171  395:getstatic       #95  <Field Level Level.TRACE>
	//  172  398:invokeinterface #101 <Method boolean Logger.isLogging(Level)>
	//  173  403:ifeq            178
_L9:
		LOGGER.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.a.setlocal"), new Object[] {
			name
		}));
	//  174  406:getstatic       #18  <Field Logger LOGGER>
	//  175  409:invokestatic    #107 <Method LocaleMessages LocaleMessages.getInstance()>
	//  176  412:ldc1            #194 <String "html.tag.a.setlocal">
	//  177  414:invokevirtual   #113 <Method String LocaleMessages.getMessage(String)>
	//  178  417:iconst_1        
	//  179  418:anewarray       Object[]
	//  180  421:dup             
	//  181  422:iconst_0        
	//  182  423:aload           6
	//  183  425:aastore         
	//  184  426:invokestatic    #119 <Method String String.format(String, Object[])>
	//  185  429:invokeinterface #123 <Method void Logger.trace(String)>
		obj = ((Object) (list));
	//  186  434:aload_3         
	//  187  435:astore          4
		  goto _L2
	//* 188  437:goto            178
		((List) (arraylist)).add(((Object) (getCssAppliers().apply(((Element) (nonewlineparagraph)), tag, getHtmlPipelineContext(workercontext)))));
	//  189  440:aload           7
	//  190  442:aload_0         
	//  191  443:invokevirtual   #198 <Method CssAppliers getCssAppliers()>
	//  192  446:aload           8
	//  193  448:aload_2         
	//  194  449:aload_0         
	//  195  450:aload_1         
	//  196  451:invokevirtual   #148 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//  197  454:invokeinterface #204 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//  198  459:invokeinterface #207 <Method boolean List.add(Object)>
	//  199  464:pop             
		return ((List) (arraylist));
	//  200  465:aload           7
	//  201  467:areturn         
		if(name == null)
			break MISSING_BLOCK_LABEL_533;
	//  202  468:aload           6
	//  203  470:ifnull          533
		if(LOGGER.isLogging(Level.TRACE))
	//* 204  473:getstatic       #18  <Field Logger LOGGER>
	//* 205  476:getstatic       #95  <Field Level Level.TRACE>
	//* 206  479:invokeinterface #101 <Method boolean Logger.isLogging(Level)>
	//* 207  484:ifeq            515
			LOGGER.trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.a.spacehack"), new Object[] {
				name
			}));
	//  208  487:getstatic       #18  <Field Logger LOGGER>
	//  209  490:invokestatic    #107 <Method LocaleMessages LocaleMessages.getInstance()>
	//  210  493:ldc1            #209 <String "html.tag.a.spacehack">
	//  211  495:invokevirtual   #113 <Method String LocaleMessages.getMessage(String)>
	//  212  498:iconst_1        
	//  213  499:anewarray       Object[]
	//  214  502:dup             
	//  215  503:iconst_0        
	//  216  504:aload           6
	//  217  506:aastore         
	//  218  507:invokestatic    #119 <Method String String.format(String, Object[])>
	//  219  510:invokeinterface #123 <Method void Logger.trace(String)>
		((List) (arraylist)).add(((Object) (new WritableDirectElement() {

			public void write(PdfWriter pdfwriter, Document document)
				throws DocumentException
			{
				document = ((Document) (new ColumnText(pdfwriter.getDirectContent())));
			//    0    0:new             #29  <Class ColumnText>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #35  <Method com.itextpdf.text.pdf.PdfContentByte PdfWriter.getDirectContent()>
			//    4    8:invokespecial   #38  <Method void ColumnText(com.itextpdf.text.pdf.PdfContentByte)>
			//    5   11:astore_2        
				float f = pdfwriter.getVerticalPosition(false);
			//    6   12:aload_1         
			//    7   13:iconst_0        
			//    8   14:invokevirtual   #42  <Method float PdfWriter.getVerticalPosition(boolean)>
			//    9   17:fstore_3        
				((ColumnText) (document)).setSimpleColumn(new Phrase((new Chunk(" ")).setLocalDestination(name)), 1.0F, f - 5F, 6F, f, 5F, 0);
			//   10   18:aload_2         
			//   11   19:new             #44  <Class Phrase>
			//   12   22:dup             
			//   13   23:new             #46  <Class Chunk>
			//   14   26:dup             
			//   15   27:ldc1            #48  <String " ">
			//   16   29:invokespecial   #51  <Method void Chunk(String)>
			//   17   32:aload_0         
			//   18   33:getfield        #19  <Field String val$name>
			//   19   36:invokevirtual   #55  <Method Chunk Chunk.setLocalDestination(String)>
			//   20   39:invokespecial   #58  <Method void Phrase(Chunk)>
			//   21   42:fconst_1        
			//   22   43:fload_3         
			//   23   44:ldc1            #59  <Float 5F>
			//   24   46:fsub            
			//   25   47:ldc1            #60  <Float 6F>
			//   26   49:fload_3         
			//   27   50:ldc1            #59  <Float 5F>
			//   28   52:iconst_0        
			//   29   53:invokevirtual   #64  <Method void ColumnText.setSimpleColumn(Phrase, float, float, float, float, float, int)>
				try
				{
					((ColumnText) (document)).go();
			//   30   56:aload_2         
			//   31   57:invokevirtual   #68  <Method int ColumnText.go()>
			//   32   60:pop             
					return;
			//   33   61:return          
				}
				// Misplaced declaration of an exception variable
				catch(PdfWriter pdfwriter)
			//*  34   62:astore_1        
				{
					throw new RuntimeWorkerException(((Throwable) (pdfwriter)));
			//   35   63:new             #70  <Class RuntimeWorkerException>
			//   36   66:dup             
			//   37   67:aload_1         
			//   38   68:invokespecial   #73  <Method void RuntimeWorkerException(Throwable)>
			//   39   71:athrow          
				}
			}

			final Anchor this$0;
			final String val$name;

			
			{
				this$0 = Anchor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Anchor this$0>
				name = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field String val$name>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void WritableDirectElement()>
			//    8   14:return          
			}
		}
)));
	//  220  515:aload           7
	//  221  517:new             #6   <Class Anchor$1>
	//  222  520:dup             
	//  223  521:aload_0         
	//  224  522:aload           6
	//  225  524:invokespecial   #212 <Method void Anchor$1(Anchor, String)>
	//  226  527:invokeinterface #207 <Method boolean List.add(Object)>
	//  227  532:pop             
		return ((List) (arraylist));
	//  228  533:aload           7
	//  229  535:areturn         
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/tool/xml/html/Anchor);

	static 
	{
	//    0    0:ldc1            #2   <Class Anchor>
	//    1    2:invokestatic    #16  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #18  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
