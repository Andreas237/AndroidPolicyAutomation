// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ActionProvider;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, ListPopupWindow

class ActivityChooserView$2
	implements android.view.balLayoutListener
{

	public void onGlobalLayout()
	{
		if(isShowingPopup())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ActivityChooserView this$0>
	//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.isShowingPopup()>
	//*   3    7:ifeq            30
			if(!isShown())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field ActivityChooserView this$0>
	//*   6   14:invokevirtual   #26  <Method boolean ActivityChooserView.isShown()>
	//*   7   17:ifne            31
			{
				getListPopupWindow().dismiss();
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field ActivityChooserView this$0>
	//   10   24:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//   11   27:invokevirtual   #35  <Method void ListPopupWindow.dismiss()>
			} else
	//*  12   30:return          
			{
				getListPopupWindow().show();
	//   13   31:aload_0         
	//   14   32:getfield        #14  <Field ActivityChooserView this$0>
	//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//   16   38:invokevirtual   #38  <Method void ListPopupWindow.show()>
				if(mProvider != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #14  <Field ActivityChooserView this$0>
	//*  19   45:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
	//*  20   48:ifnull          30
				{
					mProvider.subUiVisibilityChanged(true);
	//   21   51:aload_0         
	//   22   52:getfield        #14  <Field ActivityChooserView this$0>
	//   23   55:getfield        #42  <Field ActionProvider ActivityChooserView.mProvider>
	//   24   58:iconst_1        
	//   25   59:invokevirtual   #48  <Method void ActionProvider.subUiVisibilityChanged(boolean)>
					return;
	//   26   62:return          
				}
			}
	}

	final ActivityChooserView this$0;

	ActivityChooserView$2()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
