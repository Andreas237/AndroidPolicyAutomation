// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline;

import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;

public abstract class AbstractPipeline
	implements Pipeline
{

	public AbstractPipeline(Pipeline pipeline)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		setNext(pipeline);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #18  <Method void setNext(Pipeline)>
	//    5    9:return          
	}

	public Pipeline close(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		return getNext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Pipeline getNext()>
	//    2    4:areturn         
	}

	public Pipeline content(WorkerContext workercontext, Tag tag, String s, ProcessObject processobject)
		throws PipelineException
	{
		return getNext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Pipeline getNext()>
	//    2    4:areturn         
	}

	public String getContextKey()
	{
		return ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #45  <Method String Class.getName()>
	//    3    7:areturn         
	}

	public CustomContext getLocalContext(WorkerContext workercontext)
		throws PipelineException
	{
		try
		{
			workercontext = ((WorkerContext) (workercontext.get(getContextKey())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #51  <Method String getContextKey()>
	//    3    5:invokeinterface #57  <Method CustomContext WorkerContext.get(String)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          17
	//*   7   15:aload_1         
	//*   8   16:areturn         
	//*   9   17:new             #25  <Class PipelineException>
	//*  10   20:dup             
	//*  11   21:invokestatic    #63  <Method LocaleMessages LocaleMessages.getInstance()>
	//*  12   24:ldc1            #65  <String "pipeline.owncontextmissing">
	//*  13   26:invokevirtual   #69  <Method String LocaleMessages.getMessage(String)>
	//*  14   29:iconst_1        
	//*  15   30:anewarray       Object[]
	//*  16   33:dup             
	//*  17   34:iconst_0        
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #40  <Method Class Object.getClass()>
	//*  20   39:invokevirtual   #45  <Method String Class.getName()>
	//*  21   42:aastore         
	//*  22   43:invokestatic    #75  <Method String String.format(String, Object[])>
	//*  23   46:invokespecial   #78  <Method void PipelineException(String)>
	//*  24   49:athrow          
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  25   50:astore_1        
		{
			throw new PipelineException(String.format(LocaleMessages.getInstance().getMessage("pipeline.owncontextmissing"), new Object[] {
				((Object)this).getClass().getName()
			}), ((Exception) (workercontext)));
	//   26   51:new             #25  <Class PipelineException>
	//   27   54:dup             
	//   28   55:invokestatic    #63  <Method LocaleMessages LocaleMessages.getInstance()>
	//   29   58:ldc1            #65  <String "pipeline.owncontextmissing">
	//   30   60:invokevirtual   #69  <Method String LocaleMessages.getMessage(String)>
	//   31   63:iconst_1        
	//   32   64:anewarray       Object[]
	//   33   67:dup             
	//   34   68:iconst_0        
	//   35   69:aload_0         
	//   36   70:invokevirtual   #40  <Method Class Object.getClass()>
	//   37   73:invokevirtual   #45  <Method String Class.getName()>
	//   38   76:aastore         
	//   39   77:invokestatic    #75  <Method String String.format(String, Object[])>
	//   40   80:aload_1         
	//   41   81:invokespecial   #81  <Method void PipelineException(String, Exception)>
	//   42   84:athrow          
		}
		if(workercontext != null)
			return ((CustomContext) (workercontext));
		throw new PipelineException(String.format(LocaleMessages.getInstance().getMessage("pipeline.owncontextmissing"), new Object[] {
			((Object)this).getClass().getName()
		}));
	}

	public Pipeline getNext()
	{
		return next;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Pipeline next>
	//    2    4:areturn         
	}

	public Pipeline init(WorkerContext workercontext)
		throws PipelineException
	{
		return getNext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Pipeline getNext()>
	//    2    4:areturn         
	}

	public Pipeline open(WorkerContext workercontext, Tag tag, ProcessObject processobject)
		throws PipelineException
	{
		return getNext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Pipeline getNext()>
	//    2    4:areturn         
	}

	public void setNext(Pipeline pipeline)
	{
		next = pipeline;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Pipeline next>
	//    3    5:return          
	}

	private Pipeline next;
}
