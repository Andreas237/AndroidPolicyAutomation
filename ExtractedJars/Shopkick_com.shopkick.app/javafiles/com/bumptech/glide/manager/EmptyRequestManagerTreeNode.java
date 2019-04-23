// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerTreeNode

final class EmptyRequestManagerTreeNode
	implements RequestManagerTreeNode
{

	EmptyRequestManagerTreeNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Set getDescendants()
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #19  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}
}
