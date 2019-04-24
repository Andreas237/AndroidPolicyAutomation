// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.net.NetworkInfo;

// Referenced classes of package com.irobot.home.util:
//			WifiStateReceiver

public static interface WifiStateReceiver$a
{

	public abstract void a(android.net.State state, NetworkInfo networkinfo);

	public abstract void a(NetworkInfo networkinfo);
}
