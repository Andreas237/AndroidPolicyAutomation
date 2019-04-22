// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.internal.view;

import android.content.res.ColorStateList;
import android.support.v4.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

public interface SupportMenuItem
	extends MenuItem
{

	public abstract boolean collapseActionView();

	public abstract boolean expandActionView();

	public abstract View getActionView();

	public abstract int getAlphabeticModifiers();

	public abstract CharSequence getContentDescription();

	public abstract ColorStateList getIconTintList();

	public abstract android.graphics.PorterDuff.Mode getIconTintMode();

	public abstract int getNumericModifiers();

	public abstract ActionProvider getSupportActionProvider();

	public abstract CharSequence getTooltipText();

	public abstract boolean isActionViewExpanded();

	public abstract MenuItem setActionView(int i);

	public abstract MenuItem setActionView(View view);

	public abstract MenuItem setAlphabeticShortcut(char c, int i);

	public abstract SupportMenuItem setContentDescription(CharSequence charsequence);

	public abstract MenuItem setIconTintList(ColorStateList colorstatelist);

	public abstract MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

	public abstract MenuItem setNumericShortcut(char c, int i);

	public abstract MenuItem setShortcut(char c, char c1, int i, int j);

	public abstract void setShowAsAction(int i);

	public abstract MenuItem setShowAsActionFlags(int i);

	public abstract SupportMenuItem setSupportActionProvider(ActionProvider actionprovider);

	public abstract SupportMenuItem setTooltipText(CharSequence charsequence);
}
