// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlaybackException, Format

public interface RendererCapabilities
{

	public abstract int getTrackType();

	public abstract int supportsFormat(Format format)
		throws ExoPlaybackException;

	public abstract int supportsMixedMimeTypeAdaptation()
		throws ExoPlaybackException;

	public static final int ADAPTIVE_NOT_SEAMLESS = 8;
	public static final int ADAPTIVE_NOT_SUPPORTED = 0;
	public static final int ADAPTIVE_SEAMLESS = 16;
	public static final int ADAPTIVE_SUPPORT_MASK = 24;
	public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
	public static final int FORMAT_HANDLED = 4;
	public static final int FORMAT_SUPPORT_MASK = 7;
	public static final int FORMAT_UNSUPPORTED_DRM = 2;
	public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
	public static final int FORMAT_UNSUPPORTED_TYPE = 0;
	public static final int TUNNELING_NOT_SUPPORTED = 0;
	public static final int TUNNELING_SUPPORTED = 32;
	public static final int TUNNELING_SUPPORT_MASK = 32;
}
