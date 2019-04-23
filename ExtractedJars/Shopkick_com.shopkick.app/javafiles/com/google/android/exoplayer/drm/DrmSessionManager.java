// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;


// Referenced classes of package com.google.android.exoplayer.drm:
//			ExoMediaCrypto, DrmInitData

public interface DrmSessionManager
{

	public abstract void close();

	public abstract Exception getError();

	public abstract ExoMediaCrypto getMediaCrypto();

	public abstract int getState();

	public abstract void open(DrmInitData drminitdata);

	public abstract boolean requiresSecureDecoderComponent(String s);

	public static final int STATE_CLOSED = 1;
	public static final int STATE_ERROR = 0;
	public static final int STATE_OPENED = 3;
	public static final int STATE_OPENED_WITH_KEYS = 4;
	public static final int STATE_OPENING = 2;
}
