// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.api.Indentable;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.css.FontSizeTranslator;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.ctx.ObjectContext;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import com.itextpdf.tool.xml.util.ParentTreeUtil;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			TagProcessor, CssAppliersAware, CssAppliers, HTMLUtils

public abstract class AbstractTagProcessor
	implements TagProcessor, CssAppliersAware
{

	public AbstractTagProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		ignoreDirAttribute = ((Set) (new HashSet() {

			final AbstractTagProcessor this$0;

			
			{
				this$0 = AbstractTagProcessor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field AbstractTagProcessor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void HashSet()>
				add("p");
			//    5    9:aload_0         
			//    6   10:ldc1            #18  <String "p">
			//    7   12:invokevirtual   #22  <Method boolean add(Object)>
			//    8   15:pop             
				add("span");
			//    9   16:aload_0         
			//   10   17:ldc1            #24  <String "span">
			//   11   19:invokevirtual   #22  <Method boolean add(Object)>
			//   12   22:pop             
			//   13   23:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #10  <Class AbstractTagProcessor$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #27  <Method void AbstractTagProcessor$1(AbstractTagProcessor)>
	//    7   13:putfield        #29  <Field Set ignoreDirAttribute>
	//    8   16:aload_0         
	//    9   17:invokestatic    #35  <Method FontSizeTranslator FontSizeTranslator.getInstance()>
	//   10   20:putfield        #37  <Field FontSizeTranslator fontsizeTrans>
	//   11   23:return          
	}

	private String getParentDirection()
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Iterator iterator = tree.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field List tree>
	//    4    6:invokeinterface #48  <Method Iterator List.iterator()>
	//    5   11:astore_3        
		do
		{
			Tag tag;
label0:
			{
				String s1 = s;
	//    6   12:aload_1         
	//    7   13:astore_2        
				if(iterator.hasNext())
	//*   8   14:aload_3         
	//*   9   15:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            74
				{
					tag = (Tag)iterator.next();
	//   11   23:aload_3         
	//   12   24:invokeinterface #58  <Method Object Iterator.next()>
	//   13   29:checkcast       #60  <Class Tag>
	//   14   32:astore          4
					if(ignoreDirAttribute.contains(((Object) (tag.getName().toLowerCase()))))
						continue;
	//   15   34:aload_0         
	//   16   35:getfield        #29  <Field Set ignoreDirAttribute>
	//   17   38:aload           4
	//   18   40:invokevirtual   #63  <Method String Tag.getName()>
	//   19   43:invokevirtual   #68  <Method String String.toLowerCase()>
	//   20   46:invokeinterface #74  <Method boolean Set.contains(Object)>
	//   21   51:ifne            12
					s1 = (String)tag.getAttributes().get("dir");
	//   22   54:aload           4
	//   23   56:invokevirtual   #78  <Method Map Tag.getAttributes()>
	//   24   59:ldc1            #80  <String "dir">
	//   25   61:invokeinterface #86  <Method Object Map.get(Object)>
	//   26   66:checkcast       #65  <Class String>
	//   27   69:astore_2        
					if(s1 == null)
						break label0;
	//   28   70:aload_2         
	//   29   71:ifnull          76
				}
				return s1;
	//   30   74:aload_2         
	//   31   75:areturn         
			}
			String s2 = (String)tag.getCSS().get("direction");
	//   32   76:aload           4
	//   33   78:invokevirtual   #89  <Method Map Tag.getCSS()>
	//   34   81:ldc1            #91  <String "direction">
	//   35   83:invokeinterface #86  <Method Object Map.get(Object)>
	//   36   88:checkcast       #65  <Class String>
	//   37   91:astore_2        
			s = s2;
	//   38   92:aload_2         
	//   39   93:astore_1        
			if(s2 != null)
	//*  40   94:aload_2         
	//*  41   95:ifnull          12
				return s2;
	//   42   98:aload_2         
	//   43   99:areturn         
		} while(true);
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #95  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #98  <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	protected Paragraph createParagraph()
	{
		return new Paragraph((0.0F / 0.0F));
	//    0    0:new             #104 <Class Paragraph>
	//    1    3:dup             
	//    2    4:ldc1            #105 <Float (0.0F / 0.0F)>
	//    3    6:invokespecial   #108 <Method void Paragraph(float)>
	//    4    9:areturn         
	}

	public final List currentContentToParagraph(List list, boolean flag)
	{
		return currentContentToParagraph(list, flag, false, ((Tag) (null)), ((WorkerContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #113 <Method List currentContentToParagraph(List, boolean, boolean, Tag, WorkerContext)>
	//    7    9:areturn         
	}

	public List currentContentToParagraph(List list, boolean flag, boolean flag1, Tag tag, WorkerContext workercontext)
	{
		int i;
		ArrayList arraylist;
		i = getRunDirection(tag);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokevirtual   #120 <Method int getRunDirection(Tag)>
	//    3    6:istore          6
		arraylist = new ArrayList();
	//    4    8:new             #95  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #121 <Method void ArrayList()>
	//    7   15:astore          8
		if(list.size() <= 0)
			break MISSING_BLOCK_LABEL_345;
	//    8   17:aload_1         
	//    9   18:invokeinterface #125 <Method int List.size()>
	//   10   23:ifle            345
		if(!flag)
			break MISSING_BLOCK_LABEL_233;
	//   11   26:iload_2         
	//   12   27:ifeq            233
		Object obj;
		obj = ((Object) (createParagraph()));
	//   13   30:aload_0         
	//   14   31:invokevirtual   #127 <Method Paragraph createParagraph()>
	//   15   34:astore          7
		((Paragraph) (obj)).setMultipliedLeading(1.2F);
	//   16   36:aload           7
	//   17   38:ldc1            #128 <Float 1.2F>
	//   18   40:invokevirtual   #131 <Method void Paragraph.setMultipliedLeading(float)>
		list = ((List) (list.iterator()));
	//   19   43:aload_1         
	//   20   44:invokeinterface #48  <Method Iterator List.iterator()>
	//   21   49:astore_1        
_L1:
		Element element;
		if(!((Iterator) (list)).hasNext())
			break MISSING_BLOCK_LABEL_167;
	//   22   50:aload_1         
	//   23   51:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   24   56:ifeq            167
		element = (Element)((Iterator) (list)).next();
	//   25   59:aload_1         
	//   26   60:invokeinterface #58  <Method Object Iterator.next()>
	//   27   65:checkcast       #133 <Class Element>
	//   28   68:astore          9
		flag = element instanceof LineSeparator;
	//   29   70:aload           9
	//   30   72:instanceof      #135 <Class LineSeparator>
	//   31   75:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_120;
	//   32   76:iload_2         
	//   33   77:ifeq            120
		HtmlPipelineContext htmlpipelinecontext = getHtmlPipelineContext(workercontext);
	//   34   80:aload_0         
	//   35   81:aload           5
	//   36   83:invokevirtual   #139 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   37   86:astore          10
		((Paragraph) (obj)).add(((Element) ((Chunk)getCssAppliers().apply(((Element) (new Chunk(Chunk.NEWLINE))), tag, htmlpipelinecontext))));
	//   38   88:aload           7
	//   39   90:aload_0         
	//   40   91:invokevirtual   #143 <Method CssAppliers getCssAppliers()>
	//   41   94:new             #145 <Class Chunk>
	//   42   97:dup             
	//   43   98:getstatic       #149 <Field Chunk Chunk.NEWLINE>
	//   44  101:invokespecial   #152 <Method void Chunk(Chunk)>
	//   45  104:aload           4
	//   46  106:aload           10
	//   47  108:invokeinterface #158 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//   48  113:checkcast       #145 <Class Chunk>
	//   49  116:invokevirtual   #162 <Method boolean Paragraph.add(Element)>
	//   50  119:pop             
		try
		{
			((Paragraph) (obj)).add(element);
	//   51  120:aload           7
	//   52  122:aload           9
	//   53  124:invokevirtual   #162 <Method boolean Paragraph.add(Element)>
	//   54  127:pop             
		}
	//*  55  128:goto            50
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  56  131:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (list)));
	//   57  132:new             #164 <Class RuntimeWorkerException>
	//   58  135:dup             
	//   59  136:invokestatic    #169 <Method LocaleMessages LocaleMessages.getInstance()>
	//   60  139:ldc1            #171 <String "customcontext.404">
	//   61  141:invokevirtual   #175 <Method String LocaleMessages.getMessage(String)>
	//   62  144:aload_1         
	//   63  145:invokespecial   #178 <Method void RuntimeWorkerException(String, Throwable)>
	//   64  148:athrow          
		}
		  goto _L1
		list;
	//   65  149:astore_1        
		throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (list)));
	//   66  150:new             #164 <Class RuntimeWorkerException>
	//   67  153:dup             
	//   68  154:invokestatic    #169 <Method LocaleMessages LocaleMessages.getInstance()>
	//   69  157:ldc1            #171 <String "customcontext.404">
	//   70  159:invokevirtual   #175 <Method String LocaleMessages.getMessage(String)>
	//   71  162:aload_1         
	//   72  163:invokespecial   #178 <Method void RuntimeWorkerException(String, Throwable)>
	//   73  166:athrow          
		if(!((Paragraph) (obj)).trim())
			break MISSING_BLOCK_LABEL_345;
	//   74  167:aload           7
	//   75  169:invokevirtual   #181 <Method boolean Paragraph.trim()>
	//   76  172:ifeq            345
		list = ((List) (obj));
	//   77  175:aload           7
	//   78  177:astore_1        
		if(!flag1)
			break MISSING_BLOCK_LABEL_205;
	//   79  178:iload_3         
	//   80  179:ifeq            205
		list = ((List) ((Paragraph)getCssAppliers().apply(((Element) (obj)), tag, getHtmlPipelineContext(workercontext))));
	//   81  182:aload_0         
	//   82  183:invokevirtual   #143 <Method CssAppliers getCssAppliers()>
	//   83  186:aload           7
	//   84  188:aload           4
	//   85  190:aload_0         
	//   86  191:aload           5
	//   87  193:invokevirtual   #139 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   88  196:invokeinterface #158 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//   89  201:checkcast       #104 <Class Paragraph>
	//   90  204:astore_1        
		if(i != 3)
			break MISSING_BLOCK_LABEL_221;
	//   91  205:iload           6
	//   92  207:iconst_3        
	//   93  208:icmpne          221
		doRtlIndentCorrections(((Indentable) (list)));
	//   94  211:aload_0         
	//   95  212:aload_1         
	//   96  213:invokevirtual   #185 <Method void doRtlIndentCorrections(Indentable)>
		invertTextAlignForParagraph(((Paragraph) (list)));
	//   97  216:aload_0         
	//   98  217:aload_1         
	//   99  218:invokevirtual   #189 <Method void invertTextAlignForParagraph(Paragraph)>
		((List) (arraylist)).add(((Object) (list)));
	//  100  221:aload           8
	//  101  223:aload_1         
	//  102  224:invokeinterface #191 <Method boolean List.add(Object)>
	//  103  229:pop             
		return ((List) (arraylist));
	//  104  230:aload           8
	//  105  232:areturn         
		obj = ((Object) (new NoNewLineParagraph((0.0F / 0.0F))));
	//  106  233:new             #193 <Class NoNewLineParagraph>
	//  107  236:dup             
	//  108  237:ldc1            #105 <Float (0.0F / 0.0F)>
	//  109  239:invokespecial   #194 <Method void NoNewLineParagraph(float)>
	//  110  242:astore          7
		((NoNewLineParagraph) (obj)).setMultipliedLeading(1.2F);
	//  111  244:aload           7
	//  112  246:ldc1            #128 <Float 1.2F>
	//  113  248:invokevirtual   #195 <Method void NoNewLineParagraph.setMultipliedLeading(float)>
		Element element1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((NoNewLineParagraph) (obj)).add(element1))
	//* 114  251:aload_1         
	//* 115  252:invokeinterface #48  <Method Iterator List.iterator()>
	//* 116  257:astore_1        
	//* 117  258:aload_1         
	//* 118  259:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//* 119  264:ifeq            297
		{
			element1 = (Element)((Iterator) (list)).next();
	//  120  267:aload_1         
	//  121  268:invokeinterface #58  <Method Object Iterator.next()>
	//  122  273:checkcast       #133 <Class Element>
	//  123  276:astore          9
			updateParagraphFontIfNeeded(((Phrase) (obj)), element1);
	//  124  278:aload_0         
	//  125  279:aload           7
	//  126  281:aload           9
	//  127  283:invokevirtual   #199 <Method void updateParagraphFontIfNeeded(Phrase, Element)>
		}

	//  128  286:aload           7
	//  129  288:aload           9
	//  130  290:invokevirtual   #200 <Method boolean NoNewLineParagraph.add(Element)>
	//  131  293:pop             
	//* 132  294:goto            258
		list = ((List) ((NoNewLineParagraph)getCssAppliers().apply(((Element) (obj)), tag, getHtmlPipelineContext(workercontext))));
	//  133  297:aload_0         
	//  134  298:invokevirtual   #143 <Method CssAppliers getCssAppliers()>
	//  135  301:aload           7
	//  136  303:aload           4
	//  137  305:aload_0         
	//  138  306:aload           5
	//  139  308:invokevirtual   #139 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//  140  311:invokeinterface #158 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//  141  316:checkcast       #193 <Class NoNewLineParagraph>
	//  142  319:astore_1        
		if(i != 3)
			break MISSING_BLOCK_LABEL_336;
	//  143  320:iload           6
	//  144  322:iconst_3        
	//  145  323:icmpne          336
		doRtlIndentCorrections(((Indentable) (list)));
	//  146  326:aload_0         
	//  147  327:aload_1         
	//  148  328:invokevirtual   #185 <Method void doRtlIndentCorrections(Indentable)>
		invertTextAlignForParagraph(((NoNewLineParagraph) (list)));
	//  149  331:aload_0         
	//  150  332:aload_1         
	//  151  333:invokevirtual   #203 <Method void invertTextAlignForParagraph(NoNewLineParagraph)>
		((List) (arraylist)).add(((Object) (list)));
	//  152  336:aload           8
	//  153  338:aload_1         
	//  154  339:invokeinterface #191 <Method boolean List.add(Object)>
	//  155  344:pop             
		return ((List) (arraylist));
	//  156  345:aload           8
	//  157  347:areturn         
	}

	protected void doRtlIndentCorrections(Indentable indentable)
	{
		float f = indentable.getIndentationRight();
	//    0    0:aload_1         
	//    1    1:invokeinterface #210 <Method float Indentable.getIndentationRight()>
	//    2    6:fstore_2        
		indentable.setIndentationRight(indentable.getIndentationLeft());
	//    3    7:aload_1         
	//    4    8:aload_1         
	//    5    9:invokeinterface #213 <Method float Indentable.getIndentationLeft()>
	//    6   14:invokeinterface #216 <Method void Indentable.setIndentationRight(float)>
		indentable.setIndentationLeft(f);
	//    7   19:aload_1         
	//    8   20:fload_2         
	//    9   21:invokeinterface #219 <Method void Indentable.setIndentationLeft(float)>
	//   10   26:return          
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		return ((List) (new ArrayList(((java.util.Collection) (list)))));
	//    0    0:new             #95  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #224 <Method void ArrayList(java.util.Collection)>
	//    4    8:areturn         
	}

	public final List endElement(WorkerContext workercontext, Tag tag, List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #95  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void ArrayList()>
	//    3    7:astore          4
		if(!list.isEmpty()) goto _L2; else goto _L1
	//    4    9:aload_3         
	//    5   10:invokeinterface #229 <Method boolean List.isEmpty()>
	//    6   15:ifeq            66
_L1:
		list = end(workercontext, tag, list);
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:invokevirtual   #231 <Method List end(WorkerContext, Tag, List)>
	//   12   25:astore_3        
_L4:
		workercontext = ((WorkerContext) ((String)tag.getCSS().get("page-break-after")));
	//   13   26:aload_2         
	//   14   27:invokevirtual   #89  <Method Map Tag.getCSS()>
	//   15   30:ldc1            #233 <String "page-break-after">
	//   16   32:invokeinterface #86  <Method Object Map.get(Object)>
	//   17   37:checkcast       #65  <Class String>
	//   18   40:astore_1        
		if(workercontext != null && "always".equalsIgnoreCase(((String) (workercontext))))
	//*  19   41:aload_1         
	//*  20   42:ifnull          64
	//*  21   45:ldc1            #235 <String "always">
	//*  22   47:aload_1         
	//*  23   48:invokevirtual   #239 <Method boolean String.equalsIgnoreCase(String)>
	//*  24   51:ifeq            64
			list.add(((Object) (Chunk.NEXTPAGE)));
	//   25   54:aload_3         
	//   26   55:getstatic       #242 <Field Chunk Chunk.NEXTPAGE>
	//   27   58:invokeinterface #191 <Method boolean List.add(Object)>
	//   28   63:pop             
		return list;
	//   29   64:aload_3         
	//   30   65:areturn         
_L2:
		ArrayList arraylist1 = new ArrayList();
	//   31   66:new             #95  <Class ArrayList>
	//   32   69:dup             
	//   33   70:invokespecial   #121 <Method void ArrayList()>
	//   34   73:astore          5
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*  35   75:aload_3         
	//*  36   76:invokeinterface #48  <Method Iterator List.iterator()>
	//*  37   81:astore_3        
	//*  38   82:aload_3         
	//*  39   83:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  40   88:ifeq            196
		{
			Element element = (Element)((Iterator) (list)).next();
	//   41   91:aload_3         
	//   42   92:invokeinterface #58  <Method Object Iterator.next()>
	//   43   97:checkcast       #133 <Class Element>
	//   44  100:astore          6
			if((element instanceof Chunk) && ((Chunk)element).hasAttributes() && ((Chunk)element).getAttributes().containsKey("NEWPAGE"))
	//*  45  102:aload           6
	//*  46  104:instanceof      #145 <Class Chunk>
	//*  47  107:ifeq            183
	//*  48  110:aload           6
	//*  49  112:checkcast       #145 <Class Chunk>
	//*  50  115:invokevirtual   #245 <Method boolean Chunk.hasAttributes()>
	//*  51  118:ifeq            183
	//*  52  121:aload           6
	//*  53  123:checkcast       #145 <Class Chunk>
	//*  54  126:invokevirtual   #248 <Method HashMap Chunk.getAttributes()>
	//*  55  129:ldc1            #250 <String "NEWPAGE">
	//*  56  131:invokevirtual   #255 <Method boolean HashMap.containsKey(Object)>
	//*  57  134:ifeq            183
			{
				if(((List) (arraylist1)).size() > 0)
	//*  58  137:aload           5
	//*  59  139:invokeinterface #125 <Method int List.size()>
	//*  60  144:ifle            170
				{
					((List) (arraylist)).addAll(((java.util.Collection) (end(workercontext, tag, ((List) (arraylist1))))));
	//   61  147:aload           4
	//   62  149:aload_0         
	//   63  150:aload_1         
	//   64  151:aload_2         
	//   65  152:aload           5
	//   66  154:invokevirtual   #231 <Method List end(WorkerContext, Tag, List)>
	//   67  157:invokeinterface #259 <Method boolean List.addAll(java.util.Collection)>
	//   68  162:pop             
					((List) (arraylist1)).clear();
	//   69  163:aload           5
	//   70  165:invokeinterface #262 <Method void List.clear()>
				}
				((List) (arraylist)).add(((Object) (element)));
	//   71  170:aload           4
	//   72  172:aload           6
	//   73  174:invokeinterface #191 <Method boolean List.add(Object)>
	//   74  179:pop             
			} else
	//*  75  180:goto            82
			{
				((List) (arraylist1)).add(((Object) (element)));
	//   76  183:aload           5
	//   77  185:aload           6
	//   78  187:invokeinterface #191 <Method boolean List.add(Object)>
	//   79  192:pop             
			}
		}

	//*  80  193:goto            82
		list = ((List) (arraylist));
	//   81  196:aload           4
	//   82  198:astore_3        
		if(((List) (arraylist1)).size() > 0)
	//*  83  199:aload           5
	//*  84  201:invokeinterface #125 <Method int List.size()>
	//*  85  206:ifle            26
		{
			((List) (arraylist)).addAll(((java.util.Collection) (end(workercontext, tag, ((List) (arraylist1))))));
	//   86  209:aload           4
	//   87  211:aload_0         
	//   88  212:aload_1         
	//   89  213:aload_2         
	//   90  214:aload           5
	//   91  216:invokevirtual   #231 <Method List end(WorkerContext, Tag, List)>
	//   92  219:invokeinterface #259 <Method boolean List.addAll(java.util.Collection)>
	//   93  224:pop             
			((List) (arraylist1)).clear();
	//   94  225:aload           5
	//   95  227:invokeinterface #262 <Method void List.clear()>
			list = ((List) (arraylist));
	//   96  232:aload           4
	//   97  234:astore_3        
		}
		if(true) goto _L4; else goto _L3
	//   98  235:goto            26
_L3:
	}

	public CSSResolver getCSSResolver(WorkerContext workercontext)
		throws NoCustomContextException
	{
		return (CSSResolver)((ObjectContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/css/CssResolverPipeline)).getName())).get();
	//    0    0:aload_1         
	//    1    1:ldc2            #266 <Class CssResolverPipeline>
	//    2    4:invokevirtual   #269 <Method String Class.getName()>
	//    3    7:invokeinterface #274 <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//    4   12:checkcast       #276 <Class ObjectContext>
	//    5   15:invokevirtual   #278 <Method Object ObjectContext.get()>
	//    6   18:checkcast       #280 <Class CSSResolver>
	//    7   21:areturn         
	}

	public CssAppliers getCssAppliers()
	{
		return cssAppliers;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field CssAppliers cssAppliers>
	//    2    4:areturn         
	}

	public HtmlPipelineContext getHtmlPipelineContext(WorkerContext workercontext)
		throws NoCustomContextException
	{
		return (HtmlPipelineContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/html/HtmlPipeline)).getName());
	//    0    0:aload_1         
	//    1    1:ldc2            #285 <Class HtmlPipeline>
	//    2    4:invokevirtual   #269 <Method String Class.getName()>
	//    3    7:invokeinterface #274 <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//    4   12:checkcast       #287 <Class HtmlPipelineContext>
	//    5   15:areturn         
	}

	protected int getRunDirection(Tag tag)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		String s = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		byte byte0;
		String s1;
		if(tag.getName() != null && !ignoreDirAttribute.contains(((Object) (tag.getName().toLowerCase()))))
	//*   4    5:aload_1         
	//*   5    6:invokevirtual   #63  <Method String Tag.getName()>
	//*   6    9:ifnull          131
	//*   7   12:aload_0         
	//*   8   13:getfield        #29  <Field Set ignoreDirAttribute>
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #63  <Method String Tag.getName()>
	//*  11   20:invokevirtual   #68  <Method String String.toLowerCase()>
	//*  12   23:invokeinterface #74  <Method boolean Set.contains(Object)>
	//*  13   28:ifne            131
			byte0 = 1;
	//   14   31:iconst_1        
	//   15   32:istore_2        
		else
	//*  16   33:iload_2         
	//*  17   34:ifeq            53
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #78  <Method Map Tag.getAttributes()>
	//*  20   41:ldc1            #80  <String "dir">
	//*  21   43:invokeinterface #86  <Method Object Map.get(Object)>
	//*  22   48:checkcast       #65  <Class String>
	//*  23   51:astore          4
	//*  24   53:aload           4
	//*  25   55:astore          5
	//*  26   57:aload           4
	//*  27   59:ifnonnull       116
	//*  28   62:iload_2         
	//*  29   63:ifeq            82
	//*  30   66:aload_1         
	//*  31   67:invokevirtual   #89  <Method Map Tag.getCSS()>
	//*  32   70:ldc1            #91  <String "direction">
	//*  33   72:invokeinterface #86  <Method Object Map.get(Object)>
	//*  34   77:checkcast       #65  <Class String>
	//*  35   80:astore          4
	//*  36   82:aload           4
	//*  37   84:astore          5
	//*  38   86:aload           4
	//*  39   88:ifnonnull       116
	//*  40   91:aload_0         
	//*  41   92:new             #289 <Class ParentTreeUtil>
	//*  42   95:dup             
	//*  43   96:invokespecial   #290 <Method void ParentTreeUtil()>
	//*  44   99:aload_1         
	//*  45  100:aload_0         
	//*  46  101:getfield        #42  <Field List tree>
	//*  47  104:invokevirtual   #294 <Method List ParentTreeUtil.getParentTagTree(Tag, List)>
	//*  48  107:putfield        #42  <Field List tree>
	//*  49  110:aload_0         
	//*  50  111:invokespecial   #296 <Method String getParentDirection()>
	//*  51  114:astore          5
	//*  52  116:ldc2            #298 <String "rtl">
	//*  53  119:aload           5
	//*  54  121:invokevirtual   #239 <Method boolean String.equalsIgnoreCase(String)>
	//*  55  124:ifeq            136
	//*  56  127:iconst_3        
	//*  57  128:istore_2        
	//*  58  129:iload_2         
	//*  59  130:ireturn         
			byte0 = 0;
	//   60  131:iconst_0        
	//   61  132:istore_2        
		if(byte0 != 0)
			s = (String)tag.getAttributes().get("dir");
		s1 = s;
		if(s == null)
		{
			if(byte0 != 0)
				s = (String)tag.getCSS().get("direction");
			s1 = s;
			if(s == null)
			{
				tree = (new ParentTreeUtil()).getParentTagTree(tag, tree);
				s1 = getParentDirection();
			}
		}
		if("rtl".equalsIgnoreCase(s1))
		{
			byte0 = 3;
		} else
	//*  62  133:goto            33
		{
			if("ltr".equalsIgnoreCase(s1))
	//*  63  136:ldc2            #300 <String "ltr">
	//*  64  139:aload           5
	//*  65  141:invokevirtual   #239 <Method boolean String.equalsIgnoreCase(String)>
	//*  66  144:ifeq            149
				return 2;
	//   67  147:iconst_2        
	//   68  148:ireturn         
			byte0 = ((byte) (flag));
	//   69  149:iload_3         
	//   70  150:istore_2        
			if(!"auto".equalsIgnoreCase(s1))
	//*  71  151:ldc2            #302 <String "auto">
	//*  72  154:aload           5
	//*  73  156:invokevirtual   #239 <Method boolean String.equalsIgnoreCase(String)>
	//*  74  159:ifne            129
				return 1;
	//   75  162:iconst_1        
	//   76  163:ireturn         
		}
		return ((int) (byte0));
	}

	protected void invertTextAlignForParagraph(Paragraph paragraph)
	{
		switch(paragraph.getAlignment())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #305 <Method int Paragraph.getAlignment()>
		{
	//*   2    4:tableswitch     -1 8: default 60
	//	               -1 65
	//	               0 60
	//	               1 65
	//	               2 66
	//	               3 65
	//	               4 60
	//	               5 60
	//	               6 60
	//	               7 60
	//	               8 65
		case 0: // '\0'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			paragraph.setAlignment(2);
	//    3   60:aload_1         
	//    4   61:iconst_2        
	//    5   62:invokevirtual   #308 <Method void Paragraph.setAlignment(int)>
			// fall through

		case -1: 
		case 1: // '\001'
		case 3: // '\003'
		case 8: // '\b'
			return;
	//    6   65:return          

		case 2: // '\002'
			paragraph.setAlignment(0);
	//    7   66:aload_1         
	//    8   67:iconst_0        
	//    9   68:invokevirtual   #308 <Method void Paragraph.setAlignment(int)>
			break;
		}
	//   10   71:return          
	}

	protected void invertTextAlignForParagraph(NoNewLineParagraph nonewlineparagraph)
	{
		switch(nonewlineparagraph.getAlignment())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #309 <Method int NoNewLineParagraph.getAlignment()>
		{
	//*   2    4:tableswitch     -1 8: default 60
	//	               -1 65
	//	               0 60
	//	               1 65
	//	               2 66
	//	               3 65
	//	               4 60
	//	               5 60
	//	               6 60
	//	               7 60
	//	               8 65
		case 0: // '\0'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			nonewlineparagraph.setAlignment(2);
	//    3   60:aload_1         
	//    4   61:iconst_2        
	//    5   62:invokevirtual   #310 <Method void NoNewLineParagraph.setAlignment(int)>
			// fall through

		case -1: 
		case 1: // '\001'
		case 3: // '\003'
		case 8: // '\b'
			return;
	//    6   65:return          

		case 2: // '\002'
			nonewlineparagraph.setAlignment(0);
	//    7   66:aload_1         
	//    8   67:iconst_0        
	//    9   68:invokevirtual   #310 <Method void NoNewLineParagraph.setAlignment(int)>
			break;
		}
	//   10   71:return          
	}

	public boolean isStackOwner()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCssAppliers(CssAppliers cssappliers)
	{
		cssAppliers = cssappliers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #283 <Field CssAppliers cssAppliers>
	//    3    5:return          
	}

	public List start(WorkerContext workercontext, Tag tag)
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #95  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #98  <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	public final List startElement(WorkerContext workercontext, Tag tag)
	{
		float f = fontsizeTrans.translateFontSize(tag);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field FontSizeTranslator fontsizeTrans>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #321 <Method float FontSizeTranslator.translateFontSize(Tag)>
	//    4    8:fstore_3        
		if(f != -1F)
	//*   5    9:fload_3         
	//*   6   10:ldc2            #322 <Float -1F>
	//*   7   13:fcmpl           
	//*   8   14:ifeq            50
			tag.getCSS().put("font-size", ((Object) ((new StringBuilder()).append(f).append("pt").toString())));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #89  <Method Map Tag.getCSS()>
	//   11   21:ldc2            #324 <String "font-size">
	//   12   24:new             #326 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #327 <Method void StringBuilder()>
	//   15   31:fload_3         
	//   16   32:invokevirtual   #331 <Method StringBuilder StringBuilder.append(float)>
	//   17   35:ldc2            #333 <String "pt">
	//   18   38:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   20   44:invokeinterface #343 <Method Object Map.put(Object, Object)>
	//   21   49:pop             
		String s = (String)tag.getCSS().get("page-break-before");
	//   22   50:aload_2         
	//   23   51:invokevirtual   #89  <Method Map Tag.getCSS()>
	//   24   54:ldc2            #345 <String "page-break-before">
	//   25   57:invokeinterface #86  <Method Object Map.get(Object)>
	//   26   62:checkcast       #65  <Class String>
	//   27   65:astore          4
		if(s != null && "always".equalsIgnoreCase(s))
	//*  28   67:aload           4
	//*  29   69:ifnull          120
	//*  30   72:ldc1            #235 <String "always">
	//*  31   74:aload           4
	//*  32   76:invokevirtual   #239 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   79:ifeq            120
		{
			ArrayList arraylist = new ArrayList(2);
	//   34   82:new             #95  <Class ArrayList>
	//   35   85:dup             
	//   36   86:iconst_2        
	//   37   87:invokespecial   #98  <Method void ArrayList(int)>
	//   38   90:astore          4
			((List) (arraylist)).add(((Object) (Chunk.NEXTPAGE)));
	//   39   92:aload           4
	//   40   94:getstatic       #242 <Field Chunk Chunk.NEXTPAGE>
	//   41   97:invokeinterface #191 <Method boolean List.add(Object)>
	//   42  102:pop             
			((List) (arraylist)).addAll(((java.util.Collection) (start(workercontext, tag))));
	//   43  103:aload           4
	//   44  105:aload_0         
	//   45  106:aload_1         
	//   46  107:aload_2         
	//   47  108:invokevirtual   #347 <Method List start(WorkerContext, Tag)>
	//   48  111:invokeinterface #259 <Method boolean List.addAll(java.util.Collection)>
	//   49  116:pop             
			return ((List) (arraylist));
	//   50  117:aload           4
	//   51  119:areturn         
		} else
		{
			return start(workercontext, tag);
	//   52  120:aload_0         
	//   53  121:aload_1         
	//   54  122:aload_2         
	//   55  123:invokevirtual   #347 <Method List start(WorkerContext, Tag)>
	//   56  126:areturn         
		}
	}

	protected List textContent(WorkerContext workercontext, Tag tag, String s)
	{
		Object obj = ((Object) (HTMLUtils.sanitize(s, false)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #354 <Method List HTMLUtils.sanitize(String, boolean)>
	//    3    5:astore          4
		s = ((String) (new ArrayList(1)));
	//    4    7:new             #95  <Class ArrayList>
	//    5   10:dup             
	//    6   11:iconst_1        
	//    7   12:invokespecial   #98  <Method void ArrayList(int)>
	//    8   15:astore_3        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   9   16:aload           4
	//*  10   18:invokeinterface #48  <Method Iterator List.iterator()>
	//*  11   23:astore          4
	//*  12   25:aload           4
	//*  13   27:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            84
		{
			Chunk chunk = (Chunk)((Iterator) (obj)).next();
	//   15   35:aload           4
	//   16   37:invokeinterface #58  <Method Object Iterator.next()>
	//   17   42:checkcast       #145 <Class Chunk>
	//   18   45:astore          5
			try
			{
				((List) (s)).add(((Object) (getCssAppliers().apply(((Element) (chunk)), tag, getHtmlPipelineContext(workercontext)))));
	//   19   47:aload_3         
	//   20   48:aload_0         
	//   21   49:invokevirtual   #143 <Method CssAppliers getCssAppliers()>
	//   22   52:aload           5
	//   23   54:aload_2         
	//   24   55:aload_0         
	//   25   56:aload_1         
	//   26   57:invokevirtual   #139 <Method HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   27   60:invokeinterface #158 <Method Element CssAppliers.apply(Element, Tag, HtmlPipelineContext)>
	//   28   65:invokeinterface #191 <Method boolean List.add(Object)>
	//   29   70:pop             
			}
	//*  30   71:goto            25
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//*  31   74:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (workercontext)));
	//   32   75:new             #164 <Class RuntimeWorkerException>
	//   33   78:dup             
	//   34   79:aload_1         
	//   35   80:invokespecial   #357 <Method void RuntimeWorkerException(Throwable)>
	//   36   83:athrow          
			}
		}

		return ((List) (s));
	//   37   84:aload_3         
	//   38   85:areturn         
	}

	protected void updateParagraphFontIfNeeded(Phrase phrase, Element element)
	{
		Font font = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		float f;
		if(element instanceof Chunk)
	//*   2    3:aload_2         
	//*   3    4:instanceof      #145 <Class Chunk>
	//*   4    7:ifeq            56
			font = ((Chunk)element).getFont();
	//    5   10:aload_2         
	//    6   11:checkcast       #145 <Class Chunk>
	//    7   14:invokevirtual   #361 <Method Font Chunk.getFont()>
	//    8   17:astore          4
		else
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #364 <Method Font Phrase.getFont()>
	//*  11   23:ifnull          75
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #364 <Method Font Phrase.getFont()>
	//*  14   30:invokevirtual   #369 <Method float Font.getSize()>
	//*  15   33:fstore_3        
	//*  16   34:aload           4
	//*  17   36:ifnull          55
	//*  18   39:aload           4
	//*  19   41:invokevirtual   #369 <Method float Font.getSize()>
	//*  20   44:fload_3         
	//*  21   45:fcmpl           
	//*  22   46:ifle            55
	//*  23   49:aload_1         
	//*  24   50:aload           4
	//*  25   52:invokevirtual   #373 <Method void Phrase.setFont(Font)>
	//*  26   55:return          
		if(element instanceof Phrase)
	//*  27   56:aload_2         
	//*  28   57:instanceof      #363 <Class Phrase>
	//*  29   60:ifeq            19
			font = ((Phrase)element).getFont();
	//   30   63:aload_2         
	//   31   64:checkcast       #363 <Class Phrase>
	//   32   67:invokevirtual   #364 <Method Font Phrase.getFont()>
	//   33   70:astore          4
		if(phrase.getFont() != null)
			f = phrase.getFont().getSize();
		else
	//*  34   72:goto            19
			f = 12F;
	//   35   75:ldc2            #374 <Float 12F>
	//   36   78:fstore_3        
		if(font != null && font.getSize() > f)
			phrase.setFont(font);
	//*  37   79:goto            34
	}

	private CssAppliers cssAppliers;
	private final FontSizeTranslator fontsizeTrans = FontSizeTranslator.getInstance();
	private Set ignoreDirAttribute;
	private List tree;
}
