// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.shopkick.app.util.GlideRequests;

// Referenced classes of package com.bumptech.glide:
//			Glide, RequestManager

final class GeneratedRequestManagerFactory
	implements com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
{

	GeneratedRequestManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode, Context context)
	{
		return ((RequestManager) (new GlideRequests(glide, lifecycle, requestmanagertreenode, context)));
	//    0    0:new             #16  <Class GlideRequests>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #19  <Method void GlideRequests(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//    7   12:areturn         
	}
}
