// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;


// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder

public interface MenuPresenter$Callback
{

	public abstract void onCloseMenu(MenuBuilder menubuilder, boolean flag);

	public abstract boolean onOpenSubMenu(MenuBuilder menubuilder);
}
