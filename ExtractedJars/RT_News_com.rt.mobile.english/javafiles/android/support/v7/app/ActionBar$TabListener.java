// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.app.FragmentTransaction;

// Referenced classes of package android.support.v7.app:
//			ActionBar

public static interface ActionBar$TabListener
{

	public abstract void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction);

	public abstract void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction);

	public abstract void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmenttransaction);
}
