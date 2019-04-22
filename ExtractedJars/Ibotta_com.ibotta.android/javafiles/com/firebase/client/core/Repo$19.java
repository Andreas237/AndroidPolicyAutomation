// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Tree;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$19
	implements com.firebase.client.core.utilities.eVisitor
{

	public void visitTree(Tree tree)
	{
		Repo.access$2800(Repo.this, val$queue, tree);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Repo this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field List val$queue>
	//    4    8:aload_1         
	//    5    9:invokestatic    #32  <Method void Repo.access$2800(Repo, List, Tree)>
	//    6   12:return          
	}

	final Repo this$0;
	final List val$queue;

	Repo$19()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Repo this$0>
		val$queue = List.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field List val$queue>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
