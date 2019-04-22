// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			CompoundHash

static final class CompoundHash$1 extends com.firebase.client.snapshot.ildVisitor
{

	public void visitChild(ChildKey childkey, Node node)
	{
		mpoundHashBuilder.access._mth400(val$state, childkey);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CompoundHash$CompoundHashBuilder val$state>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void CompoundHash$CompoundHashBuilder.access$400(CompoundHash$CompoundHashBuilder, ChildKey)>
		CompoundHash.access$500(node, val$state);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field CompoundHash$CompoundHashBuilder val$state>
	//    7   13:invokestatic    #30  <Method void CompoundHash.access$500(Node, CompoundHash$CompoundHashBuilder)>
		mpoundHashBuilder.access._mth600(val$state);
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field CompoundHash$CompoundHashBuilder val$state>
	//   10   20:invokestatic    #33  <Method void CompoundHash$CompoundHashBuilder.access$600(CompoundHash$CompoundHashBuilder)>
	//   11   23:return          
	}

	final mpoundHashBuilder val$state;

	CompoundHash$1(mpoundHashBuilder mpoundhashbuilder)
	{
		val$state = mpoundhashbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CompoundHash$CompoundHashBuilder val$state>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.firebase.client.snapshot.ChildrenNode$ChildVisitor()>
	//    5    9:return          
	}
}
