// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			FitWindowsViewGroup

public class FitWindowsFrameLayout extends FrameLayout
	implements FitWindowsViewGroup
{

	public FitWindowsFrameLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
	//    3    5:return          
	}

	public FitWindowsFrameLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void FrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field FitWindowsViewGroup$OnFitSystemWindowsListener mListener>
	//*   2    4:ifnull          17
			mListener.onFitSystemWindows(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field FitWindowsViewGroup$OnFitSystemWindowsListener mListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #30  <Method void FitWindowsViewGroup$OnFitSystemWindowsListener.onFitSystemWindows(Rect)>
		return super.fitSystemWindows(rect);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #32  <Method boolean FrameLayout.fitSystemWindows(Rect)>
	//   10   22:ireturn         
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
