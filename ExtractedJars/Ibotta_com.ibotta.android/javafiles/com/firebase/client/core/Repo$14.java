// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Tree;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$14
	implements com.firebase.client.core.utilities.eVisitor
{

	public void visitTree(Tree tree)
	{
		Repo.access$1700(Repo.this, tree);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Repo this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void Repo.access$1700(Repo, Tree)>
	//    4    8:return          
	}

	final Repo this$0;

	Repo$14()
	{
		this$0 = Repo.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Repo this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
