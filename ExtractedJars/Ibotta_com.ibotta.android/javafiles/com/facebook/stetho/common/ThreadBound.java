// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;


// Referenced classes of package com.facebook.stetho.common:
//			UncheckedCallable

public interface ThreadBound
{

	public abstract boolean checkThreadAccess();

	public abstract Object postAndWait(UncheckedCallable uncheckedcallable);

	public abstract void postAndWait(Runnable runnable);

	public abstract void postDelayed(Runnable runnable, long l);

	public abstract void removeCallbacks(Runnable runnable);

	public abstract void verifyThreadAccess();
}
