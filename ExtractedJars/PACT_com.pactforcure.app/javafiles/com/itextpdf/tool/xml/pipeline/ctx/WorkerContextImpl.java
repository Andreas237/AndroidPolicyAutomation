// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.ctx;

import com.itextpdf.tool.xml.*;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.ctx:
//			MapContext

public class WorkerContextImpl
	implements WorkerContext
{

	public WorkerContextImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class MapContext>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void MapContext()>
	//    6   12:putfield        #19  <Field MapContext mc>
	//    7   15:return          
	}

	public CustomContext get(String s)
		throws NoCustomContextException
	{
		s = ((String) (mc.get(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MapContext mc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Object MapContext.get(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			return (CustomContext)s;
	//    7   13:aload_1         
	//    8   14:checkcast       #29  <Class CustomContext>
	//    9   17:areturn         
		else
			throw new NoCustomContextException();
	//   10   18:new             #24  <Class NoCustomContextException>
	//   11   21:dup             
	//   12   22:invokespecial   #30  <Method void NoCustomContextException()>
	//   13   25:athrow          
	}

	public Tag getCurrentTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Tag tag>
	//    2    4:areturn         
	}

	public void put(String s, CustomContext customcontext)
	{
		mc.put(s, ((Object) (customcontext)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MapContext mc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #40  <Method void MapContext.put(String, Object)>
	//    5    9:return          
	}

	public void setCurrentTag(Tag tag1)
	{
		tag = tag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Tag tag>
	//    3    5:return          
	}

	private final MapContext mc = new MapContext();
	private Tag tag;
}
