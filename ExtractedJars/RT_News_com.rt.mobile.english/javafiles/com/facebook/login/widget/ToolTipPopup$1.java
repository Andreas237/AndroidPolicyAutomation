// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.login.widget:
//			ToolTipPopup

class ToolTipPopup$1
	implements android.view.r.OnScrollChangedListener
{

	public void onScrollChanged()
	{
		if(ToolTipPopup.access$000(ToolTipPopup.this).get() != null && ToolTipPopup.access$100(ToolTipPopup.this) != null && ToolTipPopup.access$100(ToolTipPopup.this).isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ToolTipPopup this$0>
	//*   2    4:invokestatic    #23  <Method WeakReference ToolTipPopup.access$000(ToolTipPopup)>
	//*   3    7:invokevirtual   #29  <Method Object WeakReference.get()>
	//*   4   10:ifnull          70
	//*   5   13:aload_0         
	//*   6   14:getfield        #14  <Field ToolTipPopup this$0>
	//*   7   17:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
	//*   8   20:ifnull          70
	//*   9   23:aload_0         
	//*  10   24:getfield        #14  <Field ToolTipPopup this$0>
	//*  11   27:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
	//*  12   30:invokevirtual   #39  <Method boolean PopupWindow.isShowing()>
	//*  13   33:ifeq            70
		{
			if(ToolTipPopup.access$100(ToolTipPopup.this).isAboveAnchor())
	//*  14   36:aload_0         
	//*  15   37:getfield        #14  <Field ToolTipPopup this$0>
	//*  16   40:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
	//*  17   43:invokevirtual   #42  <Method boolean PopupWindow.isAboveAnchor()>
	//*  18   46:ifeq            60
			{
				ToolTipPopup.access$200(ToolTipPopup.this).showBottomArrow();
	//   19   49:aload_0         
	//   20   50:getfield        #14  <Field ToolTipPopup this$0>
	//   21   53:invokestatic    #46  <Method ToolTipPopup$PopupContentView ToolTipPopup.access$200(ToolTipPopup)>
	//   22   56:invokevirtual   #51  <Method void ToolTipPopup$PopupContentView.showBottomArrow()>
				return;
	//   23   59:return          
			}
			ToolTipPopup.access$200(ToolTipPopup.this).showTopArrow();
	//   24   60:aload_0         
	//   25   61:getfield        #14  <Field ToolTipPopup this$0>
	//   26   64:invokestatic    #46  <Method ToolTipPopup$PopupContentView ToolTipPopup.access$200(ToolTipPopup)>
	//   27   67:invokevirtual   #54  <Method void ToolTipPopup$PopupContentView.showTopArrow()>
		}
	//   28   70:return          
	}

	final ToolTipPopup this$0;

	ToolTipPopup$1()
	{
		this$0 = ToolTipPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ToolTipPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
