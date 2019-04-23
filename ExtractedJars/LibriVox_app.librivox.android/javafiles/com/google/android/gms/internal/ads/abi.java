// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe

public interface abi
	extends ExecutorService
{

	public abstract abe a(Runnable runnable);

	public abstract abe a(Callable callable);
}
