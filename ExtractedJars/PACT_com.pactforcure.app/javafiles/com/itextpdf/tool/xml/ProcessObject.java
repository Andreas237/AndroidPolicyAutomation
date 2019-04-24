// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml:
//			Writable

public class ProcessObject
{

	public ProcessObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void LinkedList()>
	//    6   12:putfield        #16  <Field Queue queue>
	//    7   15:return          
	}

	public void add(Writable writable)
	{
		queue.add(((Object) (writable)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Queue queue>
	//    2    4:aload_1         
	//    3    5:invokeinterface #24  <Method boolean Queue.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void addAll(List list)
	{
		queue.addAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Queue queue>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method boolean Queue.addAll(java.util.Collection)>
	//    4   10:pop             
	//    5   11:return          
	}

	public boolean containsWritable()
	{
		return !queue.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Queue queue>
	//    2    4:invokeinterface #36  <Method boolean Queue.isEmpty()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public Writable poll()
	{
		return (Writable)queue.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Queue queue>
	//    2    4:invokeinterface #41  <Method Object Queue.poll()>
	//    3    9:checkcast       #43  <Class Writable>
	//    4   12:areturn         
	}

	private final Queue queue = new LinkedList();
}
