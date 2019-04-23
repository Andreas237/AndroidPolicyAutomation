// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.view.Surface;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecVideoTrackRenderer

public static interface MediaCodecVideoTrackRenderer$EventListener
	extends MediaCodecTrackRenderer.EventListener
{

	public abstract void onDrawnToSurface(Surface surface);

	public abstract void onDroppedFrames(int i, long l);

	public abstract void onVideoSizeChanged(int i, int j, int k, float f);
}
