// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.NoTagProcessorException;
import com.itextpdf.tool.xml.html.TagProcessor;
import com.itextpdf.tool.xml.pipeline.AbstractPipeline;
import com.itextpdf.tool.xml.pipeline.WritableElement;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.html:
//			StackKeeper, HtmlPipelineContext, NoStackException

public class HtmlPipeline extends AbstractPipeline
{

	public HtmlPipeline(HtmlPipelineContext htmlpipelinecontext, Pipeline pipeline)
	{
		super(pipeline);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #12  <Method void AbstractPipeline(Pipeline)>
		hpc = htmlpipelinecontext;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #14  <Field HtmlPipelineContext hpc>
	//    6   10:return          
	}

	protected void addStackKeeper(Tag tag, HtmlPipelineContext htmlpipelinecontext, TagProcessor tagprocessor)
	{
		if(tagprocessor.isStackOwner())
	//*   0    0:aload_3         
	//*   1    1:invokeinterface #25  <Method boolean TagProcessor.isStackOwner()>
	//*   2    6:ifeq            21
			htmlpipelinecontext.addFirst(new StackKeeper(tag));
	//    3    9:aload_2         
	//    4   10:new             #27  <Class StackKeeper>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #30  <Method void StackKeeper(Tag)>
	//    8   18:invokevirtual   #36  <Method void HtmlPipelineContext.addFirst(StackKeeper)>
	//    9   21:return          
	}

	public Pipeline close(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		HtmlPipelineContext htmlpipelinecontext = (HtmlPipelineContext)getLocalContext(workercontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method com.itextpdf.tool.xml.CustomContext getLocalContext(WorkerContext)>
	//    3    5:checkcast       #32  <Class HtmlPipelineContext>
	//    4    8:astore          5
		if(tag.getLastMarginBottom() == null) goto _L2; else goto _L1
	//    5   10:aload_2         
	//    6   11:invokevirtual   #54  <Method Object Tag.getLastMarginBottom()>
	//    7   14:ifnull          147
_L1:
		htmlpipelinecontext.getMemory().put("lastMarginBottom", tag.getLastMarginBottom());
	//    8   17:aload           5
	//    9   19:invokevirtual   #58  <Method Map HtmlPipelineContext.getMemory()>
	//   10   22:ldc1            #60  <String "lastMarginBottom">
	//   11   24:aload_2         
	//   12   25:invokevirtual   #54  <Method Object Tag.getLastMarginBottom()>
	//   13   28:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//   14   33:pop             
_L11:
		boolean flag;
		TagProcessor tagprocessor;
		tagprocessor = htmlpipelinecontext.resolveProcessor(tag.getName(), tag.getNameSpace());
	//   15   34:aload           5
	//   16   36:aload_2         
	//   17   37:invokevirtual   #70  <Method String Tag.getName()>
	//   18   40:aload_2         
	//   19   41:invokevirtual   #73  <Method String Tag.getNameSpace()>
	//   20   44:invokevirtual   #77  <Method TagProcessor HtmlPipelineContext.resolveProcessor(String, String)>
	//   21   47:astore          6
		flag = tagprocessor.isStackOwner();
	//   22   49:aload           6
	//   23   51:invokeinterface #25  <Method boolean TagProcessor.isStackOwner()>
	//   24   56:istore          4
		if(!flag) goto _L4; else goto _L3
	//   25   58:iload           4
	//   26   60:ifeq            195
_L3:
		StackKeeper stackkeeper = htmlpipelinecontext.poll();
	//   27   63:aload           5
	//   28   65:invokevirtual   #81  <Method StackKeeper HtmlPipelineContext.poll()>
	//   29   68:astore          7
		workercontext = ((WorkerContext) (tagprocessor.endElement(workercontext, tag, stackkeeper.getElements())));
	//   30   70:aload           6
	//   31   72:aload_1         
	//   32   73:aload_2         
	//   33   74:aload           7
	//   34   76:invokevirtual   #85  <Method List StackKeeper.getElements()>
	//   35   79:invokeinterface #89  <Method List TagProcessor.endElement(WorkerContext, Tag, List)>
	//   36   84:astore_1        
_L9:
		if(((List) (workercontext)).size() <= 0) goto _L6; else goto _L5
	//   37   85:aload_1         
	//   38   86:invokeinterface #95  <Method int List.size()>
	//   39   91:ifle            241
_L5:
		tag = ((Tag) (htmlpipelinecontext.peek()));
	//   40   94:aload           5
	//   41   96:invokevirtual   #98  <Method StackKeeper HtmlPipelineContext.peek()>
	//   42   99:astore_2        
		if(tag == null) goto _L8; else goto _L7
	//   43  100:aload_2         
	//   44  101:ifnull          223
_L7:
		try
		{
			for(workercontext = ((WorkerContext) (((List) (workercontext)).iterator())); ((Iterator) (workercontext)).hasNext(); ((StackKeeper) (tag)).add((Element)((Iterator) (workercontext)).next()));
	//   45  104:aload_1         
	//   46  105:invokeinterface #102 <Method Iterator List.iterator()>
	//   47  110:astore_1        
	//   48  111:aload_1         
	//   49  112:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   50  117:ifeq            241
	//   51  120:aload_2         
	//   52  121:aload_1         
	//   53  122:invokeinterface #110 <Method Object Iterator.next()>
	//   54  127:checkcast       #112 <Class Element>
	//   55  130:invokevirtual   #116 <Method void StackKeeper.add(Element)>
		}
	//*  56  133:goto            111
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  57  136:astore_1        
		{
			if(!htmlpipelinecontext.acceptUnknown())
	//*  58  137:aload           5
	//*  59  139:invokevirtual   #119 <Method boolean HtmlPipelineContext.acceptUnknown()>
	//*  60  142:ifne            241
				throw workercontext;
	//   61  145:aload_1         
	//   62  146:athrow          
		}
		  goto _L6
_L2:
		htmlpipelinecontext.getMemory().remove("lastMarginBottom");
	//   63  147:aload           5
	//   64  149:invokevirtual   #58  <Method Map HtmlPipelineContext.getMemory()>
	//   65  152:ldc1            #60  <String "lastMarginBottom">
	//   66  154:invokeinterface #123 <Method Object Map.remove(Object)>
	//   67  159:pop             
		continue; /* Loop/switch isn't completed */
	//   68  160:goto            34
		workercontext;
	//   69  163:astore_1        
		throw new PipelineException(String.format(LocaleMessages.getInstance().getMessage("pipeline.html.missingstack"), new Object[] {
			tag.toString()
		}), ((Exception) (workercontext)));
	//   70  164:new             #40  <Class PipelineException>
	//   71  167:dup             
	//   72  168:invokestatic    #129 <Method LocaleMessages LocaleMessages.getInstance()>
	//   73  171:ldc1            #131 <String "pipeline.html.missingstack">
	//   74  173:invokevirtual   #135 <Method String LocaleMessages.getMessage(String)>
	//   75  176:iconst_1        
	//   76  177:anewarray       Object[]
	//   77  180:dup             
	//   78  181:iconst_0        
	//   79  182:aload_2         
	//   80  183:invokevirtual   #140 <Method String Tag.toString()>
	//   81  186:aastore         
	//   82  187:invokestatic    #146 <Method String String.format(String, Object[])>
	//   83  190:aload_1         
	//   84  191:invokespecial   #149 <Method void PipelineException(String, Exception)>
	//   85  194:athrow          
_L4:
		workercontext = ((WorkerContext) (tagprocessor.endElement(workercontext, tag, htmlpipelinecontext.currentContent())));
	//   86  195:aload           6
	//   87  197:aload_1         
	//   88  198:aload_2         
	//   89  199:aload           5
	//   90  201:invokevirtual   #152 <Method List HtmlPipelineContext.currentContent()>
	//   91  204:invokeinterface #89  <Method List TagProcessor.endElement(WorkerContext, Tag, List)>
	//   92  209:astore_1        
		htmlpipelinecontext.currentContent().clear();
	//   93  210:aload           5
	//   94  212:invokevirtual   #152 <Method List HtmlPipelineContext.currentContent()>
	//   95  215:invokeinterface #156 <Method void List.clear()>
		  goto _L9
	//*  96  220:goto            85
_L8:
		tag = ((Tag) (new WritableElement()));
	//   97  223:new             #158 <Class WritableElement>
	//   98  226:dup             
	//   99  227:invokespecial   #160 <Method void WritableElement()>
	//  100  230:astore_2        
		processobject.add(((com.itextpdf.tool.xml.Writable) (tag)));
	//  101  231:aload_3         
	//  102  232:aload_2         
	//  103  233:invokevirtual   #165 <Method void ProcessObject.add(com.itextpdf.tool.xml.Writable)>
		((WritableElement) (tag)).addAll(((List) (workercontext)));
	//  104  236:aload_2         
	//  105  237:aload_1         
	//  106  238:invokevirtual   #169 <Method void WritableElement.addAll(List)>
_L6:
		return getNext();
	//  107  241:aload_0         
	//  108  242:invokevirtual   #173 <Method Pipeline getNext()>
	//  109  245:areturn         
		if(true) goto _L11; else goto _L10
_L10:
	}

	public Pipeline content(WorkerContext workercontext, Tag tag, String s, ProcessObject processobject)
		throws PipelineException
	{
		HtmlPipelineContext htmlpipelinecontext = (HtmlPipelineContext)getLocalContext(workercontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method com.itextpdf.tool.xml.CustomContext getLocalContext(WorkerContext)>
	//    3    5:checkcast       #32  <Class HtmlPipelineContext>
	//    4    8:astore          5
		workercontext = ((WorkerContext) (htmlpipelinecontext.resolveProcessor(tag.getName(), tag.getNameSpace()).content(workercontext, tag, s)));
	//    5   10:aload           5
	//    6   12:aload_2         
	//    7   13:invokevirtual   #70  <Method String Tag.getName()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #73  <Method String Tag.getNameSpace()>
	//   10   20:invokevirtual   #77  <Method TagProcessor HtmlPipelineContext.resolveProcessor(String, String)>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokeinterface #180 <Method List TagProcessor.content(WorkerContext, Tag, String)>
	//   15   31:astore_1        
		if(((List) (workercontext)).size() <= 0)
			break MISSING_BLOCK_LABEL_140;
	//   16   32:aload_1         
	//   17   33:invokeinterface #95  <Method int List.size()>
	//   18   38:ifle            140
		tag = ((Tag) (htmlpipelinecontext.peek()));
	//   19   41:aload           5
	//   20   43:invokevirtual   #98  <Method StackKeeper HtmlPipelineContext.peek()>
	//   21   46:astore_2        
		if(tag != null)
	//*  22   47:aload_2         
	//*  23   48:ifnull          94
		{
			try
			{
				for(workercontext = ((WorkerContext) (((List) (workercontext)).iterator())); ((Iterator) (workercontext)).hasNext(); ((StackKeeper) (tag)).add((Element)((Iterator) (workercontext)).next()));
	//   24   51:aload_1         
	//   25   52:invokeinterface #102 <Method Iterator List.iterator()>
	//   26   57:astore_1        
	//   27   58:aload_1         
	//   28   59:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   29   64:ifeq            140
	//   30   67:aload_2         
	//   31   68:aload_1         
	//   32   69:invokeinterface #110 <Method Object Iterator.next()>
	//   33   74:checkcast       #112 <Class Element>
	//   34   77:invokevirtual   #116 <Method void StackKeeper.add(Element)>
			}
	//*  35   80:goto            58
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//*  36   83:astore_1        
			{
				if(!htmlpipelinecontext.acceptUnknown())
	//*  37   84:aload           5
	//*  38   86:invokevirtual   #119 <Method boolean HtmlPipelineContext.acceptUnknown()>
	//*  39   89:ifne            140
					throw workercontext;
	//   40   92:aload_1         
	//   41   93:athrow          
			}
			break MISSING_BLOCK_LABEL_140;
		}
		tag = ((Tag) (new WritableElement()));
	//   42   94:new             #158 <Class WritableElement>
	//   43   97:dup             
	//   44   98:invokespecial   #160 <Method void WritableElement()>
	//   45  101:astore_2        
		for(workercontext = ((WorkerContext) (((List) (workercontext)).iterator())); ((Iterator) (workercontext)).hasNext(); ((WritableElement) (tag)).add((Element)((Iterator) (workercontext)).next()));
	//   46  102:aload_1         
	//   47  103:invokeinterface #102 <Method Iterator List.iterator()>
	//   48  108:astore_1        
	//   49  109:aload_1         
	//   50  110:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   51  115:ifeq            134
	//   52  118:aload_2         
	//   53  119:aload_1         
	//   54  120:invokeinterface #110 <Method Object Iterator.next()>
	//   55  125:checkcast       #112 <Class Element>
	//   56  128:invokevirtual   #181 <Method void WritableElement.add(Element)>
	//*  57  131:goto            109
		processobject.add(((com.itextpdf.tool.xml.Writable) (tag)));
	//   58  134:aload           4
	//   59  136:aload_2         
	//   60  137:invokevirtual   #165 <Method void ProcessObject.add(com.itextpdf.tool.xml.Writable)>
		return getNext();
	//   61  140:aload_0         
	//   62  141:invokevirtual   #173 <Method Pipeline getNext()>
	//   63  144:areturn         
	}

	public String getContextKey()
	{
		return ((Class) (com/itextpdf/tool/xml/pipeline/html/HtmlPipeline)).getName();
	//    0    0:ldc1            #2   <Class HtmlPipeline>
	//    1    2:invokevirtual   #186 <Method String Class.getName()>
	//    2    5:areturn         
	}

	public Pipeline init(WorkerContext workercontext)
		throws PipelineException
	{
		try
		{
			HtmlPipelineContext htmlpipelinecontext = hpc.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field HtmlPipelineContext hpc>
	//    2    4:invokevirtual   #194 <Method HtmlPipelineContext HtmlPipelineContext.clone()>
	//    3    7:astore_2        
			workercontext.put(getContextKey(), ((com.itextpdf.tool.xml.CustomContext) (htmlpipelinecontext)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #196 <Method String getContextKey()>
	//    7   13:aload_2         
	//    8   14:invokeinterface #201 <Method void WorkerContext.put(String, com.itextpdf.tool.xml.CustomContext)>
		}
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #173 <Method Pipeline getNext()>
	//*  11   23:areturn         
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  12   24:astore_1        
		{
			throw new PipelineException(String.format(LocaleMessages.getInstance().getMessage("unsupported.clone"), new Object[] {
				((Object) (hpc)).getClass().toString()
			}), ((Exception) (workercontext)));
	//   13   25:new             #40  <Class PipelineException>
	//   14   28:dup             
	//   15   29:invokestatic    #129 <Method LocaleMessages LocaleMessages.getInstance()>
	//   16   32:ldc1            #203 <String "unsupported.clone">
	//   17   34:invokevirtual   #135 <Method String LocaleMessages.getMessage(String)>
	//   18   37:iconst_1        
	//   19   38:anewarray       Object[]
	//   20   41:dup             
	//   21   42:iconst_0        
	//   22   43:aload_0         
	//   23   44:getfield        #14  <Field HtmlPipelineContext hpc>
	//   24   47:invokevirtual   #207 <Method Class Object.getClass()>
	//   25   50:invokevirtual   #208 <Method String Class.toString()>
	//   26   53:aastore         
	//   27   54:invokestatic    #146 <Method String String.format(String, Object[])>
	//   28   57:aload_1         
	//   29   58:invokespecial   #149 <Method void PipelineException(String, Exception)>
	//   30   61:athrow          
		}
		return getNext();
	}

	public Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		HtmlPipelineContext htmlpipelinecontext = (HtmlPipelineContext)getLocalContext(workercontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method com.itextpdf.tool.xml.CustomContext getLocalContext(WorkerContext)>
	//    3    5:checkcast       #32  <Class HtmlPipelineContext>
	//    4    8:astore          4
		tag.setLastMarginBottom(htmlpipelinecontext.getMemory().get("lastMarginBottom"));
	//    5   10:aload_2         
	//    6   11:aload           4
	//    7   13:invokevirtual   #58  <Method Map HtmlPipelineContext.getMemory()>
	//    8   16:ldc1            #60  <String "lastMarginBottom">
	//    9   18:invokeinterface #213 <Method Object Map.get(Object)>
	//   10   23:invokevirtual   #217 <Method void Tag.setLastMarginBottom(Object)>
		htmlpipelinecontext.getMemory().remove("lastMarginBottom");
	//   11   26:aload           4
	//   12   28:invokevirtual   #58  <Method Map HtmlPipelineContext.getMemory()>
	//   13   31:ldc1            #60  <String "lastMarginBottom">
	//   14   33:invokeinterface #123 <Method Object Map.remove(Object)>
	//   15   38:pop             
		TagProcessor tagprocessor = htmlpipelinecontext.resolveProcessor(tag.getName(), tag.getNameSpace());
	//   16   39:aload           4
	//   17   41:aload_2         
	//   18   42:invokevirtual   #70  <Method String Tag.getName()>
	//   19   45:aload_2         
	//   20   46:invokevirtual   #73  <Method String Tag.getNameSpace()>
	//   21   49:invokevirtual   #77  <Method TagProcessor HtmlPipelineContext.resolveProcessor(String, String)>
	//   22   52:astore          5
		addStackKeeper(tag, htmlpipelinecontext, tagprocessor);
	//   23   54:aload_0         
	//   24   55:aload_2         
	//   25   56:aload           4
	//   26   58:aload           5
	//   27   60:invokevirtual   #219 <Method void addStackKeeper(Tag, HtmlPipelineContext, TagProcessor)>
		workercontext = ((WorkerContext) (tagprocessor.startElement(workercontext, tag)));
	//   28   63:aload           5
	//   29   65:aload_1         
	//   30   66:aload_2         
	//   31   67:invokeinterface #223 <Method List TagProcessor.startElement(WorkerContext, Tag)>
	//   32   72:astore_1        
		if(((List) (workercontext)).size() <= 0)
			break MISSING_BLOCK_LABEL_254;
	//   33   73:aload_1         
	//   34   74:invokeinterface #95  <Method int List.size()>
	//   35   79:ifle            254
		if(!tagprocessor.isStackOwner())
			break MISSING_BLOCK_LABEL_169;
	//   36   82:aload           5
	//   37   84:invokeinterface #25  <Method boolean TagProcessor.isStackOwner()>
	//   38   89:ifeq            169
		processobject = ((ProcessObject) (htmlpipelinecontext.peek()));
	//   39   92:aload           4
	//   40   94:invokevirtual   #98  <Method StackKeeper HtmlPipelineContext.peek()>
	//   41   97:astore_3        
		if(processobject == null)
	//*  42   98:aload_3         
	//*  43   99:ifnonnull       137
		{
			try
			{
				throw new PipelineException(String.format("pipeline.html.missingstack", new Object[] {
					tag.toString()
				}));
	//   44  102:new             #40  <Class PipelineException>
	//   45  105:dup             
	//   46  106:ldc1            #131 <String "pipeline.html.missingstack">
	//   47  108:iconst_1        
	//   48  109:anewarray       Object[]
	//   49  112:dup             
	//   50  113:iconst_0        
	//   51  114:aload_2         
	//   52  115:invokevirtual   #140 <Method String Tag.toString()>
	//   53  118:aastore         
	//   54  119:invokestatic    #146 <Method String String.format(String, Object[])>
	//   55  122:invokespecial   #226 <Method void PipelineException(String)>
	//   56  125:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext) { }
	//   57  126:astore_1        
			if(!htmlpipelinecontext.acceptUnknown())
	//*  58  127:aload           4
	//*  59  129:invokevirtual   #119 <Method boolean HtmlPipelineContext.acceptUnknown()>
	//*  60  132:ifne            254
				throw workercontext;
	//   61  135:aload_1         
	//   62  136:athrow          
			break MISSING_BLOCK_LABEL_254;
		}
		for(workercontext = ((WorkerContext) (((List) (workercontext)).iterator())); ((Iterator) (workercontext)).hasNext(); ((StackKeeper) (processobject)).add((Element)((Iterator) (workercontext)).next()));
	//   63  137:aload_1         
	//   64  138:invokeinterface #102 <Method Iterator List.iterator()>
	//   65  143:astore_1        
	//   66  144:aload_1         
	//   67  145:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   68  150:ifeq            254
	//   69  153:aload_3         
	//   70  154:aload_1         
	//   71  155:invokeinterface #110 <Method Object Iterator.next()>
	//   72  160:checkcast       #112 <Class Element>
	//   73  163:invokevirtual   #116 <Method void StackKeeper.add(Element)>
		break MISSING_BLOCK_LABEL_254;
	//   74  166:goto            144
		workercontext = ((WorkerContext) (((List) (workercontext)).iterator()));
	//   75  169:aload_1         
	//   76  170:invokeinterface #102 <Method Iterator List.iterator()>
	//   77  175:astore_1        
		do
		{
			if(!((Iterator) (workercontext)).hasNext())
				break;
	//   78  176:aload_1         
	//   79  177:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   80  182:ifeq            254
			tag = ((Tag) ((Element)((Iterator) (workercontext)).next()));
	//   81  185:aload_1         
	//   82  186:invokeinterface #110 <Method Object Iterator.next()>
	//   83  191:checkcast       #112 <Class Element>
	//   84  194:astore_2        
			htmlpipelinecontext.currentContent().add(((Object) (tag)));
	//   85  195:aload           4
	//   86  197:invokevirtual   #152 <Method List HtmlPipelineContext.currentContent()>
	//   87  200:aload_2         
	//   88  201:invokeinterface #229 <Method boolean List.add(Object)>
	//   89  206:pop             
			if(((Element) (tag)).type() == 38)
	//*  90  207:aload_2         
	//*  91  208:invokeinterface #232 <Method int Element.type()>
	//*  92  213:bipush          38
	//*  93  215:icmpne          176
			{
				WritableElement writableelement = new WritableElement();
	//   94  218:new             #158 <Class WritableElement>
	//   95  221:dup             
	//   96  222:invokespecial   #160 <Method void WritableElement()>
	//   97  225:astore          5
				writableelement.add(((Element) (tag)));
	//   98  227:aload           5
	//   99  229:aload_2         
	//  100  230:invokevirtual   #181 <Method void WritableElement.add(Element)>
				processobject.add(((com.itextpdf.tool.xml.Writable) (writableelement)));
	//  101  233:aload_3         
	//  102  234:aload           5
	//  103  236:invokevirtual   #165 <Method void ProcessObject.add(com.itextpdf.tool.xml.Writable)>
				htmlpipelinecontext.currentContent().remove(((Object) (tag)));
	//  104  239:aload           4
	//  105  241:invokevirtual   #152 <Method List HtmlPipelineContext.currentContent()>
	//  106  244:aload_2         
	//  107  245:invokeinterface #234 <Method boolean List.remove(Object)>
	//  108  250:pop             
			}
		} while(true);
	//  109  251:goto            176
		return getNext();
	//  110  254:aload_0         
	//  111  255:invokevirtual   #173 <Method Pipeline getNext()>
	//  112  258:areturn         
	}

	private final HtmlPipelineContext hpc;
}
