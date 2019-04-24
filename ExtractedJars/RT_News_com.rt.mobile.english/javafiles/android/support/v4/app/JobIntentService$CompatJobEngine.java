// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

static interface JobIntentService$CompatJobEngine
{

	public abstract IBinder compatGetBinder();

	public abstract JobIntentService$GenericWorkItem dequeueWork();
}
