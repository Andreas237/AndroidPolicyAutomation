// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import java.util.List;

public interface Subtitle
{

	public abstract List getCues(long l);

	public abstract long getEventTime(int i);

	public abstract int getEventTimeCount();

	public abstract int getNextEventTimeIndex(long l);
}
