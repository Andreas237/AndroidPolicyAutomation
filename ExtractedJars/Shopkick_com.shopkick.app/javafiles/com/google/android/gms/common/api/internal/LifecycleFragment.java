// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			LifecycleCallback

public interface LifecycleFragment
{

	public abstract void addCallback(String s, LifecycleCallback lifecyclecallback);

	public abstract LifecycleCallback getCallbackOrNull(String s, Class class1);

	public abstract Activity getLifecycleActivity();

	public abstract boolean isCreated();

	public abstract boolean isStarted();

	public abstract void startActivityForResult(Intent intent, int i);
}
