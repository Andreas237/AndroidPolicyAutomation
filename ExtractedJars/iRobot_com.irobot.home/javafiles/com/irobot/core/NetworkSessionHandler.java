// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			AssetId, NetworkJsonCallback

public abstract class NetworkSessionHandler
{

	public NetworkSessionHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void endSession(HashMap hashmap);

	public abstract void readBinary(AssetId assetid, HashMap hashmap);

	public abstract void sendBinary(AssetId assetid, byte abyte0[], HashMap hashmap);

	public abstract void sendJSONWithCallback(AssetId assetid, String s, HashMap hashmap, NetworkJsonCallback networkjsoncallback);

	public abstract boolean sessionStarted(HashMap hashmap);

	public abstract void startSession(HashMap hashmap);
}
