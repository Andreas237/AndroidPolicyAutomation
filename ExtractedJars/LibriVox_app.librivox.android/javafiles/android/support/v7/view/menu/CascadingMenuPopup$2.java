// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.view.menu:
//			CascadingMenuPopup

class CascadingMenuPopup$2
	implements android.view.ngeListener
{

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(mTreeObserver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field CascadingMenuPopup this$0>
	//*   2    4:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
	//*   3    7:ifnull          51
		{
			if(!mTreeObserver.isAlive())
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field CascadingMenuPopup this$0>
	//*   6   14:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
	//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
	//*   8   20:ifne            34
				mTreeObserver = view.getViewTreeObserver();
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field CascadingMenuPopup this$0>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   13   31:putfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
			mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   14   34:aload_0         
	//   15   35:getfield        #12  <Field CascadingMenuPopup this$0>
	//   16   38:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
	//   17   41:aload_0         
	//   18   42:getfield        #12  <Field CascadingMenuPopup this$0>
	//   19   45:getfield        #41  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener CascadingMenuPopup.mGlobalLayoutListener>
	//   20   48:invokevirtual   #45  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		view.removeOnAttachStateChangeListener(((android.view.ngeListener) (this)));
	//   21   51:aload_1         
	//   22   52:aload_0         
	//   23   53:invokevirtual   #49  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//   24   56:return          
	}

	final CascadingMenuPopup this$0;

	CascadingMenuPopup$2()
	{
		this$0 = CascadingMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
