// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequestBatch;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private static interface LikeActionController$RequestWrapper
{

	public abstract void addToBatch(GraphRequestBatch graphrequestbatch);

	public abstract FacebookRequestError getError();
}
