// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import java.util.Map;

// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

public static interface WebsocketConnection$Delegate
{

	public abstract void onDisconnect(boolean flag);

	public abstract void onMessage(Map map);
}
