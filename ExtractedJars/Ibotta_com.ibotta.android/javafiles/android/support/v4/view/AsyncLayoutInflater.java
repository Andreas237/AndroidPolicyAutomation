// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

public final class AsyncLayoutInflater
{
	public static interface OnInflateFinishedListener
	{

		public abstract void onInflateFinished(View view, int i, ViewGroup viewgroup);
	}

}
