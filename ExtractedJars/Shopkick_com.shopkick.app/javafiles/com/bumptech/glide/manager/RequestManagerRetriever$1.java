// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerRetriever, Lifecycle, RequestManagerTreeNode

class RequestManagerRetriever$1
	implements questManagerFactory
{

	public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode, Context context)
	{
		return new RequestManager(glide, lifecycle, requestmanagertreenode, context);
	//    0    0:new             #18  <Class RequestManager>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #21  <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//    7   12:areturn         
	}

	RequestManagerRetriever$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
