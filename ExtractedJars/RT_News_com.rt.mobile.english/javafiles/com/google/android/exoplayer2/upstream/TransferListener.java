// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSpec

public interface TransferListener
{

	public abstract void onBytesTransferred(Object obj, int i);

	public abstract void onTransferEnd(Object obj);

	public abstract void onTransferStart(Object obj, DataSpec dataspec);
}
