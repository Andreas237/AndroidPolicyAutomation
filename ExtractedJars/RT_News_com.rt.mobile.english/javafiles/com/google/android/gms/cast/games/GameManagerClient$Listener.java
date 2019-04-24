// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.games;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//			GameManagerClient, GameManagerState

public static interface GameManagerClient$Listener
{

	public abstract void onGameMessageReceived(String s, JSONObject jsonobject);

	public abstract void onStateChanged(GameManagerState gamemanagerstate, GameManagerState gamemanagerstate1);
}
