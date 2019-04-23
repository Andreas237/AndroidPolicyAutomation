// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout

public static interface ActionBarOverlayLayout$ActionBarVisibilityCallback
{

	public abstract void enableContentAnimations(boolean flag);

	public abstract void hideForSystem();

	public abstract void onContentScrollStarted();

	public abstract void onContentScrollStopped();

	public abstract void onWindowVisibilityChanged(int i);

	public abstract void showForSystem();
}
