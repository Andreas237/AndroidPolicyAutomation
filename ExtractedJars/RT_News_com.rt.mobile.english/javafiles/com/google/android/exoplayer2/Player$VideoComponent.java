// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.view.*;
import com.google.android.exoplayer2.video.VideoListener;

// Referenced classes of package com.google.android.exoplayer2:
//			Player

public static interface Player$VideoComponent
{

	public abstract void addVideoListener(VideoListener videolistener);

	public abstract void clearVideoSurface();

	public abstract void clearVideoSurface(Surface surface);

	public abstract void clearVideoSurfaceHolder(SurfaceHolder surfaceholder);

	public abstract void clearVideoSurfaceView(SurfaceView surfaceview);

	public abstract void clearVideoTextureView(TextureView textureview);

	public abstract int getVideoScalingMode();

	public abstract void removeVideoListener(VideoListener videolistener);

	public abstract void setVideoScalingMode(int i);

	public abstract void setVideoSurface(Surface surface);

	public abstract void setVideoSurfaceHolder(SurfaceHolder surfaceholder);

	public abstract void setVideoSurfaceView(SurfaceView surfaceview);

	public abstract void setVideoTextureView(TextureView textureview);
}
