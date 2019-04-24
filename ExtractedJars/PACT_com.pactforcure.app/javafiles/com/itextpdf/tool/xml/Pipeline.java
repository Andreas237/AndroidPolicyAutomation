// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;


// Referenced classes of package com.itextpdf.tool.xml:
//			PipelineException, WorkerContext, Tag, ProcessObject

public interface Pipeline
{

	public abstract Pipeline close(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException;

	public abstract Pipeline content(WorkerContext workercontext, Tag tag, String s, ProcessObject processobject)
		throws PipelineException;

	public abstract Pipeline getNext();

	public abstract Pipeline init(WorkerContext workercontext)
		throws PipelineException;

	public abstract Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException;
}
