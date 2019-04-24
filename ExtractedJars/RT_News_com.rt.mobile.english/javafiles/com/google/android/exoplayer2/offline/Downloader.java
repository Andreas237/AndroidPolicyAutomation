// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import java.io.IOException;

public interface Downloader
{

	public abstract void cancel();

	public abstract void download()
		throws InterruptedException, IOException;

	public abstract float getDownloadPercentage();

	public abstract long getDownloadedBytes();

	public abstract void remove()
		throws InterruptedException;
}
