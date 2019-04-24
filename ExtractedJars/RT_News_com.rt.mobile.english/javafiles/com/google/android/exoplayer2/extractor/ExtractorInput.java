// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import java.io.IOException;

public interface ExtractorInput
{

	public abstract void advancePeekPosition(int i)
		throws IOException, InterruptedException;

	public abstract boolean advancePeekPosition(int i, boolean flag)
		throws IOException, InterruptedException;

	public abstract long getLength();

	public abstract long getPeekPosition();

	public abstract long getPosition();

	public abstract void peekFully(byte abyte0[], int i, int j)
		throws IOException, InterruptedException;

	public abstract boolean peekFully(byte abyte0[], int i, int j, boolean flag)
		throws IOException, InterruptedException;

	public abstract int read(byte abyte0[], int i, int j)
		throws IOException, InterruptedException;

	public abstract void readFully(byte abyte0[], int i, int j)
		throws IOException, InterruptedException;

	public abstract boolean readFully(byte abyte0[], int i, int j, boolean flag)
		throws IOException, InterruptedException;

	public abstract void resetPeekPosition();

	public abstract void setRetryPosition(long l, Throwable throwable)
		throws Throwable;

	public abstract int skip(int i)
		throws IOException, InterruptedException;

	public abstract void skipFully(int i)
		throws IOException, InterruptedException;

	public abstract boolean skipFully(int i, boolean flag)
		throws IOException, InterruptedException;
}
