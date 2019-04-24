// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor

public class Span extends AbstractTagProcessor
{

	public Span()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return textContent(workercontext, tag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #14  <Method List textContent(WorkerContext, Tag, String)>
	//    5    7:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		return currentContentToParagraph(list, false, true, tag, workercontext);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:aload_2         
	//    5    5:aload_1         
	//    6    6:invokevirtual   #22  <Method List currentContentToParagraph(List, boolean, boolean, Tag, WorkerContext)>
	//    7    9:areturn         
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
