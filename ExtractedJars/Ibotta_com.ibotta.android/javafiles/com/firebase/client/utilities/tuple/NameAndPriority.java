// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities.tuple;

import com.firebase.client.snapshot.*;

public class NameAndPriority
	implements Comparable
{

	public NameAndPriority(ChildKey childkey, Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		name = childkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ChildKey name>
		priority = node;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Node priority>
	//    8   14:return          
	}

	public int compareTo(NameAndPriority nameandpriority)
	{
		return NodeUtilities.nameAndPriorityCompare(name, priority, nameandpriority.name, nameandpriority.priority);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ChildKey name>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Node priority>
	//    4    8:aload_1         
	//    5    9:getfield        #18  <Field ChildKey name>
	//    6   12:aload_1         
	//    7   13:getfield        #20  <Field Node priority>
	//    8   16:invokestatic    #29  <Method int NodeUtilities.nameAndPriorityCompare(ChildKey, Node, ChildKey, Node)>
	//    9   19:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((NameAndPriority)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class NameAndPriority>
	//    3    5:invokevirtual   #32  <Method int compareTo(NameAndPriority)>
	//    4    8:ireturn         
	}

	public ChildKey getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ChildKey name>
	//    2    4:areturn         
	}

	public Node getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Node priority>
	//    2    4:areturn         
	}

	private ChildKey name;
	private Node priority;
}
