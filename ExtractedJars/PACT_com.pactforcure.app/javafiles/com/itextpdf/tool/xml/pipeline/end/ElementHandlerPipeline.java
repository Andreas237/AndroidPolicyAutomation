// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.end;

import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.pipeline.AbstractPipeline;

public class ElementHandlerPipeline extends AbstractPipeline
{

	public ElementHandlerPipeline(ElementHandler elementhandler, Pipeline pipeline)
	{
		super(pipeline);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #11  <Method void AbstractPipeline(Pipeline)>
		handler = elementhandler;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field ElementHandler handler>
	//    6   10:return          
	}

	private void consume(ProcessObject processobject)
	{
		if(processobject.containsWritable())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method boolean ProcessObject.containsWritable()>
	//*   2    4:ifeq            29
			do
			{
				com.itextpdf.tool.xml.Writable writable = processobject.poll();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #26  <Method com.itextpdf.tool.xml.Writable ProcessObject.poll()>
	//    5   11:astore_2        
				if(writable == null)
					break;
	//    6   12:aload_2         
	//    7   13:ifnull          29
				handler.add(writable);
	//    8   16:aload_0         
	//    9   17:getfield        #13  <Field ElementHandler handler>
	//   10   20:aload_2         
	//   11   21:invokeinterface #32  <Method void ElementHandler.add(com.itextpdf.tool.xml.Writable)>
			} while(true);
	//   12   26:goto            7
	//   13   29:return          
	}

	public Pipeline close(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		consume(processobject);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #38  <Method void consume(ProcessObject)>
		return getNext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #42  <Method Pipeline getNext()>
	//    5    9:areturn         
	}

	public Pipeline content(WorkerContext workercontext, Tag tag, String s, ProcessObject processobject)
		throws PipelineException
	{
		consume(processobject);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #38  <Method void consume(ProcessObject)>
		return getNext();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #42  <Method Pipeline getNext()>
	//    5   10:areturn         
	}

	public Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		consume(processobject);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #38  <Method void consume(ProcessObject)>
		return getNext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #42  <Method Pipeline getNext()>
	//    5    9:areturn         
	}

	private final ElementHandler handler;
}
