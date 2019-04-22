// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.common.providers:
//			PooledExecutorsProvider

public static interface PooledExecutorsProvider$PooledExecutorFactory
{

	public abstract ScheduledExecutorService newSingleThreadScheduledExecutor();
}
