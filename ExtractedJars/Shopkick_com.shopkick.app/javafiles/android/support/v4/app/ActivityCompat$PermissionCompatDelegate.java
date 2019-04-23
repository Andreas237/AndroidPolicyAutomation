// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package android.support.v4.app:
//			ActivityCompat

public static interface ActivityCompat$PermissionCompatDelegate
{

	public abstract boolean onActivityResult(Activity activity, int i, int j, Intent intent);

	public abstract boolean requestPermissions(Activity activity, String as[], int i);
}
