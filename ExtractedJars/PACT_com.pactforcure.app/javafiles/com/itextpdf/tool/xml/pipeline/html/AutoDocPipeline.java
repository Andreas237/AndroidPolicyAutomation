// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.pipeline.AbstractPipeline;
import com.itextpdf.tool.xml.pipeline.ctx.MapContext;
import com.itextpdf.tool.xml.pipeline.ctx.WorkerContextImpl;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.html:
//			HtmlPipeline, HtmlPipelineContext, FileMaker

public class AutoDocPipeline extends AbstractPipeline
{

	public AutoDocPipeline(FileMaker filemaker, String s, String s1, Rectangle rectangle)
	{
		super(((Pipeline) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #16  <Method void AbstractPipeline(Pipeline)>
		fm = filemaker;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field FileMaker fm>
		tag = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field String tag>
		opentag = s1;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #22  <Field String opentag>
		pagesize = rectangle;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #24  <Field Rectangle pagesize>
	//   15   26:return          
	}

	public Pipeline close(WorkerContext workercontext, Tag tag1, ProcessObject processobject)
		throws PipelineException
	{
		tag1 = ((Tag) (tag1.getName()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #39  <Method String Tag.getName()>
	//    2    4:astore_2        
		if(tag.equals(((Object) (tag1))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field String tag>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   7   13:ifeq            81
		{
			try
			{
				((Document)((MapContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/end/PdfWriterPipeline)).getName())).get("DOCUMENT")).close();
	//    8   16:aload_1         
	//    9   17:ldc1            #47  <Class PdfWriterPipeline>
	//   10   19:invokevirtual   #50  <Method String Class.getName()>
	//   11   22:invokeinterface #56  <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//   12   27:checkcast       #58  <Class MapContext>
	//   13   30:ldc1            #60  <String "DOCUMENT">
	//   14   32:invokevirtual   #63  <Method Object MapContext.get(String)>
	//   15   35:checkcast       #65  <Class Document>
	//   16   38:invokevirtual   #68  <Method void Document.close()>
			}
	//*  17   41:aload_1         
	//*  18   42:ldc1            #70  <Class HtmlPipeline>
	//*  19   44:invokevirtual   #50  <Method String Class.getName()>
	//*  20   47:invokeinterface #56  <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//*  21   52:checkcast       #72  <Class HtmlPipelineContext>
	//*  22   55:invokevirtual   #76  <Method HtmlPipelineContext HtmlPipelineContext.clone()>
	//*  23   58:astore_2        
	//*  24   59:aload_2         
	//*  25   60:aload_0         
	//*  26   61:getfield        #24  <Field Rectangle pagesize>
	//*  27   64:invokevirtual   #80  <Method HtmlPipelineContext HtmlPipelineContext.setPageSize(Rectangle)>
	//*  28   67:pop             
	//*  29   68:aload_1         
	//*  30   69:checkcast       #82  <Class WorkerContextImpl>
	//*  31   72:ldc1            #70  <Class HtmlPipeline>
	//*  32   74:invokevirtual   #50  <Method String Class.getName()>
	//*  33   77:aload_2         
	//*  34   78:invokevirtual   #86  <Method void WorkerContextImpl.put(String, com.itextpdf.tool.xml.CustomContext)>
	//*  35   81:aload_0         
	//*  36   82:invokevirtual   #90  <Method Pipeline getNext()>
	//*  37   85:areturn         
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//*  38   86:astore_1        
			{
				throw new PipelineException("AutoDocPipeline depends on PdfWriterPipeline.", ((Exception) (workercontext)));
	//   39   87:new             #29  <Class PipelineException>
	//   40   90:dup             
	//   41   91:ldc1            #92  <String "AutoDocPipeline depends on PdfWriterPipeline.">
	//   42   93:aload_1         
	//   43   94:invokespecial   #95  <Method void PipelineException(String, Exception)>
	//   44   97:athrow          
			}
			try
			{
				tag1 = ((Tag) (((HtmlPipelineContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/html/HtmlPipeline)).getName())).clone()));
				((HtmlPipelineContext) (tag1)).setPageSize(pagesize);
				((WorkerContextImpl)workercontext).put(((Class) (com/itextpdf/tool/xml/pipeline/html/HtmlPipeline)).getName(), ((com.itextpdf.tool.xml.CustomContext) (tag1)));
			}
	//*  45   98:astore_1        
	//*  46   99:goto            81
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext) { }
	//   47  102:astore_1        
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext) { }
		}
		return getNext();
	//*  48  103:goto            81
	}

	public Pipeline open(WorkerContext workercontext, Tag tag1, ProcessObject processobject)
		throws PipelineException
	{
		Object obj;
		processobject = ((ProcessObject) (tag1.getName()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #39  <Method String Tag.getName()>
	//    2    4:astore_3        
		if(!tag.equals(((Object) (processobject))))
			break MISSING_BLOCK_LABEL_76;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field String tag>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #45  <Method boolean String.equals(Object)>
	//    7   13:ifeq            76
		processobject = ((ProcessObject) ((MapContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/end/PdfWriterPipeline)).getName())));
	//    8   16:aload_1         
	//    9   17:ldc1            #47  <Class PdfWriterPipeline>
	//   10   19:invokevirtual   #50  <Method String Class.getName()>
	//   11   22:invokeinterface #56  <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//   12   27:checkcast       #58  <Class MapContext>
	//   13   30:astore_3        
		obj = ((Object) (new Document(pagesize)));
	//   14   31:new             #65  <Class Document>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:getfield        #24  <Field Rectangle pagesize>
	//   18   39:invokespecial   #106 <Method void Document(Rectangle)>
	//   19   42:astore          9
		java.io.OutputStream outputstream = fm.getStream();
	//   20   44:aload_0         
	//   21   45:getfield        #18  <Field FileMaker fm>
	//   22   48:invokeinterface #112 <Method java.io.OutputStream FileMaker.getStream()>
	//   23   53:astore          10
		((MapContext) (processobject)).put("DOCUMENT", obj);
	//   24   55:aload_3         
	//   25   56:ldc1            #60  <String "DOCUMENT">
	//   26   58:aload           9
	//   27   60:invokevirtual   #115 <Method void MapContext.put(String, Object)>
		((MapContext) (processobject)).put("WRITER", ((Object) (PdfWriter.getInstance(((Document) (obj)), outputstream))));
	//   28   63:aload_3         
	//   29   64:ldc1            #117 <String "WRITER">
	//   30   66:aload           9
	//   31   68:aload           10
	//   32   70:invokestatic    #123 <Method PdfWriter PdfWriter.getInstance(Document, java.io.OutputStream)>
	//   33   73:invokevirtual   #115 <Method void MapContext.put(String, Object)>
		float f4;
		if(!tag1.getName().equalsIgnoreCase(opentag))
			break MISSING_BLOCK_LABEL_344;
	//   34   76:aload_2         
	//   35   77:invokevirtual   #39  <Method String Tag.getName()>
	//   36   80:aload_0         
	//   37   81:getfield        #22  <Field String opentag>
	//   38   84:invokevirtual   #127 <Method boolean String.equalsIgnoreCase(String)>
	//   39   87:ifeq            344
		workercontext = ((WorkerContext) ((Document)((MapContext)workercontext.get(((Class) (com/itextpdf/tool/xml/pipeline/end/PdfWriterPipeline)).getName())).get("DOCUMENT")));
	//   40   90:aload_1         
	//   41   91:ldc1            #47  <Class PdfWriterPipeline>
	//   42   93:invokevirtual   #50  <Method String Class.getName()>
	//   43   96:invokeinterface #56  <Method com.itextpdf.tool.xml.CustomContext WorkerContext.get(String)>
	//   44  101:checkcast       #58  <Class MapContext>
	//   45  104:ldc1            #60  <String "DOCUMENT">
	//   46  106:invokevirtual   #63  <Method Object MapContext.get(String)>
	//   47  109:checkcast       #65  <Class Document>
	//   48  112:astore_1        
		processobject = ((ProcessObject) (CssUtils.getInstance()));
	//   49  113:invokestatic    #132 <Method CssUtils CssUtils.getInstance()>
	//   50  116:astore_3        
		f4 = ((Document) (workercontext)).getPageSize().getWidth();
	//   51  117:aload_1         
	//   52  118:invokevirtual   #136 <Method Rectangle Document.getPageSize()>
	//   53  121:invokevirtual   #142 <Method float Rectangle.getWidth()>
	//   54  124:fstore          8
		float f;
		float f1;
		float f2;
		float f3;
		f2 = 0.0F;
	//   55  126:fconst_0        
	//   56  127:fstore          6
		f1 = 0.0F;
	//   57  129:fconst_0        
	//   58  130:fstore          5
		f = 0.0F;
	//   59  132:fconst_0        
	//   60  133:fstore          4
		f3 = 0.0F;
	//   61  135:fconst_0        
	//   62  136:fstore          7
		tag1 = ((Tag) (tag1.getCSS().entrySet().iterator()));
	//   63  138:aload_2         
	//   64  139:invokevirtual   #146 <Method Map Tag.getCSS()>
	//   65  142:invokeinterface #152 <Method Set Map.entrySet()>
	//   66  147:invokeinterface #158 <Method Iterator Set.iterator()>
	//   67  152:astore_2        
_L3:
		Object obj1;
		if(!((Iterator) (tag1)).hasNext())
			break MISSING_BLOCK_LABEL_327;
	//   68  153:aload_2         
	//   69  154:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//   70  159:ifeq            327
		obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (tag1)).next()));
	//   71  162:aload_2         
	//   72  163:invokeinterface #168 <Method Object Iterator.next()>
	//   73  168:checkcast       #170 <Class java.util.Map$Entry>
	//   74  171:astore          10
		obj = ((Object) ((String)((java.util.Map.Entry) (obj1)).getKey()));
	//   75  173:aload           10
	//   76  175:invokeinterface #173 <Method Object java.util.Map$Entry.getKey()>
	//   77  180:checkcast       #41  <Class String>
	//   78  183:astore          9
		obj1 = ((Object) ((String)((java.util.Map.Entry) (obj1)).getValue()));
	//   79  185:aload           10
	//   80  187:invokeinterface #176 <Method Object java.util.Map$Entry.getValue()>
	//   81  192:checkcast       #41  <Class String>
	//   82  195:astore          10
		if(!((String) (obj)).equalsIgnoreCase("margin-left")) goto _L2; else goto _L1
	//   83  197:aload           9
	//   84  199:ldc1            #178 <String "margin-left">
	//   85  201:invokevirtual   #127 <Method boolean String.equalsIgnoreCase(String)>
	//   86  204:ifeq            258
_L1:
		f2 = ((CssUtils) (processobject)).parseValueToPt(((String) (obj1)), f4);
	//   87  207:aload_3         
	//   88  208:aload           10
	//   89  210:fload           8
	//   90  212:invokevirtual   #182 <Method float CssUtils.parseValueToPt(String, float)>
	//   91  215:fstore          6
		  goto _L3
	//*  92  217:goto            153
		workercontext;
	//   93  220:astore_1        
		try
		{
			throw new PipelineException(((Exception) (workercontext)));
	//   94  221:new             #29  <Class PipelineException>
	//   95  224:dup             
	//   96  225:aload_1         
	//   97  226:invokespecial   #185 <Method void PipelineException(Exception)>
	//   98  229:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  99  230:astore_1        
		{
			throw new PipelineException(LocaleMessages.getInstance().getMessage("pipeline.autodoc.missingdep"), ((Exception) (workercontext)));
	//  100  231:new             #29  <Class PipelineException>
	//  101  234:dup             
	//  102  235:invokestatic    #190 <Method LocaleMessages LocaleMessages.getInstance()>
	//  103  238:ldc1            #192 <String "pipeline.autodoc.missingdep">
	//  104  240:invokevirtual   #196 <Method String LocaleMessages.getMessage(String)>
	//  105  243:aload_1         
	//  106  244:invokespecial   #95  <Method void PipelineException(String, Exception)>
	//  107  247:athrow          
		}
		workercontext;
	//  108  248:astore_1        
		throw new PipelineException(((Exception) (workercontext)));
	//  109  249:new             #29  <Class PipelineException>
	//  110  252:dup             
	//  111  253:aload_1         
	//  112  254:invokespecial   #185 <Method void PipelineException(Exception)>
	//  113  257:athrow          
_L2:
		if(!((String) (obj)).equalsIgnoreCase("margin-right")) goto _L5; else goto _L4
	//  114  258:aload           9
	//  115  260:ldc1            #198 <String "margin-right">
	//  116  262:invokevirtual   #127 <Method boolean String.equalsIgnoreCase(String)>
	//  117  265:ifeq            281
_L4:
		f1 = ((CssUtils) (processobject)).parseValueToPt(((String) (obj1)), f4);
	//  118  268:aload_3         
	//  119  269:aload           10
	//  120  271:fload           8
	//  121  273:invokevirtual   #182 <Method float CssUtils.parseValueToPt(String, float)>
	//  122  276:fstore          5
		  goto _L3
	//* 123  278:goto            153
_L5:
		if(!((String) (obj)).equalsIgnoreCase("margin-top")) goto _L7; else goto _L6
	//  124  281:aload           9
	//  125  283:ldc1            #200 <String "margin-top">
	//  126  285:invokevirtual   #127 <Method boolean String.equalsIgnoreCase(String)>
	//  127  288:ifeq            304
_L6:
		f = ((CssUtils) (processobject)).parseValueToPt(((String) (obj1)), f4);
	//  128  291:aload_3         
	//  129  292:aload           10
	//  130  294:fload           8
	//  131  296:invokevirtual   #182 <Method float CssUtils.parseValueToPt(String, float)>
	//  132  299:fstore          4
		  goto _L3
	//* 133  301:goto            153
_L7:
		if(!((String) (obj)).equalsIgnoreCase("margin-bottom")) goto _L3; else goto _L8
	//  134  304:aload           9
	//  135  306:ldc1            #202 <String "margin-bottom">
	//  136  308:invokevirtual   #127 <Method boolean String.equalsIgnoreCase(String)>
	//  137  311:ifeq            153
_L8:
		f3 = ((CssUtils) (processobject)).parseValueToPt(((String) (obj1)), f4);
	//  138  314:aload_3         
	//  139  315:aload           10
	//  140  317:fload           8
	//  141  319:invokevirtual   #182 <Method float CssUtils.parseValueToPt(String, float)>
	//  142  322:fstore          7
		  goto _L3
	//* 143  324:goto            153
		((Document) (workercontext)).setMargins(f2, f1, f, f3);
	//  144  327:aload_1         
	//  145  328:fload           6
	//  146  330:fload           5
	//  147  332:fload           4
	//  148  334:fload           7
	//  149  336:invokevirtual   #206 <Method boolean Document.setMargins(float, float, float, float)>
	//  150  339:pop             
		((Document) (workercontext)).open();
	//  151  340:aload_1         
	//  152  341:invokevirtual   #208 <Method void Document.open()>
		return getNext();
	//  153  344:aload_0         
	//  154  345:invokevirtual   #90  <Method Pipeline getNext()>
	//  155  348:areturn         
	}

	private final FileMaker fm;
	private final String opentag;
	private final Rectangle pagesize;
	private final String tag;
}
