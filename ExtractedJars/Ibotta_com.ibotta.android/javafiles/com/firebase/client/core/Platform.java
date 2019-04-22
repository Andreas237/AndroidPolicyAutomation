// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.core.persistence.PersistenceManager;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			Context

public interface Platform
{

	public abstract PersistenceManager createPersistenceManager(Context context, String s);

	public abstract String getPlatformVersion();

	public abstract String getUserAgent(Context context);

	public abstract CredentialStore newCredentialStore(Context context);

	public abstract EventTarget newEventTarget(Context context);

	public abstract Logger newLogger(Context context, com.firebase.client.Logger.Level level, List list);

	public abstract RunLoop newRunLoop(Context context);

	public abstract void runBackgroundTask(Context context, Runnable runnable);
}
