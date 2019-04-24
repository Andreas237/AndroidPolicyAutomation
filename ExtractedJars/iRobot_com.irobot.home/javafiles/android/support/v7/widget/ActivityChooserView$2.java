// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.b;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, ListPopupWindow

class ActivityChooserView$2
	implements android.view.balLayoutListener
{

	public void onGlobalLayout()
	{
		if(a.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ActivityChooserView a>
	//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.c()>
	//*   3    7:ifeq            62
		{
			if(!a.isShown())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field ActivityChooserView a>
	//*   6   14:invokevirtual   #26  <Method boolean ActivityChooserView.isShown()>
	//*   7   17:ifne            31
			{
				a.getListPopupWindow().e();
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field ActivityChooserView a>
	//   10   24:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//   11   27:invokevirtual   #35  <Method void ListPopupWindow.e()>
				return;
	//   12   30:return          
			}
			a.getListPopupWindow().d();
	//   13   31:aload_0         
	//   14   32:getfield        #14  <Field ActivityChooserView a>
	//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//   16   38:invokevirtual   #38  <Method void ListPopupWindow.d()>
			if(a.d != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #14  <Field ActivityChooserView a>
	//*  19   45:getfield        #41  <Field b ActivityChooserView.d>
	//*  20   48:ifnull          62
				a.d.a(true);
	//   21   51:aload_0         
	//   22   52:getfield        #14  <Field ActivityChooserView a>
	//   23   55:getfield        #41  <Field b ActivityChooserView.d>
	//   24   58:iconst_1        
	//   25   59:invokevirtual   #46  <Method void b.a(boolean)>
		}
	//   26   62:return          
	}

	final ActivityChooserView a;

	ActivityChooserView$2(ActivityChooserView activitychooserview)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
