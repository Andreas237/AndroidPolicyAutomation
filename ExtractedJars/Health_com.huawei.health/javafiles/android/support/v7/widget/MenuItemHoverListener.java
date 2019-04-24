// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

public interface MenuItemHoverListener
{

	public abstract void onItemHoverEnter(MenuBuilder menubuilder, MenuItem menuitem);

	public abstract void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem);
}
