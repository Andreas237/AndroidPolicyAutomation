// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioTrackPositionTracker

public static interface AudioTrackPositionTracker$Listener
{

	public abstract void onInvalidLatency(long l);

	public abstract void onPositionFramesMismatch(long l, long l1, long l2, long l3);

	public abstract void onSystemTimeUsMismatch(long l, long l1, long l2, long l3);

	public abstract void onUnderrun(int i, long l);
}
