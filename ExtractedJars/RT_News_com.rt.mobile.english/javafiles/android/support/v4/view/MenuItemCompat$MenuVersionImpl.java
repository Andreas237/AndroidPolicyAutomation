// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			MenuItemCompat

static interface MenuItemCompat$MenuVersionImpl
{

	public abstract int getAlphabeticModifiers(MenuItem menuitem);

	public abstract CharSequence getContentDescription(MenuItem menuitem);

	public abstract ColorStateList getIconTintList(MenuItem menuitem);

	public abstract android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem);

	public abstract int getNumericModifiers(MenuItem menuitem);

	public abstract CharSequence getTooltipText(MenuItem menuitem);

	public abstract void setAlphabeticShortcut(MenuItem menuitem, char c, int i);

	public abstract void setContentDescription(MenuItem menuitem, CharSequence charsequence);

	public abstract void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist);

	public abstract void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode);

	public abstract void setNumericShortcut(MenuItem menuitem, char c, int i);

	public abstract void setShortcut(MenuItem menuitem, char c, char c1, int i, int j);

	public abstract void setTooltipText(MenuItem menuitem, CharSequence charsequence);
}
