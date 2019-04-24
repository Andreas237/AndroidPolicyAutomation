// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//			ValueLoader

public interface ValueCache
{

	public abstract Object get(Context context, ValueLoader valueloader)
		throws Exception;

	public abstract void invalidate(Context context);
}
