// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.games;

import com.google.android.gms.common.api.Result;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//			GameManagerClient

public static interface GameManagerClient$GameManagerResult
	extends Result
{

	public abstract JSONObject getExtraMessageData();

	public abstract String getPlayerId();

	public abstract long getRequestId();
}
