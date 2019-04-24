// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


public interface SequenceableLoader
{
	public static interface Callback
	{

		public abstract void onContinueLoadingRequested(SequenceableLoader sequenceableloader);
	}


	public abstract boolean continueLoading(long l);

	public abstract long getBufferedPositionUs();

	public abstract long getNextLoadPositionUs();

	public abstract void reevaluateBuffer(long l);
}
