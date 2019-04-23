// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecUtil

private static interface MediaCodecUtil$MediaCodecListCompat
{

	public abstract int getCodecCount();

	public abstract MediaCodecInfo getCodecInfoAt(int i);

	public abstract boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities);

	public abstract boolean secureDecodersExplicit();
}
