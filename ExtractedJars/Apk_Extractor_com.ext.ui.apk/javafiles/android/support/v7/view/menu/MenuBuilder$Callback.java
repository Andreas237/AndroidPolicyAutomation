// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder

public static interface MenuBuilder$Callback
{

	public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem);

	public abstract void onMenuModeChange(MenuBuilder menubuilder);
}
