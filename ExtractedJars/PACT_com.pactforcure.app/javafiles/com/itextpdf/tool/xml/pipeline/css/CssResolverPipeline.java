// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.css;

import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.pipeline.AbstractPipeline;
import com.itextpdf.tool.xml.pipeline.ctx.ObjectContext;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.css:
//			CSSResolver

public class CssResolverPipeline extends AbstractPipeline
{

	public CssResolverPipeline(CSSResolver cssresolver, Pipeline pipeline)
	{
		super(pipeline);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void AbstractPipeline(Pipeline)>
		resolver = cssresolver;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #17  <Field CSSResolver resolver>
	//    6   10:return          
	}

	public String getContextKey()
	{
		return ((Class) (com/itextpdf/tool/xml/pipeline/css/CssResolverPipeline)).getName();
	//    0    0:ldc1            #2   <Class CssResolverPipeline>
	//    1    2:invokevirtual   #27  <Method String Class.getName()>
	//    2    5:areturn         
	}

	public Pipeline init(WorkerContext workercontext)
		throws PipelineException
	{
		try
		{
			ObjectContext objectcontext = new ObjectContext(((Object) (resolver.clear())));
	//    0    0:new             #35  <Class ObjectContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field CSSResolver resolver>
	//    4    8:invokeinterface #41  <Method CSSResolver CSSResolver.clear()>
	//    5   13:invokespecial   #44  <Method void ObjectContext(Object)>
	//    6   16:astore_2        
			workercontext.put(getContextKey(), ((com.itextpdf.tool.xml.CustomContext) (objectcontext)));
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:invokevirtual   #46  <Method String getContextKey()>
	//   10   22:aload_2         
	//   11   23:invokeinterface #52  <Method void WorkerContext.put(String, com.itextpdf.tool.xml.CustomContext)>
			workercontext = ((WorkerContext) (super.init(workercontext)));
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokespecial   #54  <Method Pipeline AbstractPipeline.init(WorkerContext)>
	//   15   33:astore_1        
		}
	//*  16   34:aload_1         
	//*  17   35:areturn         
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  18   36:astore_1        
		{
			throw new PipelineException(((Exception) (workercontext)));
	//   19   37:new             #31  <Class PipelineException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokespecial   #57  <Method void PipelineException(Exception)>
	//   23   45:athrow          
		}
		return ((Pipeline) (workercontext));
	}

	public Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		((CSSResolver)((ObjectContext)getLocalContext(workercontext)).get()).resolveStyles(tag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method com.itextpdf.tool.xml.CustomContext getLocalContext(WorkerContext)>
	//    3    5:checkcast       #35  <Class ObjectContext>
	//    4    8:invokevirtual   #69  <Method Object ObjectContext.get()>
	//    5   11:checkcast       #37  <Class CSSResolver>
	//    6   14:aload_2         
	//    7   15:invokeinterface #73  <Method void CSSResolver.resolveStyles(Tag)>
		return getNext();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #77  <Method Pipeline getNext()>
	//   10   24:areturn         
	}

	public void setResolver(CSSResolver cssresolver)
	{
		resolver = cssresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CSSResolver resolver>
	//    3    5:return          
	}

	public static final String CSS_RESOLVER = "CSS_RESOLVER";
	private CSSResolver resolver;
}
