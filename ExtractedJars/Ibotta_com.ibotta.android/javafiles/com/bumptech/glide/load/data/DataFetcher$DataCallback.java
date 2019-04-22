// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;


// Referenced classes of package com.bumptech.glide.load.data:
//			DataFetcher

public static interface DataFetcher$DataCallback
{

	public abstract void onDataReady(Object obj);

	public abstract void onLoadFailed(Exception exception);
}
