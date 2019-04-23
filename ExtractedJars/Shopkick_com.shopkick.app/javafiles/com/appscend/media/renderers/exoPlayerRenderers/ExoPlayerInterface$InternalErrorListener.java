// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import java.io.IOException;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public static interface ExoPlayerInterface$InternalErrorListener
{

	public abstract void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

	public abstract void onAudioTrackUnderrun(int i, long l, long l1);

	public abstract void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);

	public abstract void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception);

	public abstract void onDecoderInitializationError(com.google.android.exoplayer.tionException tionexception);

	public abstract void onDrmSessionManagerError(Exception exception);

	public abstract void onLoadError(int i, IOException ioexception);

	public abstract void onRendererInitializationError(Exception exception);
}
