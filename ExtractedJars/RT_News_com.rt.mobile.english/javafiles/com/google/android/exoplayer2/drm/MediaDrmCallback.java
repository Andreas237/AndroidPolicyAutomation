// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import java.util.UUID;

public interface MediaDrmCallback
{

	public abstract byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyrequest, String s)
		throws Exception;

	public abstract byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionrequest)
		throws Exception;
}
