// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import java.lang.annotation.Annotation;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaCrypto

public interface DrmSession
{
	public static class DrmSessionException extends Exception
	{

		public DrmSessionException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(Throwable)>
		//    3    5:return          
		}
	}

	public static interface State
		extends Annotation
	{
	}


	public abstract DrmSessionException getError();

	public abstract ExoMediaCrypto getMediaCrypto();

	public abstract byte[] getOfflineLicenseKeySetId();

	public abstract int getState();

	public abstract Map queryKeyStatus();

	public static final int STATE_ERROR = 1;
	public static final int STATE_OPENED = 3;
	public static final int STATE_OPENED_WITH_KEYS = 4;
	public static final int STATE_OPENING = 2;
	public static final int STATE_RELEASED = 0;
}
