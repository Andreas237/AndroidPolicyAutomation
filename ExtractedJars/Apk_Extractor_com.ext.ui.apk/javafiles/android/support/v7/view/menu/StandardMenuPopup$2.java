// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.view.menu:
//			StandardMenuPopup

class StandardMenuPopup$2
	implements android.view.angeListener
{

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(StandardMenuPopup.access$000(StandardMenuPopup.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
	//*   2    4:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
	//*   3    7:ifnull          52
		{
			if(!StandardMenuPopup.access$000(StandardMenuPopup.this).isAlive())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
	//*   6   14:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
	//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
	//*   8   20:ifne            35
				StandardMenuPopup.access$002(StandardMenuPopup.this, view.getViewTreeObserver());
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   13   31:invokestatic    #41  <Method ViewTreeObserver StandardMenuPopup.access$002(StandardMenuPopup, ViewTreeObserver)>
	//   14   34:pop             
			StandardMenuPopup.access$000(StandardMenuPopup.this).removeGlobalOnLayoutListener(StandardMenuPopup.access$100(StandardMenuPopup.this));
	//   15   35:aload_0         
	//   16   36:getfield        #14  <Field StandardMenuPopup this$0>
	//   17   39:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
	//   18   42:aload_0         
	//   19   43:getfield        #14  <Field StandardMenuPopup this$0>
	//   20   46:invokestatic    #45  <Method android.view.ViewTreeObserver$OnGlobalLayoutListener StandardMenuPopup.access$100(StandardMenuPopup)>
	//   21   49:invokevirtual   #49  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		view.removeOnAttachStateChangeListener(((android.view.angeListener) (this)));
	//   22   52:aload_1         
	//   23   53:aload_0         
	//   24   54:invokevirtual   #53  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//   25   57:return          
	}

	final StandardMenuPopup this$0;

	StandardMenuPopup$2()
	{
		this$0 = StandardMenuPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field StandardMenuPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
