// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.widget:
//			FitWindowsViewGroup

public class FitWindowsLinearLayout extends LinearLayout
	implements FitWindowsViewGroup
{

	public FitWindowsLinearLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void LinearLayout(Context)>
	//    3    5:return          
	}

	public FitWindowsLinearLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void LinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		FitWindowsViewGroup.OnFitSystemWindowsListener onfitsystemwindowslistener = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field FitWindowsViewGroup$OnFitSystemWindowsListener mListener>
	//    2    4:astore_2        
		if(onfitsystemwindowslistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			onfitsystemwindowslistener.onFitSystemWindows(rect);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #30  <Method void FitWindowsViewGroup$OnFitSystemWindowsListener.onFitSystemWindows(Rect)>
		return super.fitSystemWindows(rect);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #32  <Method boolean LinearLayout.fitSystemWindows(Rect)>
	//   11   21:ireturn         
	}

	public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener onfitsystemwindowslistener)
	{
		mListener = onfitsystemwindowslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field FitWindowsViewGroup$OnFitSystemWindowsListener mListener>
	//    3    5:return          
	}

	private FitWindowsViewGroup.OnFitSystemWindowsListener mListener;
}
