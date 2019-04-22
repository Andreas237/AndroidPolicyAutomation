// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Tree;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$20
	implements com.firebase.client.core.utilities.eFilter
{

	public boolean filterTreeNode(Tree tree)
	{
		Repo.access$2900(Repo.this, tree, val$reason);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Repo this$0>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int val$reason>
	//    5    9:invokestatic    #32  <Method void Repo.access$2900(Repo, Tree, int)>
		return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	final Repo this$0;
	final int val$reason;

	Repo$20()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Repo this$0>
		val$reason = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$reason>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
