// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import java.io.IOException;

public interface FileRollOverManager
{

	public abstract void cancelTimeBasedFileRollOver();

	public abstract boolean rollFileOver()
		throws IOException;

	public abstract void scheduleTimeBasedRollOverIfNeeded();
}
