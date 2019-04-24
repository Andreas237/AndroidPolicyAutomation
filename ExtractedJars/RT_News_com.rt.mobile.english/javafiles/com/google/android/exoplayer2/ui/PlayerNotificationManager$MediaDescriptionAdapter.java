// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.google.android.exoplayer2.Player;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

public static interface PlayerNotificationManager$MediaDescriptionAdapter
{

	public abstract PendingIntent createCurrentContentIntent(Player player);

	public abstract String getCurrentContentText(Player player);

	public abstract String getCurrentContentTitle(Player player);

	public abstract Bitmap getCurrentLargeIcon(Player player, PlayerNotificationManager.BitmapCallback bitmapcallback);
}
