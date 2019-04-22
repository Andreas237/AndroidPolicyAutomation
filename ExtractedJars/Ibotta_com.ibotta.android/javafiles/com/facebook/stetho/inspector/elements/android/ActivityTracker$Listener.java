// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ActivityTracker

public static interface ActivityTracker$Listener
{

	public abstract void onActivityAdded(Activity activity);

	public abstract void onActivityRemoved(Activity activity);
}
