// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$c
	implements Runnable
{

	public void run()
	{
		if(c.mViewDragHelper != null && c.mViewDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BottomSheetBehavior c>
	//*   2    4:getfield        #31  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field BottomSheetBehavior c>
	//*   6   14:getfield        #31  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #37  <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   9   21:ifeq            33
		{
			ViewCompat.postOnAnimation(e, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field View e>
	//   12   28:aload_0         
	//   13   29:invokestatic    #43  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   14   32:return          
		} else
		{
			c.setStateInternal(d);
	//   15   33:aload_0         
	//   16   34:getfield        #18  <Field BottomSheetBehavior c>
	//   17   37:aload_0         
	//   18   38:getfield        #25  <Field int d>
	//   19   41:invokevirtual   #47  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   20   44:return          
		}
	}

	final BottomSheetBehavior c;
	private final int d;
	private final View e;

	BottomSheetBehavior$c(BottomSheetBehavior bottomsheetbehavior, View view, int i)
	{
		c = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BottomSheetBehavior c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		e = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field View e>
		d = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int d>
	//   11   19:return          
	}
}
