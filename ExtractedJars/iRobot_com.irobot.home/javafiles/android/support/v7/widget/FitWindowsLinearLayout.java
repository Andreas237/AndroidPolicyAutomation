// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.widget:
//			ab

public class FitWindowsLinearLayout extends LinearLayout
	implements ab
{

	public FitWindowsLinearLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void LinearLayout(Context)>
	//    3    5:return          
	}

	public FitWindowsLinearLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void LinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ab$a a>
	//*   2    4:ifnull          17
			a.a(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field ab$a a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #25  <Method void ab$a.a(Rect)>
		return super.fitSystemWindows(rect);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #27  <Method boolean LinearLayout.fitSystemWindows(Rect)>
	//   10   22:ireturn         
	}

	public void setOnFitSystemWindowsListener(ab.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ab$a a>
	//    3    5:return          
	}

	private ab.a a;
}
