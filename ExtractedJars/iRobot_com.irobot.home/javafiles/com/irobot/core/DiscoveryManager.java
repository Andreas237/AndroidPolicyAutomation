// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			DiscoveryCallback

public abstract class DiscoveryManager
{

	public DiscoveryManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void addDiscoveryListener(int i, DiscoveryCallback discoverycallback);

	public abstract int startDiscovery(HashMap hashmap);

	public abstract void stopDiscovery(int i);

	public abstract int unicastToAddress(String s, DiscoveryCallback discoverycallback);

	public static final int DISCOVERY_REQUEST_ERROR = -1;
}
