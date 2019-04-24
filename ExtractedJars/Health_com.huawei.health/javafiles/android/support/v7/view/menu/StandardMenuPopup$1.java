// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.MenuPopupWindow;
import android.view.View;

// Referenced classes of package android.support.v7.view.menu:
//			StandardMenuPopup

class StandardMenuPopup$1
	implements android.view.lobalLayoutListener
{

	public void onGlobalLayout()
	{
		if(isShowing() && !mPopup.isModal())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
	//*   2    4:invokevirtual   #23  <Method boolean StandardMenuPopup.isShowing()>
	//*   3    7:ifeq            60
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
	//*   6   14:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
	//*   7   17:invokevirtual   #32  <Method boolean MenuPopupWindow.isModal()>
	//*   8   20:ifne            60
		{
			View view = mShownAnchorView;
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
	//   11   27:getfield        #36  <Field View StandardMenuPopup.mShownAnchorView>
	//   12   30:astore_1        
			if(view == null || !view.isShown())
	//*  13   31:aload_1         
	//*  14   32:ifnull          42
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #41  <Method boolean View.isShown()>
	//*  17   39:ifne            50
			{
				dismiss();
	//   18   42:aload_0         
	//   19   43:getfield        #14  <Field StandardMenuPopup this$0>
	//   20   46:invokevirtual   #44  <Method void StandardMenuPopup.dismiss()>
				return;
	//   21   49:return          
			}
			mPopup.show();
	//   22   50:aload_0         
	//   23   51:getfield        #14  <Field StandardMenuPopup this$0>
	//   24   54:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
	//   25   57:invokevirtual   #47  <Method void MenuPopupWindow.show()>
		}
	//   26   60:return          
	}

	final StandardMenuPopup this$0;

	StandardMenuPopup$1()
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
