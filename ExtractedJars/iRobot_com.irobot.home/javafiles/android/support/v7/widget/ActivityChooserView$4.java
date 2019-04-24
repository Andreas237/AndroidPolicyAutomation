// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.s;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ac, ActivityChooserView

class ActivityChooserView$4 extends ac
{

	public s a()
	{
		return ((s) (a.getListPopupWindow()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActivityChooserView a>
	//    2    4:invokevirtual   #23  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//    3    7:areturn         
	}

	protected boolean b()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActivityChooserView a>
	//    2    4:invokevirtual   #27  <Method boolean ActivityChooserView.a()>
	//    3    7:pop             
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	protected boolean c()
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActivityChooserView a>
	//    2    4:invokevirtual   #30  <Method boolean ActivityChooserView.b()>
	//    3    7:pop             
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	final ActivityChooserView a;

	ActivityChooserView$4(ActivityChooserView activitychooserview, View view)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserView a>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void ac(View)>
	//    6   10:return          
	}
}
