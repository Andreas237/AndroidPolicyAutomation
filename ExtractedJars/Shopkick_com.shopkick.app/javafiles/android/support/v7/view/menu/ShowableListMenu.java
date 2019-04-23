// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.widget.ListView;

public interface ShowableListMenu
{

	public abstract void dismiss();

	public abstract ListView getListView();

	public abstract boolean isShowing();

	public abstract void show();
}
