// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmInitData, DrmSession

public interface DrmSessionManager
{

	public abstract DrmSession acquireSession(Looper looper, DrmInitData drminitdata);

	public abstract boolean canAcquireSession(DrmInitData drminitdata);

	public abstract void releaseSession(DrmSession drmsession);
}
