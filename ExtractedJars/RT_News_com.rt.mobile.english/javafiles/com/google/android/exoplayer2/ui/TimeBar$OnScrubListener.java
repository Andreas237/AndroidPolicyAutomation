// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;


// Referenced classes of package com.google.android.exoplayer2.ui:
//			TimeBar

public static interface TimeBar$OnScrubListener
{

	public abstract void onScrubMove(TimeBar timebar, long l);

	public abstract void onScrubStart(TimeBar timebar, long l);

	public abstract void onScrubStop(TimeBar timebar, long l, boolean flag);
}
