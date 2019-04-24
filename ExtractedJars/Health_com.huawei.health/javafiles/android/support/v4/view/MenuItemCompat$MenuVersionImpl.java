// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			MenuItemCompat

static interface MenuItemCompat$MenuVersionImpl
{

	public abstract CharSequence getContentDescription(MenuItem menuitem);

	public abstract CharSequence getTooltipText(MenuItem menuitem);

	public abstract void setContentDescription(MenuItem menuitem, CharSequence charsequence);

	public abstract void setTooltipText(MenuItem menuitem, CharSequence charsequence);
}
