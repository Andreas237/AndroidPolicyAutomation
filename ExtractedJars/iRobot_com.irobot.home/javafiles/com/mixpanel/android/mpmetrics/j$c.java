// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j, InAppNotification

public static interface j$c
{

	public abstract String a();

	public abstract void a(Activity activity);

	public abstract void a(String s);

	public abstract void a(String s, double d1);

	public abstract void a(String s, InAppNotification inappnotification, JSONObject jsonobject);

	public abstract void a(String s, Object obj);

	public abstract void a(String s, JSONObject jsonobject);

	public abstract void a(JSONObject jsonobject);

	public abstract void b();

	public abstract void b(String s);

	public abstract void b(String s, Object obj);

	public abstract void b(JSONObject jsonobject);

	public abstract void c();

	public abstract void c(String s);

	public abstract j$c d(String s);
}
