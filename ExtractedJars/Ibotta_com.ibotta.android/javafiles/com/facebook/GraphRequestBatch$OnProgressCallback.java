// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			GraphRequestBatch

public static interface GraphRequestBatch$OnProgressCallback
	extends GraphRequestBatch.Callback
{

	public abstract void onBatchProgress(GraphRequestBatch graphrequestbatch, long l, long l1);
}
