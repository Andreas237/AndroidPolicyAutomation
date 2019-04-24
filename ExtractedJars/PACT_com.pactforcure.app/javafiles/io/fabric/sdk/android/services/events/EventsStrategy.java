// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;


// Referenced classes of package io.fabric.sdk.android.services.events:
//			FileRollOverManager, EventsManager, FilesSender

public interface EventsStrategy
	extends FileRollOverManager, EventsManager
{

	public abstract FilesSender getFilesSender();
}
