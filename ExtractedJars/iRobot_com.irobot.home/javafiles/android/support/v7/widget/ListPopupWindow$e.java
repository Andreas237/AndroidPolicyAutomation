// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.s;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, z

private class ListPopupWindow$e
	implements Runnable
{

	public void run()
	{
		if(a.c != null && s.A(((android.view.View) (a.c))) && a.c.getCount() > a.c.getChildCount() && a.c.getChildCount() <= a.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ListPopupWindow a>
	//*   2    4:getfield        #24  <Field z ListPopupWindow.c>
	//*   3    7:ifnull          84
	//*   4   10:aload_0         
	//*   5   11:getfield        #15  <Field ListPopupWindow a>
	//*   6   14:getfield        #24  <Field z ListPopupWindow.c>
	//*   7   17:invokestatic    #30  <Method boolean s.A(android.view.View)>
	//*   8   20:ifeq            84
	//*   9   23:aload_0         
	//*  10   24:getfield        #15  <Field ListPopupWindow a>
	//*  11   27:getfield        #24  <Field z ListPopupWindow.c>
	//*  12   30:invokevirtual   #36  <Method int z.getCount()>
	//*  13   33:aload_0         
	//*  14   34:getfield        #15  <Field ListPopupWindow a>
	//*  15   37:getfield        #24  <Field z ListPopupWindow.c>
	//*  16   40:invokevirtual   #39  <Method int z.getChildCount()>
	//*  17   43:icmple          84
	//*  18   46:aload_0         
	//*  19   47:getfield        #15  <Field ListPopupWindow a>
	//*  20   50:getfield        #24  <Field z ListPopupWindow.c>
	//*  21   53:invokevirtual   #39  <Method int z.getChildCount()>
	//*  22   56:aload_0         
	//*  23   57:getfield        #15  <Field ListPopupWindow a>
	//*  24   60:getfield        #43  <Field int ListPopupWindow.d>
	//*  25   63:icmpgt          84
		{
			a.g.setInputMethodMode(2);
	//   26   66:aload_0         
	//   27   67:getfield        #15  <Field ListPopupWindow a>
	//   28   70:getfield        #47  <Field PopupWindow ListPopupWindow.g>
	//   29   73:iconst_2        
	//   30   74:invokevirtual   #53  <Method void PopupWindow.setInputMethodMode(int)>
			a.d();
	//   31   77:aload_0         
	//   32   78:getfield        #15  <Field ListPopupWindow a>
	//   33   81:invokevirtual   #55  <Method void ListPopupWindow.d()>
		}
	//   34   84:return          
	}

	final ListPopupWindow a;

	ListPopupWindow$e(ListPopupWindow listpopupwindow)
	{
		a = listpopupwindow;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ListPopupWindow a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
