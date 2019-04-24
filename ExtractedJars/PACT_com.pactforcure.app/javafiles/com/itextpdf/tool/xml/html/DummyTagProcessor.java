// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			TagProcessor

public class DummyTagProcessor
	implements TagProcessor
{

	public DummyTagProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	public List endElement(WorkerContext workercontext, Tag tag, List list)
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	public boolean isStackOwner()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List startElement(WorkerContext workercontext, Tag tag)
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:areturn         
	}
}
