// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;


// Referenced classes of package com.bumptech.glide.manager:
//			LifecycleListener

public interface ConnectivityMonitor
	extends LifecycleListener
{
	public static interface ConnectivityListener
	{

		public abstract void onConnectivityChanged(boolean flag);
	}

}
