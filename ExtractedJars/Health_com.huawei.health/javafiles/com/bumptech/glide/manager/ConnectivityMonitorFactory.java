// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;

// Referenced classes of package com.bumptech.glide.manager:
//			ConnectivityMonitor

public interface ConnectivityMonitorFactory
{

	public abstract ConnectivityMonitor build(Context context, ConnectivityMonitor.ConnectivityListener connectivitylistener);
}
