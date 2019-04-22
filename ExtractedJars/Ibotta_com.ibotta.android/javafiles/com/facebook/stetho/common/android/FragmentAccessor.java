// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.content.res.Resources;
import android.view.View;

public interface FragmentAccessor
{

	public abstract Object getChildFragmentManager(Object obj);

	public abstract Object getFragmentManager(Object obj);

	public abstract int getId(Object obj);

	public abstract Resources getResources(Object obj);

	public abstract String getTag(Object obj);

	public abstract View getView(Object obj);

	public static final int NO_ID = 0;
}
