// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			ListPopupWindowCompat, ListPopupWindowCompatKitKat

static class ListPopupWindowCompat$KitKatListPopupWindowImpl extends ListPopupWindowCompat.BaseListPopupWindowImpl
{

	public android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
	{
		return ListPopupWindowCompatKitKat.createDragToOpenListener(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #18  <Method android.view.View$OnTouchListener ListPopupWindowCompatKitKat.createDragToOpenListener(Object, View)>
	//    3    5:areturn         
	}

	ListPopupWindowCompat$KitKatListPopupWindowImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ListPopupWindowCompat$BaseListPopupWindowImpl()>
	//    2    4:return          
	}
}
