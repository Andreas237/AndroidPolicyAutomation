// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			CompoundWrite, Path

class CompoundWrite$1
	implements com.firebase.client.core.utilities.eeVisitor
{

	public CompoundWrite onNodeValue(Path path1, Node node, CompoundWrite compoundwrite)
	{
		return compoundwrite.addWrite(val$path.child(path1), node);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Path val$path>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method Path Path.child(Path)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #38  <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//    7   13:areturn         
	}

	public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path1, (Node)obj, (CompoundWrite)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #41  <Class Node>
	//    4    6:aload_3         
	//    5    7:checkcast       #9   <Class CompoundWrite>
	//    6   10:invokevirtual   #43  <Method CompoundWrite onNodeValue(Path, Node, CompoundWrite)>
	//    7   13:areturn         
	}

	final CompoundWrite this$0;
	final Path val$path;

	CompoundWrite$1()
	{
		this$0 = final_compoundwrite;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CompoundWrite this$0>
		val$path = Path.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Path val$path>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
