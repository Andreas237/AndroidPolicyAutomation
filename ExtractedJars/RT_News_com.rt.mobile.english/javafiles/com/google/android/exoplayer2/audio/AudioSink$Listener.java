// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioSink

public static interface AudioSink$Listener
{

	public abstract void onAudioSessionId(int i);

	public abstract void onPositionDiscontinuity();

	public abstract void onUnderrun(int i, long l, long l1);
}
