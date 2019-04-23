// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;


// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public static interface ExoPlayerInterface$Listener
{

	public abstract void onError(Exception exception);

	public abstract void onStateChanged(boolean flag, int i);

	public abstract void onVideoSizeChanged(int i, int j, int k, float f);
}
