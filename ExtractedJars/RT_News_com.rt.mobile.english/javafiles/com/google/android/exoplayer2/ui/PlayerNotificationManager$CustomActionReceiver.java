// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.Player;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

public static interface PlayerNotificationManager$CustomActionReceiver
{

	public abstract Map createCustomActions(Context context);

	public abstract List getCustomActions(Player player);

	public abstract void onCustomAction(Player player, String s, Intent intent);
}
