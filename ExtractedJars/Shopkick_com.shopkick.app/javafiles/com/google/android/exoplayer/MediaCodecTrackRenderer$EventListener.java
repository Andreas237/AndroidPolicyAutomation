// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer

public static interface MediaCodecTrackRenderer$EventListener
{

	public abstract void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception);

	public abstract void onDecoderInitializationError(izationException izationexception);

	public abstract void onDecoderInitialized(String s, long l, long l1);
}
