// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.tool.xml.pipeline.ctx.WorkerContextImpl;

// Referenced classes of package com.itextpdf.tool.xml:
//			XMLWorker

static final class XMLWorker$1 extends ThreadLocal
{

	protected WorkerContextImpl initialValue()
	{
		return new WorkerContextImpl();
	//    0    0:new             #16  <Class WorkerContextImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void WorkerContextImpl()>
	//    3    7:areturn         
	}

	protected volatile Object initialValue()
	{
		return ((Object) (initialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method WorkerContextImpl initialValue()>
	//    2    4:areturn         
	}

	XMLWorker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ThreadLocal()>
	//    2    4:return          
	}
}
