// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.widget.ListView;

// Referenced classes of package android.support.v7.view.menu:
//			CascadingMenuPopup, MenuBuilder

static class CascadingMenuPopup$CascadingMenuInfo
{

	public ListView getListView()
	{
		return window.getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuPopupWindow window>
	//    2    4:invokevirtual   #33  <Method ListView MenuPopupWindow.getListView()>
	//    3    7:areturn         
	}

	public final MenuBuilder menu;
	public final int position;
	public final MenuPopupWindow window;

	public CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow menupopupwindow, MenuBuilder menubuilder, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		window = menupopupwindow;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field MenuPopupWindow window>
		menu = menubuilder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field MenuBuilder menu>
		position = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int position>
	//   11   19:return          
	}
}
