// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;

public interface CompanionAdSlot
{
	public static interface ClickListener
	{

		public abstract void onCompanionAdClick();
	}


	public abstract void addClickListener(ClickListener clicklistener);

	public abstract ViewGroup getContainer();

	public abstract int getHeight();

	public abstract int getWidth();

	public abstract boolean isFilled();

	public abstract void removeClickListener(ClickListener clicklistener);

	public abstract void setContainer(ViewGroup viewgroup);

	public abstract void setSize(int i, int j);
}
