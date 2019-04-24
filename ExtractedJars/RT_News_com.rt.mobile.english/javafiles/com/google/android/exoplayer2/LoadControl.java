// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.Allocator;

// Referenced classes of package com.google.android.exoplayer2:
//			Renderer

public interface LoadControl
{

	public abstract Allocator getAllocator();

	public abstract long getBackBufferDurationUs();

	public abstract void onPrepared();

	public abstract void onReleased();

	public abstract void onStopped();

	public abstract void onTracksSelected(Renderer arenderer[], TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray);

	public abstract boolean retainBackBufferFromKeyframe();

	public abstract boolean shouldContinueLoading(long l, float f);

	public abstract boolean shouldStartPlayback(long l, float f, boolean flag);
}
