// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


public interface Decoder
{

	public abstract Object dequeueInputBuffer()
		throws Exception;

	public abstract Object dequeueOutputBuffer()
		throws Exception;

	public abstract void flush();

	public abstract String getName();

	public abstract void queueInputBuffer(Object obj)
		throws Exception;

	public abstract void release();
}
