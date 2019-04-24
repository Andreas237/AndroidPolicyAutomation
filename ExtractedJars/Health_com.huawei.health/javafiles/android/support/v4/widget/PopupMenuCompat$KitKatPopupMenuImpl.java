// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			PopupMenuCompat, PopupMenuCompatKitKat

static class PopupMenuCompat$KitKatPopupMenuImpl extends PopupMenuCompat.BasePopupMenuImpl
{

	public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
	{
		return PopupMenuCompatKitKat.getDragToOpenListener(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method android.view.View$OnTouchListener PopupMenuCompatKitKat.getDragToOpenListener(Object)>
	//    2    4:areturn         
	}

	PopupMenuCompat$KitKatPopupMenuImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PopupMenuCompat$BasePopupMenuImpl()>
	//    2    4:return          
	}
}
