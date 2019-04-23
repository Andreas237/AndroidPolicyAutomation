// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerRetriever, Lifecycle, RequestManagerTreeNode

public static interface RequestManagerRetriever$RequestManagerFactory
{

	public abstract RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode, Context context);
}
