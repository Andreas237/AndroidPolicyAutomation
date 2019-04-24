// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//			k

static class k$c extends k$b
{

	public void a(PopupWindow popupwindow, int i)
	{
		popupwindow.setWindowLayoutType(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #20  <Method void PopupWindow.setWindowLayoutType(int)>
	//    3    5:return          
	}

	public void a(PopupWindow popupwindow, boolean flag)
	{
		popupwindow.setOverlapAnchor(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #25  <Method void PopupWindow.setOverlapAnchor(boolean)>
	//    3    5:return          
	}

	k$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void k$b()>
	//    2    4:return          
	}
}
