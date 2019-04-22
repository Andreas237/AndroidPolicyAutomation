// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import java.util.Map;

// Referenced classes of package com.firebase.client.realtime:
//			Connection

public static interface Connection$Delegate
{

	public abstract void onDataMessage(Map map);

	public abstract void onDisconnect(tReason treason);

	public abstract void onKill(String s);

	public abstract void onReady(long l, String s);
}
