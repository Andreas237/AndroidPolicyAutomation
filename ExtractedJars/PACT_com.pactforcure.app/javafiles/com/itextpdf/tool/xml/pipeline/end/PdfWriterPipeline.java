// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.end;

import com.itextpdf.text.*;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.pipeline.AbstractPipeline;
import com.itextpdf.tool.xml.pipeline.WritableElement;
import com.itextpdf.tool.xml.pipeline.ctx.MapContext;
import java.util.Iterator;
import java.util.List;

public class PdfWriterPipeline extends AbstractPipeline
{

	public PdfWriterPipeline()
	{
		super(((Pipeline) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #35  <Method void AbstractPipeline(Pipeline)>
	//    3    5:return          
	}

	public PdfWriterPipeline(Document document, PdfWriter pdfwriter)
	{
		super(((Pipeline) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #35  <Method void AbstractPipeline(Pipeline)>
		doc = document;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #38  <Field Document doc>
		writer = pdfwriter;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #40  <Field PdfWriter writer>
		continiously = Boolean.valueOf(true);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   12   20:putfield        #48  <Field Boolean continiously>
	//   13   23:return          
	}

	public PdfWriterPipeline(Pipeline pipeline)
	{
		super(pipeline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void AbstractPipeline(Pipeline)>
	//    3    5:return          
	}

	private void write(WorkerContext workercontext, ProcessObject processobject)
		throws PipelineException
	{
label0:
		{
			MapContext mapcontext = (MapContext)getLocalContext(workercontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method com.itextpdf.tool.xml.CustomContext getLocalContext(WorkerContext)>
	//    3    5:checkcast       #62  <Class MapContext>
	//    4    8:astore          4
			if(!processobject.containsWritable())
				break label0;
	//    5   10:aload_2         
	//    6   11:invokevirtual   #68  <Method boolean ProcessObject.containsWritable()>
	//    7   14:ifeq            180
			workercontext = ((WorkerContext) ((Document)mapcontext.get("DOCUMENT")));
	//    8   17:aload           4
	//    9   19:ldc1            #10  <String "DOCUMENT">
	//   10   21:invokevirtual   #72  <Method Object MapContext.get(String)>
	//   11   24:checkcast       #74  <Class Document>
	//   12   27:astore_1        
			boolean flag = ((Boolean)mapcontext.get("CONTINUOUS")).booleanValue();
	//   13   28:aload           4
	//   14   30:ldc1            #8   <String "CONTINUOUS">
	//   15   32:invokevirtual   #72  <Method Object MapContext.get(String)>
	//   16   35:checkcast       #42  <Class Boolean>
	//   17   38:invokevirtual   #77  <Method boolean Boolean.booleanValue()>
	//   18   41:istore_3        
			do
			{
				Object obj;
				do
				{
					obj = ((Object) (processobject.poll()));
	//   19   42:aload_2         
	//   20   43:invokevirtual   #81  <Method com.itextpdf.tool.xml.Writable ProcessObject.poll()>
	//   21   46:astore          4
					if(obj == null)
						break label0;
	//   22   48:aload           4
	//   23   50:ifnull          180
				} while(!(obj instanceof WritableElement));
	//   24   53:aload           4
	//   25   55:instanceof      #83  <Class WritableElement>
	//   26   58:ifeq            42
				obj = ((Object) (((WritableElement)obj).elements().iterator()));
	//   27   61:aload           4
	//   28   63:checkcast       #83  <Class WritableElement>
	//   29   66:invokevirtual   #87  <Method List WritableElement.elements()>
	//   30   69:invokeinterface #93  <Method Iterator List.iterator()>
	//   31   74:astore          4
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   32   76:aload           4
	//   33   78:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   34   83:ifeq            42
					Element element = (Element)((Iterator) (obj)).next();
	//   35   86:aload           4
	//   36   88:invokeinterface #102 <Method Object Iterator.next()>
	//   37   93:checkcast       #104 <Class Element>
	//   38   96:astore          5
					try
					{
						if(!((Document) (workercontext)).add(element))
	//*  39   98:aload_1         
	//*  40   99:aload           5
	//*  41  101:invokevirtual   #108 <Method boolean Document.add(Element)>
	//*  42  104:ifne            76
							LOG.trace(String.format(LocaleMessages.getInstance().getMessage("pipeline.pdfwriter.elemnotadded"), new Object[] {
								element.toString()
							}));
	//   43  107:getstatic       #30  <Field Logger LOG>
	//   44  110:invokestatic    #114 <Method LocaleMessages LocaleMessages.getInstance()>
	//   45  113:ldc1            #116 <String "pipeline.pdfwriter.elemnotadded">
	//   46  115:invokevirtual   #120 <Method String LocaleMessages.getMessage(String)>
	//   47  118:iconst_1        
	//   48  119:anewarray       Object[]
	//   49  122:dup             
	//   50  123:iconst_0        
	//   51  124:aload           5
	//   52  126:invokeinterface #126 <Method String Element.toString()>
	//   53  131:aastore         
	//   54  132:invokestatic    #132 <Method String String.format(String, Object[])>
	//   55  135:invokeinterface #138 <Method void Logger.trace(String)>
					}
	//*  56  140:goto            76
					catch(DocumentException documentexception)
	//*  57  143:astore          5
					{
						if(!flag)
	//*  58  145:iload_3         
	//*  59  146:ifne            159
							throw new PipelineException(((Exception) (documentexception)));
	//   60  149:new             #54  <Class PipelineException>
	//   61  152:dup             
	//   62  153:aload           5
	//   63  155:invokespecial   #141 <Method void PipelineException(Exception)>
	//   64  158:athrow          
						LOG.error(LocaleMessages.getInstance().getMessage("pipeline.pdfwriter.elemnotaddedexc"), ((Exception) (documentexception)));
	//   65  159:getstatic       #30  <Field Logger LOG>
	//   66  162:invokestatic    #114 <Method LocaleMessages LocaleMessages.getInstance()>
	//   67  165:ldc1            #143 <String "pipeline.pdfwriter.elemnotaddedexc">
	//   68  167:invokevirtual   #120 <Method String LocaleMessages.getMessage(String)>
	//   69  170:aload           5
	//   70  172:invokeinterface #147 <Method void Logger.error(String, Exception)>
					}
				} while(true);
	//   71  177:goto            76
			} while(true);
		}
	//   72  180:return          
	}

	public Pipeline close(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		write(workercontext, processobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #152 <Method void write(WorkerContext, ProcessObject)>
		return getNext();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #156 <Method Pipeline getNext()>
	//    6   10:areturn         
	}

	public Pipeline content(WorkerContext workercontext, Tag tag, String s, ProcessObject processobject)
		throws PipelineException
	{
		write(workercontext, processobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:invokespecial   #152 <Method void write(WorkerContext, ProcessObject)>
		return getNext();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #156 <Method Pipeline getNext()>
	//    6   11:areturn         
	}

	public Pipeline init(WorkerContext workercontext)
		throws PipelineException
	{
		MapContext mapcontext = new MapContext();
	//    0    0:new             #62  <Class MapContext>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void MapContext()>
	//    3    7:astore_2        
		continiously = Boolean.TRUE;
	//    4    8:aload_0         
	//    5    9:getstatic       #167 <Field Boolean Boolean.TRUE>
	//    6   12:putfield        #48  <Field Boolean continiously>
		mapcontext.put("CONTINUOUS", ((Object) (continiously)));
	//    7   15:aload_2         
	//    8   16:ldc1            #8   <String "CONTINUOUS">
	//    9   18:aload_0         
	//   10   19:getfield        #48  <Field Boolean continiously>
	//   11   22:invokevirtual   #171 <Method void MapContext.put(String, Object)>
		if(doc != null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #38  <Field Document doc>
	//*  14   29:ifnull          42
			mapcontext.put("DOCUMENT", ((Object) (doc)));
	//   15   32:aload_2         
	//   16   33:ldc1            #10  <String "DOCUMENT">
	//   17   35:aload_0         
	//   18   36:getfield        #38  <Field Document doc>
	//   19   39:invokevirtual   #171 <Method void MapContext.put(String, Object)>
		if(writer != null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #40  <Field PdfWriter writer>
	//*  22   46:ifnull          59
			mapcontext.put("WRITER", ((Object) (writer)));
	//   23   49:aload_2         
	//   24   50:ldc1            #14  <String "WRITER">
	//   25   52:aload_0         
	//   26   53:getfield        #40  <Field PdfWriter writer>
	//   27   56:invokevirtual   #171 <Method void MapContext.put(String, Object)>
		workercontext.put(getContextKey(), ((com.itextpdf.tool.xml.CustomContext) (mapcontext)));
	//   28   59:aload_1         
	//   29   60:aload_0         
	//   30   61:invokevirtual   #174 <Method String getContextKey()>
	//   31   64:aload_2         
	//   32   65:invokeinterface #179 <Method void WorkerContext.put(String, com.itextpdf.tool.xml.CustomContext)>
		return super.init(workercontext);
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:invokespecial   #181 <Method Pipeline AbstractPipeline.init(WorkerContext)>
	//   36   75:areturn         
	}

	public Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		write(workercontext, processobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #152 <Method void write(WorkerContext, ProcessObject)>
		return getNext();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #156 <Method Pipeline getNext()>
	//    6   10:areturn         
	}

	public void setDocument(Document document)
	{
		doc = document;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field Document doc>
	//    3    5:return          
	}

	public void setWriter(PdfWriter pdfwriter)
	{
		writer = pdfwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field PdfWriter writer>
	//    3    5:return          
	}

	public static final String CONTINUOUS = "CONTINUOUS";
	public static final String DOCUMENT = "DOCUMENT";
	private static final Logger LOG = LoggerFactory.getLogger(com/itextpdf/tool/xml/pipeline/end/PdfWriterPipeline);
	public static final String WRITER = "WRITER";
	private Boolean continiously;
	private Document doc;
	private PdfWriter writer;

	static 
	{
	//    0    0:ldc1            #2   <Class PdfWriterPipeline>
	//    1    2:invokestatic    #28  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #30  <Field Logger LOG>
	//*   3    8:return          
	}
}
