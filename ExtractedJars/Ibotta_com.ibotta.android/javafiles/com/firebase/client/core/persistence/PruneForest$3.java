// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.Path;

// Referenced classes of package com.firebase.client.core.persistence:
//			PruneForest

class PruneForest$3
	implements com.firebase.client.core.utilities.TreeVisitor
{

	public Object onNodeValue(Path path, Boolean boolean1, Object obj)
	{
		if(!boolean1.booleanValue())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//*   2    4:ifne            20
			return val$treeVisitor.onNodeValue(path, ((Object) (null)), obj);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field com.firebase.client.core.utilities.ImmutableTree$TreeVisitor val$treeVisitor>
	//    5   11:aload_1         
	//    6   12:aconst_null     
	//    7   13:aload_3         
	//    8   14:invokeinterface #37  <Method Object com.firebase.client.core.utilities.ImmutableTree$TreeVisitor.onNodeValue(Path, Object, Object)>
	//    9   19:areturn         
		else
			return obj;
	//   10   20:aload_3         
	//   11   21:areturn         
	}

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return onNodeValue(path, (Boolean)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #30  <Class Boolean>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #41  <Method Object onNodeValue(Path, Boolean, Object)>
	//    6   10:areturn         
	}

	final PruneForest this$0;
	final com.firebase.client.core.utilities.TreeVisitor val$treeVisitor;

	PruneForest$3()
	{
		this$0 = final_pruneforest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field PruneForest this$0>
		val$treeVisitor = com.firebase.client.core.utilities.TreeVisitor.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field com.firebase.client.core.utilities.ImmutableTree$TreeVisitor val$treeVisitor>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
