// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecAudioTrackRenderer

public static interface MediaCodecAudioTrackRenderer$EventListener
	extends MediaCodecTrackRenderer.EventListener
{

	public abstract void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

	public abstract void onAudioTrackUnderrun(int i, long l, long l1);

	public abstract void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);
}
