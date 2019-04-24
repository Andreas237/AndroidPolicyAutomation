// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;


public interface TimeBar
{
	public static interface OnScrubListener
	{

		public abstract void onScrubMove(TimeBar timebar, long l);

		public abstract void onScrubStart(TimeBar timebar, long l);

		public abstract void onScrubStop(TimeBar timebar, long l, boolean flag);
	}


	public abstract void addListener(OnScrubListener onscrublistener);

	public abstract void removeListener(OnScrubListener onscrublistener);

	public abstract void setAdGroupTimesMs(long al[], boolean aflag[], int i);

	public abstract void setBufferedPosition(long l);

	public abstract void setDuration(long l);

	public abstract void setEnabled(boolean flag);

	public abstract void setKeyCountIncrement(int i);

	public abstract void setKeyTimeIncrement(long l);

	public abstract void setPosition(long l);
}
