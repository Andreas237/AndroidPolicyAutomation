// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.internal.view;

import android.view.Menu;

public interface SupportMenu
	extends Menu
{

	public abstract void setGroupDividerEnabled(boolean flag);

	public static final int CATEGORY_MASK = 0xffff0000;
	public static final int CATEGORY_SHIFT = 16;
	public static final int FLAG_KEEP_OPEN_ON_SUBMENU_OPENED = 4;
	public static final int SUPPORTED_MODIFIERS_MASK = 0x1100f;
	public static final int USER_MASK = 65535;
	public static final int USER_SHIFT = 0;
}
