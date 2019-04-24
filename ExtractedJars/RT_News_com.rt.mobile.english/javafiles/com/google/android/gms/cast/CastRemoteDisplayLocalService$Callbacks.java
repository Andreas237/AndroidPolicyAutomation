// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplayLocalService

public static interface CastRemoteDisplayLocalService$Callbacks
{

	public abstract void onRemoteDisplaySessionEnded(CastRemoteDisplayLocalService castremotedisplaylocalservice);

	public abstract void onRemoteDisplaySessionError(Status status);

	public abstract void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService castremotedisplaylocalservice);

	public abstract void onServiceCreated(CastRemoteDisplayLocalService castremotedisplaylocalservice);
}
