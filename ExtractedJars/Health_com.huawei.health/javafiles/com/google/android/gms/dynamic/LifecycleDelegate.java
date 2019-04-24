// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;

public interface LifecycleDelegate
{

	public abstract void onCreate(Bundle bundle);

	public abstract View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle);

	public abstract void onDestroy();

	public abstract void onDestroyView();

	public abstract void onInflate(Activity activity, Bundle bundle, Bundle bundle1);

	public abstract void onLowMemory();

	public abstract void onPause();

	public abstract void onResume();

	public abstract void onSaveInstanceState(Bundle bundle);

	public abstract void onStart();

	public abstract void onStop();
}
